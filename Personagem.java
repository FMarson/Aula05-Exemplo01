public class Personagem {
    private String nome;
    private int hp;
    private int resistencia;

    public Personagem(String nome, int resistencia){
        setNome(nome);
        setHp(100);
        setResistencia(resistencia);
    }

    public void imprimirEstatisticas(){
        System.out.println("Nome: " + getNome());
        System.out.println("HP: " + getHp());
        System.out.println("Resistência: " + getResistencia());
    }

    public int getResistencia(){
        return resistencia;
    }

    public void setResistencia(int resistencia){
        this.resistencia = resistencia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        if(hp >= 0 && hp <= 100)
            this.hp = hp;
    }

    private void sofrerDano(int dano){
        if (dano > 0) 
            if(getHp() - dano >= 0)
                setHp(getHp() - dano);
            else 
                setHp(0);
    }

    public int atacar(int tipoAtaque){
        switch (tipoAtaque) {
            case 1 : //normal
                return 5;

            case 2: //especial
                return 15;

            case 3: // ataque em área
                return 30;

            default:
                return 0;
        }
    }

    public void atacar(Personagem pAtacado, int tipoAtaque){
        pAtacado.defender(atacar(1));
    }

    public void defender(int dano){
        sofrerDano(dano - getResistencia());
    }
}
