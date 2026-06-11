package ru.manus.funrtp.rtp;

import ru.manus.funrtp.FunRTP;

public enum RTPType {
   SMALL("small"),
   BIG("big"),
   NETHER("nether"),
   EVENT("event");

   private final String configPath;

   private RTPType(String var3) {
      this.configPath = var3;
   }

   public int getMinRadius() {
      return FunRTP.getInstance().getConfig().getInt("rtp.types." + this.configPath + ".min_radius");
   }

   public int getMaxRadius() {
      return FunRTP.getInstance().getConfig().getInt("rtp.types." + this.configPath + ".max_radius");
   }

   public int getPrice() {
      return FunRTP.getInstance().getConfig().getInt("rtp.types." + this.configPath + ".price");
   }

   // $FF: synthetic method
   private static RTPType[] $values() {
      return new RTPType[]{SMALL, BIG, NETHER, EVENT};
   }
}
