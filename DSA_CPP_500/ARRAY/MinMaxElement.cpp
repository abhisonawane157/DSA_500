#include <bits/stdc++.h>
using namespace std;
pair<int,int>  f(int arr[],int l,int r){
    pair<int,int>mmf,mml,mmr;
    if(l==r){mmf.first=arr[l],mmf.second=arr[l]; return mmf;}
    if(r==l+1){ if(arr[l]>arr[r]){mmf.first=arr[r];mmf.second=arr[l];}
    else {mmf.first=arr[l];mmf.second=arr[r];}return mmf;}
    int mid=l+(r-l)/2;
    mml=f(arr,l,mid);
    mmr=f(arr,mid+1,r);
    mmf.first=min(mml.first,mmr.first);
    mmf.second=max(mml.second,mmr.second);
    return mmf;

}
int main(){
    int arr[]={2,35,35,3451,23,423,4,234,23,423,9};
    pair<int,int>mm;
    int l=0,r=sizeof(arr)/sizeof(int);
    mm=f(arr,l,r-1);
    cout<<mm.first<<" "<<mm.second;
}
