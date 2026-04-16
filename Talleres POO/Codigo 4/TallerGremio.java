package taller.semana4;

//ejercicio 1A:
public void subirNivel() {
    this.nivel = this.nivel + 1;
    this.hp += 10;
}
// Recorrido:
for (int i = 0; i < equipo.length; i++) {
    if (equipo[i] != null && equipo[i].getNivel() < 10) {
        equipo[i].subirNivel();
    }
}

//EJERCICIO 2A
public static int contarPersonajes(Personaje[][] tablero) {
    int contador = 0;
    for (int f = 0; f < tablero.length; f++) {
        for (int c = 0; c < tablero[f].length; c++) {
            if (tablero[f][c] != null) {
               contador++;
            }
        }
    }
    return contador;
}

//Ejercicio 3A
int totalHP = 0;
for (Personaje p : gremio) {
    if (p.getEstado().equals("activo")) {
        totalHP += p.getHp();
    }
}
System.out.println("HP total activos: " + totalHP);

//EJERCICIO 4A
Iterator<Personaje> it = gremio.iterator();
while (it.hasNext()) {
    Personaje p = it.next();
    if (p.getNivel() < 5) {
        p.setEstado("inactivo");
        System.out.println("Inactivado: " + p.getNombre());
    }
}

//ejercicio 5:
GremioRPG g = new GremioRPG("tsm");

Personaje p1 = new Personaje("Aragorn", 12, 130);
Personaje p2 = new Personaje("Legolas", 11, 110);
Personaje p3 = new Personaje("Gandalf", 15, 150);
Personaje p4 = new Personaje("Moon", 10, 140);
Personaje p5 = new Personaje("Frodo", 6, 70);
Personaje p6 = new Personaje("Sam", 5, 65);
Personaje p7 = new Personaje("Meliodas", 9, 120);
Personaje p8 = new Personaje("Gwen", 13, 100);
//8 personajes

g.unirseAlEquipo(p1); g.unirseAlEquipo(p2); g.unirseAlEquipo(p3);
g.unirseAlEquipo(p4); g.unirseAlEquipo(p5); g.unirseAlEquipo(p6);
g.unirseAlEquipo(p7); g.unirseAlEquipo(p8); // p7 y p8 van a espera

g.colocarEnDungeon(p1, 0, 0); g.colocarEnDungeon(p2, 0, 2);
g.colocarEnDungeon(p3, 1, 1); g.colocarEnDungeon(p4, 2, 0);

p1.setHp(0);   // simulación de derrota
p2.setHp(0);
g.limpiarCaidos();
g.reporteGremio();