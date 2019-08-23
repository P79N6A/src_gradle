package com.ss.android.ugc.aweme.app.c.c;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.p;
import java.util.HashSet;
import java.util.Set;

public class a implements com.ss.android.download.api.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34051a;

    /* renamed from: c  reason: collision with root package name */
    private static a f34052c;

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f34053b = new HashSet();

    public final void a(DownloadInfo downloadInfo) {
    }

    public final void a(DownloadInfo downloadInfo, String str) {
    }

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f34051a, true, 23438, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f34051a, true, 23438, new Class[0], a.class);
        }
        if (f34052c == null) {
            synchronized (a.class) {
                if (f34052c == null) {
                    f34052c = new a();
                }
            }
        }
        return f34052c;
    }

    public final void a(@NonNull DownloadInfo downloadInfo, BaseException baseException, String str) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException, str}, this, f34051a, false, 23440, new Class[]{DownloadInfo.class, BaseException.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException, str}, this, f34051a, false, 23440, new Class[]{DownloadInfo.class, BaseException.class, String.class}, Void.TYPE);
            return;
        }
        String url = downloadInfo.getUrl();
        if (TextUtils.isEmpty(url) && this.f34053b.contains(url)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) p.a().e(), (int) C0906R.string.a7h).a();
            this.f34053b.remove(url);
        }
    }
}
