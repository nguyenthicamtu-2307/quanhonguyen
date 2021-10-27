package com.example.giaodien.custom;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface blackjackTypeface;
    private static Typeface DancingScriptRegulaTypeface;
    private static Typeface LobsterTwoBoldTypeface;
    private static Typeface LobsterTwoBoldItalicTypeface;
    private static Typeface LobsterTwoItalicTypeface;

    public static Typeface getBlackjackTypeface(Context context) {
        if (blackjackTypeface==null){
            blackjackTypeface=Typeface.createFromAsset(context.getAssets(), "fonts/blackjack.otf");
        }
        return blackjackTypeface;
    }

    public static Typeface getDancingScriptRegulaTypeface(Context context) {
        if (DancingScriptRegulaTypeface == null){
            DancingScriptRegulaTypeface=Typeface.createFromAsset(context.getAssets(), "fonts/DancingScript-Regular.otf");
        }
        return DancingScriptRegulaTypeface;

    }

    public static Typeface getLobsterTwoBoldTypeface(Context context) {
        if (LobsterTwoBoldTypeface == null){
            LobsterTwoBoldTypeface=Typeface.createFromAsset(context.getAssets(), "fonts/LobsterTwo-Bold.otf");
        }
        return LobsterTwoBoldTypeface;
    }

    public static Typeface getLobsterTwoBoldItalicTypeface(Context context) {
        if (LobsterTwoBoldItalicTypeface ==null)
        {
            LobsterTwoBoldItalicTypeface=Typeface.createFromAsset(context.getAssets(),"fonts/LobsterTwo-BoldItalic.otf");

        }
        return LobsterTwoBoldItalicTypeface;
    }

    public static Typeface getLobsterTwoItalicTypeface(Context context) {
        if (LobsterTwoItalicTypeface==null){
            LobsterTwoItalicTypeface=Typeface.createFromAsset(context.getAssets(), "fonts/LobsterTwo-Italic.otf");
        }
        return LobsterTwoItalicTypeface;
    }
}
