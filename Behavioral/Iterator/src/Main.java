public class Main {
    public static void main(String[] args) {
        Iterator<ThemeColor> i = ThemeColor.getIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
