package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f22915a;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        f22915a = iArr;
        iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
        f22915a[Lifecycle.State.DESTROYED.ordinal()] = 2;
        f22915a[Lifecycle.State.CREATED.ordinal()] = 3;
        f22915a[Lifecycle.State.STARTED.ordinal()] = 4;
        f22915a[Lifecycle.State.RESUMED.ordinal()] = 5;
    }
}
