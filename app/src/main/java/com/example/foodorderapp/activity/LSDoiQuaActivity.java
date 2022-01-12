
package com.example.foodorderapp.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewPUD.Doiquaadapter;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;
import com.example.foodorderapp.activity.ListviewPUD.TichDiem;
import com.example.foodorderapp.model.KhachHang;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LSDoiQuaActivity extends AppCompatActivity {
    ListView lvmonPQ,lvmonPQ1,lvmonPQ2;
    SharedPreferences sharedpreferences;
    ArrayList<Mon> arraymon;
    List<Mon> mList=new ArrayList<Mon>();
    APIService apiService1,apiService2,apiService3,apiService;
    MonAdapter monAdapter,monAdapter1,monAdapter2;
    Loginactivity loginactivity;
    List<TichDiem> tichDiems;
    private List<KhachHang> khachHangs;
    private TichDiem td=new TichDiem();
    TextView diem;
    String point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phieudoiqua);
        lvmonPQ =(ListView) findViewById(R.id.LvDQ100);
        lvmonPQ1 =(ListView) findViewById(R.id.LvDQ200);
        lvmonPQ2 =(ListView) findViewById(R.id.LvDQ500);
        diem = (TextView) findViewById(R.id.textview_diemc) ;
        apiService1= Client.getApiServiceSP();
        apiService= Client.getAPIService();
        tichDiems = new ArrayList<TichDiem>();
        sharedpreferences=getSharedPreferences("diem",MODE_PRIVATE);
        diem.setText(String.valueOf(td.getSodiem()));
     point=diem.getText().toString();
        listar();
        Tichdiem();
//        addDiem();
//        diem.setText(Tichdiem());


    }
    public void listar(){
        Call<List<Mon>> call1= apiService1.getMon20k();
        Call<List<Mon>> call2= apiService1.getMon30k();
        Call<List<Mon>> call3= apiService1.getMon60k();
        call1.enqueue(new Callback<List<Mon>>() {
            @Override
            public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
                if(response.isSuccessful()){
                    mList=response.body();
                    lvmonPQ.setAdapter(new Doiquaadapter(LSDoiQuaActivity.this, R.layout.doiqua,mList));
                }
            }
            @Override
            public void onFailure(Call<List<Mon>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
        call2.enqueue(new Callback<List<Mon>>() {
            @Override
            public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
                if(response.isSuccessful()){
                    mList=response.body();
                    lvmonPQ1.setAdapter(new Doiquaadapter(LSDoiQuaActivity.this, R.layout.doiqua,mList));
                }
            }
            @Override
            public void onFailure(Call<List<Mon>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
        call3.enqueue(new Callback<List<Mon>>() {
            @Override
            public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
                if(response.isSuccessful()){
                    mList=response.body();
                    lvmonPQ2.setAdapter(new Doiquaadapter(LSDoiQuaActivity.this, R.layout.doiqua,mList));
                }
            }
            @Override
            public void onFailure(Call<List<Mon>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
    }
    public void Tichdiem() {
//        addDiem();
        saveInfor(td);
        Call<TichDiem>call=apiService.getalll(td.getUsername());
        call.enqueue(new Callback<TichDiem>() {
            @Override
            public void onResponse(Call<TichDiem> call, Response<TichDiem> response) {

               if(response.isSuccessful()){
                   td = response.body();
                   diem.setText(String.valueOf(td.getSodiem()));
//                   Toast.makeText(getApplicationContext(), ""+Loginactivity.unameGlobal, Toast.LENGTH_SHORT).show();
               }

            }

            @Override
            public void onFailure(Call<TichDiem> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
    }
    private void saveInfor(TichDiem tichDiem1) {
        tichDiem1.setUsername(Loginactivity.unameGlobal);

        Toast.makeText(getApplicationContext(), "makhachhang là:"+tichDiem1.getUsername(),Toast.LENGTH_SHORT).show();

    }
    //public void addDiem(){

//        SharedPreferences.Editor editor=sharedpreferences.edit();
//        editor.putString("diem",point);
//        String strdiem=diem.getText().toString().trim();
//        if(tichDiems == null || tichDiems.isEmpty()){
//            return;
//        }else {
//            for(TichDiem tichDiem: tichDiems){
//                if(Loginactivity.id.equals(tichDiem.getIdkh())){
//                    Toast.makeText(getApplicationContext(), ""+tichDiem.getIdkh(), Toast.LENGTH_SHORT).show();
//                    diem.setText(String.valueOf(td.getSodiem()));
//                    break;
//                }
//
//            }
        }





