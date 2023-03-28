# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  22/23)
Autor/a: Antonio Silva Enamorado   uvus: antsilena

El dataset trata sobre un conjunto de coches con sus respectivas caracteristicas.

## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.coche**: Paquete que contiene los tipos del proyecto.
  * **fp.coche.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
    * **Coches.csv**: Añade una descripción genérica del dataset.
    
## Estructura del *dataset*

El dataset está compuesto por 20 columnas, con la siguiente descripción:

* **Constructor**: de tipo String, representa al constructor del vehiculo.
* **Modelo**: de tipo String, representa el nombre del modelo de vehiculo.
* **Ventas en miles**: de tipo Integer, representa las ventas en miles del vehiculo en cuestion.
* **Valor de la reventa tras 4 años**: de tipo Double, representa el porcentaje del valor original del vehiculo por el que se venderia a los 4 años.
* **Tipo Vehiculo**: de tipo Boolean, true si es Passenger (de pasajeros) y false si es car (vehiculo comercial).
* **Precio en miles**: de tipo Double, representa el precio del vehiculo en miles.
* **Tamaño motor**: de tipo Double, representa los centimetros cubicos (cc) del motor.
* **Caballos**: de tipo Integer, representa los caballos del vehiculo.
* **Distancia entre ejes**: de tipo Double, representa la distancia entre ejes del vehiculo.
* **Ancho**: de tipo Double, representa el ancho del vehiculo.
* **Largo**: de tipo Double, representa el largo del vehiculo.
* **Peso**: de tipo Double, representa el peso del vehiculo en toneladas.
* **Capacidad de gasolina**: de tipo Double, representa la capacidad de gasolina.
* **Eficiencia de Gasolina**: de tipo Integer, representa la eficiencia de la gasolina u otro compuesto en el vehiculo.
* **Ultimo lanzamiento**: de tipo LocalDate, representa la ultima fecha de lanzamiento del vehiculo.
* **Color1**: de tipo String, representa el color 1 del coche.
* **Color2**: de tipo String, representa el color 2 del coche.
* **Color3**: de tipo String, representa el color 3 del coche.
* **Color4**: de tipo String, representa el color 4 del coche.
* **Color5**: de tipo String, representa el color 5 del coche.

## Tipos implementados


### Coche

**Propiedades**:

- _constructor_ , de tipo  _String_ , consultable. 
- _modelo_ , de tipo  _String_ , consultable. 
- _ventasMiles_ , de tipo  _Integer_ , consultable y modificable. 
- _reventaValor_ , de tipo  _Double_ , consultable y modificable. 
- _esPasajeros_ , de tipo  _Boolean_ , consultable. 
- _precioMiles_ , de tipo  _Double_ , consultable y modificable.
- _tamanoMotor_ , de tipo  _Double_ , consultable y modificable.
- _caballos_ , de tipo  _Integer_ , consultable y modificable.
- _distanciaEjes_ , de tipo  _Double_ , consultable y modificable.
- _ancho_ , de tipo  _Double_ , consultable y modificable.
- _largo_ , de tipo  _Double_ , consultable y modificable
- _peso_ , de tipo  _Double_ , consultable y modificable.
- _capacidadGasolina_ , de tipo  _Double_ , consultable y modificable.
- _ultimoLanzamiento_ , de tipo  _LocalDate_ , consultable y modificable.
- _colores_ , de tipo  _List<Colores>_ , consultable y modificable.

**Constructores**: 

- C1: recibe un parámetro por cada propiedad básica del tipo..
- C2: recibe el constructor, el modelo, esPasajeros, el tamanoMotor, los caballos, la distanciaEjes, la capacidadGasolina y la eficienciaEjes. Se les da a todo el resto el valor por defecto null salvo a ultimoLanzamiento que se le da el dia de ayer y a colores que se les da los colores Blanco y Negro.


**Restricciones**:
 
- R1: constructor no puede ser null.
- R2: modelo no puede ser null.
- R3: reventaValor tiene que ser menor que 100.
- R4: precioMiles no puede ser menor o igual que 0.
- R5: ventasMiles no puede ser menor que 0.
- R6: tamanoMotor tiene que estar entre los valores 1 y 6 (ambos inclusive).
- R7: ultimoLanzamiento no puede ser posterior al dia de hoy.


**Criterio de igualdad**: Se tienen en cuenta todas las propiedades del tipo.

**Criterio de ordenación**: Solo se tienen en cuenta el constructor y el modelo para el orden natural.

**Otras operaciones**:
 
-	_toString()_ : Representacion como cadena con todos las propiedades.
-	_pasajerosComercial()_ : Nos devuelve un String que lo usaremos en nuestra propiedad derivada descripcionEnPortalDeVenta().
-	_mesesEsp()_ : Nos devuelve un String con el nombre del mes en espanol tras nosotros haberselo dado en formato numerico y la usaremos en descripcionEnPortalDeVenta().
-	_descripcionEnPortalDeVenta()_ : Nos devuelve un String con la descripcion que tendria el vehiculo en un portal de venta online usando en el las dos operaciones anteriores.


### Tipo Contenedor - EstudioCoches
Clase contenedora de los objetos de tipo Coche.
**Propiedades**:
-  _coches_ , de tipo _List<Coche>_ , consultable. Lista de coches.
-  _nombre_ , de tipo _String_ , consultable. Nombre del contenedor.
 
**Constructores**: 
- C1: Constructor por defecto. Crea un objeto de tipo EstudioCoches sin ningun coche almacenado y con nombre.
- C2: Constructor con un parámetro de tipo Stream\<Coche\>. Crea un objeto de tipo EstudioCoches con los coches incluidos en el Stream dado.

**Criterio de igualdad**: Dos contenedores de coches son iguales si lo son sus propiedades coches.

**Otras operaciones**:
- _Integer getNumeroCoches(Coche c)_ : Devuelve el numero de coches en el conjunto _coches_.
- _void añadeCoches(Coche c)_ : Añade un coche c al conjunto _coches_ .
- _void eliminaCoches(Coche c)_ : Elimina un coche dado del conjunto _coches_ .
- _Boolean contieneCoche(Coche c)_ : Devuelve true si el coche c esta en el conjunto _coches_ .
- _String toString()_ : Devuelve la representacion como cadena de EstudioCoches.
- _Boolean existeVehiculosMasXEuros(Double precio)_ : Devuelve true si existe un coche con un precio superior al dado en la variable _precio_ .
- _Double mediaProporciones(Boolean esPasajeros)_ : Devuelve la media de proporciones calculado previamente en la funcion _proporciones_ .
- _List<String> masDeXCaballos(Integer numCaballos)_ : Devuelve una lista de los modelos de coches que tengan mas de la variable _numCaballos_ caballos.
- _Map<String,Set<String>> ConstructorModelos()_ : Devuelve un map que tiene como clave el constructor y como valor una lista de los modelos del constructor clave.
- _Map<String,Integer> numeroVentasConstructor()_ : Devuelve un map con los constructores como clave y el numero de ventas (en miles) por constructor.


