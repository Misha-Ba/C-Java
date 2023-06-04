#include <iostream>
using namespace std;
int main(){
    int b[8][8] {0}, r, c = -1;
    int count = 1;
    
    // next column
    nc: c++;
    if(c == 8) goto print;
    r = -1;
    
    //next row
    nr: r++;
    if(r == 8) goto backtrack;
    
    //row test
    for(int i = 0; i < c; i++)
        if(b[r][i] == 1) goto nr;
    
    //up diagonal test
    for(int i = 0; (r-i) >= 0 && (c - i) >= 0; i++)
        if(b[r-i][c-i] == 1) goto nr;

    //down diagonal test
    for(int i = 1; (r + i) < 8 && (c - i) >= 0; i++)
        if(b[r + i][c - i] == 1) goto nr;
        
    b[r][c] = 1;
    goto nc;
    
    //backtracking
    backtrack:
    c--;
    if(c == -1) return 0;
    r = 0;
    while(b[r][c] != 1)
        r++;
    b[r][c] = 0;
    goto nr;
    
    //print
    print:
    cout << "Solution:" <<count++  << endl;
    for(int r = 0; r < 8; r++){
        for(int c = 0; c < 8; c++){
            cout << b[r][c];
        }
        cout << endl;
    }
    cout << endl;
    goto backtrack;
    return 0;
}
