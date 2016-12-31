#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    long long start, end, prod, length, half, reminder, newNumOne = 0, newNumTwo = 0, power, count =0;
    scanf ("%lld %lld", &start, &end);
    
    for(long long i=start;i<=end;i++){
        if(i==1){
           printf("%lld ", i); 
            count++;
        }
            
        
        newNumOne = 0;
        newNumTwo = 0;
        power = 0;
        prod = i*i;
        length = (1+ (long long)log10(prod));
        
        if(length % 2 == 0){
            half = length /2;
        }
        else{
            half = (length/2)+1;
        }
        
        if(length>1){
            for(long long j=0;j<half;j++){
                reminder = prod%10;
                newNumOne = newNumOne + (reminder * pow(10, j));
                prod/=10;
            }
            
            for(long long j=half-1;j<length;j++){
                reminder = prod%10;
                newNumTwo = newNumTwo + (reminder * pow(10, power++));
                prod/=10;
            }
        }
        
        if(newNumOne!=0){
            if((i==(newNumTwo + newNumOne))){
                printf("%lld ", i);
                count++;
            }
        }

        
        //printf("number: %lld digits: %d half: %d part one: %d part two: %d", i*i, (1+ (int)log10(i*i)), half, newNumOne, newNumTwo);
        //printf("\n");
        
    }
    //printf("%lld ", count);
    if(count==0){
        printf("INVALID RANGE");
    }
    return 0;
}