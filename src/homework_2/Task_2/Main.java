package homework_2.Task_2;

import homework_2.Task_2.enums.Type;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!

        PC pc = new PC("PC name", Type.STATIONARY, "processor 1");
        Laptop laptop = new Laptop("Laptop name", Type.PORTABLE, "processor 2", 2.5F, 17);
        Ultrabook ultrabook = new Ultrabook("Ultrabook name", Type.PORTABLE, "processor 3", 1.5F,
                14, "for work");
        Workstation workstation = new Workstation("Workstation name", Type.STATIONARY, "processor 4",
                4F, 17, "calculate computer graphics algorithm");

        ArrayList<PC> pcs = new ArrayList<>();
        pcs.add(pc);
        pcs.add(laptop);
        pcs.add(ultrabook);
        pcs.add(workstation);

        for (var computer:pcs) {
            computer.work();
        }

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(ultrabook);
        laptops.add(workstation);


        for (var computer:laptops) {
            computer.work();
        }
    }
}
