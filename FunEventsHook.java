package ru.manus.funrtp.hooks;

import dev.ckateptb.minecraft.jyraf.container.IoC;
import dev.hogoshi.spookyevents.event.SpookyEvent;
import dev.hogoshi.spookyevents.event.repository.EventRepository;
import dev.hogoshi.spookyevents.event.service.EventService;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.Location;

public class FunEventsHook {
   public static boolean isFunEventsEnabled() {
      return Bukkit.getPluginManager().getPlugin("FunEvents") != null;
   }

   public static boolean isSpookyEventsEnabled() {
      return Bukkit.getPluginManager().getPlugin("SpookyEvents") != null;
   }

   public static Location getActiveEventLocation() {
      if (isFunEventsEnabled()) {
         try {
            Set var0 = getFunEventsActiveEvents();
            if (var0 != null && !var0.isEmpty()) {
               for(Object var2 : var0) {
                  Location var3 = getFunEventLocation(var2);
                  if (var3 != null && isFunEventStarted(var2)) {
                     return var3;
                  }
               }
            }
         } catch (Throwable var8) {
         }
      }

      if (isSpookyEventsEnabled()) {
         try {
            EventService var12 = resolveSpookyEventService();
            EventRepository var9;
            Set var11;
            if (var12 != null && (var9 = var12.getEventRepository()) != null && (var11 = var9.getRunning()) != null && !var11.isEmpty()) {
               for(Object var4 : var11) {
                  if (var4 instanceof SpookyEvent) {
                     SpookyEvent var5 = (SpookyEvent)var4;
                     Location var6 = var5.getLocation();
                     if (var6 != null) {
                        return var6;
                     }
                  }
               }
            }

            if (var12 != null && (var9 = var12.getEventRepository()) != null && var9.getServerEvent() != null) {
               Location var14 = var9.getServerEvent().getLocation();
               if (var14 != null) {
                  return var14;
               }
            }
         } catch (Throwable var7) {
         }
      }

      return null;
   }

   private static Set<?> getFunEventsActiveEvents() {
      try {
         Class var0 = Class.forName("uwqan.funevents.FunEvents");
         Method var1 = var0.getMethod("getInstance");
         Object var2 = var1.invoke((Object)null);
         if (var2 == null) {
            return null;
         }

         Method var3 = var0.getMethod("getActiveEvents");
         Object var4 = var3.invoke(var2);
         if (var4 instanceof Set) {
            return (Set)var4;
         }
      } catch (Throwable var5) {
      }

      return null;
   }

   private static boolean isFunEventStarted(Object var0) {
      try {
         if (var0 == null) {
            return false;
         } else {
            Method var1 = var0.getClass().getMethod("getStatus");
            Object var2 = var1.invoke(var0);
            if (var2 == null) {
               return false;
            } else {
               String var3 = var2.toString();
               return "STARTED".equals(var3) || "ACTIVATED".equals(var3) || "READYTODESTROY".equals(var3);
            }
         }
      } catch (Throwable var4) {
         return false;
      }
   }

   private static Location getFunEventLocation(Object var0) {
      try {
         if (var0 == null) {
            return null;
         }

         Method var1 = var0.getClass().getMethod("getEventLocation");
         Object var2 = var1.invoke(var0);
         if (var2 instanceof Location) {
            return (Location)var2;
         }
      } catch (Throwable var3) {
      }

      return null;
   }

   private static EventService resolveSpookyEventService() {
      try {
         Optional var0 = IoC.getBean(EventService.class);
         if (var0 == null || !var0.isPresent()) {
            return null;
         }

         Object var1 = var0.get();
         if (var1 instanceof EventService) {
            return (EventService)var1;
         }

         if (var1 != null) {
            Object var2 = invokeNoArg(var1, "block");
            if (var2 instanceof EventService) {
               return (EventService)var2;
            }

            var2 = invokeNoArg(var1, "blockOptional");
            if (var2 instanceof Optional && ((Optional)var2).isPresent() && ((Optional)var2).get() instanceof EventService) {
               return (EventService)((Optional)var2).get();
            }
         }
      } catch (Throwable var3) {
      }

      return null;
   }

   private static Object invokeNoArg(Object var0, String var1) {
      try {
         Method var2 = var0.getClass().getMethod(var1);
         return var2.invoke(var0);
      } catch (Throwable var3) {
         return null;
      }
   }

   public static boolean hasActiveEvent() {
      return getActiveEventLocation() != null;
   }
}
