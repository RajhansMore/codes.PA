#include<stdlib.h>
#include<stdio.h>
#include<iostream>
using namespace std;




int main()
{
 int arr[5];  //static memory allocation
 int *P = NULL;
 p = (int *)malloc(5 * sizeof(int)); // dynamic allocation using malloc
 
 int * q = NULL;
 q = (int *)calloc(5,sizeof(int));  // dynamic allocation using calloc

 int X = NULL;
 X = new int [5];

 free(p);
 free(p)

 delete [] X;
 
    return 0;
}