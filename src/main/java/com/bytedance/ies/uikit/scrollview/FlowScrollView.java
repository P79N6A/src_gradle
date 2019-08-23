package com.bytedance.ies.uikit.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class FlowScrollView extends ScrollView {
    int mLastY = -100;
    FlowListener mListener;

    public interface FlowListener {
        int getBottomThreshold();

        void onScrollChanged(int i, int i2, int i3, int i4, int i5);

        void onScrollToBottom();
    }

    public void setFLowListener(FlowListener flowListener) {
        this.mListener = flowListener;
    }

    public FlowScrollView(Context context) {
        super(context);
    }

    public FlowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FlowScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.mListener != null) {
            int height = getHeight();
            int computeVerticalScrollRange = computeVerticalScrollRange();
            if (computeVerticalScrollRange - i2 <= this.mListener.getBottomThreshold() + height) {
                this.mListener.onScrollToBottom();
            }
            if (this.mLastY == -100) {
                int i5 = this.mLastY;
                this.mLastY = i2;
                this.mListener.onScrollChanged(i2, i4, i5, height, computeVerticalScrollRange);
            } else if (Math.abs(i2 - this.mLastY) > height) {
                int i6 = this.mLastY;
                this.mLastY = i2;
                this.mListener.onScrollChanged(i2, i4, i6, height, computeVerticalScrollRange);
            }
        }
    }
}
