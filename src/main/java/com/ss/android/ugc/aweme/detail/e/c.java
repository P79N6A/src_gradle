package com.ss.android.ugc.aweme.detail.e;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.a;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;

public abstract class c<T extends a, DATA> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41185a;

    /* renamed from: b  reason: collision with root package name */
    public x f41186b;
    public boolean g;
    private boolean h;
    private d i;

    public abstract String b(DATA data);

    public abstract List<DATA> c();

    public abstract List<Aweme> d();

    c() {
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f41185a, false, 35005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41185a, false, 35005, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        this.i = null;
    }

    public final void b() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f41185a, false, 35000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41185a, false, 35000, new Class[0], Void.TYPE);
            return;
        }
        if (this.f41186b != null) {
            x xVar = this.f41186b;
            if (!this.h || this.g) {
                z = true;
            } else {
                z = false;
            }
            xVar.d(z);
        }
        this.h = false;
        this.g = false;
        if (this.f2978e != null) {
            int i2 = ((a) this.f2978e).mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        if (((a) this.f2978e).isDataEmpty()) {
                            if (this.f2979f != null) {
                                ((com.ss.android.ugc.aweme.common.f.c) this.f2979f).y_();
                                return;
                            }
                        } else if (this.f2979f != null) {
                            ((com.ss.android.ugc.aweme.common.f.c) this.f2979f).a(d(), ((a) this.f2978e).isHasMore());
                            return;
                        }
                        break;
                    case 2:
                        if (this.f2979f != null) {
                            ((com.ss.android.ugc.aweme.common.f.c) this.f2979f).c(d(), true ^ ((a) this.f2978e).isNewDataEmpty());
                            break;
                        }
                        break;
                }
            } else if (this.f2979f != null) {
                com.ss.android.ugc.aweme.common.f.c cVar = (com.ss.android.ugc.aweme.common.f.c) this.f2979f;
                List<Aweme> d2 = d();
                if (((a) this.f2978e).isHasMore() && !((a) this.f2978e).isNewDataEmpty()) {
                    z2 = true;
                }
                cVar.b(d2, z2);
            }
        }
    }

    public final void a(d dVar) {
        this.i = dVar;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f41185a, false, 35006, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f41185a, false, 35006, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a_(i2);
        }
    }

    public final void a(Exception exc) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f41185a, false, 34999, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f41185a, false, 34999, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f41186b != null) {
            x xVar = this.f41186b;
            if (this.h && !this.g) {
                z = false;
            }
            xVar.d(z);
        }
        this.h = false;
        this.g = false;
        super.a(exc);
    }

    public final boolean a(Object obj) {
        int i2;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f41185a, false, 35003, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f41185a, false, 35003, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (obj2 instanceof Aweme) {
            List<Aweme> d2 = d();
            if (!CollectionUtils.isEmpty(d2)) {
                int size = d2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Aweme aweme = (Aweme) obj2;
                    if (TextUtils.equals(aweme.getAid(), aa.m(d2.get(i3)))) {
                        String aid = aweme.getAid();
                        if (PatchProxy.isSupport(new Object[]{aid}, this, f41185a, false, 35004, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aid}, this, f41185a, false, 35004, new Class[]{String.class}, Void.TYPE);
                        } else if (this.f2978e != null) {
                            List c2 = c();
                            if (c2 == null) {
                                i2 = 0;
                            } else {
                                i2 = c2.size();
                            }
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i2) {
                                    break;
                                }
                                Object obj3 = c2.get(i4);
                                String b2 = b(obj3);
                                if (TextUtils.isEmpty(b2) || !TextUtils.equals(aid, b2)) {
                                    i4++;
                                } else {
                                    com.ss.android.ugc.aweme.newfollow.f.b bVar = ((a) this.f2978e).h;
                                    if (bVar != null) {
                                        if (PatchProxy.isSupport(new Object[]{b2}, bVar, com.ss.android.ugc.aweme.newfollow.f.b.f3643c, false, 61224, new Class[]{String.class}, Void.TYPE)) {
                                            com.ss.android.ugc.aweme.newfollow.f.b bVar2 = bVar;
                                            PatchProxy.accessDispatch(new Object[]{b2}, bVar2, com.ss.android.ugc.aweme.newfollow.f.b.f3643c, false, 61224, new Class[]{String.class}, Void.TYPE);
                                        } else if (bVar.f2979f != null && ((FlowFeedViewHolder) bVar.f2979f).isViewValid()) {
                                            ((FlowFeedViewHolder) bVar.f2979f).a(b2);
                                        }
                                    }
                                    c2.remove(obj3);
                                }
                            }
                        }
                        a(i3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f41185a, false, 34998, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f41185a, false, 34998, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f41186b != null) {
            this.f41186b.d(this.g);
        }
        return super.a(objArr);
    }

    public final void a(List list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f41185a, false, 35007, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f41185a, false, 35007, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a(list, i2);
        }
    }
}
