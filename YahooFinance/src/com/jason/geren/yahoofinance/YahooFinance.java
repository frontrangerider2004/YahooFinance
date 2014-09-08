package com.jason.geren.yahoofinance;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.jason.geren.yahoofinance.utils.FileUtils;

public class YahooFinance {
	private static final String SAVE_DIRECTORY = "queries/";
	private static final String OUTPUT_FILE = "YahooFinance";
	private static final String FILE_EXTENSION = "txt";
	
	public static void main(String[] args) {
		FileUtils fileUtils = new FileUtils();
		
		File file = fileUtils.createFile(SAVE_DIRECTORY, OUTPUT_FILE, FILE_EXTENSION);
		
		String baseUrl = "http://download.finance.yahoo.com/d/quotes.csv?s=%40%5EDJI,";
		String symbol = "GOOG";
		String propertyInvocation = "&f=";
		String propertyFlags = "nsl1op";
		String csvRequest = "&e=.csv";
		StringBuilder urlStringBuilder = new StringBuilder();
		
		urlStringBuilder.append(baseUrl);
		urlStringBuilder.append(symbol);
		urlStringBuilder.append(propertyInvocation);
		urlStringBuilder.append(propertyFlags);
		urlStringBuilder.append(csvRequest);
		System.out.println("Querying..." + urlStringBuilder.toString());
		
		try {
			// new ClientResource(
			// "https://query.yahooapis.com/v1/public/yql?q=SELECT%20*%20FROM%20yahoo.finance.keystats%20WHERE%20symbol%3D'T'&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
			// .get().write(System.out);
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			//bw.write(content);
			
			new ClientResource(urlStringBuilder.toString()).get().write(bw);
			//new ClientResource(UrlStringBuilder.toString()).get().write(System.out);
			bw.close();
			System.out.println("Done");
		} catch (ResourceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // End Main
	
} // End Class
