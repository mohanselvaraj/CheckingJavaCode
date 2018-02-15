package com.basic.programs;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int countOfRows = 6;
		int row =1;
		int midRow = countOfRows/2;
		for(int i=midRow;i>0;i--){
			for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
			}
			for(int j=1;j<=row;j++ ){
				System.out.print("* ");
		     }
			/////?
			
			row++;
			System.out.println();
		}
		}
	}


