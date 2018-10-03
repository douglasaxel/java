
package CalculadoraEnum;

import javax.swing.JOptionPane;

public class Calculadora {
    
    enum Operacoes{
        SOMAR("+") {
            @Override
            public double operacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double operacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double operacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double operacao(double x, double y) {
                return x / y;
            }
        };
        
        private String operador;

        private Operacoes(String operador) {
            this.operador = operador;
        }

        public abstract double operacao(double x, double y);
        
        @Override
        public String toString(){
            return this.operador;
        }
        
    }
    
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor x"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor y"));
        String result = "";
        
        for(Operacoes op : Operacoes.values()){
            result += String.valueOf( x + " " + op.toString() + " " + y + " = " + op.operacao(x, y) + "\n");
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
}
