package Comics;

public class Comicslibary {
    public static void main(String[] args) {
        Comics comics =new Comics();
        comics.setComic("beginning after the end");
        comics.setAuthor("abc");
        comics.setComic1("solo leveling");
        comics.setAuthor2("abc");
        System.out.println(comics.getComic());
        System.out.println(comics.getAuthor());
        System.out.println(comics.getComic1());
        System.out.println(comics.getAuthor2());
    }
}
