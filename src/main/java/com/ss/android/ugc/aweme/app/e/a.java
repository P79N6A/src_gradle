package com.ss.android.ugc.aweme.app.e;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.al;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34157a;

    /* access modifiers changed from: package-private */
    public final String a() {
        return "chat";
    }

    /* access modifiers changed from: package-private */
    public final Intent a(Activity activity) {
        Intent intent;
        if (PatchProxy.isSupport(new Object[]{activity}, this, f34157a, false, 23522, new Class[]{Activity.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity}, this, f34157a, false, 23522, new Class[]{Activity.class}, Intent.class);
        }
        if (TextUtils.equals("/system", this.f34161e)) {
            intent = new Intent(activity, NotificationDetailActivity.class);
            intent.putExtra("from_where", 5);
        } else {
            intent = new Intent(activity, MainActivity.class);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            a("message");
        }
        if (!d.a().isLogin()) {
            return al.a(activity, intent);
        }
        return intent;
    }
}
