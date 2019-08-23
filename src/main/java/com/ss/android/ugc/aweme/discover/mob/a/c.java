package com.ss.android.ugc.aweme.discover.mob.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.u.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/recommend/TrendingWordsShowEvent;", "Lcom/ss/android/ugc/aweme/metrics/BaseMetricsEvent;", "event", "", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "groupId", "word", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "wordContent", "wordPosition", "", "Ljava/lang/Integer;", "wordSource", "buildParams", "", "(Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/discover/mob/recommend/TrendingWordsShowEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class c extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42651a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f42652b;

    /* renamed from: c  reason: collision with root package name */
    private String f42653c;

    /* renamed from: d  reason: collision with root package name */
    private String f42654d;
    private String p;
    private Integer q;
    private Word r;

    public c() {
        this(null, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r1 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r1 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f42651a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 36996(0x9084, float:5.1842E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f42651a
            r5 = 0
            r6 = 36996(0x9084, float:5.1842E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r9.r
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = r1.getId()
            if (r1 != 0) goto L_0x0033
        L_0x0031:
            java.lang.String r1 = r9.f42653c
        L_0x0033:
            com.ss.android.ugc.aweme.u.d$a r2 = com.ss.android.ugc.aweme.u.d.a.f75112a
            r9.a(r0, r1, r2)
            java.lang.String r0 = "words_content"
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r9.r
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = r1.getWord()
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            java.lang.String r1 = r9.f42654d
        L_0x0046:
            com.ss.android.ugc.aweme.u.d$a r2 = com.ss.android.ugc.aweme.u.d.a.f75112a
            r9.a(r0, r1, r2)
            java.lang.String r0 = "words_source"
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r9.r
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = r1.getWordSource()
            if (r1 != 0) goto L_0x0059
        L_0x0057:
            java.lang.String r1 = r9.p
        L_0x0059:
            com.ss.android.ugc.aweme.u.d$a r2 = com.ss.android.ugc.aweme.u.d.a.f75112a
            r9.a(r0, r1, r2)
            java.lang.String r0 = "words_position"
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r9.r
            if (r1 == 0) goto L_0x006e
            int r1 = r1.getWordPosition()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r1 != 0) goto L_0x007c
        L_0x006e:
            java.lang.Integer r1 = r9.q
            if (r1 == 0) goto L_0x007b
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            com.ss.android.ugc.aweme.u.d$a r2 = com.ss.android.ugc.aweme.u.d.a.f75112a
            r9.a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.mob.a.c.a():void");
    }

    @NotNull
    public final c a(@Nullable Word word) {
        this.r = word;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "event");
        this.f42652b = str;
        this.q = 0;
    }

    public /* synthetic */ c(String str, int i) {
        this("trending_words_show");
    }
}
