#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define BOLD "\e[1m"
#define WHITE "\e[7m"
#define BLUE "\e[44m"
#define NORMAL "\e[0m"

void int2bits(int x) {
  // Número de bits de un entero
  int num_bits = sizeof(int)*8;
  char rep[num_bits];
  int mask = 1;

  printf("%sRepresentación binaria de %s%d%s\n", BOLD, WHITE, x, NORMAL);

  // Cómputo de la representación binaria de x por medio de bit-shifting 
  for(int i=0; i < num_bits; i++, x >>=1)
    rep[i] = (char)(x & mask);

  // Impresión de índices
  for(int i=num_bits-1; i >= 0; i--)
    printf("%2d ", i);
  printf("\n");

  // Impresión de los bits
  for(int i=num_bits-1; i >= 0; i--)
    printf("%s%s%2d %s", BOLD, BLUE, rep[i], NORMAL);
  printf("\n\n");
}


unsigned int sra(unsigned int x, int k) {
    unsigned int xsra;
    if(x<0){
        for(int i = 0; i < k; i++){
            xsra = (int) x >> 1;
        }
    }
    else{
        xsra = (int) x >> k;
    }
    return xsra;
}
unsigned int srl(int x, int k) {
    unsigned int xsrl;
    if(x < 0){
        for(int i = 0; i < k; i++){
            xsrl = (unsigned int) x >> 1;
            x||(pow(2,31));
        }
    }
    else{
        xsrl = (unsigned int) x >> k;
    }
    return xsrl;
}

int main(){
    int x;
    unsigned int x2;
    int k;
    scanf("%d", &x);
    scanf("%d", &k);
    scanf("%ud", &x2);

    int2bits(x);
    printf("despl arit:\n");
    int2bits(sra(x,k));
    printf("despl log:\n");
    int2bits(srl(x,k));
    int2bits(x2);
    printf("despl arit:\n");
    int2bits(sra(x2,k));
    printf("despl log:\n");
    int2bits(srl(x2,k));
    return 0;
}