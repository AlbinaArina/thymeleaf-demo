package com.example.thymeleafdemo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@SpringBootApplication
public class ThymeleafDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ThymeleafDemoApplication.class, args);
		generatePDF();
	}

	public static void generatePDF() throws IOException {
		File htmlFile = new File("D:\\ПРОЄКТИ\\JAVA\\thymeleaf-demo\\src\\main\\resources\\templates\\words.html");

		Document document = Jsoup.parse(htmlFile, "UTF-8");
		document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);

		try (OutputStream outputStream = new FileOutputStream("D:\\ПРОЄКТИ\\JAVA\\thymeleaf-demo\\src\\main\\resources\\templates\\output_1.pdf")) {
			ITextRenderer renderer = new ITextRenderer();
			SharedContext sharedContext = renderer.getSharedContext();
			sharedContext.setPrint(true);
			sharedContext.setInteractive(false);
			renderer.setDocumentFromString(document.html());
			renderer.layout();
			renderer.createPDF(outputStream);
		}
		System.out.println("done");
	}

}
