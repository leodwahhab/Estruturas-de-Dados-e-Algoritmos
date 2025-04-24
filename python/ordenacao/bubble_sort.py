import utils.generation_utils as util
import time

def bubble_sort(lista):
    for i in range(len(lista)):
        for j in range(len(lista)-1-i):
            if lista[j] > lista[j+1]:
                lista[i], lista[j] = lista[j], lista[i]
    return lista

if __name__ == '__main__':
    lista = util.random_int_array(100, 1, 10000)
    print(lista)

    print('--- executando o bubble sort --- ')
    inicio = time.time()

    nova_lista = bubble_sort(lista)

    fim = time.time()
    print('lista ordenada: ' + str(nova_lista))

    print(fim - inicio)
