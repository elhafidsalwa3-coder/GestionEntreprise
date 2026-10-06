package com.entreprise.compta;

public class Facture implements Payable {
   private String numero;
   private String fournisseur;
   private double montant;
   
   public void facture(String numero,String fournisseur,double montant) {
	   this.numero=numero;
	   this.fournisseur=fournisseur;
   }
//le montant payer
   @Override
   public double getMontantAPayer() {
	return montant;
   }
   //affichage
   public String toString() {
	   return "Facture F-102"+numero+"("+fournisseur+") :" +montant;
   }
}
