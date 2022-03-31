lista = []

for i in range(1000):
    lista.append(i)

largo = len(lista)

for i in range(largo):
    if lista[i] % 2 == 0:
        lista.append(i)

print(lista)
