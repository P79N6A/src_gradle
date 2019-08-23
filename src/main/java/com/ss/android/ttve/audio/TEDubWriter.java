package com.ss.android.ttve.audio;

public class TEDubWriter implements a {

    /* renamed from: a  reason: collision with root package name */
    long f31142a = nativeCreate();

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d2, int i3, int i4);

    public final void b() {
        if (this.f31142a != 0) {
            nativeDestroy(this.f31142a);
        }
    }

    public final int a() {
        if (this.f31142a == 0) {
            return -112;
        }
        return nativeCloseWavFile(this.f31142a);
    }

    public final int a(byte[] bArr, int i) {
        if (this.f31142a == 0) {
            return -112;
        }
        return nativeAddPCMData(this.f31142a, bArr, i);
    }

    public final int a(String str, int i, int i2, double d2, int i3, int i4) {
        if (this.f31142a == 0) {
            return -112;
        }
        return nativeInitWavFile(this.f31142a, str, i, 2, d2, i3, i4);
    }
}
