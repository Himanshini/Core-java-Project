// 
// Decompiled by Procyon v0.5.36
// 

package fileprocessors;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StockFileReader
{
    String filePath;
    
    public StockFileReader(final String filePath) {
        this.filePath = null;
        this.filePath = filePath;
    }
    
    public List<String> getHeaders() throws IOException {
        final String line = readFirstLine(this.filePath);
        final String[] header = line.split(",");
        List<String> values = new ArrayList<String>();
        values = Arrays.asList(header);
        return values;
    }
    
    static String readFirstLine(final String path) throws IOException {
        Throwable t = null;
        try {
            final BufferedReader br = new BufferedReader(new FileReader(path));
            try {
                return br.readLine();
            }
            finally {
                if (br != null) {
                    br.close();
                }
            }
        }
        finally {
            if (t == null) {
                final Throwable exception;
                t = exception;
            }
            else {
                final Throwable exception;
                if (t != exception) {
                    t.addSuppressed(exception);
                }
            }
        }
    }
    
    public List<String> readFileData() throws IOException {
        final List<String> lines = new ArrayList<String>();
        return lines;
    }
}
