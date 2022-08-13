public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        Swordsman s1 = new Swordsman();
        s1.setName("S1");
        s1.attack();
        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println("Swordsman clonado: " + s2);
    }
}
