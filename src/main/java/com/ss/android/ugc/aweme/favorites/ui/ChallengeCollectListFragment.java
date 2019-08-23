package com.ss.android.ugc.aweme.favorites.ui;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.favorites.adapter.CollectChallengeAdapter;
import com.ss.android.ugc.aweme.favorites.model.a;

public class ChallengeCollectListFragment extends BaseCollectListFragment {
    public static ChangeQuickRedirect g;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39552, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(1);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39553, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(4);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39554, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(new a());
        }
    }

    public final BaseAdapter o() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 39555, new Class[0], BaseAdapter.class)) {
            return new CollectChallengeAdapter(getActivity());
        }
        return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, g, false, 39555, new Class[0], BaseAdapter.class);
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39556, new Class[0], Void.TYPE);
            return;
        }
        p();
    }

    public final View q() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39557, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, g, false, 39557, new Class[0], View.class);
        } else if (getActivity() == null) {
            return null;
        } else {
            if (!com.ss.android.g.a.a() || getActivity() == null) {
                return super.q();
            }
            c cVar = new c.a(getActivity()).b((int) C0906R.string.adr).c(C0906R.string.adq).a(2130839715).f20493a;
            MtEmptyView a2 = MtEmptyView.a(getContext());
            a2.setStatus(cVar);
            return a2;
        }
    }
}
