/**
 * Representa o Concrete Flyweight do nosso UML. Aqui teremos apenas o estado intríseco (padrão para todos)
 * Tem somente o estado intrínseco. Por conta disso, o objeto desta classe é um candidato perfeito
 * para ser compartilhado em qualquer contexto, pois vai dar para implementação necessária para o método que o
 * chamou usando o estado extrínseco que foi dado para ele
 */
public class SystemErrorMessage implements ErrorMessage{

    //Propriedades de estado intrínseco (que podem ser compartilhadas e não podem ser mudadas)
    private String messageTemplate;
    private String helpUrl;

    public SystemErrorMessage(String messageTemplate, String helpUrl) {
        this.messageTemplate = messageTemplate;
        this.helpUrl = helpUrl;
    }

    /**
     *
     * @param code Este é o estado extrínseco que será fornecido para nós para que possamos usá-lo para criar a
     *             mensage final
     * @return
     */
    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrl + code;
    }
}
