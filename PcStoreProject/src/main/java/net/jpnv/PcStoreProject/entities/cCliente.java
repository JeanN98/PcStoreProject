package net.jpnv.PcStoreProject.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity 
@Table(name="cliente")
public class cCliente {
	private String SaldoTarjeta;
	private String TipoCliente;
	//text//

	public String getSaldoTarjeta() {
		return SaldoTarjeta;
	}
	public void setSaldoTarjeta(String saldoTarjeta) {
		SaldoTarjeta = saldoTarjeta;
	}
	public String getTipoCliente() {
		return TipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		TipoCliente = tipoCliente;
	} 
}
