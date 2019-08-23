package com.bytedance.im.core.b.e;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.e.l;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Arrays;
import java.util.List;

public class j implements l.a {

    /* renamed from: a  reason: collision with root package name */
    private static j f21241a;

    /* renamed from: b  reason: collision with root package name */
    private l f21242b;

    /* renamed from: c  reason: collision with root package name */
    private long f21243c;

    private j() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-SNAPSHOT");
        handlerThread.start();
        this.f21242b = new l(handlerThread.getLooper(), this);
    }

    public static j a() {
        if (f21241a == null) {
            synchronized (j.class) {
                if (f21241a == null) {
                    f21241a = new j();
                }
            }
        }
        return f21241a;
    }

    public static List<b> b() {
        try {
            return Arrays.asList((b[]) c.f21187a.fromJson(i.a().f21240a.getString(i.a("im_snapshot"), ""), b[].class));
        } catch (Exception unused) {
            return null;
        }
    }

    public final void c() {
        if (!this.f21242b.hasMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST)) {
            if (SystemClock.uptimeMillis() - this.f21243c <= c.a().b().F) {
                this.f21242b.sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, (this.f21243c + c.a().b().F) - SystemClock.uptimeMillis());
            } else {
                d();
            }
        }
    }

    private synchronized void d() {
        this.f21243c = SystemClock.uptimeMillis();
        List<b> b2 = d.a().b();
        if (b2.size() > c.a().b().E) {
            b2 = b2.subList(0, c.a().b().E);
        }
        try {
            i.a().f21240a.edit().putString(i.a("im_snapshot"), c.f21187a.toJson((Object) b2.toArray(new b[0]))).commit();
        } catch (Exception unused) {
        }
    }

    public final void a(Message message) {
        if (message.what == 1001) {
            d();
        }
    }
}
