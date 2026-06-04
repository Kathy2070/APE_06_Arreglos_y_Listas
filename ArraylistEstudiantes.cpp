#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {

    vector<string> estudiantes;
    string nombre;

    for(int i = 0; i < 5; i++) {
        cout << "Ingrese nombre del estudiante: ";
        getline(cin, nombre);
        estudiantes.push_back(nombre);
    }

    cout << "\nLista de estudiantes:\n";

    for(int i = 0; i < estudiantes.size(); i++) {
        cout << estudiantes[i] << endl;
    }

    return 0;
}
