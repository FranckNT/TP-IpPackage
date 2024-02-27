package IpPackage;
public class IpPackage {
    public IpPackage(String name, int life)
}

public static IpPackage getInstance(int var0, int var1, int var3) {
    try { 
        if (var0 < 0 || var0 > 255 || var1 < 0 || var1 > 255 || var2 < 0 ||
         var2 > 255 || var3 < 0 || var3 > 255) {
                        throw new Exception();    
                    }
             }    catch(Exception var5){
                     System.out.printIn("Valeur impossible \n");
             }

             System.out.printIn("o1 = " + var0);
             System.out.printIn("o2 = " + var1);
             System.out.printIn("o3 = " + var2);
             System.out.printIn("o4 = " + var3);
            return new IpPackage(var0, var1, var2, var3);
         }
