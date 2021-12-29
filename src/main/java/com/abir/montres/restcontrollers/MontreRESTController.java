package com.abir.montres.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abir.montres.entities.Montre;
import com.abir.montres.service.MontreService;
import com.abir.montres.entities.Categorie;
//import com.abir.montres.service.CategorieService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class MontreRESTController {
@Autowired
MontreService montreService;
//CategorieService categorieService;





@RequestMapping(method = RequestMethod.GET)
public List<Montre> getAllMontres() {
return montreService.getAllMontres();
}

@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Montre getMontreById(@PathVariable("id") Long id) {
return montreService.getMontre(id);
}

@RequestMapping(method = RequestMethod.POST)
public Montre createMontre(@RequestBody Montre montre) {
return montreService.saveMontre(montre);
}

@RequestMapping(method = RequestMethod.PUT)
public Montre updateMontre(@RequestBody Montre montre) {
return montreService.updateMontre(montre);
}


@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteMontre(@PathVariable("id") Long id)
{
montreService.deleteMontreById(id);
}

@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
public List<Montre> getMontresByCatId(@PathVariable("idCat") Long idCat) {
return montreService.findByCategorieIdCat(idCat);
}

@RequestMapping(value = "/prodscats/" ,method = RequestMethod.GET)
 public List<Categorie> listCategories() {
 return montreService.listCategories();
 }
 

}