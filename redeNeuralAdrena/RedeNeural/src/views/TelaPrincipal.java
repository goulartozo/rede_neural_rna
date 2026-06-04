package views;

import views.panes.SimulacaoPane;
import views.panes.TreinamentoPane;

import javax.swing.*;

public class TelaPrincipal
    extends
        JFrame
{

    public TelaPrincipal()
    {
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
        jTabbedPane.addTab("Informações da RNA", treinamentoPane );
        jTabbedPane.addTab("Simulação", simulacaoPane );

        this.add( jTabbedPane );
    }

    private JTabbedPane jTabbedPane = new JTabbedPane();
    private TreinamentoPane treinamentoPane = new TreinamentoPane();
    private SimulacaoPane simulacaoPane = new SimulacaoPane();

}
