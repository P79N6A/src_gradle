package com.ss.android.ugc.aweme.feed.h;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class r extends b<com.ss.android.ugc.aweme.follow.presenter.b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45527a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45528b;
    public x g;
    public boolean h;
    public boolean i;
    private boolean j;
    private d k;

    public final boolean a(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45527a, false, 42062, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45527a, false, 42062, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        if (this.g != null) {
            this.g.d(this.h);
        }
        return super.a(objArr);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f45527a, false, 42067, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45527a, false, 42067, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f2978e != null && ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).isDataEmpty()) {
            z = true;
        }
        return z;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f45527a, false, 42073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45527a, false, 42073, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        this.k = null;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f45527a, false, 42063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45527a, false, 42063, new Class[0], Void.TYPE);
            return;
        }
        if (this.f45528b) {
            this.f45528b = false;
            ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).f47767d = false;
        }
        if (PatchProxy.isSupport(new Object[0], this, f45527a, false, 42064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45527a, false, 42064, new Class[0], Void.TYPE);
        } else if (this.i) {
            bg.a(new ae("FOLLOW"));
        } else {
            bg.a(new ae());
        }
    }

    public final void b() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f45527a, false, 42066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45527a, false, 42066, new Class[0], Void.TYPE);
            return;
        }
        e();
        if (this.g != null) {
            x xVar = this.g;
            if (!this.j || this.h) {
                z = true;
            } else {
                z = false;
            }
            xVar.d(z);
        }
        this.j = false;
        this.h = false;
        if (this.f2978e != null) {
            int i2 = ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        if (((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).isDataEmpty()) {
                            if (this.f2979f != null) {
                                ((c) this.f2979f).y_();
                                return;
                            }
                        } else if (this.f2979f != null) {
                            ((c) this.f2979f).a(((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).b(), ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).isHasMore());
                            return;
                        }
                        break;
                    case 2:
                        if (this.f2979f != null) {
                            ((c) this.f2979f).c(((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).b(), true ^ ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).isNewDataEmpty());
                            break;
                        }
                        break;
                }
            } else if (this.f2979f != null) {
                c cVar = (c) this.f2979f;
                List<Aweme> b2 = ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).b();
                if (((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).isHasMore() && !((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).isNewDataEmpty()) {
                    z2 = true;
                }
                cVar.b(b2, z2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.List<java.lang.String>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> d() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f45527a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 42069(0xa455, float:5.8951E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f45527a
            r5 = 0
            r6 = 42069(0xa455, float:5.8951E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.common.a r1 = r12.f2978e
            r2 = 0
            if (r1 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.common.a r1 = r12.f2978e
            com.ss.android.ugc.aweme.follow.presenter.b r1 = (com.ss.android.ugc.aweme.follow.presenter.b) r1
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r1 = r1.g
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f45527a
            r7 = 1
            r8 = 42070(0xa456, float:5.8953E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.util.List> r10 = java.util.List.class
            r9[r0] = r10
            java.lang.Class<java.util.List> r10 = java.util.List.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0068
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r1
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f45527a
            r8 = 1
            r9 = 42070(0xa456, float:5.8953E-41)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r10[r0] = r1
            java.lang.Class<java.util.List> r11 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            goto L_0x009c
        L_0x0068:
            if (r1 == 0) goto L_0x009c
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0071
            goto L_0x009c
        L_0x0071:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x007a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009b
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r2 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r2
            int r3 = r2.getFeedType()
            r4 = 65280(0xff00, float:9.1477E-41)
            if (r3 != r4) goto L_0x007a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAweme()
            java.lang.String r2 = r2.getAid()
            r0.add(r2)
            goto L_0x007a
        L_0x009b:
            return r0
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.h.r.d():java.util.List");
    }

    public final void a(d dVar) {
        this.k = dVar;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f45527a, false, 42074, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f45527a, false, 42074, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.a_(i2);
        }
    }

    public final void a(Exception exc) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f45527a, false, 42065, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f45527a, false, 42065, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        e();
        if (this.g != null) {
            x xVar = this.g;
            if (this.j && !this.h) {
                z = false;
            }
            xVar.d(z);
        }
        this.j = false;
        this.h = false;
        if (this.f2978e != null) {
            int i2 = ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        if (this.f2979f != null) {
                            ((c) this.f2979f).b(exc);
                            break;
                        }
                        break;
                    case 2:
                        if (this.f2979f != null) {
                            ((c) this.f2979f).d(exc);
                            break;
                        }
                        break;
                }
            } else if (this.f2979f != null) {
                ((c) this.f2979f).c(exc);
            }
            if (exc instanceof a) {
                com.ss.android.ugc.aweme.common.r.a("homepage_follow_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("error_type", "follow_feed_error").a("error_code", ((a) exc).getErrorCode()).f34114b);
            } else {
                com.ss.android.ugc.aweme.common.r.a("homepage_follow_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("error_type", "follow_feed_error").a("error_code", 4).f34114b);
            }
        }
    }

    public final boolean a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f45527a, false, 42072, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f45527a, false, 42072, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (obj instanceof Aweme) {
            List<FollowFeed> items = ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).getItems();
            if (!CollectionUtils.isEmpty(items)) {
                int size = items.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (TextUtils.equals(((Aweme) obj).getAid(), aa.m(items.get(i2).getAweme()))) {
                        a(i2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(List list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f45527a, false, 42075, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f45527a, false, 42075, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.a(list, i2);
        }
    }

    public final boolean a(Object obj, int i2) {
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i2)}, this, f45527a, false, 42071, new Class[]{Object.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i2)}, this, f45527a, false, 42071, new Class[]{Object.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        List items = ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).getItems();
        if (CollectionUtils.isEmpty(items)) {
            items = new ArrayList();
        }
        if (i2 < 0 || i2 > items.size()) {
            return false;
        }
        items.add(i2, (FollowFeed) obj);
        ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).setItems(items);
        if (this.f2979f != null) {
            if (((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).isDataEmpty()) {
                ((c) this.f2979f).y_();
            } else {
                a((List) ((com.ss.android.ugc.aweme.follow.presenter.b) this.f2978e).b(), i2);
            }
        }
        return true;
    }
}
