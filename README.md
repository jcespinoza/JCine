JCine
=====

Proyecto de Programacion II - JCine. El  nombre es una mezcla de Java y Cine. No tiene nada que ver con que uno de los autores se llame JuanCarlos :D.

******************************
***Lineamientos para editar:**
******************************
-Prohibido editar archivos de otro autor sin aviso. Para evitar conflictos con cambios que quiza el otro esta haciendo.
-Rebase master al menos una vez al dia.
-Hacer pull requests cuando haya cambios de por lo menos 50 lineas de codigo nuevo.


******************************************
***********Plan de la aplicacion**********
******************************************
-#Primero habra una ventana con la opciona para entrar al modulo administrativo y entrar al modulo cliente que es donde se compra tickets.
 -{En el modulo administrativo se debe entrar con una cuenta Administrador valida para proceder al siguiente nivel de menu donde se encuentran:
   -Agregar sala: aqui se revisara el codigo de la sala anterior si hubo una para aumentar el sufijo numerico, si es la primera ser· 0.
    Se debe obtener del usuario el numero de filas que se representara con Letras de la A a la Z, y el numer maximo de sillas por fila.
	Esta informacion servira para crear un objeto Sillero, un componente visual que se puede insertar en un JFrame que sirve PARA DISEÒAR
	el Layout de la Sala. Dado que hay dos tipos de Sillas (Silla4Design y Silla4Tickets) en el constructor especificaremos el Tipo de sillero.
	Una vez creado el objeto, el usuario manipulando el sistema podra ir ocultando sillas que no existen en la realidad, cuando Èl acepte los cambios,
	Se guardar· ese mismo objeto sillero pero con tipo PARA TICKETS, esto porque las sillas para tickets tiene nueva funcionalidad que no tienen las Sillas4Design.
	Consulatr el JavaDoc de estos objetos para mas informacion.
	Tambien se necesita saber el tipo de sala (3D o 2D). Si es 3D se necesita saber si es DIGITAL, REAL3D o EXTREME3D.
	Dependiendo de esa informacion crearemos un objeto Sala3D o Sala2D. El tipo de sala 3D se envia en el constructor. Ahi tambien se incializan los precios por default.
   -Agregar Pelicula