package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickECommerceStoreSortEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "enterFrom", "", "getEnterFrom", "()Ljava/lang/String;", "setEnterFrom", "(Ljava/lang/String;)V", "orderType", "getOrderType", "setOrderType", "buildParams", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class l extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38139a;
    public static final a h = new a((byte) 0);
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38140f;
    @Nullable
    public String g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickECommerceStoreSortEvent$Companion;", "", "()V", "ENTER_FROM", "", "EVENT", "KEY_DATA_TYPE", "KEY_ORDER_TYPE", "VALUE_DATA_TYPE", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public l() {
        super("click_ecommerce_store_sort");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38139a, false, 29706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38139a, false, 29706, new Class[0], Void.TYPE);
            return;
        }
        a("order_type", this.f38140f, b.C0500b.a.a());
        a("data_type", "commerce_data", b.C0500b.a.a());
        a("enter_from", this.g, b.C0500b.a.a());
    }
}
