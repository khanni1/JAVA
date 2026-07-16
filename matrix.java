class Matrix{

// assuming the matrices are not jagged as its not like that in mathematics for matrices
    int mat1[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };

    int mat2[][] = {
        {10,20,30},
        {40,50,60},
        {70,80,90},
    };

    public static void main(String args[]){

        Matrix m = new Matrix(); // so i can use non static methods of class into static main 

       int[][] mat3 = m.addMat(m.mat1,m.mat2);
       m.printMat(mat3);
    }

    private int[][] addMat(int mat1[][],int mat2[][]){

        if(mat1.length != mat2.length || mat1[0].length != mat2[0].length){
            return null;
        }
        
        // int mat3[mat1.length][mat1[0].length];

        int[][] mat3 = new int[mat1.length][mat1[0].length];

        int i=0,j=0; 

        for(i=0 ; i<mat1.length ; i++){
            for(j=0 ; j<mat1[0].length;j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    return mat3;

    }

    private void printMat(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
}



}