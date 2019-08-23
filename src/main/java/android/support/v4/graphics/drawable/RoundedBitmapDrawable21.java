package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.support.annotation.RequiresApi;
import android.view.Gravity;

@RequiresApi(21)
public class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    public boolean hasMipMap() {
        if (this.mBitmap == null || !this.mBitmap.hasMipMap()) {
            return false;
        }
        return true;
    }

    public void getOutline(Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    public void setMipMap(boolean z) {
        if (this.mBitmap != null) {
            this.mBitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }

    protected RoundedBitmapDrawable21(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: package-private */
    public void gravityCompatApply(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
