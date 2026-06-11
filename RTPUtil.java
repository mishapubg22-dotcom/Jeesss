package ru.manus.funrtp.rtp;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import ru.manus.funrtp.hooks.FunEventsHook;

public class RTPUtil {
   private static final double SURFACE_FLIGHT_HEIGHT = (double)17.0F;
   private static final int ARRIVAL_EFFECT_DURATION_TICKS = 200;
   private static final Random random = new Random();

   public static CompletableFuture<Location> findSafeLocation(Player var0, RTPType var1) {
      return CompletableFuture.supplyAsync(() -> {
         int var2;
         int var3;
         int var4;
         int var5;
         World var6;
         if (var1 == RTPType.EVENT) {
            Location var7 = FunEventsHook.getActiveEventLocation();
            if (var7 == null) {
               return null;
            }

            var6 = var7.getWorld();
            var5 = var7.getBlockX();
            var4 = var7.getBlockZ();
            var3 = var1.getMinRadius();
            var2 = var1.getMaxRadius();
         } else {
            var6 = getWorld(var1, var0.getWorld());
            var5 = 0;
            var4 = 0;
            var3 = var1.getMinRadius();
            var2 = var1.getMaxRadius();
         }

         if (var6 == null) {
            return null;
         } else {
            for(int var11 = 0; var11 < 50; ++var11) {
               int var9 = var5 + randomInRange(var3, var2);
               Location var10 = findSafeY(var6, var9, var4 + randomInRange(var3, var2), var1);
               if (var10 != null) {
                  return var10;
               }
            }

            return null;
         }
      });
   }

   private static World getWorld(RTPType var0, World var1) {
      if (var0 == RTPType.NETHER) {
         World var3 = Bukkit.getWorld("world_nether");
         return var3 != null ? var3 : var1;
      } else {
         World var2 = Bukkit.getWorld("world");
         return var2 != null ? var2 : var1;
      }
   }

   private static Location findSafeY(World var0, int var1, int var2, RTPType var3) {
      if (var0.getEnvironment() == Environment.NETHER) {
         for(int var4 = 32; var4 < 110; ++var4) {
            if (isSafeLocation(var0, var1, var4, var2)) {
               return new Location(var0, (double)var1 + (double)0.5F, (double)var4, (double)var2 + (double)0.5F);
            }
         }
      } else {
         int var7 = var0.getHighestBlockYAt(var1, var2);
         if (var7 <= 0) {
            return null;
         }

         Block var5 = var0.getBlockAt(var1, var7, var2);
         Material var6 = var5.getType();
         if (var6 == Material.WATER || var6 == Material.LAVA || var6 == Material.CACTUS) {
            return null;
         }

         if (isSafeLocation(var0, var1, var7 + 1, var2)) {
            return new Location(var0, (double)var1 + (double)0.5F, (double)var7 + (double)1.0F + (double)17.0F, (double)var2 + (double)0.5F);
         }
      }

      return null;
   }

   public static void applyArrivalEffect(Player var0) {
      var0.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 0));
   }

   private static boolean isSafeLocation(World var0, int var1, int var2, int var3) {
      Block var4 = var0.getBlockAt(var1, var2, var3);
      Block var5 = var0.getBlockAt(var1, var2 + 1, var3);
      Block var6 = var0.getBlockAt(var1, var2 - 1, var3);
      return var4.getType() == Material.AIR && var5.getType() == Material.AIR && var6.getType().isSolid() && var6.getType() != Material.LAVA && var6.getType() != Material.MAGMA_BLOCK && var6.getType() != Material.CACTUS;
   }

   private static int randomInRange(int var0, int var1) {
      int var2 = var1 - var0;
      if (var2 <= 0) {
         return var0;
      } else {
         int var3 = var0 + random.nextInt(var2);
         return random.nextBoolean() ? var3 : -var3;
      }
   }
}
