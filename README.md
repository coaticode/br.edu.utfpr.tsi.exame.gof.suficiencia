Registro Acadêmico  - Design Patterns GoF
--------------------------------------------------------------------------------
🎯 Objetivo do Projeto
Demonstrar a aplicação de padrões criacionais, estruturais e comportamentais para "SIMULAR" um sistema resiliente ao legado, onde o custo de manutenção é reduzido pelo baixo acoplamento.
obs. 
	1. Não houve integração com bancos MySQL/NoSQL.
	2. A lista de usuários é gerada no UsuarioDAOImplements.java

🏗️ Padrões Utilizados
1. Fase de Construção (Infraestrutura)

    Singleton: Gerencia a instância única do banco de dados, evitando redundância de conexões e vazamento de recursos.
   
    Factory Method: Desacopla a lógica de instanciação do DAO (SQL ou NoSQL), permitindo suporte a novos bancos sem alterar o código cliente.

3. Fase Estrutural (Auditoria e Integração)

    Adapter: Integra bibliotecas externas (como Log4j) via composição, permitindo a troca de libs de terceiros sem impactar a regra de negócio.
   
    Decorator: Adiciona responsabilidades dinamicamente, como o monitoramento de performance (cronometragem de listagens), sem "sujar" o código original.

4. Fase de Comportamento (Flexibilidade)

    Observer: Implementa um sistema de notificações para interessados (TI/Secretaria) sobre acessos ao sistema de forma passiva e desacoplada.
   
    Strategy: Permite a variação de algoritmos de exportação (JSON/TXT) em tempo de execução através de injeção de dependência.

--------------------------------------------------------------------------------
📂 Arquitetura e Organização
O projeto segue uma hierarquia de pacotes baseada na Separação de Preocupações:

```text
src/main/java/br/edu/utfpr/tsi/exame/gof
├── app        # Ponto de entrada (Programa.java)
├── model      # Entidades de domínio (Usuario.java)
├── dao        # Abstrações e implementações de dados
├── infra      # Gerenciamento de conexão e persistência
└── patterns   # Implementação isolada dos padrões GoF
```

--------------------------------------------------------------------------------
🛡️ Táticas de Sobrevivência ao Legado

O sistema foi projetado para enfrentar desafios reais de engenharia de software:

> Padrão: Adapter
	Tática: Isolamento de Libs
	Impacto no Ciclo de Vida: Permite atualizar bibliotecas vulneráveis sem reescrever o negócio.

> Padrão: Decorator
	Tática: Extensibilidade.
	Impacto no Ciclo de Vida: Adiciona funções em módulos antigos e sensíveis sem risco.
		
> Padrão: Strategy
	Tática: Flexibilidade.
	Impacto no Ciclo de Vida: Novas regras de negócio não quebram as implementações antigas.
	

--------------------------------------------------------------------------------
 🚀 Como Executar

    Certifique-se de ter o Java 17+ instalado.
    Clone o repositório: git clone url;
	maven clean
    Compile o projeto.
    Execute a classe principal: br.edu.utfpr.tsi.exame.gof.app.Programa

--------------------------------------------------------------------------------
🎓 Justificativa Acadêmica
Ao aplicar os princípios SOLID (como DIP e OCP) através dos padrões GoF, este projeto demonstra maturidade técnica ao proteger o investimento futuro, facilitando a troca de componentes de infraestrutura com risco mínimo.
