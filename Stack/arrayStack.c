/**
 * Implementação de uma pilha (Stack) em C usando arrays.
 * Uso de variáveis globais e ponteiros para facilitar a
 * implementação e manipulação.
 * 
 */

#include <stdio.h>

// Variáveis globais, para facilitar o uso das funções
int TOP = -1; int arr[4]; int *p = arr;
const int SIZE = sizeof(arr) / sizeof(arr[0]); // tamanho total do array em bytes / tamanho unitário

// Assinatura dos métodos
int pop();
int count();
int isEmpty();
int peek();
void push(int n);
void print();
void isFull();


int main() {

    push(7);
    push(14);
    push(21);
    push(28);

    print();

    printf("Peek = %d\n", peek());

    print();
    return 0;
}

int pop() {
    if(isEmpty() == 1) {
        printf("\nStack vazia");
        return 0;
    }

    int popped = *(p + TOP--);
    printf("Removendo %d\n", popped);
    // free(p + TOP); -> Não funciona pois o array é alocado estaticamente
    return popped;
}

int count() {
    return TOP == - 1 ? 0 : TOP + 1;
}

int isEmpty() {
    return TOP == - 1 ? 1 : 0;
}

int peek() {
    if(isEmpty() == 1) {
        printf("Stack vazia\n");
        return 0;
    }

    return *(p + TOP);
}

void push(int n) {
    if(TOP == SIZE - 1) {
        printf("Stack cheia\n");   
        return;
    }

    *(p + ++TOP) = n;
}

void isFull() {
    if(TOP == SIZE - 1) {
        printf("Stack cheia\n");   
    } else {
        printf("Stack nao esta cheia\n");
    }
}

void print() {

    if(isEmpty() == 1) {
        printf("Stack vazia\n");
        return;
    }

    for(int i = TOP ; i >= 0; i--) {
        printf("%d\n", *(p + i));
    }

    printf("null\n");
}


