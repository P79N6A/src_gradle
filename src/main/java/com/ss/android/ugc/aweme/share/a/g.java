package com.ss.android.ugc.aweme.share.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.qrcode.e.b;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64598a;

    /* renamed from: b  reason: collision with root package name */
    private final String f64599b;

    g(String str) {
        this.f64599b = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f64598a, false, 73468, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f64598a, false, 73468, new Class[0], Object.class);
        }
        String str = this.f64599b;
        for (String str2 : (Set) x.a().k().c()) {
            HttpUrl parse = HttpUrl.parse(str);
            if (TextUtils.equals(parse != null ? parse.host() : null, str2)) {
                return str;
            }
        }
        return b.a(str) ? f.b(str) : "";
    }
}
