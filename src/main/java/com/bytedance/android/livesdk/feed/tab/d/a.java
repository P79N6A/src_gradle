package com.bytedance.android.livesdk.feed.tab.d;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.feed.viewmodel.FeedTabViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a implements ViewModelProvider.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14439a;

    /* renamed from: b  reason: collision with root package name */
    private k f14440b;

    /* renamed from: c  reason: collision with root package name */
    private m<g> f14441c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.android.livesdk.feed.e.a f14442d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.livesdk.feed.tab.a f14443e;

    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f14439a, false, 8950, new Class[]{Class.class}, ViewModel.class)) {
            return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls}, this, f14439a, false, 8950, new Class[]{Class.class}, ViewModel.class);
        } else if (cls.isAssignableFrom(FeedTabViewModel.class)) {
            return new FeedTabViewModel(this.f14440b, this.f14441c, this.f14442d, this.f14443e);
        } else {
            throw new IllegalArgumentException("unknown model " + cls.getName());
        }
    }

    public a(k kVar, m<g> mVar, com.bytedance.android.livesdk.feed.e.a aVar, com.bytedance.android.livesdk.feed.tab.a aVar2) {
        this.f14440b = kVar;
        this.f14441c = mVar;
        this.f14442d = aVar;
        this.f14443e = aVar2;
    }
}
