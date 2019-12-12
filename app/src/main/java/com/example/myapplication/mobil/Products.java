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
        products.add(new Products( "Galletitas",
                "Galletas deliciosas"));
        return products;
    }
}
