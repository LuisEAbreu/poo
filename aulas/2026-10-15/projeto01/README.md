# Exemplo 1:
```mermaid
    classDiagram
        
    class Telefone {
        #codigo : int
        -numSerie : String
        -modelo : String
        -peso : double
        -dimensao : Dimensao
        +Telefone(c : int, n :String, p : String, p : double, d: Dimensao)
    }

    class SemFio {
        -frequencia : double
        -canais : int
        -distanciaOperacao : double
        +SemFio(c : int, n :String, p : String, p : double, d : Dimensao, f : double, c : int, dO : double)
    }
    
    class Celular

    Telefone <|-- SemFio
    SemFio <|-- Celular 
```

# Exercícios:

## Exercício 1:

- Informações: Aluno, professor, coordenador, diretor

Contexto pensado: Sistema academico

```mermaid
classDiagram
    
    class Pessoa{
        -nome : String
        -dataNasci : LocalDate
        -cpf : String
    }
    class Aluno{
        -matricula : String
    }
    class Servidor{
        -salario : double
    }
    
    class Professor{
        -turmas : ArrayList~String,String~
    }
    
    class Coordenador{
        -curso : String
    }
    
    class Diretor{
        -funcao : String
    }
    
    Pessoa <|-- Aluno
    Pessoa <|-- Servidor
    
    Servidor <|-- Diretor
    Servidor <|-- Professor
    Professor <|-- Coordenador
```

## Exercício 2:

- Informações: Livro, revista, jornal, gibi

Contexto: livraria

```mermaid
classDiagram
    class Obra{
        -titulo : String
        -qtdPaginas : int
    }
    
    class Periodico{
        -issn
    }
    
    class Livro{
        -isbn
    }
    class Revista{
        -editor
    }
    class Jornal{
        -genero : String
    }
    class Gibi{
        -ilustrador : String
    }

    Obra <|-- Livro
    Obra <|-- Periodico
    Periodico <|-- Revista
    Periodico <|-- Jornal
    Periodico <|-- Gibi
```

## Exercício 4:

- Informações: Gato, Cachorro, Arara, Galinha, Baleia, Tubarao

Contexto: jogo

```mermaid
classDiagram
    class Animal{
        -nivelVida : double
    }
    
    class Terrestre{
        +andar()
    }
    class Aquatico{
        +nadar()
    }
    class Aereo{
        +voar()
    }
    
    class Gato
    class Cachorro
    class Arara
    class Galinha
    class Baleia
    class Tubarao
    
    Animal <|-- Terrestre
    Animal <|-- Aquatico
    Animal <|-- Aereo
    
    Terrestre <|-- Gato
    Terrestre <|-- Cachorro
    Aereo <|-- Arara
    Terrestre <|-- Galinha
    Aquatico <|-- Baleia
    Aquatico <|-- Tubarao
```
