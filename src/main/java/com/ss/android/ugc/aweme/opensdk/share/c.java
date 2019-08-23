package com.ss.android.ugc.aweme.opensdk.share;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.opensdk.share.base.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58392a;

    public static a a(Intent intent) {
        String str;
        a aVar;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, null, f58392a, true, 63402, new Class[]{Intent.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{intent2}, null, f58392a, true, 63402, new Class[]{Intent.class}, a.class);
        }
        String stringExtra = intent2.getStringExtra("_dyobject_identifier_");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        if (stringExtra.contains("account")) {
            str = stringExtra.replace("com.bytedance.sdk.account.open.aweme.base", "com.ss.android.ugc.aweme.opensdk.share.base");
        } else {
            str = stringExtra.replace("com.bytedance.sdk.open.aweme.base", "com.ss.android.ugc.aweme.opensdk.share.base");
        }
        try {
            aVar = (a) Class.forName(str).newInstance();
            try {
                aVar.unserialize(intent.getExtras());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused2) {
            aVar = null;
        }
        return aVar;
    }
}
