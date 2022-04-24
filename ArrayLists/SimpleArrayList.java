package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {

	static Scanner scanner(Scanner scan) {
		Scanner scanner = scan;
		return scanner;
	}

	static String typeText(String text) {
		System.out.println(text);
		return scanner(new Scanner(System.in)).nextLine();
	}

	static void showText(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();

		showText("Digite o nome de três pessoas: ");
		for (int i = 0; i < 3; i++) {
			nomes.add(typeText("O nome da " + (i + 1) + "ª pessoa: "));
			while (true) {
				if (nomes.get(i).length() > 30) {
					showText("O nome excede ao tamanho máximo permitido.");
					nomes.set(i, typeText("Digite novamente: "));
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < nomes.size(); i++) {
			showText((i + 1) + "º nome: " + nomes.get(i));
		}
	}
}
