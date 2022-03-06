// 
// Decompiled by Procyon v0.5.36
// 

package aggregators;

import java.util.List;
import java.util.Iterator;

public class MeanAggregator extends Aggregator
{
    @Override
    public double calculate() {
        double result = 0.0;
        if (!this.numbers.isEmpty()) {
            double value = 0.0;
            for (final Double number : this.numbers) {
                value += number;
            }
            result = value / this.numbers.size();
        }
        return result;
    }
    
    @Override
    public List<Double> getValues() {
        return this.numbers;
    }
}
