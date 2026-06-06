package service;

import ADReNA_API.Data.DataSet;
import ADReNA_API.NeuralNetwork.Backpropagation;

public class TreinamentosService
{

    public Backpropagation treinar( DataSet dataSet ) throws Exception
    {

        Backpropagation rede = new Backpropagation( 13, 3, new int[]{ 12 } );

        rede.SetLearningRate( 0.10 );
        rede.SetErrorRate( 0.05 );
        rede.SetMaxIterationNumber( 5000 );

        rede.Learn( dataSet );

        return rede;
    }
}