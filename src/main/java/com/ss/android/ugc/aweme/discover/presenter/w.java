package com.ss.android.ugc.aweme.discover.presenter;

import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import java.util.concurrent.Callable;

public final class w extends j<SearchUser, SearchUserList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42775a;

    /* renamed from: b  reason: collision with root package name */
    public String f42776b;

    /* renamed from: c  reason: collision with root package name */
    public String f42777c = "";

    public final int a() {
        return 0;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchUserList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        this.f42777c = str;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42775a, false, 37329, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f42775a, false, 37329, new Class[]{Object[].class}, Void.TYPE);
        } else if (objArr.length >= 4) {
            String str = objArr[1];
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchUserList) this.mData).cursor;
            }
            a(str, i2, 1, 10, this.g, objArr[3].intValue());
        } else {
            String str2 = objArr[1];
            if (isDataEmpty()) {
                i = 0;
            } else {
                i = ((SearchUserList) this.mData).cursor;
            }
            a(str2, i, 1, 10, this.g, 0);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d3, code lost:
        if (r9.mData != null) goto L_0x00d5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.ss.android.ugc.aweme.discover.model.SearchUserList r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42775a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchUserList> r1 = com.ss.android.ugc.aweme.discover.model.SearchUserList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 37328(0x91d0, float:5.2308E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42775a
            r3 = 0
            r4 = 37328(0x91d0, float:5.2308E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchUserList> r1 = com.ss.android.ugc.aweme.discover.model.SearchUserList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.handleData(r10)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r0 = r10.userList
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
            if (r1 != 0) goto L_0x009a
            java.util.Iterator r1 = r0.iterator()
        L_0x004e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = (com.ss.android.ugc.aweme.discover.model.SearchUser) r3
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            java.lang.String r4 = r9.f42718f
            r3.setRequestId(r4)
            goto L_0x004e
        L_0x0062:
            int r1 = r9.mListQueryType
            if (r1 == r7) goto L_0x0089
            if (r1 == r2) goto L_0x0069
            return
        L_0x0069:
            r9.c(r0)
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r1 = r10.hasMore
            if (r1 == 0) goto L_0x007d
            java.lang.Object r1 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r1 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r1
            boolean r1 = r1.hasMore
            if (r1 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r7 = 0
        L_0x007e:
            r0.hasMore = r7
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r0
            int r1 = r10.cursor
            r0.cursor = r1
            return
        L_0x0089:
            r9.mData = r10
            java.lang.Object r1 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r1 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.userList = r2
            r9.b(r0)
            return
        L_0x009a:
            int r0 = r9.mListQueryType
            if (r0 == r7) goto L_0x00cc
            if (r0 == r2) goto L_0x00a1
            goto L_0x00db
        L_0x00a1:
            java.lang.Object r0 = r9.mData
            if (r0 == 0) goto L_0x00db
            if (r10 == 0) goto L_0x00d5
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r1 = r10.hasMore
            if (r1 == 0) goto L_0x00b8
            java.lang.Object r1 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r1 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r1
            boolean r1 = r1.hasMore
            if (r1 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            r0.hasMore = r7
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r0 = r0.hasMore
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r0
            int r1 = r10.cursor
            r0.cursor = r1
            return
        L_0x00cc:
            r9.mData = r10
            r9.b()
            java.lang.Object r0 = r9.mData
            if (r0 == 0) goto L_0x00db
        L_0x00d5:
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.ss.android.ugc.aweme.discover.model.SearchUserList) r0
            r0.hasMore = r8
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.w.handleData(com.ss.android.ugc.aweme.discover.model.SearchUserList):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object[]} */
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
            com.meituan.robust.ChangeQuickRedirect r4 = f42775a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37326(0x91ce, float:5.2305E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f42775a
            r13 = 0
            r14 = 37326(0x91ce, float:5.2305E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            int r2 = r0.length
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            if (r2 < r3) goto L_0x0063
            r1 = r0[r1]
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            r1 = r0[r6]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            r1 = r0[r5]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r11 = r1.intValue()
            java.lang.String r12 = ""
            r0 = r0[r4]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r13 = r0.intValue()
            r7 = r17
            r7.a(r8, r9, r10, r11, r12, r13)
            return
        L_0x0063:
            int r2 = r0.length
            if (r2 < r4) goto L_0x0086
            r1 = r0[r1]
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            r1 = r0[r6]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            r11 = 10
            java.lang.String r12 = ""
            r0 = r0[r5]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r13 = r0.intValue()
            r7 = r17
            r7.a(r8, r9, r10, r11, r12, r13)
            return
        L_0x0086:
            r1 = r0[r1]
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            r0 = r0[r6]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r10 = r0.intValue()
            r11 = 10
            java.lang.String r12 = ""
            r13 = 0
            r7 = r17
            r7.a(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.w.refreshList(java.lang.Object[]):void");
    }

    private void a(String str, int i, int i2, int i3, String str2, int i4) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, this, f42775a, false, 37327, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, this, f42775a, false, 37327, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42776b = str3;
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str4 = str;
        final int i5 = i;
        final int i6 = i3;
        final int i7 = i2;
        final String str5 = str2;
        final int i8 = i4;
        AnonymousClass1 r0 = new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42778a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f42778a, false, 37330, new Class[0], Object.class)) {
                    return SearchApi.a(str4, (long) i5, i6, i7, w.this.f42717e, w.this.f42777c, str5, i8);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f42778a, false, 37330, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
