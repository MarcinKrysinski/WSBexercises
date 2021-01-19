package pl.krysinski;

import pl.krysinski.creatures.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}
