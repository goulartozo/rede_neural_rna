package views.panes;

import javax.swing.*;
import java.awt.*;

public class SimulacaoPane
    extends
        JPanel
{
    public SimulacaoPane()
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
        this.add( new JLabel("Idade:" ), gbc );

        gbc.gridx = 1;
        this.add( idadeSpinner, gbc );



        gbc.gridy = 1;
        gbc.gridx = 0;
        this.add( new JLabel("Sexo:" ), gbc );

        grupoGenero.add( rbMasculino );
        grupoGenero.add( rbFeminino) ;

        JPanel painelGenero = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        painelGenero.add( rbMasculino );
        painelGenero.add( rbFeminino );

        rbMasculino.setSelected( true );

        gbc.gridx = 1;
        this.add( painelGenero, gbc );

        gbc.gridy = 2;
        gbc.gridx = 0;

        this.add( simularButton, gbc );

    }

    private GridBagConstraints gbc = new GridBagConstraints();

    private JSpinner idadeSpinner = new JSpinner();

    private JRadioButton rbMasculino = new JRadioButton("Masculino");
    private JRadioButton rbFeminino = new JRadioButton("Feminino");
    private ButtonGroup grupoGenero = new ButtonGroup();
    private JButton simularButton = new JButton( "Simular" );

}
