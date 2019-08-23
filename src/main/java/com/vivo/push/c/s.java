package com.vivo.push.c;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.vivo.push.b.p;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.util.NotifyAdapterUtil;
import com.vivo.push.util.o;
import com.vivo.push.w;
import com.vivo.push.y;
import java.util.HashMap;

public final class s extends aa {
    s(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        String str;
        p pVar = (p) yVar;
        InsideNotificationItem f2 = pVar.f();
        if (f2 == null) {
            o.d("OnNotificationClickTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage a2 = com.vivo.push.util.p.a(f2);
        boolean equals = this.f81705a.getPackageName().equals(pVar.d());
        if (equals) {
            NotifyAdapterUtil.cancelNotify(this.f81705a);
        }
        if (equals) {
            com.vivo.push.b.y yVar2 = new com.vivo.push.b.y(1030);
            HashMap hashMap = new HashMap();
            hashMap.put("type", PushConstants.PUSH_TYPE_UPLOAD_LOG);
            hashMap.put("messageID", String.valueOf(pVar.e()));
            hashMap.put("platform", this.f81705a.getPackageName());
            String b2 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put("remoteAppId", b2);
            }
            yVar2.a(hashMap);
            com.vivo.push.p.a().a((y) yVar2);
            o.d("OnNotificationClickTask", "notification is clicked by skip type[" + a2.getSkipType() + "]");
            boolean z = true;
            switch (a2.getSkipType()) {
                case 1:
                    new Thread(new x(this, this.f81705a)).start();
                    w.b(new t(this, a2));
                    return;
                case 2:
                    String skipContent = a2.getSkipContent();
                    if (!skipContent.startsWith("http://") && !skipContent.startsWith("https://")) {
                        z = false;
                    }
                    if (z) {
                        Uri parse = Uri.parse(skipContent);
                        Intent intent = new Intent("android.intent.action.VIEW", parse);
                        intent.setFlags(268435456);
                        try {
                            this.f81705a.startActivity(intent);
                        } catch (Exception unused) {
                            o.a("OnNotificationClickTask", "startActivity error : ".concat(String.valueOf(parse)));
                        }
                    } else {
                        o.a("OnNotificationClickTask", "url not legal");
                    }
                    w.b(new u(this, a2));
                    return;
                case 3:
                    w.b(new v(this, a2));
                    return;
                case 4:
                    String skipContent2 = a2.getSkipContent();
                    try {
                        Intent parseUri = Intent.parseUri(skipContent2, 1);
                        String str2 = parseUri.getPackage();
                        if (TextUtils.isEmpty(str2) || this.f81705a.getPackageName().equals(str2)) {
                            if (parseUri.getComponent() == null) {
                                str = null;
                            } else {
                                str = parseUri.getComponent().getPackageName();
                            }
                            if (TextUtils.isEmpty(str) || this.f81705a.getPackageName().equals(str)) {
                                parseUri.setPackage(this.f81705a.getPackageName());
                                parseUri.addFlags(268435456);
                                this.f81705a.startActivity(parseUri);
                                w.b(new w(this, a2));
                                return;
                            }
                            o.a("OnNotificationClickTask", "open activity component error : local pkgName is " + this.f81705a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                            return;
                        }
                        o.a("OnNotificationClickTask", "open activity error : local pkgName is " + this.f81705a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                        return;
                    } catch (Exception e2) {
                        o.a("OnNotificationClickTask", "open activity error : ".concat(String.valueOf(skipContent2)), e2);
                    }
                    break;
                default:
                    o.a("OnNotificationClickTask", "illegitmacy skip type error : " + a2.getSkipType());
                    return;
            }
        } else {
            o.a("OnNotificationClickTask", "notify is " + a2 + " ; isMatch is " + equals);
        }
    }
}
