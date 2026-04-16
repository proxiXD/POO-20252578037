# ejercicio 1A
def subir_nivel(self):
    self.nivel += 1
    self.hp += 10

for p in equipo:
    if p is not None and p.nivel < 10:
        p.subir_nivel()

#EJERCICIO 2A
def contar_personajes(tablero):
    return sum(1 for fila in tablero
                 for celda in fila
                 if celda is not None)

#EJERCICIO 3A
total_hp = sum(p.hp for p in gremio if p.estado == 'activo')
print(f'HP total activos: {total_hp}')

#EJERCICIO 4A
for p in gremio:              # seguro si solo MODIFICAMOS, no eliminamos
    if p.nivel < 5:
        p.estado = 'inactivo'
        print(f'Inactivado: {p.nombre}')

#ejercicio 5
g = GremioRPG('tsm')
p1 = Personaje('Aragorn', 12, 130)
p2 = Personaje('Legolas', 11, 110)
p3 = Personaje('Gandalf', 15, 150)
p4 = Personaje('Moon', 10, 140)
p5 = Personaje('Frodo', 6, 70)
p6 = Personaje('Sam', 5, 65)
p7 = Personaje('Meliodas', 9, 120)
p8 = Personaje('Gwen', 13, 100)
for p in [p1,p2,p3,p4,p5,p6,p7,p8]: g.unirse_al_equipo(p)
g.colocar_en_dungeon(p1,0,0); g.colocar_en_dungeon(p2,0,2)
g.colocar_en_dungeon(p3,1,1); g.colocar_en_dungeon(p4,2,0)
p1.hp = 0; p2.hp = 0  # simulacion de derrota
g.unirse_al_equipo(p1)  # ya estaba en el equipo, esta linea no aplica
g.limpiar_caidos()  # elimina p1 y p2 con hp=0
g.reporte_gremio()