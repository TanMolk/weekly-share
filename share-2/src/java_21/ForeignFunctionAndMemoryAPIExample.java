package java_21;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

/**
 * @author molk tan
 * 2023/11/27
 */
public class ForeignFunctionAndMemoryAPIExample {

    /*
    https://docs.oracle.com/en/java/javase/21/core/calling-c-library-function-foreign-function-and-memory-api.html#GUID-E7255CE9-5A95-437C-B37A-276B6C9B5F4D
     */
    public static void main(String[] args) throws Throwable {

        SymbolLookup stdlib = Linker.nativeLinker().defaultLookup();

        MethodHandle strlen = Linker.nativeLinker().downcallHandle(
                stdlib.find("strlen").orElseThrow(),
                FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));

        try (Arena offHeap = Arena.ofConfined()) {

            MemorySegment str = offHeap.allocateUtf8String("Hello World");

            long len = (long) strlen.invoke(str);
            System.out.println("len = " + len);

        }
    }
}
