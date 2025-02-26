def soma_recursiva(lista):
    if lista == []:
        return 0
    return lista[0] + soma_recursiva(lista[1:])

if __name__ == '__main__':
    print(soma_recursiva([1, 2, 3, 4, 5]))