#include <stdio.h>

int Factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * Factorial(n - 1);
    }
}

void Run(int n) {
    printf("%d! = %d \n", n, Factorial(n));
}

int main(void) {
    for (int i = 1; i < 10; i++) {
        Run(i);
    }
    return 0;
}
