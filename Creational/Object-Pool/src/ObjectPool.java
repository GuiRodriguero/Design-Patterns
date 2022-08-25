import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

/**
 * Está classe é onde iremos implementar nossa ObjectPool. Ela fará o Pool de tudo que extenda de {@link Poolable}.
 */
public class ObjectPool <T extends Poolable>{

    //Representará nosso cache em memória
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count){
        availablePool = new LinkedBlockingDeque<>();
        while (count-->0){ //Criando objetos para a pool
            availablePool.offer(creator.get());
        }
    }

    public T get(){
        try{
            return availablePool.take();
        }catch (InterruptedException e){
            System.err.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj){
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.out.println("put() was interrupted");
        }
    }
}
