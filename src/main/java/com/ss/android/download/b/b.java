package com.ss.android.download.b;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final boolean[] f28509a = new boolean[0];

    /* renamed from: b  reason: collision with root package name */
    static final int[] f28510b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    static final long[] f28511c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    static final Object[] f28512d = new Object[0];

    static int a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }
}
