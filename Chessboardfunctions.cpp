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

int main(){
    int board[8] = {0}, col = 0;
    board[0] = 0;
    int count = 1;
    while(col >= 0){
        //check whether or not you're on the board horizontally (cols)
        if(col > 7){
            cout << "Solution " << count++ << ": \n";
            print(board); //print the board
            col--; //backtrack;
            board[col]++; //find next available position/ increments row
        }
        //check that we are not off the board vertically (rows)
        if(board[col] > 7){
            //reset rows and backtrack
            board[col] = 0;
            col--;
            //if(board[col] == -1) try the next row value;
            if(col != -1) board[col]++; //increments row
        }
        else if(ok(board, col)) col++; // if row works
        //try the next row
        else{
            board[col]++;
        }
    }
    return 0;
}

