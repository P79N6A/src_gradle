package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fg;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class c implements t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58482a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap.CompressFormat f58483b = Bitmap.CompressFormat.PNG;

    /* renamed from: c  reason: collision with root package name */
    private final String f58484c;

    /* renamed from: d  reason: collision with root package name */
    private final SimpleDateFormat f58485d;

    public c() {
        File file = new File(fg.f67717f, "photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f58484c = file.getAbsolutePath();
        this.f58485d = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    @NonNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f58482a, false, 63539, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58482a, false, 63539, new Class[0], String.class);
        }
        String str = ".png";
        if (this.f58483b == Bitmap.CompressFormat.JPEG) {
            str = ".jpeg";
        }
        Locale locale = Locale.getDefault();
        return String.format(locale, "%s/IMG_%s" + str, new Object[]{this.f58484c, this.f58485d.format(new Date())});
    }
}
