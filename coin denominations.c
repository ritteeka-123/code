#include <stdio.h>

void findMinCoins(int coins[], int n, int amount) {
    int count[n];
    for (int i = 0; i < n; i++) {
        count[i] = 0;
    }

    for (int i = n - 1; i >= 0; i--) {
        while (amount >= coins[i]) {
            amount -= coins[i];
            count[i]++;
        }
    }

    printf("Minimum number of coins:\n");
    for (int i = 0; i < n; i++) {
        if (count[i] != 0) {
            printf("%d coin(s) of %d\n", count[i], coins[i]);
        }
    }
}

int main() {
    int coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};
    int n = sizeof(coins) / sizeof(coins[0]);
    int amount;

    printf("Enter the amount: ");
    scanf("%d", &amount);

    findMinCoins(coins, n, amount);

    return 0;
}
