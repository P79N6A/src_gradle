package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.live.b;
import com.ss.android.ugc.aweme.story.live.c;
import java.util.Map;

public final class ae implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33740a;

    /* renamed from: b  reason: collision with root package name */
    private String f33741b;

    /* renamed from: c  reason: collision with root package name */
    private String f33742c;

    /* renamed from: d  reason: collision with root package name */
    private String f33743d;

    /* renamed from: e  reason: collision with root package name */
    private long f33744e;

    /* renamed from: f  reason: collision with root package name */
    private Context f33745f;
    private Handler g;

    public ae(Context context) {
        this.f33745f = context;
        if (PatchProxy.isSupport(new Object[0], this, f33740a, false, 22529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33740a, false, 22529, new Class[0], Void.TYPE);
            return;
        }
        this.g = new Handler(Looper.getMainLooper(), this);
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f33740a, false, 22531, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message2}, this, f33740a, false, 22531, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        }
        Object obj = message2.obj;
        int i = message2.what;
        if (obj instanceof a) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), ((a) obj).getErrorMsg()).a();
            return true;
        } else if (obj instanceof Exception) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.bgg).a();
            return true;
        } else {
            if (i == 0 && (obj instanceof User)) {
                User user = (User) message2.obj;
                if (!user.isLive()) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.b6l).a();
                    return true;
                }
                if (PatchProxy.isSupport(new Object[]{user}, this, f33740a, false, 22532, new Class[]{User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user}, this, f33740a, false, 22532, new Class[]{User.class}, Void.TYPE);
                } else {
                    String uid = user.getUid();
                    if (!TextUtils.equals(this.f33743d, f.f34167a) && !TextUtils.isEmpty("jsbridge")) {
                        b.a(GlobalContext.getContext(), 1, user.getRequestId(), user.getUid(), user.roomId);
                    }
                    if (!TextUtils.isEmpty(this.f33742c)) {
                        r.a("live_play", (Map) d.a().a("enter_from", this.f33742c).a("anchor_id", uid).f34114b);
                    }
                }
                c.a().a(new c.a(this.f33745f, user).a(this.f33741b).b("push").a(4).c("push"));
            }
            return true;
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33740a, false, 22530, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33740a, false, 22530, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f33741b = str2;
        e.a().a(this.g, str);
    }

    public final void a(String str, String str2, long j) {
        this.f33743d = str;
        this.f33742c = str2;
        this.f33744e = j;
    }
}
