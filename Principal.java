import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3 -Apagar\n4-Listar\n0-Sair";
        int op = 0;
        do{
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch(op){
                    case 1:
                        String nome = JOptionPane.showInputDialog("Digite o Nome:");
                        String fone = JOptionPane.showInputDialog("Digite o Fone:");
                        String email = JOptionPane.showInputDialog("Digite o Email:");
                        Pessoa p = new Pessoa(nome, fone, email);
                        p.inserir();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 0:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Falhou!");
                System.out.println(e.getMessage());
            }
        } while (op != 0);
    }
}