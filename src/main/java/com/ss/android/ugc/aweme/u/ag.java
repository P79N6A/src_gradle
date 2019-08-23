package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0013J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/metrics/RecommendUserEvent;", "Lcom/ss/android/ugc/aweme/metrics/CommonMetricsEvent;", "event", "", "(Ljava/lang/String;)V", "cardType", "getEvent", "()Ljava/lang/String;", "eventType", "imprOrder", "", "pageStatus", "recReason", "recUid", "reqId", "sceneId", "buildParams", "", "enterFrom", "(Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/metrics/RecommendUserEvent;", "uid", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ag extends k<ag> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75025a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f75026b;

    /* renamed from: c  reason: collision with root package name */
    private String f75027c;

    /* renamed from: d  reason: collision with root package name */
    private String f75028d;
    private String s;
    private int t;
    private String u;
    private String v;
    private String w;
    private String x;

    public ag() {
        this(null, 1);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75025a, false, 58937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75025a, false, 58937, new Class[0], Void.TYPE);
            return;
        }
        a("rec_uid", this.f75027c, d.a.f75112a);
        a("enter_from", this.g, d.a.f75112a);
        a("event_type", this.f75028d, d.a.f75112a);
        a("req_id", this.s, d.a.f75112a);
        a("impr_order", String.valueOf(this.t), d.a.f75112a);
        a("rec_reason", this.u, d.a.f75112a);
        a("page_status", this.w, d.a.f75112a);
        a("scene_id", this.x, d.a.f75112a);
    }

    @NotNull
    public final ag b(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NotNull
    public final ag g(@Nullable String str) {
        this.v = str;
        return this;
    }

    @NotNull
    public final ag h(@Nullable String str) {
        this.w = str;
        return this;
    }

    @NotNull
    public final ag i(@Nullable String str) {
        this.x = str;
        return this;
    }

    @NotNull
    public final ag a(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.f75027c = str;
        return this;
    }

    @NotNull
    public final ag c(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.f75028d = str;
        return this;
    }

    @NotNull
    public final ag e(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.s = str;
        return this;
    }

    @NotNull
    public final ag f(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.u = str;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ag(@NotNull String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "event");
        this.f75026b = str;
        this.f75027c = "";
        this.f75028d = "";
        this.s = "";
        this.u = "";
        this.v = "";
        this.w = "";
        this.x = "";
        this.o = true;
    }

    @NotNull
    public final ag a(@Nullable Integer num) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{num}, this, f75025a, false, 58936, new Class[]{Integer.class}, ag.class)) {
            return (ag) PatchProxy.accessDispatch(new Object[]{num}, this, f75025a, false, 58936, new Class[]{Integer.class}, ag.class);
        }
        if (num != null) {
            i = num.intValue();
        }
        this.t = i;
        return this;
    }

    public /* synthetic */ ag(String str, int i) {
        this("follow_card");
    }
}
