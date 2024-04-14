public class Song {

    String title;
    String artist;
    int year;
    String country;

    void show() {
        System.out.println(year+ "년" + " " + country + "국적의" + " " + artist + "가 부른" + " " + title);
    }
    public Song (String t, String a, String c, int y) {
        title = t;
        artist = a;
        country = c;
        year = y;
    }

    public static void main(String[] args) {
        Song song = new Song("밤양갱","비비","한국",2024);
        song.show();
    }
}
