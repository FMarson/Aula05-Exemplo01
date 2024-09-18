public class Mago extends Personagem{
    private String magia;

    public Mago(String nome, int resistencia){ //construtor do Mago
        super(nome, resistencia); //chamada do construtor da classe Personagem
    }
    
    public Mago(String nome, String magia, int resistencia){
        super(nome, resistencia); //chamada do construtor da classe Personagem
        this.magia = magia;
    }

    @Override //redefinindo o atacar
    public int atacar(int tipoAtaque){
        switch (tipoAtaque) {
            case 1 : //normal
                return 15;

            case 2: //especial
                return (int) (15*1.2);

            case 3: // ataque em área
                return (int) (30 * 1.1);

            default:
                return 0;
        }
    }
}