#include <stdio.h>

void main(){
    int num,r,sum=0,i;

    printf("Input a number: ");
    scanf("%d",&num);

    for(i=num;num!=0;num=num/10){
         r=num % 10;
         sum=sum*10+r;
    }
    printf("The number in reverse order is : %d \n",sum);
}