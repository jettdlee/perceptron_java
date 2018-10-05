
import java.util.*;
import java.io.*;
import java.nio.*;

public class Data{

    List<String> dataList = new ArrayList<>();
    private double[][] x_data;
    private String[] y_label;
    

    public Data(String filePath, int featureNo){

        // Load file
        try{
            
            FileInputStream fstream = new FileInputStream(filePath);

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null){
                dataList.add(strLine);
            }

            //Close the input stream
            in.close();

            Collections.shuffle(dataList);
        
            // Store in array
            int listCount = dataList.size();
    
            x_data = new double[listCount][featureNo];
            y_label = new String[listCount];
    
    
            for(int i = 0; i < listCount; i++){
                String data_row = dataList.get(i);
                String[] line_split = data_row.split(",");
    
                // Add each data element
                for(int j = 0; j < featureNo; j++){
                    double data_element = Double.parseDouble(line_split[j]);
                    x_data[i][j] = data_element;
    
                }
    
                y_label[i] = line_split[featureNo];
    
            }

        } catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }



    }

    public double getData(int lineNo, int feature){
        return x_data[lineNo][feature];
    }

    public String getLabel(int lineNo){
        return y_label[lineNo];
    }

}