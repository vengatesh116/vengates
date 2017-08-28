#include <stdio.h>
#include <conio.h>
void hanoi(char,char,char,int);
void main()
{
int x;
clrscr();
printf("Enter the disks: ");
scanf("%d",&x);
printf("\nTOWER OF HANOI FOR %d NUMBER OF DISKS:", x);
hanoi('A','B','C', x);
getch();
}
void hanoi(char a,char b,char c,int d)
{
if(d<=0)
printf("\nEnter the number of disks");
if(d==1)
printf("\nMove disk from %c to %c",a,c);
if(d>1)
{
hanoi(a,c,b,d-1);
hanoi(a,b,c,1);
hanoi(b,a,c,d-1);
}
}