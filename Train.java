

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


            System.out.println(list.get(0));

            int listCount = list.size();
            
            System.out.println(listCount);

            double[][] data_arr = new double[listCount][4];

            for(int i = 0; i >= listCount-1; i++){
                String data_row = list.get(i);


            }


        } catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        





    }

}
