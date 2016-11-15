package packageKristyandRay;

import java.util.Scanner;

public class Kristy {

	static Scanner in;
	public static void main(String[] args){
		connect4();
	}
	public static void connect4(){
		in = new Scanner(System.in);
		String[][] arr = new String[8][8];
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[0].length; j++){
				arr[i][j] = " ";
			}
		}
		while(true){
			RayGUInWIN.printBoard(arr);
			System.out.println("Which column?");
			int input = Integer.parseInt(in.nextLine());
			if(input <= arr[0].length-1 && input > -1){
				int row = arr.length-1;
				while(arr[row][input].equals("o")){
					row--;
					if(row < 0){
						System.out.println("This column is full.");
						break;
					}
				}
				if(row > -1){
					arr[row][input] = "o";
				}
			}
		}
	}

}
