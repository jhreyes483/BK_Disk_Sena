#include <iostream>
using  namespace std;
int aSueldo, percent;

main(){
	
	//datos de entrada
	cout<<"Ingrese su sueldo anterios "<<endl;
	cin>>aSueldo;
	
	
	percent=((aSueldo*0.25)+aSueldo);
	
	cout<<"El valor del sueldo con el increneto del 25% es"<<percent;
	
	
	
	
	
	return 0;
}
