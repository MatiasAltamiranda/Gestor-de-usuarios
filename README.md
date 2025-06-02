
# Proyecto integrador: Login y gestion de usuarios con roles

Este proyecto de práctica de TodoCode Academy consiste en un CRUD desarrollado utilizando JPA y una base de datos MySQL. A través de él, he aplicado los conceptos aprendidos en el curso, tales como:

- Gestión de interfaces y tablas mediante Swing.

- Principios de programación orientada a objetos.

- Uso de la Java Persistence API (JPA) para la manipulación de datos.

- Conexión y manejo de bases de datos MySQL.

- Programación en capas.

- Gestionar roles y permisos
  

Es una experiencia que me permitió consolidar mis conocimientos y habilidades en estas áreas clave del desarrollo de software.


## El programa:

### Login

La pantalla de Login es el punto de entrada principal al sistema. Esta interfaz permite a los usuarios autenticarse utilizando sus credenciales. Cuenta con las siguientes características:

- Campo de Usuario: Permite ingresar el nombre de usuario.

- Campo de Contraseña: Permite ingresar la contraseña de manera segura.

- Botón de Login: Valida las credenciales ingresadas y, en caso de ser correctas, permite el acceso al sistema.

- Botón de Limpiar: Limpia los campos de usuario y contraseña para facilitar un nuevo ingreso.


#### ✅ Validaciones


Si las credenciales son incorrectas, se mostrará un mensaje de error indicando que el usuario o la contraseña son inválidos.

El sistema distingue entre tipos de usuario según su rol:

- Administrador: Accede directamente al panel de administración, con funciones avanzadas.

- Usuario común: Es redirigido al panel de usuario, con opciones limitadas.

Esta lógica garantiza un acceso seguro y personalizado según el tipo de usuario que inicia sesión.

![image](https://github.com/MatiasAltamiranda/Gestor-de-usuarios/blob/a70ba753f64170dd42e2923d583d754a0a6bf58f/Capturas/Login.jpg)

![image](https://github.com/MatiasAltamiranda/Gestor-de-usuarios/blob/a70ba753f64170dd42e2923d583d754a0a6bf58f/Capturas/Login2.jpg)


### Panel usuario común
El panel de usuario común está diseñado para proporcionar una vista general de los usuarios registrados en el sistema. Es una interfaz simple, enfocada en la consulta de información.

Funcionalidades:
- Tabla de Usuarios: Muestra una lista completa de todos los usuarios registrados. Incluye información relevante como nombre de usuario, rol, entre otros.

- Botón "Actualizar": Permite recargar la información de la tabla para reflejar los últimos cambios realizados en la base de datos.

- Botón "Salir": Cierra la sesión del usuario actual y retorna a la pantalla de Login.

Este panel permite a los usuarios comunes mantenerse informados sin acceso a funciones administrativas.

![image](https://github.com/MatiasAltamiranda/Gestor-de-usuarios/blob/a70ba753f64170dd42e2923d583d754a0a6bf58f/Capturas/PanelUser.jpg)


### Panel administrador
El panel de administrador ofrece un conjunto de herramientas avanzadas para la gestión completa de usuarios en el sistema. Está diseñado exclusivamente para usuarios con privilegios administrativos.

Funcionalidades:
- Tabla de Usuarios: Muestra todos los usuarios registrados en el sistema, incluyendo detalles clave como nombre de usuario, rol, entre otros.

- Botón "Crear Usuario": Abre una nueva ventana donde se pueden ingresar los datos necesarios para registrar un nuevo usuario (nombre de usuario, contraseña, rol.).

- Botón "Editar Usuario": Abre una ventana con los datos del usuario seleccionado ya precargados, permitiendo modificar su información de forma sencilla y segura.

- Botón "Borrar Usuario": Elimina de forma permanente al usuario seleccionado de la base de datos del sistema.

- Botón "Actualizar": Refresca el contenido de la tabla para mostrar los cambios más recientes (creación, edición o eliminación de usuarios).

- Botón "Salir": Cierra la sesión actual y redirige al usuario a la pantalla de Login.

Este panel permite al administrador mantener un control total sobre los usuarios del sistema, asegurando una gestión eficiente y segura.


![image](https://github.com/MatiasAltamiranda/Gestor-de-usuarios/blob/a70ba753f64170dd42e2923d583d754a0a6bf58f/Capturas/PanelAdmin.jpg)


### Agregar usuario
Esta ventana permite al administrador registrar nuevos usuarios en el sistema mediante un formulario simple e intuitivo.

Componentes del formulario:

- Campo "Nombre de Usuario": Permite ingresar el nombre del nuevo usuario.

- Campo "Contraseña": Campo de entrada para definir la contraseña del usuario.

- Lista Desplegable de Rol: Muestra una lista con los roles disponibles. Esta lista se llena dinámicamente con los datos obtenidos desde la base de datos, asegurando que solo se puedan seleccionar roles válidos y actualizados.

Botones disponibles:

- Botón "Guardar": Guarda los datos ingresados en la base de datos, creando un nuevo usuario si todos los campos han sido completados correctamente.

- Botón "Volver": Regresa a la pantalla anterior (Panel de Administrador) sin realizar cambios.

Esta ventana garantiza una forma controlada y flexible de gestionar la incorporación de nuevos usuarios al sistema.

![image](https://github.com/MatiasAltamiranda/Gestor-de-usuarios/blob/a70ba753f64170dd42e2923d583d754a0a6bf58f/Capturas/AgregarUsuario.jpg)

### Editar usuario
La ventana de edición permite modificar los datos de un usuario existente de manera rápida y sencilla, utilizando un formulario similar al de agregar usuario, pero con los campos ya precargados.

Características del formulario:
- Campo "Nombre de Usuario": Se muestra el nombre actual del usuario, permitiendo su edición si es necesario.

- Campo "Contraseña": Campo editable para actualizar la contraseña del usuario.

- Lista Desplegable de Rol: Cargada desde la base de datos, muestra el rol actual del usuario, permitiendo cambiarlo por otro rol válido.

Botones disponibles:
- Botón "Editar": Guarda los cambios realizados en la base de datos, actualizando la información del usuario.

- Botón "Volver": Regresa al panel de administración sin aplicar cambios si no se presiona el botón "Editar".

Esta interfaz facilita la gestión de usuarios, permitiendo realizar modificaciones de forma controlada y eficiente.

![image](https://github.com/MatiasAltamiranda/Gestor-de-usuarios/blob/a70ba753f64170dd42e2923d583d754a0a6bf58f/Capturas/EditarUsuario.jpg)



####  Información del desarrollador

Este proyecto fue desarrollado como parte del curso de TodoCode de Programación Orientada a Objetos con Java.  

Autor: Matias Altamiranda 

Contacto: https://www.linkedin.com/in/matias-altamiranda-731049206/

