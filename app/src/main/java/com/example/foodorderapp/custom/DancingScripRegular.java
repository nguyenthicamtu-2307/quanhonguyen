package com.example.foodorderapp.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class DancingScripRegular extends AppCompatTextView {
    public DancingScripRegular(@NonNull Context context) {
        super(context);
        setdancingtextview();
    }

    public DancingScripRegular(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setdancingtextview();
    }

    public DancingScripRegular(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setdancingtextview();
    }
    private void setdancingtextview(){
        Typeface typeface=Utils.getDancingScriptRegulaTypeface(getContext());
        setTypeface(typeface);
    }
}
