package br.sceweb.teste;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDao;


public class UC01CadastrarEmpresa {

	static Empresa empresa;
	static EmpresaDao empresadao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
		empresadao = new EmpresaDao();
	}

	@Test
	public void CT01_UC01_FB_Cadastrar_Empresa_com_sucesso() {
		assertEquals(1, empresadao.adicionar(empresa));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
