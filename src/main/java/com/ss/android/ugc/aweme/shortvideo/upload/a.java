package com.ss.android.ugc.aweme.shortvideo.upload;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;

public final class a implements LifecycleOwner {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70946a;

    /* renamed from: b  reason: collision with root package name */
    public h f70947b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f70948c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public CancellationArraySignal f70949d;

    /* renamed from: e  reason: collision with root package name */
    public int f70950e = -1;

    /* renamed from: f  reason: collision with root package name */
    private LifecycleRegistry f70951f = new LifecycleRegistry(this);

    @NonNull
    public final Lifecycle getLifecycle() {
        return this.f70951f;
    }

    public a(h hVar, @NonNull CancellationArraySignal cancellationArraySignal, int i) {
        this.f70951f.markState(Lifecycle.State.STARTED);
        this.f70947b = hVar;
        this.f70949d = cancellationArraySignal;
        this.f70950e = 0;
    }
}
