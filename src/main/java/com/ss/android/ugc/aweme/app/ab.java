package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2618a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f2619b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.antiaddic.a.a f2620c;

    /* renamed from: d  reason: collision with root package name */
    private an<Long> f2621d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ab f33676a = new ab((byte) 0);
    }

    public static ab a() {
        return a.f33676a;
    }

    private ab() {
        this.f2620c = new com.ss.android.ugc.aweme.antiaddic.a.a(0) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33674a;

            public final an<Long> a() {
                if (!PatchProxy.isSupport(new Object[0], this, f33674a, false, 22518, new Class[0], an.class)) {
                    return SharePrefCache.inst().getLastFeedTime();
                }
                return (an) PatchProxy.accessDispatch(new Object[0], this, f33674a, false, 22518, new Class[0], an.class);
            }
        };
        this.f2621d = SharePrefCache.inst().getLastFeedCount();
        this.f2619b = ((Long) this.f2621d.c()).longValue();
        bg.c(this);
    }

    /* synthetic */ ab(byte b2) {
        this();
    }

    private void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f2618a, false, 22515, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f2618a, false, 22515, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f2619b = j;
        this.f2621d.a(Long.valueOf(this.f2619b));
    }

    public final void a(FeedItemList feedItemList) {
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, f2618a, false, 22516, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, f2618a, false, 22516, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f2620c.b(currentTimeMillis)) {
                a(-1);
            }
            a(this.f2619b + 1);
            this.f2620c.a(currentTimeMillis);
            long j = this.f2619b;
            if (!(feedItemList == null || feedItemList.items == null)) {
                for (Aweme feedCount : feedItemList.items) {
                    feedCount.setFeedCount(j);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Subscribe(b = true)
    public void onQueryUserFinishedEvent(com.ss.android.ugc.aweme.base.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2618a, false, 22517, new Class[]{com.ss.android.ugc.aweme.base.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2618a, false, 22517, new Class[]{com.ss.android.ugc.aweme.base.a.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
        if (PatchProxy.isSupport(new Object[]{0L}, a2, com.ss.android.ugc.aweme.feed.a.f44607a, false, 39942, new Class[]{Long.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.feed.a aVar2 = a2;
            PatchProxy.accessDispatch(new Object[]{0L}, aVar2, com.ss.android.ugc.aweme.feed.a.f44607a, false, 39942, new Class[]{Long.TYPE}, Void.TYPE);
        } else {
            for (Aweme feedCount : a2.f44609b.a()) {
                feedCount.setFeedCount(0);
            }
        }
        a(-1);
    }
}
