package viikko1;

public interface TestInterface {
    default void JotainViesti(){
        System.out.println("Jotain viesti");
    }
}
