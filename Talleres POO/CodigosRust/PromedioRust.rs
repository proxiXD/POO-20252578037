fn main() {
    let numeros = vec![10.0, 20.0, 30.0, 40.0, 50.0];

    let suma: f64 = numeros.iter().sum();
    let cantidad = numeros.len();

    let promedio = suma / cantidad as f64;

    println!("El promedio es: {}", promedio);
}