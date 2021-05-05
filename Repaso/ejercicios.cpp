include "ejercicios.h"
#include <iostream>

bool esPar(int n){
    if(n%2==0){
    	return 1;
    }
    else{
    	return 0;
    }
}

bool todosSonPares(vector<int> numeros){
    int y = 0;
    while(y < numeros.size()){
    	if(numeros[y]%2!=0){
    		break;
    	}
    	y++;
    }
    if(y == numeros.size()){
    	return 1;
    }
    else{
    	return 0;
    }
}

void agregarNumeros(vector<int> &numeros, vector<int> elementosNuevos){
    for(int u=0; u < elementosNuevos.size(); u++){
    	numeros.push_back(elementosNuevos[u]);
    }
}

void imprimirValores(vector<int> numeros){
    for(int k = 0; k < numeros.size(); k++){
    	cout<<numeros[k];
    }
}

vector<vector<int> > multiplicarMatriz(vector<vector<int> > matriz){

}

void mezclarMatrices(vector<vector<int> > matrizA, vector<vector<int> > matrizB){

}
