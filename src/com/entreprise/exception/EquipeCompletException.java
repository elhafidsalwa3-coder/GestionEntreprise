package com.entreprise.exception;
import com.entreprise.exception.*;
//héritage:exception non vérifiée
public class EquipeCompletException extends RuntimeException{
        private int capacite;
        
        public EquipeCompletException(int capacite) {
        	super("equipe complete(capacite:" +capacite+ ")");
        	this.capacite=capacite;
        }
        
        public int getCapacite() {
        	return capacite;
        }
}
