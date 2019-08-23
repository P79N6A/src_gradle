package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0013J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/EnterProductDetailEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "carrierType", "commodityId", "commodityType", "", "Ljava/lang/Long;", "enterMethod", "groupId", "isSelf", "orderType", "roomId", "sourcePage", "buildParams", "", "(Ljava/lang/Long;)Lcom/ss/android/ugc/aweme/commerce/service/logs/EnterProductDetailEvent;", "", "post", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ab extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38057a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38058f = new a((byte) 0);
    private String g;
    private String h;
    private String i;
    private Long j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/EnterProductDetailEvent$Companion;", "", "()V", "EVENT", "", "IS_SELF", "KEY_AUTHOR_ID", "KEY_CARRIER_TYPE", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_ENTER_METHOD", "KEY_GROUP_ID", "KEY_ORDER_TYPE", "KEY_ROOM_ID", "KEY_SOURCE_PAGE", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ab() {
        super("enter_product_detail");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r1 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f38057a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 29734(0x7426, float:4.1666E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f38057a
            r5 = 0
            r6 = 29734(0x7426, float:4.1666E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            super.b()
            com.ss.android.ugc.aweme.commerce.service.logs.az r0 = new com.ss.android.ugc.aweme.commerce.service.logs.az
            r0.<init>()
            java.lang.String r1 = r9.h
            r0.f38105c = r1
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r2 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.framework.services.IUserService r1 = (com.ss.android.ugc.aweme.framework.services.IUserService) r1
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = r1.getCurrentUserID()
            if (r1 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r1 = ""
        L_0x0045:
            r0.f38106d = r1
            java.lang.String r1 = r9.g
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "0"
            goto L_0x0056
        L_0x0054:
            java.lang.String r1 = r9.g
        L_0x0056:
            r0.f38107e = r1
            java.lang.String r1 = r9.i
            r0.f38108f = r1
            java.lang.String r1 = r9.k
            r0.g = r1
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.logs.ab.b():void");
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38057a, false, 29733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38057a, false, 29733, new Class[0], Void.TYPE);
            return;
        }
        a("group_id", this.g, b.C0500b.a.a());
        a("enter_method", this.l, b.C0500b.a.a());
        a("author_id", this.h, b.C0500b.a.a());
        a("commodity_id", this.i, b.C0500b.a.a());
        Long l2 = this.j;
        if (l2 != null) {
            str = String.valueOf(l2.longValue());
        } else {
            str = null;
        }
        a("commodity_type", str, b.C0500b.a.a());
        a("carrier_type", this.k, b.C0500b.a.a());
        a("source_page", this.m, b.C0500b.a.a());
        a("order_type", this.p, b.C0500b.a.a());
        a("is_self", this.n, b.C0500b.a.a());
        a("room_id", this.o, b.C0500b.a.a());
    }

    @NotNull
    public final ab a(@Nullable Long l2) {
        this.j = l2;
        return this;
    }

    @NotNull
    public final ab b(@Nullable String str) {
        this.i = str;
        return this;
    }

    @NotNull
    public final ab c(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NotNull
    public final ab d(@Nullable String str) {
        this.l = str;
        return this;
    }

    @NotNull
    public final ab e(@Nullable String str) {
        this.m = str;
        return this;
    }

    @NotNull
    public final ab f(@Nullable String str) {
        this.h = str;
        return this;
    }

    @NotNull
    public final ab g(@Nullable String str) {
        this.p = str;
        return this;
    }

    @NotNull
    public final ab a(@Nullable String str) {
        this.k = str;
        return this;
    }

    @NotNull
    public final ab b(boolean z) {
        String str;
        if (z) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        this.n = str;
        return this;
    }
}
