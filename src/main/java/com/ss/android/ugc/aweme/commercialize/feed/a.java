package com.ss.android.ugc.aweme.commercialize.feed;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.e.c;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38772a = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f38773d = "a";

    /* renamed from: f  reason: collision with root package name */
    private static volatile a f38774f;
    private static c<ShowAdDataBase> g = new c<ShowAdDataBase>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38778a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f38778a, false, 30560, new Class[0], ShowAdDataBase.class)) {
                return (ShowAdDataBase) Room.databaseBuilder(i.a().getContext(), ShowAdDataBase.class, "showAd.db").allowMainThreadQueries().build();
            }
            return (ShowAdDataBase) PatchProxy.accessDispatch(new Object[0], this, f38778a, false, 30560, new Class[0], ShowAdDataBase.class);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    List<String> f38775b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.antiaddic.a.a f38776c = new com.ss.android.ugc.aweme.antiaddic.a.a(0) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38779a;

        public final an<Long> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f38779a, false, 30561, new Class[0], an.class)) {
                return SharePrefCache.inst().getLastFilterTime();
            }
            return (an) PatchProxy.accessDispatch(new Object[0], this, f38779a, false, 30561, new Class[0], an.class);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private FeedItemList f38777e;

    private a() {
    }

    static final /* synthetic */ Object b() throws Exception {
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) g.b();
            if (showAdDataBase != null) {
                showAdDataBase.a().a();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f38772a, true, 30551, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f38772a, true, 30551, new Class[0], a.class);
        }
        if (f38774f == null) {
            synchronized (AbTestManager.class) {
                if (f38774f == null) {
                    f38774f = new a();
                }
            }
        }
        return f38774f;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object a(java.lang.String r2) throws java.lang.Exception {
        /*
            com.ss.android.e.c<com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase> r0 = g     // Catch:{  }
            java.lang.Object r0 = r0.b()     // Catch:{  }
            com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase r0 = (com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase) r0     // Catch:{  }
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.commercialize.dao.b r0 = r0.a()     // Catch:{  }
            com.ss.android.ugc.aweme.commercialize.dao.a r1 = new com.ss.android.ugc.aweme.commercialize.dao.a     // Catch:{ Exception -> 0x0016 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0016 }
            r0.a((com.ss.android.ugc.aweme.commercialize.dao.a) r1)     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.a.a(java.lang.String):java.lang.Object");
    }

    private boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f38772a, false, 30554, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f38772a, false, 30554, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) g.b();
            if (showAdDataBase != null) {
                List<com.ss.android.ugc.aweme.commercialize.dao.a> a2 = showAdDataBase.a().a(str2);
                if (CollectionUtils.isEmpty(a2)) {
                    return false;
                }
                return a2.contains(new com.ss.android.ugc.aweme.commercialize.dao.a(str2));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void a(FeedItemList feedItemList) {
        boolean z;
        int i;
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, f38772a, false, 30556, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, f38772a, false, 30556, new Class[]{FeedItemList.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a() && feedItemList != null && !CollectionUtils.isEmpty(feedItemList.items)) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f38776c.b(currentTimeMillis)) {
                    this.f38775b.clear();
                    if (PatchProxy.isSupport(new Object[0], this, f38772a, false, 30555, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f38772a, false, 30555, new Class[0], Void.TYPE);
                    } else {
                        a.i.a(c.f38826b, (Executor) a.i.f1051a);
                    }
                }
                this.f38776c.a(currentTimeMillis);
                Iterator<Aweme> it2 = feedItemList.items.iterator();
                Context context = GlobalContext.getContext();
                while (it2.hasNext()) {
                    Aweme next = it2.next();
                    if (next != null && next.isAd()) {
                        if (PatchProxy.isSupport(new Object[]{next}, this, f38772a, false, 30557, new Class[]{Aweme.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{next}, this, f38772a, false, 30557, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            if (com.ss.android.g.a.a()) {
                                if (next.isAd()) {
                                    String aid = next.getAid();
                                    if (!TextUtils.isEmpty(aid)) {
                                        if (!next.getAwemeRawAd().isDiableAdShowFilter()) {
                                            if (this.f38775b.contains(aid)) {
                                                z = true;
                                            } else {
                                                z = b(aid);
                                            }
                                        }
                                    }
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            it2.remove();
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.Z(next)) {
                                g.a(context, next, com.ss.android.ugc.aweme.commercialize.splash.a.a().a("8", (String) null));
                            }
                            g.a(context, next, 1);
                        } else if (this.f38777e != null && !next.getAwemeRawAd().isDiableAdShowFilter()) {
                            String aid2 = next.getAid();
                            for (Aweme next2 : this.f38777e.items) {
                                if (next2 != null && TextUtils.equals(aid2, next2.getAid())) {
                                    it2.remove();
                                    if (com.ss.android.ugc.aweme.commercialize.utils.c.Z(next)) {
                                        g.a(context, next, com.ss.android.ugc.aweme.commercialize.splash.a.a().a("8", (String) null));
                                    }
                                    if (next2.isAd()) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    g.a(context, next, i);
                                }
                            }
                        }
                    }
                }
                this.f38777e = feedItemList;
            } catch (Exception e2) {
                Crashlytics.logException(e2);
            }
        }
    }
}
