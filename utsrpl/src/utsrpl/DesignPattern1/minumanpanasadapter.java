package utsrpl.DesignPattern1;

import utsrpl.DesignPattern2.minumanpanas;

public class minumanpanasadapter implements CatalogAdapter {

    private minumanpanas minumanpanas;

    public minumanpanasadapter(minumanpanas minumanpanas) {
        this.minumanpanas = minumanpanas;
    }


    @Override
    public String Catalogmenu() {
        return minumanpanas.getNama()+"\t\t\t"+minumanpanas.getHarga();
    }
}
