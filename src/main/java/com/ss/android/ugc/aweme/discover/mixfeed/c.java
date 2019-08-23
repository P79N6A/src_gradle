package com.ss.android.ugc.aweme.discover.mixfeed;

import a.g;
import android.annotation.SuppressLint;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.base.f;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.discover.presenter.j;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.hotsearch.d.a;
import com.ss.android.ugc.aweme.net.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends j<a, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42550a;

    /* renamed from: b  reason: collision with root package name */
    public String f42551b;

    /* renamed from: c  reason: collision with root package name */
    public o f42552c;
    private double i;
    private double j;
    private int k;
    private String l;

    public final int a() {
        return 3;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((b) this.mData).f42548c) {
            return false;
        }
        return true;
    }

    public static List<Aweme> a(List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f42550a, true, 36794, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f42550a, true, 36794, new Class[]{List.class}, List.class);
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (a next : list) {
                if (next.getFeedType() == 65280) {
                    arrayList.add(next.getAweme());
                }
            }
            return arrayList;
        }
    }

    public final void loadMoreList(Object... objArr) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f42550a, false, 36791, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f42550a, false, 36791, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (CollectionUtils.isEmpty(getItems())) {
            i2 = 0;
        } else {
            i2 = ((b) this.mData).f42547b;
        }
        if (objArr.length == 1) {
            a(this.f42551b, i2, 10, this.g);
            return;
        }
        a(this.f42551b, i2, 10, 0, objArr[3].doubleValue(), objArr[4].doubleValue(), this.g, objArr[5].intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void refreshList(java.lang.Object... r22) {
        /*
            r21 = this;
            r0 = r22
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f42550a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 36788(0x8fb4, float:5.1551E-41)
            r3 = r21
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f42550a
            r13 = 0
            r14 = 36788(0x8fb4, float:5.1551E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            int r2 = r0.length
            r3 = 2
            if (r2 != r3) goto L_0x0048
            r0 = r0[r1]
            java.lang.String r0 = (java.lang.String) r0
            r1 = 10
            java.lang.String r2 = ""
            r4 = r21
            r4.a(r0, r9, r1, r2)
            return
        L_0x0048:
            r4 = r21
            r1 = r0[r1]
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            r13 = 10
            r1 = r0[r3]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r14 = r1.intValue()
            r1 = 3
            r1 = r0[r1]
            java.lang.Double r1 = (java.lang.Double) r1
            double r15 = r1.doubleValue()
            r1 = 4
            r1 = r0[r1]
            java.lang.Double r1 = (java.lang.Double) r1
            double r17 = r1.doubleValue()
            java.lang.String r19 = ""
            r1 = 5
            r0 = r0[r1]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r20 = r0.intValue()
            r10 = r21
            r10.a(r11, r12, r13, r14, r15, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.mixfeed.c.refreshList(java.lang.Object[]):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(b bVar) {
        boolean z;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f42550a, false, 36792, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f42550a, false, 36792, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.handleData(bVar);
        if (bVar2 != null) {
            this.f42552c = bVar2.adInfo;
        }
        this.f42718f = bVar.getRequestId();
        if (bVar2 == null || CollectionUtils.isEmpty(bVar2.f42549d)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 1) {
                this.l = ai.a().a(bVar2.logPb);
            }
            f.f42170b.a(bVar2);
            if (this.mListQueryType == 1 && a.a(this.f42551b) > 0) {
                a aVar = new a();
                aVar.setFeedType(65462);
                bVar2.f42549d.add(0, aVar);
            }
            for (a next : bVar2.f42549d) {
                if (next.getFeedType() == 65460) {
                    String str = this.l;
                    if (PatchProxy.isSupport(new Object[]{str}, next, a.f42540a, false, 36784, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, next, a.f42540a, false, 36784, new Class[]{String.class}, Void.TYPE);
                    } else if (next.j != null) {
                        for (SearchPoi searchPoi : next.j) {
                            searchPoi.logPb = str;
                        }
                    }
                }
            }
            if (this.mListQueryType != 1) {
                Iterator<a> it2 = bVar2.f42549d.iterator();
                while (it2.hasNext()) {
                    a next2 = it2.next();
                    if (!isDataEmpty() && ((b) this.mData).f42549d.indexOf(next2) >= 0) {
                        it2.remove();
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = bVar2;
                b(bVar2.f42549d);
            } else if (i2 == 4) {
                c(bVar2.f42549d);
                ((b) this.mData).f42548c &= bVar2.f42548c;
            }
            if (((b) this.mData).f42547b != 0) {
                ((b) this.mData).f42547b = bVar2.f42547b;
            }
            ai.a().a(bVar.getRequestId(), ((b) this.mData).logPb);
            f.f42170b.b(((b) this.mData).f42549d);
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = bVar2;
            b();
            if (this.mData != null) {
                ((b) this.mData).f42548c = false;
            }
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((b) this.mData).f42548c = false;
        }
    }

    private void a(String str, int i2, int i3, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), 10, str2}, this, f42550a, false, 36789, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), 10, str2}, this, f42550a, false, 36789, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        String str3 = str;
        int i4 = i2;
        a(str3, i4, 10, 0, this.i, this.j, str2, this.k);
    }

    @SuppressLint({"TooManyMethodParam"})
    private void a(String str, int i2, int i3, int i4, double d2, double d3, String str2, int i5) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i5)}, this, f42550a, false, 36790, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i5)}, this, f42550a, false, 36790, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42551b = str3;
        this.i = d2;
        this.j = d3;
        this.k = i5;
        SearchApi.a(str, i2, i3, i4, c(), this.f42717e, d2, d3, str2, i5).a(d.f42554b).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
