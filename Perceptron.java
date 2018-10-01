

public class Perceptron{

    private int epoch;
    private double eta;


    public Perceptron(int iter, double lr){
        epoch = iter;
        eta = lr;

        System.out.print(epoch+","+eta);


    }


}