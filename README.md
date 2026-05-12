Registro Acadêmico IFPR - Design Patterns GoF
[cite_start]Este projeto implementa um ecossistema de software para o Registro Acadêmico do IFPR, focado em extensibilidade, eficiência e manutenibilidade através da aplicação rigorosa de padrões de projeto do catálogo GoF[cite: 86].
🎯 Objetivo do Projeto
[cite_start]Demonstrar a aplicação de padrões criacionais, estruturais e comportamentais para criar um sistema resiliente ao legado, onde o custo de manutenção é reduzido pelo baixo acoplamento[cite: 120, 122].
--------------------------------------------------------------------------------
🏗️ Padrões Utilizados
1. Fase de Construção (Infraestrutura)

    [cite_start]Singleton: Gerencia a instância única do banco de dados, evitando redundância de conexões e vazamento de recursos[cite: 88, 89, 125].
    [cite_start]Factory Method: Desacopla a lógica de instanciação do DAO (SQL ou NoSQL), permitindo suporte a novos bancos sem alterar o código cliente[cite: 89, 109].

2. Fase Estrutural (Auditoria e Integração)

    [cite_start]Adapter: Integra bibliotecas externas (como Log4j) via composição, permitindo a troca de libs de terceiros sem impactar a regra de negócio[cite: 90, 112].
    [cite_start]Decorator: Adiciona responsabilidades dinamicamente, como o monitoramento de performance (cronometragem de listagens), sem "sujar" o código original[cite: 91, 114].

3. Fase de Comportamento (Flexibilidade)

    [cite_start]Observer: Implementa um sistema de notificações para interessados (TI/Secretaria) sobre acessos ao sistema de forma passiva e desacoplada[cite: 92, 104, 117].
    [cite_start]Strategy: Permite a variação de algoritmos de exportação (JSON/TXT) em tempo de execução através de injeção de dependência[cite: 93, 116].

--------------------------------------------------------------------------------
📂 Arquitetura e Organização
[cite_start]O projeto segue uma hierarquia de pacotes baseada na Separação de Preocupações[cite: 95]:

src/main/java/br/edu/utfpr/tsi/exame/gof
├── app        # Ponto de entrada (Programa.java)
├── model      # Entidades de domínio (Usuario.java)
├── dao        # Abstrações e implementações de dados
├── infra      # Gerenciamento de conexão e persistência
└── patterns   # Implementação isolada dos padrões GoF

--------------------------------------------------------------------------------
🛡️ Táticas de Sobrevivência ao Legado
[cite_start]O sistema foi projetado para enfrentar desafios reais de engenharia de software[cite: 121]:
Tática
	
Padrão
	
Impacto no Ciclo de Vida
Isolamento de Libs
	
Adapter
	
[cite_start]Atualização de dependências vulneráveis sem reescrever o negócio[cite: 123].
Extensibilidade
	
Decorator
	
[cite_start]Adição de funções em módulos antigos e sensíveis sem risco[cite: 124].
Flexibilidade
	
Strategy
	
[cite_start]Novas regras de negócio não quebram as antigas[cite: 125].
--------------------------------------------------------------------------------
🚀 Como Executar
(Adicione aqui as instruções técnicas: requisitos do Java, como clonar e o comando para rodar o Programa.java)
--------------------------------------------------------------------------------
🎓 Justificativa Acadêmica
[cite_start]Ao aplicar os princípios SOLID (como DIP e OCP) através dos padrões GoF, este projeto demonstra maturidade técnica ao proteger o investimento futuro, facilitando a troca de componentes de infraestrutura com risco mínimo[cite: 126, 128].
--------------------------------------------------------------------------------
[cite_start]Nota: Projeto desenvolvido para o Exame de Suficiência em Engenharia de Software - UTFPR (2026)[cite: 106, 128].
Como este projeto foca em padrões específicos, você gostaria que eu detalhasse a diferença semântica entre algum deles (ex: Adapter vs Decorator) em uma seção de "FAQ" no próprio README?
User: poderia gerar um?
Gemini:

from weasyprint import HTML

html_content = """
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <style>
        @page {
            size: A4;
            margin: 20mm;
            background-color: #ffffff;
        }
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            line-height: 1.6;
            color: #333;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 100%;
        }
        header {
            background-color: #0d1117;
            color: #ffffff;
            padding: 30px;
            margin: -20mm -20mm 20px -20mm;
            text-align: center;
            border-bottom: 5px solid #2ea44f;
        }
        h1 { margin: 0; font-size: 24pt; }
        h2 { border-bottom: 2px solid #eaecef; padding-bottom: 8px; margin-top: 25px; color: #0366d6; font-size: 18pt; }
        h3 { color: #24292e; font-size: 14pt; margin-top: 20px; }
        code {
            background-color: #f6f8fa;
            padding: 2px 5px;
            border-radius: 3px;
            font-family: 'Courier New', Courier, monospace;
        }
        pre {
            background-color: #f6f8fa;
            padding: 15px;
            border-radius: 6px;
            overflow: hidden;
            font-size: 10pt;
            border: 1px solid #d1d5da;
            white-space: pre-wrap;
        }
        .badge {
            display: inline-block;
            padding: 3px 10px;
            background-color: #2ea44f;
            color: white;
            border-radius: 12px;
            font-size: 9pt;
            font-weight: bold;
            margin-bottom: 10px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #dfe2e5;
            padding: 10px;
            text-align: left;
        }
        th { background-color: #f6f8fa; }
        .footer {
            margin-top: 30px;
            font-size: 9pt;
            color: #6a737d;
            text-align: center;
            border-top: 1px solid #eaecef;
            padding-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <header>
            <h1>README.md</h1>
            <p>Projeto: Registro Acadêmico IFPR - Design Patterns GoF</p>
        </header>

        <div class="badge">Markdown Format</div>

        <pre># Registro Acadêmico IFPR - Design Patterns GoF

Este projeto implementa um ecossistema de software para o Registro Acadêmico do IFPR, focado em **extensibilidade, eficiência e manutenibilidade** através da aplicação rigorosa de padrões de projeto do catálogo GoF.

## 🎯 Objetivo do Projeto
Demonstrar a aplicação de padrões criacionais, estruturais e comportamentais para criar um sistema resiliente ao legado, onde o custo de manutenção é reduzido pelo baixo acoplamento.

---

## 🏗️ Padrões Utilizados

### 1. Fase de Construção (Infraestrutura)
* **Singleton (`GerenciadorSingleton.java`):** Garante uma instância única do banco de dados, evitando redundância de conexões e vazamento de recursos.
* **Factory Method (`ConexaoFactory.java`):** Desacopla a lógica de instanciação do DAO (SQL ou NoSQL), permitindo suporte a novos bancos sem alterar o código cliente.

### 2. Fase Estrutural (Auditoria e Integração)
* **Adapter (`Log4jAdapter.java`):** Integra bibliotecas externas (Log4j2) via composição, permitindo a troca de libs de terceiros sem impactar a regra de negócio.
* **Decorator (`MonitorDesenpenhoDecorator.java`):** Adiciona responsabilidades dinamicamente, como o monitoramento de performance, sem alterar o código original das classes de negócio.

### 3. Fase de Comportamento (Flexibilidade)
* **Observer (`NotificadorServiceObserver.java`):** Implementa um sistema de notificações para interessados (TI/Secretaria) sobre eventos do sistema de forma desacoplada.
* **Strategy (`ExportadorContexto.java`):** Permite a variação de algoritmos de exportação (JSON/TXT) em tempo de execução através de injeção de dependência.

---

## 📂 Arquitetura do Projeto
O projeto segue uma hierarquia baseada na **Separação de Preocupações (SoC)**:

```text
src/main/java/br/edu/utfpr/tsi/exame/gof
├── app           # Ponto de entrada (Programa.java)
├── model         # Entidades de domínio (Usuario.java)
├── dao           # Abstrações e implementações de acesso a dados
├── arcriacionais # Singleton e Factory
├── arestruturais # Adapter e Decorator
└── comportamentais # Strategy e Observer

--------------------------------------------------------------------------------
🛡️ Táticas de Sobrevivência ao Legado
Tática
	
Padrão
	
Impacto no Ciclo de Vida
Isolamento de Libs
	
Adapter
	
Permite atualizar bibliotecas vulneráveis sem reescrever o negócio.
Extensibilidade
	
Decorator
	
Adiciona funções em módulos antigos e sensíveis sem risco.
Flexibilidade
	
Strategy
	
Novas regras de negócio não quebram as implementações antigas.
--------------------------------------------------------------------------------
🚀 Como Executar

    Certifique-se de ter o Java 17+ instalado.
    Clone o repositório: git clone &lt;url-do-repo&gt;
    Compile o projeto.
    Execute a classe principal: br.edu.utfpr.tsi.exame.gof.app.Programa

--------------------------------------------------------------------------------
🎓 Justificativa Acadêmica
Ao aplicar os princípios SOLID (como DIP e OCP) através dos padrões GoF, este projeto demonstra maturidade técnica ao proteger o investimento futuro, facilitando a troca de componentes de infraestrutura com risco mínimo.
--------------------------------------------------------------------------------
Nota: Projeto desenvolvido para o Exame de Suficiência em Engenharia de Software - UTFPR.</pre>

    <div class="footer">
        Gerado para suporte ao Exame de Suficiência - Engenharia de Software
    </div>
</div>

with open("README_GitHub_Gof_Project.html", "w", encoding="utf-8") as f: f.write(html_content)
HTML(filename="README_GitHub_Gof_Project.html").write_pdf("README_GitHub_Gof_Project.pdf")
