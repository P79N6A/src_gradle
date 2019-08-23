package com.bytedance.android.livesdk.app.dataholder;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final boolean[] f9046a = new boolean[0];

    /* renamed from: b  reason: collision with root package name */
    static final int[] f9047b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    static final long[] f9048c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    static final Object[] f9049d = new Object[0];

    public static int a(long[] jArr, int i, long j) {
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
