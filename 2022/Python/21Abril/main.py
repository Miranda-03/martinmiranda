import pandas as pd

df = pd.read_csv("portacion-armas-fuego.csv",engine="python")

df = df.drop(df.index[300:1012])

print(list(df.columns))

dfFilas = df.loc[[1, 5, 12, 36]]

elegirColumna = input("nombre de columna: ")

print(df[elegirColumna])

df = df.set_index('documento')
df = df.drop_duplicates()
df.to_csv("nuevo.csv")

	