package tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import pages.MenuPage;
import pages.ResumoPage;
import static core.DriverFactory.getDriver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {
	
private MenuPage menuPage = new MenuPage(); 
private ResumoPage resumoPage = new ResumoPage ();
	
	@Test
	public void Test1ExcluiMovimentacao() {
		menuPage.acessarTelaResumo();
		resumoPage.ExcluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", 
				resumoPage.obterMensagemSucesso());
	}
	
	@Test
	
	public void test2ResumoMensal() {
		menuPage.acessarTelaResumo();
		
		Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
	}

}
