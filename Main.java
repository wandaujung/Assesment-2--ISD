public class Main {
    public static void main(String[] args) {
        Graf graf = new Graf();

        // mrmbuaat kota
        Kota paris = new Kota("Paris (France)");
        Kota brussels = new Kota("Brussels (Belgium)");
        Kota zurich = new Kota("Zurich (Switzerland)");
        Kota amsterdam = new Kota("Amsterdam (Netherlands)");
        Kota vienna = new Kota("Vienna (Austria)");
        Kota prague = new Kota("Prague (Czechia)");
        Kota hamburg = new Kota("Hamburg (Germany)");
        Kota warsaw = new Kota("Warsaw (Poland)");
        Kota budapest = new Kota("Budapest (Hungary)");
        //menambah nama kota
        graf.tambahKota(paris);
        graf.tambahKota(brussels);
        graf.tambahKota(zurich);
        graf.tambahKota(amsterdam);
        graf.tambahKota(vienna);
        graf.tambahKota(prague);
        graf.tambahKota(hamburg);
        graf.tambahKota(warsaw);
        graf.tambahKota(budapest);
        
        //hubungan edge berdasarkan peta
        graf.tambahJalur(paris, brussels);
        graf.tambahJalur(paris, zurich);
        graf.tambahJalur(brussels, amsterdam);
        graf.tambahJalur(zurich, vienna);
        graf.tambahJalur(vienna, budapest);
        graf.tambahJalur(vienna, prague);
        graf.tambahJalur(prague, hamburg);
        graf.tambahJalur(hamburg, amsterdam);
        graf.tambahJalur(hamburg, warsaw);
        graf.tambahJalur(budapest, warsaw);

        
        System.out.println("");
        graf.itineraryBFS(paris); 
        System.out.println("");
        graf.itineraryDFS(paris); 
        System.out.println("");
    }
}
