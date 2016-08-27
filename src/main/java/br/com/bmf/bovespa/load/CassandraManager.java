package br.com.bmf.bovespa.load;

import org.easycassandra.persistence.cassandra.ClusterInformation;
import org.easycassandra.persistence.cassandra.EasyCassandraManager;
import org.easycassandra.persistence.cassandra.Persistence;

import br.com.bmf.bovespa.processing.file.model.Quotation;

public enum CassandraManager {
	INSTANCE;
	private EasyCassandraManager easyCassandraManager;
	private Persistence persistence;
	{
		easyCassandraManager = new EasyCassandraManager(ClusterInformation.create().addHost("localhost").withKeySpace("javabahia"));
		easyCassandraManager.addFamilyObject(Quotation.class);
		persistence = easyCassandraManager.getPersistence();
	}
	
	public Persistence getPersistence() {
		return persistence;
	}
}
