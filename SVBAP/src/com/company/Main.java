package com.company;

public class Main {

    public static void main(String[] args) {

        // Groups group = new Groups();
        System.out.println("Magic is happening, but it takes time...");


        Groups group = new Groups();

        for(int a = 0; a <= 2; a++) {
            group.energyNuclear(a);
            if (a == 2) {

            }
            for(int b = 0; b <= 3; b++) {
                group.energyCoal(b);
                if (b == 2) {

                }
                for(int c = 0; c <= 6; c++) {
                    group.energyGas(c);
                    if (c == 2) {

                    }
                    for(int d = 0; d <= 34; d++) {
                        group.energyWind(d);
                        if (d == 2) {

                        }
                        for(int e = 0; e <= 20; d++){
                            group.energySolar(e);
                            if (e == 2) {

                            }
                            for(int f = 0; f <= 8; f++){
                                group.energyHydro(f);
                                if (f == 2) {

                                }
                                for(int g = 0; g <= 5; g++){
                                    group.energyGeothermal(g);
                                    if (g == 2) {

                                    }
                                    for(int h = 0; h <= 15; h++){
                                        group.energyTidal(h);
                                        if (h == 2) {

                                        }
                                        for(int i = 0; i <= 2; i++){
                                            group.calcFoodFarmedMeat();
                                            if (i == 2) {

                                            }
                                            for(int j = 0; j <= 2; j++){
                                                group.calcFoodMonoculture();
                                                if (j == 2) {

                                                }
                                                for(int k = 0; k <= 2; k++){
                                                    group.calcFoodRangeImported();
                                                    if (k == 2) {

                                                    }
                                                    for(int l = 0; l <= 2; l++){
                                                        group.calcFoodRangeLocal();
                                                        System.out.println(group.getResults()[1]);
                                                        group.reset();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
