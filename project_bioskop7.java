import java.util.Scanner;

public class project_bioskop7 {

    private static double hitungDiskon(double poinMembership) {
        if (poinMembership < 85000) {
            return poinMembership;
        } else {
            return poinMembership - (poinMembership * 0.1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noUser = 0;
        String[][] userKrywn = new String[4][3];

        // karyawan
        userKrywn[0][0] = "Bayu";
        userKrywn[0][1] = "admin7073";
        userKrywn[0][2] = "Admin";

        userKrywn[1][0] = "Devita";
        userKrywn[1][1] = "user7002";
        userKrywn[1][2] = "user";

        userKrywn[2][0] = "Kartika";
        userKrywn[2][1] = "user7116";
        userKrywn[2][2] = "user";

        userKrywn[3][0] = "Syaqira";
        userKrywn[3][1] = "user7123";
        userKrywn[2][2] = "user";

        boolean IDfound = false;

        // laman login admin dan user
        System.out.println("------- LOGIN --------");
        System.out.print("Masukkan Username : ");
        String username = sc.nextLine();
        System.out.print("Masukkan Password : ");
        String password = sc.nextLine();

        for (int i = 0; i < userKrywn.length; i++) {
            if (username.equals(userKrywn[i][0]) && password.equals(userKrywn[i][1])) {
                IDfound = true;
                noUser = i;
                break;
            }
        }

        while (!IDfound) {
            System.out.println("------- LOGIN --------");
            System.out.print("Masukkan Username : ");
            username = sc.nextLine();
            System.out.print("Masukkan Password : ");
            password = sc.nextLine();

            for (int i = 0; i < userKrywn.length; i++) {
                if (username.equals(userKrywn[i][0]) && password.equals(userKrywn[i][1])) {
                    IDfound = true;
                    noUser = i;
                    break;
                }
            }
        }

        if (IDfound) {
            if (userKrywn[noUser][2].equals("Admin")) {
                System.out.println("LOGIN BERHASIL >>");
                System.out.println("Selamat datang " + userKrywn[noUser][0] + "!");
                sc.nextLine();
            } else {
                System.out.println("LOGIN BERHASIL >>");
                System.out.println("Selamat datang " + userKrywn[noUser][0] + "!");

            //laman user   
                String[] menu = { "", "Popcorn", "Churros", "Kentang Goreng", "Orange Juice", "Jasmine Tea",
                        "Mineral Water",
                        "Lemon Tea", "coca cola" };
                String lagi = "", movie = "";
                int counter = 0, numMenu = 0, hargaTiket = 30000, bioskop = 0;
                int[] hargaMenu = { 0, 20000, 15000, 14000, 13000, 10000, 5000, 12000, 15000 };
                double totalHarga = 0.0;
                String[][] dataFilmBioskop = new String[5][6];
                String[] dataBioskop = new String[4];
                int i = 0;

                System.out.println("===============================");
                System.out.println("SELAMAT DATANG DI BIOSKOP KAMI!");
                System.out.println("==============================");

                // umur
                System.out.print("masukkan umur anda : ");
                int umur = sc.nextInt();
                sc.nextLine();
                if (umur < 13) {
                    System.out.println("umur " + umur + " belum cukup umur");
                } else {
                    System.out.println("umur " + umur + " sudah cukup umur");
                    System.out.println("--------------------------");

                    // bioskop pilihan
                    dataBioskop[0] = " ";
                    dataBioskop[1] = "CGV";
                    dataBioskop[2] = "XXI";
                    dataBioskop[3] = "Movimax";

                    // Menambahkan data film dan studio
                    dataFilmBioskop[0][0] = "Yowis ben";
                    dataFilmBioskop[0][1] = "studio 1";
                    dataFilmBioskop[0][3] = "Rp.30.000,00";
                    dataFilmBioskop[0][4] = "Senin, 1 Oktober 2023";
                    dataFilmBioskop[0][5] = "13.00";

                    dataFilmBioskop[1][0] = "Joker";
                    dataFilmBioskop[1][1] = "studio 4";
                    dataFilmBioskop[1][3] = "Rp.30.000,00";
                    dataFilmBioskop[1][4] = "Kamis, 4 Oktober 2023";
                    dataFilmBioskop[1][5] = "15.00";

                    dataFilmBioskop[2][0] = "Pamali";
                    dataFilmBioskop[2][1] = "studio 3";
                    dataFilmBioskop[2][3] = "Rp.30.000,00";
                    dataFilmBioskop[2][4] = "selasa, 2 oktober 2023";
                    dataFilmBioskop[2][5] = "12.00";

                    dataFilmBioskop[3][0] = "Inception";
                    dataFilmBioskop[3][1] = "studio 5";
                    dataFilmBioskop[3][3] = "Rp.30.000,00";
                    dataFilmBioskop[3][5] = "Rabu, 3 oktober 2023";
                    dataFilmBioskop[3][5] = "17.00";

                    dataFilmBioskop[4][0] = "Barbie";
                    dataFilmBioskop[4][1] = "studio 2";
                    dataFilmBioskop[4][3] = "Rp.30.000,00";
                    dataFilmBioskop[4][4] = "jumat, 5 oktober 2023";
                    dataFilmBioskop[4][5] = "19.00";

                    // pilih bioskop
                    System.out.println("---------Daftar Bioskop---------");
                    for (i = 1; i < dataBioskop.length; i++) {
                        System.out.println(i + ". " + dataBioskop[i]);
                    }
                    System.out.println("-------------------------------------");
                    System.out.print("silahkan pilih bioskop yang tersedia : ");
                    bioskop = sc.nextInt();
                    sc.nextLine();
                    System.out.println("pilih " + dataBioskop[bioskop]);
                    System.out.println("-------------------------------------");
                    if (bioskop == 1) {
                        System.out.println("film yang tersedia : ");
                        System.out.println("1. " + dataFilmBioskop[0][0]);
                        System.out.println("2. " + dataFilmBioskop[2][0]);

                    } else if (bioskop == 2) {
                        System.out.println("film yang tersedia : ");
                        System.out.println("1. " + dataFilmBioskop[3][0]);
                        System.out.println("2. " + dataFilmBioskop[4][0]);

                    } else if (bioskop == 3) {
                        System.out.println("film yang tersedia : ");
                        System.out.println("1. " + dataFilmBioskop[1][0]);
                        System.out.println("2. " + dataFilmBioskop[4][0]);
                    }
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan nama film yang ingin dicari (ketik film) : ");
                    movie = sc.nextLine();
                    System.out.println("-------------------------------------");

                    boolean movieFound = false;
                    int filmID = 0;

                    for (i = 0; i < dataFilmBioskop.length; i++) {
                        if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                            movieFound = true;
                            filmID = i;
                            break;
                        }
                    }
                    while (!movieFound) {
                        if (bioskop == 1) {
                            System.out.println("film yang tersedia : ");
                            System.out.println("1. " + dataFilmBioskop[0][0]);
                            System.out.println("2. " + dataFilmBioskop[2][0]);

                        } else if (bioskop == 2) {
                            System.out.println("film yang tersedia : ");
                            System.out.println("1. " + dataFilmBioskop[3][0]);
                            System.out.println("2. " + dataFilmBioskop[4][0]);

                        } else if (bioskop == 3) {
                            System.out.println("film yang tersedia : ");
                            System.out.println("1. " + dataFilmBioskop[1][0]);
                            System.out.println("2. " + dataFilmBioskop[4][0]);
                        }
                        System.out.println("-------------------------------------");
                        System.out.print("Masukkan nama film yang benar (ketik film) : ");
                        movie = sc.nextLine();
                        System.out.println("-------------------------------------");

                        for (i = 0; i < dataFilmBioskop.length; i++) {
                            if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                                filmID = i;
                                movieFound = true;
                                break;
                            }
                        }

                    }

                    boolean filmTersedia = false;

                    System.out.println("---------Film Tersedia!---------");
                    System.out.println("Film        : " + dataFilmBioskop[filmID][0]);
                    System.out.println("studio      : " + dataFilmBioskop[filmID][1]);
                    System.out.println("Tanggal     : " + dataFilmBioskop[filmID][4]);
                    System.out.println("jam         : " + dataFilmBioskop[filmID][5]);
                    System.out.println("Harga       : " + dataFilmBioskop[filmID][3]);
                    System.out.println("---------------------------------");

                    // jumlah tiket
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan jumlah tiket yang diinginkan : ");
                    int numTickets = sc.nextInt();

                    // pemilihan seat
                    int baris = 5;
                    int kolom = 8;
                    int pilihBaris, kursi;
                    boolean[][] tersedia = new boolean[baris][kolom];

                    // bagian nested loop untuk ketersediaan seat
                    for (i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            tersedia[i][j] = true;
                        }
                    }

                    // Menampilkan peta seat
                    while (true) {
                        System.out.println("=========PETA SEAT=========");
                        System.out.println("-----------LAYAR----------");
                        for (i = 0; i < baris; i++) {
                            System.out.print("Baris " + (i + 1) + ": ");
                            for (int j = 0; j < kolom; j++) {
                                if (tersedia[i][j]) {
                                    System.out.print("O ");
                                } else {
                                    System.out.print("X ");
                                }
                            }
                            System.out.println();
                        }

                        System.out.println("---------------------");
                        System.out.print("Nomor kursi yang ingin Anda pesan (baris 1 - " + baris + "): ");
                        pilihBaris = sc.nextInt();
                        System.out.print("pilih kursi (kolom 1 - " + kolom + "): ");
                        kursi = sc.nextInt();

                        if (pilihBaris >= 1 && pilihBaris <= baris && kursi >= 1 && kursi <= kolom) {
                            if (tersedia[pilihBaris - 1][kursi - 1]) {
                                tersedia[pilihBaris - 1][kursi - 1] = false;
                                System.out.println("seat berhasil dipilih!");
                            } else {
                                System.out.println("Maaf, seat tersebut sudah dipesan. Silakan pilih seat lain.");
                            }
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }

                        System.out.println("---------------------------");
                        System.out.println("=========PETA SEAT=========");
                        System.out.println("-----------LAYAR-----------");
                        for (i = 0; i < baris; i++) {
                            System.out.print("Baris " + (i + 1) + ": ");
                            for (int j = 0; j < kolom; j++) {
                                if (tersedia[i][j]) {
                                    System.out.print("O ");
                                } else {
                                    System.out.print("X ");
                                }
                            }
                            System.out.println();
                        }

                        System.out.println("-------------------------");
                        System.out.print("Ingin melanjutkan memilih seat? (y/t): ");
                        String milih = sc.next();
                        System.out.println();
                        if (milih.equalsIgnoreCase("y")) {
                            System.out.println("silahkan pilih lagi");
                        }
                        if (milih.equalsIgnoreCase("t")) {
                            break;
                        }
                    }

                    // pilih makanan dan minuman
                    System.out.println("===========================");
                    System.out.println("apakah anda ingin membeli makanan/minuman? (y/t)");
                    String pilihan = sc.next();
                    sc.nextLine();

                    int pilihanMenu = 0;

                    // display
                    int[] displayMenu = new int[10];
                    displayMenu[0] = 0;

                    int[] displayJumlahMenu = new int[10];
                    displayJumlahMenu[0] = 0;

                    if (pilihan.equalsIgnoreCase("y")) {

                        do {

                            System.out.println("==========================");
                            System.out.println("       Daftar Menu        ");
                            System.out.println("==========================");
                            for (i = 1; i < menu.length; i++) {
                                System.out.println(i + ". " + menu[i] + " - Tersedia : " + hargaMenu[i]);
                            }
                            System.out.println("--------------------------");
                            System.out.print("pilih : ");
                            pilihanMenu = sc.nextInt();

                            if (pilihanMenu > 0 && pilihanMenu < menu.length) {

                                System.out.println("Anda memilih " + menu[pilihanMenu]);
                                System.out.println("--------------------------");
                                System.out.print("Masukkan jumlah menu yang diinginkan : ");
                                numMenu = sc.nextInt();
                                sc.nextLine();
                                System.out.println("--------------------------");

                                // display
                                displayMenu[counter] = pilihanMenu;
                                displayJumlahMenu[counter] = numMenu;

                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }

                            totalHarga += (hargaMenu[pilihanMenu] * numMenu);

                            // display
                            counter++;

                            System.out.print("Apakah anda ingin memesan lagi? (y/t) : ");
                            lagi = sc.nextLine();

                            if (lagi.equalsIgnoreCase("t")) {
                                break;

                            }
                        } while (true);

                    } else {
                        System.out.println();
                    }

                    // poin member
                    System.out.print("Masukkan total pembelian tiket: ");
                    int hasil = numTickets * hargaTiket;
                    // double diskon = hasil * 0.1;

                    totalHarga += hasil;
                    double poinMembership = hitungDiskon(totalHarga);
                    // System.out.println("harga tiket : " + " Rp. " + hargaTiket);

                    // total keseluruhan
                    System.out.println();
                    System.out.println("=======================================");
                    System.out.println("||           STRUK BIOSKOP           ||");
                    System.out.println("=======================================");
                    System.out.println("||ATAS NAMA     : " + userKrywn[noUser][0] + "||");
                    System.out.println("||NAMA FILM     : " + dataFilmBioskop[filmID][0] + "||");
                    System.out.println("||LOKASI        : " + dataBioskop[bioskop] + "||");
                    System.out.println("---------------------------------------");
                    for (i = 0; i < dataFilmBioskop.length; i++) {
                        if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                            System.out.println("||--------------KETERANGAN---------------");
                            System.out.println("||jumlah tiket  : " + numTickets + "                    ||");
                            System.out.println("||studio        : " + dataFilmBioskop[i][1] + "             ||");
                            System.out.println("||Tgl Tayang    : " + dataFilmBioskop[filmID][4] + "  ||");
                            System.out.println("||Jam Tayang    : " + dataFilmBioskop[filmID][5] + "  ||");
                            System.out.println("||-----------------HARGA-----------------");
                            System.out.println("||Harga satuan  : " + dataFilmBioskop[i][3] + "         ||");
                            System.out.println("||Harga seluruh   :                         ||");
                            System.out.println("||" + 30000 + "     " + numTickets + "      = " +"Rp. " + (numTickets*30000) + "    ||");
                            System.out.println("-----------------------------------------");
                            break;
                        }
                    }
                    if (pilihan.equalsIgnoreCase("y")) {
                        System.out.println("=========================================");
                        System.out.println("||------------Makanan & Minuman--------------");
                        for (i = 0; i < counter; i++) {
                            System.out.println("|| " + menu[displayMenu[i]] + " : ");
                            System.out.println("|| "+ hargaMenu[displayMenu[i]]+"   "+ displayJumlahMenu[i] +"  Rp. "
                                    + hargaMenu[displayMenu[i]] * displayJumlahMenu[i]);
                        }
                    }  
                    System.out.println("||Total sebelum diskon : " + "Rp. " + totalHarga);
                    System.out.println("=========================================");
                    System.out.println("||Total harga : Rp. " + poinMembership);
                    System.out.println("===Terima kasih telah memesan di Bioskop kami!===");

                //metode pembayaran
                    int [] nomor = {0, 1, 2, 3, 4, 5, 6};
                    String [] metodePembayaran = {"", "Kartu Kredit", "Transfer Bank", "DANA", "ShopeePay", "LinkAja", "OVO"};

                    do{ 
                        System.out.println("Pilih metode pembayaran:");
                            for (i = 1; i < metodePembayaran.length; i++ ){
                        System.out.println(nomor[i] + ". " + metodePembayaran[i]);
                    }      
                        System.out.println("-----------------------");
                        System.out.print("pilih : ");
                        int PilihMetode = sc.nextInt();
                        sc.nextLine();
                        
                            if(PilihMetode > 0 && PilihMetode < metodePembayaran.length){
                                    System.out.println("anda memilih metode pembayaran " + metodePembayaran[PilihMetode]);
                                    System.out.println("SELANJUTNYA >>>>");
                                    sc.nextLine();
                                    
                            }else if (PilihMetode > 6){
                                System.out.println("pilihan anda tidak valid, silahkan pilih lagi");
                                System.out.println("-----------------------------------------------");
                        }
                    }while(true);
                }
            } 
        } else {
            System.out.println("MAAF LOGIN GAGAL. SILAHKAN COBA LAGI");
        }
    }
}
