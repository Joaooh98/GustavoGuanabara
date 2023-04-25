public class Aula02 {
    public static void main(String[] args) throws Exception {
       Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 80;
        c1.modelo = "BIC";
        
        System.out.println("\nValor inicial\n");
        c1.status();
        c1.tampar();
        System.out.println("\nAlterando c1.tampar(); \n");
        c1.status();
        c1.destampar();
        System.out.println("\nAlterando c1.destampar(); \n");
        c1.status();
    }
}
