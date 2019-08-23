package com.ss.android.ugc.aweme.common.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import java.util.List;

public class b<T extends a> extends com.ss.android.ugc.aweme.common.b<T, c> implements e {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f40213c;

    /* renamed from: a  reason: collision with root package name */
    private d f40214a;

    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f40213c, false, 33463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40213c, false, 33463, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        this.f40214a = null;
    }

    public void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f40213c, false, 33465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40213c, false, 33465, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null) {
            int i = ((a) this.f2978e).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((c) this.f2979f).n_();
                        return;
                    case 2:
                        ((c) this.f2979f).z_();
                        return;
                }
            } else {
                ((c) this.f2979f).s_();
            }
        }
    }

    public void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f40213c, false, 33466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40213c, false, 33466, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null) {
            int i = ((a) this.f2978e).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((a) this.f2978e).isDataEmpty()) {
                            ((c) this.f2979f).y_();
                            return;
                        } else {
                            ((c) this.f2979f).a(((a) this.f2978e).getItems(), ((a) this.f2978e).isHasMore());
                            return;
                        }
                    case 2:
                        ((c) this.f2979f).c(((a) this.f2978e).getItems(), !((a) this.f2978e).isNewDataEmpty());
                        break;
                }
                return;
            }
            c cVar = (c) this.f2979f;
            List items = ((a) this.f2978e).getItems();
            if (((a) this.f2978e).isHasMore() && !((a) this.f2978e).isNewDataEmpty()) {
                z = true;
            }
            cVar.b(items, z);
        }
    }

    public void a(d dVar) {
        this.f40214a = dVar;
    }

    public void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40213c, false, 33470, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40213c, false, 33470, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f40214a != null) {
            this.f40214a.a_(i);
        }
    }

    public void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f40213c, false, 33464, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f40213c, false, 33464, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null) {
            int i = ((a) this.f2978e).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((c) this.f2979f).b(exc);
                        return;
                    case 2:
                        ((c) this.f2979f).d(exc);
                        break;
                }
                return;
            }
            ((c) this.f2979f).c(exc);
        }
    }

    public boolean a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f40213c, false, 33467, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f40213c, false, 33467, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f2978e == null || !((a) this.f2978e).deleteItem(obj)) {
            return false;
        } else {
            return true;
        }
    }

    public void a(List list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f40213c, false, 33471, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f40213c, false, 33471, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f40214a != null) {
            this.f40214a.a(list, i);
        }
    }

    public boolean a(Object obj, int i) {
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i)}, this, f40213c, false, 33468, new Class[]{Object.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i)}, this, f40213c, false, 33468, new Class[]{Object.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f2978e == null || !((a) this.f2978e).insertItem(obj, i)) {
            return false;
        } else {
            return true;
        }
    }
}
