package by.skoriyvladislav.simple.service.compiller.code_compile;

import by.skoriyvladislav.simple.service.ServiceException;

public class CodeCompilerException extends ServiceException {
    public CodeCompilerException() {
        super();
    }

    public CodeCompilerException(String message) {
        super(message);
    }

    public CodeCompilerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeCompilerException(Throwable cause) {
        super(cause);
    }
}
