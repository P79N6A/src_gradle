package com.ss.android.vesdk;

public class FilterWrapper {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77836a;

    /* renamed from: b  reason: collision with root package name */
    public Long f77837b = 0L;

    /* renamed from: c  reason: collision with root package name */
    public int f77838c = 1;

    /* renamed from: d  reason: collision with root package name */
    private long f77839d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f77840e;

    private native int nativeComposerSetNodes(long j, String[] strArr, int i);

    private native int nativeComposerUpdateNode(long j, String str, String str2, float f2);

    private native void nativeConfigEffect(long j, int i, int i2, String str, String str2, boolean z);

    private native long nativeFilterCreate();

    private native int nativeFilterProcess(long j, int i, int i2, int i3, int i4, long j2, Long l, boolean z, int i5);

    private native void nativeFilterRelease(long j);

    public static native String nativeGetVersion();

    private native String nativeName(long j);

    private native int nativeSetBeautify(long j, String str, float f2, float f3);

    private native int nativeSetBeautifyWithSharp(long j, String str, float f2, float f3, float f4);

    private native void nativeSetEffect(long j, String str, float f2);

    private native void nativeSetFaceAttribute(long j, boolean z);

    private native int nativeSetFilter(long j, String str, float f2);

    private native int nativeSetFilter(long j, String str, String str2, float f2);

    private native int nativeSetParameter(long j, String str, Object obj);

    private native int nativeSetReshape(long j, String str, float f2, float f3);

    public FilterWrapper() {
        if (a()) {
            this.f77839d = nativeFilterCreate();
        }
        this.f77840e = true;
    }

    private boolean a() {
        try {
            this.f77836a = "com.bytedance:effectsdk:4.9.0_rel_8_douyin_201908051433_ab2890f94".contains(nativeGetVersion());
        } catch (Throwable unused) {
            this.f77836a = false;
        }
        return this.f77836a;
    }
}
