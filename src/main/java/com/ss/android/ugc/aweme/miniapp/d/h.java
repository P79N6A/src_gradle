package com.ss.android.ugc.aweme.miniapp.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.miniapp.a;
import com.ss.android.ugc.aweme.miniapp.g;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp.u;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.option.router.AbstractHostOptionRouterDepend;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class h extends AbstractHostOptionRouterDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55682a;

    /* renamed from: b  reason: collision with root package name */
    private List<g> f55683b = new ArrayList();

    public h() {
        this.f55683b.add(new a());
        this.f55683b.add(new u());
    }

    public final boolean handleAppbrandDisablePage(@NonNull Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f55682a, false, 59392, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f55682a, false, 59392, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        for (g next : this.f55683b) {
            if (next.a(str2)) {
                return next.a(context2, str2);
            }
        }
        return false;
    }

    public final boolean openProfile(@NonNull Activity activity, @Nullable String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, this, f55682a, false, 59391, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f55682a, false, 59391, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        HostProcessBridge.logEvent("enter_personal_detail", new JSONObject(d.a().a("to_user_id", str2).a("enter_from", "mp_ranklist").f34114b));
        f fVar = q.a().i;
        if (fVar != null) {
            return fVar.a((Context) activity2, str2, "mp_ranklist", "follow_button");
        }
        return false;
    }

    public final boolean openSchema(@NonNull Context context, @NonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f55682a, false, 59390, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f55682a, false, 59390, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        String str3 = null;
        if (context2 instanceof Activity) {
            Intent intent = ((Activity) context2).getIntent();
            if (intent != null) {
                str3 = intent.getStringExtra("class_name");
            }
        }
        String str4 = str2 + "?&from=" + str3;
        f fVar = q.a().i;
        if (fVar != null) {
            return fVar.a(context2, str4, false);
        }
        return false;
    }

    public final void jumpToWebView(@NonNull Context context, String str, String str2, boolean z) {
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55682a, false, 59389, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str, str2, Byte.valueOf(z)}, this, f55682a, false, 59389, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder("sslocal://webview?url=");
        sb.append(Uri.encode(str));
        sb.append("&title=");
        sb.append(Uri.encode(str2));
        sb.append("&hide_bar=");
        if (z) {
            i = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            i = 0;
        }
        sb.append(i);
        String sb2 = sb.toString();
        if (context2 != null) {
            f fVar = q.a().i;
            if (fVar != null) {
                fVar.a(context2, sb2);
            }
        }
    }
}
