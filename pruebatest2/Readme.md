
# Google_test-pruebas
  ## Pruebas unitarias con Google test<br/>
  primero instalamos los paquetes necesarios 
  <pre><code>sudo apt-get install libgtest-dev </code></pre> 
  <pre><code>clone https://github.com/google/googletest.git </code></pre>  
  luego nos ponemos en el directorio del g test y :  
  <pre><code>
  clone cd googletest
  mkdir build 
  cd build
  cmake-gui ..
  make -j8 
  sudo make install  
  </code></pre>   
  
  codificamos la función a probar , en este caso uno de prueba : 
  
  ![texto cualquiera por si no carga la imagen](https://github.com/JoseCcari/Google_test-pruebas/blob/main/Img/funcion.PNG) 
  
  Testeamos :
  
  ![texto cualquiera por si no carga la imagen](https://github.com/JoseCcari/Google_test-pruebas/blob/main/Img/pruebas.PNG) 
  
  <pre><code>
    cmake_minimum_required(VERSION 2.6)
    # Locate GTest
    find_package(GTest REQUIRED)
    include_directories(${GTEST_INCLUDE_DIRS})

    # Link runTests with what we want to test and the GTest and pthread library
    add_executable(runTests tests.cpp)
    target_link_libraries(runTests ${GTEST_LIBRARIES} pthread)
  </code></pre>  
  
  Por último compilamos :
  
  ![texto cualquiera por si no carga la imagen](https://github.com/JoseCcari/Google_test-pruebas/blob/main/Img/Prueba.PNG) 
  
  
  ## Pruebas unitarias con Google test en Visual Studio 
