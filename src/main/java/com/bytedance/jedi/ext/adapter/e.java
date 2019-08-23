package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f21469a;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        f21469a = iArr;
        iArr[Lifecycle.State.CREATED.ordinal()] = 1;
        f21469a[Lifecycle.State.STARTED.ordinal()] = 2;
        f21469a[Lifecycle.State.RESUMED.ordinal()] = 3;
    }
}
