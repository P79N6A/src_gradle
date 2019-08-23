package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;
import javax.annotation.Nullable;

public final class d {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Pair<Integer, Integer> f24234a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final ColorSpace f24235b;

    public d(int i, int i2, @Nullable ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i == -1 || i2 == -1) {
            pair = null;
        } else {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.f24234a = pair;
        this.f24235b = colorSpace;
    }
}
