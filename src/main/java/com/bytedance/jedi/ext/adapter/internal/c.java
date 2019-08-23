package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f21488a;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        f21488a = iArr;
        iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
        f21488a[Lifecycle.State.DESTROYED.ordinal()] = 2;
        f21488a[Lifecycle.State.CREATED.ordinal()] = 3;
        f21488a[Lifecycle.State.STARTED.ordinal()] = 4;
        f21488a[Lifecycle.State.RESUMED.ordinal()] = 5;
    }
}
