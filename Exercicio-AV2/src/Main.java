import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];

        for(int i = 0; i < nomes.length;i++){
            System.out.println("Digite o nome  " + (i + 1) + " : ");
            nomes[i] = scanner.nextLine();
        }
        String maiorNome = nomes[0];

        for(int i = 1; i < nomes.length; i++){
            if(nomes[i].length() > maiorNome.length()){
                maiorNome = nomes[i];
            }
        }

        System.out.println("O nome com mais caracteres é : " + maiorNome);
    }
}