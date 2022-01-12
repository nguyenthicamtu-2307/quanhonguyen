package com.example.foodorderapp.Helper;


import android.content.Context;
import android.widget.Toast;

import com.example.foodorderapp.Interface.ChangeNumberItemsListener;
import com.example.foodorderapp.activity.ListviewMon.Mon;


import java.util.ArrayList;

public class ManagementCart {
    private Context context;
    private TinyDB tinyDB;

    public ManagementCart(Context context) {
        this.context = context;
        this.tinyDB = new TinyDB(context);
    }

    public void insertFood(Mon item) {
        ArrayList<Mon> listFood = getListCard();
        boolean existAlready = false;
        int n = 0;
        for (int i = 0; i < listFood.size(); i++) {
            if (listFood.get(i).getTenmon().equals(item.getTenmon())) {
                existAlready = true;
                n = i;
                break;
            }
        }

        if (existAlready) {
            listFood.get(n).setSoluongdathang(item.getSoluongdathang());
        } else {
            listFood.add(item);
        }

        tinyDB.putListObject("CardList", listFood);
        Toast.makeText(context, "Added To Your Card", Toast.LENGTH_SHORT).show();

    }
    public void deleteOrder() {
        ArrayList<Mon> listFood = new ArrayList<>();
        tinyDB.putListObject("CardList", listFood);
        Toast.makeText(context, "Đặt hàng thành công!", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<Mon> getListCard() {
        return tinyDB.getListObject("CardList");
    }

    public void plusNumberFood(ArrayList<Mon> listfood, int position, ChangeNumberItemsListener changeNumberItemsListener) {
        listfood.get(position).setSoluongdathang(listfood.get(position).getSoluongdathang() + 1);
        tinyDB.putListObject("CardList", listfood);
        changeNumberItemsListener.changed();
    }

    public void MinusNumerFood(ArrayList<Mon> listfood, int position, ChangeNumberItemsListener changeNumberItemsListener) {
        if (listfood.get(position).getSoluongdathang() == 1) {
            listfood.remove(position);
        } else {
            listfood.get(position).setSoluongdathang(listfood.get(position).getSoluongdathang() - 1);
        }
        tinyDB.putListObject("CardList", listfood);
        changeNumberItemsListener.changed();
    }

    public Double getTotalFee() {
        ArrayList<Mon> listFood2 = getListCard();
        double fee = 0;
        for (int i = 0; i < listFood2.size(); i++) {
            fee = fee + (Integer.parseInt(listFood2.get(i).getGia()) * listFood2.get(i).getSoluongdathang());
        }
        return fee;
    }
    public int getTotalItems() {
        ArrayList<Mon> listFood3 = getListCard();
        int t = 0;
        for (int i = 0; i < listFood3.size(); i++) {
            t = t + (listFood3.get(i).getSoluongdathang());
        }
        return t;
    }

}

