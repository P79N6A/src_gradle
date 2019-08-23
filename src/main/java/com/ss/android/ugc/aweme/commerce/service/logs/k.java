package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickDrawCouponEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "carrierType", "clickType", "commodityId", "commodityType", "", "groupId", "buildParams", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class k extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38137a;
    public static final a g = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public String f38138f;
    private String h;
    private String i;
    private String j;
    private long k;
    private String l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickDrawCouponEvent$Companion;", "", "()V", "EVENT", "", "KEY_AUTHOR_ID", "KEY_CARRIER_TYPE", "KEY_CLICK_TYPE", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_GROUP_ID", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public k() {
        super("click_draw_coupon");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38137a, false, 29705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38137a, false, 29705, new Class[0], Void.TYPE);
            return;
        }
        a("group_id", this.h, b.C0500b.a.a());
        a("commodity_id", this.i, b.C0500b.a.a());
        a("author_id", this.j, b.C0500b.a.a());
        a("carrier_type", this.l, b.C0500b.a.a());
        a("commodity_type", String.valueOf(this.k), b.C0500b.a.a());
        a("click_type", this.f38138f, b.C0500b.a.a());
    }

    @NotNull
    public final k a(long j2) {
        this.k = j2;
        return this;
    }

    @NotNull
    public final k b(@Nullable String str) {
        this.i = str;
        return this;
    }

    @NotNull
    public final k c(@Nullable String str) {
        this.j = str;
        return this;
    }

    @NotNull
    public final k d(@Nullable String str) {
        this.l = str;
        return this;
    }

    @NotNull
    public final k a(@Nullable String str) {
        this.h = str;
        return this;
    }
}
