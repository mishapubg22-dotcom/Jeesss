package ru.manus.funrtp.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.entity.Player;
import ru.manus.funrtp.FunRTP;

public class CooldownManager {
   private static final Map<UUID, Long> cooldowns = new HashMap();

   public static boolean hasCooldown(Player var0) {
      return getTimeLeft(var0) > 0L;
   }

   public static long getTimeLeft(Player var0) {
      if (!cooldowns.containsKey(var0.getUniqueId())) {
         return 0L;
      } else {
         long var1 = (Long)cooldowns.get(var0.getUniqueId());
         long var3 = System.currentTimeMillis();
         return Math.max(0L, (var1 - var3) / 1000L);
      }
   }

   public static void setCooldown(Player var0) {
      int var1 = FunRTP.getInstance().getConfig().getInt("rtp.cooldown_seconds", 90);
      long var2 = System.currentTimeMillis() + (long)var1 * 1000L;
      cooldowns.put(var0.getUniqueId(), var2);
   }

   public static void removeCooldown(Player var0) {
      cooldowns.remove(var0.getUniqueId());
   }
}
