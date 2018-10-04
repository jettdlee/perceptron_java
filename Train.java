

import java.util.*;
import java.io.*;
import java.nio.*;

public class Train{



    public static void main(String []args){

        int epoch = 10;
        double eta = 0.5;

        Perceptron perc = new Perceptron(epoch, eta);

        List<String> list = new ArrayList<>();

        // Load Data
        try{

            FileInputStream fstream = new FileInputStream("train.data");

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null){
                list.add(strLine);
            }

            //Close the input stream
            in.close();




            //System.out.println(list.get(0));

            int listCount = list.size();
            int element_count = 4;


            //System.out.println(listCount);

            double[][] data_arr = new double[listCount][element_count];
            String[] y_label = new String[listCount];

            for(int i = 0; i < listCount; i++){
                String data_row = list.get(i);
                //System.out.println(data_row);

                String[] line_split = data_row.split(",");

                //System.out.println(Arrays.toString(line_split));

                // Add each data element
                for(int j = 0; j < element_count; j++){
                    //System.out.println(line_split[j]);

                    double data_element = Double.parseDouble(line_split[j]);
                    //System.out.println(data_element);
                    data_arr[i][j] = data_element;

                }

                y_label[i] = line_split[element_count];


            }

            System.out.println(Arrays.toString(data_arr[99]));




        } catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        


    }

    private List<String> openFile(String filePath){



    }




}
