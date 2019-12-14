package com.example.myapplication.mobil;

import java.util.ArrayList;

public class Products {
    public  String name;
    public  String descripcion;

    public  Products(String _name, String _desc){
        this.name = _name;
        this.descripcion = _desc;
    }

    public  String toString(){
        return this.name;
    }

    public  static ArrayList<Products> getData(){
        ArrayList<Products> products = new ArrayList<>();
        products.add(new Products( "Peluche Animales",
                "Color Blanco y Negro"));

        products.add(new Products( "Peluche Heroes",
                "25 modelos"));

        products.add(new Products( "Almohadas",
                "25 modelos"));
        products.add(new Products( "Peluche Corazones",
                "25 modelos"));

        products.add(new Products( "Peluche Equipos",
                "25 modelos"));

        products.add(new Products( "Peluche Coreanos",
                "25 modelos"));

        products.add(new Products( "Peluche Perro",
                "25 modelos"));
        products.add(new Products( "Peluche Gato",
                "25 modelos"));

        return products;
    }
}
