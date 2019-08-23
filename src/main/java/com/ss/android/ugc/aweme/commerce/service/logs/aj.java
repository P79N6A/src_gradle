package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0012J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ProductEntranceClickEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "carrierType", "commodityId", "commodityType", "", "Ljava/lang/Long;", "destination", "enterFrom", "groupId", "isSelf", "roomId", "buildParams", "", "(Ljava/lang/Long;)Lcom/ss/android/ugc/aweme/commerce/service/logs/ProductEntranceClickEvent;", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class aj extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38071a = null;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38072f = new a((byte) 0);
    private static final String p = p;
    private static final String q = q;
    private static final String r = r;
    private static final String s = s;
    private static final String t = t;
    private static final String u = u;
    private static final String v = v;
    private static final String w = w;
    private static final String x = x;
    private String g;
    private String h;
    private String i;
    private String j;
    private Long k;
    private String l;
    private String m;
    private String n;
    private String o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ProductEntranceClickEvent$Companion;", "", "()V", "EVENT", "", "IS_SELF", "KEY_AUTHOR_ID", "KEY_CARRIER_TYPE", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_DESTINATION", "KEY_GROUP_ID", "KEY_ROOM_ID", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public aj() {
        super(p);
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38071a, false, 29743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38071a, false, 29743, new Class[0], Void.TYPE);
            return;
        }
        a(q, this.g, b.C0500b.a.a());
        a("enter_from", this.m, b.C0500b.a.a());
        a(v, this.h, b.C0500b.a.a());
        a(r, this.i, b.C0500b.a.a());
        a(s, this.j, b.C0500b.a.a());
        String str2 = u;
        Long l2 = this.k;
        if (l2 != null) {
            str = String.valueOf(l2.longValue());
        } else {
            str = null;
        }
        a(str2, str, b.C0500b.a.a());
        a(t, this.l, b.C0500b.a.a());
        a(w, this.n, b.C0500b.a.a());
        a(x, this.o, b.C0500b.a.a());
    }

    @NotNull
    public final aj a(@Nullable Long l2) {
        this.k = l2;
        return this;
    }

    @NotNull
    public final aj b(@Nullable String str) {
        this.l = str;
        return this;
    }

    @NotNull
    public final aj c(@Nullable String str) {
        this.j = str;
        return this;
    }

    @NotNull
    public final aj d(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NotNull
    public final aj e(@Nullable String str) {
        this.m = str;
        return this;
    }

    @NotNull
    public final aj f(@Nullable String str) {
        this.h = str;
        return this;
    }

    @NotNull
    public final aj b(boolean z) {
        String str;
        if (z) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        this.o = str;
        return this;
    }

    @NotNull
    public final aj a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38071a, false, 29744, new Class[]{String.class}, aj.class)) {
            return (aj) PatchProxy.accessDispatch(new Object[]{str}, this, f38071a, false, 29744, new Class[]{String.class}, aj.class);
        }
        Intrinsics.checkParameterIsNotNull(str, w);
        this.n = str;
        return this;
    }
}
