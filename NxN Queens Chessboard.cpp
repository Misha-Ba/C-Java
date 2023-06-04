#include <iostream>
#include <cmath>
using namespace std;
bool ok(int q[], int c){ 
    //c is the current col
    for(int i = 0; i < c; i++){
        if(q[c] == q[i] || (c-i) == abs(q[c] - q[i])) return false;
    }
    return true;
}
void print(int q[]){
    for(int i = 0; i < 8; i++){
        for(int j = 0; j < 8; j++){
            if(q[i] == j) cout << "1 ";
            else cout << "0 ";
        }
        cout << endl;
    }
    cout << endl;
}
int queens(int n){
    int* q = new int[n]; //get space using dynamic mem
    q[n-1] = {0};
    int col = 0;
    q[0] = 0;
    int solution = 0;
    while(col >= 0){
        //check whether or not you're on the board horizontally (cols)
        if(col > (n-1)){
             solution++;
            col--; //backtrack;
            q[col]++; //find next available position/ increments row
        }
        //check that we are not off the board vertically (rows)
        if(q[col] > (n-1)){
            //reset rows and backtrack
            q[col] = 0;
            col--;
            if(col != -1) q[col]++; 
        }
        else if(ok(q, col)) col++; 
        else{
            q[col]++;
        }
    }
    delete q; //delete array
    return solution;
}

int main(){
    int userinput = 0;
    cout << "Enter the number of queens: ";
    cin >> userinput;
    for(int i = 1; i <= userinput; i++){
        cout << i << ". There are " << queens(i) << " solutions to the " << i << " queens problem.\n";
    }
    return 0;
}


