package com.cmic.sso.sdk.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.cmic.sso.sdk.d.f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f22948a;

    /* renamed from: b  reason: collision with root package name */
    private static long f22949b;

    /* renamed from: c  reason: collision with root package name */
    private C0247b f22950c;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: com.cmic.sso.sdk.a.b$b  reason: collision with other inner class name */
    public static class C0247b {

        /* renamed from: a  reason: collision with root package name */
        private String f22951a = "";

        /* renamed from: b  reason: collision with root package name */
        private String f22952b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f22953c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f22954d = "";
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f22955e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f22956f;
        private int g = -1;
        private int h = -1;
        private int i = -1;
        private int j = -1;
        private String k = "";
        private String l = "";
        /* access modifiers changed from: private */
        public int m = -1;
        /* access modifiers changed from: private */
        public int n = -1;

        public String c() {
            return this.f22954d;
        }

        public String d() {
            return this.l;
        }

        public int f() {
            return this.m;
        }

        public int g() {
            return this.g;
        }

        public int h() {
            return this.h;
        }

        public String a() {
            return this.f22952b;
        }

        public String b() {
            return this.f22953c;
        }

        public boolean e() {
            return this.f22956f;
        }

        public int i() {
            if ((!TextUtils.isEmpty(this.f22954d) && !TextUtils.isEmpty(this.f22953c)) || (!TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.l))) {
                return 2;
            }
            if (!TextUtils.isEmpty(this.f22953c) || !TextUtils.isEmpty(this.f22954d) || !TextUtils.isEmpty(this.k) || !TextUtils.isEmpty(this.l)) {
                return 1;
            }
            return 0;
        }

        /* access modifiers changed from: protected */
        public void e(int i2) {
            this.j = i2;
        }

        /* access modifiers changed from: protected */
        public void c(int i2) {
            this.h = i2;
        }

        /* access modifiers changed from: protected */
        public void d(int i2) {
            this.i = i2;
        }

        /* access modifiers changed from: protected */
        public void e(String str) {
            if (str != null) {
                this.k = str;
            }
        }

        /* access modifiers changed from: protected */
        public void f(String str) {
            this.l = str;
        }

        /* access modifiers changed from: protected */
        public void c(String str) {
            if (str != null) {
                this.f22953c = str;
            }
        }

        /* access modifiers changed from: protected */
        public void d(String str) {
            if (str != null) {
                this.f22954d = str;
            }
        }

        /* access modifiers changed from: protected */
        public void a(int i2) {
            this.m = i2;
        }

        /* access modifiers changed from: protected */
        public void b(int i2) {
            this.g = i2;
        }

        public String f(int i2) {
            if (this.g == i2) {
                return this.f22953c;
            }
            if (this.h == i2) {
                return this.f22954d;
            }
            return "";
        }

        public String g(int i2) {
            if (this.g == i2) {
                return this.f22951a;
            }
            if (this.h == i2) {
                return this.f22952b;
            }
            return "";
        }

        /* access modifiers changed from: protected */
        public void a(String str) {
            if (str != null) {
                this.f22951a = str;
            }
        }

        /* access modifiers changed from: protected */
        public void b(String str) {
            if (str != null) {
                this.f22952b = str;
            }
        }

        /* access modifiers changed from: protected */
        public void a(boolean z) {
            this.f22955e = z;
        }

        /* access modifiers changed from: protected */
        public void b(boolean z) {
            this.f22956f = z;
        }
    }

    private b() {
    }

    public static b a() {
        if (f22948a == null) {
            f22948a = new b();
        }
        return f22948a;
    }

    @SuppressLint({"NewApi"})
    private void f(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            List<SubscriptionInfo> h = h(context);
            a(h, telephonyManager);
            b(h, telephonyManager);
        }
    }

    @SuppressLint({"NewApi"})
    private List<SubscriptionInfo> h(Context context) {
        SubscriptionManager from = SubscriptionManager.from(context.getApplicationContext());
        if (from != null) {
            return from.getActiveSubscriptionInfoList();
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    private void d(Context context) {
        if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager from = SubscriptionManager.from(context.getApplicationContext());
            if (from != null) {
                try {
                    SubscriptionInfo a2 = a((Object) from, "getDefaultDataSubscriptionInfo", (Object[]) null);
                    if (a2 != null) {
                        int unused = this.f22950c.m = a2.getSimSlotIndex();
                    }
                } catch (a unused2) {
                }
            }
            return;
        }
        int unused3 = this.f22950c.m = -1;
    }

    public String c(Context context) {
        switch (i(context)) {
            case 1:
            case 2:
            case 4:
            case e.l /*?: ONE_ARG  (7 int)*/:
            case 11:
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
            case 14:
            case 15:
            case 17:
                return PushConstants.PUSH_TYPE_UPLOAD_LOG;
            case 13:
            case 18:
            case 19:
                return "3";
            default:
                return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    private void e(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1 && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    int unused = this.f22950c.n = 1;
                } else if (activeNetworkInfo.getType() == 0 && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    int unused2 = this.f22950c.n = 0;
                } else {
                    int unused3 = this.f22950c.n = -1;
                }
            }
        }
    }

    private int i(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager == null) {
            return -1;
        }
        try {
            String a2 = a(telephonyManager, "getDataNetworkType", a(context).f());
            f.b("UMCTelephonyManagement", "data dataNetworkType ---------" + a2);
            int parseInt = Integer.parseInt(a2);
            f.b("UMCTelephonyManagement", "data dataNetworkType ---------" + parseInt);
            return parseInt;
        } catch (Exception unused) {
            f.a("UMCTelephonyManagement", "data dataNetworkType ----反射出错-----");
            return -1;
        }
    }

    public b b(Context context) {
        if (System.currentTimeMillis() - f22949b < 5000) {
            return this;
        }
        this.f22950c = new C0247b();
        if (Build.VERSION.SDK_INT >= 22) {
            f(context);
        } else {
            g(context);
        }
        d(context);
        e(context);
        f22949b = System.currentTimeMillis();
        return this;
    }

    private void g(Context context) {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        this.f22950c.b(0);
        this.f22950c.c(1);
        this.f22950c.a(-1);
        try {
            this.f22950c.a(a(telephonyManager, "getDeviceId", 0));
            this.f22950c.b(a(telephonyManager, "getDeviceId", 1));
        } catch (a unused) {
            try {
                this.f22950c.a(a(telephonyManager, "getDeviceIdGemini", 0));
                this.f22950c.b(a(telephonyManager, "getDeviceIdGemini", 1));
            } catch (a unused2) {
                this.f22950c.a(telephonyManager.getDeviceId());
            }
        }
        try {
            this.f22950c.c(a(telephonyManager, "getSubscriberId", 0));
            this.f22950c.d(a(telephonyManager, "getSubscriberId", 1));
        } catch (a unused3) {
            try {
                this.f22950c.c(a(telephonyManager, "getSubscriberIdGemini", 0));
                this.f22950c.d(a(telephonyManager, "getSubscriberIdGemini", 1));
            } catch (a unused4) {
                this.f22950c.c(telephonyManager.getSubscriberId());
            }
        }
        try {
            this.f22950c.a(b(telephonyManager, "getSimState", 0));
            this.f22950c.b(b(telephonyManager, "getSimState", 1));
        } catch (a unused5) {
            try {
                this.f22950c.a(b(telephonyManager, "getSimStateGemini", 0));
                this.f22950c.b(b(telephonyManager, "getSimStateGemini", 1));
            } catch (a unused6) {
                if (telephonyManager.getSimState() == 5) {
                    z = true;
                } else {
                    z = false;
                }
                this.f22950c.a(z);
            }
        }
        try {
            this.f22950c.e(a(telephonyManager, "getSimOperator", 0));
            this.f22950c.f(a(telephonyManager, "getSimOperator", 1));
        } catch (a unused7) {
            try {
                this.f22950c.e(a(telephonyManager, "getSimOperatorGemini", 0));
                this.f22950c.f(a(telephonyManager, "getSimOperatorGemini", 1));
            } catch (a unused8) {
                this.f22950c.e(telephonyManager.getSimOperator());
            }
        }
        if (TextUtils.isEmpty(this.f22950c.b()) && !TextUtils.isEmpty(this.f22950c.c())) {
            this.f22950c.a(this.f22950c.a());
            this.f22950c.b("");
            this.f22950c.c(this.f22950c.c());
            this.f22950c.d("");
            this.f22950c.b(this.f22950c.h());
            this.f22950c.c(-1);
            this.f22950c.a(this.f22950c.e());
            this.f22950c.b(false);
            this.f22950c.e(this.f22950c.d());
            this.f22950c.f("");
            this.f22950c.a(this.f22950c.g());
        } else if (TextUtils.isEmpty(this.f22950c.b()) || !TextUtils.isEmpty(this.f22950c.c())) {
            if (TextUtils.isEmpty(this.f22950c.b()) && TextUtils.isEmpty(this.f22950c.c())) {
                this.f22950c.a("");
                this.f22950c.b("");
                this.f22950c.b(-1);
                this.f22950c.c(-1);
                this.f22950c.a(false);
                this.f22950c.b(false);
                this.f22950c.a(-1);
            }
        } else {
            this.f22950c.b("");
            this.f22950c.b(false);
            this.f22950c.c(-1);
            this.f22950c.a(this.f22950c.g());
        }
    }

    public C0247b a(Context context) {
        if (this.f22950c == null) {
            b(context);
        }
        return this.f22950c;
    }

    @SuppressLint({"NewApi"})
    private SubscriptionInfo a(List<SubscriptionInfo> list, int i) {
        SubscriptionInfo subscriptionInfo = list.get(0);
        for (SubscriptionInfo next : list) {
            if (next.getSimSlotIndex() == i) {
                subscriptionInfo = next;
            }
        }
        return subscriptionInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5.f22950c.e(a(r7, "getSimOperatorGemini", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d2, code lost:
        r5.f22950c.e(r7.getSimOperator());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c6 */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.List<android.telephony.SubscriptionInfo> r6, android.telephony.TelephonyManager r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0008
            int r1 = r6.size()
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            r2 = 1
            if (r1 != r2) goto L_0x0013
            java.lang.Object r6 = r6.get(r0)
            android.telephony.SubscriptionInfo r6 = (android.telephony.SubscriptionInfo) r6
            goto L_0x0019
        L_0x0013:
            if (r1 <= r2) goto L_0x00dc
            android.telephony.SubscriptionInfo r6 = r5.a((java.util.List<android.telephony.SubscriptionInfo>) r6, (int) r0)
        L_0x0019:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c
            int r3 = r6.getSimSlotIndex()
            r1.b((int) r3)
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c
            int r3 = r6.getSubscriptionId()
            r1.d((int) r3)
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c     // Catch:{ a -> 0x003b }
            java.lang.String r3 = "getDeviceId"
            int r4 = r6.getSimSlotIndex()     // Catch:{ a -> 0x003b }
            java.lang.String r3 = r5.a((android.telephony.TelephonyManager) r7, (java.lang.String) r3, (int) r4)     // Catch:{ a -> 0x003b }
            r1.a((java.lang.String) r3)     // Catch:{ a -> 0x003b }
            goto L_0x0054
        L_0x003b:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c     // Catch:{ a -> 0x004b }
            java.lang.String r3 = "getDeviceIdGemini"
            int r4 = r6.getSimSlotIndex()     // Catch:{ a -> 0x004b }
            java.lang.String r3 = r5.a((android.telephony.TelephonyManager) r7, (java.lang.String) r3, (int) r4)     // Catch:{ a -> 0x004b }
            r1.a((java.lang.String) r3)     // Catch:{ a -> 0x004b }
            goto L_0x0054
        L_0x004b:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c
            java.lang.String r3 = r7.getDeviceId()
            r1.a((java.lang.String) r3)
        L_0x0054:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c     // Catch:{ a -> 0x0064 }
            java.lang.String r3 = "getSimState"
            int r4 = r6.getSimSlotIndex()     // Catch:{ a -> 0x0064 }
            boolean r3 = r5.b(r7, r3, r4)     // Catch:{ a -> 0x0064 }
            boolean unused = r1.f22955e = r3     // Catch:{ a -> 0x0064 }
            goto L_0x0082
        L_0x0064:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c     // Catch:{ a -> 0x0074 }
            java.lang.String r3 = "getSimStateGemini"
            int r4 = r6.getSimSlotIndex()     // Catch:{ a -> 0x0074 }
            boolean r3 = r5.b(r7, r3, r4)     // Catch:{ a -> 0x0074 }
            boolean unused = r1.f22955e = r3     // Catch:{ a -> 0x0074 }
            goto L_0x0082
        L_0x0074:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c
            int r3 = r7.getSimState()
            r4 = 5
            if (r3 != r4) goto L_0x007f
            r0 = 1
        L_0x007f:
            r1.a((boolean) r0)
        L_0x0082:
            int r0 = com.cmic.sso.sdk.a.a.a()
            if (r0 != 0) goto L_0x008d
            int r0 = r6.getSimSlotIndex()
            goto L_0x0091
        L_0x008d:
            int r0 = r6.getSubscriptionId()
        L_0x0091:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c     // Catch:{ a -> 0x00a1 }
            java.lang.String r2 = "getSubscriberId"
            int r3 = r6.getSubscriptionId()     // Catch:{ a -> 0x00a1 }
            java.lang.String r2 = r5.a((android.telephony.TelephonyManager) r7, (java.lang.String) r2, (int) r3)     // Catch:{ a -> 0x00a1 }
            r1.c((java.lang.String) r2)     // Catch:{ a -> 0x00a1 }
            goto L_0x00b6
        L_0x00a1:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c     // Catch:{ a -> 0x00ad }
            java.lang.String r2 = "getSubscriberIdGemini"
            java.lang.String r2 = r5.a((android.telephony.TelephonyManager) r7, (java.lang.String) r2, (int) r0)     // Catch:{ a -> 0x00ad }
            r1.c((java.lang.String) r2)     // Catch:{ a -> 0x00ad }
            goto L_0x00b6
        L_0x00ad:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c
            java.lang.String r2 = r7.getSubscriberId()
            r1.c((java.lang.String) r2)
        L_0x00b6:
            com.cmic.sso.sdk.a.b$b r1 = r5.f22950c     // Catch:{ a -> 0x00c6 }
            java.lang.String r2 = "getSimOperator"
            int r6 = r6.getSubscriptionId()     // Catch:{ a -> 0x00c6 }
            java.lang.String r6 = r5.a((android.telephony.TelephonyManager) r7, (java.lang.String) r2, (int) r6)     // Catch:{ a -> 0x00c6 }
            r1.e((java.lang.String) r6)     // Catch:{ a -> 0x00c6 }
            return
        L_0x00c6:
            com.cmic.sso.sdk.a.b$b r6 = r5.f22950c     // Catch:{ a -> 0x00d2 }
            java.lang.String r1 = "getSimOperatorGemini"
            java.lang.String r0 = r5.a((android.telephony.TelephonyManager) r7, (java.lang.String) r1, (int) r0)     // Catch:{ a -> 0x00d2 }
            r6.e((java.lang.String) r0)     // Catch:{ a -> 0x00d2 }
            return
        L_0x00d2:
            com.cmic.sso.sdk.a.b$b r6 = r5.f22950c
            java.lang.String r7 = r7.getSimOperator()
            r6.e((java.lang.String) r7)
            return
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.a.b.a(java.util.List, android.telephony.TelephonyManager):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:5|6|7|8|9|10|(2:11|12)|14|(1:16)|17|18|19|20|21|22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:5|6|7|8|9|10|11|12|14|(1:16)|17|18|19|20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.f22950c.f(a(r6, "getSimOperatorGemini", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.List<android.telephony.SubscriptionInfo> r5, android.telephony.TelephonyManager r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0007
            int r0 = r5.size()
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r1 = 1
            if (r0 <= r1) goto L_0x0093
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c     // Catch:{ a -> 0x0017 }
            java.lang.String r2 = "getDeviceId"
            java.lang.String r2 = r4.a((android.telephony.TelephonyManager) r6, (java.lang.String) r2, (int) r1)     // Catch:{ a -> 0x0017 }
            r0.b((java.lang.String) r2)     // Catch:{ a -> 0x0017 }
            goto L_0x0022
        L_0x0017:
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c     // Catch:{ a -> 0x0022 }
            java.lang.String r2 = "getDeviceIdGemini"
            java.lang.String r2 = r4.a((android.telephony.TelephonyManager) r6, (java.lang.String) r2, (int) r1)     // Catch:{ a -> 0x0022 }
            r0.b((java.lang.String) r2)     // Catch:{ a -> 0x0022 }
        L_0x0022:
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c     // Catch:{ a -> 0x002e }
            java.lang.String r2 = "getSimState"
            boolean r2 = r4.b(r6, r2, r1)     // Catch:{ a -> 0x002e }
            boolean unused = r0.f22956f = r2     // Catch:{ a -> 0x002e }
            goto L_0x003b
        L_0x002e:
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c     // Catch:{ a -> 0x003a }
            java.lang.String r2 = "getSimStateGemini"
            boolean r2 = r4.b(r6, r2, r1)     // Catch:{ a -> 0x003a }
            boolean unused = r0.f22956f = r2     // Catch:{ a -> 0x003a }
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            android.telephony.SubscriptionInfo r5 = r4.a((java.util.List<android.telephony.SubscriptionInfo>) r5, (int) r1)
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c
            int r2 = r5.getSimSlotIndex()
            r0.c((int) r2)
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c
            int r2 = r5.getSubscriptionId()
            r0.e((int) r2)
            int r0 = com.cmic.sso.sdk.a.a.a()
            if (r0 != 0) goto L_0x0058
            goto L_0x005c
        L_0x0058:
            int r1 = r5.getSubscriptionId()
        L_0x005c:
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c     // Catch:{ a -> 0x006c }
            java.lang.String r2 = "getSubscriberId"
            int r3 = r5.getSubscriptionId()     // Catch:{ a -> 0x006c }
            java.lang.String r2 = r4.a((android.telephony.TelephonyManager) r6, (java.lang.String) r2, (int) r3)     // Catch:{ a -> 0x006c }
            r0.d((java.lang.String) r2)     // Catch:{ a -> 0x006c }
            goto L_0x0077
        L_0x006c:
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c     // Catch:{ a -> 0x0077 }
            java.lang.String r2 = "getSubscriberIdGemini"
            java.lang.String r2 = r4.a((android.telephony.TelephonyManager) r6, (java.lang.String) r2, (int) r1)     // Catch:{ a -> 0x0077 }
            r0.d((java.lang.String) r2)     // Catch:{ a -> 0x0077 }
        L_0x0077:
            com.cmic.sso.sdk.a.b$b r0 = r4.f22950c     // Catch:{ a -> 0x0087 }
            java.lang.String r2 = "getSimOperator"
            int r5 = r5.getSubscriptionId()     // Catch:{ a -> 0x0087 }
            java.lang.String r5 = r4.a((android.telephony.TelephonyManager) r6, (java.lang.String) r2, (int) r5)     // Catch:{ a -> 0x0087 }
            r0.f((java.lang.String) r5)     // Catch:{ a -> 0x0087 }
            return
        L_0x0087:
            com.cmic.sso.sdk.a.b$b r5 = r4.f22950c     // Catch:{ a -> 0x0093 }
            java.lang.String r0 = "getSimOperatorGemini"
            java.lang.String r6 = r4.a((android.telephony.TelephonyManager) r6, (java.lang.String) r0, (int) r1)     // Catch:{ a -> 0x0093 }
            r5.f((java.lang.String) r6)     // Catch:{ a -> 0x0093 }
            return
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.a.b.b(java.util.List, android.telephony.TelephonyManager):void");
    }

    private SubscriptionInfo a(Object obj, String str, Object[] objArr) throws a {
        return (SubscriptionInfo) a(obj, str, objArr, null);
    }

    private boolean b(TelephonyManager telephonyManager, String str, int i) throws a {
        Object a2 = a(telephonyManager, str, new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
        if (a2 == null || Integer.parseInt(a2.toString()) != 5) {
            return false;
        }
        return true;
    }

    private String a(TelephonyManager telephonyManager, String str, int i) throws a {
        Object a2 = a(telephonyManager, str, new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }

    private Object a(Object obj, String str, Object[] objArr, Class[] clsArr) throws a {
        try {
            Class<?> cls = Class.forName(obj.getClass().getName());
            if (objArr == null || clsArr == null) {
                return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
            }
            return cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception unused) {
            throw new a(str);
        }
    }
}
