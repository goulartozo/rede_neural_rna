package views;

import ADReNA_API.NeuralNetwork.Backpropagation;
import views.panes.SimulacaoPane;
import views.panes.TreinamentoPane;

import javax.swing.*;

public class TelaPrincipal
    extends
        JFrame
{

    private Backpropagation rede;

    public TelaPrincipal( Backpropagation rede )
    {
        this.rede = rede;
        setTitle("Tela Principal");
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
        jTabbedPane.addTab("Informações da RNA", treinamentoPane );
        jTabbedPane.addTab("Simulação", simulacaoPane );

        this.add( jTabbedPane );
    }

    private JTabbedPane jTabbedPane = new JTabbedPane();
    private TreinamentoPane treinamentoPane = new TreinamentoPane();
    private SimulacaoPane simulacaoPane;

}
