#include <iostream>
#include <cmath>
using namespace std;
 
void printCross(int cross[]){
    static int sol = 1;
    cout << "Solution " << sol++ << ": \n";
    cout << " " << cross[0] << cross[1] << endl;
    cout << cross[2] << cross[3] << cross[4] << cross[5] << endl;
    cout << " " << cross[6] << cross[7] << endl;
    cout << endl;
    return;
}
 
bool alreadyPlaced(int q[], int c){ /* row test */
    for(int i = 0; i < c; i++){
        if(q[c] == q[i]) return true; //if 2 diff. rows have the same number
    }
    return false;
}
 
bool okAdjacent(int q[], int c){ // position 0; -1 is a sentinel value (to stop checking)
    static int checkArray[8][5] = { {-1},               //position 0
                                    {0, -1},            //position 1
                                    {0, -1},            //position 2
                                    {0, 1, 2, -1},      //position 3
                                    {0, 1, 3, -1},      //position 4
                                    {1, 4, -1},         //position 5
                                    {2, 3, 4, -1},      //position 6
                                    {3, 4, 5, 6, -1} }; //position 7
    //adjcent test aka diagonal
    for (int i = 0; checkArray[c][i] != -1; i++){
        if(abs (q[c] - q[checkArray[c][i]]) == 1) return false; //if in the diagonal = 1
    }
    return true;
}
 
bool ok(int q[], int col){ //passes both row and adj tests
    if (!alreadyPlaced(q, col) && okAdjacent(q, col))
        return true;
    return false;
}
 
int main() {
 
    int q[8] = {1,1,1,1,1,1,1,1}, col = 0;
    // Start at the first position in the cross
    // while we have not backtracked beyond the first index
    while (col >= 0){ //col != -1?
       
        // If we have exceed our last index
        if (col > 7){
            printCross(q);// printCross
            // backtrack
            col--;
            q[col]++;
        }
       
        // If we have run out of numbers to try
        if(q[col] > 8){
            q[col] = 1;// reset & backtrack
            col--;
            if (col != -1) q[col]++;
        }
       
        // if the number we place is okay
        else if (ok(q, col) == true){
            col++;  // Move to the next index
        }
        else{
            q[col]++; // increment the current index/row
        }
    }
    return 0;
}