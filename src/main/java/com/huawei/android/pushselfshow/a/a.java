package com.huawei.android.pushselfshow.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.android.pushagent.utils.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f25198a = {"phone", PushConstants.WEB_URL, "email", PushConstants.EXTRA_APPLICATION_PENDING_INTENT, "cosa", "rp"};

    /* renamed from: b  reason: collision with root package name */
    private Context f25199b;

    /* renamed from: c  reason: collision with root package name */
    private com.huawei.android.pushselfshow.b.a f25200c;

    public a(Context context, com.huawei.android.pushselfshow.b.a aVar) {
        this.f25199b = context;
        this.f25200c = aVar;
    }

    public static boolean a(String str) {
        for (String equals : f25198a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        com.huawei.android.pushselfshow.b.a aVar;
        String str;
        e.a("PushSelfShowLog", "enter launchUrl");
        try {
            if (!(this.f25200c.H == 0 || this.f25200c.I == null || this.f25200c.I.length() <= 0)) {
                if (this.f25200c.C.indexOf("?") != -1) {
                    aVar = this.f25200c;
                    str = this.f25200c.C + "&" + this.f25200c.I + "=" + com.huawei.android.pushselfshow.utils.a.a(com.huawei.android.pushselfshow.utils.a.b(this.f25199b));
                } else {
                    aVar = this.f25200c;
                    str = this.f25200c.C + "?" + this.f25200c.I + "=" + com.huawei.android.pushselfshow.utils.a.a(com.huawei.android.pushselfshow.utils.a.b(this.f25199b));
                }
                aVar.C = str;
            }
            e.a("PushSelfShowLog", "url =" + this.f25200c.C);
            if (this.f25200c.G == 0) {
                String str2 = this.f25200c.C;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW").setFlags(268435456).setData(Uri.parse(str2));
                this.f25199b.startActivity(intent);
                return;
            }
            this.f25200c.D = this.f25200c.C;
            this.f25200c.F = "text/html";
            this.f25200c.E = "html";
            g();
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    private void c() {
        e.a("PushSelfShowLog", "enter launchCall");
        try {
            Intent intent = new Intent();
            Intent action = intent.setAction("android.intent.action.DIAL");
            action.setData(Uri.parse("tel:" + this.f25200c.w)).setFlags(268435456);
            this.f25199b.startActivity(intent);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    private void d() {
        e.a("PushSelfShowLog", "enter launchMail");
        try {
            if (this.f25200c.x != null) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SENDTO").setFlags(268435456).setData(Uri.fromParts("mailto", this.f25200c.x, null)).putExtra("android.intent.extra.SUBJECT", this.f25200c.y).putExtra("android.intent.extra.TEXT", this.f25200c.z).setPackage("com.android.email");
                this.f25199b.startActivity(intent);
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    private void e() {
        try {
            e.a("PushSelfShowLog", "enter launchApp, appPackageName =" + this.f25200c.A);
            if (com.huawei.android.pushselfshow.utils.a.b(this.f25199b, this.f25200c.A)) {
                f();
            } else {
                try {
                    e.e("PushSelfShowLog", "insert into db message.getMsgId() is " + this.f25200c.a() + ",message.appPackageName is " + this.f25200c.A);
                    com.huawei.android.pushselfshow.utils.a.a.a(this.f25199b, this.f25200c.a(), this.f25200c.A);
                } catch (Exception e2) {
                    e.d("PushSelfShowLog", "launchApp not exist ,insertAppinfo error", e2);
                }
                Intent intent = null;
                if (com.huawei.android.pushselfshow.utils.a.a(this.f25199b, "com.huawei.appmarket", new Intent("com.huawei.appmarket.intent.action.AppDetail")).booleanValue()) {
                    e.a("PushSelfShowLog", "app not exist && appmarkt exist ,so open appmarket");
                    intent = new Intent("com.huawei.appmarket.intent.action.AppDetail");
                    intent.putExtra("APP_PACKAGENAME", this.f25200c.A);
                    intent.setPackage("com.huawei.appmarket");
                    intent.setFlags(402653184);
                    e.a("PushSelfShowLog", "hwAppmarket only support com.huawei.appmarket.intent.action.AppDetail!");
                    com.huawei.android.pushselfshow.utils.a.a(this.f25199b, "7", this.f25200c);
                }
                if (intent != null) {
                    e.a("PushSelfShowLog", "intent is not null " + intent.toURI());
                    this.f25199b.startActivity(intent);
                } else {
                    e.a("PushSelfShowLog", "intent is null ");
                }
            }
        } catch (Exception e3) {
            e.d("PushSelfShowLog", "launchApp error:" + e3.toString());
        }
    }

    private void f() {
        e.e("PushSelfShowLog", "run into launchCosaApp ");
        try {
            e.a("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.f25200c.A + ",and msg.intentUri is " + this.f25200c.g);
            Intent a2 = com.huawei.android.pushselfshow.utils.a.a(this.f25199b, this.f25200c.A);
            if (this.f25200c.g != null) {
                try {
                    Intent parseUri = Intent.parseUri(this.f25200c.g, 0);
                    e.a("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0)，" + parseUri.toURI());
                    if (com.huawei.android.pushselfshow.utils.a.a(this.f25199b, this.f25200c.A, parseUri).booleanValue()) {
                        a2 = parseUri;
                    }
                } catch (Exception e2) {
                    e.a("PushSelfShowLog", "intentUri error ", (Throwable) e2);
                }
            } else {
                if (this.f25200c.B != null) {
                    Intent intent = new Intent(this.f25200c.B);
                    if (com.huawei.android.pushselfshow.utils.a.a(this.f25199b, this.f25200c.A, intent).booleanValue()) {
                        a2 = intent;
                    }
                }
                a2.setPackage(this.f25200c.A);
            }
            if (a2 == null) {
                e.a("PushSelfShowLog", "launchCosaApp,intent == null");
            } else if (!com.huawei.android.pushselfshow.utils.a.a(this.f25199b, a2)) {
                e.c("PushSelfShowLog", "no permission to start Activity");
            } else {
                a2.setFlags(805437440);
                e.a("PushSelfShowLog", "start " + a2.toURI());
                this.f25199b.startActivity(a2);
            }
        } catch (Exception e3) {
            e.c("PushSelfShowLog", e3.toString(), e3);
        }
    }

    private void g() {
        try {
            e.e("PushSelfShowLog", "run into launchRichPush ");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f25199b.getPackageName(), "com.huawei.android.pushselfshow.richpush.RichPushActivity"));
            intent.putExtra("type", this.f25200c.E);
            intent.putExtra("selfshow_info", this.f25200c.c());
            intent.putExtra("selfshow_token", this.f25200c.d());
            intent.setFlags(268468240);
            intent.setPackage(this.f25199b.getPackageName());
            this.f25199b.startActivity(intent);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "launchRichPush failed", e2);
        }
    }

    public void a() {
        String str;
        String str2;
        e.a("PushSelfShowLog", "enter launchNotify()");
        if (this.f25199b == null || this.f25200c == null) {
            str = "PushSelfShowLog";
            str2 = "launchNotify  context or msg is null";
        } else if (PushConstants.EXTRA_APPLICATION_PENDING_INTENT.equals(this.f25200c.p)) {
            e();
            return;
        } else if ("cosa".equals(this.f25200c.p)) {
            f();
            return;
        } else if ("email".equals(this.f25200c.p)) {
            d();
            return;
        } else if ("phone".equals(this.f25200c.p)) {
            c();
            return;
        } else if ("rp".equals(this.f25200c.p)) {
            g();
            return;
        } else if (PushConstants.WEB_URL.equals(this.f25200c.p)) {
            b();
            return;
        } else {
            str = "PushSelfShowLog";
            str2 = this.f25200c.p + " is not exist in hShowType";
        }
        e.a(str, str2);
    }
}
