package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/session/LinkProfitSession;", "Lcom/ss/android/ugc/aweme/notification/session/NoticeBaseSession;", "()V", "createAction", "Lcom/ss/android/ugc/aweme/im/service/session/IAction;", "getNotificationType", "", "getOfficialType", "getSessionID", "", "getType", "init", "", "markRead", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58037a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f58038b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/session/LinkProfitSession$Companion;", "", "()V", "LINK_PROFIT_SESSION_ID", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "session", "Lcom/ss/android/ugc/aweme/im/service/session/BaseSession;", "actionType", "", "doAction"}, k = 3, mv = {1, 1, 15})
    static final class b implements IAction {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f58040b;

        b(e eVar) {
            this.f58040b = eVar;
        }

        public final void a(Context context, com.ss.android.ugc.aweme.im.service.session.a aVar, int i) {
            Context context2 = context;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58039a, false, 63196, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58039a, false, 63196, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE);
            } else if (i2 == 1 || i2 == 2) {
                this.f58040b.f();
                NotificationDetailActivity.a(context, 19, this.f58040b.m);
            } else {
                if (i2 == 0) {
                    com.ss.android.ugc.aweme.common.ui.a aVar2 = new com.ss.android.ugc.aweme.common.ui.a(context);
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    aVar2.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58041a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ b f58042b;

                        {
                            this.f58042b = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58041a, false, 63197, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58041a, false, 63197, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            dialogInterface.dismiss();
                            if (i == 0) {
                                this.f58042b.f58040b.k();
                            }
                        }
                    });
                    aVar2.b();
                }
            }
        }
    }

    @NotNull
    public final String O_() {
        return "link_profit_session";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 21;
    }

    public final int i() {
        return 31;
    }

    @NotNull
    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58037a, false, 63194, new Class[0], IAction.class)) {
            return new b(this);
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58037a, false, 63194, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58037a, false, 63193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58037a, false, 63193, new Class[0], Void.TYPE);
            return;
        }
        this.j = GlobalContext.getContext().getString(C0906R.string.axv);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840500);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58037a, false, 63195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58037a, false, 63195, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new c(i(), -1));
    }
}
