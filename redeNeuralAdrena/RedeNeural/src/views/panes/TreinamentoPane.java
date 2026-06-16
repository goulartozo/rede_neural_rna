package views.panes;

import ADReNA_API.NeuralNetwork.Backpropagation;
import model.ResultadoTestes;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class TreinamentoPane
    extends
        JPanel
{
    public TreinamentoPane(Backpropagation value, ResultadoTestes testes )
    {
        setSource( value, testes );
        initComponents();
    }

    private void setSource( Backpropagation value, ResultadoTestes valueTestes )
    {
        txtTaxaAprendizado.setText( String.valueOf( value.GetLearningRate() ) );
        txtErroDesejado.setText( String.valueOf( value.GetErrorRate() ) );
        txtMaxIteracoes.setText( String.valueOf( value.GetMaxIterationNumber() ) );
        txtIteracoes.setText( String.valueOf( value.GetIterationNumber() ) );
        txtCamadasOcultas.setText( String.valueOf( value.GetHiddenLayerSizes().length ) );
        txtNeuroniosC1.setText( String.valueOf( value.GetHiddenLayerSizes()[0] ) );
        txtAcuracia.setText( String.valueOf( String.format( "%.2f", valueTestes.getAcuracia() ) ) );
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
        this.add( new JLabel( "Iterações Realizadas:" ), gbc );

        gbc.gridx = 1;
        this.add( txtIteracoes, gbc );

        gbc.gridy = 4;
        gbc.gridx = 0;
        this.add( new JLabel( "Camadas Ocultas:" ), gbc );
        gbc.gridx = 1;
        this.add( txtCamadasOcultas, gbc );

        gbc.gridy = 5;
        gbc.gridx = 0;
        this.add( new JLabel( "Neurônios Camada 1:" ), gbc );

        gbc.gridx = 1;
        this.add( txtNeuroniosC1, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        this.add( new JLabel( "Acurácia" ), gbc );

        gbc.gridx = 1;
        this.add( txtAcuracia, gbc );

        txtTaxaAprendizado.setEnabled( false );
        txtErroDesejado.setEnabled( false );
        txtMaxIteracoes.setEnabled( false );
        txtIteracoes.setEnabled( false );
        txtCamadasOcultas.setEnabled( false );
        txtNeuroniosC1.setEnabled( false );
        txtAcuracia.setEnabled( false );
    }

    private GridBagConstraints gbc = new GridBagConstraints();

    private JTextField txtTaxaAprendizado = new JTextField( 10 );
    private JTextField txtErroDesejado    = new JTextField( 10 );
    private JTextField txtMaxIteracoes    = new JTextField( 10 );
    private JTextField txtIteracoes       = new JTextField( 10 );
    private JTextField txtCamadasOcultas  = new JTextField(10 );
    private JTextField txtNeuroniosC1     = new JTextField( 10 );
    private JTextField txtAcuracia        = new JTextField( 10 );
}
