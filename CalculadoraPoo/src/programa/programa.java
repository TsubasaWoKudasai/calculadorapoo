package programa;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import interfaces.ICalculadora;

public class programa {		
	public static void main(String args[]) {				
		Integer opc = 0;
		do {
			opc = menu();
			ArrayList<Double> ent = Menuent();
			
			switch (opc) {
			case 1:
				Double data_soma[] = new Double[ent.size()];				
				for (int i = 0; i < ent.size(); i++) {
					data_soma[i] = ent.get(i);
				}		
				
				System.out.println(TipoEnt(data_soma));				
				
				soma s = new soma();
				System.out.println(s.calcula(data_soma));
				break;
				//-----------------------------------------
			case 2:
				Double data_sub[] = new Double[ent.size()];
				
				for (int i = 0; i < ent.size(); i++) {
					data_sub[i] = ent.get(i);
				}
				
				System.out.println(TipoEnt(data_sub));				
				
				Subtracao sub = new Subtracao();
				System.out.println(sub.calcula(data_sub));
				break;
				//------------------------------------------
			case 3:
				Double data_mul[] = new Double[ent.size()];
				
				for (int i = 0; i < ent.size(); i++) {
					data_mul[i] = ent.get(i);
				}
				
				System.out.println(TipoEnt(data_mul));				
				
				Multiplicacao m = new Multiplicacao();
				System.out.println(m.calcula(data_mul));
				break;
				//------------------------------------------
			case 4:
				Double data_div[] = new Double[ent.size()];
				
				for (int i = 0; i < ent.size(); i++) {
					data_div[i] = ent.get(i);
				}
				
				System.out.println(TipoEnt(data_div));				
				
				Divisao d = new Divisao();
				System.out.println(d.calcula(data_div));
				break;
				//------------------------------------------
			default:
				System.out.println("finalizando...");
				System.exit(0);
				break;
			}
		} while (opc != 0);		
	}
	
	public static Integer menu() {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append(" >>>>>Calculadora<<<<< \n");
		sb.append("Digite 1 para ferramenta de soma \n");
		sb.append("Digite 2 para ferramenta de subtracao \n");
		sb.append("Digite 3 para ferramenta de multiplicacao \n");
		sb.append("Digite 4 para ferramenta de divisao \n");
		sb.append("Digite 0 para encerrar \n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		return opc;
	}
	
	public static ArrayList<Double> Menuent() {
		ArrayList<Double> ent = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append(" entrada de dados\n");
		
		Integer usuCont = 0;
		do {			
			System.out.println("Digite o numero:");
			if (scan.hasNextDouble()) {
				ent.add(scan.nextDouble());
			}			
			if (ent.size() >= 2) {
				System.out.println("Voce deseja adicionar mais numero? 0 -sim | 1 -nao");
				usuCont = scan.nextInt();
			}
			
		} while (ent.size() < 2 || usuCont == 0);
		
		return ent;
	}
	
	public static String TipoEnt(Double[] ent) {
		Integer NentInt = 0;
		Integer NentFloat = 0;
		Integer NentDouble = 0;
		for (int i = 0; i < ent.length; i++) {
			
			double n = ent[i];
			
			if ((int) n == n) {
				NentInt++;
			} else if (Double.toString(n).split("\\.")[1].length() < 7) {
				NentFloat++;
			} else {
				NentDouble++;
			}			
		}
		
			if (NentInt > 0 && NentFloat == 0 && NentDouble == 0) {
			return "inteiro";
		}
			if ((NentInt > 0 || NentInt == 0) && NentFloat > 0 && NentDouble == 0) {
			return "float";
		}	
		return "double";
	}
}