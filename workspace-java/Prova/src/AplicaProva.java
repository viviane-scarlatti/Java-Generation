import java.util.Scanner;
public class AplicaProva {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		String respostaUser;
		int    acertos = 0;
		QuestaoSimples simulado[] = new QuestaoSimples[5];
		
		simulado[0] = new QuestaoSimples("Quem descobriu o Brasil?", "PA Cabaral");
		simulado[1] = new QuestaoMultiplaEscolha("Qual a formula da água?", "H20", "chuva","H20", "H202", "H2SO4");
		simulado[2] = new QuestaoSimples("Qual a cor do cavalo branco do Napoleao?", "Marrom");
		simulado[3] = new QuestaoMultiplaEscolha("Quanto é 1+1?", "2","2", "4","6","8");
		simulado[4] = new QuestaoComDica("Enunciado","Resposta","Dica: aqui tem uma dica");
		
		for (int i=0;i<simulado.length;i++) {
			System.out.println(simulado[i].aplicarQuestao());
			respostaUser = teclado.nextLine();
			if (simulado[i].corrigir(respostaUser)) {
				acertos++;
			}
		}
		System.out.println("Você teve "+acertos+" acertos");
	}
}
