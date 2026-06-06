package repository;

import model.Paciente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository
{
    public List<Paciente> carregarPacientes( String caminhoArquivo )
    {
        List<Paciente> pacientes = new ArrayList<>();

        try ( BufferedReader br = new BufferedReader( new FileReader( caminhoArquivo ) ) )
        {

            String linha;

            br.readLine();

            while ( ( linha = br.readLine() ) != null )
            {
                String[] dados = linha.split( "," );

                Paciente paciente = new Paciente();

                paciente.setIdade(Double.parseDouble(dados[0]));
                paciente.setSexo(dados[1]);
                paciente.setProfSaude(dados[2]);
                paciente.setFebre(dados[3]);
                paciente.setTosse(dados[4]);
                paciente.setDorGarganta(dados[5]);
                paciente.setDispneia(dados[6]);
                paciente.setdPulmonar(dados[7]);
                paciente.setdCardiovascular(dados[8]);
                paciente.setDiabetes(dados[9]);
                paciente.setdRenalCron(dados[10]);
                paciente.setImunidef(dados[11]);
                paciente.setGestantePuerpera(dados[12]);
                paciente.setDesfecho(dados[13]);
                paciente.setRisco(dados[14]);

                pacientes.add(paciente);
            }

        } catch ( Exception e )
        {
            e.printStackTrace();
        }

        return pacientes;
    }
}