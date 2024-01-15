#include "stdio.h"

int main(void) {
    for (i = 1;i<n;i++) {
        for (j = i+1;j<=n;j++){
            if (score[i] < score[j]) {
                temp = score[i];
                scorep[i] = score[j];
                score[j] = temp;
            }
        }
    }
}