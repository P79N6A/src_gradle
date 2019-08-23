package com.ss.android.ugc.aweme.favorites.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.favorites.adapter.CollectPoiAdapter;
import com.ss.android.ugc.aweme.favorites.model.d;
import com.ss.android.ugc.aweme.music.a.h;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class PoiCollectListFragment extends BaseCollectListFragment {
    public static ChangeQuickRedirect g;

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39583, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(1);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39584, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(4);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39585, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(new d());
        }
    }

    public final BaseAdapter o() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 39586, new Class[0], BaseAdapter.class)) {
            return new CollectPoiAdapter();
        }
        return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, g, false, 39586, new Class[0], BaseAdapter.class);
    }

    @Subscribe
    public void onEvent(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, g, false, 39587, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, g, false, 39587, new Class[]{h.class}, Void.TYPE);
        } else if (isViewValid()) {
            List items = ((a) this.f3120f.i()).getItems();
            PoiStruct poiStruct = hVar.f56175b;
            if (poiStruct != null) {
                int size = items.size();
                if (!(this.f3120f == null || this.f3120f.i() == null || items == null || items.size() <= 0)) {
                    Iterator it2 = items.iterator();
                    while (it2.hasNext()) {
                        PoiStruct poiStruct2 = (PoiStruct) it2.next();
                        if (poiStruct2 != null && !TextUtils.isEmpty(poiStruct2.getPoiId()) && poiStruct2.getPoiId().equals(poiStruct.getPoiId())) {
                            it2.remove();
                        }
                    }
                }
                if (size != items.size()) {
                    this.f3116b.notifyDataSetChanged();
                }
            }
        }
    }
}
