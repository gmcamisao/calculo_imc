import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
    int peso;
    double altura;
    double imc;
    peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu peso (Em KGs) :"));
    altura = Double.parseDouble(JOptionPane.showInputDialog(null,"DIgite sua altura (Em metros) :"));
    imc = peso / (altura * altura);
    JOptionPane.showMessageDialog(null,"Seu imc é :" + imc);
    }
}
