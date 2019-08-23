package com.ss.android.ugc.aweme.commercialize.e;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.profile.d.j;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.presenter.l;
import org.json.JSONObject;

public final class a implements WeakHandler.IHandler, j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38676a;

    /* renamed from: b  reason: collision with root package name */
    public j f38677b;

    /* renamed from: c  reason: collision with root package name */
    public l f38678c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHandler f38679d = new WeakHandler(this);

    /* renamed from: e  reason: collision with root package name */
    private int f38680e;

    /* renamed from: f  reason: collision with root package name */
    private String f38681f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38676a, false, 31927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38676a, false, 31927, new Class[0], Void.TYPE);
            return;
        }
        if (this.f38677b != null) {
            this.f38677b.b();
        }
        this.f38680e = 0;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38676a, false, 31930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38676a, false, 31930, new Class[0], Void.TYPE);
            return;
        }
        if (this.f38677b != null) {
            this.f38677b.c();
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38676a, false, 31928, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38676a, false, 31928, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f38678c != null) {
            this.f38678c.a(str);
        }
        this.f38681f = str;
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f38676a, false, 31931, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f38676a, false, 31931, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (this.f38678c != null) {
            if (message2.obj instanceof Exception) {
                if (this.f38680e >= 4 || this.f38677b == null || (message2.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    Exception exc = (Exception) message2.obj;
                    c a2 = c.a();
                    boolean z = exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a;
                    if (z) {
                        str = ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorMsg();
                    } else {
                        str = exc.getMessage();
                    }
                    c a3 = a2.a("errorDesc", str);
                    if (z) {
                        str2 = ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode();
                    } else {
                        str2 = "-1";
                    }
                    n.a("aweme_avartar_upload_error_rate", 1, a3.a("errorCode", str2).b());
                    this.f38678c.a((Exception) message2.obj);
                    return;
                }
                this.f38680e++;
                j jVar = this.f38677b;
                int i = (this.f38680e << 1) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, jVar, j.f61424a, false, 69949, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, jVar, j.f61424a, false, 69949, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                jVar.a(i, jVar.d());
            } else if (message2.obj instanceof AvatarUri) {
                this.f38678c.a((AvatarUri) message2.obj);
                n.a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }
}
