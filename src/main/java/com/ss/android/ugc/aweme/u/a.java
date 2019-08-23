package com.ss.android.ugc.aweme.u;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.u.a;
import com.ss.android.ugc.aweme.u.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0015\u0010\u0006\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0015J\u0013\u0010\n\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0010\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0017\u001a\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/metrics/AbsDetailEnterEvent;", "E", "Lcom/ss/android/ugc/aweme/metrics/CommonMetricsEvent;", "event", "", "(Ljava/lang/String;)V", "enterMethod", "getEnterMethod", "()Ljava/lang/String;", "setEnterMethod", "inSearchPage", "", "getInSearchPage", "()Z", "setInSearchPage", "(Z)V", "searchKeyWord", "getSearchKeyWord", "setSearchKeyWord", "buildCommonParams", "", "(Ljava/lang/String;)Lcom/ss/android/ugc/aweme/metrics/AbsDetailEnterEvent;", "(Z)Lcom/ss/android/ugc/aweme/metrics/AbsDetailEnterEvent;", "withFeedParam", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Lcom/ss/android/ugc/aweme/metrics/AbsDetailEnterEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a<E extends a<E>> extends k<E> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75000a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f75001b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f75002c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f75003d;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75000a, false, 58821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75000a, false, 58821, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        String str = this.f75003d;
        if (TextUtils.equals("general_search", this.g) && !this.f75002c && com.ss.android.g.a.a()) {
            str = "click_search_result_video";
        }
        a("search_keyword", this.f75001b, d.a.f75112a);
        a("enter_method", str, d.a.f75112a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "event");
    }

    @NotNull
    public final E a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75000a, false, 58818, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f75000a, false, 58818, new Class[]{String.class}, a.class);
        }
        this.f75003d = str;
        return this;
    }

    @NotNull
    public final E a(@Nullable Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, this, f75000a, false, 58820, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context}, this, f75000a, false, 58820, new Class[]{Context.class}, a.class);
        } else if (context == null) {
            return this;
        } else {
            b a2 = FeedParamProvider.f45761c.a(context);
            if (a2 != null) {
                str = a2.getSearchKeyword();
            } else {
                str = null;
            }
            this.f75001b = str;
            return this;
        }
    }

    @NotNull
    public final E a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f75000a, false, 58817, new Class[]{Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f75000a, false, 58817, new Class[]{Boolean.TYPE}, a.class);
        }
        this.f75002c = true;
        return this;
    }
}
