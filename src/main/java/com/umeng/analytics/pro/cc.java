package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.q.c;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public final class cc {

    /* renamed from: a  reason: collision with root package name */
    private static cc f80565a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static Context f80566b;

    /* renamed from: c  reason: collision with root package name */
    private static String f80567c;

    /* renamed from: d  reason: collision with root package name */
    private a f80568d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f80570a;

        /* renamed from: b  reason: collision with root package name */
        private File f80571b;

        /* renamed from: c  reason: collision with root package name */
        private FilenameFilter f80572c;

        public boolean a() {
            File[] listFiles = this.f80571b.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return false;
            }
            return true;
        }

        public void b() {
            File[] listFiles = this.f80571b.listFiles(this.f80572c);
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        public int c() {
            File[] listFiles = this.f80571b.listFiles(this.f80572c);
            if (listFiles == null || listFiles.length <= 0) {
                return 0;
            }
            return listFiles.length;
        }

        public a(Context context) {
            this(context, ".um");
        }

        public void a(byte[] bArr) {
            if (bArr != null && bArr.length != 0) {
                try {
                    bw.a(new File(this.f80571b, String.format(Locale.US, "um_cache_%d.env", new Object[]{Long.valueOf(System.currentTimeMillis())})), bArr);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
            r3 = r0[r1];
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.umeng.analytics.pro.cc.b r6) {
            /*
                r5 = this;
                java.io.File r0 = r5.f80571b
                java.io.FilenameFilter r1 = r5.f80572c
                java.io.File[] r0 = r0.listFiles(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0028
                int r2 = r0.length
                r3 = 10
                if (r2 < r3) goto L_0x0028
                java.util.Arrays.sort(r0)
                int r2 = r0.length
                int r2 = r2 - r3
                com.umeng.analytics.pro.cc$a$1 r3 = new com.umeng.analytics.pro.cc$a$1
                r3.<init>(r2)
                com.umeng.analytics.pro.bz.b(r3)
                r3 = 0
            L_0x001e:
                if (r3 >= r2) goto L_0x0028
                r4 = r0[r3]
                r4.delete()
                int r3 = r3 + 1
                goto L_0x001e
            L_0x0028:
                if (r0 == 0) goto L_0x004f
                int r2 = r0.length
                if (r2 <= 0) goto L_0x004f
                java.io.File r2 = r5.f80571b
                r6.a(r2)
                int r2 = r0.length
            L_0x0033:
                if (r1 >= r2) goto L_0x004a
                r3 = r0[r1]     // Catch:{ Throwable -> 0x0042, all -> 0x0040 }
                boolean r3 = r6.b(r3)     // Catch:{ Throwable -> 0x0042, all -> 0x0040 }
                if (r3 == 0) goto L_0x0047
                r3 = r0[r1]
                goto L_0x0044
            L_0x0040:
                r6 = move-exception
                throw r6
            L_0x0042:
                r3 = r0[r1]
            L_0x0044:
                r3.delete()
            L_0x0047:
                int r1 = r1 + 1
                goto L_0x0033
            L_0x004a:
                java.io.File r0 = r5.f80571b
                r6.c(r0)
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.cc.a.a(com.umeng.analytics.pro.cc$b):void");
        }

        public a(Context context, String str) {
            this.f80570a = 10;
            this.f80572c = new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return str.startsWith("um");
                }
            };
            this.f80571b = new File(context.getFilesDir(), str);
            if (!this.f80571b.exists() || !this.f80571b.isDirectory()) {
                this.f80571b.mkdir();
            }
        }
    }

    public interface b {
        void a(File file);

        boolean b(File file);

        void c(File file);
    }

    public final a i() {
        return this.f80568d;
    }

    public final boolean h() {
        return this.f80568d.a();
    }

    private SharedPreferences k() {
        Context context = f80566b;
        return c.a(context, "mobclick_agent_user_" + f80567c, 0);
    }

    private String l() {
        return "mobclick_agent_header_" + f80567c;
    }

    public final void b() {
        k().edit().remove("au_p").remove("au_u").commit();
    }

    public final String c() {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            return a2.getString("appkey", null);
        }
        return null;
    }

    public final String d() {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            return a2.getString("channel", null);
        }
        return null;
    }

    public final String e() {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            return a2.getString(TimeDisplaySetting.START_SHOW_TIME, null);
        }
        return null;
    }

    public final int f() {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            return a2.getInt("vt", 0);
        }
        return 0;
    }

    public final void g() {
        f80566b.deleteFile(l());
        f80566b.deleteFile(m());
        w.a(f80566b).a(true, false);
        m.a(f80566b).b((f) new f() {
            public void a(Object obj, boolean z) {
                obj.equals("success");
            }
        });
    }

    private String m() {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            int i = a2.getInt("versioncode", 0);
            int parseInt = Integer.parseInt(bv.a(f80566b));
            if (i == 0 || parseInt == i) {
                return "mobclick_agent_cached_" + f80567c + bv.a(f80566b);
            }
            return "mobclick_agent_cached_" + f80567c + i;
        }
        return "mobclick_agent_cached_" + f80567c + bv.a(f80566b);
    }

    public final String[] a() {
        SharedPreferences k = k();
        String string = k.getString("au_p", null);
        String string2 = k.getString("au_u", null);
        if (string == null || string2 == null) {
            return null;
        }
        return new String[]{string, string2};
    }

    public final void a(byte[] bArr) {
        this.f80568d.a(bArr);
    }

    public cc(Context context) {
        this.f80568d = new a(context);
    }

    public final void a(int i) {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            a2.edit().putInt("vt", i).commit();
        }
    }

    public static synchronized cc a(Context context) {
        cc ccVar;
        synchronized (cc.class) {
            f80566b = context.getApplicationContext();
            f80567c = context.getPackageName();
            if (f80565a == null) {
                f80565a = new cc(context);
            }
            ccVar = f80565a;
        }
        return ccVar;
    }

    public final void b(String str) {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            a2.edit().putString("channel", str).commit();
        }
    }

    public final void c(String str) {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            a2.edit().putString(TimeDisplaySetting.START_SHOW_TIME, str).commit();
        }
    }

    public final void a(String str) {
        SharedPreferences a2 = ba.a(f80566b);
        if (a2 != null) {
            a2.edit().putString("appkey", str).commit();
        }
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = k().edit();
            edit.putString("au_p", str);
            edit.putString("au_u", str2);
            edit.commit();
        }
    }
}
