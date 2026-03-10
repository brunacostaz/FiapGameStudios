# Fiap Studios - Enganheria Game 🎮

Projeto introdutório no estudo de microserviços.
Essa primeira versão consiste em uma aplicação simples desenvolvida na arquitetura monolítica, ou seja, modelo tradicional onde os componentes de uma aplicação estão unidos em um único código e implantados como um único serviço. 

Atenção: a divisão de diretórios dentro de um mesmo projeto não caracteriza um microserviço, já que isso se trata apenas de uma organização dos arquivos.

A arquitetura monolítica garante uma fácil comunicação entre os módulos, já que podemos realizar chamando diretamente um método da classe, mas são menos escaláveis se comparado a uma arquitetura de microserviços.


## Discussão arquitetural

- Qual arquitetura está sendo usada? Monolítica? Em camadas? Orientada a objetos? Orientada a serviços?

R: Esse projeto está utilizando uma arquitetura monolítica, pois roda inteiramente dentro de uma única aplicação, sem possui serviços independentes ou comunicação via protocolo HTTP ou mensageria. Nesse caso, as chamadas de métodos são feitas diretamente entre os objetos.

Ele também está dividido em camadas: 
- ui: responsável pela interface de usuário e inicialização do sistema.
- application: responsável por orquestrar o fluxo da aplicação.
- service: responsável pelas regras de negócio.
- domain: responsável por armazenar os dados da aplicação, fazendo um papel de entidades.

Além disso, o código é orientado a objetos, apresentando os conceitos fundamentais de encapsulamento (atributos privados, getters e setters), abstração (uso de interfaces injetadas nos construtores, a fim de desacoplar as responsabilidades do serviço), polimorfismo e Strategy Pattern, pois utilizamos diferentes estrátegias injetadas nas classes de serviço para validar a missão e calcular a pontuação do jogador.

## Arquitetura do projeto 🏛️

### Visão Macro do monolito
<img width="302" height="511" alt="engenharia_game_monolitico_geral drawio" src="https://github.com/user-attachments/assets/07cba847-c1a6-476b-8f7e-ccb429134ec4" />

----------------------------------------------------------------------------------

### Visão detalhada com o fluxo da aplicação

<img width="462" height="601" alt="engenharia_game_monolitico_detalhes1" src="https://github.com/user-attachments/assets/2d372c05-e2dd-42b5-a134-b075aca68a92" />

----------------------------------------------------------------------------------

### Visão detalhada das ações feitas em cada etapa
 <img width="811" height="851" alt="engenharia_game_monolitico_detalhes_2" src="https://github.com/user-attachments/assets/ab24e365-45e8-40bc-b958-ef16d3e86692" />

 ----------------------------------------------------------------------------------

 ### Visão detalhada das ações e camadas do monolito 
 <img width="862" height="1051" alt="engenharia_game_monolitico_detalhes3" src="https://github.com/user-attachments/assets/2661bb50-0d74-4412-8f18-bd586030b514" />

