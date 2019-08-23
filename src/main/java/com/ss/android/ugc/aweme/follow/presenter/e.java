package com.ss.android.ugc.aweme.follow.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import java.util.Map;

public final class e extends b<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47789a;

    /* renamed from: b  reason: collision with root package name */
    public c f47790b;
    public boolean g;
    public x h;
    public boolean i;
    private boolean j;

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f47789a, false, 44678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47789a, false, 44678, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            this.g = false;
            ((b) this.f2978e).f47767d = false;
            bg.a(new ae());
        }
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], this, f47789a, false, 44682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47789a, false, 44682, new Class[0], Void.TYPE);
            return;
        }
        c();
        if (this.h != null) {
            x xVar = this.h;
            if (!this.j || this.i) {
                z2 = true;
            } else {
                z2 = false;
            }
            xVar.d(z2);
        }
        this.j = false;
        this.i = false;
        if (this.f2978e != null) {
            int i2 = ((b) this.f2978e).mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        if (((b) this.f2978e).isDataEmpty()) {
                            if (this.f2979f != null) {
                                ((c) this.f2979f).y_();
                            }
                            if (this.f47790b != null) {
                                this.f47790b.y_();
                                return;
                            }
                        } else {
                            if (this.f2979f != null) {
                                ((c) this.f2979f).a(((b) this.f2978e).getItems(), ((b) this.f2978e).isHasMore());
                            }
                            if (this.f47790b != null) {
                                this.f47790b.a(((b) this.f2978e).b(), ((b) this.f2978e).isHasMore());
                                return;
                            }
                        }
                        break;
                    case 2:
                        if (this.f2979f != null) {
                            ((c) this.f2979f).c(((b) this.f2978e).getItems(), !((b) this.f2978e).isNewDataEmpty());
                        }
                        if (this.f47790b != null) {
                            this.f47790b.c(((b) this.f2978e).b(), true ^ ((b) this.f2978e).isNewDataEmpty());
                            break;
                        }
                        break;
                }
            } else {
                if (this.f2979f != null) {
                    c cVar = (c) this.f2979f;
                    List<FollowFeed> items = ((b) this.f2978e).getItems();
                    if (!((b) this.f2978e).isHasMore() || ((b) this.f2978e).isNewDataEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    cVar.b(items, z);
                }
                if (this.f47790b != null) {
                    c cVar2 = this.f47790b;
                    List<Aweme> b2 = ((b) this.f2978e).b();
                    if (((b) this.f2978e).isHasMore() && !((b) this.f2978e).isNewDataEmpty()) {
                        z3 = true;
                    }
                    cVar2.b(b2, z3);
                }
            }
        }
    }

    public final boolean a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47789a, false, 44679, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f47789a, false, 44679, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (!(obj instanceof Aweme)) {
            return super.a(obj);
        } else {
            if (this.f2978e == null || !((b) this.f2978e).a((Aweme) obj)) {
                return false;
            }
            return true;
        }
    }

    public final void a(Exception exc) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f47789a, false, 44681, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f47789a, false, 44681, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        c();
        if (this.h != null) {
            x xVar = this.h;
            if (this.j && !this.i) {
                z = false;
            }
            xVar.d(z);
        }
        this.j = false;
        this.i = false;
        if (this.f2978e != null) {
            int i2 = ((b) this.f2978e).mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        if (this.f2979f != null) {
                            ((c) this.f2979f).b(exc);
                        }
                        if (this.f47790b != null) {
                            this.f47790b.b(exc);
                            break;
                        }
                        break;
                    case 2:
                        if (this.f2979f != null) {
                            ((c) this.f2979f).d(exc);
                        }
                        if (this.f47790b != null) {
                            this.f47790b.d(exc);
                            break;
                        }
                        break;
                }
            } else {
                if (this.f2979f != null) {
                    ((c) this.f2979f).c(exc);
                }
                if (this.f47790b != null) {
                    this.f47790b.c(exc);
                }
            }
            if (exc instanceof a) {
                r.a("homepage_follow_monitor", (Map) d.a().a("error_type", "follow_feed_error").a("error_code", ((a) exc).getErrorCode()).f34114b);
            } else {
                r.a("homepage_follow_monitor", (Map) d.a().a("error_type", "follow_feed_error").a("error_code", 4).f34114b);
            }
        }
    }

    public final boolean a(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47789a, false, 44677, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f47789a, false, 44677, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        if (this.h != null) {
            this.h.d(this.i);
        }
        this.j = super.a(objArr);
        return this.j;
    }
}
