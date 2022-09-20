/**
 * Podemos criar nossa Singleton usando Enum (desde o java 5). Não nos precisamos nos preocupar com herança, nem com
 * criação de objetos desta classe.
 * Uma grande vantagem de usar Enum é o fato dele lidar com serialização e deserialização
 */
public enum RegistryEnum {
    INSTANCE;

    public void getConfiguration(){
        System.out.println("Singleton Criada");
    }
}
