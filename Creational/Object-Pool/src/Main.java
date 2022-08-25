public class Main {

    private static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("ImageName.jpg"), 5);

    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get(); //Como a nossa objetct pool já tem objetos criados, podemos fazer um get para termos um deles em mãos
        b1.setLocaion("D:/");
        Bitmap b2 = bitmapPool.get();
        b2.setLocaion("C:/");

        b1.draw();
        b2.draw();

        bitmapPool.release(b1); //Devolvendo o objeto para a pool para que possam ser reusados
        bitmapPool.release(b2);
    }

}
