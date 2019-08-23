package com.ss.android.ugc.aweme.tools.extract;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photo.t;
import com.ss.android.ugc.aweme.port.in.a;
import java.io.File;

public final class f implements t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74701a;

    /* renamed from: b  reason: collision with root package name */
    public String f74702b = a.f61119b.getFilesDir().getAbsolutePath();

    @NonNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f74701a, false, 87056, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74701a, false, 87056, new Class[0], String.class);
        }
        return this.f74702b + File.separator + "extract-frame-" + System.currentTimeMillis() + ".jpg";
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f74701a, false, 87055, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f74701a, false, 87055, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f74702b = a.f61119b.getFilesDir() + File.separator + str + File.separator + str2;
        File file = new File(this.f74702b);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
