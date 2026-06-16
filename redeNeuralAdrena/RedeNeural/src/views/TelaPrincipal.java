package views;

import ADReNA_API.NeuralNetwork.Backpropagation;
import model.ResultadoTestes;
import views.panes.SimulacaoPane;
import views.panes.TreinamentoPane;

import javax.swing.*;

public class TelaPrincipal
    extends
        JFrame
{

    private Backpropagation rede;
    private ResultadoTestes teste;

    public TelaPrincipal( Backpropagation rede, ResultadoTestes resultadoTestes )
    {
        this.rede = rede;
        this.teste = resultadoTestes;
        setTitle("Rede Neural Artificial - Classificação de Risco COVID-19");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents()
    {
        simulacaoPane = new SimulacaoPane( rede );
        treinamentoPane = new TreinamentoPane( rede, teste );
        jTabbedPane.addTab("Informações da RNA", treinamentoPane );
        jTabbedPane.addTab("Simulação", simulacaoPane );

        this.add( jTabbedPane );
    }

    private JTabbedPane jTabbedPane = new JTabbedPane();
    private TreinamentoPane treinamentoPane;
    private SimulacaoPane simulacaoPane;

}
