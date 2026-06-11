package ru.manus.funrtp.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.manus.funrtp.FunRTP;
import ru.manus.funrtp.menu.RTPMenu;
import ru.manus.funrtp.utils.ColorUtil;
import ru.manus.funrtp.utils.CooldownManager;

public class RTPCommand implements CommandExecutor {
   public boolean onCommand(CommandSender var1, Command var2, String var3, String[] var4) {
      if (!(var1 instanceof Player var5)) {
         var1.sendMessage(FunRTP.getInstance().getConfig().getString("messages.only_players", "Только для игроков!"));
         return true;
      } else if (CooldownManager.hasCooldown(var5)) {
         long var6 = CooldownManager.getTimeLeft(var5);
         String var8 = FunRTP.getInstance().getConfig().getString("messages.cooldown", "&cПожалуйста, подождите {time} секунд перед следующим RTP!");
         var5.sendMessage(ColorUtil.colorize(var8.replace("{time}", String.valueOf(var6))));
         var5.playSound(var5.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
         return true;
      } else {
         RTPMenu.open(var5);
         return true;
      }
   }
}
