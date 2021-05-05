
#include <vector>
#include <iostream>
#include "ejercicios.h"

using namespace std;

int main() {

    vector<int> a;
    a.push_back(1);
    a.push_back(2);
    a.push_back(3);
    cout << "tamaño del vector: " << a.size() << endl;
    imprimirValores(a);
    
    a.pop_back();
    a.pop_back();
    cout << "tamaño del vector: " << a.size() << endl;
    imprimirValores(a);
    
    int n = 2;
    
    esPar(n);
    todosSonPares(a);
    
    int p;
    vector<int> b};
    for(int t = 0; t < 3; t++){
    	con>>p;
    	b.push_back(p);
    }
    
    agregarNumeros(a, b);
    imprimirValores(a);
	

    return 0;
}
