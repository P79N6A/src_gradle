package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/BillShareShootEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "carrierType", "", "getCarrierType", "()Ljava/lang/String;", "setCarrierType", "(Ljava/lang/String;)V", "creationId", "getCreationId", "setCreationId", "shootWay", "getShootWay", "setShootWay", "buildParams", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38121a;
    public static final a i = new a((byte) 0);
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38122f;
    @Nullable
    public String g;
    @Nullable
    public String h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/BillShareShootEvent$Companion;", "", "()V", "EVENT", "", "KEY_CREATION_ID", "KEY_SHOOT_WAY", "KEY_SOURCE_PAGE", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c() {
        super("shoot");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38121a, false, 29697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38121a, false, 29697, new Class[0], Void.TYPE);
            return;
        }
        a("shoot_way", this.f38122f, b.C0500b.a.a());
        a("creation_id", this.g, b.C0500b.a.a());
        a("source_page", this.h, b.C0500b.a.a());
    }
}
