package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\b\u001a\u00020\tH\u0014J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/StayStorePageEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "duration", "", "Ljava/lang/Long;", "buildParams", "", "(Ljava/lang/Long;)Lcom/ss/android/ugc/aweme/commerce/service/logs/StayStorePageEvent;", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ax extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38099a;
    public static final a h = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public String f38100f;
    public Long g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/StayStorePageEvent$Companion;", "", "()V", "EVENT", "", "KEY_AUTHOR_ID", "KEY_DURATION", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ax() {
        super("stay_store_page");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38099a, false, 29769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38099a, false, 29769, new Class[0], Void.TYPE);
            return;
        }
        a("duration", String.valueOf(this.g), b.C0500b.a.a());
        a("author_id", this.f38100f, b.C0500b.a.a());
    }
}
