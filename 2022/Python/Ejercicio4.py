set = []

for i in range(3):
    nombre = input("Poner nombre: ")
    set.append(nombre)

for nombre in set[:]:
    if nombre[0] == "a" or nombre[0] == "A":
        set.remove(nombre)

print(set)
