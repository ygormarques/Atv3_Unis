import javax.swing.JOptionPane;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Ler o peso em Kg e a altura em Cm
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso em Kg:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em Cm:"));

        // Converter altura para metros
        altura = altura / 100;

        // Calcular o IMC
        double imc = peso / (altura * altura);

        // Mostrar informações sobre o resultado do IMC
        String mensagem = "Seu IMC é: " + imc + "\n";

        if (imc < 18.5) {
            mensagem += "Classificação: Abaixo do peso";
        } else if (imc < 25) {
            mensagem += "Classificação: Peso normal";
        } else if (imc < 30) {
            mensagem += "Classificação: Sobrepeso";
        } else if (imc < 35) {
            mensagem += "Classificação: Obesidade grau I";
        } else if (imc < 40) {
            mensagem += "Classificação: Obesidade grau II";
        } else {
            mensagem += "Classificação: Obesidade grau III";
        }

        // Exibir a mensagem com as informações do IMC
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
