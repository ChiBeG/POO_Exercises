import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        1-------------------------------------------------------------------
//        Funcionario func1 = new Funcionario();
//        Funcionario func2 = new Funcionario("Pedro", "Gomes", 5000);
//
//        func1.setPrimeiroNome("João");
//        func1.setSobreNome("Gomes");
//        func1.setSalarioMensal(6000);
//
//
//        double salarioFunc1 = func1.getSalarioMensal();
//        double salarioFunc2 = func2.getSalarioMensal();
//
//        System.out.println(func1.getPrimeiroNome() + " " + func1.getSobreNome() + " salário: " + salarioFunc1);
//        System.out.println(func2.getPrimeiroNome() + " " + func2.getSobreNome() + " salário: " + salarioFunc2);
//
//        salarioFunc1 *= 1.2;
//        salarioFunc2 *= 1.2;
//
//        func1.setSalarioMensal(salarioFunc1);
//        func2.setSalarioMensal(salarioFunc2);
//
//        System.out.println(func1.getPrimeiroNome() + " " + func1.getSobreNome() + " salário: " + salarioFunc1);
//        System.out.println(func2.getPrimeiroNome() + " " + func2.getSobreNome() + " salário: " + salarioFunc2);
// 3----------------------------------------------------------------------------------------------------------
//        Cifra cifra = new Cifra();
//        System.out.println(cifra.Criptografar("abcdefghijklmnopqrtsuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
//        System.out.println(cifra.Descriptografar("defghijklmnopqrstuwvxyzabcDEFGHIJKLMNOPQRSTUVWXYZABC"));
// 4--------------------------------------------------------------------------------------------------------------
//        System.out.println("Bem-vindo à calculadora de funções quadráticas!");
//        System.out.println("Favor entre com os valores de a, b e c:");
//// Captura dos dados de entrada
//        Scanner teclado = new Scanner(System.in);
//        double a = teclado.nextDouble();
//        double b = teclado.nextDouble();
//        double c = teclado.nextDouble();
////Instanciação de um objeto FuncaoQuadratica
//        FuncaoQuadratica objFunc = new FuncaoQuadratica(a, b, c);
//        System.out.printf("\nO objeto função criado é %s", objFunc.Descricao());
////Agora que o objeto foi criado, vamos chamar seus métodos
//        System.out.printf("\nO X do vértice vale %f e o Y do vértice vale %f", objFunc.XVertice(), objFunc.YVertice());
//        System.out.printf("\nAs raízes da função valem %f e %f", objFunc.Raiz1(), objFunc.Raiz2());
//        System.out.printf("\nA concavidade da função é %s", objFunc.Concavidade());
// 5-----------------------------------------------------------------------------------------------------------
        // vetores criados simplesmente para testar a classe
        double[] chuva = { 5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
        double[] pressao = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };
        ClimaTempo ct = new ClimaTempo();
        ct.SetPluviosidade(chuva);
        ct.SetPressao(pressao);
// deve resultar 5.35
        System.out.printf("\nMáxima pluvial: \n" + ct.CalcularMaximaPluvial());
// deve resultar ~ 1.904
        System.out.printf("\nMédia pluvial: \n" + ct.CalcularMediaPluvial());
// deve resultar 95.34
        System.out.printf("\nPressão mínima: \n" + ct.CalcularPressaoMinima());


    }
}