public class Erb_Problem2
{
   //This program will take two matrices and will perform Matrix subtraction
   public static void main(String[] args)
   {
        //Hardcoded matrices
        int[][] matrix1 = { {33, 2}, {7895, 204} };
        int[][] matrix2 = { {2, 30}, {5, 801} };
        
        //Calls the method to subtract the two matrices
        int[][] result = subtract(matrix1, matrix2);
        
        //Prints the result matrix
        for(int i=0; i<result.length; i++) 
        {
            for(int j=0; j<result[i].length; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) 
    {
         //Finds the sizes of the two matrices
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        //Creates the result arrary that will eventually be returned
        int[][] result = new int[rows][columns];
        
        //Loops throught the two arrays and subtracts the corresponding ints at the indexs
        for(int i=0; i<rows; i++) 
        {
            for(int j=0; j<columns; j++) 
            {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        //Returns the matrix
        return result;
    }
}