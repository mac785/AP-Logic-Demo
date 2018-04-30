public class LogicDemo{
	
	public static void main(String[] args){
		displayNot();
		displayAnd();
		displayOr();
		displayAAndTrue();
		displayAOrTrue();
		displayAAndFalse();
		displayAOrFalse();
		displayAAndNotA();
		displayAOrNotA();
		displayDistributeOr();
		displayDistributeAnd();
		displayDeMorgan1();
		displayDeMorgan2();
	}
	/**
	 * creates a row of dashes, with a "+" at the tab stops
	 * @param N - how long the resulting string should be
	 * @return - a string composed of hyphens ("-"), with "+" signs at locations 0, 8, 16, etc., with total length N.
	 */
	
	public static String getNDashes(int N){
		String result = "";
		for (int i=0; i<N; i++)
			if (i%8 == 0)
				result+= "+";
			else
				result+= "-";
		return result;
	}
	
	/**
	 * displays a truth table of A and not A.
	 * +-------+-------+
	 * | A     | !A    |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	
	public static void displayNot(){
		System.out.println("##################################################");
		System.out.println("Not");
		System.out.println(getNDashes(17));
		System.out.println("|   A\t| not A\t|");
		System.out.println(getNDashes(17));
		//some sort of loop.... that creates a boolean variable "A" and iterates through all possible values of A.
			// in this loop, you'll print out the following...
			//System.out.println("| "+A+"\t| "+!A+"\t|");
		boolean A;
		for(int i=0;i<2;i++){
			A = i%2==1;
			System.out.println("| "+A+"\t| "+!A+"\t|");
		}
		
		System.out.println(getNDashes(17)); // bottom of chart.
		
	}
	/**
	 * displays a truth table of A, B, and A && B
	 * +-------+-------+-------+
	 * | A     | B     | A&&B  |
	 * +-------+-------+-------+
	 * | false | false | ????? |
	 * | false | true  | ????? |
	 * | true  | false | ????? |
	 * | true  | true  | ????? |
	 * +-------+-------+-------+
	 */
	
	public static void displayAnd(){
		System.out.println("##################################################");
		System.out.println("And");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| B\t| A&&B\t|");
		System.out.println(getNDashes(25));
		//some sort of nested loop.... that creates boolean variables "A" and "B" and iterates through all possible combinations of A,B.
			// in this loop, you'll print out the following...	
//			System.out.println("| "+A+"\t|" +B+"\t| "+(A&&B)+"\t|");
		boolean A;
		boolean B;
		for(int i=0;i<2;i++){
			for(int x=0;x<2;x++){
				A = i%2==1;
				B = x%2==1;
				System.out.println("| "+A+"\t|" +B+"\t| "+(A&&B)+"\t|");
			}
		}
		System.out.println(getNDashes(25));
		
	}
	/**
	 * displays a truth table of A, B, and A || B
	 * +-------+-------+-------+
	 * | A     | B     | A||B  |
	 * +-------+-------+-------+
	 * | false | false | ????? |
	 * | false | true  | ????? |
	 * | true  | false | ????? |
	 * | true  | true  | ????? |
	 * +-------+-------+-------+
	 */
	
	public static void displayOr(){
		System.out.println("##################################################");
		System.out.println("Or");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| B\t| A||B\t|");
		System.out.println(getNDashes(25));
		//some sort of nested loop.... that creates boolean variables "A" and "B" and iterates through all possible combinations of A,B.
			// in this loop, you'll print out the following...	
//			System.out.println("| "+A+"\t|" +B+"\t| "+(A&&B)+"\t|");
		boolean A;
		boolean B;
		for(int i=0;i<2;i++){
			for(int x=0;x<2;x++){
				A = i%2==1;
				B = x%2==1;
				System.out.println("| "+A+"\t|" +B+"\t| "+(A||B)+"\t|");
			}
		}
		System.out.println(getNDashes(25));
		
	}
	/**
	 * displays a truth table of A and (A && true).
	 * +-------+-------+
	 * | A     | A&&T  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	
	public static void displayAAndTrue(){
		System.out.println("##################################################");
		System.out.println("A and True");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A&&T\t|");
		System.out.println(getNDashes(17));
		
		boolean A;
		for(int i=0;i<2;i++){
			A = i%2==1;
			System.out.println("| "+A+"\t|"+(A&&true)+"\t|");
		}
		System.out.println(getNDashes(17));
	}
	/**
	 * displays a truth table of A and (A || true).
	 * +-------+-------+
	 * | A     | A||T  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	
	public static void displayAOrTrue(){
		System.out.println("##################################################");
		System.out.println("A or True");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A||T\t|");
		System.out.println(getNDashes(17));
		
		boolean A;
		for(int i=0;i<2;i++){
			A = i%2==1;
			System.out.println("| "+A+"\t|"+(A||true)+"\t|");
		}
		System.out.println(getNDashes(17));
	}
	/**
	 * displays a truth table of A and (A && false).
	 * +-------+-------+
	 * | A     | A&&F  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	
	public static void displayAAndFalse(){
		System.out.println("##################################################");
		System.out.println("A and False");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A&&F\t|");
		System.out.println(getNDashes(17));
		
		boolean A;
		for(int i=0;i<2;i++){
			A = i%2==1;
			System.out.println("| "+A+"\t|"+(A&&false)+"\t|");
		}
		System.out.println(getNDashes(17));	
	}
	/**
	 * displays a truth table of A and (A || false).
	 * +-------+-------+
	 * | A     | A||F  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	
	public static void displayAOrFalse(){
		System.out.println("##################################################");
		System.out.println("A or False");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A||F\t|");
		System.out.println(getNDashes(17));
		
		boolean A;
		for(int i=0;i<2;i++){
			A = i%2==1;
			System.out.println("| "+A+"\t|"+(A||false)+"\t|");
		}
		System.out.println(getNDashes(17));
	}
	/**
	 * displays a truth table of A and (A && !A).
	 * +-------+-------+-------+
	 * | A     | !A    | A&&!A |
	 * +-------+-------+-------+
	 * | false | ????? | ????? |
	 * | true  | ????? | ????? |
	 * +-------+-------+-------+
	 */
	
	public static void displayAAndNotA(){
		System.out.println("##################################################");
		System.out.println("A and !A");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| !A\t| A&&!A\t|");
		System.out.println(getNDashes(25));
		
		boolean A;
		for(int i=0;i<2;i++){
			A = i%2==1;
			System.out.println("| "+A+"\t|"+!A+"\t|"+(A&&!A)+"\t|");
		}
		System.out.println(getNDashes(25));
	}
	/**
	 * displays a truth table of A and (A || !A).
	 * +-------+-------+-------+
	 * | A     | !A    | A||!A |
	 * +-------+-------+-------+
	 * | false | ????? | ????? |
	 * | true  | ????? | ????? |
	 * +-------+-------+-------+
	 */
	
	public static void displayAOrNotA(){
		System.out.println("##################################################");
		System.out.println("A or !A");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| !A\t| A||!A\t|");
		System.out.println(getNDashes(25));
		
		boolean A;
		for(int i=0;i<2;i++){
			A = i%2==1;
			System.out.println("| "+A+"\t|"+!A+"\t|"+(A||!A)+"\t|");
		}
		System.out.println(getNDashes(25));
	}
	/**
	 * displays a truth table of A, B, C, (B && C), (A || B), (A || C), (A || (B && C))
	 * 
	 * D=B&&C, E = A||B, F = A||C, G = A || (B&&C), H = E && F
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | C     | D     | E     | F     | G     | H     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	
	public static void displayDistributeOr(){
		System.out.println("##################################################");
		System.out.println("Distribution of Or");
		System.out.println("D = A || (B&&C), E = (A||B)&&(A||C)");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| C\t| B&&C\t| A||B\t| A||C\t| D\t| E\t|");
		System.out.println(getNDashes(65));
		
		boolean A;
		boolean B;
		boolean C;
		
		for(int i=0;i<2;i++){
			for(int x=0;x<2;x++){
				for(int y=0;y<2;y++){
					A = i%2==1;
					B = x%2==1;
					C = y%2==1;
					System.out.println("| "+A+"\t|"+B+"\t|"+C+"\t|"+(B&&C)+"\t|"+(A||B)+"\t|"+(A||C)+"\t|"+(A||(B&&C))+"\t|"+((A||B)&&(A||C))+"\t|");
				}
			}
		}
		System.out.println(getNDashes(65));
	}
	/**
	 * displays a truth table of A, B, C, (B || C), (A && B), (A && C), (A && (B || C))
	 * 
	 * D=B||C, E = A&&B, F = A&&C, G = A && (B||C), H = E || F
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | C     | D     | E     | F     | G     | H     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	
	public static void displayDistributeAnd(){
		System.out.println("##################################################");
		System.out.println("Distribution of And");
		System.out.println("D = A && (B||C), E = (A&&B)||(A&&C)");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| C\t| B||C\t| A&&B\t| A&&C\t| D\t| E\t|");
		System.out.println(getNDashes(65));
		
		boolean A;
		boolean B;
		boolean C;
		
		for(int i=0;i<2;i++){
			for(int x=0;x<2;x++){
				for(int y=0;y<2;y++){
					A = i%2==1;
					B = x%2==1;
					C = y%2==1;
					System.out.println("| "+A+"\t|"+B+"\t|"+C+"\t|"+(B||C)+"\t|"+(A&&B)+"\t|"+(A&&C)+"\t|"+(A&&(B||C))+"\t|"+((A&&B)||(A&&C))+"\t|");
				}
			}
		}
		System.out.println(getNDashes(65));
	}
	/**
	 * displays a truth table of A, B, !A, !B, (A||B), !(A||B), (!A || !B), (!A && !B)
	 * 
	 * C=(A||B), D = !(A||B), E = (!A || !B), F = (!A && !B)
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | !A    | !B    | C     | D     | E     | F     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	public static void displayDeMorgan1(){
		System.out.println("##################################################");
		System.out.println("DeMorgan's Law 1");
		System.out.println("C = !(A||B), D = (!A||!B), E = (!A&&!B)");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| !A\t| !B\t| A||B\t| C\t| D\t| E\t|");
		System.out.println(getNDashes(65));
		
		boolean A;
		boolean B;
		for(int i=0;i<2;i++){
			for(int x=0;x<2;x++){
				A = i%2==1;
				B = x%2==1;
				System.out.println("| "+A+"\t|"+B+"\t|"+!A+"\t|"+!B+"\t|"+(A||B)+"\t|"+!(A||B)+"\t|"+(!A || !B)+"\t|"+(!A && !B)+"\t|");
			}
		}
		System.out.println(getNDashes(65));
	}
	/**
	 * displays a truth table of A, B, !A, !B, (A&&B), !(A&&B), (!A || !B), (!A && !B)
	 * 
	 * C=(A&&B), D = !(A&&B), E = (!A || !B), F = (!A && !B)
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | !A    | !B    | C     | D     | E     | F     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	public static void displayDeMorgan2(){
		System.out.println("##################################################");
		System.out.println("DeMorgan's Law 2");
		System.out.println("C = !(A&&B), D = (!A&&!B), E = (!A||!B)");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| !A\t| !B\t| A&&B\t| C\t| D\t| E\t|");
		System.out.println(getNDashes(65));
		
		boolean A;
		boolean B;
		for(int i=0;i<2;i++){
			for(int x=0;x<2;x++){
				A = i%2==1;
				B = x%2==1;
				System.out.println("| "+A+"\t|"+B+"\t|"+!A+"\t|"+!B+"\t|"+(A&&B)+"\t|"+!(A&&B)+"\t|"+(!A && !B)+"\t|"+(!A || !B)+"\t|");
			}
		}
		System.out.println(getNDashes(65));
	}
}