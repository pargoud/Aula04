import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		
		int idade;
		double media=0;
		int quantidadeAlunos = 0;
		int totalAlunos;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe a quantidade de alunos");
		totalAlunos = leitor.nextInt();
		
		while (quantidadeAlunos < totalAlunos) {
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + "º aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos++;
		}
		
		
		media = media/(double) totalAlunos;
		
		System.out.println("A média das idades é " + media);
		
		leitor.close();

	}

}
