class Solution {
    public void setZeroes(int[][] matrix) {
        
        //BRUTEFORE 
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){
//                     int ind=i-1;
                    
//                     while(ind>=0){
//                         if(matrix[ind][j]!=0){
//                         matrix[ind][j]=-9999;
//                         }   ind--;
//                        }
//                     ind=i+1;
//                     while(ind<matrix.length){
//                         if(matrix[ind][j]!=0){
//                         matrix[ind][j]=-9999;
//                         }ind++;
//                     }
//                     ind=j-1;
//                     while(ind>=0){
//                         if(matrix[i][ind]!=0){
//                         matrix[i][ind]=-9999;
//                         }   ind--;
//                        }
//                     ind=j+1;
//                     while(ind<matrix[0].length){
//                         if(matrix[i][ind]!=0){
//                         matrix[i][ind]=-9999;
//                         }ind++;
//                     }
                    
                        
//                     }
//                 }
//             }
        
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==-9999){
//                     matrix[i][j]=0;
//                 }
//             }
//         }      
        
        //BETTER APPROCH
        // int n=matrix.length,m=matrix[0].length;
        // int[] row=new int[n];
        // int[] col=new int[m];
        // for(int i=0;i<n;i++){
        //     row[i]=1;
        // }for(int j=0;j<m;j++){
        //     col[j]=1;
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==0){
        //             row[i]=0;
        //             col[j]=0;
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(row[i]==0 || col[j]==0){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
        int col=1,n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0) col=0;
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
                
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=1;j--){
                if(matrix[i][0] ==0|| matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col==0) matrix[i][0]=0;
        }
    }
}
