import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Libri[] librat;
        Autori[] autoret;

        Biblioteka b = new Biblioteka("Biblioteka e shkolles", 200);
        LibriShkollor l1 = new LibriShkollor(1244, "Hello World", 2020, 4, "SHK1");
        l1.shtoAutori(new Autori(12, "Filan", "Fisteku"));
        l1.shtoAutori(new Autori(12, "Filan", "Fisteku"));
        l1.shtoAutori(new Autori(12, "Filan", "Fisteku"));
        l1.shtoAutori(new Autori(12, "Filan", "Fisteku"));


        Scanner sc = new Scanner(System.in);

        System.out.println("Ju lutemi zgjedhni menyren e kerkimit te librit \n Shtypni 0 per te bere exit\nShtypni 1 nese doni permes titullit\n Shtypni 2 nese doni permes Autorit");
        int pergjigja = sc.nextInt();
        if (pergjigja == 0) {
            System.exit(0);
        }
        if (pergjigja == 1) {
            //permes titutllit
            System.out.println("Ju lutem shkruani titullin e librit");
            String titulli = sc.nextLine();

        /*    for (Libri libri : librat) {

                if (libri.equals(titulli)) {
                    System.out.println("Lbri egziston ne libarri");
                }
                else {
                    System.out.println("Nuk u gjet ne librari");
                }
            } */
        }
        if (pergjigja == 2) {
                //permes autorit
            System.out.println("Ju lutem shkruani llojin e autorit");
            String autori = sc.nextLine();
           /* for (Autori autor : autoret) {
                if (autor.equals(autori)) {
                    System.out.println("Autori ekziston!");
                }
                else{
                    System.out.println("Nuk u gjet autori");
                }
            }*/
        }
        else {
                System.out.println("ju lutem shkruani njeren prej numrave te lartpermendur");
                System.exit(0);
            }

        }

    }