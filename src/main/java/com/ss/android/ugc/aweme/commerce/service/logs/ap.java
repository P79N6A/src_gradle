package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ShowCommentCardEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "buildParams", "", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ap extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38083a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38084f = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ShowCommentCardEvent$Companion;", "", "()V", "EVENT", "", "KEY_ENTER_FORM", "VALUE_ENTER_FORM", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ap() {
        super("show_comment_card");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38083a, false, 29757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38083a, false, 29757, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", "full_screen_card", b.C0500b.a.a());
    }
}
