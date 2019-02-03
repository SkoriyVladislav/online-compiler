package by.skoriyvladislav.simple.service.compiller.code_compile;

import java.util.List;
import java.util.Map;

public interface CodeCompiler {
    List<Class<?>> compileTask(Map<String, String> fileList) throws CodeCompilerException;
}
