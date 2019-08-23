package com.ss.ttm.player;

import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TTSurfaceCallback implements SurfaceHolder.Callback {
    private static final String TAG = "TTSurfaceCallback";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ISurfaceListener mListener;

    TTSurfaceCallback(ISurfaceListener iSurfaceListener) {
        this.mListener = iSurfaceListener;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91131, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91131, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.mListener != null) {
            this.mListener.onSurfaceCreated(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91130, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91130, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.mListener != null) {
            this.mListener.onSurfaceDestroyed(surfaceHolder);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder surfaceHolder2 = surfaceHolder;
        if (PatchProxy.isSupport(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91129, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91129, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mListener != null) {
            this.mListener.onSurfaceChanged(surfaceHolder);
        }
    }
}
