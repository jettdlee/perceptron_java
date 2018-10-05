

import java.util.*;
import java.io.*;
import java.nio.*;

public class Train{



    public static void main(String []args){

        int epoch = 10;
        double eta = 0.5;
        int feature_no = 4;


        Data trainData = new Data("train.data", feature_no);
        Data testData = new Data("test.data", feature_no);

        //System.out.println(trainData.getData(0, 1));

        Perceptron perc = new Perceptron(epoch, eta);

    }


}
