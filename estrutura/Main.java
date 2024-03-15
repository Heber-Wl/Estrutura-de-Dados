
public class Main {
    public static void main(String[] args) {

        Vetor lista = new Vetor();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a6 = new Aluno();

        a1.setNome("Héber");
        a2.setNome("Wilton");
        a3.setNome("Rebeca");
    

        System.out.println(lista.Adiciona(a1)); // 1° Questão
        System.out.println(lista);
        System.out.println(" ");
        System.out.println(lista.adicionaPosicao(1,a2));// 2° Questão
        System.out.println(lista);
        System.out.println(" ");
        System.out.println(lista.Alunopega(0)); // 3° Qustão
        System.out.println(lista);
        System.out.println(" ");
        System.out.println(lista.remove(0)); //4° Questão
        System.out.println(lista);
        System.out.println(" ");
        System.out.println(lista.contem(a6)); // 5° Questão
        System.out.println(lista.tamanho()); // 6° Questão



    }
}