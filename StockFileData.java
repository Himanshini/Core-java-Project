// 
// Decompiled by Procyon v0.5.36
// 

package fileprocessors;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;

public class StockFileData
{
    List<HashMap<String, Double>> data;
    
    public StockFileData() {
        this.data = new LinkedList<HashMap<String, Double>>();
    }
    
    public void printData() {
        System.out.println(this.data);
    }
    
    public void addData(final List<HashMap<String, Double>> dataIn) {
        this.data = dataIn;
    }
}
