# Sistema para gestão de Agenda telefônica

## Requisitos e regra de negócio:

- O sistema deve permitir ao usuário gerenciar uma agenda telefônica, onde é possível armazenar informações de contatos pessoais e profissionais
    - Adicionar, Remover, Atualizar, Listar dados de um contato, Listar todos contatos
- Todo contato deve possuir: 
  - Nome, Sobrenome, Data de nascimento, Telefone(s) e email(s)
- Todo telefone ou email deve possuir um rótulo de identificação (p. ex. celular, comercial, pessoal) e um valor (p. ex. pessoal: juca@example.com)
  - Não deve ser permitido adicionar um email que não seja válido
  - Os telefones devem ser exibidos formatados, no formato internacional: Ex: 
  +55048998761234 → +55 (48) 9 9876-1234
- Ao listar os contatos, deve-se exibir o nome completo, data de nascimento, telefone(s) e email(s) de cada contato
- Os telefones e emails devem ser exibidos com o rótulo de identificação

## UML:
```mermaid
    classDiagram
        
        class App{
            -agenda : Agenda
            +main()
            +menu()
        }
        
        class Agenda{ 
            -contatos : ArrayList~Contato~
            +adicionar() boolean
            +remover() boolean
            +atualizar() boolean
            +listarDadosContato() String
            +listarContatos() String
        }
        
        class Contato{
            -nome : String
            -sobrenome : String
            -dataNasc : LocalDate
            -telefones : HashMap~String, Telefone~
            -emails : HashMap~String, Email~

            +Contato(nome: String, sobrenome: String, dN : LocalDate)
            +addTelefone(rotulo: String, valor: String): boolean
            +addEmail(rotulo: String, valor: String): boolean
            +removeTelefone(rotulo : String): boolean
            +removeEmail(rotulo: String): boolean
            +updateTelefone(rotulo: String, valor: String): boolean
            +updateEmail(rotulo: String, valor: String): boolean
            +toString(): String
        }
        
        class Telefone{
            -valor : String
        }

        class Email{ 
            -valor : String
            +Email(valor: String)
            +toString(): String
        }
        
        App "1" *-- "1" Agenda
        Agenda "1" *-- "0..*" Contato
        Contato "1" *-- "0..*" Telefone
        Contato "1" *-- "0..*" Email
```