package views.panes;

import javax.swing.*;
import java.awt.*;

public class TreinamentoPane
    extends JPanel
{
    public TreinamentoPane()
    {
        initComponents();
    }

    private void initComponents()
    {
        this.setLayout( new GridBagLayout() );
        gbc.insets = new Insets( 5, 5, 5, 5 );
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridy = 0;
        gbc.gridx = 0;
        this.add( new JLabel("Taxa de Aprendizado:" ), gbc );

        gbc.gridx = 1;
        this.add( txtTaxaAprendizado, gbc );

        gbc.gridy = 1;
        gbc.gridx = 0;
        this.add( new JLabel( "Erro Desejado:" ), gbc );

        gbc.gridx = 1;
        this.add( txtErroDesejado, gbc );

        gbc.gridy = 2;
        gbc.gridx = 0;
        this.add( new JLabel( "Máx. Iterações:" ), gbc );

        gbc.gridx = 1;
        this.add( txtMaxIteracoes, gbc );

        gbc.gridy = 3;
        gbc.gridx = 0;
        this.add( new JLabel( "Camadas Ocultas:" ), gbc );
        gbc.gridx = 1;
        this.add( txtCamadasOcultas, gbc );

        gbc.gridy = 4;
        gbc.gridx = 0;
        this.add( new JLabel( "Neurônios Camada 1:" ), gbc );

        gbc.gridx = 1;
        this.add( txtNeuroniosC1, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        this.add( new JLabel( "Neurônios Camada 2:" ), gbc );

        gbc.gridx = 1;
        this.add( txtNeuroniosC2, gbc );

        txtTaxaAprendizado.setEnabled( false );
        txtErroDesejado.setEnabled( false );
        txtMaxIteracoes.setEnabled( false );
        txtCamadasOcultas.setEnabled( false );
        txtNeuroniosC1.setEnabled( false );
        txtNeuroniosC2.setEnabled( false );
    }

    private GridBagConstraints gbc = new GridBagConstraints();
    private JTextField txtTaxaAprendizado = new JTextField( "0.10", 10 );
    private JTextField txtErroDesejado = new JTextField( "0.01", 10 );
    private JTextField txtMaxIteracoes = new JTextField( "5000", 10 );
    private JTextField txtCamadasOcultas = new JTextField( "2", 10 );
    private JTextField txtNeuroniosC1 = new JTextField( "10", 10 );
    private JTextField txtNeuroniosC2 = new JTextField( "6", 10 );
}
