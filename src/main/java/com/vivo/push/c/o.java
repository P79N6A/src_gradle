package com.vivo.push.c;

import android.text.TextUtils;
import com.vivo.push.b.i;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.p;
import com.vivo.push.w;
import com.vivo.push.y;
import java.util.HashMap;

public final class o extends aa {
    o(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        com.vivo.push.b.o oVar = (com.vivo.push.b.o) yVar;
        p.a().a((y) new i(String.valueOf(oVar.f())));
        if (!ClientConfigManagerImpl.getInstance(this.f81705a).isEnablePush()) {
            com.vivo.push.util.o.d("OnMessageTask", "command  " + yVar + " is ignore by disable push ");
            com.vivo.push.b.y yVar2 = new com.vivo.push.b.y(1020);
            HashMap hashMap = new HashMap();
            hashMap.put("messageID", String.valueOf(oVar.f()));
            String b2 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put("remoteAppId", b2);
            }
            yVar2.a(hashMap);
            p.a().a((y) yVar2);
        } else if (!p.a().g() || a(com.vivo.push.util.y.d(this.f81705a), oVar.d(), oVar.i())) {
            UnvarnishedMessage e2 = oVar.e();
            if (e2 != null) {
                int targetType = e2.getTargetType();
                String tragetContent = e2.getTragetContent();
                com.vivo.push.util.o.d("OnMessageTask", "tragetType is " + targetType + " ; target is " + tragetContent);
                w.b(new p(this, e2));
                return;
            }
            com.vivo.push.util.o.a("OnMessageTask", " message is null");
        } else {
            com.vivo.push.b.y yVar3 = new com.vivo.push.b.y(1021);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("messageID", String.valueOf(oVar.f()));
            String b3 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
            if (!TextUtils.isEmpty(b3)) {
                hashMap2.put("remoteAppId", b3);
            }
            yVar3.a(hashMap2);
            p.a().a((y) yVar3);
        }
    }
}
