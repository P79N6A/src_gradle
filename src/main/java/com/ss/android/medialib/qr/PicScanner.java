package com.ss.android.medialib.qr;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.b;
import com.ss.android.vesdk.utils.BitmapLoader;

@Keep
public class PicScanner {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long handle = nativeCreate();
    private a listener;
    private boolean success;

    public interface a {
        void a(boolean z);
    }

    private native long nativeCreate();

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native void nativeRelease(long j);

    private native int nativeStart(long j, Bitmap bitmap, ScanSettings scanSettings);

    private native void nativeStop(long j);

    static {
        b.a();
    }

    public boolean isSuccess() {
        return this.success;
    }

    public boolean isValid() {
        if (this.handle != 0) {
            return true;
        }
        return false;
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17764, new Class[0], Void.TYPE);
        } else if (this.handle != 0) {
            nativeRelease(this.handle);
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17763, new Class[0], Void.TYPE);
        } else if (this.handle != 0) {
            nativeStop(this.handle);
        }
    }

    public EnigmaResult getEnigmaResult() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17765, new Class[0], EnigmaResult.class)) {
            return (EnigmaResult) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17765, new Class[0], EnigmaResult.class);
        } else if (this.handle == 0) {
            return null;
        } else {
            EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(this.handle);
            if (!(nativeGetEnigmaResult == null || nativeGetEnigmaResult.getResult() == null)) {
                this.success = true;
            }
            return nativeGetEnigmaResult;
        }
    }

    public void setListener(a aVar) {
        this.listener = aVar;
    }

    public void onResult(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17766, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 17766, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.listener != null) {
            this.listener.a(z);
        }
    }

    public int start(Bitmap bitmap, ScanSettings scanSettings) {
        if (PatchProxy.isSupport(new Object[]{bitmap, scanSettings}, this, changeQuickRedirect, false, 17762, new Class[]{Bitmap.class, ScanSettings.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap, scanSettings}, this, changeQuickRedirect, false, 17762, new Class[]{Bitmap.class, ScanSettings.class}, Integer.TYPE)).intValue();
        } else if (bitmap == null) {
            return -1;
        } else {
            this.success = false;
            nativeStart(this.handle, bitmap, scanSettings);
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return 0;
        }
    }

    public int start(String str, ScanSettings scanSettings) {
        String str2 = str;
        ScanSettings scanSettings2 = scanSettings;
        if (PatchProxy.isSupport(new Object[]{str2, scanSettings2}, this, changeQuickRedirect, false, 17761, new Class[]{String.class, ScanSettings.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, scanSettings2}, this, changeQuickRedirect, false, 17761, new Class[]{String.class, ScanSettings.class}, Integer.TYPE)).intValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            try {
                Bitmap loadBitmap = BitmapLoader.loadBitmap(str2, scanSettings2.width, scanSettings2.height);
                if (loadBitmap != null) {
                    int width = loadBitmap.getWidth();
                    int height = loadBitmap.getHeight();
                    if (width * height > 4000000) {
                        float sqrt = (float) (1.0d / Math.sqrt((double) ((((float) width) * ((float) height)) / 4000000.0f)));
                        Matrix matrix = new Matrix();
                        matrix.postScale(sqrt, sqrt);
                        Bitmap.createBitmap(loadBitmap, 0, 0, width, height, matrix, true);
                    } else {
                        loadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                    }
                }
                return start(loadBitmap.copy(Bitmap.Config.ARGB_8888, true), scanSettings2);
            } catch (Exception unused) {
                return -2;
            } catch (OutOfMemoryError unused2) {
                return -3;
            }
        }
    }
}
