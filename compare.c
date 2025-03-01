#include <stdio.h>
#include <stdlib.h>
int compare(const void *a,const void *b){
    return (*(int *)a - *(int *)b);
}

int main()
{
    int n[] ={3,-1,0,2};
    int size=sizeof(n)/sizeof(n[0]);
    int k=3,sum=0;
    qsort(n,size,sizeof(int),compare);
   
    if(n[0]<0){
        for(int i=0;i<=k;i++){
            n[i] = -n[i];
        }
        for(int i=0;i<size;i++){
            sum=sum+n[i];
        }
    }else{
        for(int i=0;i<=k;i++){
            n[0] = -n[0];
        }
        for(int i=0;i<size;i++){
            sum=sum+n[i];
        }
    }
    printf("%d",sum);

    return 0;
}

