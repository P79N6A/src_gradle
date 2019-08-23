package com.bytedance.android.livesdk.browser.h;

import android.os.SystemClock;
import com.bytedance.android.live.b.b;
import com.bytedance.android.live.core.d.d;
import com.bytedance.android.live.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9414a;

    /* renamed from: b  reason: collision with root package name */
    private long f9415b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9416c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9417d;

    /* renamed from: e  reason: collision with root package name */
    private b f9418e;

    public c(String str, String str2, b bVar) {
        this.f9416c = str;
        this.f9417d = str2;
        this.f9418e = bVar;
    }

    public void a(int i, int i2, String str) {
        int i3 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f9414a, false, 3806, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f9414a, false, 3806, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        long j = 0;
        if (i3 == 0) {
            this.f9415b = SystemClock.uptimeMillis();
        } else if (this.f9415b > 0) {
            long j2 = this.f9415b;
            this.f9415b = 0;
            j = SystemClock.uptimeMillis() - j2;
        } else {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("webview_scene", this.f9416c);
        hashMap.put(PushConstants.WEB_URL, this.f9417d);
        if (i2 != 0) {
            hashMap.put("error_code", Integer.valueOf(i2));
            hashMap.put("error_msg", str2);
        }
        e.a(d.a("ttlive_webview_load_status"), i, j, (Map<String, Object>) hashMap);
        if (i3 == 2) {
            e.a(d.b("ttlive_webview_load_status"), i, (Map<String, Object>) hashMap);
        }
        if (this.f9418e != null) {
            switch (i3) {
                case 0:
                    this.f9418e.a(hashMap);
                    return;
                case 1:
                    this.f9418e.a(j, hashMap);
                    return;
                case 2:
                    this.f9418e.b(j, hashMap);
                    return;
                case 3:
                    this.f9418e.c(j, hashMap);
                    break;
            }
        }
    }
}
