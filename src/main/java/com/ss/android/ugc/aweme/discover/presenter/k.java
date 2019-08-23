package com.ss.android.ugc.aweme.discover.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.presenter.j;
import com.ss.android.ugc.aweme.discover.ui.af;

public class k<T extends j> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42719a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42720b;
    public af g;

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42719a, false, 37207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42719a, false, 37207, new Class[0], Void.TYPE);
            return;
        }
        this.f42720b = true;
        super.b();
        if (((j) this.f2978e).mListQueryType == 1) {
            if (this.g != null) {
                this.g.a(((j) this.f2978e).d());
                this.g.a(((j) this.f2978e).g());
                this.g.a(((j) this.f2978e).e());
                this.g.a(((j) this.f2978e).f());
                return;
            }
            if (this.f2979f instanceof af) {
                ((af) this.f2979f).a(((j) this.f2978e).d());
                ((af) this.f2979f).a(((j) this.f2978e).g());
                ((af) this.f2979f).a(((j) this.f2978e).e());
                ((af) this.f2979f).a(((j) this.f2978e).f());
                ((af) this.f2979f).a((SearchApiResult) ((j) this.f2978e).getData());
            }
        }
    }

    public final void b(int i) {
        if (this.f2978e != null) {
            ((j) this.f2978e).f42717e = i;
        }
    }

    public void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f42719a, false, 37208, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f42719a, false, 37208, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f42720b = false;
        super.a(exc);
    }
}
