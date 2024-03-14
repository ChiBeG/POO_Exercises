package personagens;
import itens.*;

import java.util.ArrayList;

    public abstract class Boneco implements Personagem {
        protected String nome;
        protected int idade;
        protected int vida;
        protected int chanceDefesa;
        protected int chanceAtaque;
        protected int danoAtaque;
        protected ArrayList<Item> inventario = new ArrayList<>();

        public void setNome(String nome) {
            if(nome.trim().equals("")) {
                throw new IllegalArgumentException("Nome não pode ser vazio");
            } else {
                this.nome = nome;
            }
        }

        public void setIdade(int idade) {
            if(idade > 0) {
                this.idade = idade;
            } else {
                 throw new IllegalArgumentException("Idade não pode ser menor que 0!");
            }
        }

        public void setVida(int vida) {
            if(vida > 0) {
                this.vida = vida;
            } else {
                this.vida = 0;
            }
        }

        public void setChanceDefesa(int chanceDefesa) {
            if(chanceDefesa >= 0 && chanceDefesa <= 100) {
                this.chanceDefesa = chanceDefesa;
            } else {
                throw new IllegalArgumentException("Chance de defesa não pode ser abaixo de 0 e acima de 100");
            }
        }

        public void setChanceAtaque(int chanceAtaque) {
            if(chanceAtaque >= 0 &&  chanceAtaque <= 100) {
                this.chanceAtaque = chanceAtaque;
            } else {
                throw new IllegalArgumentException("Chance de ataque não pode ser abaixo de 0 e acima de 100");
            }
        }

        public void setDanoAtaque(int danoAtaque) {
            if(danoAtaque >= 0) {
                this.danoAtaque = danoAtaque;
            } else {
                throw new IllegalArgumentException("Dano de ataque não pode ser abaixo de 0");
            }
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public int getVida() {
            return vida;
        }

        public int getChanceDefesa() {
            return chanceDefesa;
        }

        public int getChanceAtaque() {
            return chanceAtaque;
        }

        public int getDanoAtaque() {
            return danoAtaque;
        }
    }
