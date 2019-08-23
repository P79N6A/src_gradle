package com.ss.optimizer.live.sdk.dns;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class e extends k {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public j call() throws Exception {
        boolean z;
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f78468b);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress hostAddress : allByName) {
                    String hostAddress2 = hostAddress.getHostAddress();
                    if (k.f78467a == null) {
                        k.f78467a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
                    }
                    if (TextUtils.isEmpty(hostAddress2) || hostAddress2.length() < 7 || hostAddress2.length() > 15 || !k.f78467a.matcher(hostAddress2).matches()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(hostAddress2);
                    }
                }
            }
            if (f.f78449a) {
                StringBuilder sb = new StringBuilder("succeed, host= ");
                sb.append(this.f78468b);
                sb.append(", ips= ");
                sb.append(arrayList);
            }
            return new j(this.f78468b, arrayList, 0);
        } catch (UnknownHostException unused) {
            if (f.f78449a) {
                new StringBuilder("failed, host= ").append(this.f78468b);
            }
            return new j(this.f78468b, null, 0);
        }
    }

    e(String str) {
        super(str);
    }
}
