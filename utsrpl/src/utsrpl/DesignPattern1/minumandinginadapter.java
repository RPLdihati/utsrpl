package utsrpl.DesignPattern1;

import utsrpl.DesignPattern2.minumandingin;

public class minumandinginadapter implements CatalogAdapter{

    private minumandingin minumandingin;

    public minumandinginadapter(minumandingin Minumandingin) {
        this.minumandingin = Minumandingin;
    }


    @Override
    public String Catalogmenu() {
        return minumandingin.getNama()+"\t\t\t"+minumandingin.getHarga();
    }
}
