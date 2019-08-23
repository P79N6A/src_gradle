package com.ss.android.ugc.aweme.photo;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58454a;

    /* renamed from: b  reason: collision with root package name */
    private final String f58455b;

    /* renamed from: c  reason: collision with root package name */
    private final SimpleDateFormat f58456c;

    @NonNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f58454a, false, 63536, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58454a, false, 63536, new Class[0], String.class);
        }
        return String.format(Locale.getDefault(), "%s/IMG_%s.png", new Object[]{this.f58455b, this.f58456c.format(new Date())});
    }

    public a(Context context) {
        File file = new File(com.ss.android.ugc.aweme.am.a.a(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f58455b = file.getAbsolutePath();
        this.f58456c = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }
}
