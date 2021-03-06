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

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Circle%20yml.png)

7. Rectifique que en el pom.xml, en la fase de construcción, se tenga el siguiente plugin (es decir, dentro de <build><plugins>):

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Pluggin%20runner.png)

8. Heroku requiere los siguientes archivos de configuración (con sus respectivos contenidos) en el directorio raíz del proyecto, de manera que sea qué versión de Java utilizar, y cómo iniciar la aplicación, respectivamente:

+ system.properties

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/System%20properties.png)

+ Procfile

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Procfile.png)
9. El ambiente de despliegue contínuo requiere también un archivo de configuración 'circle.yml' en la raíz del proyecto, en el cual se indica (entre otras cosas) en qué aplicación de Heroku se debe desplegar la aplicación que está en GitHUB. Puede basarse en el siguiente archivo, teniendo en cuenta que se debe ajustar el parámetro 'appname': https://github.com/PDSW-ECI/base-proyectos/blob/master/circle.yml

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Circle%20yml.png)

10. Haga commit y push de su repositorio local a GitHub. Abra la consola de CircleCI y verifique que el de descarga, compilación, y despliegue. Igualmente, verifique que la aplicación haya sido desplegada en Heroku.

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Punto%2010.png)

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Punto%2010%202.png)

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Punto%2010%203.png)

11. Ahora, va a integrar un entorno de Análisis de Calidad de Código a su proyecto, el cual detecte contínuamente defectos asociados al mismo. Autentíquese en CODACY con su cuenta de GitHUB, y agregue el proyecto antes creado.

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Creacion%20de%20cuenta%20CODACY.png)

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Adicion%20de%20proyecto%20a%20CODACY.png)

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Despliege%20del%20proyecto.png)

![](https://github.com/Pokecris200/Lab6CVDS/blob/master/Recursos/Proyecto%20agregado.png)

12. Cree un archivo README.md para su proyecto, y asocie al mismo dos 'badges', que permitan conocer el estado del proyecto en cualquier momento: uno para Circle.CI, y otro para CODACY. El proyecto usado como referencia, ya incluye dichos 'badges' en su archivo README: https://github.com/PDSW-ECI/base-proyectos

[![CircleCI](https://circleci.com/gh/Pokecris200/Lab6CVDS.svg?style=svg)](https://app.circleci.com/pipelines/github/Pokecris200/Lab6CVDS)

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/ec360b52000947dbbadfb42bbec52866)](https://www.codacy.com/gh/Pokecris200/Lab6CVDS/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Pokecris200/Lab6CVDS&amp;utm_campaign=Badge_Grade)

## Link heroku

+ <https://calculatorbean.herokuapp.com/>
