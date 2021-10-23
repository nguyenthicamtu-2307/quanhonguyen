package com.example.giaodien.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class blackjacktextview extends AppCompatTextView {
    public blackjacktextview(@NonNull Context context) {
        super(context);
        setfonttextview();
    }

    public blackjacktextview(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setfonttextview();
    }

    public blackjacktextview(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setfonttextview();
    }
    private void setfonttextview(){
        Typeface typeface=Utils.getBlackjackTypeface(getContext());
        setTypeface(typeface);
    }
}
