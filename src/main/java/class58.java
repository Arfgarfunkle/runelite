import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bg")
public class class58 {
   @ObfuscatedName("x")
   class71[] field1216 = new class71[10];
   @ObfuscatedName("p")
   int field1217;
   @ObfuscatedName("t")
   int field1218;

   class58(class119 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method2506();
         if(var3 != 0) {
            --var1.field2011;
            this.field1216[var2] = new class71();
            this.field1216[var2].method1567(var1);
         }
      }

      this.field1218 = var1.method2508();
      this.field1217 = var1.method2508();
   }

   @ObfuscatedName("w")
   public static class58 method1254(class167 var0, int var1, int var2) {
      byte[] var3 = var0.method3335(var1, var2);
      return var3 == null?null:new class58(new class119(var3));
   }

   @ObfuscatedName("p")
   final byte[] method1257() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1216[var2] != null && this.field1216[var2].field1342 + this.field1216[var2].field1329 > var1) {
            var1 = this.field1216[var2].field1342 + this.field1216[var2].field1329;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field1216[var4] != null) {
               int var5 = this.field1216[var4].field1342 * 22050 / 1000;
               int var6 = this.field1216[var4].field1329 * 22050 / 1000;
               int[] var7 = this.field1216[var4].method1568(var5, this.field1216[var4].field1342);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("x")
   public class62 method1264() {
      byte[] var1 = this.method1257();
      return new class62(22050, var1, 22050 * this.field1218 / 1000, 22050 * this.field1217 / 1000);
   }

   @ObfuscatedName("t")
   public final int method1265() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1216[var2] != null && this.field1216[var2].field1329 / 20 < var1) {
            var1 = this.field1216[var2].field1329 / 20;
         }
      }

      if(this.field1218 < this.field1217 && this.field1218 / 20 < var1) {
         var1 = this.field1218 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field1216[var2] != null) {
               this.field1216[var2].field1329 -= var1 * 20;
            }
         }

         if(this.field1218 < this.field1217) {
            this.field1218 -= var1 * 20;
            this.field1217 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }
}
