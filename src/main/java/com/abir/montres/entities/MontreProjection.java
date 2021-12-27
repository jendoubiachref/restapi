package com.abir.montres.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Montre.class })
public interface MontreProjection {
	public String getNomMontre();
}
