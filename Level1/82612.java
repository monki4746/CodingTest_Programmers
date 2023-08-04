#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int price, int money, int count) {
    
    long totalprice = 0;
    
    for(int i=1; i<=count; i++) {
        totalprice += price * i; 
    }
    
    if (totalprice >money)
        return totalprice - money;
    
    else return 0;
}
