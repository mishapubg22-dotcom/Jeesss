package ru.manus.funrtp.commands;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import ru.manus.funrtp.FunRTP;
import ru.manus.funrtp.rtp.RTPType;
import ru.manus.funrtp.rtp.RTPUtil;
import ru.manus.funrtp.utils.ColorUtil;

public class AdminRTPCommand implements CommandExecutor, TabCompleter {
   public boolean onCommand(CommandSender var1, Command var2, String var3, String[] var4) {
      if (!var1.hasPermission("funrtp.admin")) {
         var1.sendMessage(ColorUtil.colorize(FunRTP.getInstance().getConfig().getString("messages.no_permission", "&cНедостаточно прав!")));
         return true;
      } else if (var4.length >= 2 && var4[0].equalsIgnoreCase("teleport")) {
         Player var5 = Bukkit.getPlayer(var4[1]);
         if (var5 == null) {
            var1.sendMessage(ColorUtil.colorize(FunRTP.getInstance().getConfig().getString("messages.player_not_found", "&cИгрок не найден!")));
            return true;
         } else {
            RTPUtil.findSafeLocation(var5, RTPType.SMALL).thenAccept((var2x) -> Bukkit.getScheduler().runTask(FunRTP.getInstance(), () -> {
                  if (var2x == null) {
                     var1.sendMessage(ColorUtil.colorize(FunRTP.getInstance().getConfig().getString("messages.safe_location_not_found", "&cНе удалось найти безопасное место!")));
                  } else {
                     var5.teleport(var2x);
                     RTPUtil.applyArrivalEffect(var5);
                     int var3 = var2x.getBlockX();
                     int var4 = var2x.getBlockY();
                     int var5x = var2x.getBlockZ();
                     String var6 = FunRTP.getInstance().getConfig().getString("messages.teleport_success_title", "&#FF9B00У&#FFA700с&#FFB200п&#FFAE00е&#FFAA00ш&#FFAA00н&#FFAA00о");
                     String var7 = FunRTP.getInstance().getConfig().getString("messages.teleport_success_subtitle", "&fX: {x} Y: {y} Z: {z}").replace("{x}", String.valueOf(var3)).replace("{y}", String.valueOf(var4)).replace("{z}", String.valueOf(var5x));
                     var5.sendTitle(ColorUtil.colorize(var6), ColorUtil.colorize(var7), 10, 70, 20);
                     var5.playSound(var5.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
                     String var8 = FunRTP.getInstance().getConfig().getString("messages.admin_teleport_success", "&aИгрок {player} успешно телепортирован!").replace("{player}", var5.getName());
                     var1.sendMessage(ColorUtil.colorize(var8));
                  }

               }));
            return true;
         }
      } else {
         var1.sendMessage(ColorUtil.colorize("&cИспользование: /funrtp teleport <игрок>"));
         return true;
      }
   }

   public List<String> onTabComplete(CommandSender var1, Command var2, String var3, String[] var4) {
      ArrayList var5 = new ArrayList();
      if (var4.length == 1) {
         if ("teleport".startsWith(var4[0].toLowerCase())) {
            var5.add("teleport");
         }
      } else if (var4.length == 2 && var4[0].equalsIgnoreCase("teleport")) {
         for(Player var7 : Bukkit.getOnlinePlayers()) {
            if (var7.getName().toLowerCase().startsWith(var4[1].toLowerCase())) {
               var5.add(var7.getName());
            }
         }
      }

      return var5;
   }
}
