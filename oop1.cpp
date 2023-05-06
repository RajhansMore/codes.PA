//class = characteristics = behaviours 
//class = data + functions 


#include<iostream>
using namespace std;

class demo
{ 
  public:
   int no1;
   int no2;

   void fun()
   {
      cout<<"inside fun\n";
   }
};
int main()
{
 
 demo obj1;
 demo obj2;

 cout<<"size of object: "<<sizeof(obj1)<<"\n",
 obj1.no1=10;
 obj2.no1=20;

 obj2.no1=30;
 obj2.no2=40;

 obj1.fun();
 obj2.fun();
 
 cout<<obj1.no2<<"\n";

    return 0;
}