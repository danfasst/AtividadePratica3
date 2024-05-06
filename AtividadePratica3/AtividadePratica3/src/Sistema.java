public class Sistema {

    private static int Menu() {

        System.out.println("\n----- System Tech ----");
        System.out.println("1) Adicionar Funcionario");
        System.out.println("2) Remover Funcionario por Matricula");
        System.out.println("3) Listar Todos os Funcionarios");
        System.out.println("4) Buscar Funcionarios por Matricula");
        System.out.println("5) Remover Todos os Funcionarios");
        System.out.println("6) Como está o trabalho do Funcionario");
        System.out.println("7) Relatar progresso do Funcionario");
        System.out.println("0) Sair");
        System.out.print("Escolha a opção: ");
        return Console.lerInt();

    }

    private static void options(int op) {

        switch (op) {
            case 1:
                addFuncionario();
                break;
            case 2:
                removeFuncionario();
                break;
            case 3:
                listAllFuncionarios();
                break;
            case 4:
                buscarFuncionario();
                break;
            case 5:
                removeAllFuncionarios();
                break;
            case 6: 
                mostrarTrabalho();
                break;
            case 7:
                relatarProgresso();
                break;
            case 0: 
                System.out.println("\nPrograma encerrado!\n");
                break;
            default:
                System.out.println("\nNumero incorreto escreva outro!");
                break;
        }

    }

    private static void addFuncionario() {

        System.out.println("\n---Escolha o tipo de funcionario--");
        System.out.println("1) Desenvolvedor");
        System.out.println("2) Gerente");
        System.out.println("3) Estagiario");
        System.out.print("Selecione a opção: ");
        int op = Console.lerInt();

        if(op < 1 || op > 3) {
            System.out.println("\nOpção incorreta!");
            return;
        }

        tipoFuncionario(op);
        System.out.println("\nFuncionario cadastrado!");

    }

    private static void tipoFuncionario(int op) {

        System.out.print("\nColoque o nome: ");
        String nome = Console.lerString();
        System.out.print("Coloque o numero de matricula: ");
        String matricula = Console.lerString();
        System.out.print("Coloque o salario: ");
        float salario = Console.lerFloat();
        
        switch (op) {
            case 1:
                System.out.print("Coloque as tecnologias que domina: ");
                String tecnoDomina = Console.lerString();

                Funcionario desenvolvedor = new Desenvolvedor(nome, matricula, salario, tecnoDomina);
                ListaFuncionarios.addLista(desenvolvedor);
                break;
            case 2:
                System.out.print("Coloque o bonus anual: ");
                float bonusAnual = Console.lerFloat();
                System.out.print("Coloque o nome da equipe que esta gerenciando: ");
                String equipeSobGerencia = Console.lerString();

                Funcionario gerente = new Gerente(nome, matricula, salario, bonusAnual, equipeSobGerencia);
                ListaFuncionarios.addLista(gerente);
                break;
            case 3:
                System.out.print("Coloque o total de horas trabalhadas: ");
                int horasTrabalho = Console.lerInt();
                System.out.print("Coloque o nome do seu supervisor: ");
                String supervisor = Console.lerString();

                Funcionario estagiario = new Estagiario(nome, matricula, salario, horasTrabalho, supervisor);
                ListaFuncionarios.addLista(estagiario);
                break;
            default:
                break;
        }

    }

    private static void removeFuncionario() {

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nLista de Funcionarios está vazia para buscar por Matricula!");
            return;
        }

        System.out.println("\n--Remover por Matricula--");
        System.out.print("Insira a matricula do Funcionario: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionario nao encontrado!");
            return;
        }

        ListaFuncionarios.removeLista(funcionario);
        System.out.println("\nFuncionario removido com sucesso!");

    }

    private static void listAllFuncionarios() {

        System.out.println("\n-- Lista --");

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nLista de Funcionarios está vazia!");
            return;
        }

        ListaFuncionarios.listarLista();

    }

    private static void buscarFuncionario() {

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nLista de Funcionarios está vazia para buscar por Matricula!");
            return;
        }
        
        System.out.println("\n--Busca por Matricula--");
        System.out.print("Insira a matricula do Funcionario: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionario nao encontrado!");
            return;
        }

        System.out.println(funcionario.toString());

    }

    private static void removeAllFuncionarios() {
        
        System.out.println("\n--Excluir todos da lista--");

        if (ListaFuncionarios.getLista().isEmpty()) {

            System.out.println("\nNão há pessoas cadastradas para excluir");
            return;
        }

        ListaFuncionarios.getLista().clear();

        System.out.println("\nTodos foram excluidos da lista!");

    }

    private static void mostrarTrabalho() {
        
        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nLista de Funcionarios está vazia para mostrar trabalhos!");
            return;
        }
        
        System.out.println("\n--Mostrar Trabalho--\n");

        for (Funcionario funcionario : ListaFuncionarios.getLista()) {
            System.out.println("Matricula: " + funcionario.getMatricula() + " | " + funcionario.getNome());
        }

        System.out.print("\nInsira a matricula do Funcionario: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionario nao encontrado!");
            return;
        }

        System.out.println(funcionario.trabalhar());
        
    }

    private static void relatarProgresso() {

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nLista de Funcionarios está vazia para relatar progressos!");
            return;
        }
        
        System.out.println("\n--Mostrar Progresso--\n");

        for (Funcionario funcionario : ListaFuncionarios.getLista()) {
            System.out.println("Matricula: " + funcionario.getMatricula() + " | " + funcionario.getNome());
        }

        System.out.print("\nInsira a matricula do Funcionario: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionario nao encontrado!");
            return;
        }

        System.out.println(funcionario.relatarProgresso());

    }

    public static void executar() {
        int op;
        do {
            op = Menu();
            options(op);
        } while (op != 0);

    }

}
