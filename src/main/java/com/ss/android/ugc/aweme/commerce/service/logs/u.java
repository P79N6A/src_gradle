package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/CloseTransformCardEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "authorId", "", "cardType", "commodityId", "commodityType", "", "Ljava/lang/Long;", "groupId", "buildParams", "", "(Ljava/lang/Long;)Lcom/ss/android/ugc/aweme/commerce/service/logs/CloseTransformCardEvent;", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class u extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38157a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38158f = new a((byte) 0);
    private String g;
    private String h;
    private String i;
    private String j;
    private Long k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/CloseTransformCardEvent$Companion;", "", "()V", "EVENT", "", "KEY_AUTHOR_ID", "KEY_CARD_TYPE", "KEY_COMMODITY_ID", "KEY_COMMODITY_TYPE", "KEY_GROUP_ID", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public u() {
        super("close_card");
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38157a, false, 29720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38157a, false, 29720, new Class[0], Void.TYPE);
            return;
        }
        a("group_id", this.h, b.C0500b.a.a());
        a("author_id", this.i, b.C0500b.a.a());
        a("commodity_id", this.j, b.C0500b.a.a());
        Long l = this.k;
        if (l != null) {
            str = String.valueOf(l.longValue());
        } else {
            str = null;
        }
        a("commodity_type", str, b.C0500b.a.a());
        a("card_type", this.g, b.C0500b.a.a());
    }

    @NotNull
    public final u a(@Nullable Long l) {
        this.k = l;
        return this;
    }

    @NotNull
    public final u b(@Nullable String str) {
        this.h = str;
        return this;
    }

    @NotNull
    public final u c(@Nullable String str) {
        this.i = str;
        return this;
    }

    @NotNull
    public final u d(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NotNull
    public final u a(@Nullable String str) {
        this.j = str;
        return this;
    }
}
