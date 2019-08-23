package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0004R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;", "", "inMixSearch", "", "(Z)V", "apiResult", "Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "getApiResult", "()Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "setApiResult", "(Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;)V", "enterMethod", "", "getEnterMethod", "()Ljava/lang/String;", "setEnterMethod", "(Ljava/lang/String;)V", "holderPosition", "", "getHolderPosition", "()I", "setHolderPosition", "(I)V", "getInMixSearch", "()Z", "setInMixSearch", "searchId", "getSearchId", "searchKeyword", "getSearchKeyword", "searchResultParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "getSearchResultParam", "()Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "setSearchResultParam", "(Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41969a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public SearchResultParam f41970b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public SearchApiResult f41971c;

    /* renamed from: d  reason: collision with root package name */
    public int f41972d = -1;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f41973e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f41974f;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f41969a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 35694(0x8b6e, float:5.0018E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f41969a
            r5 = 0
            r6 = 35694(0x8b6e, float:5.0018E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r0 = r9.f41970b
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.getKeyword()
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.s.a():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r0 == null) goto L_0x0036;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f41969a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 35695(0x8b6f, float:5.002E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f41969a
            r5 = 0
            r6 = 35695(0x8b6f, float:5.002E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.discover.model.SearchApiResult r0 = r9.f41971c
            if (r0 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r0.logPb
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.getImprId()
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            java.lang.String r0 = ""
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.s.b():java.lang.String");
    }

    public s(boolean z) {
        this.f41974f = z;
    }
}
