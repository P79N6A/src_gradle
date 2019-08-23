package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14343a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14344b;

    f(FeedRepository.a aVar) {
        this.f14344b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14343a, false, 8853, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14343a, false, 8853, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FeedRepository.a aVar = this.f14344b;
        Pair pair = (Pair) obj;
        if (pair.first != null) {
            aVar.f14331d = (String) pair.first;
        }
        if (pair.second != null) {
            aVar.f14332e = (String) pair.second;
        }
    }
}
