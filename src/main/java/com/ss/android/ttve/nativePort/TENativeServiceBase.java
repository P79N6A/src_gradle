package com.ss.android.ttve.nativePort;

import android.support.annotation.Keep;
import com.ss.android.ttve.nativePort.a;

@Keep
public class TENativeServiceBase {
    protected a.C0395a mEncoderDataCallback;
    protected a.b mGetImageCallback;
    protected com.ss.android.ttve.common.a mOnErrorListener;
    protected com.ss.android.ttve.common.a mOnInfoListener;
    protected a.d mOpenGLCallback;

    public void nativeCallback_onOpenGLDrawBefore(int i, double d2) {
    }

    public void nativeCallback_onPreviewSurface(int i) {
    }

    public a.C0395a getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public com.ss.android.ttve.common.a getErrorListener() {
        return this.mOnErrorListener;
    }

    public com.ss.android.ttve.common.a getInfoListener() {
        return this.mOnInfoListener;
    }

    public a.d getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void setEncoderDataListener(a.C0395a aVar) {
        this.mEncoderDataCallback = aVar;
    }

    public void setErrorListener(com.ss.android.ttve.common.a aVar) {
        this.mOnErrorListener = aVar;
    }

    public void setGetImageCallback(a.b bVar) {
        this.mGetImageCallback = bVar;
    }

    public void setInfoListener(com.ss.android.ttve.common.a aVar) {
        this.mOnInfoListener = aVar;
    }

    public void setOpenGLListeners(a.d dVar) {
        this.mOpenGLCallback = dVar;
    }

    public void nativeCallback_onOpenGLCreate(int i) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.a(i);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.b(i);
        }
    }

    public void nativeCallback_onOpenGLDrawAfter(int i, double d2) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.a(i, d2);
        }
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f2) {
        if (this.mOnInfoListener != null) {
            this.mOnInfoListener.a(i, i2, f2, null);
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, int i, int i2, boolean z) {
        if (this.mEncoderDataCallback != null) {
            this.mEncoderDataCallback.a(bArr, i, i2, z);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f2, String str) {
        if (this.mOnErrorListener != null) {
            this.mOnErrorListener.a(i, i2, f2, str);
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i, int i2, int i3, float f2) {
        if (this.mGetImageCallback != null) {
            return this.mGetImageCallback.a(bArr, i, i2, i3, f2);
        }
        return 0;
    }
}
