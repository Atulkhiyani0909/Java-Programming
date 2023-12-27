#include<iostream>
using namespace std;
int main(){
      int t1=0;
      int t2=1;
      int newnum=0;
      for(int i=0;i<50;i++){
            newnum=t1+t2;
            t1++;
            t2++;
            cout<<newnum<<endl;

      }
}