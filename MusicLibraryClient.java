public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("a", "a", 8, 45);
        Album a5 = new Album("b", "b", 8, 45);
        Album a6 = new Album("c", "c", 8, 45);
        Album a7 = new Album("d", "d", 8, 45);
        Album a8 = new Album("e", "e", 8, 45);
        Album a9 = new Album("f", "f", 8, 45);
        Album a10 = new Album("g", "g", 8, 45);


        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        myLibrary.add(a9);
        myLibrary.add(a10);


        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test Insertion Sort");

        myLibrary.sortByArtist();

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        int loc = myLibrary.findTitle("First");
        System.out.println("Found 'first' at index: " + loc);
        System.out.println(myLibrary.getAlbum(loc));

        loc = myLibrary.findTitle("Second");
        System.out.println("Found 'second' at index: " + loc);
        System.out.println(myLibrary.getAlbum(loc));

        int locTwo = myLibrary.findArtist("Artist");
        System.out.println("Found Artist: " + locTwo);
        System.out.println(myLibrary.getAlbum(locTwo));
    }
}

