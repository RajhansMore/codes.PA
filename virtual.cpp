#include<iostream>
using namespace std;
class base
{
   public:
    int a,b;
    
     void fun()  //1000
     {
        cout<<"inside fun of base"<<"\n";
     }

      void gun()  //2000
     {
        cout<<"inside gun of base"<<"\n";
     }

     void sun()  //3000
     {
        cout<<"inside sun of base"<<"\n";
     }

};

class derived : public base 
{
 public:
  int x,y;
       void fun()  //4000
     {
        cout<<"inside fun of derived"<<"\n";
     }

      void gun()  //5000
     {
        cout<<"inside gun of derived"<<"\n";
     }

     void sun()  //6000
     {
        cout<<"inside sun of derived"<<"\n";
     }


};

int main()
{
 base *bp = new base;               //no casting
 derived *dp = new derived;         //no casting  

 base *dp1 = new derived;           //up casting (allowed)
// derived *dp1 = new base;           //down casting (not allowed)

    return 0;
}