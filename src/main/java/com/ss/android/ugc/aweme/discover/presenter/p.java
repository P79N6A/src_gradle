package com.ss.android.ugc.aweme.discover.presenter;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import java.util.concurrent.Callable;

public final class p extends j<Aweme, SearchMix> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42733a;

    /* renamed from: b  reason: collision with root package name */
    public String f42734b;

    /* renamed from: c  reason: collision with root package name */
    private String f42735c;

    public final int a() {
        return 3;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((SearchMix) this.mData).awemeList;
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
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42733a, false, 37263, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f42733a, false, 37263, new Class[]{Object[].class}, Void.TYPE);
        } else if (objArr.length == 1) {
            String str = this.f42734b;
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
            com.meituan.robust.ChangeQuickRedirect r4 = f42733a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37259(0x918b, float:5.2211E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f42733a
            r13 = 0
            r14 = 37259(0x918b, float:5.2211E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            r2 = 2
            r2 = r0[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r8 = android.support.v4.util.ObjectsCompat.equals(r2, r3)
            int r2 = r0.length
            r3 = 6
            if (r2 != r3) goto L_0x0070
            r1 = r0[r1]
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = 10
            r1 = 3
            r1 = r0[r1]
            java.lang.Double r1 = (java.lang.Double) r1
            double r9 = r1.doubleValue()
            r1 = 4
            r1 = r0[r1]
            java.lang.Double r1 = (java.lang.Double) r1
            double r11 = r1.doubleValue()
            java.lang.String r13 = ""
            r1 = 5
            r0 = r0[r1]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r14 = r0.intValue()
            r4 = r17
            r4.a(r5, r6, r7, r8, r9, r11, r13, r14)
            return
        L_0x0070:
            r0 = r0[r1]
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = 10
            r9 = 0
            r11 = 0
            java.lang.String r13 = ""
            r14 = 1
            r4 = r17
            r4.a(r5, r6, r7, r8, r9, r11, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.p.refreshList(java.lang.Object[]):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        int i;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{searchMix}, this, f42733a, false, 37262, new Class[]{SearchMix.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMix}, this, f42733a, false, 37262, new Class[]{SearchMix.class}, Void.TYPE);
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
            if (1 == this.mListQueryType) {
                this.f42735c = ai.a().a(searchMix.logPb);
            }
            if (searchMix.poiList != null) {
                for (SearchPoi searchPoi : searchMix.poiList) {
                    searchPoi.logPb = this.f42735c;
                }
            }
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
            List<SearchUser> list2 = searchMix.users;
            if (!CollectionUtils.isEmpty(list2)) {
                for (SearchUser searchUser : list2) {
                    searchUser.user.setRequestId(this.f42718f);
                }
            }
            List<SearchChallenge> list3 = searchMix.challengeList;
            if (!CollectionUtils.isEmpty(list3)) {
                for (SearchChallenge next : list3) {
                    if (next.getChallenge() != null) {
                        next.getChallenge().setRequestId(this.f42718f);
                    }
                }
            }
            List<Music> list4 = searchMix.musicLists;
            if (!CollectionUtils.isEmpty(list4)) {
                for (Music requestId : list4) {
                    requestId.setRequestId(this.f42718f);
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ((SearchMix) this.mData).awemeList.addAll(list);
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
            ((SearchMix) this.mData).awemeList = list;
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
            }
            if (this.mData != null) {
                ((SearchMix) this.mData).hasMore = false;
            }
        }
    }

    private void a(String str, int i, int i2, int i3, String str2, int i4) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), 1, 10, str2, Integer.valueOf(i4)}, this, f42733a, false, 37261, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, Integer.valueOf(i), 1, 10, str2, Integer.valueOf(i4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42733a, false, 37261, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str3 = str;
        final int i5 = i;
        final String str4 = str2;
        final int i6 = i4;
        AnonymousClass2 r0 = new Callable(10, 1) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42742a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f42742a, false, 37265, new Class[0], Object.class)) {
                    return SearchApi.a(str3, (long) i5, 10, "general_search", 1, p.this.f42717e, str4, i6);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f42742a, false, 37265, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }

    private void a(String str, int i, int i2, int i3, double d2, double d3, String str2, int i4) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, 0, 10, Integer.valueOf(i3), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i4)}, this, f42733a, false, 37260, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, 0, 10, Integer.valueOf(i3), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i4)}, this, f42733a, false, 37260, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42734b = str3;
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str4 = str;
        final int i5 = i3;
        final double d4 = d2;
        final double d5 = d3;
        final String str5 = str2;
        AnonymousClass1 r13 = r0;
        final int i6 = i4;
        AnonymousClass1 r0 = new Callable(0, 10) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42736a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f42736a, false, 37264, new Class[0], Object.class)) {
                    return SearchApi.a(str4, (long) 0, 10, i5, p.this.f42717e, d4, d5, str5, i6);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f42736a, false, 37264, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r13, 0);
    }
}
