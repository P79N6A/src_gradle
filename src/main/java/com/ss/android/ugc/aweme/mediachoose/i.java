package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55301a;

    public static void a(boolean z, boolean z2) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f55301a, true, 58546, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, null, f55301a, true, 58546, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (z2) {
            str = "video";
        } else {
            str = "photo";
        }
        d a3 = a2.a("content_type", str);
        if (z) {
            str2 = "mutiple_content";
        } else {
            str2 = "single_content";
        }
        r.a("choose_upload_content", (Map) a3.a("upload_type", str2).f34114b);
    }
}
