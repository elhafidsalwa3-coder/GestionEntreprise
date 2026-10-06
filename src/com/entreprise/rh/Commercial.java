package com.entreprise.rh;
import com.entreprise.exception.MontantInvalideException;

public class Commercial extends Employe implements Augmentable{     
	private double fixe;    
	private double chiffreAffaires;   
	public Commercial(String nom, double fixe, double chiffreAffaires, String agence) {        
		super(nom, agence);         
		if (fixe <= 0) fixe = 0;                   
		      
		if (chiffreAffaires < 0) chiffreAffaires = 0; 
		       
		this.fixe = fixe;        
		this.chiffreAffaires = chiffreAffaires;  
		}      
	
	@Override    
	public String getPoste() {
		return "Commercial";
		} 
	
	@Override     public double getSalaire() { 
		return fixe + chiffreAffaires * 5 / 100; 
		}   
	
@Override   
public String toString() {       
	return getPoste() + "[" + super.toString() + ", fixe=" + fixe + ", chiffreAffaires=" + chiffreAffaires + "]";     
	}
//pour un commercial on augmente le fixe
public void augmenter(double taux) throws  MontantInvalideException {
	if(taux<=0 || TauxMax) throw new MontantInvalideException("taux",taux);
	fixe+= fixe*taux;
}

@Override
public String toString() {
	return "Commercial[matricule="+matricule+ ", nom=" +nom +", agence=" +agence+",fixe=" +fixe+",chiffreAffaires="+chiffreAffaires+"]";
}

@Override
public double getMontantAPayer() {
	return montant;
}
}