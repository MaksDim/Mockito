package ru.Netology;

public class CartRepository {
    private PurchaseItem[] items = new PurchaseItem[0];

    public void save(PurchaseItem item) {
        //создаем новый массив на единицу больше
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];


        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
    }

    public PurchaseItem[] findAll() {return items; }

    public void removeById(int id) {
        int length = items.length - 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
    }
}
