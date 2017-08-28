#include <stdio.h>

int main()
{
int num,i,k=0,sum[10],t=1,a;
scanf("%d",&num);
a=num;
while(num!=0)
{
    sum[k++]=num%10;
    num=num/10;
}
for(i=0;i<k;i++)
{
    t=t*sum[i];
}
printf("%d",t*a);
    return 0;
}