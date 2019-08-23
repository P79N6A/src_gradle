package com.ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76030a;

    public interface a {
        String a(String str);

        void b(String str);
    }

    public static void a(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, null, f76030a, true, 88912, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, null, f76030a, true, 88912, new Class[]{String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            try {
                str2 = ((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(d.a(), a.class)).a("");
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.util.c.a("HashTagPreferences getSP failed " + th.getMessage());
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                com.ss.android.ugc.aweme.video.hashtag.d.a(str2);
            }
        } else {
            com.ss.android.ugc.aweme.video.hashtag.d.a("#(" + str3 + ")+");
            try {
                ((a) com.ss.android.ugc.aweme.base.sharedpref.c.a(d.a(), a.class)).b("#(" + str3 + ")+");
            } catch (Throwable th2) {
                com.ss.android.ugc.aweme.util.c.a("HashTagPreferences getSP failed " + th2.getMessage());
            }
        }
    }
}
