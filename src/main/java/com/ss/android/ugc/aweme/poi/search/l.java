package com.ss.android.ugc.aweme.poi.search;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.poi.api.POIApiManager;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.ay;
import java.util.List;
import java.util.concurrent.Callable;

public final class l extends a<PoiStruct, ay> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60349a;

    /* renamed from: b  reason: collision with root package name */
    public String f60350b;

    /* renamed from: c  reason: collision with root package name */
    public String f60351c;

    /* renamed from: d  reason: collision with root package name */
    private String f60352d;

    /* renamed from: e  reason: collision with root package name */
    private String f60353e;

    /* renamed from: f  reason: collision with root package name */
    private int f60354f;
    private String g;

    public final List<PoiStruct> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ay) this.mData).f59904b;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((ay) this.mData).f59905c) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 6 && objArr.length != 1)) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f60349a, false, 65749, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f60349a, false, 65749, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = this.f60350b;
        String str2 = this.f60352d;
        String str3 = this.f60353e;
        int i2 = this.f60354f;
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((ay) this.mData).f59906d;
        }
        a(str, str2, str3, i2, i, 20, 0, this.g);
    }

    public final /* synthetic */ void handleData(Object obj) {
        ay ayVar = (ay) obj;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{ayVar}, this, f60349a, false, 65751, new Class[]{ay.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ayVar}, this, f60349a, false, 65751, new Class[]{ay.class}, Void.TYPE);
            return;
        }
        if (ayVar != null && this.mListQueryType == 1) {
            this.f60351c = ai.a().a(ayVar.f59908f);
        }
        if (ayVar != null) {
            if (ayVar.f59904b != null) {
                for (PoiStruct put : ayVar.f59904b) {
                    put.put("logpb", this.f60351c);
                }
            }
            if (ayVar.f59907e != null) {
                ayVar.f59907e.put("logpb", this.f60351c);
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4 && this.mData != null) {
                if (ayVar != null && !CollectionUtils.isEmpty(ayVar.f59904b)) {
                    z = false;
                }
                this.mIsNewDataEmpty = z;
                if (this.mIsNewDataEmpty) {
                    ((ay) this.mData).f59905c = false;
                    return;
                }
                ((ay) this.mData).f59904b.addAll(ayVar.f59904b);
                ((ay) this.mData).f59905c = ayVar.f59905c;
                ((ay) this.mData).f59906d = ayVar.f59906d;
            }
            return;
        }
        this.mData = ayVar;
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f60349a, false, 65748, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f60349a, false, 65748, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f60350b = objArr[1];
        this.f60352d = String.valueOf(objArr[2]);
        this.f60353e = String.valueOf(objArr[3]);
        this.f60354f = objArr[4].intValue();
        this.g = String.valueOf(objArr[5]);
        a(objArr[1], objArr[2], objArr[3], objArr[4].intValue(), 1, 20, 1, this.g);
    }

    private void a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), 20, Integer.valueOf(i4), str4}, this, f60349a, false, 65750, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), 20, Integer.valueOf(i4), str4}, this, f60349a, false, 65750, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final int i5 = i;
        final int i6 = i2;
        final int i7 = i4;
        final String str8 = str4;
        AnonymousClass1 r0 = new Callable(20) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60355a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f60355a, false, 65753, new Class[0], Object.class)) {
                    return POIApiManager.a(str5, str6, str7, i5, i6, 20, i7, str8);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f60355a, false, 65753, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
