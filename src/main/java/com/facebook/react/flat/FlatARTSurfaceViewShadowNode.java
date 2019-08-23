package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.views.art.ARTVirtualNode;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
import javax.annotation.Nullable;

public class FlatARTSurfaceViewShadowNode extends FlatShadowNode implements TextureView.SurfaceTextureListener, AndroidView {
    private boolean mPaddingChanged;
    @Nullable
    private Surface mSurface;

    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return true;
    }

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void resetPaddingChanged() {
        this.mPaddingChanged = false;
    }

    public boolean isPaddingChanged() {
        return this.mPaddingChanged;
    }

    FlatARTSurfaceViewShadowNode() {
        forceMountToView();
        forceMountChildrenToView();
    }

    private void drawOutput() {
        if (this.mSurface == null || !this.mSurface.isValid()) {
            markChildrenUpdatesSeen(this);
            return;
        }
        try {
            Canvas lockCanvas = this.mSurface.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Paint paint = new Paint();
            for (int i = 0; i < getChildCount(); i++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) getChildAt(i);
                aRTVirtualNode.draw(lockCanvas, paint, 1.0f);
                aRTVirtualNode.markUpdateSeen();
            }
            if (this.mSurface != null) {
                this.mSurface.unlockCanvasAndPost(lockCanvas);
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.mSurface = null;
        return true;
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        drawOutput();
        uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), this);
    }

    private void markChildrenUpdatesSeen(ReactShadowNode reactShadowNode) {
        for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
            ReactShadowNode childAt = reactShadowNode.getChildAt(i);
            childAt.markUpdateSeen();
            markChildrenUpdatesSeen(childAt);
        }
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

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mSurface = new Surface(surfaceTexture);
        drawOutput();
    }
}
