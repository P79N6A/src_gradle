package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickCommerceLinkEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "activityUrl", "", "authorId", "commodityId", "commodityType", "", "Ljava/lang/Long;", "buildParams", "", "(Ljava/lang/Long;)Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickCommerceLinkEvent;", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38135a;
    public static final a j = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public String f38136f;
    public Long g;
    public String h;
    public String i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickCommerceLinkEvent$Companion;", "", "()V", "EVENT", "", "KEY_ACTIVITY_URL", "KEY_AUTHOR_ID", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_DATA_TYPE", "VALUE_DATA_TYPE", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public j() {
        super("click_commerce_link");
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38135a, false, 29704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38135a, false, 29704, new Class[0], Void.TYPE);
            return;
        }
        a("commodity_id", this.f38136f, b.C0500b.a.a());
        Long l = this.g;
        if (l != null) {
            str = String.valueOf(l.longValue());
        } else {
            str = null;
        }
        a("commodity_type", str, b.C0500b.a.a());
        a("author_id", this.h, b.C0500b.a.a());
        a("activity_url", this.i, b.C0500b.a.a());
        a("data_type", "commerce_data", b.C0500b.a.a());
    }
}
