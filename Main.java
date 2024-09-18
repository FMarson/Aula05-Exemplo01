public class Main {
    public static void main(String[] args) {
    
    //declaração
    Personagem p1, p2, p3;

    //alocação
    p1 = new Personagem("Personagem 1", 10); 
    p2 = new Personagem("Personagem 2", 5);
    p3 = new Personagem("Personagem 3", 2);


    Mago m1;
    m1 = new Mago("Mago", 7);
    

    m1.atacar(p1, 1);

    //p1.atacar(p3, 1);
    //p3.defender(p1.atacar(3)); //5

    p1.imprimirEstatisticas();
    p2.imprimirEstatisticas();
    p3.imprimirEstatisticas();
    }
}