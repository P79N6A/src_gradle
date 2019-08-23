package com.ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.service.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "source", "Landroid/arch/lifecycle/LifecycleOwner;", "kotlin.jvm.PlatformType", "event", "Landroid/arch/lifecycle/Lifecycle$Event;", "onStateChanged"}, k = 3, mv = {1, 1, 15})
final class DetailFeedLiveViewHolder$1 implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44684a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f44685b;

    DetailFeedLiveViewHolder$1(b bVar) {
        this.f44685b = bVar;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event event2 = event;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2}, this, f44684a, false, 40349, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2}, this, f44684a, false, 40349, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        if (event2 == Lifecycle.Event.ON_DESTROY) {
            c d2 = a.d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "Live.getService()");
            d2.f().b(this.f44685b.f3136b.hashCode());
        }
    }
}
