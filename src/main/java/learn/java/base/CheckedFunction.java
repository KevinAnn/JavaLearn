package learn.java.base;

@FunctionalInterface
public interface CheckedFunction {
    void handle() throws InterruptedException;
}
