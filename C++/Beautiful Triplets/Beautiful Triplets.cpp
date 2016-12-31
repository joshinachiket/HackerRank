#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int len, a, b, c, count = 0, one, two;
    scanf("%d",&len);
    int numbers[len];
    int bDiffe;
    scanf("%d",&bDiffe);
    for(int i = 0; i < len; i++){
       scanf("%d",&numbers[i]);
    }

    for(int i=0;i<len-2;i++){
        for(int j=i+1;j<len-1;j++){
            a = numbers[i];
            b = numbers[j];
            
            if((b-a)==bDiffe){
                for(int k=j+1;k<len;k++){
                c = numbers[k];
                two = c-b;
                if((c-b) == bDiffe){
                    count++;
                    break;
                }
            }
                break;
            }
 
        }
    }
    
    printf("%d", count);
    
    return 0;
}