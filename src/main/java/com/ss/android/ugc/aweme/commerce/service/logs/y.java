package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ConsultationEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "carrierType", "getCarrierType", "setCarrierType", "commodityId", "getCommodityId", "setCommodityId", "commodityType", "", "getCommodityType", "()Ljava/lang/Long;", "setCommodityType", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "groupId", "getGroupId", "setGroupId", "buildParams", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class y extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38165a;
    public static final a k = new a((byte) 0);
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38166f;
    @Nullable
    public String g;
    @Nullable
    public String h;
    @Nullable
    public Long i;
    @Nullable
    public String j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ConsultationEvent$Companion;", "", "()V", "EVENT", "", "KEY_AUTHOR_ID", "KEY_CARRIER_TYPE", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_GROUP_ID", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public y() {
        super("click_consultation");
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38165a, false, 29725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38165a, false, 29725, new Class[0], Void.TYPE);
            return;
        }
        a("group_id", this.f38166f, b.C0500b.a.a());
        a("author_id", this.g, b.C0500b.a.a());
        a("commodity_id", this.h, b.C0500b.a.a());
        Long l = this.i;
        if (l != null) {
            str = String.valueOf(l.longValue());
        } else {
            str = null;
        }
        a("commodity_type", str, b.C0500b.a.a());
        a("carrier_type", this.j, b.C0500b.a.a());
    }
}
