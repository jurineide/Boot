public class BootChat {
    public static void main(String[] args) {
        char opcao=7;

        switch (opcao){
            case 1:{
                System.out.println("chame um programa de inclusão");
                break;
            }
            case 2:{
                System.out.println("chame um programa de alteração");
                break;
            }
            case 3:{
                System.out.println("chame um programa de exclusão");
                break;
            }
            case 4:{
                System.out.println("chame um programa de consulta");
                break;
            }
            default:
                System.out.println("opção invalida");

        }
    }
}
