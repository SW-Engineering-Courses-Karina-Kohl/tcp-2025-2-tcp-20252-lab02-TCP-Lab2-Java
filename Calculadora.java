import java.util.ArrayList;

public class Calculadora {
    private ArrayList<String> historico;
    private int ultimoResultado;
    
    public Calculadora() {
        historico = new ArrayList<String>();
    }
    
    public int somar(int a, int b) {
        int resultado = a + b;
        historico.add("" + a + " + " + b + " = " + resultado);
        ultimoResultado = resultado;
        return resultado;
    }
    
    public int subtrair(int a, int b) {
        int resultado = a - b;
        historico.add("" + a + " - " + b + " = " + resultado);
        ultimoResultado = resultado;
        return resultado;
    }
    
    public int multiplicar(int a, int b) {
        int resultado = a * b;
        historico.add("" + a + " * " + b + " = " + resultado);
        ultimoResultado = resultado;
        return resultado;
    }
    
    //ORIGINAL
    // public double dividir(int a, int b) {
    //     double resultado = a / b;
    //     historico.add("" + a + " / " + b + " = " + resultado);
    //     ultimoResultado = (int)resultado;
    //     return resultado;
    // }

    public double dividir(int a, int b) throws ArithmeticException{
        try {
            double resultado = (double)a / b;
            historico.add(a + " / " + b + " = " + resultado);
            ultimoResultado = (int)Math.round(resultado);
            return resultado;
        } catch (ArithmeticException e) {
            System.err.println("Divisão por zero detectada e tratada");
            historico.add(a + " / " + b + " = (divisão por zero tratada)");
            
        }
    }

    // public double dividir(int a, int b) {
    //     if (b == 0) {
    //         System.err.println("Aviso: Tentativa de divisão por zero");
    //         historico.add(a + " / " + b + " = (divisão por zero ignorada)");
    //         return 0; // Ou outro valor que faça sentido para sua aplicação
    //     }
    //     double resultado = (double)a / b;
    //     historico.add(a + " / " + b + " = " + resultado);
    //     ultimoResultado = (int)Math.round(resultado);
    //     return resultado;
    // }
    
    // ORIGINAL
    // public void imprimirHistorico() {
    //     System.out.println("Histórico de operações:");
    //     for (int i = 0; i <= historico.size(); i++) {
    //         System.out.println(historico.get(i));
    //     }
    // }

    public void imprimirHistorico() {
        System.out.println("Histórico de operações:");
        for (int i = 0; i <= historico.size(); i++) {  // Corrigido para <
            System.out.println(historico.get(i));
        }
    }

    // Arquivo Calculadora.java
    // public void imprimirUltimasOperacoes(int quantidade) {
    //     System.out.println("Últimas " + quantidade + " operações:");
        
    //     // Problema 1: Loop reverso com condição incorreta
    //     for (int i = historico.size() - 1; i >= historico.size() - quantidade; i--) {
    //         System.out.println(historico.get(i));
    //     }
    
    //     // Problema 2: Não verifica se o histórico tem operações suficientes
    //     // Condição de loop reverso incorreta: Quando quantidade > historico.size(), o índice fica negativo

    //     // Falta de validação: Não verifica se há operações suficientes no histórico

    //     // Possível exceção: Pode lançar ArrayIndexOutOfBoundsException ou StringIndexOutOfBoundsException
    // }

    public void imprimirUltimasOperacoes(int quantidade) {
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio");
            return;
        }
        
        int operacoesExibir = Math.min(quantidade, historico.size());
        System.out.println("Últimas " + operacoesExibir + " operações:");
        
        int inicio = Math.max(0, historico.size() - operacoesExibir);
        for (int i = inicio; i < historico.size(); i++) {
            System.out.println((i+1) + ". " + historico.get(i));
        }
    }
    
    public int getUltimoResultado() {
        return ultimoResultado;
    }
}
