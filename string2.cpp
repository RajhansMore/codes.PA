#include<iostream>
using namespace std;

int strlenX(char str[]) //int strlenX(char *Str)
{
 int iCnt = 0;
 while(*str != '\0')
 {
  iCnt++;
  str++;
 }
 return iCnt;
}

int main()
{
 char Arr[10];
 int iRet = 0;

 cout<<"enter your first name : "<<"\n";
 cin>>Arr;

 iRet = strlenX(Arr);

 cout<<"lenght of name is : "<<iRet<<"\n";


    return 0;
}    