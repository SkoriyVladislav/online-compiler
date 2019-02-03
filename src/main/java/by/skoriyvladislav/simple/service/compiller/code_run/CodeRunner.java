package by.skoriyvladislav.simple.service.compiller.code_run;

import java.lang.reflect.Method;
import java.util.List;

public interface CodeRunner {
    Method findMethod(List<Class<?>> classList, String methodName, String[] args);
    String runTask(Method method, String[] args) throws CodeRunException;
}
