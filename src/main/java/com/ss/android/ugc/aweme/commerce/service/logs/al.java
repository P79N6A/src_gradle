package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0017J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ProductShowEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "carrierType", "commodityId", "commodityType", "", "Ljava/lang/Integer;", "enterFrom", "enterMethod", "groupId", "isSelf", "orderType", "productLabel", "roomId", "sceneId", "sourcePage", "withCoupon", "withLink", "buildParams", "", "(Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/commerce/service/logs/ProductShowEvent;", "", "(Ljava/lang/Boolean;)Lcom/ss/android/ugc/aweme/commerce/service/logs/ProductShowEvent;", "elasticType", "withCp", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class al extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38075a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38076f = new a((byte) 0);
    private String g;
    private String h;
    private String i;
    private Integer j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p = PushConstants.PUSH_TYPE_NOTIFY;
    private String q = PushConstants.PUSH_TYPE_NOTIFY;
    private String r = "normal";
    private String s;
    private String t;
    private String u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ProductShowEvent$Companion;", "", "()V", "EVENT", "", "IS_SELF", "KEY_AUTHOR_ID", "KEY_CARRIER_TYPE", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_ENTER_FROM", "KEY_ENTER_METHOD", "KEY_GROUP_ID", "KEY_ORDER_TYPE", "KEY_PRODUCT_LABEL", "KEY_ROOM_ID", "KEY_SCENE_ID", "KEY_SOURCE_PAGE", "KEY_WITH_COUPON", "KEY_WITH_LINK", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public al() {
        super("show_product");
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38075a, false, 29746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38075a, false, 29746, new Class[0], Void.TYPE);
            return;
        }
        a("group_id", this.g, b.C0500b.a.a());
        a("enter_method", this.l, b.C0500b.a.a());
        a("author_id", this.h, b.C0500b.a.a());
        a("commodity_id", this.i, b.C0500b.a.a());
        Integer num = this.j;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        a("commodity_type", str, b.C0500b.a.a());
        a("carrier_type", this.k, b.C0500b.a.a());
        a("scene_id", this.o, b.C0500b.a.a());
        a("product_label", this.r, b.C0500b.a.a());
        a("source_page", this.s, b.C0500b.a.a());
        a("with_coupon", this.p, b.C0500b.a.a());
        a("with_link", this.q, b.C0500b.a.a());
        a("enter_from", this.m, b.C0500b.a.a());
        a("room_id", this.n, b.C0500b.a.a());
        a("order_type", this.t, b.C0500b.a.a());
        a("is_self", this.u, b.C0500b.a.a());
    }

    @NotNull
    public final al a(@Nullable Integer num) {
        this.j = num;
        return this;
    }

    @NotNull
    public final al b(@Nullable String str) {
        this.k = str;
        return this;
    }

    @NotNull
    public final al c(@Nullable String str) {
        this.i = str;
        return this;
    }

    @NotNull
    public final al d(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NotNull
    public final al e(@Nullable String str) {
        this.l = str;
        return this;
    }

    @NotNull
    public final al f(@Nullable String str) {
        this.h = str;
        return this;
    }

    @NotNull
    public final al g(@Nullable String str) {
        this.m = str;
        return this;
    }

    @NotNull
    public final al h(@Nullable String str) {
        this.n = str;
        return this;
    }

    @NotNull
    public final al i(@Nullable String str) {
        this.t = str;
        return this;
    }

    @NotNull
    public final al a(@Nullable String str) {
        this.s = str;
        return this;
    }

    @NotNull
    public final al a(@Nullable Boolean bool) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bool}, this, f38075a, false, 29747, new Class[]{Boolean.class}, al.class)) {
            return (al) PatchProxy.accessDispatch(new Object[]{bool}, this, f38075a, false, 29747, new Class[]{Boolean.class}, al.class);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            this.u = str;
        }
        return this;
    }

    @NotNull
    public final al b(@Nullable Boolean bool) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bool}, this, f38075a, false, 29749, new Class[]{Boolean.class}, al.class)) {
            return (al) PatchProxy.accessDispatch(new Object[]{bool}, this, f38075a, false, 29749, new Class[]{Boolean.class}, al.class);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            this.p = str;
        }
        return this;
    }

    @NotNull
    public final al c(@Nullable Boolean bool) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bool}, this, f38075a, false, 29750, new Class[]{Boolean.class}, al.class)) {
            return (al) PatchProxy.accessDispatch(new Object[]{bool}, this, f38075a, false, 29750, new Class[]{Boolean.class}, al.class);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            this.q = str;
        }
        return this;
    }

    @NotNull
    public final al b(@Nullable Integer num) {
        String str;
        if (PatchProxy.isSupport(new Object[]{num}, this, f38075a, false, 29748, new Class[]{Integer.class}, al.class)) {
            return (al) PatchProxy.accessDispatch(new Object[]{num}, this, f38075a, false, 29748, new Class[]{Integer.class}, al.class);
        }
        if (num != null) {
            if (num.intValue() == 3) {
                str = "recommend";
            } else if (num.intValue() == 1 || num.intValue() != 2) {
                str = "normal";
            } else {
                str = "new";
            }
            this.r = str;
        }
        return this;
    }
}
