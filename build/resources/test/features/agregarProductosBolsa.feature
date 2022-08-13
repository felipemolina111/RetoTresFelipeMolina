      #language: es

        Característica: agrgar productos a la bolsa
          Antecedentes:
            Dado El usuario se encuentre en la pagina

          Escenario: agregar dos productos
            Dado El usuario  inicie sesion
            Cuando El usuario agregue los productos
            Entonces El usuario visualizara la cantidad de productos
