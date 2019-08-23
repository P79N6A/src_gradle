package com.ss.android.ugc.aweme.sp;

import android.annotation.SuppressLint;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.util.Preconditions;

public final class b {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4054a;

    @SuppressLint({"RestrictedApi"})
    public b(@IntRange(from = 1, to = 31) int i) {
        try {
            i = Preconditions.checkArgumentInRange(16, 1, 31, "numBuckets");
        } catch (Exception unused) {
        }
        this.f4054a = new int[i];
    }
}
