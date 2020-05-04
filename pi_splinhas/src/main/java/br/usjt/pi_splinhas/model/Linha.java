package br.usjt.pi_splinhas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Linha implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long cl;
	private boolean lc;
	private String lt;
	private int sl;
	private int tl;
	private String tp;
	private String ts;
	
	
	public Long getCl() {
		return cl;
	}
	public boolean isLc() {
		return lc;
	}
	public String getLt() {
		return lt;
	}
	public int getSl() {
		return sl;
	}
	public int getTl() {
		return tl;
	}
	public String getTp() {
		return tp;
	}
	public String getTs() {
		return ts;
	}
	public void setCl(Long cl) {
		this.cl = cl;
	}
	public void setLc(boolean lc) {
		this.lc = lc;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public void setTl(int tl) {
		this.tl = tl;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	
	
	@Override
	public String toString() {
		return "Linha [cl=" + cl + ", lc=" + lc + ", lt=" + lt + ", sl=" + sl + ", tl=" + tl + ", tp=" + tp + ", ts="
				+ ts + "]";
	}
	
	
	
	
	
	

}
