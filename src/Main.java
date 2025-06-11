import ArvoreB.ArvoreB;

public class Main {
    public static void main(String[] args) {
        ArvoreB arv = new ArvoreB();

        for (int i = 1; i <= 10000; i++)
            arv.inserir(i, i);

        for (int i = 6; i <= 9995; i++)
            arv.exclusao(i);

        arv.in_ordem();
    }
}