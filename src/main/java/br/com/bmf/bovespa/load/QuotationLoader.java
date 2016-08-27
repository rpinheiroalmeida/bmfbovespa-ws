package br.com.bmf.bovespa.load;

import java.util.List;

import org.easycassandra.persistence.cassandra.Persistence;

import br.com.bmf.bovespa.processing.file.model.Quotation;

public class QuotationLoader {

	private Persistence persistence = CassandraManager.INSTANCE.getPersistence();
	
	public void save(Quotation quotation) {
		System.out.println(String.format("Salvando Quotation [%s]", quotation.toString()));
		persistence.insert(quotation);
	}
	
	public List<Quotation> findByIndex(String code) {
		return persistence.findByIndex("code", code, Quotation.class);
	}
}
