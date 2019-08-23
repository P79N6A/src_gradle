package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.q.c;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f80935a;

    /* renamed from: b  reason: collision with root package name */
    private static Context f80936b;

    /* renamed from: c  reason: collision with root package name */
    private static String f80937c;

    /* renamed from: d  reason: collision with root package name */
    private a f80938d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f80939a;

        /* renamed from: b  reason: collision with root package name */
        private File f80940b;

        /* renamed from: c  reason: collision with root package name */
        private FilenameFilter f80941c;

        public boolean a() {
            File[] listFiles = this.f80940b.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return false;
            }
            return true;
        }

        public void b() {
            File[] listFiles = this.f80940b.listFiles(this.f80941c);
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        public int c() {
            File[] listFiles = this.f80940b.listFiles(this.f80941c);
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
                    HelperUtils.writeFile(new File(this.f80940b, String.format(Locale.US, "um_cache_%d.env", new Object[]{Long.valueOf(System.currentTimeMillis())})), bArr);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            r3 = r0[r1];
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.umeng.commonsdk.statistics.common.d.b r6) {
            /*
                r5 = this;
                java.io.File r0 = r5.f80940b
                java.io.FilenameFilter r1 = r5.f80941c
                java.io.File[] r0 = r0.listFiles(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0020
                int r2 = r0.length
                r3 = 10
                if (r2 < r3) goto L_0x0020
                java.util.Arrays.sort(r0)
                int r2 = r0.length
                int r2 = r2 - r3
                r3 = 0
            L_0x0016:
                if (r3 >= r2) goto L_0x0020
                r4 = r0[r3]
                r4.delete()
                int r3 = r3 + 1
                goto L_0x0016
            L_0x0020:
                if (r0 == 0) goto L_0x0047
                int r2 = r0.length
                if (r2 <= 0) goto L_0x0047
                java.io.File r2 = r5.f80940b
                r6.a(r2)
                int r2 = r0.length
            L_0x002b:
                if (r1 >= r2) goto L_0x0042
                r3 = r0[r1]     // Catch:{ Throwable -> 0x003a, all -> 0x0038 }
                boolean r3 = r6.b(r3)     // Catch:{ Throwable -> 0x003a, all -> 0x0038 }
                if (r3 == 0) goto L_0x003f
                r3 = r0[r1]
                goto L_0x003c
            L_0x0038:
                r6 = move-exception
                throw r6
            L_0x003a:
                r3 = r0[r1]
            L_0x003c:
                r3.delete()
            L_0x003f:
                int r1 = r1 + 1
                goto L_0x002b
            L_0x0042:
                java.io.File r0 = r5.f80940b
                r6.c(r0)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.d.a.a(com.umeng.commonsdk.statistics.common.d$b):void");
        }

        public a(Context context, String str) {
            this.f80939a = 10;
            this.f80941c = new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return str.startsWith("um");
                }
            };
            this.f80940b = new File(context.getFilesDir(), str);
            if (!this.f80940b.exists() || !this.f80940b.isDirectory()) {
                this.f80940b.mkdir();
            }
        }
    }

    public interface b {
        void a(File file);

        boolean b(File file);

        void c(File file);
    }

    public final boolean c() {
        if (UMFrUtils.envelopeFileNumber(f80936b) > 0) {
            return true;
        }
        return false;
    }

    private SharedPreferences f() {
        Context context = f80936b;
        return c.a(context, "mobclick_agent_user_" + f80937c, 0);
    }

    public final int a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f80936b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    public final String b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f80936b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(TimeDisplaySetting.START_SHOW_TIME, null);
        }
        return null;
    }

    public final String[] d() {
        try {
            SharedPreferences f2 = f();
            String string = f2.getString("au_p", null);
            String string2 = f2.getString("au_u", null);
            if (!(string == null || string2 == null)) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void e() {
        f().edit().remove("au_p").remove("au_u").commit();
    }

    public d(Context context) {
        this.f80938d = new a(context);
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            f80936b = context.getApplicationContext();
            f80937c = context.getPackageName();
            if (f80935a == null) {
                f80935a = new d(context);
            }
            dVar = f80935a;
        }
        return dVar;
    }

    public final void a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f80936b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    public final void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f80936b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(TimeDisplaySetting.START_SHOW_TIME, str).commit();
        }
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = f().edit();
            edit.putString("au_p", str);
            edit.putString("au_u", str2);
            edit.commit();
        }
    }
}
