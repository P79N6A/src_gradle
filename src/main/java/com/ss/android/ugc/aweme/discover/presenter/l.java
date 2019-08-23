package com.ss.android.ugc.aweme.discover.presenter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchChallengeList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class l extends j<SearchChallenge, SearchChallengeList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42721a;

    /* renamed from: b  reason: collision with root package name */
    public String f42722b;

    public final int a() {
        return 2;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42721a, false, 37218, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f42721a, false, 37218, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchChallengeList) this.mData).cursor;
        }
        a(str, i, 1, 20, this.g, objArr[3].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchChallengeList searchChallengeList) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{searchChallengeList}, this, f42721a, false, 37217, new Class[]{SearchChallengeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchChallengeList}, this, f42721a, false, 37217, new Class[]{SearchChallengeList.class}, Void.TYPE);
            return;
        }
        super.handleData(searchChallengeList);
        List<SearchChallenge> list = searchChallengeList.challengeList;
        if (searchChallengeList == null || CollectionUtils.isEmpty(list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            for (SearchChallenge next : list) {
                if (next.getChallenge() != null) {
                    next.getChallenge().setRequestId(this.f42718f);
                }
                next.setRequestId(searchChallengeList.getRequestId());
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = searchChallengeList;
                ((SearchChallengeList) this.mData).challengeList = new ArrayList();
                b(list);
            } else if (i == 4) {
                c(list);
                SearchChallengeList searchChallengeList2 = (SearchChallengeList) this.mData;
                if (!searchChallengeList.hasMore || !((SearchChallengeList) this.mData).hasMore) {
                    z2 = false;
                }
                searchChallengeList2.hasMore = z2;
                ((SearchChallengeList) this.mData).cursor = searchChallengeList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchChallengeList;
                b();
            }
            if (this.mData != null) {
                ((SearchChallengeList) this.mData).hasMore = false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
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
            com.meituan.robust.ChangeQuickRedirect r4 = f42721a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37215(0x915f, float:5.215E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f42721a
            r13 = 0
            r14 = 37215(0x915f, float:5.215E-41)
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
            r4 = 3
            r5 = 2
            if (r2 < r3) goto L_0x0063
            r1 = r0[r1]
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r1 = r0[r5]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r9 = r1.intValue()
            r1 = r0[r4]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            java.lang.String r11 = ""
            r1 = 4
            r0 = r0[r1]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r12 = r0.intValue()
            r6 = r17
            r6.a(r7, r8, r9, r10, r11, r12)
            return
        L_0x0063:
            r1 = r0[r1]
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r1 = r0[r5]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r9 = r1.intValue()
            r10 = 20
            java.lang.String r11 = ""
            r0 = r0[r4]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r12 = r0.intValue()
            r6 = r17
            r6.a(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.l.refreshList(java.lang.Object[]):void");
    }

    private void a(String str, int i, int i2, int i3, String str2, int i4) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, this, f42721a, false, 37216, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, this, f42721a, false, 37216, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42722b = str3;
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
            public static ChangeQuickRedirect f42723a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f42723a, false, 37219, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f42723a, false, 37219, new Class[0], Object.class);
                } else if (TextUtils.isEmpty(str4)) {
                    return SearchApi.a((long) i5, i6);
                } else {
                    return SearchApi.a(str4, (long) i5, i6, i7, l.this.f42717e, str5, i8);
                }
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
