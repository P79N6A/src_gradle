package com.ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import org.json.JSONObject;

public final class w implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61656a;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f61657b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    public k f61658c;

    /* renamed from: d  reason: collision with root package name */
    public String f61659d;

    /* renamed from: e  reason: collision with root package name */
    private int f61660e;

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{message}, this, f61656a, false, 67601, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f61656a, false, 67601, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (this.f61658c != null) {
            if (message.obj instanceof Exception) {
                if (this.f61660e >= 4 || (message.obj instanceof a)) {
                    Exception exc = (Exception) message.obj;
                    c a2 = c.a();
                    boolean z = exc instanceof a;
                    if (z) {
                        str = ((a) exc).getErrorMsg();
                    } else {
                        str = exc.getMessage();
                    }
                    c a3 = a2.a("errorDesc", str);
                    if (z) {
                        str2 = ((a) exc).getErrorCode();
                    } else {
                        str2 = "-1";
                    }
                    n.a("aweme_avartar_upload_error_rate", 1, a3.a("errorCode", str2).b());
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) (Exception) message.obj);
                    this.f61658c.a((Exception) message.obj);
                    return;
                }
                this.f61660e++;
                a((this.f61660e << 1) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.f61659d);
            } else if (message.obj instanceof AvatarUri) {
                this.f61658c.a((AvatarUri) message.obj);
                n.a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    public void a(int i, String str) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f61656a, false, 67600, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f61656a, false, 67600, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61661a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f61661a, false, 67602, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61661a, false, 67602, new Class[0], Void.TYPE);
                    return;
                }
                d.a().uploadCover(w.this.f61657b, "https://aweme.snssdk.com/aweme/v1/upload/image/?uid=" + d.a().getCurUserId(), 4194304, str2);
            }
        }, i);
    }
}
