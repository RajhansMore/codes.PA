#include<stdio.h>
#include<stdlib.h>

int main()
{
 int Arr[5];    //static memory allocation
 int size = 0;
 int *ptr = NULL;
 printf("enter the size of array\n");  
 scanf("%d",&size);

 ptr = (int * )malloc(sizeof(int) * size);
    free(ptr);
    return 0;
}