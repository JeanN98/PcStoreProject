package net.jpnv.PcStore.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity 
@Table(name="cliente")
public class cCliente extends cUsuario{
private String SaldoTarjeta;
private String TipoCliente;


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
