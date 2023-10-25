package service;

import java.util.Date;

public class Compte {
    private int code;
    private int solde;
    private Date dateCreation;

    public Compte() {
    	
    }
    public Compte(int code, int solde, Date dateCreation) {
        super();
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}