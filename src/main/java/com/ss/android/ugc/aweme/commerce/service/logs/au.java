package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\rH\u0014J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0015\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ShowProductVideoEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "commodityId", "commodityType", "", "Ljava/lang/Long;", "enterFrom", "groupId", "productLabel", "buildParams", "", "(Ljava/lang/Long;)Lcom/ss/android/ugc/aweme/commerce/service/logs/ShowProductVideoEvent;", "elasticType", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class au extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38093a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38094f = new a((byte) 0);
    private String g;
    private String h;
    private Long i;
    private String j;
    private String k;
    private String l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ShowProductVideoEvent$Companion;", "", "()V", "EVENT", "", "KEY_AUTHOR_ID", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_ENTER_FROM", "KEY_GROUP_ID", "KEY_PRODUCT_LABEL", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public au() {
        super("show_product_video");
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38093a, false, 29763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38093a, false, 29763, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.g, b.C0500b.a.a());
        a("group_id", this.h, b.C0500b.a.a());
        a("commodity_id", this.j, b.C0500b.a.a());
        Long l2 = this.i;
        if (l2 != null) {
            str = String.valueOf(l2.longValue());
        } else {
            str = null;
        }
        a("commodity_type", str, b.C0500b.a.a());
        a("author_id", this.k, b.C0500b.a.a());
        a("product_label", this.l, b.C0500b.a.a());
    }

    @NotNull
    public final au a(@Nullable Long l2) {
        this.i = l2;
        return this;
    }

    @NotNull
    public final au b(@Nullable String str) {
        this.h = str;
        return this;
    }

    @NotNull
    public final au a(int i2) {
        String str;
        switch (i2) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "new";
                break;
            case 3:
                str = "recommend";
                break;
            default:
                str = "normal";
                break;
        }
        this.l = str;
        return this;
    }

    @NotNull
    public final au a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38093a, false, 29764, new Class[]{String.class}, au.class)) {
            return (au) PatchProxy.accessDispatch(new Object[]{str}, this, f38093a, false, 29764, new Class[]{String.class}, au.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        this.g = str;
        return this;
    }

    @NotNull
    public final au c(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38093a, false, 29765, new Class[]{String.class}, au.class)) {
            return (au) PatchProxy.accessDispatch(new Object[]{str}, this, f38093a, false, 29765, new Class[]{String.class}, au.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "commodityId");
        this.j = str;
        return this;
    }

    @NotNull
    public final au d(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38093a, false, 29766, new Class[]{String.class}, au.class)) {
            return (au) PatchProxy.accessDispatch(new Object[]{str}, this, f38093a, false, 29766, new Class[]{String.class}, au.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "authorId");
        this.k = str;
        return this;
    }
}
