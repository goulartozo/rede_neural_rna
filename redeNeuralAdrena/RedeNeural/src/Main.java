import ADReNA_API.Data.DataSet;
import ADReNA_API.NeuralNetwork.Backpropagation;
import model.Paciente;
import model.ResultadoTestes;
import repository.PacienteRepository;
import service.DataSetService;
import service.TesteService;
import service.TreinamentosService;
import views.TelaPrincipal;

import java.util.List;

public class Main
{
    public static void main( String[] args ) throws Exception 
    {
        PacienteRepository repository = new PacienteRepository();

        List<Paciente> pacientes = repository.carregarPacientes( "redeNeuralAdrena/RedeNeural/src/dados/base_treinamento.csv" );

        DataSetService dataSetService = new DataSetService();

        DataSet dataSet = dataSetService.gerarDataSet( pacientes );

        TreinamentosService treinamentoService = new TreinamentosService();

        Backpropagation rede = treinamentoService.treinar( dataSet );

        List<Paciente> pacientesTeste = repository.carregarPacientes("C:/Users/Admin/OneDrive/Documentos/unisc/rede_neural_rna/redeNeuralAdrena/RedeNeural/src/dados/base_testes.csv" );

        DataSet dataSetTeste = new DataSetService().gerarDataSet( pacientesTeste );

        ResultadoTestes resultadoTestes = new TesteService().executarTeste( rede, dataSetTeste );

        TelaPrincipal tela = new TelaPrincipal( rede, resultadoTestes );
        tela.setVisible( true );
    }
}