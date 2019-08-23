package com.bytedance.android.livesdk.gift.model.a;

import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.ImageModel;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f15095a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15096b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15097c;

    /* renamed from: d  reason: collision with root package name */
    public T f15098d;

    public abstract String i();

    public int j() {
        return -1;
    }

    public abstract String k();

    public int l() {
        return -1711276033;
    }

    public ImageModel m() {
        return null;
    }

    public abstract ImageModel n();

    public abstract long o();

    public ImageModel p() {
        return null;
    }

    public b(int i, @NonNull T t) {
        this.f15095a = i;
        this.f15098d = t;
    }
}
