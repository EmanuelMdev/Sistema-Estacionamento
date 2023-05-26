import java.util.Scanner;
public class Codigo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Olá, bem vindo! \nO valor do estacionamento é cobrado POR MINUTO (FUNCIONAMENTO: 06HRS AS 20HRS) \n--------------- \nCarro: 30R$ P/hr \nMoto: R$18 P/hr (SEM PERNOITE) \n--------------- \nQual é o seu veículo? (Digite (1) para carro e (2) para moto:");
        int veiculo = in.nextInt();
        while (veiculo != 1 && veiculo != 2) {
            System.out.println("Apenas (1) ou (2), tente novamente:");
            veiculo = in.nextInt();
        }
        
        switch (veiculo) {
            case 1:
                System.out.println("Veículo selecionado: Carro \nDigite o horário de entrada abaixo com os dois primeiros digitos (##). \n--------------- \nHORA: ");
            int entradaH = in.nextInt();
            while (entradaH < 6 || entradaH > 20) {
                System.out.println("Hora invalida, digite de 6 a 20");
                entradaH = in.nextInt();
            }
            System.out.println("MINUTOS: ");
            int entradaM = in.nextInt();
            while (entradaM < 0 || entradaM > 59) {
            	System.out.println("Invalido, digite de 0 a 59");
                entradaM = in.nextInt();
            }
            System.out.println("Agora digite o horário de saída no mesmo formato anterior. \n--------------- \nHORA: ");
            int saidaH = in.nextInt();
            while (saidaH < 0 || saidaH > 23) {
                System.out.println("Hora invalida, digite de 0 a 23");
                saidaH = in.nextInt();
            }
            System.out.println("MINUTOS: ");
            int saidaM = in.nextInt();
            while (saidaM < 0 || saidaM > 59) {
            	System.out.println("Invalido, digite de 0 a 59");
                saidaM = in.nextInt();
            }
            
            int htotal = (entradaH - saidaH) * -1;
	        int mtotal = (entradaM - saidaM);
	
	        if (entradaM < saidaM) {
		    mtotal = mtotal * -1;
	        }
	        if (mtotal > 59) {
		    htotal = htotal + 1;
	        }
	        if (saidaM < entradaM) {
	        	mtotal = entradaM - saidaM;
	        }
	        if (htotal < 9 && mtotal < 9) {
	        System.out.println("VOCÊ FICOU: " + "0" + htotal + ":" + "0" + mtotal + " horas.");
	        } else if (htotal < 9) {
	        	System.out.println("VOCÊ FICOU: " + "0" + htotal + ":" + mtotal + " horas.");
	        } else if (mtotal < 9) {
	        	System.out.println("VOCÊ FICOU: " + htotal + ":" + "0" + mtotal + " horas.");
	        } else {
	        	System.out.println("VOCÊ FICOU: " + htotal + ":" + mtotal + " horas.");
	        }
	        
	        int opmin1 = htotal * 60;
	        int opmin2 = opmin1 + mtotal;
	        double opmin3 = opmin2 * 0.5;
	        
	        System.out.println("TOTAL A SE PAGAR: " + "R$" + opmin3);
            break;
            case 2:
            	System.out.println("Veículo selecionado: Moto \nDigite o horário de entrada abaixo com os dois primeiros digitos (##). \n--------------- \nHORA: ");
                int entradaH2 = in.nextInt();
                while (entradaH2 < 6 || entradaH2 > 20) {
                    System.out.println("Hora invalida, digite de 6 a 20");
                    entradaH2 = in.nextInt();
                }
                System.out.println("MINUTOS: ");
                int entradaM2 = in.nextInt();
                while (entradaM2 < 0 || entradaM2 > 59) {
                	System.out.println("Invalido, digite de 0 a 59");
                    entradaM2 = in.nextInt();
                }
                System.out.println("Agora digite o horário de saída no mesmo formato anterior. \n--------------- \nHORA: ");
                int saidaH2 = in.nextInt();
                while (saidaH2 < 0 || saidaH2 > 23) {
                    System.out.println("Hora invalida, digite de 0 a 23");
                    saidaH2 = in.nextInt();
                }
                System.out.println("MINUTOS: ");
                int saidaM2 = in.nextInt();
                while (saidaM2 < 0 || saidaM2 > 59) {
                	System.out.println("Invalido, digite de 0 a 59");
                    saidaM2 = in.nextInt();
                }
                
                int htotal2 = (entradaH2 - saidaH2) * -1;
    	        int mtotal2 = (entradaM2 - saidaM2);
    	
    	        if (entradaM2 < saidaM2) {
    		    mtotal2 = mtotal2 * -1;
    	        }
    	        if (mtotal2 > 59) {
    		    htotal2 = htotal2 + 1;
    	        }
    	        if (saidaM2 < entradaM2) {
    	        	mtotal2 = entradaM2 - saidaM2;
    	        }
    	        if (htotal2 < 9 && mtotal2 < 9) {
    	        System.out.println("VOCÊ FICOU: " + "0" + htotal2 + ":" + "0" + mtotal2 + " horas.");
    	        } else if (htotal2 < 9) {
    	        	System.out.println("VOCÊ FICOU: " + "0" + htotal2 + ":" + mtotal2 + " horas.");
    	        } else if (mtotal2 < 9) {
    	        	System.out.println("VOCÊ FICOU: " + htotal2 + ":" + "0" + mtotal2 + " horas.");
    	        } else {
    	        	System.out.println("VOCÊ FICOU: " + htotal2 + ":" + mtotal2 + " horas.");
    	        }
    	        
    	        int opmin4 = htotal2 * 60;
    	        int opmin5 = opmin4 + mtotal2;
    	        double opmin6 = opmin5 * 0.3;
    	        
    	        System.out.println("TOTAL A SE PAGAR: " + "R$" + opmin6);
                break;
        }
    }
}