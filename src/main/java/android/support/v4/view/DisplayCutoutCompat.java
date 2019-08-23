package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

public final class DisplayCutoutCompat {
    private final Object mDisplayCutout;

    public final int hashCode() {
        if (this.mDisplayCutout == null) {
            return 0;
        }
        return this.mDisplayCutout.hashCode();
    }

    public final List<Rect> getBoundingRects() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.mDisplayCutout).getBoundingRects();
        }
        return null;
    }

    public final int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.mDisplayCutout).getSafeInsetBottom();
        }
        return 0;
    }

    public final int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.mDisplayCutout).getSafeInsetLeft();
        }
        return 0;
    }

    public final int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.mDisplayCutout).getSafeInsetRight();
        }
        return 0;
    }

    public final int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.mDisplayCutout).getSafeInsetTop();
        }
        return 0;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    private DisplayCutoutCompat(Object obj) {
        this.mDisplayCutout = obj;
    }

    static DisplayCutoutCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        return new DisplayCutoutCompat(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisplayCutoutCompat displayCutoutCompat = (DisplayCutoutCompat) obj;
        if (this.mDisplayCutout != null) {
            return this.mDisplayCutout.equals(displayCutoutCompat.mDisplayCutout);
        }
        if (displayCutoutCompat.mDisplayCutout == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DisplayCutoutCompat(android.graphics.Rect r3, java.util.List<android.graphics.Rect> r4) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000c
            android.view.DisplayCutout r0 = new android.view.DisplayCutout
            r0.<init>(r3, r4)
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.DisplayCutoutCompat.<init>(android.graphics.Rect, java.util.List):void");
    }
}
