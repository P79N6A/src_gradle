package com.facebook.c.b;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f23337a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23338b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23339a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f23340b;
    }

    public final int a() {
        return this.f23338b;
    }

    private c(int i, float[] fArr) {
        boolean z;
        this.f23338b = i;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f23337a = (float[]) com.facebook.c.c.c.a(fArr, z, "data");
    }

    public /* synthetic */ c(int i, float[] fArr, byte b2) {
        this(i, fArr);
    }
}
