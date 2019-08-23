package com.ss.android.ugc.aweme.favorites.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.favorites.adapter.CollectStickerAdapter;
import com.ss.android.ugc.aweme.favorites.model.f;
import com.ss.android.ugc.aweme.sticker.model.d;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class StickersCollectListFragment extends BaseCollectListFragment {
    public static ChangeQuickRedirect g;
    private boolean h;

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39636, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(1);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39637, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(4);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39638, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(new f());
        }
    }

    public final BaseAdapter o() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 39639, new Class[0], BaseAdapter.class)) {
            return new CollectStickerAdapter();
        }
        return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, g, false, 39639, new Class[0], BaseAdapter.class);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39635, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39641, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39641, new Class[0], Void.TYPE);
            return;
        }
        if (this.h) {
            this.h = false;
            b();
        }
    }

    public final View q() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39642, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, g, false, 39642, new Class[0], View.class);
        } else if (getActivity() == null) {
            return null;
        } else {
            if (!a.a()) {
                return super.q();
            }
            c cVar = new c.a(getActivity()).b((int) C0906R.string.ado).c(C0906R.string.adn).a(2130839715).f20493a;
            MtEmptyView a2 = MtEmptyView.a(getContext());
            a2.setStatus(cVar);
            return a2;
        }
    }

    @Subscribe
    public void onStickerCollectEvent(com.ss.android.ugc.aweme.favorites.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, g, false, 39640, new Class[]{com.ss.android.ugc.aweme.favorites.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, g, false, 39640, new Class[]{com.ss.android.ugc.aweme.favorites.b.a.class}, Void.TYPE);
        } else if (isViewValid()) {
            List items = ((com.ss.android.ugc.aweme.common.f.a) this.f3120f.i()).getItems();
            d dVar = aVar.f44271a;
            if (items != null && !items.isEmpty() && dVar != null) {
                if (!dVar.isFavorite) {
                    int size = items.size();
                    Iterator it2 = items.iterator();
                    while (it2.hasNext()) {
                        d dVar2 = (d) it2.next();
                        if (dVar2 != null && TextUtils.equals(dVar2.id, dVar.id)) {
                            this.h = false;
                            it2.remove();
                        }
                    }
                    if (size != items.size()) {
                        this.f3116b.notifyDataSetChanged();
                    } else {
                        this.h = true;
                    }
                    if (items.isEmpty()) {
                        y_();
                    }
                    return;
                }
                this.h = true;
            }
        }
    }
}
