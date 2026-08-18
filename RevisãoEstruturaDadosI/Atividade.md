O programa simula um sistema de sensores que registra medições de nível de água. Como o número de medições varia (o "engenheiro chefe não sabe se serão 5 ou 500"), o vetor não pode ter tamanho fixo definido em tempo de compilação — por isso se usa alocação dinâmica com malloc em vez de um array estático como int medidas[100].


#include <stdio.h>
#include <stdlib.h> //malloc, free, realloc

int main()
{
    int n, i;
    int *medidas;

    printf("O tamanho de int eh: %d \n", sizeof(int));
    printf("Quantas medições você deseja realizar hoje? ");
    scanf("%d", &n);

    //alocação dinamica de memoria
    medidas = (int*)malloc(n*sizeof(int));

    //verifica se a alocação teve sucesso
    if (medidas == NULL){
        printf("Sistema sem memória!");
        return 1;
    }

    for (i=0; i<n; i++){
        printf("Digite o valor da medição: ");
        scanf("%d", &medidas[i]);
    }

    printf("\n--- Medições registradas ---\n");
    for (i=0; i<n; i++){
        printf("%d - valor: %d - endereco: %p \n", i, medidas[i], (void*)&medidas[i]);
    }

    //liberar a memoria alocada
    free(medidas);
    medidas = NULL;

    return 0;
}
