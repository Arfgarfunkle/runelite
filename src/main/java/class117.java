import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dw")
public final class class117 {
   @ObfuscatedName("c")
   static class110 field1999 = new class110();

   @ObfuscatedName("p")
   static byte method2457(class110 var0) {
      return (byte)method2463(8, var0);
   }

   @ObfuscatedName("t")
   static void method2458(class110 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field1960 = 1;
      if(class110.field1946 == null) {
         class110.field1946 = new int[var0.field1960 * 100000];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method2457(var0);
            if(var1 == 23) {
               return;
            }

            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2462(var0);
            if(var1 != 0) {
               ;
            }

            var0.field1962 = 0;
            var1 = method2457(var0);
            var0.field1962 = var0.field1962 << 8 | var1 & 255;
            var1 = method2457(var0);
            var0.field1962 = var0.field1962 << 8 | var1 & 255;
            var1 = method2457(var0);
            var0.field1962 = var0.field1962 << 8 | var1 & 255;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = method2462(var0);
               if(var1 == 1) {
                  var0.field1949[var35] = true;
               } else {
                  var0.field1949[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.field1948[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if(var0.field1949[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = method2462(var0);
                     if(var1 == 1) {
                        var0.field1948[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            method2473(var0);
            int var38 = var0.field1947 + 2;
            int var39 = method2463(3, var0);
            int var40 = method2463(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = method2462(var0);
                  if(var1 == 0) {
                     var0.field1954[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var39; var27[var29] = var29++) {
               ;
            }

            for(var35 = 0; var35 < var40; ++var35) {
               var29 = var0.field1954[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.field1953[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = method2463(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = method2462(var0);
                     if(var1 == 0) {
                        var0.field1955[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = method2462(var0);
                     if(var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if(var0.field1955[var37][var35] > var3) {
                     var3 = var0.field1955[var37][var35];
                  }

                  if(var0.field1955[var37][var35] < var2) {
                     var2 = var0.field1955[var37][var35];
                  }
               }

               method2465(var0.field1926[var37], var0.field1957[var37], var0.field1958[var37], var0.field1955[var37], var2, var3, var38);
               var0.field1959[var37] = var2;
            }

            int var41 = var0.field1947 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.field1943[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.field1938[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.field1952[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if(var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.field1953[var42];
               var22 = var0.field1959[var53];
               var23 = var0.field1926[var53];
               var25 = var0.field1958[var53];
               var24 = var0.field1957[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = method2463(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = method2462(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               while(var45 != var41) {
                  if(var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if(var33 < 16) {
                        var30 = var0.field1952[0];

                        for(var1 = var0.field1938[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.field1938[var34] = var0.field1938[var34 - 1];
                           var0.field1938[var34 - 1] = var0.field1938[var34 - 2];
                           var0.field1938[var34 - 2] = var0.field1938[var34 - 3];
                           var0.field1938[var34 - 3] = var0.field1938[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.field1938[var30 + var33] = var0.field1938[var30 + var33 - 1];
                           --var33;
                        }

                        var0.field1938[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.field1952[var31] + var32;

                        for(var1 = var0.field1938[var30]; var30 > var0.field1952[var31]; --var30) {
                           var0.field1938[var30] = var0.field1938[var30 - 1];
                        }

                        ++var0.field1952[var31];

                        while(var31 > 0) {
                           --var0.field1952[var31];
                           var0.field1938[var0.field1952[var31]] = var0.field1938[var0.field1952[var31 - 1] + 16 - 1];
                           --var31;
                        }

                        --var0.field1952[0];
                        var0.field1938[var0.field1952[0]] = var1;
                        if(var0.field1952[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.field1938[var56] = var0.field1938[var0.field1952[var54] + var55];
                                 --var56;
                              }

                              var0.field1952[var54] = var56 + 1;
                           }
                        }
                     }

                     ++var0.field1943[var0.field1950[var1 & 255] & 255];
                     class110.field1946[var46] = var0.field1950[var1 & 255] & 255;
                     ++var46;
                     if(var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.field1953[var42];
                        var22 = var0.field1959[var53];
                        var23 = var0.field1926[var53];
                        var25 = var0.field1958[var53];
                        var24 = var0.field1957[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = method2463(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = method2462(var0);
                     }

                     var45 = var25[var51 - var24[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if(var45 == 0) {
                           var47 += var48;
                        } else if(var45 == 1) {
                           var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if(var44 == 0) {
                           ++var42;
                           var44 = 50;
                           var53 = var0.field1953[var42];
                           var22 = var0.field1959[var53];
                           var23 = var0.field1926[var53];
                           var25 = var0.field1958[var53];
                           var24 = var0.field1957[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = method2463(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = method2462(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.field1950[var0.field1938[var0.field1952[0]] & 255];

                     for(var0.field1943[var1 & 255] += var47; var47 > 0; --var47) {
                        class110.field1946[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.field1951 = 0;
               var0.field1935 = 0;
               var0.field1945[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field1945[var35] = var0.field1943[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field1945[var35] += var0.field1945[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(class110.field1946[var35] & 255);
                  class110.field1946[var0.field1945[var1 & 255]] |= var35 << 8;
                  ++var0.field1945[var1 & 255];
               }

               var0.field1928 = class110.field1946[var0.field1962] >> 8;
               var0.field1944 = 0;
               var0.field1928 = class110.field1946[var0.field1928];
               var0.field1942 = (byte)(var0.field1928 & 255);
               var0.field1928 >>= 8;
               ++var0.field1944;
               var0.field1925 = var46;
               method2459(var0);
               if(var0.field1944 == var0.field1925 + 1 && var0.field1951 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   @ObfuscatedName("x")
   static void method2459(class110 var0) {
      byte var2 = var0.field1935;
      int var3 = var0.field1951;
      int var4 = var0.field1944;
      int var5 = var0.field1942;
      int[] var6 = class110.field1946;
      int var7 = var0.field1928;
      byte[] var8 = var0.field1924;
      int var9 = var0.field1922;
      int var10 = var0.field1933;
      int var12 = var0.field1925 + 1;

      label122:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label122;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label122;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         boolean var14 = true;

         byte var1;
         while(var14) {
            var14 = false;
            if(var4 == var12) {
               var3 = 0;
               break label122;
            }

            var2 = (byte)var5;
            var7 = var6[var7];
            var1 = (byte)(var7 & 255);
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label122;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            } else if(var4 == var12) {
               if(var10 == 0) {
                  var3 = 1;
                  break label122;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            }
         }

         var3 = 2;
         var7 = var6[var7];
         var1 = (byte)(var7 & 255);
         var7 >>= 8;
         ++var4;
         if(var4 != var12) {
            if(var1 != var5) {
               var5 = var1;
            } else {
               var3 = 3;
               var7 = var6[var7];
               var1 = (byte)(var7 & 255);
               var7 >>= 8;
               ++var4;
               if(var4 != var12) {
                  if(var1 != var5) {
                     var5 = var1;
                  } else {
                     var7 = var6[var7];
                     var1 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                     var3 = (var1 & 255) + 4;
                     var7 = var6[var7];
                     var5 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                  }
               }
            }
         }
      }

      int var13 = var0.field1934;
      var0.field1934 += var10 - var10;
      if(var0.field1934 < var13) {
         ;
      }

      var0.field1935 = var2;
      var0.field1951 = var3;
      var0.field1944 = var4;
      var0.field1942 = var5;
      class110.field1946 = var6;
      var0.field1928 = var7;
      var0.field1924 = var8;
      var0.field1922 = var9;
      var0.field1933 = var10;
   }

   @ObfuscatedName("e")
   static byte method2462(class110 var0) {
      return (byte)method2463(1, var0);
   }

   @ObfuscatedName("y")
   static int method2463(int var0, class110 var1) {
      while(var1.field1939 < var0) {
         var1.field1937 = var1.field1937 << 8 | var1.field1931[var1.field1929] & 255;
         var1.field1939 += 8;
         ++var1.field1929;
         ++var1.field1930;
         if(var1.field1930 == 0) {
            ;
         }
      }

      int var3 = var1.field1937 >> var1.field1939 - var0 & (1 << var0) - 1;
      var1.field1939 -= var0;
      return var3;
   }

   @ObfuscatedName("w")
   public static int method2464(byte[] var0, int var1, byte[] var2, int var3) {
      class110 var4 = field1999;
      synchronized(field1999) {
         field1999.field1931 = var2;
         field1999.field1929 = var3;
         field1999.field1924 = var0;
         field1999.field1922 = 0;
         field1999.field1933 = var1;
         field1999.field1939 = 0;
         field1999.field1937 = 0;
         field1999.field1930 = 0;
         field1999.field1934 = 0;
         method2458(field1999);
         var1 -= field1999.field1933;
         field1999.field1931 = null;
         field1999.field1924 = null;
         return var1;
      }
   }

   @ObfuscatedName("c")
   static void method2465(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   @ObfuscatedName("m")
   static void method2473(class110 var0) {
      var0.field1947 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.field1948[var1]) {
            var0.field1950[var0.field1947] = (byte)var1;
            ++var0.field1947;
         }
      }

   }
}
