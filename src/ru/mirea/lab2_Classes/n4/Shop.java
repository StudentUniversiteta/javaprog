package ru.mirea.lab2_Classes.n4;

public class Shop
{
    public Pc[] arr;
    int sysCount;
    public Pc error = new Pc();
    Shop() {
        arr = new Pc[0];
        sysCount = 0;
    }

    public Pc pcFind(String nName) {
        for (int i = 0; i < sysCount; i++) {
            if (arr[i].getName().equals(nName)) {
                return arr[i];
            }
        }
        return error;
    }

    public void addPc(String nName) {
        Pc mass2[] = new Pc[sysCount + 1];
        for (int i = 0; i < sysCount; i++) {
            mass2[i] = arr[i];
            if (arr[i].getName() == nName) {
                return;
            }
        }
        mass2[sysCount] = new Pc(nName);

        sysCount += 1;
        arr = mass2;
    }

    public void delPc(String nName) {
        if (this.pcFind(nName) != null) {
            System.out.println("Удалён");
            sysCount--;
            int j = 0;
            Pc mass2[] = new Pc[sysCount];
            for (int i = 0; i < sysCount; i++) {
                if (nName.equals(arr[i].getName())) {
                    mass2[j] = arr[i];
                    j++;
                }
            }
        }
    }
}
