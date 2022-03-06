// 
// Decompiled by Procyon v0.5.36
// 

package client;

import aggregators.Aggregator;
import aggregators.MinAggregator;
import aggregators.MeanAggregator;

public class Application
{
    public static void main(final String[] args) {
        final Aggregator values = (Aggregator)new MeanAggregator();
        values.add(100.93);
        values.add(101.32);
        values.add(103.41);
        values.add(107.87);
        values.add(100.9);
        values.add(98.76);
        final Aggregator minValue = (Aggregator)new MinAggregator(values.getValues());
        final double result = minValue.calculate();
        System.out.println(result);
    }
}
