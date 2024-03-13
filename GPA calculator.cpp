//
//  main.cpp
//  GPA calculator
//
//  Created by Kamisha  on 5/23/22.
//

#include <iostream>
using namespace std;
int main(){
    string fst, lst, semester;
    int num;
    cout << "Hello! Please enter your first and last name: ";
    cin >> fst >> lst;
    //cout << endl;
    cout << "Which semester am I calulating? ";
    cin >> semester;
    cout << "For " << semester << " how many classes did you take? ";
    cin >> num;
    string clas[num];
    cout << "List the classes you took \n";
    for(int i = 0; i < num; i++){
        cin >> clas[i];
    }
    double earned[num];
    for(int i = 0; i < num; i++){
        cout << "Enter credit earned for " << clas[i] << " ";
        cin >> earned[i];
    }
    cout << endl;
    int maxcredit = 0;
    int max[num];
    for(int i = 0; i < num; i++){
        cout << "Enter the max unit for " << clas[i] << " ";
        cin >> max[num];
        maxcredit += max[num];
    }
    //cout << endl;
    int sumEarned = 0;
    
    for(int i = 0; i < num; i++){
        sumEarned+= earned[i];
    }
    /*for(int i = 0; i < num; i++){
        maxcredit+= max[i];
    }*/
    double GPA = (double)sumEarned/maxcredit;
    cout << endl;
    cout << "Sum of credit earned: " << sumEarned << "\n";
    cout << "Sum of max unit: " << maxcredit << "\n";
    cout << "Your current GPA is: " << (double)GPA << ".\n";
    if( GPA <= 4.0 && GPA >= 2.0){
                cout << "You're on the right track " << fst << "." << endl;
            }
    else cout << "You've got some work to do " << fst << "." << endl;
    return 0;
}
