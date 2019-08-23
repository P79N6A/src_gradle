package com.ss.android.ugc.sdk.communication;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.sdk.communication.a;
import com.ss.android.ugc.sdk.communication.msg.a;
import com.ss.android.ugc.sdk.communication.msg.base.Msg;
import java.lang.ref.WeakReference;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f77787a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77788b;

    public final boolean b(String str) {
        if (this.f77787a == null || TextUtils.isEmpty(str) || !a(str) || c(str) <= 0) {
            return false;
        }
        return true;
    }

    c(Context context) {
        String str;
        this.f77787a = context;
        String packageName = context.getPackageName();
        if (TextUtils.equals(packageName, "com.ss.android.ugc.aweme")) {
            str = "AWEME";
        } else if (TextUtils.equals(packageName, "com.ss.android.ugc.live")) {
            str = "HOTSOON";
        } else {
            str = null;
        }
        this.f77788b = str;
    }

    private int c(String str) {
        if (this.f77787a == null || TextUtils.isEmpty(str) || !a(str)) {
            return -1;
        }
        try {
            ApplicationInfo applicationInfo = this.f77787a.getPackageManager().getApplicationInfo(d.a(str), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getInt("IES_COMMUNICATION_SDK_VERSION", -1);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return -1;
    }

    public final boolean a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || this.f77787a == null) {
            return false;
        }
        String a2 = d.a(str);
        if (!TextUtils.isEmpty(a2)) {
            try {
                if (this.f77787a.getPackageManager().getPackageInfo(a2, SearchJediMixFeedAdapter.f42517f) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public final boolean a(Intent intent, a.C0825a aVar) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("KEY_INTENT_TYPE", -1);
        if (intExtra == 0) {
            if (intent.getIntExtra("KEY_MSG_TYPE", -1) != 0) {
                return false;
            }
            new a.C0826a(intent.getExtras());
            return true;
        } else if (intExtra != 1 || intent.getIntExtra("KEY_MSG_TYPE", -1) != 0) {
            return false;
        } else {
            aVar.a(new a.b(intent.getExtras()));
            return true;
        }
    }

    public final boolean a(Msg msg, a.b bVar) {
        if (!a(msg.b()) || !b(msg.b())) {
            return false;
        }
        e a2 = e.a();
        a2.f77789a.put(msg.c(), new WeakReference(bVar));
        try {
            Intent intent = new Intent();
            intent.setComponent(msg.a());
            Bundle bundle = new Bundle();
            msg.a(bundle);
            intent.putExtras(bundle);
            intent.putExtra("KEY_SOURCE_PLATFORM", this.f77788b);
            intent.addFlags(268435456);
            this.f77787a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
