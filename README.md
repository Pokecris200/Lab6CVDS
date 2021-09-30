# Integrantes

# José Gamboa - Cristian Forero

## Parte II

2. Acceda a su cuenta en Heroku y cree una nueva aplicación:

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Build%20Project%20Circleci.png)

3. Después de crear su cuenta en Heroku y la respectiva aplicación, genere una llave de API: Opción Manage Account:

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/API%20Key.png)

4. Ingrese a la plataforma de integración contínua Circle.CI (www.circleci.com). Para ingresar, basta que se autentique con su usuario de GitHUB.

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Circle%20CI.png)

5. Seleccione la opción de agregar proyectos. En la organización o usuario de GitHub, seleccione el proyecto al que le va hacer despliegue continuo, y haga clic en "Build Project":

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Build%20Project%20Circleci.png)

Vaya a CONTINUOUS DEPLOYMENT/Heroku Deployment, y realice los dos pasos indicados: (1) registrar la llave de Heroku, y (2) asociar su usuario para el despliegue:

6. Si todo queda correctamente configurado, cada vez que hagan un PUSH al repositorio, CircleCI ejecutará la fase de construcción del proyecto. Para que cuando las pruebas pasen automáticamente se despliegue en Heroku, debe definir en el archivo circle.yml (ubicado en la raíz del proyecto):

![]()

7. Rectifique que en el pom.xml, en la fase de construcción, se tenga el siguiente plugin (es decir, dentro de <build><plugins>):

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Pluggin%20runner.png)

8. Heroku requiere los siguientes archivos de configuración (con sus respectivos contenidos) en el directorio raíz del proyecto, de manera que sea qué versión de Java utilizar, y cómo iniciar la aplicación, respectivamente:

+ system.properties

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/System%20properties.png)

+ Procfile

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Procfile.png)

## Link heroku

+ <https://git.heroku.com/calculatorbean.git>
