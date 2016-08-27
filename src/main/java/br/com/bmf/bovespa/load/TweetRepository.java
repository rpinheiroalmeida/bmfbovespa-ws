package br.com.bmf.bovespa.load;

import java.util.List;
import java.util.UUID;

import org.easycassandra.persistence.cassandra.Persistence;

import br.com.bmf.bovespa.processing.file.model.Quotation;

public class TweetRepository {

	private Persistence persistence = CassandraManager.INSTANCE.getPersistence();
	
	public List<Quotation> findByIndex(String nickName) {
		return persistence.findByIndex("nickName", nickName, Quotation.class);
	}

	


	public void save(Quotation quotation) {
		persistence.insert(quotation);
	}


	public Quotation findOne(UUID uuid) {
		return persistence.findByKey(uuid, Quotation.class);
	}
	
}
