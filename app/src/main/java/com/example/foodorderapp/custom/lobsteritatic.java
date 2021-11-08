package com.example.foodorderapp.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class lobsteritatic extends AppCompatTextView {
    public lobsteritatic(@NonNull Context context) {
        super(context);
        setitatic();
    }

    public lobsteritatic(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setitatic();
    }

    public lobsteritatic(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setitatic();
    }
    private void setitatic(){
        Typeface typeface=Utils.getLobsterTwoItalicTypeface(getContext());
        setTypeface(typeface);
    }
}
