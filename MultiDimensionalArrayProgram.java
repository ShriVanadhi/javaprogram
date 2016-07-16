package javaapplication1;

public class MultiDimensionalArrayProgram {
    public static void main(String[] args){
        //Intializing the array variable num array
        int[] nums = {2,3,3486};
        //Print the array variable num[2]
        System.out.println(nums[2]);
        //Intializing the two dimensional array
         int[][] grid = {{2,3,8},
                       {1,7},
                       {32,2,86,23}
         };
         //Comment to print the value grid[0][2]
         System.out.println(grid[0][2]);
         //Comment to print the value grid[2][3]
         System.out.println(grid[2][3]);
         /**print the array value using for loop
          * grid.length returns the row length of grid
          * grid[row].length returns each row value
          */
         for(int row=0;row<grid.length;row++){
             for(int col=0;col<grid[row].length;col++){
                 /**
                  * Comment to print the value of grid[row][col]
                  * Write in the same line, \t represents space
                 */
                 System.out.print(grid[row][col] + "\t");
             }
             //print the second row in new line
             System.out.println();
         }
