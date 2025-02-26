package NewClasses.MyAddressBook.Services;

import java.util.Random;
import java.util.Scanner;

public class GeneralFunctions {
    
    // Ultima atualização do arquivo FUNÇÕES: 22/01/2025 
    // Programa: EasyCalc

    private final Scanner inn = new Scanner (System.in);

   
    public int addRegistro(int reg){

        /* Função gera números aleatórios de acordo com a quantidade indicada no REG.
         * Se REG = 7 a função retornará um INTEIRO DE 7 DÍGITOS ALEATÓRIOS.*/
        Integer registro;
        
        int [] numvec = new int[reg];
        String numStr = "";

        for (int i = 0; i < reg; i++){
            Random ram = new Random();
            int numRam = ram.nextInt(1,9);
            numvec[i] = numRam;
        }
        
        for (int i = 0; i < reg; i++){
            numStr = numStr + String.valueOf(numvec[i]);
        }
    
        registro = Integer.valueOf(numStr);
        return registro;
    }

    public String checkStringMinVariavel (String variavel, int limiteMin){

        /* Função utilizada para substituir o Scanner. Ela recebe o valor digitado
         * pelo usuário e verifica se está no tamanho MINIMO desejado pelo programa.
         * A VARIAVEL pode ser um espaço OU caracter desejado para ilustrar o código.
         */

        String string = "";
        boolean tryAgain = true;

        while (tryAgain == true){

            System.out.print(variavel + ": " );
            string = inn.nextLine();
            if (string.length() < limiteMin){
                System.out.println("\n\n### ERROR ### \nOperação INVÁLIDA!\n" +
                                "Digite no MÍNIMO " + limiteMin + " \n" + 
                                "caracteres referente ao cadastro!\n");
            } else {
                tryAgain = false;
                break;
            }
        }

        return string;
    }

    public String checkStringMaxVariavel (String variavel, int limiteMax){

        /* Função utilizada para substituir o Scanner. Ela recebe o valor digitado
         * pelo usuário e verifica se está no tamanho MAXIMO desejado pelo programa.
         * A VARIAVEL pode ser um espaço OU caracter desejado para ilustrar o código.
         */

        String string = "";
        boolean tryAgain = true;

        while (tryAgain == true){

            System.out.print(variavel + ": " );
            string = inn.nextLine();
            if (string.length() > limiteMax){
                System.out.println("\n\n### ERROR ### \nOperação INVÁLIDA!\n" +
                                "Digite no MÁXIMO " + limiteMax + " \n" + 
                                "caracteres referente ao cadastro!\n");
            } else {
                tryAgain = false;
                break;
            }
        }

        return string;
    }

    public String checkStringMinMaxVariavel (String variavel, int limiteMin, int limiteMax){

        /* Função utilizada para substituir o Scanner. Ela recebe o valor digitado
         * pelo usuário e verifica se está no tamanho MINIMO e MAXIMO desejado pelo programa.
         * A VARIAVEL pode ser um espaço OU caracter desejado para ilustrar o código.
         */

        String string = "";
        boolean tryAgain = true;

        while (tryAgain == true){

            System.out.print(variavel + ": " );
            string = inn.nextLine();
            if (string.length() < limiteMin || string.length() > limiteMax){
                System.out.println("\n\n### ERROR ### \nOperação INVÁLIDA!\n" +
                                        variavel.toUpperCase() + " deve ser no MÍNIMO " + (limiteMin) + 
                                        "\ne o no MÁXIMO " + (limiteMax) +" !\n");
            } else {
                tryAgain = false;
                break;
            }
        }

        return string;
    }

    public boolean isNumeric(String str){

        /* Função utilizada para verificar se a VARIAVEL recebida
         é um número. */

        if (str != null && str.matches("[0-9.]+")){
            return true;
        } else {
            return false;
        }
    }

    public Integer recebeIntMinMaxVariavel (String variavel, int limiteMin, int limiteMax){

        /* Função utilizada para substituir o Scanner. Ela recebe o valor digitado
         * pelo usuário e verifica se está no tamanho MINIMO e no MAXIMO desejado pelo programa.
         * A VARIAVEL pode ser um espaço OU caracter desejado para ilustrar o código.
         */

        Integer numConv = -1;
        boolean testaNum = true;
        while (testaNum == true){
            System.out.print(variavel + " ");
            String teste = inn.nextLine();

            if (isNumeric(teste) == true){
                
                if (Integer.parseInt(teste) >= limiteMin && Integer.parseInt(teste) <= limiteMax){
                    numConv = Integer.parseInt(teste);
                    testaNum = false;
                } else {
                    System.out.println("\n\n    # ERROR # \n" +
                                        "Digite números entre \n" +  
                                        "      " + limiteMin + " e " + limiteMax +" \n");
                }
                
            }  else if (isNumeric(teste) == false) {
                System.out.println("\n\n    # ERROR # \n" +
                                   "Digite apenas NÚMEROS\n");
                teste = "";
            }
        }
        return numConv;

    }

    public Integer recebeIntMinMax (int limiteMin, int limiteMax){

        /* Função utilizada para substituir o Scanner. Ela recebe o valor digitado
         * pelo usuário e verifica se está no tamanho MINIMO desejado pelo programa.
         * NÃO HÁ VARIAVEL. */

        Integer numConv = -1;
        boolean testaNum = true;
        while (testaNum == true){
            System.out.print(" ");
            String teste = inn.nextLine();

            if (isNumeric(teste) == true){
                
                if (Integer.parseInt(teste) >= limiteMin && Integer.parseInt(teste) <= limiteMax){
                    numConv = Integer.parseInt(teste);
                    testaNum = false;
                } else {
                    System.out.println("\n\n    # ERROR # \n" +
                                        "Digite números entre \n" +  
                                        "      " + limiteMin + " e " + limiteMax +" \n");
                }
                
            }  else if (isNumeric(teste) == false) {
                System.out.println("\n\n    # ERROR # \n" +
                                   "Digite apenas NÚMEROS\n");
                teste = "";
            }
        }
        return numConv;

    }

    public Integer recebeInt (){

        /* Função utilizada para substituir o Scanner. Ela recebe o valor digitado
         * pelo usuário e verifica se É UM NÚMERO inteiro. NÃO HÁ VARIAVEL. */

        Integer numConv = -1;
        boolean testaNum = true;
        while (testaNum == true){
            System.out.print(" ");
            String teste = inn.nextLine();

            if (isNumeric(teste) == true){
                numConv = Integer.parseInt(teste);
                testaNum = false;
                
            }  else if (isNumeric(teste) == false) {
                System.out.println("\n\n    # ERROR # \n" +
                                   "Digite apenas NÚMEROS\n");
                teste = "";
            }
        }
        return numConv;

    }
   

    public Double recebeDoubleVariavel (String variavel){

        /* Função utilizada para substituir o Scanner. Ela recebe o valor digitado
         * pelo usuário e verifica se É UM NÚMERO REAL. HÁ VARIAVEL para o código. 
         * Ex.: R$ 150,00 a função receber 'R$' como variável e repete para receber
         * o valor correto caso seja digitado errado. */

        Double numConvertido = -999.85979;
        boolean testaNumero = true;

        while (testaNumero == true){

            System.out.print(variavel + " ");
            String testaString = inn.nextLine();

            try {
                numConvertido = Double.parseDouble(testaString);
                if (numConvertido != -999.859799){
                    // Esse IF verificar se numConv recebeu o valor novo de TESTE e o
                    // converteu para DOUBLE. Caso contrário, ele permanecerá com 
                    // o valor inicial da variavel Double (-999.859799).
                    testaNumero = false;
                } else {
                    testaNumero = true;
                }
                
            } catch (NumberFormatException e) {
                System.out.print("\n\n      # ERROR # \n" +
                                      "Digite apenas NÚMEROS!\n"+
                                      "Ex.: 8.9, 9, 10.742, 0, 3\n");
                                   testaString = "";
            }
        }
        System.out.println();
        return numConvertido;
    }

   

    public void pause(String letreiro, char etc, int repete, int tempo) throws InterruptedException{
        
        /* Função chamada para apresentar uma mensagem na tela e parar o programa por um tempo
        específico a fim de informar algo ao usuário sem a necessidade de intervenção na tela.

         * Letreiro = "Processando", char = '.', repete = 3, tempo = 500ms
         * 
         * Saída: Processando... (aguarda 500ms antes de seguir o programa)
         * 
         * Letreiro = "Cadastrado", char = '!', repete = 1, tempo = 100ms
         * Saída: Cadastrado! (aguarda 100ms antes de seguir o programa)
         */

        System.out.print(letreiro);

        for (int i = 0; i < repete; i++){
            Thread.sleep(tempo);
            System.out.print(etc);
        }

    }

    public void PressToContinue(){

        /* Função chamada para PARAR O PROGRAMA e dar tempo do usuário ler as informações antes de seguir
         * o código para o usuário utilizar o tempo necessário a compreensão dos dados na tela. O
         * programa somente retorna após a intervenção do usuário. */

        System.out.print("Pressione qualquer tecla para continuar... ");
        @SuppressWarnings("unused")
        String wait = inn.nextLine();
        System.out.println();
    }

    
  

    public String checkStringLength(int tamanho) {

        boolean testaStr = true;

        System.out.print(" ");
        String recebeStr = inn.nextLine();

        while (testaStr == true){

            if (recebeStr.length() < tamanho){
                System.out.println("\n\n         # ERROR # \n" + 
                                    " \n       CPF INVÁLIDO\n" +
                                       "Digite apenas os 11 NÚMEROS!\n" +
                                       "        XXXXXXXXXxx        \n");
                System.out.print("\n> ");
                recebeStr = inn.nextLine();
            }  else if (recebeStr.length() > tamanho) {
                System.out.println("\n\n         # ERROR # \n" + 
                                    " \n       CPF INVÁLIDO\n" +
                                       "Digite apenas os 11 NÚMEROS!\n" +
                                       "        XXXXXXXXXxx        \n");
                System.out.print("\n> ");
                recebeStr = inn.nextLine();
            } else if (recebeStr.length() == tamanho){
                testaStr = false;
            }
        }
        return recebeStr;
    }


    public String checkOperador(String variavel){

        boolean testaStr = true;
        String recebeStr="";

        while (testaStr == true){

            System.out.print(variavel + " ");
            recebeStr = inn.nextLine();

            if (recebeStr == null || recebeStr == "" || recebeStr == " "){
                System.out.println("\n   #          ERRO no OPERADOR          #");
                System.out.println(  "   #           [+] [-] [=] [*]          #\n");
                testaStr = true;
            } else if (recebeStr.charAt(0) == '+'){
                testaStr = false;
            }  else if (recebeStr.charAt(0) == '-') {
                testaStr = false;
            } else if (recebeStr.charAt(0) == '*'){
                testaStr = false;
            } else if (recebeStr.charAt(0) == '='){
                testaStr = false;
            } else {
                System.out.println("\n   #          ERRO no OPERADOR          #");
                System.out.println(  "   #           [+] [-] [=] [*]          #\n");
                testaStr = true;
            }
        }
        return recebeStr;
    }
}
