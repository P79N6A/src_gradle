package com.ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.common.a.n;
import com.google.common.collect.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.favorites.a.h;
import com.ss.android.ugc.aweme.sticker.model.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f extends a<d, h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44307a;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<d> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((h) this.mData).f44217a;
    }

    public f() {
        h hVar = new h();
        hVar.f44217a = new ArrayList();
        hVar.a(false);
        this.mData = hVar;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f44307a, false, 39511, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44307a, false, 39511, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((h) this.mData).a()) {
            z = true;
        }
        return z;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f44307a, false, 39510, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f44307a, false, 39510, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(((h) this.mData).f44218b, 10);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f44307a, false, 39509, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f44307a, false, 39509, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(0, 12);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        Collection collection;
        boolean z2;
        h hVar = (h) obj;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f44307a, false, 39512, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f44307a, false, 39512, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if (hVar == null || CollectionUtils.isEmpty(hVar.f44217a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    if (this.mData == null) {
                        this.mData = hVar;
                    } else {
                        List<d> list = ((h) this.mData).f44217a;
                        List<d> list2 = hVar.f44217a;
                        List<d> list3 = ((h) this.mData).f44217a;
                        if (PatchProxy.isSupport(new Object[]{list2, list3}, this, f44307a, false, 39514, new Class[]{List.class, List.class}, Collection.class)) {
                            collection = (Collection) PatchProxy.accessDispatch(new Object[]{list2, list3}, this, f44307a, false, 39514, new Class[]{List.class, List.class}, Collection.class);
                        } else {
                            if (list3 == null || list3.isEmpty()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            collection = m.a((Collection<E>) list2, (n<? super E>) new h<Object>(z2, list3));
                        }
                        list.addAll(collection);
                        ((h) this.mData).f44218b = hVar.f44218b;
                        h hVar2 = (h) this.mData;
                        if (!hVar.a() || !((h) this.mData).a()) {
                            z3 = false;
                        }
                        hVar2.a(z3);
                    }
                }
                return;
            }
            this.mData = hVar;
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((h) this.mData).f44217a.clear();
            }
            ((h) this.mData).a(false);
        }
    }

    private void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44307a, false, 39513, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44307a, false, 39513, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.base.m.a().a(this.mHandler, new g(i, i2), 0);
    }
}
