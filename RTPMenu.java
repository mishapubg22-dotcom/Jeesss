package ru.manus.funrtp.menu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import ru.manus.funrtp.FunRTP;
import ru.manus.funrtp.rtp.RTPType;
import ru.manus.funrtp.utils.ColorUtil;

public class RTPMenu {
   private static final Set<UUID> animatingPlayers = new HashSet();

   public static void open(Player var0) {
      if (!animatingPlayers.contains(var0.getUniqueId())) {
         int var1 = FunRTP.getInstance().getConfig().getInt("menu.size", 45);
         Inventory var2 = Bukkit.createInventory((InventoryHolder)null, var1, getTitle());
         var0.openInventory(var2);
         if (FunRTP.getInstance().getConfig().getBoolean("menu.animation_enabled", true)) {
            animatingPlayers.add(var0.getUniqueId());
            playAnimation(var0, var2);
         } else {
            setMenuItems(var2);
         }

      }
   }

   private static void playAnimation(final Player var0, final Inventory var1) {
      final int[] var2 = new int[]{0, 1, 7, 8, 9, 17, 18, 26, 27, 35, 36, 37, 43, 44};
      final int[] var3 = new int[]{38, 39, 40, 41, 42, 34};
      final int[] var4 = new int[]{28, 29, 30, 31, 32, 33, 34};
      final int[] var5 = new int[]{19, 20, 21, 22, 23, 24, 25};
      final int[] var6 = new int[]{10, 11, 12, 13, 14, 15, 16};
      final int[] var7 = new int[]{2, 3, 4, 5, 6};
      final Material var8 = parseMaterial(FunRTP.getInstance().getConfig().getString("menu.animation.border_block", "RED_STAINED_GLASS_PANE"), Material.RED_STAINED_GLASS_PANE);
      final Material var9 = parseMaterial(FunRTP.getInstance().getConfig().getString("menu.animation.wave_block", "ORANGE_STAINED_GLASS_PANE"), Material.ORANGE_STAINED_GLASS_PANE);
      long var10 = FunRTP.getInstance().getConfig().getLong("menu.animation_speed", 1L);
      (new BukkitRunnable() {
         int tick = 0;

         public void run() {
            if (var0.isOnline() && var0.getOpenInventory().getTopInventory() == var1) {
               switch (this.tick) {
                  case 0:
                     RTPMenu.fillSlots(var1, var2, RTPMenu.createGlassPane(var8));
                     break;
                  case 1:
                     RTPMenu.fillSlots(var1, var3, RTPMenu.createGlassPane(var9));
                     break;
                  case 2:
                     RTPMenu.fillSlots(var1, var4, RTPMenu.createGlassPane(var9));
                     break;
                  case 3:
                     RTPMenu.fillSlots(var1, var5, RTPMenu.createGlassPane(var9));
                     break;
                  case 4:
                     RTPMenu.fillSlots(var1, var6, RTPMenu.createGlassPane(var9));
                     break;
                  case 5:
                     RTPMenu.fillSlots(var1, var7, RTPMenu.createGlassPane(var9));
                     break;
                  case 6:
                     var1.setItem(31, new ItemStack(Material.AIR));
                     break;
                  case 7:
                     var1.setItem(20, new ItemStack(Material.AIR));
                     var1.setItem(24, new ItemStack(Material.AIR));
                     break;
                  case 8:
                     var1.setItem(13, new ItemStack(Material.AIR));
                     break;
                  case 9:
                     RTPMenu.setMenuItems(var1);
                     RTPMenu.animatingPlayers.remove(var0.getUniqueId());
                     this.cancel();
                     return;
               }

               var0.playSound(var0.getLocation(), Sound.BLOCK_STONE_PLACE, 1.0F, 1.0F);
               ++this.tick;
            } else {
               RTPMenu.animatingPlayers.remove(var0.getUniqueId());
               this.cancel();
            }
         }
      }).runTaskTimer(FunRTP.getInstance(), 0L, var10);
   }

   private static void setMenuItems(Inventory var0) {
      var0.setItem(13, buildMenuItem("small"));
      var0.setItem(20, buildMenuItem("big"));
      var0.setItem(24, buildMenuItem("nether"));
      var0.setItem(31, buildMenuItem("event"));
   }

   private static ItemStack buildMenuItem(String var0) {
      String var1 = "menu.items." + var0;
      String var2 = FunRTP.getInstance().getConfig().getString(var1 + ".material", getDefaultMaterial(var0));
      Material var3 = parseMaterial(var2, getDefaultMaterialEnum(var0));
      String var4 = FunRTP.getInstance().getConfig().getString(var1 + ".name", getDefaultName(var0));
      List var5 = FunRTP.getInstance().getConfig().getStringList(var1 + ".lore");
      if (var5 == null || var5.isEmpty()) {
         var5 = getDefaultLore(var0);
      }

      String[] var6 = (String[])var5.toArray(new String[0]);
      return createMenuItem(var3, var4, var6);
   }

   private static String getDefaultMaterial(String var0) {
      switch (var0) {
         case "small" -> {
            return "GRASS_PATH";
         }
         case "big" -> {
            return "GRASS_BLOCK";
         }
         case "nether" -> {
            return "CRIMSON_NYLIUM";
         }
         case "event" -> {
            return "MYCELIUM";
         }
         default -> {
            return "STONE";
         }
      }
   }

   private static Material getDefaultMaterialEnum(String var0) {
      switch (var0) {
         case "small" -> {
            return Material.GRASS_PATH;
         }
         case "big" -> {
            return Material.GRASS_BLOCK;
         }
         case "nether" -> {
            return Material.CRIMSON_NYLIUM;
         }
         case "event" -> {
            return Material.MYCELIUM;
         }
         default -> {
            return Material.STONE;
         }
      }
   }

   private static String getDefaultName(String var0) {
      switch (var0) {
         case "small" -> {
            return "&x&f&f&f&f&0&0✝ Маленькая территория";
         }
         case "big" -> {
            return "&x&f&f&f&f&0&0✝ Большая территория";
         }
         case "nether" -> {
            return "&x&f&f&f&f&0&0\ud83d\udd25 Нижний мир";
         }
         case "event" -> {
            return "&x&f&f&f&f&0&0☄ Ближе к ивенту";
         }
         default -> {
            return var0;
         }
      }
   }

   private static List<String> getDefaultLore(String var0) {
      ArrayList var1 = new ArrayList();
      switch (var0) {
         case "small":
            var1.add("&x&f&f&6&6&0&0➥ Нажмите&x&f&f&f&f&e&6, для телепортации");
            break;
         case "big":
            var1.add("&x&f&f&6&6&0&0➥ Нажмите&x&f&f&f&f&e&6, для телепортации");
            var1.add("");
            var1.add("&x&f&f&f&f&0&0＄&x&f&f&f&f&e&6 Цена:&x&f&f&f&f&0&0 250,000 Монет");
            break;
         case "nether":
            var1.add("&x&f&f&6&6&0&0➥ Нажмите&x&f&f&f&f&e&6, для телепортации");
            var1.add("");
            var1.add("&x&f&f&f&f&0&0＄&x&f&f&f&f&e&6 Цена:&x&f&f&f&f&0&0 250,000 Монет");
            break;
         case "event":
            var1.add("&x&f&f&6&6&0&0➥ Нажмите&x&f&f&f&f&e&6, для телепортации");
            var1.add("");
            var1.add("&x&f&f&f&f&0&0＄&x&f&f&f&f&e&6 Цена:&x&f&f&f&f&0&0 250,000 Монет");
      }

      return var1;
   }

   private static void fillSlots(Inventory var0, int[] var1, ItemStack var2) {
      for(int var6 : var1) {
         if (var6 < var0.getSize()) {
            var0.setItem(var6, var2);
         }
      }

   }

   private static ItemStack createGlassPane(Material var0) {
      ItemStack var1 = new ItemStack(var0);
      ItemMeta var2 = var1.getItemMeta();
      if (var2 != null) {
         var2.setDisplayName(" ");
         var1.setItemMeta(var2);
      }

      return var1;
   }

   private static ItemStack createMenuItem(Material var0, String var1, String... var2) {
      ItemStack var3 = new ItemStack(var0);
      ItemMeta var4 = var3.getItemMeta();
      if (var4 != null) {
         var4.setDisplayName(ColorUtil.colorize(var1));
         ArrayList var5 = new ArrayList();

         for(String var9 : var2) {
            var5.add(ColorUtil.colorize(var9));
         }

         var4.setLore(var5);
         var3.setItemMeta(var4);
      }

      return var3;
   }

   private static Material parseMaterial(String var0, Material var1) {
      if (var0 != null && !var0.isEmpty()) {
         try {
            Material var2 = Material.valueOf(var0.toUpperCase());
            return var2;
         } catch (IllegalArgumentException var3) {
            FunRTP.getInstance().getLogger().warning("[FunRTP] Неизвестный материал '" + var0 + "' в конфиге, используется " + var1.name());
            return var1;
         }
      } else {
         return var1;
      }
   }

   public static boolean isAnimating(Player var0) {
      return animatingPlayers.contains(var0.getUniqueId());
   }

   public static void removeAnimating(Player var0) {
      animatingPlayers.remove(var0.getUniqueId());
   }

   public static RTPType getTypeBySlot(int var0) {
      switch (var0) {
         case 13 -> {
            return RTPType.SMALL;
         }
         case 20 -> {
            return RTPType.BIG;
         }
         case 24 -> {
            return RTPType.NETHER;
         }
         case 31 -> {
            return RTPType.EVENT;
         }
         default -> {
            return null;
         }
      }
   }

   public static String getTitle() {
      return ColorUtil.colorize(FunRTP.getInstance().getConfig().getString("menu.title", "&x&f&f&0&0&0&0&l●&r&x&f&f&6&6&0&0&l Случайная телепортация"));
   }
}
