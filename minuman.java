import java.util.Scanner;
public abstract class minuman {

    Scanner scan = new Scanner(System.in);
    public int jenisminuman(){
        int harga = 0;
        System.out.println("tuliskan pilihan : (coffee/tea)");
        String pilihan=scan.nextLine();
          switch (pilihan) {
                case "coffee": harga = 15000;
                    
                    break;
                case "tea" : harga = 7500;
                    break;
                default: harga=0;
                    break;
            }
            return harga;
        }
        public abstract void tampiljenis(String jenis);
    }

