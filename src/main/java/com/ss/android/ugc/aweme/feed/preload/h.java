package com.ss.android.ugc.aweme.feed.preload;

import a.i;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.ss.android.ugc.aweme.feed.cache.a;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class h extends a<FeedItemList> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f45779c;

    /* renamed from: d  reason: collision with root package name */
    public FeedItemList f45780d;

    /* renamed from: e  reason: collision with root package name */
    private int f45781e = -1;

    /* renamed from: f  reason: collision with root package name */
    private i f45782f;

    public final void b() {
        this.f45782f = null;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45779c, false, 42002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45779c, false, 42002, new Class[0], Void.TYPE);
        } else if (this.f45780d == null) {
            this.f45782f = i.a((Callable<TResult>) new Callable<FeedItemList>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45783a;

                public final /* synthetic */ Object call() throws Exception {
                    boolean z;
                    int i;
                    if (PatchProxy.isSupport(new Object[0], this, f45783a, false, 42006, new Class[0], FeedItemList.class)) {
                        return (FeedItemList) PatchProxy.accessDispatch(new Object[0], this, f45783a, false, 42006, new Class[0], FeedItemList.class);
                    }
                    h hVar = h.this;
                    if (PatchProxy.isSupport(new Object[0], hVar, h.f45779c, false, 41991, new Class[0], FeedItemList.class)) {
                        return (FeedItemList) PatchProxy.accessDispatch(new Object[0], hVar, h.f45779c, false, 41991, new Class[0], FeedItemList.class);
                    } else if (!NetworkUtils.isNetworkAvailable(k.a())) {
                        return null;
                    } else {
                        if (PatchProxy.isSupport(new Object[0], null, z.f47066a, true, 40124, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, z.f47066a, true, 40124, new Class[0], Boolean.TYPE)).booleanValue();
                        } else if (e.d().a("cold_start_times", 0) <= 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        FeedItemList fetchFeedList = ((IFeedApi) ServiceManager.get().getService(IFeedApi.class)).fetchFeedList(0, 0, 0, 6, null, null, i, 0, "", null, null, 0, a.f45153b);
                        if (a.c() && fetchFeedList != null && a.a()) {
                            fetchFeedList.appendCache = true;
                        }
                        c.a().a(fetchFeedList);
                        hVar.f45780d = fetchFeedList;
                        return fetchFeedList;
                    }
                }
            }, (Executor) com.ss.android.ugc.aweme.thread.h.c());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|(2:14|15)|16|17|(1:19)|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[Catch:{ Exception -> 0x004e }] */
    @android.support.annotation.Nullable
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.ugc.aweme.feed.model.FeedItemList a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f45779c
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r7 = com.ss.android.ugc.aweme.feed.model.FeedItemList.class
            r4 = 0
            r5 = 41987(0xa403, float:5.8836E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f45779c
            r5 = 0
            r6 = 41987(0xa403, float:5.8836E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r8 = com.ss.android.ugc.aweme.feed.model.FeedItemList.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            return r0
        L_0x0028:
            a.i r0 = r9.f45782f
            if (r0 != 0) goto L_0x002e
            r0 = 0
            return r0
        L_0x002e:
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r9.f45780d
            if (r0 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r9.f45780d
            return r0
        L_0x0035:
            a.i r0 = r9.f45782f
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0042
            a.i r0 = r9.f45782f     // Catch:{ InterruptedException -> 0x0042 }
            r0.g()     // Catch:{ InterruptedException -> 0x0042 }
        L_0x0042:
            a.i r0 = r9.f45782f     // Catch:{ Exception -> 0x004e }
            boolean r0 = r0.d()     // Catch:{ Exception -> 0x004e }
            if (r0 != 0) goto L_0x004e
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r9.f45780d     // Catch:{ Exception -> 0x004e }
            r9.f45780d = r0     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            r9.b()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r9.f45780d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.preload.h.a():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public final /* bridge */ /* synthetic */ void a(@Nullable Object obj) throws Exception {
        this.f45780d = (FeedItemList) obj;
    }
}
