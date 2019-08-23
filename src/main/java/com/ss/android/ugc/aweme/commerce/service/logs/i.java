package com.ss.android.ugc.aweme.commerce.service.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickCommentCardEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "()V", "mClickType", "", "buildParams", "", "clickType", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38133a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f38134f = new a((byte) 0);
    private String g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/ClickCommentCardEvent$Companion;", "", "()V", "CONTENT", "", "EVENT", "KEY_CLICK_TYPE", "KEY_ENTER_FORM", "SELECT_WORD", "VALUE_ENTER_FORM", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public i() {
        super("click_comment_card");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38133a, false, 29703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38133a, false, 29703, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", "full_screen_card", b.C0500b.a.a());
        a("click_type", this.g, b.C0500b.a.a());
    }

    @NotNull
    public final i a(@Nullable String str) {
        this.g = str;
        return this;
    }
}
