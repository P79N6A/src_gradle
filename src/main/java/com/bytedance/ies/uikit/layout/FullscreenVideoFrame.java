package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

public class FullscreenVideoFrame extends FrameLayout {
    private Listener mListener;

    public interface Listener {
        void onHideFullscreenVideoFrame();
    }

    private void init() {
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public FullscreenVideoFrame(Context context) {
        super(context);
        init();
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.mListener != null) {
            this.mListener.onHideFullscreenVideoFrame();
        }
        return true;
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
