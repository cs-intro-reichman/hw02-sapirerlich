/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		Integer times = Integer.parseInt(args[0]);
		Integer all_childrens  = 0;
		Integer two_child_fam = 0;
		Integer three_child_fam = 0;
		Integer four_plus_child_fam = 0;
		Integer gender;
		String mode="";
		for ( int i = 0 ; i < times ; i++){
			boolean is_boy = false;
			boolean is_girl = false;
			int childrens=0;
			while (is_boy == false || is_girl == false) {
				gender=(int)(Math.random()*2);
				if (gender==0){
							is_boy=true;
						}
						else{
							is_girl=true;
						}
				childrens++;
			}
			
			all_childrens = all_childrens + childrens;
			if (childrens==2){
				two_child_fam++;
			}
			else if (childrens==3){
				three_child_fam++;
			}
			else{
				four_plus_child_fam++;
			}
		}
		if (two_child_fam>=three_child_fam && two_child_fam>=four_plus_child_fam ){
			mode="2";
		}
		else if (three_child_fam>=two_child_fam && three_child_fam>=four_plus_child_fam ){
			mode="3";
		}
		else{
			mode="4 or more.";
		}
		double avg_childrens = (double)all_childrens / times;
		System.out.println("Average: "+avg_childrens+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+two_child_fam);
		System.out.println("Number of families with 3 children: "+three_child_fam);
		System.out.println("Number of families with 4 or more children: "+four_plus_child_fam);
		System.out.println("The most common number of children is "+mode);


		

	}
}
