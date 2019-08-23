package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.feed.e.a;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class f implements ViewModelProvider.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14101a;

    /* renamed from: b  reason: collision with root package name */
    private IFeedRepository f14102b;

    /* renamed from: c  reason: collision with root package name */
    private k f14103c;

    /* renamed from: d  reason: collision with root package name */
    private long f14104d;

    /* renamed from: e  reason: collision with root package name */
    private h f14105e;

    /* renamed from: f  reason: collision with root package name */
    private Context f14106f;
    private a g;
    private o h;

    public final f a(long j) {
        this.f14104d = j;
        return this;
    }

    public final f a(h hVar) {
        this.f14105e = hVar;
        return this;
    }

    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f14101a, false, 8426, new Class[]{Class.class}, ViewModel.class)) {
            return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f14101a, false, 8426, new Class[]{Class.class}, ViewModel.class);
        } else if (cls2.isAssignableFrom(BaseFeedDataViewModel.class)) {
            return new BaseFeedDataViewModel(this.f14102b, this.f14105e, this.g);
        } else {
            if (cls2.isAssignableFrom(FragmentFeedViewModel.class)) {
                return new FragmentFeedViewModel(this.f14102b, this.f14105e, this.g);
            }
            if (cls2.isAssignableFrom(TabFeedViewModel.class)) {
                TabFeedViewModel tabFeedViewModel = new TabFeedViewModel(this.f14102b, this.f14105e, this.f14103c, this.g, this.h, this.f14104d);
                return tabFeedViewModel;
            } else if (cls2.isAssignableFrom(DislikeTipViewModel.class)) {
                return new DislikeTipViewModel(this.f14103c, this.f14104d, this.f14106f);
            } else {
                if (cls2.isAssignableFrom(TimeOutRefreshViewModel.class)) {
                    return new TimeOutRefreshViewModel();
                }
                if (cls2.isAssignableFrom(LiveFeedViewModel.class)) {
                    return new LiveFeedViewModel(this.f14102b, this.f14103c.c());
                }
                throw new IllegalArgumentException("unknown model " + cls.getName());
            }
        }
    }

    public f(IFeedRepository iFeedRepository, k kVar, Context context, o oVar, a aVar) {
        this.f14102b = iFeedRepository;
        this.f14103c = kVar;
        this.f14106f = context;
        this.h = oVar;
        this.g = aVar;
    }
}
