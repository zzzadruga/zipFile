package ru.bipartner;

import java.io.File;
import net.lingala.zip4j.core.ZipFile;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CheckZipArchive implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		File file = exchange.getIn().getBody(File.class);
		ZipFile zipFile = new ZipFile(file);
		if (!zipFile.isValidZipFile()) {
			throw new Exception();
		}
	}
	
}
