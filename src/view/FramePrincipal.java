package view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.*;

public class FramePrincipal extends JFrame {

    private JLabel numeros;
    private JButton botaoLimpar;
    private JButton botaoIgual;
    private JButton botaoMais;
    private JButton botaoMenos;
    private JButton botaoMul;
    private JButton botaoDiv;
    private JButton botao0;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    public FramePrincipal(){

        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put("Panel.background", new Color(208, 231, 249));
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setTitle("Calculadora");
        this.setSize(new Dimension(400,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        JPanel painelHolder = new JPanel();
        painelHolder.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        painelHolder.setPreferredSize(new Dimension(400,600));

        Font font = new Font("Arial", Font.BOLD, 24);

        numeros = new JLabel("");
        numeros.setHorizontalAlignment(SwingConstants.RIGHT);
        numeros.setFont(font);
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0,0,50,20);

        painelHolder.add(numeros,gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        instanciarBotoes(painelHolder, gbc);

        this.add(painelHolder);
        this.pack();
        this.setVisible(true);


    }

    public void instanciarBotoes(JPanel painelHolder, GridBagConstraints gbc){
        Dimension tamBotoes = new Dimension(50,50);
        botaoMais = new JButton("+");
        botaoMais.setPreferredSize(tamBotoes);
        gbc.gridy = 1;
        gbc.insets = new Insets(2,5,2,5);

        painelHolder.add(botaoMais, gbc);

        botaoMenos = new JButton("-");
        botaoMenos.setPreferredSize(tamBotoes);
        gbc.gridx = 1;

        painelHolder.add(botaoMenos, gbc);

        botaoMul = new JButton("*");
        botaoMul.setPreferredSize(tamBotoes);
        gbc.gridx = 2;

        painelHolder.add(botaoMul, gbc);

        botaoDiv = new JButton("/");
        botaoDiv.setPreferredSize(tamBotoes);
        gbc.gridx = 3;

        painelHolder.add(botaoDiv, gbc);

        botao1 = new JButton("1");
        botao1.setPreferredSize(tamBotoes);
        gbc.gridy = 2;
        gbc.gridx = 0;

        painelHolder.add(botao1, gbc);

        botao2 = new JButton("2");
        botao2.setPreferredSize(tamBotoes);
        gbc.gridx = 1;

        painelHolder.add(botao2, gbc);

        botao3 = new JButton("3");
        botao3.setPreferredSize(tamBotoes);
        gbc.gridx = 2;

        painelHolder.add(botao3, gbc);

        botao4 = new JButton("4");
        botao4.setPreferredSize(tamBotoes);
        gbc.gridy = 3;
        gbc.gridx = 0;

        painelHolder.add(botao4, gbc);

        botao5 = new JButton("5");
        botao5.setPreferredSize(tamBotoes);
        gbc.gridx = 1;

        painelHolder.add(botao5, gbc);

        botao6 = new JButton("6");
        botao6.setPreferredSize(tamBotoes);
        gbc.gridx = 2;

        painelHolder.add(botao6, gbc);

        botao7 = new JButton("7");
        botao7.setPreferredSize(tamBotoes);
        gbc.gridy = 4;
        gbc.gridx = 0;

        painelHolder.add(botao7, gbc);

        botao8 = new JButton("8");
        botao8.setPreferredSize(tamBotoes);
        gbc.gridx = 1;

        painelHolder.add(botao8, gbc);

        botao9 = new JButton("9");
        botao9.setPreferredSize(tamBotoes);
        gbc.gridx = 2;

        painelHolder.add(botao9, gbc);

        botao0 = new JButton("0");
        botao0.setPreferredSize(tamBotoes);
        gbc.gridy = 5;
        gbc.gridx = 1;

        painelHolder.add(botao0, gbc);

        botaoLimpar = new JButton("C");
        botaoLimpar.setPreferredSize(tamBotoes);
        gbc.gridy = 5;
        gbc.gridx = 2;

        painelHolder.add(botaoLimpar, gbc);

        botaoIgual = new JButton("=");
        botaoIgual.setPreferredSize(new Dimension(50,150));
        gbc.gridy = 2;
        gbc.gridheight = 3;
        gbc.gridx = 3;

        painelHolder.add(botaoIgual, gbc);


    }

    public void atualizarLabel(String operacao) {
        numeros.setText(operacao);
    }

    //getters

    public JButton getBotaoIgual() {
        return botaoIgual;
    }

    public JButton getBotaoMais() {
        return botaoMais;
    }

    public JButton getBotaoMenos() {
        return botaoMenos;
    }

    public JButton getBotaoMul() {
        return botaoMul;
    }

    public JButton getBotaoDiv() {
        return botaoDiv;
    }

    public JButton getBotao0() {
        return botao0;
    }

    public JButton getBotaoLimpar() {
        return botaoLimpar;
    }

    public JButton getBotao1() {
        return botao1;
    }

    public JButton getBotao2() {
        return botao2;
    }

    public JButton getBotao3() {
        return botao3;
    }

    public JButton getBotao4() {
        return botao4;
    }

    public JButton getBotao5() {
        return botao5;
    }

    public JButton getBotao6() {
        return botao6;
    }

    public JButton getBotao7() {
        return botao7;
    }

    public JButton getBotao8() {
        return botao8;
    }

    public JButton getBotao9() {
        return botao9;
    }


    public void fazerConta(String operacao) {
        String[] divididas = operacao.split(" ");
        try {
            if (divididas.length == 1) {
                operacao += " = " + operacao;
            } else {
                if (divididas[1].equals("+")) {
                    int resultado = Integer.parseInt(divididas[0]) + Integer.parseInt(divididas[2]);
                    operacao += " = " + resultado;
                } else if (divididas[1].equals("-")) {
                    int resultado = Integer.parseInt(divididas[0]) - Integer.parseInt(divididas[2]);
                    operacao += " = " + resultado;
                } else if (divididas[1].equals("/")) {
                    int resultado = Integer.parseInt(divididas[0]) / Integer.parseInt(divididas[2]);
                    operacao += " = " + resultado;
                } else if (divididas[1].equals("*")) {
                    int resultado = Integer.parseInt(divididas[0]) * Integer.parseInt(divididas[2]);
                    operacao += " = " + resultado;
                }
            }
        }catch(ArithmeticException e){
            operacao += " = 0";
        }

        atualizarLabel(operacao);
    }
}
