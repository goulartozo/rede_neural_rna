package util;

import ADReNA_API.Data.DataSetObject;
import model.Paciente;

public class ConversorPaciente
{
    public DataSetObject converter( Paciente paciente )
    {
        double[] entrada = criarEntrada( paciente );
        double[] saida = criarSaida( paciente );

        return new DataSetObject( entrada, saida );
    }

    private double[] criarEntrada( Paciente paciente )
    {
        return new double[]
                {
                    paciente.getIdade() / 100.0,
                    converterSexo( paciente.getSexo() ),
                    converterSimNao( paciente.getProfSaude() ),
                    converterSimNao( paciente.getFebre() ),
                    converterSimNao( paciente.getTosse() ),
                    converterSimNao( paciente.getDorGarganta() ),
                    converterSimNao( paciente.getDispneia() ),
                    converterSimNao( paciente.getdPulmonar() ),
                    converterSimNao( paciente.getdCardiovascular() ),
                    converterSimNao( paciente.getDiabetes() ),
                    converterSimNao( paciente.getdRenalCron() ),
                    converterSimNao( paciente.getImunidef() ),
                    converterSimNao( paciente.getGestantePuerpera() )
                };
    }

    public double[] converterEntrada( Paciente paciente )
    {
        return criarEntrada( paciente );
    }

    private double[] criarSaida( Paciente paciente )
    {
        switch ( paciente.getRisco().toUpperCase() )
        {
            case "BAIXO":
                return new double[]{ 1,0,0 };

            case "MEDIO":
            case "MÉDIO":
                return new double[]{ 0,1,0 };

            case "ALTO":
                return new double[]{ 0,0,1 };

            default:
                throw new IllegalArgumentException( "Risco inválido: " + paciente.getRisco() );
        }
    }

    private double converterSexo( String sexo )
    {
        return sexo.equalsIgnoreCase( "F" ) ? 1 : 0;
    }

    private double converterSimNao( String valor )
    {
        return valor.equalsIgnoreCase( "SIM" ) ? 1 : 0;
    }
}