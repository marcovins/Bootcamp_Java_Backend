package com.banco.Testes;


import com.banco.Banco;
import com.banco.Cliente.Cliente;
import com.banco.Cliente.Pessoal;

class BancoTest {

    private Banco banco;
    private Cliente cliente;

    @BeforeEach
    void setUp() throws Exception {
        banco = new Banco();
        cliente = new Pessoal("João", "joao@example.com", "Rua 1", "123.456.789-00");
    }

    @Test
    void testAdicionarCliente() {
        banco.adicionarCliente(cliente);
        assertEquals(cliente, banco.buscarCliente(cliente));
    }

    @Test
    void testBuscarCliente() {
        banco.adicionarCliente(cliente);
        Cliente encontrado = banco.buscarCliente(cliente);
        assertNotNull(encontrado);
        assertEquals("João", encontrado.getNome());
    }

    @Test
    void testRemoverCliente() {
        banco.adicionarCliente(cliente);
        banco.removerCliente(cliente);
        assertNull(banco.buscarCliente(cliente));
    }
}

