# Projeto Calculadora — FinançApp


## 1. Identificação do Projeto

- **Projeto:** Projeto Calculadora (`projeto_calculadora`)
- **Contexto:** FinançApp
- **Aluna:** Isabelle Naomi Tsuzaki
- **RA:** 251511
- **Curso:** Análise e Desenvolvimento de Sistemas — FACENS
- **Disciplina:** UX/UI e Testes de Software
- **Professor:** Daniel Ohata
- **Semestre:** 2026.2


## 2. Visão Geral

O projeto consiste no desenvolvimento de um módulo de cálculos matemáticos básicos em Java para a startup fictícia **FinançApp**. O módulo poderá apoiar funcionalidades de orçamento mensal, divisão de despesas, projeções financeiras e outros cálculos auxiliares.

Além das operações, o projeto aplica testes automatizados, tratamento de erros, refatoração, documentação técnica, versionamento e práticas de manutenção de código.


## 3. Problema

A FinançApp necessita de um módulo matemático reutilizável, que execute operações corretamente e permaneça fácil de compreender e manter. Por isso, a solução precisa validar operações inválidas, tratar divisão por zero, demonstrar seu comportamento por testes e registrar a evolução do código em branches.


## 4. Objetivo

### 4.1 Objetivo Geral

Desenvolver uma calculadora em Java aplicando práticas de qualidade, testes, documentação, refatoração e versionamento.

### 4.2 Objetivos Técnicos

- Implementar soma, subtração, multiplicação e divisão.
- Tratar entradas incorretas e impedir divisão por zero.
- Executar testes automatizados, verificando valores esperados e obtidos.
- Refatorar o código sem alterar seu comportamento funcional.
- Documentar classes e métodos com JavaDoc e gerar HTML em `docs/`.
- Utilizar Git, GitHub, branches e commits organizados.


## 5. Escopo Funcional

| ID | Funcionalidade | Descrição | Status |
| --- | --- | --- | --- |
| RF01 | Soma | Soma dois números inteiros | ✅ Implementado |
| RF02 | Subtração | Subtrai dois números inteiros | ✅ Implementado |
| RF03 | Multiplicação | Multiplica dois números inteiros | ✅ Implementado |
| RF04 | Divisão | Divide dois números inteiros, com resultado decimal quando necessário | ✅ Implementado |
| RF05 | Validação de divisão | Impede divisão por zero | ✅ Implementado |
| RF06 | Operação inválida | Identifica operadores não suportados | ✅ Implementado |

O método principal da classe `Calculadora` é **`calc(int a, int b, String op)`**. Os operadores aceitos são `+`, `-`, `*` e `/`. O retorno é do tipo `double` para permitir resultados como `7 / 2 = 3.5`.


## 6. Requisitos Não Funcionais

| ID | Categoria | Requisito |
| --- | --- | --- |
| RNF01 | Qualidade | Organização, legibilidade e indentação do código |
| RNF02 | Testabilidade | Testes automatizados para operações e falhas previstas |
| RNF03 | Manutenção | Refatoração sem alteração do comportamento funcional |
| RNF04 | Documentação | JavaDoc de classes, métodos e parâmetros |
| RNF05 | Versionamento | Histórico Git e branches `main` e `Refatoracao` |
| RNF06 | Confiabilidade | Erros tratados na interface sem encerrar inesperadamente a execução |


## 7. Tecnologias Utilizadas

| Tecnologia | Versão | Utilização |
| --- | --- | --- |
| Java | 17+ (testado com OpenJDK 21) | Implementação da calculadora |
| JDK | 21, no ambiente de validação | Compilação e execução |
| Testes em Java puro | Sem framework externo | Execução de testes automatizados com verificações de resultado |
| Git | Conforme instalação local | Controle de versão e branches |
| GitHub | Plataforma web | Publicação do repositório remoto |
| JavaDoc | Incluído no JDK | Documentação HTML |
| IDE | VS Code ou IntelliJ (opcional) | Edição do projeto |

**Observação:** os testes deste projeto não utilizam JUnit; são automatizados por uma classe Java executável. Caso o professor exija especificamente **JUnit**, será necessário adaptar a classe de testes.


## 8. Estrutura do Projeto

```text
projeto_calculadora/
├── src/
│   └── calculadora/
│       ├── Calculadora.java
│       ├── Principal.java
│       └── TesteCalculadora.java
├── docs/
│   └── index.html          # página inicial da documentação JavaDoc
├── prints/
│   ├── testes.png          # execução dos testes
│   ├── javadoc.png         # documentação gerada
│   └── testes.txt          # resultado em texto
├── README.md
└── .gitignore
```


## 9. Execução da Aplicação

É necessário ter um JDK instalado. Na pasta raiz do projeto, execute:

```bash
javac -encoding UTF-8 -d out src/calculadora/*.java
java -cp out calculadora.Principal
```

O programa apresenta opções de cálculo no console e trata entradas que não sejam números inteiros, divisão por zero e operadores inválidos.


## 10. Testes Automatizados

Para executar os testes após compilar:

```bash
java -cp out calculadora.TesteCalculadora
```

A classe `TesteCalculadora.java` realiza **9 verificações** de soma, subtração, multiplicação, divisão, divisão por zero, operadores inválidos e cenários adicionais. A saída apresenta entrada, valor esperado, valor obtido e status. Os testes foram executados com aprovação no ambiente de desenvolvimento.


## 11. Refatoração e Versionamento

O histórico Git preserva uma implementação inicial. Na branch **`Refatoracao`**, foram aplicadas melhorias de organização: extração de métodos auxiliares, nomes claros e simplificação do fluxo condicional. Os testes foram executados novamente após as mudanças.

- **`main`:** versão final, com refatoração integrada e documentação.
- **`Refatoracao`:** versão que demonstra a reorganização do código.

Os commits registram a implementação, os testes, a refatoração e a documentação.


## 12. Documentação JavaDoc

Para regenerar a documentação HTML:

```bash
javadoc -encoding UTF-8 -charset UTF-8 -docencoding UTF-8 -d docs src/calculadora/*.java
```

Abra o arquivo **`docs/index.html`** no navegador.


## 13. Repositório GitHub

**Link:** `https://github.com/isabelletsuzaki1/projeto_calculadora1`

> Substituir `SEU-USUARIO` pelo nome de usuário real após criar e publicar o repositório. O link acima é apenas um exemplo, não um endereço de projeto já publicado.

## 14. Autoria

**Isabelle Naomi Tsuzaki** — RA 251511 