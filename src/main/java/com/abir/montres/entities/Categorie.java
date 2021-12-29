package com.abir.montres.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idCat;
private String nomCat;
private String descriptionCat;

@Override
public String toString() {
	return ReflectionToStringBuilder.reflectionToString(this); 
	}

@JsonIgnore
@OneToMany(mappedBy = "categorie")
private List<Montre> montres;

//added all 

public Categorie() {
	super();
	}




public void setIdCat(long idCat) {
	this.idCat = idCat; // added
	// TODO Auto-generated method stub	
}
public void setNomCat(String nomCat) {
	this.nomCat = nomCat; // added
	// TODO Auto-generated method stub	
}
public void setDescriptionCat(String descriptionCat) {
	this.descriptionCat = descriptionCat; // added
	// TODO Auto-generated method stub	
}



public Long getIdCat() {
	return idCat;
}

public String getNomCat() {
	return nomCat;
}

public String getDescriptionCat() {
	return descriptionCat;
}


//
 
 







}