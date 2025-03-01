public class Main
{
public static void main(String[] args) {
   int[][] a={ {1,2,3,4,5,6},
               {7,8,9,10,11,12},
               {13,14,15,16,17,18},
               {19,20,21,22,23,24},
               {25,26,27,28,29,30},
               {31,32,33,34,35,36}
             };
   int row=a.length;
   int col=a[0].length;
   int top=0;
   int bt=row-1;
   int lt=0;
   int rt=col-1;
   
   while(lt<=rt & top<=bt){
       
       for(int i=lt;i<=rt;i++){
           System.out.print(a[top][i]+" ");
           
       }
       top++;
       for(int j=top;j<=bt;j++){
           System.out.print(a[j][rt]+" ");
           
       }
       rt--;
       for(int k=rt;k>=lt;k--){
           System.out.print(a[bt][k]+" ");
           
       }
       bt--;
       for(int l=bt;l>top;l--){
           System.out.print(a[l][lt]+" ");
           
       }
       lt--;
   }
}
}
