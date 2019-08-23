package cn.com.chinatelecom.a.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import cn.com.chinatelecom.a.a.e.d;
import cn.com.chinatelecom.a.a.e.g;
import cn.com.chinatelecom.a.a.e.i;
import cn.com.chinatelecom.a.a.f.b;
import cn.com.chinatelecom.a.a.f.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public class a extends b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f1643c = "a";
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public c f1644a = new c();

    /* access modifiers changed from: private */
    public b a(Context context, String str, String str2, String str3, boolean z, Network network) {
        cn.com.chinatelecom.a.a.d.a.b bVar;
        Context context2 = context;
        String str4 = str2;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(System.currentTimeMillis());
            String a2 = cn.com.chinatelecom.a.a.c.a.a();
            String str5 = cn.com.chinatelecom.a.a.d.b.f1702c;
            String d2 = g.d(context);
            String c2 = g.c(context);
            d.f(context);
            String a3 = cn.com.chinatelecom.a.a.d.a.a(context, str, str2, d2, c2, str3, a2);
            if (z) {
                bVar = cn.com.chinatelecom.a.a.d.a.a.a(context, str5, null, a3, z, network);
                Network network2 = network;
            } else {
                bVar = cn.com.chinatelecom.a.a.d.a.a.a(str5, null, a3, network);
            }
            e.a(context, bVar);
            b a4 = cn.com.chinatelecom.a.a.d.b.a.a(bVar, a2);
            String str6 = str;
            cn.com.chinatelecom.a.a.d.b.a(context, str, str4, str5, a4);
            if (a4 != null && a4.f1714a == 0) {
                return a4;
            }
            if (a4 != null && a4.f1714a == 30002) {
                if (a4.f1718e != null) {
                    if (!a4.f1718e.isEmpty()) {
                        return a(context, str, str2, a4.f1718e, a2, z, network);
                    }
                }
                return null;
            } else if (a4 != null) {
                return a4;
            } else {
                return null;
            }
        } catch (Exception unused) {
        }
    }

    private static b a(Context context, String str, String str2, List<String> list, String str3, boolean z, Network network) {
        int i = 0;
        while (i < list.size()) {
            try {
                String str4 = list.get(i);
                if (!TextUtils.isEmpty(list.get(i)) && context != null && z && Build.VERSION.SDK_INT < 21) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                        connectivityManager.requestRouteToHost(5, d.a(d.b(str4)));
                    }
                }
                String str5 = list.get(i);
                b a2 = cn.com.chinatelecom.a.a.d.b.a.a(cn.com.chinatelecom.a.a.d.a.a.a(str5, network), str3);
                cn.com.chinatelecom.a.a.d.b.a(context, str, str2, str5, a2);
                if (a2 != null) {
                    return a2;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, String str, String str2, b bVar, String str3, String str4, String str5) {
        b bVar2 = bVar;
        String str6 = "";
        String str7 = "";
        try {
            if (this.f1644a != null) {
                str6 = this.f1644a.f1720b;
                str7 = this.f1644a.f1719a;
            }
            String str8 = str6;
            String str9 = str7;
            if (bVar2 != null) {
                c.a(context, str, str2, "handlePreGetMobileResult", PushConstants.PUSH_TYPE_UPLOAD_LOG, "", "", "", str8, str9, "", bVar2.f1714a, bVar2.f1715b, bVar2.f1716c, str3);
                return;
            }
            c.a(context, str, str2, "handlePreGetMobileResult", PushConstants.PUSH_TYPE_UPLOAD_LOG, "", "", "", str8, str9, "", str4, str5, "", str3);
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ void a(a aVar, Context context, String str, String str2, b bVar, Network network, cn.com.chinatelecom.a.a.b.b bVar2, String str3) {
        if (bVar2 == null) {
            return;
        }
        if (bVar == null) {
            aVar.a(context, str, str2, (b) null, str3, "-8102", i.a(-8102));
            bVar2.a(-8102, i.a(-8102));
        } else if (bVar.f1714a == 0) {
            bVar2.a(bVar.f1714a, bVar.f1716c, bVar.f1715b, bVar.f1717d);
        } else {
            bVar2.a(bVar.f1714a, bVar.f1715b);
        }
    }
}
