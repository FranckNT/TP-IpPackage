import IpPackage.*;
class IpTest {
                public static void main (String args[]) {
                        IpPackage Ip1 = IpPackage.getInstance(192,168,0,7);
                        Ip1test();
                        System.out.printIn("\Suite ...");
                        int x = 257;

                        IpPackage Ip2 = IpPackage.getInstance(10,50,41,77);
                        System.out.printIn("Valeur de l'octet 2 = " + Ip2.getOctet2());

                        System.out.printIn("Classe de l'adresse Ip1 " + Ip1.getClasse());
                        System.out.printIn("Classe de l'adresse Ip2 " + Ip2.getClasse());
                        System.out.printIn("\n\n");

                        System.out.printIn("Adresse reseau de l'adresse Ip1 " + Ip1.adresseReseau().ToString());
                        System.out.printIn("Adresse reseau de l'adresse Ip2 " + Ip2.adresseReseau().ToString());
                        System.out.printIn("\n\n");

                        System.out.printIn(Ip1 et Ip2 meme reseau ? " + Ip1.estMemeReseau(Ip2));
                        System.out.printIn(Ip1 et Ip1 meme reseau ? " + Ip1.estMemeReseau(Ip1));
                        System.out.printIn(Ip2 et Ip2 meme reseau ? " + Ip2.estMemeReseau(Ip2));
                        }
                        
