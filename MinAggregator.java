// 
// Decompiled by Procyon v0.5.36
// 

package aggregators;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class MinAggregator extends Aggregator
{
    public MinAggregator(final List<Double> numbers) {
        this.numbers = new ArrayList<Double>(numbers);
    }
    
    @Override
    public double calculate() {
        double min = this.numbers.get(0);
        for (final Double number : this.numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    
    @Override
    public List<Double> getValues() {
        return this.numbers;
    }
}
