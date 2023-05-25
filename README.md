# LigaApp

El presente proyecto es una aplicación para dispositivos Android que permita a los usuarios acceder y obtener información sobre diversos equipos que pertenecen a la Premier League de Inglaterra. Para lograr esto, se ha empleado la API pública proporcionada por **TheSportsDB**.

La aplicación cuenta con varias funcionalidades. En primer lugar, al abrir la aplicación, se mostrará una vista de bienvenida. Luego,la vista principal de la aplicación se ha diseñado para mostrar todos los equipos de la liga. En esta vista, se exhibirá información relevante de cada equipo, incluyendo su nombre, estadio y su insignia distintiva. Esta presentación permitirá a los usuarios tener una visión general de los equipos de su liga preferida de manera rápida y sencilla.

Al tocar un equipo en particular, los usuarios serán redirigidos a una vista detallada que ofrecerá información más completa y específica sobre dicho equipo. En esta vista, se mostrará el nombre del equipo, una descripción que proporciona una visión más profunda sobre su historia y características, así como el año en que fue fundado. Además, se exhibirán la insignia y la camiseta del equipo para que los usuarios puedan apreciar su diseño y colores distintivos. En caso de que el equipo tenga una página web o perfiles en redes sociales, se proporcionarán enlaces directos que permitirán a los usuarios acceder a estas plataformas con un simple clic.

Durante el desarrollo de este proyecto, se ha puesto especial énfasis en la aplicación de conceptos de **Programación Orientada a Objetos (POO)**, así como en el manejo efectivo de la API REST proporcionada por **TheSportsDB**. Además, se han considerado los patrones de arquitectura como **MVVM, Clean Architecture e inyeccion de dependencias** para garantizar una estructura sólida y modular en el código, mejorando así su mantenibilidad y escalabilidad.


## Pantallas

| Splash | Home | Details
|--|--|--|
| <img src="images/splash.png" width="200px"> | <img src="images/home.png" width="200px"> | <img src="images/details.png" width="200px"> | 


------------

## Librerias usadas

#### Jetpack
- [android ktx](https://developer.android.com/kotlin/ktx "android ktx"): Es un conjunto de extensiones de Kotlin que se incluyen con Android Jetpack y otras bibliotecas de Android.
- activity: Acceso a Compose sobre la clase Activity.
- [compose](https://developer.android.com/jetpack/androidx/releases/compose?hl=en "compose"): Es un moderno kit de herramientas declarativas de IU para Android.
- [lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle "lifecycle"): Realiza  acciones en respuesta a un cambio en el estado del ciclo de vida de otro componente, como actividades y fragmentos.
- [navigation-compose](https://developer.android.com/jetpack/compose/navigation "navigation-compose"): Ayuda a navegar entre destinos composables. 
- [compose-foundation](https://developer.android.com/jetpack/androidx/releases/compose-foundation "compose-foundation"):  Útil para la creación de carusel horizontal en la vista de detalle.

#### Procesos asíncronos
- [coroutines](https://kotlinlang.org/docs/coroutines-overview.html "coroutines"): Perfectas para ejecución de tareas asíncronas o no bloqueantes

#### Imágenes
-  [coil](https://coil-kt.github.io/coil/ "coil"): Permite la carga de imágenes alojadas en servicios externos para Android respaldada por Kotlin Coroutines

#### Inyección de dependencias
- [dagger-hilt](https://dagger.dev/hilt/ "dagger-hilt"): Proporciona una forma estándar de incorporar la inyección de dependencia de Dagger en una aplicación de Android.

#### Integración API Rest 
- [retrofit2](https://square.github.io/retrofit/ "retrofit2"): Es un cliente HTTP.
- [converter-gson](https://github.com/square/retrofit/tree/master/retrofit-converters/gson "converter-gson"): Es un convertidor que usa Gson para la serialización hacia y desde JSON.
