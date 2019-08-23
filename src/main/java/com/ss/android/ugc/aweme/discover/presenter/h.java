package com.ss.android.ugc.aweme.discover.presenter;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.concurrent.Callable;

public final class h extends j<Aweme, SearchMix> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42705a;

    /* renamed from: b  reason: collision with root package name */
    public String f42706b;

    /* renamed from: c  reason: collision with root package name */
    public String f42707c = "video_search";

    public final int a() {
        return 4;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchMix) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42705a, false, 37193, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f42705a, false, 37193, new Class[]{Object[].class}, Void.TYPE);
        } else if (objArr.length == 1) {
            String str = this.f42706b;
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchMix) this.mData).cursor;
            }
            a(str, i2, 1, 10, this.g, 1);
        } else {
            String str2 = objArr[1];
            if (isDataEmpty()) {
                i = 0;
            } else {
                i = ((SearchMix) this.mData).cursor;
            }
            a(str2, i, 1, 10, this.g, objArr[3].intValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void refreshList(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f42705a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37190(0x9146, float:5.2114E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f42705a
            r13 = 0
            r14 = 37190(0x9146, float:5.2114E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            int r2 = r0.length
            if (r2 != r1) goto L_0x004a
            r2 = r17
            java.lang.String r4 = r2.f42706b
            r5 = 0
            r6 = 0
            r7 = 10
            java.lang.String r8 = ""
            r9 = 1
            r3 = r17
            r3.a(r4, r5, r6, r7, r8, r9)
            return
        L_0x004a:
            r2 = r17
            r1 = r0[r1]
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r1 = 2
            r1 = r0[r1]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            r7 = 10
            java.lang.String r8 = ""
            r1 = 3
            r0 = r0[r1]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            r3 = r17
            r3.a(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.h.refreshList(java.lang.Object[]):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        int i;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{searchMix}, this, f42705a, false, 37192, new Class[]{SearchMix.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMix}, this, f42705a, false, 37192, new Class[]{SearchMix.class}, Void.TYPE);
            return;
        }
        super.handleData(searchMix);
        if (searchMix == null || CollectionUtils.isEmpty(searchMix.awemeList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            List<Aweme> list = searchMix.awemeList;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme a2 = a.a().a(searchMix.awemeList.get(i2));
                if (this.mData == null || ((SearchMix) this.mData).awemeList == null) {
                    i = 0;
                } else {
                    i = ((SearchMix) this.mData).awemeList.size();
                }
                a2.setRequestId(this.f42718f);
                a a3 = a.a();
                a3.a(a2.getAid() + 9, this.f42718f, i + i2);
                list.set(i2, a2);
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    c(list);
                    SearchMix searchMix2 = (SearchMix) this.mData;
                    if (!searchMix.hasMore || !((SearchMix) this.mData).hasMore) {
                        z2 = false;
                    }
                    searchMix2.hasMore = z2;
                    ((SearchMix) this.mData).cursor = searchMix.cursor;
                }
                return;
            }
            this.mData = searchMix;
            b(list);
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
                b();
            }
            if (this.mData != null) {
                ((SearchMix) this.mData).hasMore = false;
            }
        }
    }

    private void a(String str, int i, int i2, int i3, String str2, int i4) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), 10, str2, Integer.valueOf(i4)}, this, f42705a, false, 37191, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), 10, str2, Integer.valueOf(i4)}, this, f42705a, false, 37191, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42706b = str3;
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str4 = str;
        final int i5 = i;
        final int i6 = i2;
        final String str5 = str2;
        final int i7 = i4;
        AnonymousClass1 r0 = new Callable(10) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42708a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f42708a, false, 37194, new Class[0], Object.class)) {
                    return SearchApi.a(str4, (long) i5, 10, h.this.f42707c, i6, h.this.f42717e, str5, i7);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f42708a, false, 37194, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
