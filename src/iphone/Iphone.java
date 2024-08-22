package iphone;

import java.util.Scanner;

import iphone.aplicativos.AparelhoTelefonico;
import iphone.aplicativos.NavegadorInternet;
import iphone.aplicativos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementando os métodos do Reprodutor Musical
    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    // Implementando os métodos do Aparelho Telefonico 
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }
    
    // Implementando os métodos do Navegador de Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public void inicio() {
        Scanner scan = new Scanner(System.in);

        boolean escolhaCerta = false;

        while (!escolhaCerta) {
            System.out.println("\nEscolha uma funcionalidade:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Sair");

            int escolha = scan.nextInt();

            if (escolha == 1) {
                menuReprodutorMusical();
                escolhaCerta = true;
            } else if (escolha == 2) {
                menuAparelhoTelefonico();
                escolhaCerta = true;
            } else if (escolha == 3) {
                menuNavegadorInternet();
                escolhaCerta = true;
            } else if (escolha == 4) {

                break;
            } else {
                System.out.println("Escolha inválida, tente novamente.");
            }
        }

        scan.close();
    }

    public void menuReprodutorMusical() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma ação:");
        System.out.println("1. Tocar");
        System.out.println("2. Pausar");
        System.out.println("3. Selecionar Música");

        int escolha = scan.nextInt();
        scan.nextLine();

        if (escolha == 1) {
            tocar();
        } else if (escolha == 2) {
            pausar();
        } else if (escolha == 3) {
            System.out.println("Digite o nome da música:");
            String musica = scan.nextLine();
            selecionarMusica(musica);
        } else {
            System.out.println("Escolha inválida.");
        }

        scan.close();
    }

    public void menuAparelhoTelefonico() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEscolha uma ação:");
        System.out.println("1. Ligar");
        System.out.println("2. Atender");
        System.out.println("3. Iniciar Correio de Voz");

        int escolha = scan.nextInt();
        scan.nextLine();

        if (escolha == 1) {
            System.out.println("Digite o número para ligar: ");
            String numero = scan.nextLine();
            ligar(numero);
        } else if (escolha == 2) {
            atender();
        } else if (escolha == 3) {
            iniciarCorreioVoz();
        } else {
            System.out.println("Escolha inválida.");
        }

        scan.close();
    }

    public void menuNavegadorInternet() {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\nEscolha uma ação:");
        System.out.println("1. Exibir Página");
        System.out.println("2. Adicionar Nova Aba");
        System.out.println("3. Atualizar Página");
    
        int escolha = scan.nextInt();
        scan.nextLine();
    
        if (escolha == 1) {
            System.out.println("Digite o URL da página: ");
            String url = scan.nextLine();
            exibirPagina(url);
        } else if (escolha == 2) {
            adicionarNovaAba();
        } else if (escolha == 3) {
            atualizarPagina();
        } else {
            System.out.println("Escolha inválida.");
        }
    
        scan.close();
    }
    

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        meuIphone.inicio();
    }
}
