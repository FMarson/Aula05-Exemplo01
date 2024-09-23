public class Feiticeiro extends Mago {
    public Feiticeiro(String nome, int resistencia){ //construtor do Mago
        super(nome, resistencia); //chamada do construtor da classe Personagem
    }
    
    public Feiticeiro(String nome, String magia, int resistencia){
        super(nome, resistencia); //chamada do construtor da classe Personagem
        this.setMagia(magia);
        System.out.println("Magia: " + this.getMagia());
    }
}
