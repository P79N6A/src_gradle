package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17754a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveBannerViewModel f17755b;

    public f(StartLiveBannerViewModel startLiveBannerViewModel) {
        this.f17755b = startLiveBannerViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17754a, false, 13877, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17754a, false, 13877, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17755b.f17743b.postValue(((d) obj).f7871b);
    }
}
