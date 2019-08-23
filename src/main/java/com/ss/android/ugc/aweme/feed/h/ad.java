package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.utils.bg;

public final class ad extends m {
    public static ChangeQuickRedirect h;
    public a i;

    public interface a {
        void a(NearbyCities.CityBean cityBean);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 42089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 42089, new Class[0], Void.TYPE);
        } else if (MainPageExperimentHelper.i()) {
            super.c();
        } else {
            bg.a(new ae("NEARBY"));
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 42088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 42088, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (!(this.f2978e == null || this.f2979f == null || ((g) this.f2978e).mListQueryType != 1 || this.i == null || ((g) this.f2978e).getData() == null || ((FeedItemList) ((g) this.f2978e).getData()).currentCity == null)) {
            this.i.a(((FeedItemList) ((g) this.f2978e).getData()).currentCity);
        }
    }
}
