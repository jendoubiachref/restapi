package com.abir.montres.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


//import org.apache.commons.lang.buider.ToStringBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
@Entity

public class Montre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMontre;
	private String nomMontre;
	private Double prixMontre;
	
	@ManyToOne
	@JoinColumn(name="idCat") // added 
	private Categorie categorie;
	
	public Montre() {
	 
	}
	
	public Montre(String nomMontre, Double prixMontre , Categorie categorie) {
	super();
	this.nomMontre = nomMontre;
	this.prixMontre = prixMontre;
	this.categorie=categorie;  // added
	
	}
	
	public Long getIdMontre() {
		return idMontre;
	}
	
	public void setIdMontre(Long idMontre) {
		this.idMontre = idMontre;
		}
		public String getNomMontre() {
		return nomMontre;
		}
		public void setNomMontre(String nomMontre) {
		this.nomMontre = nomMontre;
		}
		public Double getPrixMontre() {
		return prixMontre;
		}
		public void setPrixMontre(Double prixMontre) {
		this.prixMontre = prixMontre;
		}
		
		
			// from here 
		public Categorie getCategorie() {
			return categorie;
		}
		
		public void setCategorie(Categorie categorie) {
			this.categorie=categorie;
		}
		
		
		@Override
		public String toString() {
		//return "Montre [idMontre=" + idMontre + ", nomMontre=" +

		//nomMontre + ", prixMontre=" + prixMontre+ "]";
			return ReflectionToStringBuilder.reflectionToString(this); //added

		}
}
