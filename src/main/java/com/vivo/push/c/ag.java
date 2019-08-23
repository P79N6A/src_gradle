package com.vivo.push.c;

import android.text.TextUtils;
import com.vivo.push.b.u;
import com.vivo.push.p;
import com.vivo.push.util.NotifyAdapterUtil;
import com.vivo.push.util.o;
import com.vivo.push.y;
import java.util.HashMap;

public final class ag extends aa {
    ag(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        u uVar = (u) yVar;
        if (!p.a().g() || a(com.vivo.push.util.y.d(this.f81705a), uVar.e(), uVar.i())) {
            NotifyAdapterUtil.repealNotifyById(this.f81705a, (int) uVar.d());
            return;
        }
        o.d("OnUndoMsgTask", " vertify msg is error ");
        com.vivo.push.b.y yVar2 = new com.vivo.push.b.y(1021);
        HashMap hashMap = new HashMap();
        hashMap.put("messageID", String.valueOf(uVar.f()));
        String b2 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
        if (!TextUtils.isEmpty(b2)) {
            hashMap.put("remoteAppId", b2);
        }
        yVar2.a(hashMap);
        p.a().a((y) yVar2);
    }
}
