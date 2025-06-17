import java.util.*;

public class Graf {
    private Map<Kota, List<Kota>> listAdj = new HashMap<>();

    public void tambahKota(Kota kota) {
        listAdj.putIfAbsent(kota, new ArrayList<>());
    }

    public void tambahJalur(Kota dari, Kota ke) {
        listAdj.get(dari).add(ke);
        listAdj.get(ke).add(dari); 
    }

    public void itineraryBFS(Kota mulai) {
        System.out.println("Itinerary berdasarkan kota ota terdekat berikutnyaa (BFS):");
        Set<Kota> dikunjungi = new HashSet<>();
        Queue<Kota> antrian = new LinkedList<>();

        dikunjungi.add(mulai);
        antrian.add(mulai);

        while (!antrian.isEmpty()) {
            Kota sekarang = antrian.poll();
            System.out.println("- " + sekarang);

            for (Kota tetangga : listAdj.get(sekarang)) {
                if (!dikunjungi.contains(tetangga)) {
                    dikunjungi.add(tetangga);
                    antrian.add(tetangga);
                }
            }
        }
    }

    public void itineraryDFS(Kota mulai) {
        System.out.println("Itinerary berdasarkan  kota di negara yang lebih menjauh (DFS):");
        Set<Kota> dikunjungi = new HashSet<>();
        dfsRekursif(mulai, dikunjungi);
    }

    private void dfsRekursif(Kota kota, Set<Kota> dikunjungi) {
        dikunjungi.add(kota);
        System.out.println("- " + kota);

        for (Kota tetangga : listAdj.get(kota)) {
            if (!dikunjungi.contains(tetangga)) {
                dfsRekursif(tetangga, dikunjungi);
            }
        }
    }
}
