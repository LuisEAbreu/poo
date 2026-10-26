```mermaid
classDiagram
    class Coordenada{
        +x : int
        +y : int
    }
    
    class FormaGeometrica{
        #corDaLinha : String
        #inicio : Coordenada
        +desenhar()  String
    }
    
    class Linha{
        -fim : Coordenada
    }
    
    class Circulo{
        -raio : int
        +calcularArea() double
        +calcularPerimetro() double
    }
    
    class Retangulo{
        -fim : Coordenada
        +calcularArea() int
        +calcularPerimetro() double
    }

    FormaGeometrica "1" *-- "1" Coordenada
    FormaGeometrica <|-- Linha
    FormaGeometrica <|-- Circulo
    FormaGeometrica <|-- Retangulo
```