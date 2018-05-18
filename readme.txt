EJERCICIO ADAPTADOR

Se está construyendo el software controlador para diversas opciones de Motores en Automóviles. Actualmente se posee controladores para dos tipos de motores: MotorComun y MotorEconomico. En ambos casos la interface de sus controladores ofrecen las mismas operaciones:
Encender() Acelerar() Apagar()
La empresa automotriz está considerando un nuevo tipo de MotorElectrico. El proyecto es experimental y se desea continuar con la misma línea de automóviles pero ahora con la posibilidad de incorporar este tipo de Motor no contaminante. El fabricante (japonés) del MotorElectrico provee a sus usuarios un controlador software que posee las siguientes operaciones en su interface:
Conectar() Activar() moverMasRapido() detener() desconectar()
Ofrezca un diseño, basado principalmente en el patrón Adaptador para implementar un diseño orientado a objetos que maneje estos requisitos.
CASOS DE PRUEBA:
Implemente tres escenarios de prueba que demuestren el correcto funcionamiento de su aplicación. Los escenarios deberán demostrar para cada motor su funcionamiento con las operaciones siguiente:
•	Configurar el automóvil con un cierto tipo de motor.
•	Encender el automóvil
•	Acelerar el automóvil
•	Apagar el automóvil
ENTREGABLES:
•	Entregue la vista estructural de su diseño.
•	Entregue las corridas para cada tipo de motor (1 documento Word)
•	Entregue la liga del repositorio GIT de su proyecto.

PARA REFLEXIONAR: Algunos automóviles actuales ofrecen un diseño de motor que permite incluir dos tipos de motores (de gasolina y eléctrico) para mayor eficiencia. En este tipo de automóvil, cuando se ha terminado la batería para el motor eléctrico entra en operación el motor a gasolina. ¿Podría extenderse su diseño para incluir este tipo de motor? ¿
