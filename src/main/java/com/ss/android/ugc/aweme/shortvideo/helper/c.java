package com.ss.android.ugc.aweme.shortvideo.helper;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68119a;

    /* renamed from: b  reason: collision with root package name */
    public String f68120b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f68121c;

    /* renamed from: d  reason: collision with root package name */
    public String f68122d;

    /* renamed from: e  reason: collision with root package name */
    public long f68123e;

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f68119a, false, 77452, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68119a, false, 77452, new Class[0], String.class);
        }
        return this.f68120b + ": " + this.f68122d + "  存在?" + this.f68121c + " size: " + this.f68123e;
    }

    public c(String str, String str2) {
        this.f68120b = str;
        this.f68122d = str2;
        if (!TextUtils.isEmpty(str2)) {
            File file = new File(str2);
            if (file.exists() && file.isFile()) {
                this.f68121c = true;
                this.f68123e = file.length();
                return;
            }
        }
        this.f68121c = false;
        this.f68123e = 0;
    }
}
