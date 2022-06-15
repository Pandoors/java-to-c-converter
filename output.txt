#include<stdio/h>
using namespace std;
int toInt(double x){
int ret = x % 1 ;
return ret;
}
int Main(){
//przykładowy komentarz
double a;
a = 2.99 ;
int test = a % 1 ;
if(test < 0 || test > 10 ){
test++;
}
else if(test > 0 && test < 10 ){
test--;
}
return 0 ;
}

