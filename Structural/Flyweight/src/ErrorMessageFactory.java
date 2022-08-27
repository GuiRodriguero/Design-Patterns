import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa uma Flyweight Factory do nosso UML. Retorna objetos compartilhados com base no enum
 */
public class ErrorMessageFactory {

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance(){
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory(){
        errorMessages.put(ErrorType.GENERIC_SYSTEM_ERROR, new SystemErrorMessage("Erro genérico $errorCode", "http://"));
        errorMessages.put(ErrorType.PAGE_NOT_FOUND_ERROR, new SystemErrorMessage("Erro de página $errorCode", "http://"));
    }

    public SystemErrorMessage getError(ErrorType type){
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId){
        return new UserBannedErrorMessage(caseId);
    }
}
