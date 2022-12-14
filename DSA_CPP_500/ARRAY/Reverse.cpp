#include <bits/stdc++.h>
using namespace std;
int main(){
    int arr[]={1,2,3,4,5};
    
    int l=sizeof(arr)/sizeof(int);
    //reverse(arr,arr+l); can use reverse function like this
    for(int i=0;i<l/2;++i){
        int temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;
    }
    for(auto it:arr){
        cout<<it;
    }
}
