import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {

        List<Integer> anos = new ArrayList<>(Arrays.asList(2011,2012,2013,2014,2015,2016,2017,2018,2019));
        List<Integer> dias = new ArrayList<>();
        for(int i = 0 ; i < 30 ; i++){
            dias.add(i);
        }
        List<Integer> meses = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        List<String> nomes = new ArrayList<>(Arrays.asList("Abílio","Adelino","Adolfo","Adriano","Afonso","Albano","Alberto","Alexandre","Alfredo","Álvaro","Américo","André","Ângelo","Aníbal","António","Armando","Armando","Artur","Augusto","Belmiro","Benjamim","Bernardo","Bruno","Caetano","Camilo","Cândido","Carlos","César","Cláudio","Cristiano","Cristóvão","Daniel","David","Delfim","Dinis","Diogo","Domingos","Duarte","Edgar","Edmundo","Eduardo","Elias","Emanuel","Emílio","Eusébio","Fábio","Fabrício","Fernando","Filipe","Flávio","Francisco","Frederico","Gabriel","Gaspar","Gil","Gilberto","Gonçalo","Gregório","Guilherme","Gustavo","Heitor","Hélder","Hélio","Henrique","Hilário","Hildebrando","Horácio","Hugo","Humberto","Igor","Inácio","Ismael","Ivan","Ivo","Jacinto","Jaime","João","Joaquim","Joel","Jorge","José","Julio","Leandro","Leonardo","Leopoldo","Lino","Lourenço","Lucas","Luciano","Lúcio","Luís","Manuel","Marcelo","Márcio","Marco","Marcos","Maria","Mário","Martim (ou Martin)","Mateus, Matias","Maurício","Mauro","Miguel","Napoleão","Nelson","Nicolau","Norberto","Nuno","Olavo","Omar","Orlando","Óscar","Osvaldo","Otávio","Patrício","Patrício","Paulino","Paulo","Pedro","Rafael","Raimundo","Ramiro","Raul","Renato","Ricardo","Roberto","Rodolfo","Rodrigo","Rogério","Romeu","Ronaldo","Ruben","Rui","Salomão","Salvador","Samuel","Sandro","Santiago","Sebastião","Sérgio","Silvano","Silvino","Sílvio","Simão","Telmo","Teodoro","Tiago","Tomás","Tomé","Valdemar","Valentim","Valentino","Valter","Vasco","Vicente","Vítor","Vitorino","William","Xavier"));
        List<String> apelidos = new ArrayList<>(Arrays.asList("Silva","Santos","Ferreira","Pereira","Oliveira","Costa","Rodrigues","Martins","Jesus","Sousa","Fernandes","GonÃ§alves","Gomes","Lopes","Marques","Alves","Almeida","Ribeiro","Pinto","Carvalho","Teixeira","Moreira","Correia","Mendes","Nunes","Soares","Vieira","Monteiro","Cardoso","Rocha","Raposo","Neves","Coelho","Cruz","Cunha","Pires","Ramos","Reis","SimÃµes","Antunes","Matos","Fonseca","Machado","AraÃºjo","Barbosa","Tavares","LourenÃ§o","Castro","Figueiredo","Azevedo","Freitas","MagalhÃ","es","Henriques","Lima","Guerreiro","Batista","Pinheiro","Faria","Miranda","Barros","Morais","Nogueira","Esteves","Anjos","Baptista","Campos","Mota","Andrade","Brito","SÃ¡","Nascimento","Leite","Abreu","Borges","Melo","Vaz","Pinho","Vicente","Gaspar","AssunÃ§Ã","o","Maia","Moura","Valente","Domingues","Garcia","Carneiro","Loureiro","Neto","Amaral","Branco","Leal","Pacheco","Macedo","Paiva","Matias","Amorim","Torres"));
        List<String> moradas = new ArrayList<>(Arrays.asList("A Ver-o-Mar‎","Abragao‎","Aguas Santas","Agucadoura‎","Aguiar da Beira‎","Alandroal‎","Alcanena‎","Alcantarilha‎","Alcochete‎","Alcoutim‎","Alenquer","Alfandega da Fe","Alfeizerao‎","Alges‎","Algueirao - Mem Martins‎","Alhadas‎","Alhandra","Alhos Vedros‎","Alijo","Aljezur‎","Aljubarrota‎","Aljustrel‎","Almancil‎","Almeida‎","Almendra‎","Almodovar‎","Alpiarca‎","Alter do Chao‎","Alvaiazere‎","Alvito‎","Alvor‎","Amares‎","Anca","Ancede‎","Angeja‎","Ansiao‎","Apulia","Arco de Baulhe‎","Arcos de Valdevez‎","Arganil‎","Argoncilhe‎","Armacao de Pera‎","Armamar‎","Arouca‎","Arraiolos‎","Arrifana","Arronches‎","Arruda dos Vinhos‎","Avanca‎","Aveiras de Cima‎","Avintes‎","Avis‎","Azambuja‎","Baiao","Baltar","Barrancos‎","Batalha","Belas","Belmonte","Benavente‎","Bobadela","Bombarral‎","Bornes de Aguiar‎","Boticas‎","Bucelas‎","Cabeceiras de Basto‎","Cadaval‎","Caldelas","Calheta","Calheta","Camacha‎","Camarate‎","Cambres‎","Caminha‎","Campo de Besteiros‎","Campo Maior","Canas de Santa Maria‎","Canas de Senhorim‎","Canecas‎","Canelas","Canical‎","Caparica‎","Caranguejeira‎","Carapinheira‎","Carnaxide‎","Carrazeda de Ansiaes‎","Carregado‎","Carregal do Sal‎","Carregosa‎","Cascais‎","Castanheira de Pera‎","Castelo da Maia‎","Castelo de Paiva‎","Castelo de Vide‎","Castro Daire‎","Castro Laboreiro‎","Castro Marim‎","Castro Verde‎","Grijo","Leca da Palmeira‎","Cavez‎","Caxias","Celorico da Beira‎","Celorico de Basto‎","Cernache do Bonjardim‎","Cesar‎","Cete‎","Chamusca‎","Charneca de Caparica‎","Cheleiros‎","Cinfaes‎","Condeixa-a-Nova‎","Constancia‎","Corroios‎","Coruche‎","Corvo","Crato","Cruz Quebrada - Dafundo‎","Cuba","Cumieira","Custoias","Estombar‎","Estreito de Camara de Lobos‎","Fajoes‎","Fao‎","Fazendas de Almeirim‎","Fermentelos‎","Ferragudo‎","Ferreira do Alentejo‎","Ferreira do Zezere‎","Ferrel‎","Figueira de Castelo Rodrigo‎","Figueiro dos Vinhos‎","Forjaes‎","Fornos de Algodres‎","Freixo de Espada a Cinta‎","Freixo de Numao‎","Fronteira","Gaeiras‎","Gaviao","Gois‎","Golega","Grandola‎","Idanha-a-Nova‎","Lajes das Flores‎","Lajes do Pico‎","Lavradio‎","Lazarim‎","Leca do Balio‎","Lever‎","Linda-a-Velha‎","Lorvao‎","Lourical‎","Lourinha","Lousa","Lousada‎","Luso‎","Luz","Luz de Tavira‎","Macao‎","Madalena","Mafra","Malveira‎","Manteigas‎","Marialva","Marinha das Ondas‎","Marinhais‎","Marvao‎","Melgaco","Mertola‎","Mesao Frio‎","Mira","Mira de Aire‎","Miranda do Corvo‎","Mogadouro‎","Moimenta da Beira‎","Moita‎","Moncao","Monchique‎","Mondim de Basto‎","Monforte‎","Montalegre‎","Monte Real‎","Montelavar‎","Montemor-o-Velho‎","Mora","Moreira","Moreira de Conegos‎","Mortagua‎","Moscavide‎","Mourao‎","Mourisca do Vouga‎","Murca‎","Murtosa‎","Nazare","Nelas‎","Nisa‎","Nordeste"));
        List<String> empresas = new ArrayList<>(Arrays.asList("CONSTANTINO FERNANDES OLIVEIRA & FILHOS, S.A.","COFINA MEDIA, S.A.","LISBOAGÁS GDL - SOCIEDADE DISTRIBUIDORA DE GÁS NATURAL DE LISBOA, S.A.","AGRUPALTO - AGRUPAMENTO DE PRODUTORES AGROPECUÁRIOS, S.A.","SOAUTO - COMÉRCIO DE AUTOMÓVEIS, S.A.","AVIPRONTO - PRODUTOS ALIMENTARES, S.A.","DATABOX - INFORMÁTICA, S.A.","ARCOL, S.A.","ARROWECS PORTUGAL, SOCIEDADE UNIPESSOAL, LDA"));
        List<String> tcs = new ArrayList<>(Arrays.asList("ajuste direto", "consulta previa", "concurso publico"));
        List<String> tps_ad = new ArrayList<>(Arrays.asList("contrato de aquisicao", "locacao de bens moveis", "aquisicao de servicos"));
        List<String> tps = new ArrayList<>(Arrays.asList("compra de carro", "contrato de habitacao", "aluguer", "contrato de arrendamento",
                "contrato de trabalho"));
        List<String> desc1 = new ArrayList<>(Arrays.asList("contrato de compra ou venda de veiculo",
                "contrato de arrendamento de habitacao",
                "contrato de aluguer",
                "contrato de arrendamento de imovel",
                "contrato de trabalho a termo certo"));
        List<String> desc2 = new ArrayList<>(Arrays.asList("contrato de aquisicao de um bem",
                "contrato de locacao de um ou mais bens moveis",
                "contrato de aquisicao de servicos"));

        Random r = new Random();

        //contrato(IdC,IdAd,IdAda,TC,TP,D,V,P,L,Dia,Mes,Ano)

        int idC, idAd, idAda;
        String tc, tp, d;
        double v;
        int p;           // 0 < v < 5000; p < 365
        String l;
        int dia, mes, ano;

        for(int j = 0; j < 50; j++){

            int rand = r.nextInt(tps.size());

            idC = j + 1;
            idAd = r.nextInt(9) + 1;
            idAda = r.nextInt(19) + 1;
            tc = tcs.get(r.nextInt(tcs.size()));
            l = moradas.get(r.nextInt(moradas.size()));
            dia = dias.get(r.nextInt(dias.size()));
            mes = meses.get(r.nextInt(meses.size()));
            ano = anos.get(r.nextInt(anos.size()));

            if(tc.equals("ajuste direto")){
                int rand2 = r.nextInt(tps_ad.size());
                tp = tps_ad.get(rand2);
                d = desc2.get(rand2);
                v = r.nextDouble()*5000;
                p = r.nextInt(365);
            }
            else{
                tp = tps.get(rand);
                d = desc1.get(rand);
                v = r.nextDouble()*100000;
                p = r.nextInt(1000);
            }


            String res = String.format("contrato(" + idC + ", " + idAd + ", " + idAda + ", '" + tp + "', '" + tc + "', '" + d +
                    "', " + "%.2f" + ", " + p + ", '" + l + "', " + dia + ", " + mes + ", " + ano + ").", v);

            System.out.println(res);
        }

    }
}