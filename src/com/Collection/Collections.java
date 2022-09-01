package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections
{
    public static void main(String args []) {

       // List<Personne> personnes = new ArrayList<>();
        List<Personne> personnes = new LinkedList<>();
        personnes.add(new Personne("personne1","prenom1","HOMME",30));
        personnes.add(new Personne("personne2","prenom2","FEMME",30));
        personnes.add(new Personne("personne3","prenom3","HOMME",20));
        System.out.println("parcour list avec compteur");
        for(int i=0;i<personnes.size();i++)
        {
            System.out.println(personnes.get(i).toString());
        }
        System.out.println("parcour list avec iterator");
        Iterator<Personne>iterator=personnes.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().toString());
        System.out.println("parcour list avec une variable de type personne");
        for (Personne personne:personnes)
            System.out.println(personne.toString());
        System.out.println("parcour liste avec methode foreach");
        personnes.forEach(p->{System.out.println(p.toString());});
        //personnes.forEach(Personne::toString);
      //  personnes.sort(((o1, o2) -> {if(o1.getAge()== o2.getAge())return o1.getNom().compareTo(o2.getNom());
      //  return o1.getAge()- o2.getAge();}));
        personnes.sort(new Personne()::compare);
        System.out.println(personnes.toString());
        personnes.sort(new Personne()::compareVersion2);
        System.out.println(personnes.toString());



    }

}
