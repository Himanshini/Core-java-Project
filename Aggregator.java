// 
// Decompiled by Procyon v0.5.36
// 

package aggregators;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public abstract class Aggregator
{
    List<Double> numbers;
    
    public Aggregator() {
        this.numbers = new ArrayList<Double>();
    }
    
    public Aggregator(List<Double> numbers) {
        numbers = new ArrayList<Double>(numbers);
    }
    
    public void add(final double number) {
        this.numbers.add(number);
    }
    
    public abstract double calculate();
    
    public abstract List<Double> getValues();
}
