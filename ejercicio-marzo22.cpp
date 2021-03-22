#include <iostream>
#include <vector>

using namespace std;

int main(){

    vector<string> palabras;
    string palabra;

    cout<<"ingresar palabras"<<endl;

    for(int h = 0; h < 6; h++){
        cin>>palabra;
        palabras.push_back(palabra);    
    }

    for(int y = 0; y < palabras.size(); y++){

        if(y%2==0){
        cout<<palabras[y]<<"-";
        }
    }

    cout<<" "<<endl;

     for(int y = 0; y < palabras.size(); y++){

        if(y%2!=0){
        cout<<palabras[y]<<"-";
        }
    }
    
}