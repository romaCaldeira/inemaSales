package br.com.inemaSales.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InemaUtils {
	
	public String obterProperties(String properties){
		return PropertiesLoaderImpl.getValor(properties);
	}

	private static class PropertiesLoader {
		private Properties props;
		private String nomeDoProperties = "messages.properties";
		protected PropertiesLoader(){
			props = new Properties();
			InputStream in = this.getClass().getResourceAsStream(nomeDoProperties);
			try{
				props.load(in);
				in.close();
			}
			catch(IOException e){e.printStackTrace();}
		}
		protected String getValor(String chave){
			return (String)props.getProperty(chave);
		}
	}

	private static class PropertiesLoaderImpl {
		private static final PropertiesLoader loader = new PropertiesLoader();
		public static String getValor(String chave){
			return (String)loader.getValor(chave);
		}
	}

}
