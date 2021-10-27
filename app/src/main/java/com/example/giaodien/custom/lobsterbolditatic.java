package com.example.giaodien.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class lobsterbolditatic extends AppCompatTextView {
    public lobsterbolditatic(@NonNull Context context) {
        super(context);
        setbolditatic();
    }

    public lobsterbolditatic(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setbolditatic();
    }

    public lobsterbolditatic(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setbolditatic();
    }
    private void setbolditatic(){
        Typeface typeface=Utils.getLobsterTwoBoldItalicTypeface(getContext());
        setTypeface(typeface);
    }
}
