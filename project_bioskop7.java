import java.util.Scanner;

public class project_bioskop7 {
    
    //diskon
    public static double hitungDiskon(double diskon) {
        if (diskon < 85000) {
            return diskon;
        } else {
            return diskon - (diskon * 0.1);
        }
    }
    
    //poin membership
    public static int poin (int poin){ 
        if (poin <= 5000){
            return 0;
        }else{
            return poin;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String resetText = "\u001B[0m";// untuk mereset warna
        String colorText = "\u001B[34m";//memberikan warna biru pada text
        String yellowText = "\u001B[33m";//untuk memberikan warna kuning pada text
        String redText = "\u001B[31m";// memberikan warna merah pada text
        String username = null, password = null;
        int noUser = 0;
        int choice;
        String[][] userKrywn = new String[4][4];
        int PilihMetode;
        int dapatPoin = 0;
        int hasilPoin = 0;
        int kumpulPoin = 0;
        int cari = 0;

        // karyawan
        userKrywn[0][0] = "Bayu";
        userKrywn[0][1] = "admin7073";
        userKrywn[0][2] = "Admin";
        userKrywn[0][3] = "Bukan Membership";

        userKrywn[1][0] = "Devita";
        userKrywn[1][1] = "user7002";
        userKrywn[1][2] = "user";
        userKrywn[1][3] = "Membership";

        userKrywn[2][0] = "Kartika";
        userKrywn[2][1] = "user7116";
        userKrywn[2][2] = "user";
        userKrywn[2][3] = "Bukan Membership";

        userKrywn[3][0] = "Syaqira";
        userKrywn[3][1] = "user7123";
        userKrywn[3][2] = "user";
        userKrywn[3][3] = "Bukan Membership";

        boolean IDfound = false;

        int TotalTiket[][] = {{0},{0},{0},{0},{0}};
        int TotalMenu[][] = {{0},{0},{0},{0},{0},{0},{0},{0},{0}};
        String[] menu = { "", "Popcorn", "Churros", "French Fries", "Orange Juice", "Jasmine Tea",
                            "Air Mineral",
                            "Lemon Tea", "coca cola" };

        String[][] dataFilmBioskop = new String[5][6];

        // Menambahkan data film dan studio
                        dataFilmBioskop[0][0] = "Yowis ben";
                        dataFilmBioskop[0][1] = "studio 1";
                        dataFilmBioskop[0][2] = "Rp.30.000,00";
                        dataFilmBioskop[0][3] = "Senin, 1 Oktober 2023";
                        dataFilmBioskop[0][4] = "13.00";

                        dataFilmBioskop[1][0] = "Joker";
                        dataFilmBioskop[1][1] = "studio 4";
                        dataFilmBioskop[1][2] = "Rp.30.000,00";
                        dataFilmBioskop[1][3] = "Kamis, 4 Oktober 2023";
                        dataFilmBioskop[1][4] = "15.00";

                        dataFilmBioskop[2][0] = "Pamali";
                        dataFilmBioskop[2][1] = "studio 3";
                        dataFilmBioskop[2][2] = "Rp.30.000,00";
                        dataFilmBioskop[2][3] = "selasa, 2 oktober 2023";
                        dataFilmBioskop[2][4] = "12.00";

                        dataFilmBioskop[3][0] = "Inception";
                        dataFilmBioskop[3][1] = "studio 5";
                        dataFilmBioskop[3][2] = "Rp.30.000,00";
                        dataFilmBioskop[3][3] = "Rabu, 3 oktober 2023";
                        dataFilmBioskop[3][4] = "17.00";

                        dataFilmBioskop[4][0] = "Barbie";
                        dataFilmBioskop[4][1] = "studio 2";
                        dataFilmBioskop[4][2] = "Rp.30.000,00";
                        dataFilmBioskop[4][3] = "jumat, 5 oktober 2023";
                        dataFilmBioskop[4][4] = "19.00";

        do {
            System.out.println(colorText+"-------------------------");
            System.out.println("|\tWELCOME !!\t|");
            System.out.println("-------------------------"+resetText);
            System.out.println("|1| Login");
            System.out.println("|2| Exit");
            System.out.print("Pilih menu: ");
        

            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            System.out.println("\033[H\033[2J");
            System.out.flush();

            switch (choice) {
                case 1:
                    // laman login admin dan user
                    System.out.println(colorText+"---------------------------------");
                    System.out.println("|\tSELAMAT DATANG\t\t|");
                    System.out.println("---------------------------------"+resetText);
                    System.out.println("Silahkan Login Terlebih Dahulu");
                    System.out.print("Masukkan Username : ");
                    username = sc.nextLine();
                    System.out.print("Masukkan Password : ");
                    password = sc.nextLine();

                    System.out.println("\033[H\033[2J");
                    System.out.flush();

                    break;

                case 2:
                    System.out.println(redText+"--Anda Keluar dari Program--"+resetText);
                    return;
            }

            for (int i = 0; i < userKrywn.length; i++) {
                if (username.equals(userKrywn[i][0]) && password.equals(userKrywn[i][1])) {
                    IDfound = true;
                    noUser = i;
                    break;
                }
            }

            while (!IDfound) {
                    System.out.println(colorText+"---------------------------------"+resetText);
                    System.out.println(colorText+"|\tSELAMAT DATANG\t\t|"+resetText);
                    System.out.println(colorText+"---------------------------------"+resetText);
                    System.out.println("Silahkan Login Terlebih Dahulu");
                    System.out.print("Masukkan Username : ");
                    username = sc.nextLine();
                    System.out.print("Masukkan Password : ");
                    password = sc.nextLine();

                    System.out.println("\033[H\033[2J");
                    System.out.flush();

                for (int i = 0; i < userKrywn.length; i++) {
                    if (username.equals(userKrywn[i][0]) && password.equals(userKrywn[i][1])) {
                        IDfound = true;
                        noUser = i;

                        System.out.println("\033[H\033[2J");
                        System.out.flush();

                        break;
                        
                    }
                }
            }
            

            if (IDfound) {
                if (userKrywn[noUser][2].equals("Admin")) {
                    System.out.println("LOGIN BERHASIL >>");
                    System.out.println(yellowText+"Selamat datang " + userKrywn[noUser][0] + "!"+resetText);
                    System.out.println("");
                    System.out.println();
             do{
                System.out.println(yellowText+"---------------------------------"+resetText);
                System.out.println(yellowText+"|\tMENU ADMIN\t\t|"+resetText);
                System.out.println(yellowText+"---------------------------------"+resetText);
                System.out.println("|1| Pelaporan");
                System.out.println("|2| Anggota Membership");
                System.out.println("|3| Back");
                System.out.print("Pilih Menu: ");
                cari = sc.nextInt();
                sc.nextLine();
                
                System.out.println("\033[H\033[2J");
                System.out.flush();

                switch (cari){ 
                    case 1 :
                //pelaporan admin
                        System.out.println(colorText+"============================================");
                        System.out.println("|            LAPORAN PENJUALAN             |");
                        System.out.println("============================================"+resetText);

                //pelaporan film
                        System.out.println
                                ("---------------------------------------------");
                                System.out.printf("| %-5s | %-20s | %-10s |", 
                                    "No", "Nama Film", "Penjualan");
                    System.out.println("");
                    System.out.println 
                                ("---------------------------------------------");
                        for (int i = 0; i < TotalTiket.length; i++) {            
                                System.out.printf("| %-5s | %-20s | %-10s |", 
                                i+1, dataFilmBioskop[i][0] , TotalTiket[i][0]);
                    System.out.println("");
                    }
                    System.out.println
                        ("---------------------------------------------");

                //pelaporan makanan 
                        System.out.println
                                ("---------------------------------------------");
                                System.out.printf("| %-5s | %-20s | %-10s |", 
                                    "No", "Nama Menu", "Penjualan");
                    System.out.println("");
                    System.out.println 
                                ("---------------------------------------------");
                        for (int i = 1; i < TotalMenu.length; i++) {            
                                System.out.printf("| %-5s | %-20s | %-10s |", 
                                i, menu[i] , TotalMenu[i][0]);
                    System.out.println("");
                    }
                    System.out.println
                        ("---------------------------------------------");
                    System.out.println("Apakah anda ingin memilih menu lainnya (y/t)?");
                    String memilih = sc.nextLine();
                    if (memilih.equalsIgnoreCase("y")) 
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        {
                        System.out.println();
                        System.out.println("-----Silahkan memilih menu lagi!!------");
                    } 
                    if (memilih.equalsIgnoreCase("t")){
                        break;
                        
                    }
                    System.out.println();
                    break;
                    

                case 2 :
                    System.out.println
                                ("---------------------------------------------");
                               System.out.printf("| %-5s | %-20s | %-10s |", 
                                    "No", "Nama Pengguna", "Poin");
                    System.out.println("");
                    int a = 1;
                    System.out.println ("---------------------------------------------");
                                System.out.printf("| %-5s | %-20s | %-10s |", 
                                    a, userKrywn[1][0], kumpulPoin-hasilPoin);
                    System.out.println("");
                    System.out.println("---------------------------------------------");
                    System.out.println("Apakah anda ingin memilih menu lainnya (y/t)?");
                    memilih = sc.nextLine();
                    if (memilih.equalsIgnoreCase("y")) 
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                    {
                        System.out.println("-----Silahkan memilih menu lagi!!------");
                    } 
                    if (memilih.equalsIgnoreCase("t")){
                        break;
                    }
                    System.out.println();
                    
                } 
            }while (cari < 3);
            System.out.println("----------------------------------------------------");
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println( redText+ "Anda keluar dari menu Admin. Silahkan Login kembali." + resetText);
            System.out.println();

                } else {
                    System.out.println("LOGIN BERHASIL >>");
                    System.out.println(yellowText+"Selamat datang " + userKrywn[noUser][0] + "!"+resetText); 
                    System.out.println();
                
                // laman user
                    String lagi = "", movie = "";
                    int counter = 0, numMenu = 0, hargaTiket = 30000, bioskop = 0;
                    int[] hargaMenu = { 0, 20000, 15000, 14000, 13000, 10000, 5000, 12000, 15000 };
                    double totalHarga = 0.0;
                    
                    String[] dataBioskop = new String[4];
                    int i = 0;

                    System.out.println(colorText+"=========================================");
                    System.out.println("|\tSELAMAT DATANG DI BIOSKOP\t|");
                    System.out.println("========================================="+resetText);

                // umur
                    System.out.print("masukkan umur anda : ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    if (umur < 13) {
                        System.out.println("umur " + umur + " belum cukup umur");
                    } else {
                        System.out.println("umur " + umur + " sudah cukup umur");
                        System.out.println("-----------------------------------------");
                        System.out.println();

                        System.out.println("\033[H\033[2J");
                        System.out.flush();

                        // bioskop pilihan
                        dataBioskop[0] = " ";
                        dataBioskop[1] = "CGV";
                        dataBioskop[2] = "XXI";
                        dataBioskop[3] = "Movimax";
                        
                        // pilih bioskop
                    System.out.println(colorText+"=================================");
                    System.out.println("|\tPilih Tempat Bioskop\t|");
                    System.out.println("================================="+resetText);
    
                        for (i = 1; i < dataBioskop.length; i++) {
                            System.out.println(i + ". " + dataBioskop[i]);
                        }
                        System.out.println("--------------------------------------------");
                        System.out.print("silahkan pilih tempat untuk menonton: ");
                        bioskop = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                        System.out.flush();

                        System.out.println(colorText+"-----------------------------------------");
                        System.out.println("|\t\t PILIH FILM\t\t|");
                        System.out.println("-----------------------------------------"+resetText);
                        if (bioskop == 1) {
                            System.out.println("film yang tersedia di CGV : ");
                            System.out.println("1. " + dataFilmBioskop[0][0]);
                            System.out.println("2. " + dataFilmBioskop[2][0]);

                        } else if (bioskop == 2) {
                            System.out.println("film yang tersedia XXI : ");
                            System.out.println("1. " + dataFilmBioskop[3][0]);
                            System.out.println("2. " + dataFilmBioskop[4][0]);

                        } else if (bioskop == 3) {
                            System.out.println("film yang tersedia Movimax : ");
                            System.out.println("1. " + dataFilmBioskop[1][0]);
                            System.out.println("2. " + dataFilmBioskop[4][0]);
                        }
                        System.out.println("------------------------------------------------------");
                        System.out.print("Pilih film yang anda inginkan (ketik film) : ");
                        movie = sc.nextLine();
                        System.out.println("------------------------------------------------------");

                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        
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
                            System.out.println(redText+"-----Silahkan memilih lagi!!------"+resetText);
                            System.out.println();
                            System.out.println(colorText+"-----------------------------------------");
                            System.out.println("|\t\t PILIH FILM\t\t|");
                            System.out.println("-----------------------------------------"+resetText);
                            if (bioskop == 1) {
                                System.out.println("film yang tersedia di CGV : ");
                                System.out.println("1. " + dataFilmBioskop[0][0]);
                                System.out.println("2. " + dataFilmBioskop[2][0]);

                            } else if (bioskop == 2) {
                                System.out.println("film yang tersedia di XXI : ");
                                System.out.println("1. " + dataFilmBioskop[3][0]);
                                System.out.println("2. " + dataFilmBioskop[4][0]);

                            } else if (bioskop == 3) {
                                System.out.println("film yang tersedia di Movimax : ");
                                System.out.println("1. " + dataFilmBioskop[1][0]);
                                System.out.println("2. " + dataFilmBioskop[4][0]);
                            }
                            System.out.println("-------------------------------------------------");
                            System.out.print("Pilih film yang anda inginkan (ketik film) : ");
                            movie = sc.nextLine();
                            System.out.println("--------------------------------------------------");

                            System.out.println("\033[H\033[2J");
                            System.out.flush();

                            for (i = 0; i < dataFilmBioskop.length; i++) {
                                if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                                    filmID = i;
                                    movieFound = true;
                                    break;
                                }
                            }

                        }

                        boolean filmTersedia = false;
                        System.out.println(yellowText+"Film tersedia!"+resetText);
                        System.out.println();
                        System.out.println("\t\tRINCIAN ");
                        System.out.println("-----------------------------------------");
                        System.out.println("Film        : " + dataFilmBioskop[filmID][0]);
                        System.out.println("Studio      : " + dataFilmBioskop[filmID][1]);
                        System.out.println("Tanggal     : " + dataFilmBioskop[filmID][3]);
                        System.out.println("Jam         : " + dataFilmBioskop[filmID][4]);
                        System.out.println("Harga       : " + dataFilmBioskop[filmID][2]);

                        // jumlah tiket
                        System.out.println("-----------------------------------------");
                        System.out.print("Masukkan jumlah tiket yang diinginkan : ");
                        int numTickets = sc.nextInt();
                        System.out.println();
                        System.out.println("\033[H\033[2J");
                        System.out.flush();

                        TotalTiket[filmID][0] += numTickets;

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
                            System.out.println(colorText+"-----------------------------------------");
                            System.out.println("|\t\tPETA SEAT\t\t|");
                            System.out.println("-----------------------------------------"+resetText);
                            System.out.println("\t[ LAYAR ]");
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

                            System.out.println("-------------------------------------------------");
                            System.out.print("Nomor kursi yang ingin Anda pesan (baris 1-" + baris + "): ");
                            pilihBaris = sc.nextInt();
                            System.out.print("pilih kursi (kolom 1 - " + kolom + "): ");
                            kursi = sc.nextInt();

                            if (pilihBaris >= 1 && pilihBaris <= baris && kursi >= 1 && kursi <= kolom) {
                                if (tersedia[pilihBaris - 1][kursi - 1]) {
                                    tersedia[pilihBaris - 1][kursi - 1] = false;
                                    System.out.println(yellowText+"seat berhasil dipilih!"+resetText);
                                } else {
                                    System.out.println(redText+"Maaf, seat tersebut sudah dipesan. Silakan pilih seat lain."+resetText);
                                }
                            } else {
                                System.out.println(redText+"Pilihan tidak valid."+resetText);
                            }

                            System.out.println(colorText+"-----------------------------------------");
                            System.out.println("|\t\tPETA SEAT\t\t|");
                            System.out.println("-----------------------------------------"+resetText);
                            System.out.println("\t[ LAYAR ]");
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

                            System.out.println("---------------------------------------");
                            System.out.print("Ingin melanjutkan memilih seat? (y/t): ");
                            String milih = sc.next();
                            System.out.println();
                            System.out.println("\033[H\033[2J");
                            System.out.flush();
                            if (milih.equalsIgnoreCase("y")) {
                                System.out.println(yellowText+"silahkan pilih lagi"+resetText);
                            }
                            if (milih.equalsIgnoreCase("t")) {
                                break;
                            }
                        }   System.out.println("\033[H\033[2J");
                            System.out.flush();

                        // pilih makanan dan minuman
                        System.out.println("===================================================");
                        System.out.print("apakah anda ingin membeli makanan/minuman? (y/t): ");
                        String pilihan = sc.next();
                        System.out.println("===================================================");
                        sc.nextLine();
                        System.out.println();
                        System.out.println("\033[H\033[2J");
                        System.out.flush();

                        int pilihanMenu = 0;

                        // display
                        int[] displayMenu = new int[10];
                        displayMenu[0] = 0;

                        int[] displayJumlahMenu = new int[10];
                        displayJumlahMenu[0] = 0;


                        if (pilihan.equalsIgnoreCase("y")) {

                            do {
                              
                                System.out.println(yellowText+"============================================"+resetText);
                                System.out.println(yellowText+"\t\tDaftar Menu\t\t"+resetText);
                                System.out.println(yellowText+"============================================"+resetText);
                                for (i = 1; i < menu.length; i++) {
                                    System.out.println(i + ". " + menu[i] + "\t\t- Tersedia : " + hargaMenu[i]);
                                }
                                System.out.println("--------------------------------------------");
                                System.out.print("Pilih Menu : ");
                                pilihanMenu = sc.nextInt();

                                if (pilihanMenu > 0 && pilihanMenu < menu.length) {

                                    System.out.println("Anda memilih " + menu[pilihanMenu]);
                                    System.out.println("--------------------------------------------");
                                    System.out.print("Masukkan jumlah menu yang diinginkan : ");
                                    numMenu = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("--------------------------------------------");

                                    TotalMenu[pilihanMenu][0] += numMenu;

                                    // display
                                    displayMenu[counter] = pilihanMenu;
                                    displayJumlahMenu[counter] = numMenu;

                                } else {
                                    System.out.println(redText+"Pilihan tidak valid."+resetText);
                                }

                                totalHarga += (hargaMenu[pilihanMenu] * numMenu);

                                // display
                                counter++;

                                System.out.print("Apakah anda ingin memesan lagi? (y/t) : ");
                                lagi = sc.nextLine();

                                System.out.println("\033[H\033[2J");
                                System.out.flush();

                                if (lagi.equalsIgnoreCase("t")) {
                                    break;

                                }
                            } while (true);

                        } else {
                            System.out.println();
                        }

                        // poin member
                        int hasil = numTickets * hargaTiket;

                        totalHarga += hasil;
                        double diskon = hitungDiskon(totalHarga);
                        

                        // total keseluruhan
                        System.out.println();
                        System.out.println();
                        System.out.println("===========================================");
                        System.out.println("||             STRUK BIOSKOP             ||");
                        System.out.println("===========================================");
                        System.out.printf("||%-13s : %-22s ||", 
                                "ATAS NAMA ", userKrywn[noUser][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "NAMA FILM ", dataFilmBioskop[filmID][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "LOKASI ", dataBioskop[bioskop], " ");
                        System.out.println("");
                        for (i = 0; i < dataFilmBioskop.length; i++) {
                            if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                        System.out.println("||--------------KETERANGAN---------------||");
                                 System.out.printf("||%-13s : %-22s ||", 
                                "jumlah tiket ", numTickets, " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "studio ", dataFilmBioskop[i][1], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Tgl Tayang ", dataFilmBioskop[filmID][3], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Jam Tayang ", dataFilmBioskop[filmID][4], " ");
                        System.out.println("");
                        System.out.println("||-----------------HARGA-----------------||");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Harga satuan ", dataFilmBioskop[i][3], " ");
                        System.out.println("");
                        System.out.printf("||%-38s ||", 
                                "Harga Seluruh ");
                        System.out.println("");
                        System.out.printf("||%-10s | %-10s | %-12s ||", 
                                30000, numTickets, (numTickets * 30000));
                        System.out.println("");
                                System.out.println("||=======================================||");
                                break;
                            }
                        }
                        if (pilihan.equalsIgnoreCase("y")) {
                                System.out.println("||----------Makanan & Minuman------------||");
                            for (i = 0; i < counter; i++) {
                                System.out.printf("||%-13s : %-22s ||", 
                                        menu[displayMenu[i]], " ");
                        System.out.println("");
                                System.out.printf("||%-10s | %-10s | %-12s ||", 
                                        hargaMenu[displayMenu[i]], displayJumlahMenu[i], hargaMenu[displayMenu[i]] * displayJumlahMenu[i]);
                                System.out.println("");
                            }System.out.println("||---------------------------------------||");
                        }
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total sebelum diskon", "Rp. ", totalHarga);
                        System.out.println("");
                                System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total setelah diskon", "Rp. ", diskon);
                        System.out.println("");
                        System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total harga ", "Rp. ", diskon-hasilPoin);
                        System.out.println("");
                        System.out.println("||                                       ||");
                        System.out.println("||======TERIMA KASIH TELAH MEMESAN!======||");

                        //Penawaran membership
                        System.out.println("---------------------------------------------------------");
                        System.out.println("Apakah anda sudah mendaftar sebagai member? (y/t)");
                        String member = sc.nextLine();

                        if(member.equalsIgnoreCase("y")) {
                            if (IDfound) {
                                if (userKrywn[noUser][3].equals("Membership")) {
                                    
                                    dapatPoin = numTickets*1000; 
                                    kumpulPoin += dapatPoin;

                           System.out.println(yellowText+userKrywn[noUser][0] + " adalah Member"+resetText);
                           System.out.println("- anda mendapatkan 1000 poin pada tiap pembelian tiket");
                           System.out.println("- total poin anda sekarang adalah " + kumpulPoin);
                           System.out.println("---------------------------------------------------------");
                           System.out.println();

                        //menukar poin
                            System.out.println("apakah anda ingin menukar poin anda (minimal 5000 poin)?? (y/t)");
                            String tukar = sc.nextLine();
                                if (tukar.equalsIgnoreCase("y")){
                                    
                                    hasilPoin = poin(kumpulPoin);

                            System.out.println("\033[H\033[2J");
                            System.out.flush();

                            // total keseluruhan setelah penukaran poin
                        System.out.println();
                        System.out.println("===========================================");
                        System.out.println("||             STRUK BIOSKOP             ||");
                        System.out.println("==========================================="); 
                        System.out.println("||      Pengguna Membership Bioskop      ||");
                        System.out.println("-------------------------------------------");
                        System.out.printf("||%-13s : %-22s ||", 
                                "ATAS NAMA ", userKrywn[noUser][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "NAMA FILM ", dataFilmBioskop[filmID][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "LOKASI ", dataBioskop[bioskop], " ");
                        System.out.println("");
                        for (i = 0; i < dataFilmBioskop.length; i++) {
                            if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                        System.out.println("||--------------KETERANGAN---------------||");
                                 System.out.printf("||%-13s : %-22s ||", 
                                "jumlah tiket ", numTickets, " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "studio ", dataFilmBioskop[i][1], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Tgl Tayang ", dataFilmBioskop[filmID][3], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Jam Tayang ", dataFilmBioskop[filmID][4], " ");
                        System.out.println("");
                        System.out.println("||-----------------HARGA-----------------||");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Harga satuan ", dataFilmBioskop[i][3], " ");
                        System.out.println("");
                        System.out.printf("||%-38s ||", 
                                "Harga Seluruh ");
                        System.out.println("");
                        System.out.printf("||%-10s | %-10s | %-12s ||", 
                                30000, numTickets, (numTickets * 30000));
                        System.out.println("");
                                System.out.println("||=======================================||");
                                break;
                            }
                        }
                        if (pilihan.equalsIgnoreCase("y")) {
                                System.out.println("||----------Makanan & Minuman------------||");
                            for (i = 0; i < counter; i++) {
                                System.out.printf("||%-13s : %-22s ||", 
                                        menu[displayMenu[i]], " ");
                        System.out.println("");
                                System.out.printf("||%-10s | %-10s | %-12s ||", 
                                        hargaMenu[displayMenu[i]], displayJumlahMenu[i], hargaMenu[displayMenu[i]] * displayJumlahMenu[i]);
                                System.out.println("");
                            }System.out.println("||---------------------------------------||");
                        }
                        System.out.printf("||%-20s : %-15s ||", 
                                "Poin member ", kumpulPoin );
                        System.out.println("");
                        System.out.printf("||%-20s : %-15s ||", 
                                "Penukaran poin ", hasilPoin );
                        System.out.println("");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total sebelum diskon", "Rp. ", totalHarga);
                        System.out.println("");
                                System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total setelah diskon", "Rp. ", diskon);
                        System.out.println("");
                        System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total harga ", "Rp. ", diskon-hasilPoin);
                        System.out.println("");
                        System.out.println("||                                       ||");
                        System.out.println("||======TERIMA KASIH TELAH MEMESAN!======||");

                }if (tukar.equalsIgnoreCase("t")){
                        System.out.println();
                        System.out.println("===========================================");
                        System.out.println("||             STRUK BIOSKOP             ||");
                        System.out.println("==========================================="); 
                        System.out.println("||      Pengguna Membership Bioskop      ||");
                        System.out.println("-------------------------------------------");
                        System.out.printf("||%-13s : %-22s ||", 
                                "ATAS NAMA ", userKrywn[noUser][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "NAMA FILM ", dataFilmBioskop[filmID][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "LOKASI ", dataBioskop[bioskop], " ");
                        System.out.println("");
                        for (i = 0; i < dataFilmBioskop.length; i++) {
                            if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                        System.out.println("||--------------KETERANGAN---------------||");
                                 System.out.printf("||%-13s : %-22s ||", 
                                "jumlah tiket ", numTickets, " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "studio ", dataFilmBioskop[i][1], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Tgl Tayang ", dataFilmBioskop[filmID][3], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Jam Tayang ", dataFilmBioskop[filmID][4], " ");
                        System.out.println("");
                        System.out.println("||-----------------HARGA-----------------||");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Harga satuan ", dataFilmBioskop[i][3], " ");
                        System.out.println("");
                        System.out.printf("||%-38s ||", 
                                "Harga Seluruh ");
                        System.out.println("");
                        System.out.printf("||%-10s | %-10s | %-12s ||", 
                                30000, numTickets, (numTickets * 30000));
                        System.out.println("");
                                System.out.println("||=======================================||");
                                break;
                            }
                        }
                        if (pilihan.equalsIgnoreCase("y")) {
                                System.out.println("||----------Makanan & Minuman------------||");
                            for (i = 0; i < counter; i++) {
                                System.out.printf("||%-13s : %-22s ||", 
                                        menu[displayMenu[i]], " ");
                        System.out.println("");
                                System.out.printf("||%-10s | %-10s | %-12s ||", 
                                        hargaMenu[displayMenu[i]], displayJumlahMenu[i], hargaMenu[displayMenu[i]] * displayJumlahMenu[i]);
                                System.out.println("");
                            }System.out.println("||---------------------------------------||");
                        }
                        System.out.printf("||%-20s : %-15s ||", 
                                "Poin member ", kumpulPoin );
                        System.out.println("");
                        System.out.printf("||%-20s : %-15s ||", 
                                "Penukaran poin ", hasilPoin );
                        System.out.println("");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total sebelum diskon", "Rp. ", totalHarga);
                        System.out.println("");
                                System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total setelah diskon", "Rp. ", diskon);
                        System.out.println("");
                        System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total harga ", "Rp. ", diskon-hasilPoin);
                        System.out.println("");
                        System.out.println("||                                       ||");
                        System.out.println("||======TERIMA KASIH TELAH MEMESAN!======||");
                }
                    }else{
                            System.out.println(redText+"----------------Anda bukan member-----------------"+resetText);
                    }
                        } 
                    }if(member.equalsIgnoreCase("t")) {
                        System.out.println();
                        System.out.println("===========================================");
                        System.out.println("||             STRUK BIOSKOP             ||");
                        System.out.println("===========================================");
                        System.out.printf("||%-13s : %-22s ||", 
                                "ATAS NAMA ", userKrywn[noUser][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "NAMA FILM ", dataFilmBioskop[filmID][0], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "LOKASI ", dataBioskop[bioskop], " ");
                        System.out.println("");
                        for (i = 0; i < dataFilmBioskop.length; i++) {
                            if (movie.equalsIgnoreCase(dataFilmBioskop[i][0])) {
                        System.out.println("||--------------KETERANGAN---------------||");
                                 System.out.printf("||%-13s : %-22s ||", 
                                "jumlah tiket ", numTickets, " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "studio ", dataFilmBioskop[i][1], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Tgl Tayang ", dataFilmBioskop[filmID][3], " ");
                        System.out.println("");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Jam Tayang ", dataFilmBioskop[filmID][4], " ");
                        System.out.println("");
                        System.out.println("||-----------------HARGA-----------------||");
                        System.out.printf("||%-13s : %-22s ||", 
                                "Harga satuan ", dataFilmBioskop[i][3], " ");
                        System.out.println("");
                        System.out.printf("||%-38s ||", 
                                "Harga Seluruh ");
                        System.out.println("");
                        System.out.printf("||%-10s | %-10s | %-12s ||", 
                                30000, numTickets, (numTickets * 30000));
                        System.out.println("");
                                System.out.println("||=======================================||");
                                break;
                            }
                        }
                        if (pilihan.equalsIgnoreCase("y")) {
                                System.out.println("||----------Makanan & Minuman------------||");
                            for (i = 0; i < counter; i++) {
                                System.out.printf("||%-13s : %-22s ||", 
                                        menu[displayMenu[i]], " ");
                        System.out.println("");
                                System.out.printf("||%-10s | %-10s | %-12s ||", 
                                        hargaMenu[displayMenu[i]], displayJumlahMenu[i], hargaMenu[displayMenu[i]] * displayJumlahMenu[i]);
                                System.out.println("");
                            }System.out.println("||---------------------------------------||");
                        }
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total sebelum diskon", "Rp. ", totalHarga);
                        System.out.println("");
                                System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total setelah diskon", "Rp. ", diskon);
                        System.out.println("");
                        System.out.println("||---------------------------------------||");
                        System.out.printf("||%-20s : %-2s %-10s ||", 
                                "Total harga ", "Rp. ", diskon-hasilPoin);
                        System.out.println("");
                        System.out.println("||                                       ||");
                        System.out.println("||======TERIMA KASIH TELAH MEMESAN!======||");
                        }  
                    
                        
                        // metode pembayaran
                        int[] nomor = { 0, 1, 2, 3, 4, 5, 6 };
                        String[] metodePembayaran = { "", "Kartu Kredit", "Transfer Bank", "DANA", "ShopeePay",
                                "LinkAja", "OVO" };

                        do {
                            System.out.println("");
                            System.out.println(colorText+"=========================================");
                            System.out.println("|\tPilih Metode Pembayaran\t\t|");
                            System.out.println("========================================="+resetText);
                            for (i = 1; i < metodePembayaran.length; i++) {
                                System.out.println(nomor[i] + ". " + metodePembayaran[i]);
                            }
                            System.out.println("----------------------------");
                            System.out.print("pilih : ");
                            PilihMetode = sc.nextInt();
                            sc.nextLine();

                            if (PilihMetode > 0 && PilihMetode < metodePembayaran.length) {
                                System.out.println(yellowText+"anda memilih metode pembayaran " + metodePembayaran[PilihMetode]+resetText);
                                System.out.println(colorText+"SELANJUTNYA >>>>"+resetText);
                                sc.nextLine();

                            } else if (PilihMetode > 6) {
                                System.out.println(redText+"pilihan anda tidak valid, silahkan pilih lagi"+resetText);
                                System.out.println("-----------------------------------------------");
                            }
                        } while (PilihMetode > 6);
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                    }
                }
            } else {
                System.out.println(redText+"MAAF LOGIN GAGAL. SILAHKAN COBA LAGI"+resetText);
            }

        } while (choice != 2);
    }
}
