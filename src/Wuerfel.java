
public class Wuerfel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int eins =0;
//int zwei=0;
//int drei=0;
//int vier=0;
//int fünf=0;
//int sechs=0;
//
//		for(int x=0;x<50;x++) {
//			int a = Zufall.getZufallInt(1, 6);
//			switch(a) {
//			case 1:eins++; break;
//			case 2:zwei++; break;
//			case 3:drei++; break;
//			case 4:vier++; break;
//			case 5:fünf++; break;
//			case 6:sechs++; break;
//
//			}
//							}
//		System.out.println(eins);
//		System.out.println(zwei);
//		System.out.println(drei);
//		System.out.println(vier);
//		System.out.println(fünf);
//		System.out.println(sechs);
		
		int [] wuerfelergebnis=new int [7];
		for(int x=0;x<50;x++) {
			int a = Zufall.getZufallInt(1, 6);
			wuerfelergebnis[a]=wuerfelergebnis[a]+1;
		}
		for(int x =1;x<7;x++) {
			System.out.println(wuerfelergebnis[x]);
		}
	}

}
