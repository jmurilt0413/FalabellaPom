# language: es

Característica: Validar la compra de un celular en Falabella
  Yo como usuario de Falabella
  deseo comprar un celular
  para verificar el estado del resumen de la orden

  Escenario: Validar el resumen de la orden para la compra de un celular
    Dado que René ingresa a la página Falabella desde el buscador de Google
    Cuando René busca por celulares
    E inicia una intención de compra para un '<Referencia celular>' con seguro '<Cobertura>'
    Entonces el resumen de la orden es
      | Referencia celular                | Marca  | Valor total | Valor celular | Valor seguro | Cantidad de productos | Codigo  | Cobertura           |
      | Celular xiaomi redmi 9 32gb verde | XIAOMI | 477.800     | 427.900       | 49.900       | 1                     | 9763388 | Asegura tu Pantalla |
