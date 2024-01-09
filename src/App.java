import java.util.Scanner; //importacao da biblioteca Scanner para leitura e saida de dados

// Definicao da classe principal do sistema
public class App {
    int tentativas = 2; //declaracao da variavel tentativa tipo int, com inicializacao do valor 2.
    String nomeUsuario, senhaUsuario; //declaracao de duas variaveis tipo String
    //Declaracao de objectos das classes livro, aluno e usuario
    Livro livro = new Livro(); 
    Aluno aluno = new Aluno();
    Usuario user = new Usuario();

    //Construcao do metodo menuDevolverLivro tipo void, sem retorno
    public void menuDevolverLivro() {
        Scanner entrada = new Scanner(System.in); //Declaracao do objecto da classe Scanner
        System.out.println("Digite o ISBN do Livro: "); //Exibe um texto na tela
        String isbn = entrada.nextLine(); //Declaracao de variavel isbn e espera receber um dado na entrada
        //Definicao da estrutura de compracao if-onde compara o codigo do livro na entrada e do sistema
        if (isbn.equals(livro.getISBN())) {
            System.out.println("Livro devolvido com sucesso\n");
            System.out.println("Deseja realizar mais operacao?\n1-Sim\n2-Nao");
            int opcao = entrada.nextInt();
            //Definicao da estrutura de decisao
            switch (opcao) {
                case 1:
                    login(); //chamada do metodo login
                    break; //loop ou salto
                case 2:
                    System.exit(0); //termina o programa
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\nLivro nao devolvido"); //exibe o texto "Livro nao devolvido" na tela
            System.out.println("\nDeseja realizar mais operacao?\n1-Sim\n2-Nao");
            int opcao = entrada.nextInt(); //Leitura de um dado tipo inteiro
            switch (opcao) {
                case 1:
                    login();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        entrada.close();
    }

    //definicao do metodo pesquisarLivro tipo void
    public void pesquisarLivro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite o isbn do livro: ");
        String isbn = entrada.nextLine();
        if (isbn.equals(livro.getISBN())) {
            System.out.println("Livro encontrado");
            System.out.println("************************************");
            System.out.println("        1- Emprestar                ");
            System.out.println("        2- Voltar                   ");
            System.out.println("        3- Sair                     ");
            System.out.println("************************************");
            System.out.println("Escolhe uma opcao: ");
            int opcao = entrada.nextInt();

            switch (opcao) { //estrutura de decisao
                case 1:
                    System.out.println("Emprestimo realizado com sucesso \n");
                    System.out.println("Nome: " + aluno.getNome() + ", Turma: " + aluno.getTurma() + ", Classe: "
                            + aluno.getClasse());
                    System.out.println(
                            "Titulo do livro: " + livro.getTitulo() + " e autor do livro: " + livro.getAutor());
                    break;
                case 2:
                    this.menuPrincipal();
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente");
                    this.menuEmprestarLivro();
                    break;
            }
        } else {
            System.out.println("Livro nao encontrado!");
            System.out.println("Tente novamente\n");
            this.pesquisarLivro(); //chamada do metodo pesquisarLivro definido acima
        }
        System.out.println("\nDeseja realizar mais operacao?\n1-Sim\n2-Nao");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                login();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                break;
        }
        entrada.close();
    }

    public void pesquisarAluno() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String n = entrada.nextLine(); //declaracao da variavel n tipo String, onde recebe um dado atraves do objecto da classe Scanner
        if (n.equals(aluno.getNome())) {
            System.out.println("Aluno encontrado");
            System.out.println("Nome: " + aluno.getNome()); //Buscando um dado pela instancia do objecto da classe aluno, para ser exibido na tela
            System.out.println("Turma: " + aluno.getTurma());
            System.out.println("Classe: " + aluno.getClasse());
            System.out.println("Periodo: " + aluno.getPeriodo());
            pesquisarLivro();

        } else {
            System.out.println("Aluno nao encontrado!");
            System.out.println("Tente novamente\n");
            this.pesquisarAluno();

        }
        entrada.close();
    }

    public void menuEmprestarLivro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("        1- Pesquisar Aluno          ");
        System.out.println("        2- Voltar                   ");
        System.out.println("        3- Sair                     ");
        System.out.println("************************************");
        System.out.println("Escolhe uma opcao: ");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                pesquisarAluno();
                break;
            case 2:
                this.menuPrincipal(); //Chamada do metodo menuPrincipal
                break;
            case 3:
                System.exit(0); //fecha o sistema
                break;

            default:
                System.out.println("Opcao invalida, tente novamente");
                this.menuEmprestarLivro();
                break;
        }
        entrada.close();
    }

    public void menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("*            Bem Vindo             *");
        System.out.println("*          Tela Principal          *");
        System.out.println("************************************");
        System.out.println("        1- Emprestar Livro          ");
        System.out.println("        2- Devolver Livro           ");
        System.out.println("        3- Sair                     ");
        System.out.println("************************************");
        System.out.println("Escolhe uma opcao: ");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuEmprestarLivro();
                break;
            case 2:
                menuDevolverLivro();
                break;
            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("Opcao invalida, tente novamente");
                this.menuPrincipal();
                break;
        }
        entrada.close();
    }

    public void login() {
        System.out.println("***************************************************");
        System.out.println("*                                                 *");
        System.out.println("*          SISTEMA DE GESTAO BIBLIOTECARIO        *");
        System.out.println("*                   Bem Vindo                     *");
        System.out.println("*                   TELA LOGIN                    *");
        System.out.println("*                                                 *");
        System.out.println("***************************************************");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome de usuario: "); //exibe texto na tela
        this.nomeUsuario = entrada.nextLine(); //espera receber um dado pelo teclado
        System.out.println("Digite a senha do usuario: ");
        this.senhaUsuario = entrada.nextLine();
        // entrada.close();
        if (nomeUsuario.equals(user.nome) && senhaUsuario.equals(user.senha)) { //estrutura de comparacao dos dados de login, 
            //caso for verdadeiro exibe o menu principal do sistema, caso for falso, o usuario tem outra tentativa de login.
            menuPrincipal();
        } else {
            while (tentativas > 0) { //definicao de estrutura repitacao enquanto o usuario ainda tiver tentativas no acto de login
                System.out.println("\nUsuario ou senha errado!\nTente novamente\nTentantivas: " + tentativas + " \n");
                tentativas--;
                this.login(); //reuso do mesmo metodo
            }
        }
        entrada.close(); //fecha o objecto da classe Scanner
    }

    public static void main(String[] args) { //metodo principal para a execucao do sistema
        App a = new App(); //instancia do objecto da classe principal do sistema
        a.login(); //chamada ao metodo login da classe principal.
    }
}//fim da classe principal
