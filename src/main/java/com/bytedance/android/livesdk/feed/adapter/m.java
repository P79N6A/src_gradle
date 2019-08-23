package com.bytedance.android.livesdk.feed.adapter;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13984a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13985b;

    public m(c cVar) {
        this.f13985b = cVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13984a, false, 8504, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13984a, false, 8504, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13985b.a((BaseFeedRepository.a) obj);
    }
}
