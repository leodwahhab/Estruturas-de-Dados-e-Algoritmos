def buscaBinaria(lista, item):
    minimo = 0
    maximo = len(lista) - 1

    while minimo < maximo:
        meio = round((minimo + maximo) / 2)
        chute = lista[meio]

        if chute == item:
            return meio
        if chute > item:
            maximo = meio - 1
        else:
            minimo = meio + 1
    return None

    lista = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(buscaBinaria(lista, 3))