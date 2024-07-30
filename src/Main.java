import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Mundo mundo = new Mundo();
    Africa africa = new Africa();
    AmericaDoNorte americaDoNorte = new AmericaDoNorte();
    AmericaDoSul americaDoSul = new AmericaDoSul();
    Asia asia = new Asia();
    Europa europa = new Europa();
    Oceania oceania = new Oceania();
    Scanner input = new Scanner(System.in);
    ArrayList<String> paises = new ArrayList<>();
    ArrayList<String> capitais = new ArrayList<>();
    int modoEscolha;
    String modo = null;
    int index = 137;
    System.out.println(mundo.paises.get(index));
    System.out.println(mundo.capitais.get(index));
    do {
        System.out.println("Escolha o modo de jogo (digite apenas números):");
        System.out.println("1. Modo Mundo");
        System.out.println("2. Modo por Continente");
        modoEscolha = Integer.parseInt(input.next());
        switch (modoEscolha) {
            case 1:
                paises = mundo.paises;
                capitais = mundo.capitais;
                modo = "mundo";
                System.out.println("Você escolheu o modo mundo.");
                break;
            case 2:
                System.out.println("Escolha o continente:");
                modo = "continente";
                break;
            default:
                System.out.println("Escolha uma das opções válidas.");
        }
    } while(!Objects.equals(modo, "mundo") && !Objects.equals(modo, "continente"));
    }
}