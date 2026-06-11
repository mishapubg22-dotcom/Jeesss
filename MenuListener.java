package ru.manus.funrtp.menu;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import ru.manus.funrtp.FunRTP;
import ru.manus.funrtp.hooks.FunEventsHook;
import ru.manus.funrtp.rtp.RTPType;
import ru.manus.funrtp.rtp.RTPUtil;
import ru.manus.funrtp.utils.ColorUtil;
import ru.manus.funrtp.utils.CooldownManager;
import ru.manus.funrtp.utils.EconomyUtil;

public class MenuListener implements Listener {
   @EventHandler
   public void onClick(InventoryClickEvent var1) {
      if (var1.getWhoClicked() instanceof Player) {
         Player var2 = (Player)var1.getWhoClicked();
         if (var1.getView().getTitle().equals(RTPMenu.getTitle())) {
            var1.setCancelled(true);
            if (!RTPMenu.isAnimating(var2)) {
               RTPType var3 = RTPMenu.getTypeBySlot(var1.getRawSlot());
               if (var3 == null) {
                  var2.playSound(var2.getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
               } else if (CooldownManager.hasCooldown(var2)) {
                  var2.closeInventory();
                  long var7 = CooldownManager.getTimeLeft(var2);
                  String var6 = FunRTP.getInstance().getConfig().getString("messages.cooldown", "&cПожалуйста, подождите {time} секунд перед следующим RTP!");
                  var2.sendMessage(ColorUtil.colorize(var6.replace("{time}", String.valueOf(var7))));
                  var2.playSound(var2.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
               } else if (var3 == RTPType.EVENT && !FunEventsHook.hasActiveEvent()) {
                  var2.closeInventory();
                  var2.sendMessage(ColorUtil.colorize(FunRTP.getInstance().getConfig().getString("messages.no_active_events", "&cСейчас нет активных ивентов!")));
                  var2.playSound(var2.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
               } else {
                  int var4 = var3.getPrice();
                  if (var4 > 0 && !EconomyUtil.hasEnough(var2, (double)var4)) {
                     var2.closeInventory();
                     var2.sendMessage(ColorUtil.colorize(FunRTP.getInstance().getConfig().getString("messages.not_enough_money", "&cДля покупки недостаточно средств!")));
                     var2.playSound(var2.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
                  } else {
                     var2.closeInventory();
                     RTPUtil.findSafeLocation(var2, var3).thenAccept((var2x) -> Bukkit.getScheduler().runTask(FunRTP.getInstance(), () -> {
                           if (var2x == null) {
                              var2.sendMessage(ColorUtil.colorize(FunRTP.getInstance().getConfig().getString("messages.safe_location_not_found", "&cНе удалось найти безопасное место!")));
                           } else {
                              if (var4 > 0) {
                                 EconomyUtil.withdraw(var2, (double)var4);
                              }

                              CooldownManager.setCooldown(var2);
                              var2.teleport(var2x);
                              RTPUtil.applyArrivalEffect(var2);
                              int var3 = var2x.getBlockX();
                              int var4x = var2x.getBlockY();
                              int var5 = var2x.getBlockZ();
                              String var6 = FunRTP.getInstance().getConfig().getString("messages.teleport_success_title", "&#FF9B00У&#FFA700с&#FFB200п&#FFAE00е&#FFAA00ш&#FFAA00н&#FFAA00о");
                              String var7 = FunRTP.getInstance().getConfig().getString("messages.teleport_success_subtitle", "&fX: {x} Y: {y} Z: {z}").replace("{x}", String.valueOf(var3)).replace("{y}", String.valueOf(var4x)).replace("{z}", String.valueOf(var5));
                              var2.sendTitle(ColorUtil.colorize(var6), ColorUtil.colorize(var7), 10, 70, 20);
                              var2.playSound(var2.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
                           }

                        }));
                  }
               }
            }
         }
      }
   }

   @EventHandler
   public void onClose(InventoryCloseEvent var1) {
      if (var1.getPlayer() instanceof Player) {
         Player var2 = (Player)var1.getPlayer();
         if (var1.getView().getTitle().equals(RTPMenu.getTitle())) {
            RTPMenu.removeAnimating(var2);
         }

      }
   }
}
