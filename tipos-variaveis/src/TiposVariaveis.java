public class TiposVariaveis {

public static void main(String[] args) {
        int idade; // Declaração da variável "idade" do tipo int
        idade = 25; // Inicialização da variável "idade" com o valor 25

        int anoFabricacao = 2023; // Declaração e inicialização da variável "anoFabricacao"
        double salarioMinimo = 2500.0; // Declaração e inicialização da variável "salarioMinimo"

        byte idadeByte = 30; // Declaração e inicialização da variável "idadeByte" do tipo byte
        short ano = 2021; // Declaração e inicialização da variável "ano" do tipo short
        int cep = 21070333; // Declaração e inicialização da variável "cep" do tipo int
        long cpf = 98765432109L; // Declaração e inicialização da variável "cpf" do tipo long
        float pi = 3.14F; // Declaração e inicialização da variável "pi" do tipo float
        double salario = 1275.33; // Declaração e inicialização da variável "salario" do tipo double

        final double VALOR_DE_PI = 3.14; // Declaração e inicialização de uma constante "VALOR_DE_PI"
        // VALOR_DE_PI = 3.15; // Tentativa de modificar a constante (geraria erro)

        System.out.println("Idade: " + idade);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Salário Mínimo: " + salarioMinimo);
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("Pi: " + pi);
        System.out.println("Salário: " + salario);
        System.out.println("Valor de Pi (Constante): " + VALOR_DE_PI);
    }

}