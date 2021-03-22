#include <iostream>
#include <vector>

using namespace std;

int main(){
    vector<string> productos;
    vector<int> precios;

    string producto;
    int precio;
    string cont;

    while(1){

        cout<<"producto: ";
        cin>>producto;
        cout<<"precio: ";
        cin>>precio;

        productos.push_back(producto);
        precios.push_back(precio);

        cout<<" "<<endl;

        cout<<"¿continuar? y (si), n (no): ";
        cin>>cont;
        if(cont == "n"){
            break;
        }

    }

    for(int u = 0; u < precios.size(); u++){
        cout<<productos[u]<<", precio: "<<precios[u]<<endl;;
    }

    int pri_precio = precios[0];

    if(precios.size() > 0){

    for(int y = 1; y < precios.size(); y++){
         pri_precio = pri_precio + precios[y];
    }

    }

    cout<<"Total: "<<pri_precio<<endl;

}