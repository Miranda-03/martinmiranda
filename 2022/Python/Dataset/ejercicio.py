import requests


if __name__ == '__main__':

    archivo = open("hola.csv", "w")
    nombres_columnas = "mensaje , status \n"
    archivo.write(nombres_columnas)
    archivo.close()
    
    for i in range(30):
        respuesta = requests.get('https://api.chucknorris.io/jokes/random')
        respuesta.status_code
        informacion = respuesta.json()
        creado = informacion["created_at"]
        identificacion = informacion["id"]
        frase = informacion["value"]

        linea = creado + ";" + identificacion + ";" + frase + "\n"

        archivo = open("hola.csv", "a")
        archivo.write(linea)
        archivo.close()