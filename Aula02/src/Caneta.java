public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    public void status(){
        System.out.println("mdoelo: "+this.modelo);
        System.out.println("cor: "+this.cor);
        System.out.println("ponta: "+this.ponta);
        System.out.println("esta tampada: "+this.tampada);
        System.out.println("carga: "+this.carga);
    }
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Escreva");
        }
        System.out.println("Sua caneta esta tampada");
    }
}
