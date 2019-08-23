package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickPresaleBtnEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "clickType", "getClickType", "setClickType", "commodityId", "getCommodityId", "setCommodityId", "commodityType", "getCommodityType", "setCommodityType", "enterFrom", "getEnterFrom", "setEnterFrom", "buildParams", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class o extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38145a;
    public static final a k = new a((byte) 0);
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38146f;
    @Nullable
    public String g;
    @Nullable
    public String h;
    @Nullable
    public String i;
    @Nullable
    public String j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickPresaleBtnEvent$Companion;", "", "()V", "AUTHOR_ID", "", "CANCEL_PRESALE", "CLICK_TYPE", "COMMODITY_ID", "COMMODITY_TYPE", "ENTER_FROM", "EVENT", "PRESALE", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public o() {
        super("click_presale_button");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38145a, false, 29711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38145a, false, 29711, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.f38146f, b.C0500b.a.a());
        a("click_type", this.g, b.C0500b.a.a());
        a("commodity_type", this.h, b.C0500b.a.a());
        a("commodity_id", this.i, b.C0500b.a.a());
        a("author_id", this.j, b.C0500b.a.a());
    }
}
