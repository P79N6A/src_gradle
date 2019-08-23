package com.ss.android.ugc.aweme.miniapp;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class u implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55918a;

    /* renamed from: b  reason: collision with root package name */
    private String f55919b;

    public final boolean a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f55918a, false, 59085, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f55918a, false, 59085, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                str2 = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str2 = str;
            }
            this.f55919b = Uri.parse(str2).getQueryParameter("other_open");
            if (!TextUtils.isEmpty(this.f55919b)) {
                return true;
            }
            return false;
        }
    }

    public final boolean a(@NonNull Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, this, f55918a, false, 59086, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str}, this, f55918a, false, 59086, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        q.a().i.b(context2, this.f55919b);
        return false;
    }
}
