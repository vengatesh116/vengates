#include<stdio.h>
#include<conio.h>
void main()
{
int a,pair,i,j,count=0;
clrscr();
printf("\n enter the number of students:");
scanf("%d",&a);
pair=2*a;
for(i=0;i<pair;i++)
{
for(j=i+1;j<=pair;j++)
 {
 printf("\n%d\t%d\n",i,j);
 count++;
 }  }
 printf("the daily walk combination is %d",count);
 getch();
}