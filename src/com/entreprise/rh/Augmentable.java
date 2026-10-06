package com.entreprise.rh;

import com.entreprise.exception.MontantInvalideException;

public interface Augmentable {
	     //constante dans une interface public static
         public double TauxMax=0.20;
         public void augmenter(double taux) throws MontantInvalideException;
         
         //méthode par défaut:augmentation de 5%
         default void augmenterStandard() throws MontantInvalideException{
        	 augmenter(0,05);
         }	 
}  

