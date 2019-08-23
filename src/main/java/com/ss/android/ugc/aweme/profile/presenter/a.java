package com.ss.android.ugc.aweme.profile.presenter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.profile.d.j;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import org.json.JSONObject;

public class a implements WeakHandler.IHandler, j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61560a;

    /* renamed from: b  reason: collision with root package name */
    protected j f61561b;

    /* renamed from: c  reason: collision with root package name */
    public l f61562c;

    /* renamed from: d  reason: collision with root package name */
    protected int f61563d;

    /* renamed from: e  reason: collision with root package name */
    protected String f61564e;

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f61565f = new WeakHandler(this);
    private List<e> g;

    public final boolean a(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f61560a, false, 67526, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f61560a, false, 67526, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f61561b == null) {
            return false;
        } else {
            int i3 = i;
            int i4 = i2;
            return this.f61561b.a(i, i2, intent2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61560a, false, 67531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61560a, false, 67531, new Class[0], Void.TYPE);
            return;
        }
        if (this.f61561b != null) {
            this.f61561b.b();
        }
        this.f61563d = 0;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61560a, false, 67533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61560a, false, 67533, new Class[0], Void.TYPE);
            return;
        }
        a(this.f61564e, (List<e>) null);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f61560a, false, 67536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61560a, false, 67536, new Class[0], Void.TYPE);
            return;
        }
        if (this.f61561b != null) {
            this.f61561b.c();
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61560a, false, 67528, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61560a, false, 67528, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f61561b != null) {
            this.f61561b.a(i);
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{2}, this, f61560a, false, 67529, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{2}, this, f61560a, false, 67529, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f61561b != null) {
            this.f61561b.b(2);
        }
    }

    public void handleMsg(Message message) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{message}, this, f61560a, false, 67537, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f61560a, false, 67537, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (this.f61562c != null) {
            if (message.obj instanceof Exception) {
                if (this.f61563d >= 4 || this.f61561b == null || (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    Exception exc = (Exception) message.obj;
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
                    n.a("aweme_avartar_upload_error_rate", 1, a3.a("errorCode", str2).a("imageUrl", this.f61564e).b());
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) (Exception) message.obj);
                    this.f61562c.a((Exception) message.obj);
                    return;
                }
                this.f61563d++;
                this.f61561b.a((this.f61563d << 1) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.f61564e, this.g);
            } else if (message.obj instanceof AvatarUri) {
                this.f61562c.a((AvatarUri) message.obj);
                n.a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61560a, false, 67532, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61560a, false, 67532, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f61564e = str;
        if (this.f61562c != null) {
            this.f61562c.a(str);
        }
    }

    public final void a(Activity activity, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{activity, fragment}, this, f61560a, false, 67525, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, fragment}, this, f61560a, false, 67525, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
            return;
        }
        this.f61561b = new j(activity, fragment, new WeakHandler(this), this);
    }

    public final void a(String str, List<e> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f61560a, false, 67534, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f61560a, false, 67534, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        this.f61564e = str;
        this.g = list;
        if (this.f61561b != null) {
            this.f61561b.a(str, list);
        }
    }

    public final void a(int i, Activity activity, View view, @NonNull User user) {
        String uri;
        if (PatchProxy.isSupport(new Object[]{0, activity, view, user}, this, f61560a, false, 67527, new Class[]{Integer.TYPE, Activity.class, View.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0, activity, view, user}, this, f61560a, false, 67527, new Class[]{Integer.TYPE, Activity.class, View.class, User.class}, Void.TYPE);
        } else if (this.f61561b != null) {
            j jVar = this.f61561b;
            if (TextUtils.isEmpty(this.f61564e)) {
                uri = null;
            } else {
                uri = Uri.parse("file://" + this.f61564e).toString();
            }
            jVar.a(0, activity, view, user, uri);
        }
    }
}
