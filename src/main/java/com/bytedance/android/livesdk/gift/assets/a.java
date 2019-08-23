package com.bytedance.android.livesdk.gift.assets;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.b.a.a.b;
import com.ss.ugc.live.b.a.c;
import java.io.File;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14716a;

    /* renamed from: b  reason: collision with root package name */
    private Context f14717b;

    /* renamed from: c  reason: collision with root package name */
    private String f14718c = this.f14717b.getDir("assets", 0).getAbsolutePath();

    public a(Context context) {
        this.f14717b = context;
    }

    public final String a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f14716a, false, 9322, new Class[]{c.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f14716a, false, 9322, new Class[]{c.class}, String.class);
        }
        return this.f14718c + File.separator + cVar2.f78637d + File.separator;
    }
}
