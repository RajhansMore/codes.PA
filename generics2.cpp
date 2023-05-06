#include<iostream>

using namespace std;

template <class T>  // template haeder 
T Addition(T i, T j) // T -template argument
{
    T result;
    result = i + j; 
    return result;

}
int main()
{
    int i;
    float f;
    double d;

    i = Addition(10,11);
    cout<<i<<"\n";

    f = Addition(10.7f,89.5f);
    cout<<f<<"\n";

    d = Addition(10.7,70.8);
    cout<<d<<"\n";

    return 0;
}