/*
 * O programa simula um sistema de sensores que registra medições de nível de água.
 * Como o número de medições varia conforme a necessidade, utiliza alocação dinâmica de memória.
 */

#include <stdio.h>
#include <stdlib.h> // Contém as funções de alocação de memória: malloc, free, realloc

int main()
{
    int n, i;
    int *medidas;

    printf("O tamanho de int eh: %ld \n", sizeof(int));
    printf("Quantas medições você deseja realizar hoje? ");
    scanf("%d", &n);

    // Alocação dinâmica de memória usando malloc (aloca bloco contíguo na Heap)
    medidas = (int*)malloc(n * sizeof(int));

    // Verifica se a alocação foi bem-sucedida
    if (medidas == NULL){
        printf("Sistema sem memória!\n");
        return 1;
    }

    for (i = 0; i < n; i++){
        printf("Digite o valor da medição: ");
        scanf("%d", &medidas[i]);
    }

    printf("\n--- Medições registradas ---\n");
    for (i = 0; i < n; i++){
        printf("%d - valor: %d - endereco: %p \n", i, medidas[i], (void*)&medidas[i]);
    }

    // Liberação da memória alocada dinamicamente com free para evitar vazamentos (memory leak)
    free(medidas);
    medidas = NULL;

    return 0;
}
