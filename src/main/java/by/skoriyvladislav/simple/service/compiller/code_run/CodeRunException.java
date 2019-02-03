package by.skoriyvladislav.simple.service.compiller.code_run;

import by.skoriyvladislav.simple.service.ServiceException;

public class CodeRunException extends ServiceException {

    public CodeRunException() {
        super();
    }

    public CodeRunException(String message) {
        super(message);
    }

    public CodeRunException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeRunException(Throwable cause) {
        super(cause);
    }
}
