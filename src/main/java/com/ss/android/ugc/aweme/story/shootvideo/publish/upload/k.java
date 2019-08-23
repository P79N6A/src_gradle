package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.sticker.c.a;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73752a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73753b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f73754c;

    k(String str, Object obj) {
        this.f73753b = str;
        this.f73754c = obj;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f73752a, false, 85492, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f73752a, false, 85492, new Class[0], Object.class);
        }
        String str = this.f73753b;
        Object obj = this.f73754c;
        if (!TextUtils.isEmpty(str)) {
            b.c(str);
            if (obj != null && (obj instanceof cb)) {
                cb cbVar = (cb) obj;
                if (!TextUtils.isEmpty(cbVar.getWavFile())) {
                    b.c(cbVar.getWavFile());
                }
            }
            a.a(new File(d.a(str)));
        }
        return null;
    }
}
