package com.ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.f.a<Challenge, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44291a;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((b) this.mData).f44296a;
    }

    public a() {
        b bVar = new b();
        bVar.f44296a = new ArrayList();
        bVar.a(true);
        this.mData = bVar;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f44291a, false, 39470, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44291a, false, 39470, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((b) this.mData).a()) {
            z = true;
        }
        return z;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f44291a, false, 39468, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f44291a, false, 39468, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(((b) this.mData).f44297b, 10);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f44291a, false, 39467, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f44291a, false, 39467, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(0, 12);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        List list;
        b bVar = (b) obj;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f44291a, false, 39471, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f44291a, false, 39471, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar == null || CollectionUtils.isEmpty(bVar.f44296a)) {
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
                        this.mData = bVar;
                    } else {
                        List<Challenge> list2 = ((b) this.mData).f44296a;
                        List<Challenge> list3 = bVar.f44296a;
                        List<Challenge> list4 = ((b) this.mData).f44296a;
                        if (PatchProxy.isSupport(new Object[]{list3, list4}, null, f44291a, true, 39472, new Class[]{List.class, List.class}, List.class)) {
                            list = (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, null, f44291a, true, 39472, new Class[]{List.class, List.class}, List.class);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Challenge next : list3) {
                                arrayList.add(next);
                                for (Challenge cid : list4) {
                                    if (next.getCid().equals(cid.getCid())) {
                                        arrayList.remove(next);
                                    }
                                }
                            }
                            list = arrayList;
                        }
                        list2.addAll(list);
                        ((b) this.mData).f44297b = bVar.f44297b;
                        b bVar2 = (b) this.mData;
                        if (!bVar.a() || !((b) this.mData).a()) {
                            z2 = false;
                        }
                        bVar2.a(z2);
                    }
                }
                return;
            }
            this.mData = bVar;
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((b) this.mData).f44296a.clear();
            }
            ((b) this.mData).a(false);
        }
    }

    private void a(final int i, final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44291a, false, 39469, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44291a, false, 39469, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44292a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f44292a, false, 39473, new Class[0], Object.class)) {
                    return UserFavoritesApi.b(i, i2);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f44292a, false, 39473, new Class[0], Object.class);
            }
        }, 0);
    }
}
