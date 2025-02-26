def count_lista(lista):
    if lista == []:
        return 0
    return 1 + count_lista(lista[1:])

if __name__ == '__main__':
    print(count_lista([1, 2, 3, 4, 5]))