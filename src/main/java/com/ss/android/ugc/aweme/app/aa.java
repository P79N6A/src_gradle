package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33673a;

    public enum a {
        PRIVATE,
        AUDITING,
        SDCARD,
        AWEME,
        NETWORK,
        DOWNLOAD_URL,
        SUFFIX_LOGO_DOWNLOAD_URL,
        PLAY_URL,
        PREVENT_DOWNLOAD,
        UI_ALIKE_WATERMARK_DOWNLOAD_URL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33673a, true, 22510, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f33673a, true, 22510, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, "");
    }

    public static final void a(a aVar, Aweme aweme) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, aweme}, null, f33673a, true, 22509, new Class[]{a.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, aweme}, null, f33673a, true, 22509, new Class[]{a.class, Aweme.class}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder("ForbidDownload:");
        sb.append("ForbidType:");
        sb.append(aVar2);
        if (aweme != null) {
            sb.append(",");
            sb.append("aweme_id");
            sb.append(aweme.getAid());
        }
        a(sb.toString());
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f33673a, true, 22511, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f33673a, true, 22511, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.a.a("aweme_movie_download_error_message", "download", str3, str4);
    }
}
