package com.vivo.push;

import android.content.Intent;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.vivo.push.b.j;
import com.vivo.push.b.k;
import com.vivo.push.b.l;
import com.vivo.push.b.m;
import com.vivo.push.b.n;
import com.vivo.push.b.p;
import com.vivo.push.b.q;
import com.vivo.push.b.r;
import com.vivo.push.b.t;
import com.vivo.push.b.u;
import com.vivo.push.c.aa;
import com.vivo.push.c.ah;

public final class o implements IPushClientFactory {

    /* renamed from: a  reason: collision with root package name */
    private ah f81616a = new ah();

    public final aa createReceiveTask(y yVar) {
        return ah.b(yVar);
    }

    public final v createTask(y yVar) {
        return ah.a(yVar);
    }

    public final y createReceiverCommand(Intent intent) {
        y yVar;
        y yVar2;
        int intExtra = intent.getIntExtra("command", -1);
        if (intExtra < 0) {
            intExtra = intent.getIntExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, -1);
        }
        if (intExtra != 20) {
            switch (intExtra) {
                case 1:
                case 2:
                    yVar2 = new t(intExtra);
                    break;
                case 3:
                    yVar = new com.vivo.push.b.o();
                    break;
                case 4:
                    yVar = new q();
                    break;
                case 5:
                    yVar = new p();
                    break;
                case 6:
                    yVar = new r();
                    break;
                case e.l:
                    yVar = new n();
                    break;
                case 8:
                    yVar = new m();
                    break;
                case 9:
                    yVar = new l();
                    break;
                case 10:
                case 11:
                    yVar2 = new j(intExtra);
                    break;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    yVar = new k();
                    break;
                default:
                    yVar = null;
                    break;
            }
            yVar = yVar2;
        } else {
            yVar = new u();
        }
        if (yVar != null) {
            a a2 = a.a(intent);
            if (a2 == null) {
                com.vivo.push.util.o.b("PushCommand", "bundleWapper is null");
            } else {
                yVar.b(a2);
            }
        }
        return yVar;
    }
}
