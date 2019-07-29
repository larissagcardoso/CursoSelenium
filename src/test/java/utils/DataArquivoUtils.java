package utils;

import core.BasePage;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class DataArquivoUtils extends BasePage {

	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts); // vai retornar uma String no formato parametrizado
	}
}
