import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double distancia = 1;

        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Escreva em quantos segundos o carro passou"));

        double valocidadeMedia = distancia/tempo;

        double kmh = valocidadeMedia * 3.6;

        JOptionPane.showMessageDialog(null, "VELOCIDADE EM KM/H: "+kmh);
    }
}