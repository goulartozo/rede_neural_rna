import ADReNA_API.Data.DataSet;
import ADReNA_API.NeuralNetwork.Backpropagation;
import model.Paciente;
import repository.PacienteRepository;
import service.DataSetService;
import service.TreinamentosService;
import views.TelaPrincipal;

import java.util.List;

public class Main
{
    public static void main( String[] args ) throws Exception 
    {
        PacienteRepository repository = new PacienteRepository();

        List<Paciente> pacientes = repository.carregarPacientes( "src/dados/base_treinamento.csv" );

        DataSetService dataSetService =
                new DataSetService();

        DataSet dataSet = dataSetService.gerarDataSet( pacientes );
        
        TreinamentosService treinamentoService = new TreinamentosService();

        Backpropagation rede = treinamentoService.treinar( dataSet );
        
        TelaPrincipal tela = new TelaPrincipal( rede );
        tela.setVisible( true );
    }
}