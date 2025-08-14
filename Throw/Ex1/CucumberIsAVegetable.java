package ExceptionHandling.Throw.Ex1;

public class CucumberIsAVegetable extends Throwable {
    CucumberIsAVegetable(String description) {
        super(description);
    }
}
