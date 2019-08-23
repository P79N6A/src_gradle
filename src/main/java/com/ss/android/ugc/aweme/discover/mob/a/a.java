package com.ss.android.ugc.aweme.discover.mob.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0014J\u0015\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/recommend/TrendingShowEvent;", "Lcom/ss/android/ugc/aweme/metrics/BaseMetricsEvent;", "()V", "wordNumber", "", "Ljava/lang/Integer;", "wordSource", "", "buildParams", "", "(Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/discover/mob/recommend/TrendingShowEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42648a;

    /* renamed from: b  reason: collision with root package name */
    private String f42649b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f42650c = 0;

    public a() {
        super("trending_show");
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f42648a, false, 36995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42648a, false, 36995, new Class[0], Void.TYPE);
            return;
        }
        a("words_source", this.f42649b, d.a.f75112a);
        Integer num = this.f42650c;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        a("words_num", str, d.a.f75112a);
    }

    @NotNull
    public final a a(@Nullable Integer num) {
        this.f42650c = num;
        return this;
    }

    @NotNull
    public final a a(@Nullable String str) {
        this.f42649b = str;
        return this;
    }
}
