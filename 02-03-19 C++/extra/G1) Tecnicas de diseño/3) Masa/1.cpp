#include <iostream>
using namespace std;



//values
float presion,volumen,temperatura,masa;

main(){
//reqest data
cout<<"Ingrese el valor de presion"<<endl;
cin>>presion;
cout<<"Ingrese el volumen"<<endl;
cin>>volumen;
cout<<"Ingrese la temperatura"<<endl;
cin>>temperatura;

//operation
masa = (presion * volumen)/(0.37 * (temperatura + 460));

//print on screen
cout<<"El valor de la masa es "<<masa;

	
return 0;
}
