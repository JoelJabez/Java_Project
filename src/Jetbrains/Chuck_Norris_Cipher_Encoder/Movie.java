package Jetbrains.Chuck_Norris_Cipher_Encoder;

public class Movie {
    private String title;
    private String desc;
    private int year;

    // write two constructors here
    public Movie(String title, String desc, int year) {
        this.title = title;
        this.desc = desc;
        this.year = year;
    }

    public Movie(String title, int year) {
        this(title, "empty", year);
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}