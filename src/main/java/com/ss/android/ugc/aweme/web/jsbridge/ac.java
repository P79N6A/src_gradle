package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class ac implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76677a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f76678b;

    public ac(WeakReference<Context> weakReference) {
        this.f76678b = weakReference;
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f76677a, false, 90020, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f76677a, false, 90020, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, MainActivity.class);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        context2.startActivity(intent);
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        final Context context;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76677a, false, 90018, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76677a, false, 90018, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (this.f76678b != null) {
            context = (Context) this.f76678b.get();
        } else {
            context = null;
        }
        if (context != null) {
            e.a().a((Handler) new Handler(Looper.getMainLooper()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76679a;

                public final void handleMessage(Message message) {
                    if (PatchProxy.isSupport(new Object[]{message}, this, f76679a, false, 90021, new Class[]{Message.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{message}, this, f76679a, false, 90021, new Class[]{Message.class}, Void.TYPE);
                        return;
                    }
                    super.handleMessage(message);
                    if (message.what == 0) {
                        if (message.obj instanceof User) {
                            com.ss.android.ugc.aweme.account.d.a().setCurUser((User) message.obj);
                        } else if (message.obj instanceof UserResponse) {
                            com.ss.android.ugc.aweme.account.d.a().setCurUser(((UserResponse) message.obj).getUser());
                        }
                        ac.this.a(context);
                    }
                }
            });
        }
    }
}
