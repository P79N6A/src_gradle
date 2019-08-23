package com.ss.android.ugc.aweme.similarvideo.b;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.similarvideo.a.b;
import com.ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.f.a<Aweme, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71511a;

    /* renamed from: b  reason: collision with root package name */
    public String f71512b;

    /* renamed from: c  reason: collision with root package name */
    private String f71513c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<Integer> f71514d = new ArrayList<>();

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((b) this.mData).f71506c;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((b) this.mData).f71505b) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f71511a, false, 81619, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f71511a, false, 81619, new Class[]{Object[].class}, Void.TYPE);
        } else if (objArr.length == 1) {
            String str = this.f71513c;
            if (!isDataEmpty()) {
                i = ((b) this.mData).f71504a;
            }
            a(str, i, 10);
        } else {
            String str2 = objArr[1];
            if (!isDataEmpty()) {
                i = ((b) this.mData).f71504a;
            }
            a(str2, i, 10);
        }
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f71511a, false, 81617, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f71511a, false, 81617, new Class[]{Object[].class}, Void.TYPE);
        } else if (objArr.length == 1) {
            a(this.f71513c, 0, 10);
        } else {
            a(objArr[1], 0, 10);
        }
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        int i;
        b bVar = (b) obj;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f71511a, false, 81620, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f71511a, false, 81620, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar == null || CollectionUtils.isEmpty(bVar.f71506c)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 1) {
                this.f71512b = bVar.getRequestId();
                ai.a().a(bVar.getRequestId(), bVar.f71507d);
            }
            this.f71514d.clear();
            ArrayList<Aweme> arrayList = bVar.f71506c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(bVar.f71506c.get(i2));
                if (this.mData == null || ((b) this.mData).f71506c == null) {
                    i = 0;
                } else {
                    i = ((b) this.mData).f71506c.size();
                }
                a2.setRequestId(this.f71512b);
                com.ss.android.ugc.aweme.feed.a.a().a(a2.getAid() + 16, this.f71512b, i + i2);
                arrayList.set(i2, a2);
                if (!(this.mListQueryType == 1 || this.mData == null || !((b) this.mData).f71506c.contains(a2))) {
                    this.f71514d.add(Integer.valueOf(i2));
                }
            }
            if (this.f71514d.size() != 0) {
                for (int size2 = this.f71514d.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.size() > this.f71514d.get(size2).intValue()) {
                        arrayList.remove(this.f71514d.get(size2).intValue());
                    }
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ((b) this.mData).f71506c.addAll(arrayList);
                    b bVar2 = (b) this.mData;
                    if (!bVar.f71505b || !((b) this.mData).f71505b) {
                        z2 = false;
                    }
                    bVar2.f71505b = z2;
                    ((b) this.mData).f71504a = bVar.f71504a;
                }
                return;
            }
            this.mData = bVar;
            ((b) this.mData).f71506c = arrayList;
        } else {
            if (this.mListQueryType == 1) {
                this.mData = bVar;
            }
            if (this.mData != null) {
                ((b) this.mData).f71505b = false;
            }
        }
    }

    private void a(final String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), 10}, this, f71511a, false, 81618, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), 10}, this, f71511a, false, 81618, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71513c = str2;
        final int i3 = i;
        m.a().a(this.mHandler, new Callable(10) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71515a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f71515a, false, 81621, new Class[0], Object.class)) {
                    return SimilarVideoSearchApi.a(str, (long) i3, 10);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f71515a, false, 81621, new Class[0], Object.class);
            }
        }, 0);
    }
}
