package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.live.authentication.LiveBroadcastAuthenticateActivity;
import com.ss.android.ugc.aweme.live.authentication.model.b;
import com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist;
import com.ss.android.ugc.aweme.utils.cb;
import com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity;

public final class v implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53485a;

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f53485a, false, 55850, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f53485a, false, 55850, new Class[0], String.class);
        }
        return e.f34153c + AppLog.getAppId() + "://zhimaVerify";
    }

    public final Intent a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f53485a, false, 55851, new Class[]{Context.class}, Intent.class)) {
            return new Intent(context2, ZhiMaInterActivity.class);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, this, f53485a, false, 55851, new Class[]{Context.class}, Intent.class);
    }

    public final void a(Activity activity, int i, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), str2}, this, f53485a, false, 55852, new Class[]{Activity.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), str2}, this, f53485a, false, 55852, new Class[]{Activity.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        b.a().f53325b = (LiveVerifyChecklist) cb.a(str2, LiveVerifyChecklist.class);
        activity2.startActivityForResult(new Intent(activity2, LiveBroadcastAuthenticateActivity.class), i);
    }

    public final void a(Activity activity, int i, String str, Bundle bundle) {
        Activity activity2 = activity;
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, 109, str2, bundle2}, this, f53485a, false, 55853, new Class[]{Activity.class, Integer.TYPE, String.class, Bundle.class}, Void.TYPE)) {
            Object[] objArr = {activity2, 109, str2, bundle2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f53485a, false, 55853, new Class[]{Activity.class, Integer.TYPE, String.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            b.a().f53326c = bundle2.getString("live_type");
        }
        a(activity2, 109, str2);
    }
}
