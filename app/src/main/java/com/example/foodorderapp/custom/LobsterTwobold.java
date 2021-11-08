package com.example.foodorderapp.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class LobsterTwobold extends AppCompatTextView {

    public LobsterTwobold(@NonNull Context context) {
        super(context);
        setlobsterbold();
    }

    public LobsterTwobold(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setlobsterbold();
    }

    public LobsterTwobold(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setlobsterbold();
    }
    private void setlobsterbold(){
        Typeface typeface=Utils.getLobsterTwoBoldTypeface(getContext());
        setTypeface(typeface);
    }
}
