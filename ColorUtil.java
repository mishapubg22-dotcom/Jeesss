package ru.manus.funrtp.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.md_5.bungee.api.ChatColor;

public class ColorUtil {
   private static final Pattern HEX_PATTERN = Pattern.compile("&#([A-Fa-f0-9]{6})");
   private static final Pattern SPIGOT_HEX_PATTERN = Pattern.compile("&x(&[A-Fa-f0-9]){6}");

   public static String colorize(String var0) {
      if (var0 == null) {
         return "";
      } else {
         Matcher var1 = HEX_PATTERN.matcher(var0);
         StringBuilder var2 = new StringBuilder();

         while(var1.find()) {
            String var3 = var1.group(1);
            var1.appendReplacement(var2, ChatColor.of("#" + var3).toString());
         }

         var1.appendTail(var2);
         var0 = var2.toString();
         var1 = SPIGOT_HEX_PATTERN.matcher(var0);
         var2 = new StringBuilder();

         while(var1.find()) {
            String var8 = var1.group().replace("&x", "").replace("&", "");
            var1.appendReplacement(var2, ChatColor.of("#" + var8).toString());
         }

         var1.appendTail(var2);
         var0 = var2.toString();
         return ChatColor.translateAlternateColorCodes('&', var0);
      }
   }
}
