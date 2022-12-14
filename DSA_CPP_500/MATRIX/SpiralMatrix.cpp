#include <bits/stdc++.h>
using namespace std;
int main(){
    int arr[6][6]={{1,2,3,4,5,6},
          {7,8,9,10,11,12},
          {13,14,15,16,17,18},
          {19,20,21,22,23,24},
          {25,26,27,28,29,30},
          {31,32,33,34,35,36}};
        int m=sizeof(arr)/sizeof(arr[0]);
        
        int n=sizeof(arr[0])/sizeof(arr[0][0]);
       cout<<m<<endl<<n;
        int count=0;
        int rstart=0;
        int cend=n;
        int rend=m;
        int cstart=0;
        for(count=0;count<(m*n);){
           for(int a=cstart;a<cend;++a) {  cout<<arr[rstart][a]<< " ";  count++; if(count==(m*n)) break;} 
           for(int b=rstart+1;b<rend;++b) {  cout<<arr[b][cend-1]<<" ";  count++; if(count==(m*n)) break;} 
           for(int c=cend-2;c>=cstart;c--) {  cout<<arr[rend-1][c]<<" ";  count++; if(count==(m*n)) break;} 
           for(int d=rend-2;d>=rstart+1;d--) {  cout<<arr[d][rstart]<<" ";  count++; if(count==(m*n)) break;} 
           rstart++;
           cend--;
           rend--;
           cstart++;
        }
}
