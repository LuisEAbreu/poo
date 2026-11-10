- Faça um diagrama UML com classes e interfaces que permitam representar animais em um jogo
    - Arara, Avestruz, Baleia, Cachorro, Gato, Leão, Lobo, Macaco, Morcego, Pinguim, Ornitorrinco
- Todo animal possui um nome e no mínimo 2 métodos de habilidade, ou seja, ações que o animal pode realizar
    - Exemplo: cachorro late e corre, arara voa e fala, leão ruge e corre
    - Método toString deve retornar o nome do animal e de qual classe ele é. Exemplo: “Totó é um cachorro”
- Organize as classes e interfaces em uma hierarquia de forma que seja possível criar um vetor de animais e chamar suas
  habilidades usando polimorfismo
- Crie uma classe App para testar a implementação

```mermaid
classDiagram
    direction LR

    class Animal {
        <<abstract>>
        -nome: String
    }

    class Mamifero {
        <<abstract>>
        -qtdMamilos : int
        +amamentar()
    }
    class Ave {
        <<abstract>>
        -qtdPenas : int
    }

    class Arara {
        +falar() String
    }
    class Avestruz
    class Baleia {
        +cantar() String
    }
    class Cachorro {
        +latir() String
    }
    class Gato{
        +miar() String
    }
    class Leao{
        +rugir() String
    }
    class Lobo {
        +uivar() String
    }
    class Macaco{
        +gritar() String
    }
    class Morcego{
        +guinchar() String
        +virarVampiro() boolean
    }
    class Pinguim{
        +reconhecerPar() boolean
    }
    class Ornitorrinco{ 
        +eletrolocalizar() String
    }

    class Oviparo{
        <<interface>>
        +chocar()
    }
    class Corredor {
        <<interface>>
        +correr()
    }
    class Nadador {
        <<interface>>
        +nadar()
    }
    class Voador {
        <<interface>>
        +voar()
    }
    class Escalador {
        <<interface>>
        +escalar()
    }

    Mamifero --|> Animal
    Ave --|> Animal
    Ave ..|> Oviparo

    Arara --|> Ave
    Arara ..|> Voador
    
    Morcego --|> Mamifero
    Morcego ..|> Voador
    
    Baleia --|> Mamifero
    Baleia ..|> Nadador
    
    Pinguim --|> Ave
    Pinguim ..|> Nadador
    Pinguim ..|> Corredor
    
    Avestruz --|> Ave
    Avestruz ..|> Corredor
    
    Cachorro --|> Mamifero
    Cachorro ..|> Corredor
    
    Gato --|> Mamifero
    Gato ..|> Corredor
    Gato ..|> Escalador
    
    Leao --|> Mamifero
    Leao ..|> Corredor
    Leao ..|> Escalador
    
    Lobo --|> Mamifero
    Lobo ..|> Corredor
    
    Macaco --|> Mamifero
    Macaco ..|> Corredor
    Macaco ..|> Escalador
    
    Ornitorrinco --|> Mamifero
    Ornitorrinco ..|> Corredor
    Ornitorrinco ..|> Nadador
    Ornitorrinco ..|> Oviparo
```