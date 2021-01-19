package pl.krysinski.devices;

import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return new CompareToBuilder()
                .append(o1.getValue(), o2.getValue())
                .build();
    }
}
