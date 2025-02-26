from collections import deque

def pessoa_e_vendedor(nome):
    return nome[-1] == 'm'

def pesquisa_em_largura(fila_de_pesquisa):
    verificadas = [] # cria uma lista para armazenar pessoas ja verificadas
    while True:
        pessoa = fila_de_pesquisa.popleft()
        if(not pessoa in verificadas): # verifica se a pessoa não está na lista de pessoas ja verificadas, afim de evitar duplicações de amigos em comum 
            if(pessoa_e_vendedor(pessoa)): # verifica se a pessoa eh vendedora de manga
                print('vendedor de manga encontrado! ' + pessoa + ' eh o nome dele')
                return False # retorna false para parar o loop
            else: # caso não seja vendedora de manga
                fila_de_pesquisa += grafo[pessoa] # adiciona os amigos da pessoa na fila
            verificadas.append(pessoa) # adiciona pessoa na lista de verificadas
        
if __name__ == '__main__':
    
    #criacao e população da tabela hash 'grafo'
    grafo = {}
    grafo['voce'] = ['alice','bob','claire']
    grafo['bob'] = ['anuj','peggy']
    grafo['alice'] = ['peggy']
    grafo['claire'] = ['thom', 'jhonny']
    grafo['anuj'] = []
    grafo['peggy'] = []
    grafo['thom'] = []
    grafo['jhonny'] = []
    

    fila_de_pesquisa = deque()
    fila_de_pesquisa += grafo['voce']
    
    pesquisa_em_largura(fila_de_pesquisa=fila_de_pesquisa)