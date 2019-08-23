package com.ss.android.download.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Object[] f28507a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    private static Object[] f28508b = new Object[73];

    public static int a(int i) {
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 8;
    }
}
