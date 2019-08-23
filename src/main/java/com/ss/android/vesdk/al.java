package com.ss.android.vesdk;

import android.support.annotation.NonNull;
import java.util.Arrays;

public class al {

    /* renamed from: a  reason: collision with root package name */
    public String[] f77892a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f77893b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f77894c = null;

    /* renamed from: d  reason: collision with root package name */
    public String[] f77895d = null;

    /* renamed from: e  reason: collision with root package name */
    public int[] f77896e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f77897f;
    public int[] g;
    public int[] h;
    public double[] i;
    public boolean[] j;
    public c[] k;
    private int[] l;

    public al(@NonNull String[] strArr) {
        int length = strArr.length;
        this.f77892a = (String[]) strArr.clone();
        this.f77896e = new int[length];
        Arrays.fill(this.f77896e, 0);
        this.f77897f = new int[length];
        Arrays.fill(this.f77897f, -1);
        this.g = new int[length];
        Arrays.fill(this.g, 0);
        this.h = new int[length];
        Arrays.fill(this.h, -1);
        this.i = new double[length];
        Arrays.fill(this.i, 1.0d);
        this.f77893b = new int[length];
        this.l = new int[length];
        this.j = new boolean[length];
        Arrays.fill(this.j, true);
        this.k = new c[length];
        Arrays.fill(this.k, c.ROTATE_NONE);
        for (int i2 = 0; i2 < length; i2++) {
            this.f77893b[i2] = i2;
            this.l[i2] = i2;
        }
    }
}
