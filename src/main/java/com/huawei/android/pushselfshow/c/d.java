package com.huawei.android.pushselfshow.c;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.b.a;
import com.huawei.android.pushselfshow.richpush.tools.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class d extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private Context f25217a;

    /* renamed from: b  reason: collision with root package name */
    private a f25218b;

    public d(Context context, a aVar) {
        this.f25217a = context;
        this.f25218b = aVar;
    }

    private static Intent b(Context context, a aVar) {
        if (aVar == null) {
            return null;
        }
        Intent a2 = com.huawei.android.pushselfshow.utils.a.a(context, aVar.A);
        if (aVar.g != null) {
            try {
                Intent parseUri = Intent.parseUri(aVar.g, 0);
                e.a("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0)，" + parseUri.toURI());
                if (com.huawei.android.pushselfshow.utils.a.a(context, aVar.A, parseUri).booleanValue()) {
                    a2 = parseUri;
                }
            } catch (Exception e2) {
                e.a("PushSelfShowLog", "intentUri error ", (Throwable) e2);
            }
        } else {
            if (aVar.B != null) {
                Intent intent = new Intent(aVar.B);
                if (com.huawei.android.pushselfshow.utils.a.a(context, aVar.A, intent).booleanValue()) {
                    a2 = intent;
                }
            }
            a2.setPackage(aVar.A);
        }
        return a2;
    }

    public boolean a(Context context) {
        if ("cosa".equals(this.f25218b.p)) {
            return b(context);
        }
        if ("email".equals(this.f25218b.p)) {
            return c(context);
        }
        if ("rp".equals(this.f25218b.p)) {
            return d(context);
        }
        return true;
    }

    public boolean a(Context context, a aVar) {
        if (!PushConstants.EXTRA_APPLICATION_PENDING_INTENT.equals(aVar.p) && !"cosa".equals(aVar.p)) {
            return false;
        }
        Intent b2 = b(context, aVar);
        if (b2 == null) {
            e.a("PushSelfShowLog", "launchCosaApp,intent == null");
            return true;
        } else if (com.huawei.android.pushselfshow.utils.a.a(context, b2)) {
            return false;
        } else {
            e.b("PushSelfShowLog", "no permission to start activity");
            return true;
        }
    }

    public boolean b(Context context) {
        if (com.huawei.android.pushselfshow.utils.a.b(context, this.f25218b.A)) {
            return true;
        }
        com.huawei.android.pushselfshow.utils.a.a(context, PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION, this.f25218b);
        return false;
    }

    public boolean c(Context context) {
        if (com.huawei.android.pushselfshow.utils.a.d(context)) {
            return true;
        }
        com.huawei.android.pushselfshow.utils.a.a(context, "15", this.f25218b);
        return false;
    }

    public boolean d(Context context) {
        if (this.f25218b.D == null || this.f25218b.D.length() == 0) {
            com.huawei.android.pushselfshow.utils.a.a(context, "6", this.f25218b);
            e.a("PushSelfShowLog", "ilegle richpush param ,rpl is null");
            return false;
        }
        e.a("PushSelfShowLog", "enter checkRichPush, rpl is " + this.f25218b.D + ",psMsg.rpct:" + this.f25218b.F);
        if ("application/zip".equals(this.f25218b.F) || this.f25218b.D.endsWith(".zip")) {
            this.f25218b.F = "application/zip";
            if (this.f25218b.j == 1) {
                String a2 = new com.huawei.android.pushselfshow.richpush.tools.d().a(context, this.f25218b.D, this.f25218b.k, b.a("application/zip"));
                if (a2 != null && a2.length() > 0) {
                    this.f25218b.D = a2;
                    this.f25218b.F = "application/zip_local";
                }
                e.a("PushSelfShowLog", "Download first ,the localfile" + a2);
            }
            return true;
        } else if ("text/html".equals(this.f25218b.F) || this.f25218b.D.endsWith(".html")) {
            this.f25218b.F = "text/html";
            return true;
        } else {
            e.a("PushSelfShowLog", "unknow rpl type");
            com.huawei.android.pushselfshow.utils.a.a(context, "6", this.f25218b);
            return false;
        }
    }

    public void run() {
        e.a("PushSelfShowLog", "enter run()");
        try {
            if (a(this.f25217a)) {
                if (a(this.f25217a, this.f25218b)) {
                    com.huawei.android.pushselfshow.utils.a.a(this.f25217a, "17", this.f25218b);
                    return;
                }
                b.a(this.f25217a, this.f25218b);
            }
        } catch (Exception unused) {
        }
        super.run();
    }
}
