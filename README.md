# BasicPizza Bedlam kata

Diseña el código que te permita modelar el menú del restaurante BasicPizza Bedlam y las promociones. Utiliza diferentes clases para representar los productos y su coste.

Debemos calcular el precio de cada pizza.

Por ejemplo, una Prosciutto cuesta 12.00 euros y una Prosciutto con Champiñones y Salsa picante cuesta 13.80

### Nuestras pizzas:

- MARGHERITA  9,30€
  Tomate, mozzarella y albahaca

- PROSCIUTTO  12,00€
  Tomate, mozzarella, jamón dulce y orégano

- PROSCIUTTO E FUNGHI  12,50€
  Tomate, mozzarella, jamón dulce, champiñones y orégano

- 4 STAGIONI   12,50€
  Tomate, mozzarella, jamón dulce, champiñones, alcachofas, olivas y orégano


### Ingredientes y extras

- **Ingredientes Básicos (+0.90€/c.u.)**
  Jamón dulce, Extra Queso Mozzarella, Tomate Natural, Champiñones, Alcachofas, Atún

- **Gourmet (+1.20€/c.u.)**
  Olivas, Alcaparras, Jamón Serrano, Pollo

- **Premium (+2.20€/c.u)**
  Anchoas, salmón, ternera picada

- **Salsa Barbacoa (+1.00€)**

- **Salsa Picante (+0.90€)**

- **Borde relleno de queso (+1.20€)**

## Requisito avanzado

Cada pizza debe generar un ticket con el precio y el nombre.

Por ejemplo, una `Prosciutto e Funghi con extra de queso y extra de anchoas` deberá generar el siguiente ticket:

```
   PROSCIUTTO E FUNGHI   12,50€
    + EXTRA QUESO         0,90€
    + EXTRA ANCHOAS       2,20€
   _____________________________
   TOTAL                 15,60€
```