def find_maior(lista):
    if len(lista) == 2:
        return lista[0] if lista[0] > lista[1] else lista[1]
    submax = find_maior(lista[1:])
    return lista[0] if lista[0] > submax else submax