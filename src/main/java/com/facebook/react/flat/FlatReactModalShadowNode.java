package com.facebook.react.flat;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;

public class FlatReactModalShadowNode extends FlatShadowNode implements AndroidView {
    private final Point mMaxPoint = new Point();
    private final Point mMinPoint = new Point();
    private boolean mPaddingChanged;

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void resetPaddingChanged() {
        this.mPaddingChanged = false;
    }

    public boolean isPaddingChanged() {
        return this.mPaddingChanged;
    }

    FlatReactModalShadowNode() {
        forceMountToView();
        forceMountChildrenToView();
    }

    public void setPadding(int i, float f2) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.unit != YogaUnit.POINT || stylePadding.value != f2) {
            super.setPadding(i, f2);
            this.mPaddingChanged = true;
            markUpdated();
        }
    }

    public void setPaddingPercent(int i, float f2) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.unit != YogaUnit.PERCENT || stylePadding.value != f2) {
            super.setPadding(i, f2);
            this.mPaddingChanged = true;
            markUpdated();
        }
    }

    @TargetApi(16)
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        int i2;
        int i3;
        super.addChildAt(reactShadowNodeImpl, i);
        Display defaultDisplay = ((WindowManager) getThemedContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(this.mMinPoint, this.mMaxPoint);
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0 || rotation == 2) {
            i2 = this.mMinPoint.x;
            i3 = this.mMaxPoint.y;
        } else {
            i2 = this.mMaxPoint.x;
            i3 = this.mMinPoint.y;
        }
        reactShadowNodeImpl.setStyleWidth((float) i2);
        reactShadowNodeImpl.setStyleHeight((float) i3);
    }
}