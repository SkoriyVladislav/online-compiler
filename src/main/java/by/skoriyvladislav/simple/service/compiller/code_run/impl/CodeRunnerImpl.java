package by.skoriyvladislav.simple.service.compiller.code_run.impl;

import by.skoriyvladislav.simple.service.compiller.code_run.CodeRunException;
import by.skoriyvladislav.simple.service.compiller.code_run.CodeRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Component
public class CodeRunnerImpl implements CodeRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Method findMethod(List<Class<?>> classList, String methodName, String[] args) {

        Method execute = null;
        for (Class<?> clazz : classList) {
            try {
                execute = clazz.getMethod(methodName, args.getClass());
            } catch (NoSuchMethodException ex) {
                logger.info("Can't find the \"execute\" method in %s class. " + ex.getMessage(), "");
            }
        }
        return execute;
    }

    @Override
    public String runTask(Method method, String[] args) throws CodeRunException {
        String executeReturn;
        try {
            executeReturn = method != null ? (String) method.invoke(null, (Object) args) : null;
        } catch (IllegalAccessException | InvocationTargetException ex) {
            logger.error("Can not run file" + ex.getMessage());
            throw new CodeRunException("Can not run file", ex);
        }
        return executeReturn;
    }
}
