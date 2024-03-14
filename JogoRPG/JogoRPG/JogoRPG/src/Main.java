
import personagens.*;
import inimigos.*;
import itens.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        final Random rand = new Random();

        try {
            JettGoblin jett = new JettGoblin();
            JohnPork john = new JohnPork();

            System.out.println("""
                                                        BEM VINDO AO JOGO RPG GENÉRICO
                               ===================================================================================
                               •Nesse jogo existem dois personagens jogáveis, sendo eles:             
                               """);
            System.out.println(jett.getNome());
            System.out.println("-----------");
            System.out.println("Idade: " + jett.getIdade());
            System.out.println("Vida: " + jett.getVida());
            System.out.println("História: ");
            jett.contarHistoria();

            System.out.println("\n" + john.getNome());
            System.out.println("-----------");
            System.out.println("Idade: " + john.getIdade());
            System.out.println("Vida: " + john.getVida());
            System.out.println("História: ");
            john.contarHistoria();
            System.out.println("===================================================================================");

            System.out.println("•Apresentados os personagens, com qual você gostaria de jogar?");
            System.out.println("1 - Jett Goblin");
            System.out.println("2 - John Pork");
            System.out.println("Digite o valor da ação desejada: ");


            Boneco jogador = ClasseAux.menuBoneco();


            System.out.println("===================================================================================");
            System.out.println("•Sua jornada começa aqui:");
            System.out.println("Devida às perseguições exercidas pela sociedade, "+jogador.getNome()+" foi fugindo e se\n" +
                    "isolando cada vez mais, ao ponto de habitar a cidade de Nova Iorque, não a\n" +
                    "megalópole mundialmente relevante, mas sim a antagônica maranhense. Portanto,\n" +
                    "ele foi se tornando cada vez mais amargurado, solitário e sedento por vingança.\n");

            System.out.println("""
                               Para começar o seu plano de vingança, ele saiu de seu abrigo para encontrar itens para sua
                               jornada. Ao sair ele se depara com um beco onde em um canto ele encontra uma Vandal RGX(Um
                               fuzil de assalto) e um Huawei P50(Celular de última geração), porém, ele apenas possui um
                               espaço para o item principal.""");

            System.out.println("\n•Qual ele deve escolher: ");
            System.out.println("1 - Vandal RGX");
            System.out.println("2 - Huawei P50");
            System.out.println("Digite o valor da ação desejada: ");


            Item vandal = new VandalRGX();
            Item huawei = new HuaweiP50();
            ClasseAux.menuItem(jogador, vandal, huawei);


            System.out.println("""
                               \nLogo após adquirir o seu item principal, ele percebe a necessidade de encontrar mais itens, 
                               saindo do beco ele deu de cara com um hospital e ao lado há um aglomerado de lixo hospi-
                               talar. Ao chegar lá, ele pega uma bolsa de sangue O- e vê uma tampa de lixo e um meio frasco
                               de trembolona, porém, ele apenas pode escolher um desses dois itens.
                               """);


            BolsaSangue bolsaSangue = new BolsaSangue();
            jogador.adicionarItem(bolsaSangue);


            System.out.println("•Qual ele deve escolher: ");
            System.out.println("1 - Tampa de Lixo");
            System.out.println("2 - Trembolona");
            System.out.println("Digite o valor da ação desejada: ");


            Item tampa = new TampaLixo();
            Item trembolona = new Trembolona();
            ClasseAux.menuItem(jogador, tampa, trembolona);


            System.out.println("Após se equipar " + jogador.getNome() + "se sente preparado para concluir o seu objetivo");
            System.out.println("===================================================================================");

            System.out.println("""
                               Ao sair da região dos hospital, ele tromba com um agente do FBI que monitorava movimentações
                               suspeitas na área. Ao ser questionado, nosso personagem inicia uma batalha contra o agente...""");


            AgenteFBI agente = new AgenteFBI();
            int chanceAtaqueDefault = jogador.getChanceAtaque();
            int chanceDefesaDefault = jogador.getChanceDefesa();
            int chanceDefesaInimigoDefault = agente.getChanceDefesa();
            while (jogador.getVida() > 0 && agente.getVida() > 0) {
                ClasseAux.menuBatalha(jogador, agente, bolsaSangue);
                jogador.setChanceAtaque(chanceAtaqueDefault);
                agente.setChanceDefesa(chanceDefesaInimigoDefault);

                if(agente.getVida() > 0) {
                    int numRand = rand.nextInt(100);
                    System.out.println("\nTurno do inimigo: ");
                    if (numRand < 70) {
                        System.out.println("Agente do FBI escolheu atacar");
                        agente.atacar(jogador);
                    } else {
                        System.out.println("Agente do FBI escolhe se defender");
                        agente.defender();
                    }
                }
                jogador.setChanceDefesa(chanceDefesaDefault);
            }

            if (jogador.getVida() > 0) {
                System.out.println(jogador.getNome() + " derrotou o " + agente.getNome());
            } else {
                System.out.println("""
                        FBI: O personagem não sobreviveu à resistência dos agentes
                        competentes Nova Iorquinos e acabou por tombar em combate. Fazendo com que
                        sua vida chegasse a 0.""");
            }
            System.out.println("===================================================================================");

            System.out.println("""
                               Após a derrota do agente. De forma quase instantânea o chefe do FBI de Nova Iorque
                               maranhense,vulgo Blue pen, aparece na frente do nosso personagem. Esta batalha é 
                               inevitável...""");

            ManuelGomes manuel = new ManuelGomes();
            chanceAtaqueDefault = jogador.getChanceAtaque();
            chanceDefesaDefault = jogador.getChanceDefesa();
            chanceDefesaInimigoDefault = agente.getChanceDefesa();
            while (jogador.getVida() > 0 && manuel.getVida() > 0) {
                ClasseAux.menuBatalha(jogador, manuel, bolsaSangue);
                jogador.setChanceAtaque(chanceAtaqueDefault);
                manuel.setChanceDefesa(chanceDefesaInimigoDefault);

                if(manuel.getVida() > 0) {
                    int numRand = rand.nextInt(100);
                    System.out.println("\nTurno do inimigo: ");
                    if (numRand < 70) {
                        System.out.println("Manuel escolheu atacar!");
                        manuel.atacar(jogador);
                    } else if (numRand < 90) {
                        chanceDefesaInimigoDefault = manuel.getChanceDefesa();
                        System.out.println("Manuel escolhe se defender");
                        manuel.defender();
                    } else {
                        System.out.println("Manuel usa o seu poder especial!");
                        manuel.poderEspecial(jogador);
                    }
                }
                jogador.setChanceDefesa(chanceDefesaDefault);
            }

            if (jogador.getVida() > 0) {
                System.out.println(jogador.getNome() + " derrotou o " + manuel.getNome());
            } else {
                System.out.println("""
                        FBI: O personagem não sobreviveu à resistência dos agentes
                        competentes Nova Iorquinos e acabou por tombar em combate. Fazendo com que
                        sua vida chegasse a 0.""");
            }
            System.out.println("===================================================================================");

            System.out.println("""
                               Com muito esforço nosso personagem vence o poderoso Caneta Azul, nada pode o deter! Ou
                               será que sim? Saindo de sua toca nosso personagem a vista outra criatura que habita a 
                               região. Esta criatura tem os seus mesmos objetivos fazendo deles arqui-inimigos. Apenas
                               pode existir um exterminador da humanidade. Ambos entram em confronto...""");


            PersonagemVilao persoVilao = new PersonagemVilao();
            persoVilao.converterPersonagem(jogador);
            chanceAtaqueDefault = jogador.getChanceAtaque();
            chanceDefesaDefault = jogador.getChanceDefesa();
            chanceDefesaInimigoDefault = agente.getChanceDefesa();
            while (jogador.getVida() > 0 && persoVilao.getVida() > 0) {
                ClasseAux.menuBatalha(jogador, manuel, bolsaSangue);
                jogador.setChanceAtaque(chanceAtaqueDefault);
                manuel.setChanceDefesa(chanceDefesaInimigoDefault);

                if(persoVilao.getVida() > 0) {
                    int numRand = rand.nextInt(100);
                    System.out.println("\nTurno do inimigo: ");
                    if (numRand < 70) {
                        System.out.println(persoVilao.getNome() + " escolheu atacar");
                        persoVilao.atacar(jogador);
                    } else {
                        chanceDefesaInimigoDefault = agente.getChanceDefesa();
                        persoVilao.defender();
                    }
                }
                jogador.setChanceDefesa(chanceDefesaDefault);
            }

            if (jogador.getVida() > 0) {
                System.out.println(jogador.getNome() + " derrotou o " + persoVilao.getNome());
            } else {
                System.out.println("""
                        O nosso personagem derrotou as suas maiores ameaças existentes no planeta terra.
                        Sendo assim, o seu plano de aniquilação humana poderá ter seu começo e
                        ninguém poderá impedi-lo!""");
            }
            System.out.println("===================================================================================");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}