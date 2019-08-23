package com.ss.c.a.c;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ss.c.a.b;
import com.ss.c.a.c.b;
import com.ss.c.a.c.e;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f78330a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f78331b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f78332c;

    /* renamed from: d  reason: collision with root package name */
    private Context f78333d;

    /* renamed from: e  reason: collision with root package name */
    private Future f78334e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C0834a f78335f;
    private int g = 600000;
    private int h = -1;
    private int i = -1;
    private int j = -1;

    /* renamed from: com.ss.c.a.c.a$a  reason: collision with other inner class name */
    public interface C0834a {
        void a(String str, String str2, com.ss.c.a.a.a aVar, boolean z);
    }

    public final void a() {
        this.f78335f = null;
        if (this.f78334e != null && !this.f78334e.isDone()) {
            this.f78334e.cancel(true);
            this.f78334e = null;
        }
    }

    public static boolean b(String str) {
        if (str.length() < 7 || str.length() > 15 || "".equals(str)) {
            return false;
        }
        return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x004f
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0009
            goto L_0x004f
        L_0x0009:
            java.lang.String r0 = "://"
            int r0 = r6.indexOf(r0)
            int r0 = r0 + 3
            r5.h = r0
            r0 = -1
            r5.i = r0
            int r1 = r5.h
            int r2 = r6.length()
        L_0x001c:
            if (r1 >= r2) goto L_0x003c
            char r3 = r6.charAt(r1)
            r4 = 35
            if (r3 == r4) goto L_0x003c
            r4 = 47
            if (r3 == r4) goto L_0x003c
            r4 = 58
            if (r3 == r4) goto L_0x0037
            switch(r3) {
                case 63: goto L_0x003c;
                case 64: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0039
        L_0x0032:
            int r3 = r1 + 1
            r5.h = r3
            goto L_0x0039
        L_0x0037:
            r5.i = r1
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x003c:
            r5.j = r1
            int r1 = r5.i
            if (r1 != r0) goto L_0x0046
            int r0 = r5.j
            r5.i = r0
        L_0x0046:
            int r0 = r5.h
            int r1 = r5.i
            java.lang.String r6 = r6.substring(r0, r1)
            return r6
        L_0x004f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.c.a.c.a.a(java.lang.String):java.lang.String");
    }

    public final void a(final String str, C0834a aVar) {
        int i2;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (this.f78332c != null) {
                final boolean z = this.f78331b;
                a();
                this.f78335f = aVar;
                NetworkInfo a2 = d.a(this.f78333d);
                if (a2 == null || !a2.isAvailable()) {
                    str2 = null;
                    i2 = -1;
                } else {
                    i2 = a2.getType();
                    str2 = a2.getExtraInfo();
                }
                b.a();
                int c2 = b.c();
                boolean z2 = true;
                if (i2 != -1 && i2 == c2) {
                    b.a();
                    String d2 = b.d();
                    if (str2 == null || (d2 != null && str2.equals(d2))) {
                        z2 = false;
                    }
                }
                if (z2) {
                    b.a().b();
                    b.a();
                    b.c(str2);
                    b.a();
                    b.a(i2);
                }
                b.a a3 = b.a().a(str);
                if (a3 == null || System.currentTimeMillis() - a3.f78346b > ((long) this.g) || a3.f78347c) {
                    this.f78334e = this.f78332c.submit(new Runnable() {
                        public final void run() {
                            if (z) {
                                a aVar = a.this;
                                String str = str;
                                String format = String.format("http://%s/%s/d?host=%s", new Object[]{"203.107.1.4", "131950", str});
                                e.a(aVar.f78330a, format, aVar.a(format), new e.a(str) {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ String f78339a;

                                    public final void a(com.ss.c.a.a.a aVar) {
                                        a.this.a(true, this.f78339a, null, aVar, true);
                                    }

                                    public final void a(JSONObject jSONObject) {
                                        String str;
                                        JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                                        if (optJSONArray == null || optJSONArray.length() == 0) {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("host", this.f78339a);
                                            a.this.a(true, this.f78339a, null, new com.ss.c.a.a.a(-111, "http dns response ip empty", hashMap), true);
                                            return;
                                        }
                                        try {
                                            str = optJSONArray.getString(0);
                                        } catch (Exception unused) {
                                            str = null;
                                        }
                                        a.this.a(true, this.f78339a, str, null, true);
                                    }

                                    {
                                        this.f78339a = r2;
                                    }
                                });
                                return;
                            }
                            a aVar2 = a.this;
                            String str2 = str;
                            try {
                                InetAddress byName = InetAddress.getByName(str2);
                                if (byName == null) {
                                    aVar2.a(false, str2, null, new com.ss.c.a.a.a(-110, "", null), true);
                                    return;
                                }
                                String hostAddress = byName.getHostAddress();
                                if (byName instanceof Inet6Address) {
                                    hostAddress = String.format("[%s]", new Object[]{hostAddress});
                                }
                                aVar2.a(false, str2, hostAddress, null, true);
                            } catch (UnknownHostException e2) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("reason", "Unknown host name");
                                hashMap.put("host", str2);
                                hashMap.put("exception", e2.toString());
                                aVar2.a(false, str2, null, new com.ss.c.a.a.a(-110, "Unknown Host", hashMap), true);
                            }
                        }
                    });
                    return;
                }
                a(this.f78331b, str, a3.f78345a, null, false);
                return;
            }
            throw new IllegalStateException("mExecutor should not be null");
        }
    }

    public a(Context context, ExecutorService executorService, com.ss.c.a.b bVar) {
        this.f78333d = context;
        this.f78332c = executorService;
        this.f78330a = bVar;
    }

    public final String a(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        boolean startsWith = str.startsWith("http");
        String str3 = str.substring(0, this.h) + str2;
        int i2 = this.i;
        if (this.j != -1) {
            str3 = str3 + str.substring(this.i, this.j);
            i2 = this.j;
        }
        if (!startsWith) {
            str3 = str3 + "/" + a(str);
        } else if (map != null) {
            map.put("Host", String.format(" %s", new Object[]{a(str)}));
        }
        return str3 + str.substring(i2);
    }

    public final void a(boolean z, String str, String str2, com.ss.c.a.a.a aVar, boolean z2) {
        if (this.f78331b == z) {
            C0834a aVar2 = this.f78335f;
            if (aVar2 != null) {
                if (z2) {
                    b.a aVar3 = new b.a();
                    aVar3.f78346b = System.currentTimeMillis();
                    aVar3.f78345a = str2;
                    aVar3.f78347c = false;
                    b.a().a(str, aVar3);
                }
                aVar2.a(str, str2, aVar, z2);
            }
        }
    }
}
