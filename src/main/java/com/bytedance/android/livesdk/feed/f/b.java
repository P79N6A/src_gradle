package com.bytedance.android.livesdk.feed.f;

import android.arch.lifecycle.Observer;
import android.arch.paging.PagedList;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14114a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14115b;

    b(a aVar) {
        this.f14115b = aVar;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14114a, false, 8697, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14114a, false, 8697, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f14115b;
        PagedList<FeedItem> pagedList = (PagedList) obj;
        if (pagedList != null) {
            if (aVar.f14108b != null) {
                aVar.f14108b.removeWeakCallback(aVar.f14109c);
            } else {
                z = false;
            }
            aVar.f14108b = pagedList;
            aVar.f14108b.addWeakCallback(null, aVar.f14109c);
            if (z) {
                aVar.a();
                aVar.e();
            }
        }
    }
}
