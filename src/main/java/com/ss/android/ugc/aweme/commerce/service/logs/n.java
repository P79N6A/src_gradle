package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickMineProductEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "enterFrom", "", "groupId", "buildParams", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class n extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38143a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38144f = new a((byte) 0);
    private String g;
    private String h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickMineProductEvent$Companion;", "", "()V", "EVENT", "", "KEY_GROUP_ID", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public n() {
        super("click_mine_product");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38143a, false, 29708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38143a, false, 29708, new Class[0], Void.TYPE);
            return;
        }
        String str = this.g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enterFrom");
        }
        a("enter_from", str, b.C0500b.a.a());
        String str2 = this.h;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("groupId");
        }
        a("group_id", str2, b.C0500b.a.a());
    }

    @NotNull
    public final n a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38143a, false, 29709, new Class[]{String.class}, n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[]{str}, this, f38143a, false, 29709, new Class[]{String.class}, n.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        this.g = str;
        return this;
    }

    @NotNull
    public final n b(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38143a, false, 29710, new Class[]{String.class}, n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[]{str}, this, f38143a, false, 29710, new Class[]{String.class}, n.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "groupId");
        this.h = str;
        return this;
    }
}
