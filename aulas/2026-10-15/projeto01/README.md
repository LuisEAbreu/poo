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
Contexto: 

```mermaid
classDiagram
    class Livro{}
    class Revista{}
    class Jornal{}
    class Gibi{}

    Livro
    Revista
    Jornal
    Gibi
```
