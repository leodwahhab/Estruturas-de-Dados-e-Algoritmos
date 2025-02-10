import time
import utils.generation_utils as util

def selection_sort(lista):
    for i in range(len(lista)):
        for j in range(i+1, len(lista)):
            if lista[i] > lista[j]:
                lista[i], lista[j] = lista[j], lista[i] 
    return lista

if __name__ == '__main__':
    lista = util.random_int_array(100, 1, 10000)
    print('lista: ' + str(lista))

    print('--- executando o selection sort --- ')
    inicio = time.time()

    nova_lista = selection_sort(lista)

    fim = time.time()
    print('lista ordenada: ' + str(nova_lista))

    print(fim - inicio)

