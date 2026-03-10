package Perusteita;

public interface TestInterface {
    default void JotainViesti(){
        System.out.println("Jotain viesti");
    }
}
