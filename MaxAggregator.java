// 
// Decompiled by Procyon v0.5.36
// 

package aggregators;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class MaxAggregator extends Aggregator
{
    public MaxAggregator(final List<Double> numbers) {
        this.numbers = new ArrayList<Double>();
    }
    
    @Override
    public double calculate() {
        double max = this.numbers.get(0);
        for (final Double number : this.numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    
    @Override
    public List<Double> getValues() {
        return this.numbers;
    }
}
