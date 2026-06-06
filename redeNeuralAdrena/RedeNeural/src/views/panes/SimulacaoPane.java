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
        setLayout( new GridBagLayout() );

        gbc.insets = new Insets( 5, 5, 5, 5 );
        gbc.anchor = GridBagConstraints.WEST;

        int linha = 0;

        adicionarCampo( "Idade:", idadeSpinner, linha++ );
        adicionarGrupo( "Sexo:", criarPainel( rbMasculino, rbFeminino ), linha++ );
        adicionarGrupo( "Profissional da Saúde:", criarPainel( rbProfSaudeSim, rbProfSaudeNao ), linha++ );
        adicionarGrupo( "Febre:", criarPainel( rbFebreSim, rbFebreNao ), linha++ );
        adicionarGrupo( "Tosse:", criarPainel( rbTosseSim, rbTosseNao ), linha++ );
        adicionarGrupo( "Dor de Garganta:", criarPainel( rbDorGargantaSim, rbDorGargantaNao ), linha++ );
        adicionarGrupo( "Dispneia:", criarPainel( rbDispneiaSim, rbDispneiaNao ), linha++ );
        adicionarGrupo( "Doença Pulmonar:", criarPainel( rbPulmonarSim, rbPulmonarNao ), linha++ );
        adicionarGrupo( "Doença Cardiovascular:", criarPainel( rbCardioSim, rbCardioNao ), linha++ );
        adicionarGrupo( "Diabetes:", criarPainel( rbDiabetesSim, rbDiabetesNao ), linha++ );
        adicionarGrupo( "Doença Renal Crônica:", criarPainel( rbRenalSim, rbRenalNao ), linha++ );
        adicionarGrupo( "Imunodeficiência:", criarPainel( rbImunoSim, rbImunoNao ), linha++ );
        adicionarGrupo( "Gestante/Puérpera:", criarPainel( rbGestanteSim, rbGestanteNao ), linha++);

        gbc.gridy = linha;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add( simularButton, gbc );

        configurarGrupos();
    }

    private void adicionarCampo( String texto, JComponent componente, int linha )
     {
        gbc.gridx = 0;
        gbc.gridy = linha;
        gbc.gridwidth = 1;

        add( new JLabel( texto ), gbc );

        gbc.gridx = 1;
        add( componente, gbc );
    }

    private void adicionarGrupo( String texto, JPanel painel, int linha )
    {
        gbc.gridx = 0;
        gbc.gridy = linha;

        add( new JLabel( texto ), gbc );

        gbc.gridx = 1;
        add( painel, gbc );
    }

    private JPanel criarPainel( JRadioButton sim, JRadioButton nao )
    {
        JPanel panel = new JPanel( new FlowLayout( FlowLayout.LEFT, 5, 0 ) );

        panel.add( sim );
        panel.add( nao );

        nao.setSelected( true );

        return panel;
    }

    private void configurarGrupos()
    {
        grupoGenero.add( rbMasculino );
        grupoGenero.add( rbFeminino );
        rbMasculino.setSelected( true );

        adicionarGrupoBooleano( grupoProfSaude, rbProfSaudeSim, rbProfSaudeNao );
        adicionarGrupoBooleano( grupoFebre, rbFebreSim, rbFebreNao );
        adicionarGrupoBooleano( grupoTosse, rbTosseSim, rbTosseNao );
        adicionarGrupoBooleano( grupoDorGarganta, rbDorGargantaSim, rbDorGargantaNao );
        adicionarGrupoBooleano( grupoDispneia, rbDispneiaSim, rbDispneiaNao );
        adicionarGrupoBooleano( grupoPulmonar, rbPulmonarSim, rbPulmonarNao );
        adicionarGrupoBooleano( grupoCardio, rbCardioSim, rbCardioNao );
        adicionarGrupoBooleano( grupoDiabetes, rbDiabetesSim, rbDiabetesNao );
        adicionarGrupoBooleano( grupoRenal, rbRenalSim, rbRenalNao );
        adicionarGrupoBooleano( grupoImuno, rbImunoSim, rbImunoNao );
        adicionarGrupoBooleano( grupoGestante, rbGestanteSim, rbGestanteNao );
    }

    private void adicionarGrupoBooleano( ButtonGroup grupo, JRadioButton sim, JRadioButton nao )
    {
        grupo.add( sim );
        grupo.add( nao );

        nao.setSelected( true );
    }

    private final GridBagConstraints gbc            = new GridBagConstraints();
    private final JSpinner           idadeSpinner   = new JSpinner( new SpinnerNumberModel( 18, 0, 120, 1 ) );
    private final JRadioButton       rbMasculino    = new JRadioButton( "Masculino" );
    private final JRadioButton       rbFeminino     = new JRadioButton( "Feminino" );
    private final ButtonGroup        grupoGenero    = new ButtonGroup();
    private final JRadioButton       rbProfSaudeSim = new JRadioButton( "Sim" );
    private final JRadioButton       rbProfSaudeNao = new JRadioButton( "Não" );
    private final ButtonGroup        grupoProfSaude = new ButtonGroup();

    private final JRadioButton rbFebreSim = new JRadioButton( "Sim" );
    private final JRadioButton rbFebreNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoFebre = new ButtonGroup();

    private final JRadioButton rbTosseSim = new JRadioButton( "Sim" );
    private final JRadioButton rbTosseNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoTosse = new ButtonGroup();

    private final JRadioButton rbDorGargantaSim = new JRadioButton( "Sim" );
    private final JRadioButton rbDorGargantaNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoDorGarganta = new ButtonGroup();

    private final JRadioButton rbDispneiaSim = new JRadioButton( "Sim" );
    private final JRadioButton rbDispneiaNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoDispneia = new ButtonGroup();

    private final JRadioButton rbPulmonarSim = new JRadioButton( "Sim" );
    private final JRadioButton rbPulmonarNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoPulmonar = new ButtonGroup();

    private final JRadioButton rbCardioSim = new JRadioButton( "Sim" );
    private final JRadioButton rbCardioNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoCardio = new ButtonGroup();

    private final JRadioButton rbDiabetesSim = new JRadioButton( "Sim" );
    private final JRadioButton rbDiabetesNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoDiabetes = new ButtonGroup();

    private final JRadioButton rbRenalSim = new JRadioButton( "Sim" );
    private final JRadioButton rbRenalNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoRenal = new ButtonGroup();

    private final JRadioButton rbImunoSim = new JRadioButton( "Sim" );
    private final JRadioButton rbImunoNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoImuno = new ButtonGroup();

    private final JRadioButton rbGestanteSim = new JRadioButton( "Sim" );
    private final JRadioButton rbGestanteNao = new JRadioButton( "Não" );
    private final ButtonGroup  grupoGestante = new ButtonGroup();

    private final JButton      simularButton = new JButton( "Simular Risco" );
}