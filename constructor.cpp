#include<iostream>
using namespace std;

class demo
{
 public:
   int no1;
   int no2;

   demo()   // default constructor 
   {
    no1 = 0;
    no2 = 0;
   }
    demo(int A, int B)  //parametrised constructor
    {
      cout<<"inside parametrised constructor\n";
      no1 = A; 
      mo2= B;
    }
 void fun()
 {
    cout<<"inside fun\n";,
 }
   void gun()
 {
    cout<<"inside gun\n";,
 }

};

int main()
{

 demo obj1;

  cout<<"value of no1 from obj 1 is : "<<obj1.no1"\n";

  cout<<"value of no2 from obj 1 is : "<<obj1.no2"\n";

    return 0;
}