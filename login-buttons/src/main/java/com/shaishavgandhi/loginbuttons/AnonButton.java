package com.shaishavgandhi.loginbuttons;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Carc.me on 05.10.16.
 *
 * Anonymous button
 */
public class AnonButton extends BaseButton {

    public AnonButton(Context context, AttributeSet attrs) {
        super(context,attrs, R.color.anonymous, R.drawable.ic_user);
    }

    public AnonButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle, R.color.anonymous, R.drawable.ic_user);
    }

    public AnonButton(Context context) {
        super(context);
    }

}