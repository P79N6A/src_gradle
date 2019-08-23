package com.ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.api.PoiApi;
import java.util.List;
import java.util.concurrent.Callable;

public final class j extends a<Aweme, i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59924a;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((i) this.mData).f59919a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || ((i) this.mData).f59920b != 1) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59924a, false, 65011, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f59924a, false, 65011, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = objArr[1];
        if (!isDataEmpty()) {
            i = ((i) this.mData).f59921c;
        }
        a(str, 20, i, objArr[2].intValue());
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59924a, false, 65010, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f59924a, false, 65010, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 20, 0, objArr[2].intValue());
    }

    public final void setItems(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f59924a, false, 65014, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f59924a, false, 65014, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            this.mData = new i();
        }
        ((i) this.mData).f59920b = 1;
        ((i) this.mData).f59919a = list;
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        i iVar = (i) obj;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f59924a, false, 65013, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f59924a, false, 65013, new Class[]{i.class}, Void.TYPE);
            return;
        }
        if (iVar == null || CollectionUtils.isEmpty(iVar.f59919a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            List<Aweme> list = iVar.f59919a;
            if (!CollectionUtils.isEmpty(list)) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.set(i, com.ss.android.ugc.aweme.feed.a.a().a(list.get(i)));
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ((i) this.mData).f59919a.addAll(iVar.f59919a);
                    ((i) this.mData).f59920b &= iVar.f59920b;
                    ((i) this.mData).f59921c = iVar.f59921c;
                }
                return;
            }
            this.mData = iVar;
        } else if (this.mData != null) {
            ((i) this.mData).f59920b = 0;
        }
    }

    private void a(String str, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{str, 20, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59924a, false, 65012, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, 20, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59924a, false, 65012, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str2 = str;
        final int i4 = i2;
        final int i5 = i3;
        AnonymousClass1 r0 = new Callable<i>(20) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59925a;

            public final /* synthetic */ Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f59925a, false, 65015, new Class[0], i.class)) {
                    return (i) PatchProxy.accessDispatch(new Object[0], this, f59925a, false, 65015, new Class[0], i.class);
                }
                String str = str2;
                int i = 20;
                int i2 = i4;
                int i3 = i5;
                if (!PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, PoiApi.f59711a, true, 64917, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class)) {
                    return (i) PoiApi.f59712b.queryPoiAwemeList(str, i3, i, i2).get();
                }
                return (i) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, PoiApi.f59711a, true, 64917, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
