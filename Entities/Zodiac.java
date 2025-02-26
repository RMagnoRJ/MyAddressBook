package NewClasses.MyAddressBook.Entities;

import java.time.LocalDate;
import java.time.Month;

public class Zodiac {
    
    private String sign;
    private String features;
    private String gifts;
    private Integer numeroZodiaco;

    public Zodiac(LocalDate nascimento) {
        this.sign = zodiacSign(nascimento);
        this.features = selectFeatures();
        this.gifts = showGifts();
    }

    public String getSign() {
        return sign;
    }

    public String getFeatures() {
        return features;
    }

    public String getGifts() {
        return gifts;
    }

    public Integer getNumeroZodiaco() {
        return numeroZodiaco;
    }
    

    

    public String zodiacSign(LocalDate data){

        int dia = data.getDayOfMonth();
        Month mes = data.getMonth();

        if ((mes == Month.DECEMBER && dia >= 22) || (mes == Month.JANUARY && dia <= 19)) {
            // 1
            this.numeroZodiaco = 1;
            return "Capricórnio";
        } else if ((mes == Month.JANUARY && dia >= 20) || (mes == Month.FEBRUARY && dia <= 18)) {
            // 2
            this.numeroZodiaco = 2;
            return "Aquário";
        } else if ((mes == Month.FEBRUARY && dia >= 19) || (mes == Month.MARCH && dia <= 20)) {
            // 3
            this.numeroZodiaco = 3;
            return "Peixes";
        } else if ((mes == Month.MARCH && dia >= 21) || (mes == Month.APRIL && dia <= 19)) {
            // 4
            this.numeroZodiaco = 4;
            return "Áries";
        } else if ((mes == Month.APRIL && dia >= 20) || (mes == Month.MAY && dia <= 20)) {
            // 5
            this.numeroZodiaco = 5;
            return "Touro";
        } else if ((mes == Month.MAY && dia >= 21) || (mes == Month.JUNE && dia <= 20)) {
            // 6
            this.numeroZodiaco = 6;
            return "Gêmeos";
        } else if ((mes == Month.JUNE && dia >= 21) || (mes == Month.JULY && dia <= 22)) {
            // 7
            this.numeroZodiaco = 7;
            return "Câncer";
        } else if ((mes == Month.JULY && dia >= 23) || (mes == Month.AUGUST && dia <= 22)) {
            // 8
            this.numeroZodiaco = 8;
            return "Leão";
        } else if ((mes == Month.AUGUST && dia >= 23) || (mes == Month.SEPTEMBER && dia <= 22)) {
            // 9
            this.numeroZodiaco = 9;
            return "Virgem";
        } else if ((mes == Month.SEPTEMBER && dia >= 23) || (mes == Month.OCTOBER && dia <= 22)) {
            // 10
            this.numeroZodiaco = 10;
            return "Libra";
        } else if ((mes == Month.OCTOBER && dia >= 23) || (mes == Month.NOVEMBER && dia <= 21)) {
            // 11
            this.numeroZodiaco = 11;
            return "Escorpião";
        } else if ((mes == Month.NOVEMBER && dia >= 22) || (mes == Month.DECEMBER && dia <= 21)) {
            // 12
            this.numeroZodiaco = 12;
            return "Sagitário";
        } else {
            return null; // será exibido DATA INCORRETA OU NÃO INFORMADA.
        }

    }

    public String selectFeatures(){

        String generalFeature = "";
        int numero = getNumeroZodiaco();

        if (numero == 1){
            // Capricórnio
            generalFeature = "Capricórnio representa estrutura, ambição e responsabilidade. Prudência, paciência e persistência são as três grandes características de Capricórnio. Nesse sentido, é o mais capaz de realizar coisas difíceis. Em diferentes casas, mostra nossa busca em construir e alcançar metas.";
        } else if (numero == 2){
            // Aquário
            generalFeature = "Aquário é o signo da inovação, fraternidade e independência. Mas também é considerado o melhor amigo do zodíaco, por ser um signo leal, honrado e que se pode realmente confiar. Onde temos Aquário no nosso Mapa mostra como buscamos mudanças e ideais humanitários.";
        } else if (numero == 3){
            // Peixes
            generalFeature = "Símbolo da empatia, espiritualidade e fusão, Peixes é o último signo do zodíaco, representando o último estágio de aprendizado da vida. No entanto, é capaz de se doar totalmente a algum objetivo e de esquecer seus próprios interesses. A Casa onde temos Peixe mostra uma abordagem intuitiva e compassiva.";
        } else if (numero == 4){
            // Áries
            generalFeature = "Conhecido por sua energia e impulso, Áries é o pioneiro, afinal, é o primeiro signo do zodíaco. Em diferentes casas, Áries traz iniciativa e coragem para os aspectos de vida representados por essas casas. Só não confunda a vitalidade ariana com agressividade.";
        } else if (numero == 5){
            // Touro
            generalFeature = "É o signo da estabilidade, paciência e prazer sensorial. Em diferentes casas, Touro busca segurança e conforto nos temas da casa. Além disso, o signo tem enorme vocação para os prazeres da vida, por isso a fama da gula e da preguiça. Mas, na verdade, eles guardam sua energia para ir atrás daquilo que realmente querem.";
        } else if (numero == 6){
            // Gêmeos
            generalFeature = "Gêmeos traz curiosidade, adaptabilidade e habilidade de comunicação. Em diferentes casas, Gêmeos estimula a troca de ideias e a aprendizagem. Acima de tudo, conhecer novas pessoas e manter longos papos. Apesar de preferirem conversas leves, são pessoas muito inteligentes.";
        } else if (numero == 7){
            // Câncer
            generalFeature = "Signo do cuidado, emoção e lar, sim, mas Câncer é muito mais do que sensibilidade e família. Câncer é um signo com muita ambição, embora não seja sempre visível. Sua presença em diferentes casas indica uma abordagem protetora e emocional.";
        } else if (numero == 8){
            // Leão
            generalFeature = "Leão representa criatividade, orgulho e generosidade. Regido pelo Astro Rei, também é o Rei da Selva. Por isso, pode se tornar o centro das atenções, fazendo com que aqueles que estão em sua presença se sintam especiais. Em diferentes casas, Leão busca expressão e reconhecimento.";
        } else if (numero == 9){
            // Virgem
            generalFeature = "Signo da análise, serviço e purificação, Virgem indica em que área da vida temos uma abordagem mais prática, crítica e perfeccionista. Além disso, a ideia de controle, seja das emoções, do conhecimento ou do corpo, está muito ligada ao signo de Virgem.";
        } else if (numero == 10){
            // Libra
            generalFeature = "Libra simboliza harmonia, beleza e parcerias. Gentileza e conciliação são os dons desse signo, e, por isso, se esforça muito para manter a paz. Em diferentes casas, mostra onde buscamos equilíbrio e justiça. Em compensação, a dúvida e a indecisão podem ser constantes.";
        } else if (numero == 11){
            // Escorpião
            generalFeature = "Escorpião representa transformação, mistério e intensidade. Com uma forte energia emocional, tende a tentar entender enigmas, mistérios e segredos do ser humano. Nesse sentido, Escorpião em diferentes casas indica onde temos uma abordagem profunda e transformadora.";
        } else if (numero == 12){
            // Sagitário
            generalFeature = "O signo que mistura aventura, filosofia e liberdade é Sagitário. Além disso, é considerado o mais positivo, divertido e otimista do zodíaco. Porém, pode ter dificuldade em se comprometer. Em diferentes casas, promove expansão e busca por significado.";
        }
        return generalFeature;
    }

    public String showGifts(){

        String generalGifts = "";
        int numero = getNumeroZodiaco();

        if (numero == 1){
            // Capricórnio
            generalGifts = "Totalmente tradicional, aprecia joias antigas, roupas em tons mais escuros e conservadoras e acessórios clássicos. Com sua postura mais séria, não gosta de exageros, nem de chamar a atenção. Prefere produtos funcionais e com cheiros discretos. Um enfeite bem colorido alegra o lar capricorniano. Comes e bebes: bom vinho ou uísque clássico costuma ser a melhor pedida, já que ele não é fã de nada exótico na culinária nem nas experiências etílicas.";
        } else if (numero == 2){
            // Aquário
            generalGifts = "Dono de muita originalidade, Aquário usa roupas arrojadas. Ele mistura peças de alta moda com outras baratinhas. Curte acessórios ligados ao exército. Com ele, não há regras. Vale tudo nesse segmento. Quanto mais rara e incomum a peça, melhor! Ele não gosta de ter o que todo mundo também ostenta. Comes e bebes: bebidas ou comidas orgânicas e produtos naturais, com um quê de inovação, são boas ideias.";
        } else if (numero == 3){
            // Peixes
            generalGifts = "Peças fluidas e com estilo romântico casam muito bem com o pisciano. Peixes adora perfumes. Velas e cristais são muito úteis e enfeitam o lar, trazendo um ar mais místico para a residência. Comes e bebes: o pisciano também gosta de um toque de luxo, seja jantar em bom restaurante ou uma garrafa de champanhe de qualidade.";
        } else if (numero == 4){
            // Áries
            generalGifts = "O gosto para se vestir do ariano tende para o casual-elegante. É fã de roupas com design exclusivo e personalizado, mas também curte uma pegada mais esportiva. Áries irradia energia e autoconfiança e gosta muito de chamar a atenção. É fã de produtos que iluminem a pele e deixe o cabelo brilhando. O ariano adora acessórios de primeira linha, modernos e customizados. Comes e bebes: o nativo do signo aprecia alimentos apimentados, condimentados e de gosto forte, que condizem com seu estilo de vida.";
        } else if (numero == 5){
            // Touro
            generalGifts = "Regido por Vênus, o planeta da beleza, Touro se importa muito com a aparência. Por isso, dá preferência às roupas confortáveis, mas com sensualidade. Lingeries de seda e pijamas de cetim são itens certeiros. Valoriza demais o cabelo, cujos fios tendem a ser grossos e escuros, e ama produtos para tratá-los. Curtem loções e óleos essenciais. Como signo do elemento terra, tem enorme prazer com a jardinagem. Vale qualquer acessório referente ao plantio ou até mesmo plantas. Comes e bebes: chocolates de qualidade ou um vale-night em restaurante refinado agradam tanto quanto um bom vinho ou outra bebida alcoólica fina.";
        } else if (numero == 6){
            // Gêmeos
            generalGifts = "Gêmeos é resistente e energético. Costuma se vestir de um jeito peculiarmente elegante. Os homens deste signo preferem a aparência professoral. Joias e bijoux de todo tipo agradam bastante. O geminiano gosta de produtos tão versáteis quanto ele, do tipo que cumpre várias funções ao mesmo tempo. Adora brinquedos tecnológicos, especialmente os mais modernos e ligados à tecnologia, como equipamentos de som e comunicação. Comes e bebes: a versatilidade típica do signo se estende à comilança. Curte do fast-food ao restaurante requintado. Convites para experimentar cozinhas inovadoras ou de outras culturas são sempre bem-vindos.";
        } else if (numero == 7){
            // Câncer
            generalGifts = "Câncer escolhe roupas confortáveis e mais caseiras. Quando gosta de uma peça, costuma usá-la até que comece a desmanchar. Ele dificilmente se coloca em evidência. Prefere tudo mais discreto e gosta muito de joias de prata (por causa da Lua, seu astro regente) e pérolas. Não abre mão de cuidar de si. Gosta de todo tipo de produto que hidrate, sobretudo o rosto. Adora seu lar, além de tudo o que tem a ver com água e itens de valor sentimental. Peças de antiquário, feirinhas de antiguidade ou sebos sempre agradam. Comes e bebes: frutos do mar são uma pedida certeira para os cancerianos, que preferem um presente bem gourmet. Outro mimo que agrada são pratos.";
        } else if (numero == 8){
            // Leão
            generalGifts = "Leão nunca passa despercebido. Usa roupas caras e elegantes, reconhecidas à distância. Extremamente vaidoso e imponente, prefere joias de ouro, bem reluzentes, para combinar com seu regente, o Sol. Não abre mão de cuidar de sua \"juba\". Qualquer produto que realce, hidrate e cuide dos fios (de cabelo ou barba) são supervalorizados. O leonino procura colocar sua criatividade à mostra e ter muitos objetos de arte espalhados pela residência. Comes e bebes: o gosto requintado chega à mesa, então não pode ser qualquer vinho ou cesta de produtos. Só os mais refinados e gourmet mesmo!";
        } else if (numero == 9){
            // Virgem
            generalGifts = "O virginiano se veste de maneira organizada, combinando cores e padronagens. Opta por roupas funcionais, práticas e atemporais. Com personalidade mais reservada, prefere sua beleza natural e make discreta. Por isso, produtos para relaxar e óleos de banhos são as melhores escolhas. O nativo de Virgem gosta da casa organizada e de acessórios práticos, com utilidade para facilitar o dia a dia. Comes e bebes: tem preferência por alternativas com pegada mais saudável.";
        } else if (numero == 10){
            // Libra
            generalGifts = "Harmonia e beleza são imprescindíveis na aparência de qualquer libriano. Mesmo com roupas simples, prefere tecidos mais estruturados, elegantes e duradouros. Gosta de cores e abusa da combinação entre elas. Vaidoso por natureza, preza muito pela boa aparência e se dedica ao autocuidado. Prefere produtos que agem e oferecem resultados harmonizados. Como ama artes, sempre tem lugar especial para uma nova obra em seu lar. Comes e bebes: vale-noite em restaurante elegante é presente mais do que certo. Também aprecia uma deliciosa e requintada caixa de bombom.";
        } else if (numero == 11){
            // Escorpião
            generalGifts = "O escorpiano adora roupas envolventes com um toque de mistério, com bons cortes e estilo forte e que tragam brilho à aparência marcante. Roupas íntimas e sensuais são mais que bem-vindas. Se interessa por tudo que o torne mais sensual, como perfume ou cremes cheirosos. Jogos de mistérios e detetive são boas opções para o lar de Escorpião, assim como livros sobre enigmas ocultos. Comes e bebes: é do tipo que gosta de alimentos de sabor marcante, sobretudo de origem asiática.";
        } else if (numero == 12){
            // Sagitário
            generalGifts = "Praticidade é com Sagitário. Peças versáteis caem bem, apesar de suas combinações serem extravagantes, com pegada jovem e marcante. Adora experimentar cosméticos e produtinhos de várias partes do mundo. Melhor não presentear o sagitariano com nada ligado à casa, já que ele prefere estar o tempo todo viajando --a menos que seja algum item útil nos deslocamentos. Comes e bebes: é outro que gosta de experimentar comidas originais de países diferentes.";
        }

        return generalGifts;
    }


    
}
