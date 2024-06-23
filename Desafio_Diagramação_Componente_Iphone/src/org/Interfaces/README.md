# Descrição das Interfaces

Este repositório contém três interfaces que definem o comportamento de um aparelho telefônico, um reprodutor musical e um navegador de internet. Abaixo está uma descrição detalhada de cada interface.

## Interface AparelhoTelefonico

A interface `AparelhoTelefonico` define os métodos necessários para implementar funcionalidades básicas de um telefone.

### Métodos

1. **ligar(String numero)**: Liga para um número de telefone especificado.
    ```java
    void ligar(String numero);
    ```

2. **atender()**: Atende uma chamada telefônica.
    ```java
    void atender();
    ```

3. **iniciarCorreioVoz()**: Inicia o correio de voz.
    ```java
    void iniciarCorreioVoz();
    ```

## Interface ReprodutorMusical

A interface `ReprodutorMusical` define os métodos necessários para implementar funcionalidades básicas de um reprodutor de música.

### Métodos

1. **tocar()**: Inicia a reprodução de música.
    ```java
    void tocar();
    ```

2. **pausar()**: Pausa a reprodução de música.
    ```java
    void pausar();
    ```

3. **selecionarMusica(String musica)**: Seleciona uma música específica.
    ```java
    void selecionarMusica(String musica);
    ```

## Interface NavegadorInternet

A interface `NavegadorInternet` define os métodos necessários para implementar funcionalidades básicas de um navegador de internet.

### Métodos

1. **exibirPagina(String url)**: Exibe uma página da web a partir de uma URL.
    ```java
    void exibirPagina(String url);
    ```

2. **adicionarNovaAba()**: Adiciona uma nova aba no navegador.
    ```java
    void adicionarNovaAba();
    ```

3. **atualizarPagina()**: Atualiza a página atual no navegador.
    ```java
    void atualizarPagina();
    ```

## Exemplo de Uso

Para implementar essas interfaces, você precisa criar uma classe que forneça a implementação de todos os métodos declarados nas interfaces. Aqui está um exemplo de uma classe que implementa todas as três interfaces:
