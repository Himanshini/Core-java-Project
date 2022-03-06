// 
// Decompiled by Procyon v0.5.36
// 

package client;

import java.util.ArrayList;
import java.io.IOException;
import java.util.HashMap;
import fileprocessors.StockFileData;
import java.util.List;
import fileprocessors.StockFileReader;

public class StockFileApplication
{
    public static void main(final String[] args) throws IOException {
        final StockFileReader fr = new StockFileReader("table.csv");
        final List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
        final StockFileData fileData = new StockFileData();
        fileData.addData((List)dataResult);
        fileData.printData();
        System.out.println(dataResult.size());
    }
    
    public static List<HashMap<String, Double>> populateStockFileData(final List<String> headers, final List<String> lines) {
        final List<HashMap<String, Double>> dataResult = new ArrayList<HashMap<String, Double>>();
        return dataResult;
    }
}
