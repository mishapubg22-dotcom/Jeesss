package ru.manus.funrtp.utils;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

public class EconomyUtil {
   private static Economy economy = null;

   private static void setupEconomy() {
      if (Bukkit.getPluginManager().getPlugin("Vault") != null) {
         RegisteredServiceProvider var0 = Bukkit.getServicesManager().getRegistration(Economy.class);
         if (var0 != null) {
            economy = (Economy)var0.getProvider();
         }
      }
   }

   public static boolean hasEnough(Player var0, double var1) {
      if (economy == null) {
         setupEconomy();
      }

      return economy == null || economy.getBalance(var0) >= var1;
   }

   public static void withdraw(Player var0, double var1) {
      if (economy == null) {
         setupEconomy();
      }

      if (economy != null) {
         economy.withdrawPlayer(var0, var1);
      }

   }

   public static double getBalance(Player var0) {
      if (economy == null) {
         setupEconomy();
      }

      return economy == null ? (double)0.0F : economy.getBalance(var0);
   }
}
