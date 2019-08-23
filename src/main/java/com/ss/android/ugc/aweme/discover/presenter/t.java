package com.ss.android.ugc.aweme.discover.presenter;

import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.discover.model.SearchPoiList;
import java.util.concurrent.Callable;

public final class t extends j<SearchPoi, SearchPoiList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42756a;

    /* renamed from: b  reason: collision with root package name */
    public String f42757b;

    /* renamed from: c  reason: collision with root package name */
    public String f42758c;

    public final int a() {
        return 5;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchPoiList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42756a, false, 37299, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f42756a, false, 37299, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchPoiList) this.mData).cursor;
        }
        a(str, i, 10, objArr[3].doubleValue(), objArr[4].doubleValue(), this.g, objArr[5].intValue());
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42756a, false, 37296, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f42756a, false, 37296, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 0, 10, objArr[3].doubleValue(), objArr[4].doubleValue(), "", objArr[5].intValue());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e7, code lost:
        if (r9.mData != null) goto L_0x00e9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.ss.android.ugc.aweme.discover.model.SearchPoiList r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42756a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchPoiList> r1 = com.ss.android.ugc.aweme.discover.model.SearchPoiList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 37298(0x91b2, float:5.2266E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42756a
            r3 = 0
            r4 = 37298(0x91b2, float:5.2266E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchPoiList> r1 = com.ss.android.ugc.aweme.discover.model.SearchPoiList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.handleData(r10)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi> r0 = r10.poiList
            if (r10 == 0) goto L_0x0042
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r1 = 0
            goto L_0x0043
        L_0x0042:
            r1 = 1
        L_0x0043:
            r9.mIsNewDataEmpty = r1
            boolean r1 = r9.mIsNewDataEmpty
            r2 = 4
            if (r1 != 0) goto L_0x00ae
            int r1 = r9.mListQueryType
            if (r1 != r7) goto L_0x005a
            com.ss.android.ugc.aweme.feed.ai r1 = com.ss.android.ugc.aweme.feed.ai.a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r10.logPb
            java.lang.String r1 = r1.a((com.ss.android.ugc.aweme.feed.model.LogPbBean) r3)
            r9.f42758c = r1
        L_0x005a:
            java.util.Iterator r1 = r0.iterator()
        L_0x005e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.discover.model.SearchPoi r3 = (com.ss.android.ugc.aweme.discover.model.SearchPoi) r3
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r4 = r3.poi
            java.lang.String r5 = r9.f42718f
            r4.setRequestId(r5)
            java.lang.String r4 = r9.f42758c
            r3.logPb = r4
            goto L_0x005e
        L_0x0076:
            int r1 = r9.mListQueryType
            if (r1 == r7) goto L_0x009d
            if (r1 == r2) goto L_0x007d
            return
        L_0x007d:
            r9.c(r0)
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r1 = r10.hasMore
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r1 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r1
            boolean r1 = r1.hasMore
            if (r1 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r7 = 0
        L_0x0092:
            r0.hasMore = r7
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            int r1 = r10.cursor
            r0.cursor = r1
            return
        L_0x009d:
            r9.mData = r10
            java.lang.Object r1 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r1 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.poiList = r2
            r9.b(r0)
            return
        L_0x00ae:
            int r0 = r9.mListQueryType
            if (r0 == r7) goto L_0x00e0
            if (r0 == r2) goto L_0x00b5
            goto L_0x00ef
        L_0x00b5:
            java.lang.Object r0 = r9.mData
            if (r0 == 0) goto L_0x00ef
            if (r10 == 0) goto L_0x00e9
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r1 = r10.hasMore
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r1 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r1
            boolean r1 = r1.hasMore
            if (r1 == 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            r0.hasMore = r7
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r0 = r0.hasMore
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            int r1 = r10.cursor
            r0.cursor = r1
            return
        L_0x00e0:
            r9.mData = r10
            r9.b()
            java.lang.Object r0 = r9.mData
            if (r0 == 0) goto L_0x00ef
        L_0x00e9:
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            r0.hasMore = r8
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.t.handleData(com.ss.android.ugc.aweme.discover.model.SearchPoiList):void");
    }

    private void a(String str, int i, int i2, double d2, double d3, String str2, int i3) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), 10, Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i3)}, this, f42756a, false, 37297, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), 10, Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i3)}, this, f42756a, false, 37297, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42757b = str3;
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str4 = str;
        final int i4 = i;
        final double d4 = d2;
        final double d5 = d3;
        final String str5 = str2;
        final int i5 = i3;
        AnonymousClass1 r0 = new Callable(10) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42759a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f42759a, false, 37300, new Class[0], Object.class)) {
                    return SearchApi.a(str4, (long) i4, 10, t.this.f42717e, d4, d5, str5, i5);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f42759a, false, 37300, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
