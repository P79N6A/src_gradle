package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.am.a;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;

public final /* synthetic */ class ca implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62564a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverPreviewActivity f62565b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62566c;

    ca(ProfileCoverPreviewActivity profileCoverPreviewActivity, String str) {
        this.f62565b = profileCoverPreviewActivity;
        this.f62566c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f62564a, false, 68652, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f62564a, false, 68652, new Class[0], Object.class);
        }
        ProfileCoverPreviewActivity profileCoverPreviewActivity = this.f62565b;
        String str = this.f62566c;
        String a2 = a.a(k.a());
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()) + ".png";
        String str3 = a2 + File.separator + str2;
        b.c(c.a(str), str3);
        com.ss.android.ugc.aweme.photo.b.a.a(profileCoverPreviewActivity, str3);
        return null;
    }
}
