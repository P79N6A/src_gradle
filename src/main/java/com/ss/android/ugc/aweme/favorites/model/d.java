package com.ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class d extends a<PoiStruct, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44302a;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<PoiStruct> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((c) this.mData).f44299a;
    }

    public d() {
        c cVar = new c();
        cVar.f44299a = new ArrayList();
        cVar.a(true);
        this.mData = cVar;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f44302a, false, 39477, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44302a, false, 39477, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((c) this.mData).a()) {
            z = true;
        }
        return z;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f44302a, false, 39475, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f44302a, false, 39475, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(((c) this.mData).f44300b, 10);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f44302a, false, 39474, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f44302a, false, 39474, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(0, 12);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        List list;
        c cVar = (c) obj;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f44302a, false, 39478, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f44302a, false, 39478, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (cVar == null || CollectionUtils.isEmpty(cVar.f44299a)) {
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
                        this.mData = cVar;
                    } else {
                        List<PoiStruct> list2 = ((c) this.mData).f44299a;
                        List<PoiStruct> list3 = cVar.f44299a;
                        List<PoiStruct> list4 = ((c) this.mData).f44299a;
                        if (PatchProxy.isSupport(new Object[]{list3, list4}, null, f44302a, true, 39479, new Class[]{List.class, List.class}, List.class)) {
                            list = (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, null, f44302a, true, 39479, new Class[]{List.class, List.class}, List.class);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (PoiStruct next : list3) {
                                arrayList.add(next);
                                for (PoiStruct poiId : list4) {
                                    if (next.getPoiId().equals(poiId.getPoiId())) {
                                        arrayList.remove(next);
                                    }
                                }
                            }
                            list = arrayList;
                        }
                        list2.addAll(list);
                        ((c) this.mData).f44300b = cVar.f44300b;
                        c cVar2 = (c) this.mData;
                        if (!cVar.a() || !((c) this.mData).a()) {
                            z2 = false;
                        }
                        cVar2.a(z2);
                    }
                }
                return;
            }
            this.mData = cVar;
        } else if (this.mData != null) {
            ((c) this.mData).a(false);
        }
    }

    private void a(final int i, final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44302a, false, 39476, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44302a, false, 39476, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44303a;

            public final Object call() {
                if (!PatchProxy.isSupport(new Object[0], this, f44303a, false, 39480, new Class[0], Object.class)) {
                    return UserFavoritesApi.a(i, i2);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f44303a, false, 39480, new Class[0], Object.class);
            }
        }, 0);
    }
}
