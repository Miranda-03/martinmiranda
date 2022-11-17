import pandas as pd
from folium import Map,Marker
import re

ubicaciones = pd.read_csv("oferta_gastronomica.csv")

ubicacion_de_buenos_aires = [-34.603722, -58.381592]
mapa = Map(location=ubicacion_de_buenos_aires, zoom_start=12 )

for lat, long, n, c, dir, tel, b in zip(ubicaciones.lat, ubicaciones.long, ubicaciones.nombre, ubicaciones.cocina, ubicaciones.direccion_completa, ubicaciones.telefono, ubicaciones.barrio):
    x = re.findall("`", n)
    if x:
        n = n.replace('`', "'")
    latitud = lat
    longitud = long
    marcador = Marker( location=[latitud,longitud],
    popup=f"<h4>{dir}</h4> <br> <h6>{tel}</h6> <br> <h6>{b}</h6>",
    tooltip=f"{n} <br> {c}",)
    mapa.add_child(marcador)



mapa.save('mapa_con_ubicaciones.html')