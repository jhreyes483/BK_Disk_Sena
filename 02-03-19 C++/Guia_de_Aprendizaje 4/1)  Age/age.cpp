#include <iostream>
using namespace std;
int age,aNacimiento,aActual;

main(){


//request data
cout<<"ingrese el ano de nacimiento  ";
cin>>aNacimiento;
cout<<"ingrese el ano actual  ";
cin>>aActual;

age= aActual-aNacimiento;

//operation and prin on screen
if (age>=18) {
	cout<<"Usted es mayor de edad  ";
}else { cout<<"Usted es menor de edad  ";
}
 
 //prin on screen
cout<<"Su edad es "<<age;

	
	return 0;
}
