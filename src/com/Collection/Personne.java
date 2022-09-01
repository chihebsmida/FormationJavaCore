package com.Collection;

import java.util.Comparator;

public class Personne implements Comparator<Personne>
{
    private  String nom,prenom,genre;
    private  int age;

    public Personne() {
    }

    public Personne(String nom, String prenom, String genre, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", genre='" + genre + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Personne o1, Personne o2)
    {
        if(o1.getAge()== o2.getAge())
            return o1.getNom().compareTo(o2.getNom());

         return o1.getAge()- o2.getAge();}


    public int compareVersion2(Personne o1, Personne o2)
    {
        if(o1.getAge()== o2.getAge())
            return o1.getGenre().compareTo(o2.getGenre());

        return o2.getAge()-o1.getAge();}

}

