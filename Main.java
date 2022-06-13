import java.util.*;

class Main {
  public static void main(String[] args) {
    int [][] grid = new int [4][3]; //create empty (4,3) 2d integer array
    for (int r = 0; r < grid.length; r++)
      {
        for (int c  = 0; c<grid[0].length; c++)
          {
            grid[r][c] = r*c;
          }
      }

    for (int r = 0; r < grid.length; r++)
      {
        for (int c  = 0; c<grid[0].length; c++)
          {
            System.out.print(grid[r][c] + "\t");
          }
        System.out.println();
      }

    System.out.println();

    Scanner it = new Scanner (System.in);
    String [][] grades = new String [6][3]; //create empty (6,3) 2d String array
    for (int r = 0; r < grades.length; r++)
      {
        System.out.println("Enter three grades for hour " + (r+1));
        for (int c  = 0; c<grades[0].length; c++)
          {
            grades[r][c] = it.nextLine();
            //System.out.print(grades[r][c] + "\t");
          }
        System.out.println();
      }

    //printing 2D array (String data)
    for (String[] array : grades) //outer loop iterates through each row
    {
      for (String element : array) //inner loop prints each column's strings for the row
        {
          System.out.print(element + " ");
        }
      System.out.println();
    }
    
  }
}