package com.ss.android.ugc.aweme.video.local;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.app.application.initialization.a;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76143a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f76144b = "b";

    public static void a(String str, e eVar, d dVar) {
        String str2 = str;
        final e eVar2 = eVar;
        final d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str2, eVar2, dVar2}, null, f76143a, true, 89121, new Class[]{String.class, e.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, eVar2, dVar2}, null, f76143a, true, 89121, new Class[]{String.class, e.class, d.class}, Void.TYPE);
            return;
        }
        if (!LocalVideoPlayerManager.a().a(str2, eVar2.f31528c, new LocalVideoPlayerManager.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76145a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f76145a, false, 89124, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76145a, false, 89124, new Class[0], Void.TYPE);
                    return;
                }
                a.a(eVar2, dVar2);
            }

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f76145a, false, 89123, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f76145a, false, 89123, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                File file = new File(str);
                dVar2.onDownloadProgress(100, file.length(), file.length());
                dVar2.onDownloadSuccess(str);
            }
        })) {
            a.a(eVar, dVar);
        }
    }
}
