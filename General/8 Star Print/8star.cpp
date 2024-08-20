/*Print an 8  in star after taing the number  of rows from the user */

#include<iostream>

using namespace std;

int main(){

int row;
cout<<"Enter the number of rows: ";
cin>>row;
cout<<endl<<endl;
for(int i=1;i<=row;i++){

    if(i==1 || i==row){
        cout<<" ";
        for(int j=1;j<=row-2;j++){
            cout<<"*";
        }
        cout<<" "<<endl;
    }else{
        cout<<"*";
        for(int j=1;j<=row-2;j++){
            cout<<" ";
        }
        cout<<"*"<<endl;
    }
}

for(int i=1;i<=row-1;i++){
   if(i==row-1){
        cout<<" ";
        for(int j=1;j<=row-2;j++){
            cout<<"*";
        }
        cout<<" "<<endl;
   }else{
        cout<<"*";
        for(int j=1;j<=row-2;j++){
            cout<<" ";
        }
        cout<<"*"<<endl;    
   }


}

return 0;

}