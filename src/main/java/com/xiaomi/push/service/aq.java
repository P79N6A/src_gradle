package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.at;
import com.xiaomi.push.dp;
import com.xiaomi.push.ds;
import com.xiaomi.push.dt;
import com.xiaomi.push.fh;
import com.xiaomi.push.fi;
import com.xiaomi.push.gf;
import com.xiaomi.push.gq;
import com.xiaomi.push.hs;
import com.xiaomi.push.ic;
import com.xiaomi.push.ie;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.u;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class aq extends ba.a implements dt.a {

    /* renamed from: a  reason: collision with root package name */
    private long f82521a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f948a;

    static class a implements dt.b {
        a() {
        }

        public String a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", "38");
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", hs.a(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(u.a()));
            String builder = buildUpon.toString();
            com.xiaomi.channel.commonutils.logger.b.c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = at.a(u.a(), url);
                long currentTimeMillis2 = System.currentTimeMillis();
                ie.a(url.getHost() + ":" + port, (int) (currentTimeMillis2 - currentTimeMillis), null);
                return a2;
            } catch (IOException e2) {
                ie.a(url.getHost() + ":" + port, -1, e2);
                throw e2;
            }
        }
    }

    static class b extends dt {
        protected b(Context context, ds dsVar, dt.b bVar, String str) {
            super(context, dsVar, bVar, str);
        }

        public String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (ic.a().a()) {
                    str2 = ba.a();
                }
                return super.a(arrayList, str, str2, z);
            } catch (IOException e2) {
                ie.a(0, gf.GSLB_ERR.a(), 1, null, at.b(f81953a) ? 1 : 0);
                throw e2;
            }
        }
    }

    aq(XMPushService xMPushService) {
        this.f948a = xMPushService;
    }

    public static void a(XMPushService xMPushService) {
        aq aqVar = new aq(xMPushService);
        ba.a().a((ba.a) aqVar);
        synchronized (dt.class) {
            try {
                dt.a((dt.a) aqVar);
                dt.a(xMPushService, null, new a(), PushConstants.PUSH_TYPE_NOTIFY, "push", "2.2");
            } catch (Throwable th) {
                Class<dt> cls = dt.class;
                throw th;
            }
        }
    }

    public dt a(Context context, ds dsVar, dt.b bVar, String str) {
        return new b(context, dsVar, bVar, str);
    }

    public void a(fh.a aVar) {
    }

    public void a(fi.b bVar) {
        boolean z;
        if (bVar.b() && bVar.a() && System.currentTimeMillis() - this.f82521a > 3600000) {
            com.xiaomi.channel.commonutils.logger.b.a("fetch bucket :" + bVar.a());
            this.f82521a = System.currentTimeMillis();
            dt a2 = dt.a();
            a2.a();
            a2.b();
            gq a3 = this.f948a.a();
            if (a3 != null) {
                dp b2 = a2.b(a3.a().c());
                if (b2 != null) {
                    ArrayList a4 = b2.a();
                    Iterator it2 = a4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((String) it2.next()).equals(a3.a())) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z && !a4.isEmpty()) {
                        com.xiaomi.channel.commonutils.logger.b.a("bucket changed, force reconnect");
                        this.f948a.a(0, (Exception) null);
                        this.f948a.a(false);
                    }
                }
            }
        }
    }
}
