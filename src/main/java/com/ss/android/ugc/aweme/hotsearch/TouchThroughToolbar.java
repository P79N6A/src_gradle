package com.ss.android.ugc.aweme.hotsearch;

import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;

public class TouchThroughToolbar extends Toolbar {
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
