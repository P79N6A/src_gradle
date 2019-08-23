package com.ss.android.medialib.NativePort;

import android.support.annotation.Keep;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.a;
import com.ss.android.medialib.b;
import com.ss.android.medialib.common.c;
import java.nio.ByteBuffer;

@Keep
public class HWAvcNativeBridge implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a mAVCEncoder;
    private long mNativePtr;

    public int getProfile() {
        return 0;
    }

    public native int nativeSetCodecConfig(long j, ByteBuffer byteBuffer, int i);

    public native int nativeSetColorFormat(long j, int i);

    public native int nativeSetHardEncoderStatus(long j, boolean z);

    public native void nativeSwapGlBuffer(long j);

    public native int nativeWriteFile(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public void onEncoderData(ByteBuffer byteBuffer, int i, boolean z) {
    }

    public void onEncoderData(byte[] bArr, int i, boolean z) {
    }

    public Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        return null;
    }

    public void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, int i2) {
    }

    public void onSwapGlBuffers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16574, new Class[0], Void.TYPE);
            return;
        }
        nativeSwapGlBuffer(this.mNativePtr);
    }

    public void onUninitHardEncoder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 16570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 16570, new Class[0], Void.TYPE);
            return;
        }
        if (this.mAVCEncoder != null) {
            this.mAVCEncoder.b();
            this.mAVCEncoder = null;
            c.a("HWAvcNativeBridge", "====== uninitAVCEncoder ======");
        }
    }

    public HWAvcNativeBridge(long j) {
        this.mNativePtr = j;
    }

    public void onSetCodecConfig(ByteBuffer byteBuffer) {
        if (PatchProxy.isSupport(new Object[]{byteBuffer}, this, changeQuickRedirect, false, 16572, new Class[]{ByteBuffer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{byteBuffer}, this, changeQuickRedirect, false, 16572, new Class[]{ByteBuffer.class}, Void.TYPE);
            return;
        }
        nativeSetCodecConfig(this.mNativePtr, byteBuffer, byteBuffer.remaining());
    }

    public void setColorFormat(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16568, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 16568, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        nativeSetColorFormat(this.mNativePtr, i);
    }

    public int onEncoderData(int i, int i2, int i3, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16571, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16571, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.mAVCEncoder != null) {
            int i4 = i;
            int i5 = i2;
            this.mAVCEncoder.a(i, i2, i3, z);
        }
        return 0;
    }

    public void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 16573, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 16573, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        nativeWriteFile(this.mNativePtr, byteBuffer, byteBuffer.remaining(), i, i2, i3);
    }

    public Surface onInitHardEncoder(int i, int i2, int i3, int i4, boolean z) {
        Surface surface;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 16569, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
            return (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, this, changeQuickRedirect, false, 16569, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
        }
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new a();
            this.mAVCEncoder.g = i4;
        } else {
            int i5 = i4;
        }
        a.a((b) this);
        a aVar = this.mAVCEncoder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, aVar, a.f29334a, false, 16157, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class)) {
            a aVar2 = aVar;
            surface = (Surface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, aVar2, a.f29334a, false, 16157, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Surface.class);
        } else {
            surface = aVar.a(i, i2, i3, 1, 1, i4, z);
        }
        if (surface == null) {
            this.mAVCEncoder = null;
            nativeSetHardEncoderStatus(this.mNativePtr, false);
            return null;
        }
        nativeSetHardEncoderStatus(this.mNativePtr, true);
        return surface;
    }
}
