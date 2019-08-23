package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ik;
import com.xiaomi.push.io;
import com.xiaomi.push.ix;
import com.xiaomi.push.jg;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class j extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f82575a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f993a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ List f994a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f82576b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(i iVar, int i, String str, List list, String str2) {
        super(i);
        this.f82575a = iVar;
        this.f993a = str;
        this.f994a = list;
        this.f82576b = str2;
    }

    public String a() {
        return "Send tiny data.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m637a() {
        String a2 = this.f82575a.a(this.f993a);
        ArrayList<jj> a3 = be.a(this.f994a, this.f993a, a2, 32768);
        b.a("TinyData LongConnUploader.upload pack notifications " + a3.toString() + "  ts:" + System.currentTimeMillis());
        if (a3 != null) {
            Iterator<jj> it2 = a3.iterator();
            while (it2.hasNext()) {
                jj next = it2.next();
                next.a("uploadWay", "longXMPushService");
                jg a4 = w.a(this.f993a, a2, next, ik.Notification);
                if (!TextUtils.isEmpty(this.f82576b) && !TextUtils.equals(this.f993a, this.f82576b)) {
                    if (a4.a() == null) {
                        ix ixVar = new ix();
                        ixVar.a("-1");
                        a4.a(ixVar);
                    }
                    a4.a().b("ext_traffic_source_pkg", this.f82576b);
                }
                this.f82575a.f82574a.a(this.f993a, ju.a(a4), true);
            }
            Iterator it3 = this.f994a.iterator();
            while (it3.hasNext()) {
                b.a("TinyData LongConnUploader.upload uploaded by com.xiaomi.push.service.TinyDataUploader.  item" + ((io) it3.next()).d() + "  ts:" + System.currentTimeMillis());
            }
            return;
        }
        b.d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
    }
}
