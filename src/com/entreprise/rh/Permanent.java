package com.entreprise.rh;
 import com.entreprise.exception.MontantInvalideException;

public class Permanent extends Employe implements Augmentable{   
	private double salaireMensuel;   
	public Permanent(String nom, double salaire) {   
		super(nom);     
		if (salaire <= 0) throw new MontantInvalideException("salaire",salaire);      
		this.salaireMensuel = salaire;     }     
	}
	public Permanent(String nom, double salaire, String agence) {       
		super(nom, agence);       
		if (salaire <= 0) throw new MontantInvalideException("salaire",salaire);       
		this.salaireMensuel = salaire;   
		}  
	@Override     
	public String getPoste() { 
			return "Permanent"; }     
	@Override     
	public double getSalaire() { 
				return salaireMensuel; }     
			@Override    
	public String toString() {       
				return getPoste() + "[" + 
	super.toString() + ", salaire=" + getSalaire() + "]";     }
			@Override
			public double getMontantPayer() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public void augmenter(double taux) {
				// TODO Auto-generated method stub
				
			} 
	}
