public class Main {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post);

        /*Caso não estivéssemos usando esta vantagem que o Simple Factory nos proporciona, teríamos
            que fazer toda a lógica do switch presente na PostFactory aqui neste método (que em aplicações reais seria
            o método que armazenaria uma regra de negócio qualquer). Sendo assim, a grande vantagem do Simple Factory é
            encapsular a lógica de criação de objetos. O ideal é usar com entidade que já sabemos quantas filhas ela tem. Ou
            usar em entidade que não irão ganhar (ou ganharão poucos) novos filhos com o passar do tempo
         */
    }
}
