package com.ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.e.b;
import com.ss.android.ugc.aweme.base.mvvm.e;
import com.ss.android.ugc.aweme.base.mvvm.impl.a;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.widget.DividerView;
import com.ss.android.ugc.aweme.base.widget.a.a;
import com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.widget.StoryFeedLoadMoreProgressBar;
import com.ss.android.ugc.aweme.story.model.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class c extends a<StoryFeedPanel> implements b<d> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54949c = null;
    private static final String j = "c";

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f54950d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.story.model.c f54951e = new com.ss.android.ugc.aweme.story.model.c();

    /* renamed from: f  reason: collision with root package name */
    public d.a f54952f;
    public String g;
    public a h;
    public String i = "toplist_homepage_hot";
    private PageLoadingListMultiTypeAdapter k;
    private com.ss.android.ugc.aweme.base.widget.a.a l;
    private Class m;
    private boolean n;

    public c(Class cls) {
        boolean z;
        double d2;
        this.f54951e.a(this);
        this.m = cls;
        if (cls == StoryFeedItemViewBig.class) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        if (this.n) {
            d2 = 16.0d;
        } else {
            d2 = 8.0d;
        }
        this.l = new com.ss.android.ugc.aweme.base.widget.a.a(u.a(d2), a.C0451a.HORIZONTAL);
    }

    public final RecyclerView.Adapter a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f54949c, false, 58255, new Class[]{Context.class}, RecyclerView.Adapter.class)) {
            return (RecyclerView.Adapter) PatchProxy.accessDispatch(new Object[]{context}, this, f54949c, false, 58255, new Class[]{Context.class}, RecyclerView.Adapter.class);
        }
        if (this.k == null) {
            HashMap hashMap = new HashMap();
            if (this.m != null) {
                hashMap.put(b.class, this.m);
            } else {
                hashMap.put(b.class, StoryFeedItemView.class);
            }
            hashMap.put(com.ss.android.ugc.aweme.base.widget.commonitem.a.b.class, StoryFeedLoadMoreProgressBar.class);
            hashMap.put(com.ss.android.ugc.aweme.base.widget.a.a.class, DividerView.class);
            this.k = new StoryFeedPanelViewModel$1(this, context, this.f54950d, hashMap);
            if (this.f54952f != null && !this.f54952f.f73256c) {
                this.k.d();
            }
        }
        return this.k;
    }

    public final e a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54949c, false, 58252, new Class[]{Integer.TYPE}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54949c, false, 58252, new Class[]{Integer.TYPE}, e.class);
        } else if (!CollectionUtils.isEmpty(this.f54950d) && i2 < this.f54950d.size()) {
            return this.f54950d.get(i2);
        } else {
            return null;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54949c, false, 58250, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54949c, false, 58250, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f54951e.a(z, this.n);
    }

    /* access modifiers changed from: package-private */
    public int b(List<Aweme> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, this, f54949c, false, 58262, new Class[]{List.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list, str2}, this, f54949c, false, 58262, new Class[]{List.class, String.class}, Integer.TYPE)).intValue();
        } else if (list == null) {
            return 0;
        } else {
            for (Aweme next : list) {
                if (next != null && next.getAuthor() != null && com.ss.android.ugc.aweme.base.utils.a.a(next.getAuthor().getUid(), str2)) {
                    return next.getEnterpriseType();
                }
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public String a(List<Aweme> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, this, f54949c, false, 58261, new Class[]{List.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list, str2}, this, f54949c, false, 58261, new Class[]{List.class, String.class}, String.class);
        }
        for (Aweme next : list) {
            if (com.ss.android.ugc.aweme.base.utils.a.a(next.getAuthor().getUid(), str2)) {
                return next.getAid();
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.ss.android.ugc.aweme.main.story.feed.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.base.e.a r13, java.lang.Object r14) {
        /*
            r12 = this;
            r8 = r14
            com.ss.android.ugc.aweme.story.model.d r8 = (com.ss.android.ugc.aweme.story.model.d) r8
            r9 = 2
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r13
            r11 = 1
            r1[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r3 = f54949c
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.base.e.a> r2 = com.ss.android.ugc.aweme.base.e.a.class
            r6[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.story.model.d> r2 = com.ss.android.ugc.aweme.story.model.d.class
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 58254(0xe38e, float:8.1631E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0042
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r13
            r1[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r3 = f54949c
            r4 = 0
            r5 = 58254(0xe38e, float:8.1631E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.base.e.a> r0 = com.ss.android.ugc.aweme.base.e.a.class
            r6[r10] = r0
            java.lang.Class<com.ss.android.ugc.aweme.story.model.d> r0 = com.ss.android.ugc.aweme.story.model.d.class
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0042:
            com.ss.android.ugc.aweme.story.model.c r1 = r12.f54951e
            if (r1 != r13) goto L_0x0207
            int r0 = r8.f73252b
            if (r0 == r11) goto L_0x0140
            r1 = 9999(0x270f, float:1.4012E-41)
            if (r0 == r1) goto L_0x0136
            switch(r0) {
                case 4: goto L_0x0074;
                case 5: goto L_0x0066;
                case 6: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0207
        L_0x0053:
            java.lang.Object r0 = r8.f73253c
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.ss.android.ugc.aweme.base.mvvm.c r1 = r12.a()
            com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel r1 = (com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel) r1
            r1.setPanelVisibility(r0, r10)
            goto L_0x0207
        L_0x0066:
            java.lang.Object r0 = r8.f73253c
            com.ss.android.ugc.aweme.main.story.live.d r0 = (com.ss.android.ugc.aweme.main.story.live.d) r0
            com.ss.android.ugc.aweme.base.mvvm.c r1 = r12.a()
            com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel r1 = (com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel) r1
            r1.setLivePageItemView(r0)
            return
        L_0x0074:
            java.lang.Object r0 = r8.f73253c
            java.lang.String r0 = (java.lang.String) r0
            r8 = 0
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            boolean r1 = com.bytedance.common.utility.StringUtils.equal(r0, r1)
            if (r1 != 0) goto L_0x00f1
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f54949c
            r4 = 0
            r5 = 58257(0xe391, float:8.1635E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            r9 = -1
            if (r1 == 0) goto L_0x00bf
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f54949c
            r4 = 0
            r5 = 58257(0xe391, float:8.1635E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x00e6
        L_0x00bf:
            r1 = 0
        L_0x00c0:
            java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r2 = r12.f54950d
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x00e5
            java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r2 = r12.f54950d
            java.lang.Object r2 = r2.get(r1)
            com.ss.android.ugc.aweme.base.mvvm.e r2 = (com.ss.android.ugc.aweme.base.mvvm.e) r2
            boolean r3 = r2 instanceof com.ss.android.ugc.aweme.main.story.feed.b
            if (r3 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.main.story.feed.b r2 = (com.ss.android.ugc.aweme.main.story.feed.b) r2
            java.lang.String r2 = r2.f()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e2
            r0 = r1
            goto L_0x00e6
        L_0x00e2:
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00e5:
            r0 = -1
        L_0x00e6:
            if (r0 == r9) goto L_0x00f1
            java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r1 = r12.f54950d
            java.lang.Object r0 = r1.get(r0)
            r8 = r0
            com.ss.android.ugc.aweme.main.story.feed.b r8 = (com.ss.android.ugc.aweme.main.story.feed.b) r8
        L_0x00f1:
            if (r8 == 0) goto L_0x0207
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.main.story.feed.b.f54932c
            r3 = 0
            r4 = 58210(0xe362, float:8.157E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r8
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0117
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.main.story.feed.b.f54932c
            r3 = 0
            r4 = 58210(0xe362, float:8.157E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0132
        L_0x0117:
            com.ss.android.ugc.aweme.main.story.a.a r0 = r8.k     // Catch:{ Exception -> 0x012e }
            com.ss.android.ugc.aweme.story.model.a r0 = r0.a()     // Catch:{ Exception -> 0x012e }
            com.ss.android.ugc.aweme.story.model.Story r0 = r0.f73233b     // Catch:{ Exception -> 0x012e }
            boolean r0 = r0.isFollowing()     // Catch:{ Exception -> 0x012e }
            if (r0 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.main.story.feed.b$a r0 = com.ss.android.ugc.aweme.main.story.feed.b.a.FOLLOWING_READ     // Catch:{ Exception -> 0x012e }
            goto L_0x012a
        L_0x0128:
            com.ss.android.ugc.aweme.main.story.feed.b$a r0 = com.ss.android.ugc.aweme.main.story.feed.b.a.READ     // Catch:{ Exception -> 0x012e }
        L_0x012a:
            r8.a((com.ss.android.ugc.aweme.main.story.feed.b.a) r0)     // Catch:{ Exception -> 0x012e }
            goto L_0x0132
        L_0x012e:
            r0 = move-exception
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r0)
        L_0x0132:
            r8.b()
            return
        L_0x0136:
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter r0 = r12.k
            if (r0 == 0) goto L_0x0207
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter r0 = r12.k
            r0.c()
            return
        L_0x0140:
            java.lang.Object r0 = r8.f73253c
            com.ss.android.ugc.aweme.story.model.d$a r0 = (com.ss.android.ugc.aweme.story.model.d.a) r0
            r12.f54952f = r0
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter r0 = r12.k
            if (r0 == 0) goto L_0x0182
            com.ss.android.ugc.aweme.story.model.d$a r0 = r12.f54952f
            boolean r0 = r0.f73256c
            if (r0 == 0) goto L_0x017d
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter r0 = r12.k
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter.f35184b
            r4 = 0
            r5 = 25589(0x63f5, float:3.5858E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0174
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter.f35184b
            r4 = 0
            r5 = 25589(0x63f5, float:3.5858E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0182
        L_0x0174:
            com.ss.android.ugc.aweme.base.widget.recyclerview.a.a r0 = r0.f35185c
            boolean r1 = r0.f35197d
            if (r1 != 0) goto L_0x0182
            r0.f35197d = r11
            goto L_0x0182
        L_0x017d:
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter r0 = r12.k
            r0.d()
        L_0x0182:
            com.ss.android.ugc.aweme.story.model.d$a r0 = r12.f54952f
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f54949c
            r4 = 0
            r5 = 58253(0xe38d, float:8.163E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.model.d$a> r2 = com.ss.android.ugc.aweme.story.model.d.a.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x01b4
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f54949c
            r4 = 0
            r5 = 58253(0xe38d, float:8.163E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.model.d$a> r0 = com.ss.android.ugc.aweme.story.model.d.a.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0207
        L_0x01b4:
            java.lang.String r1 = r0.f73257d
            r12.g = r1
            boolean r1 = r0.f73254a
            if (r1 != 0) goto L_0x01c9
            java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r1 = r12.f54950d
            r1.clear()
            java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r1 = r12.f54950d
            com.ss.android.ugc.aweme.base.widget.a.a r2 = r12.l
            r1.add(r2)
            goto L_0x01d2
        L_0x01c9:
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter r1 = r12.k
            if (r1 == 0) goto L_0x01d2
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter r1 = r12.k
            r1.c()
        L_0x01d2:
            int r1 = r0.f73255b
        L_0x01d4:
            com.ss.android.ugc.aweme.story.model.c r2 = r12.f54951e
            int r2 = r2.d()
            if (r1 >= r2) goto L_0x01f8
            java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r2 = r12.f54950d
            com.ss.android.ugc.aweme.main.story.feed.b r3 = new com.ss.android.ugc.aweme.main.story.feed.b
            com.ss.android.ugc.aweme.main.story.a.a r4 = new com.ss.android.ugc.aweme.main.story.a.a
            com.ss.android.ugc.aweme.story.model.c r5 = r12.f54951e
            java.lang.String r5 = r5.a((int) r1)
            com.ss.android.ugc.aweme.story.model.c r6 = r12.f54951e
            r4.<init>(r5, r6)
            java.lang.String r5 = r0.f73257d
            r3.<init>(r4, r12, r5)
            r2.add(r3)
            int r1 = r1 + 1
            goto L_0x01d4
        L_0x01f8:
            r12.b()
            com.ss.android.ugc.aweme.main.story.feed.a r1 = r12.h
            if (r1 == 0) goto L_0x0206
            com.ss.android.ugc.aweme.main.story.feed.a r1 = r12.h
            java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r2 = r12.f54950d
            r1.a(r2, r0)
        L_0x0206:
            return
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.story.feed.c.a(com.ss.android.ugc.aweme.base.e.a, java.lang.Object):void");
    }
}
