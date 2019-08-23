package io.fabric.sdk.android.services.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import io.fabric.sdk.android.i;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public final class s {
    private static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    private static final String h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final boolean f83193a;

    /* renamed from: b  reason: collision with root package name */
    public final String f83194b;

    /* renamed from: c  reason: collision with root package name */
    c f83195c;

    /* renamed from: d  reason: collision with root package name */
    b f83196d;

    /* renamed from: e  reason: collision with root package name */
    boolean f83197e;

    /* renamed from: f  reason: collision with root package name */
    r f83198f;
    private final ReentrantLock i = new ReentrantLock();
    private final t j;
    private final boolean k;
    private final Context l;
    private final String m;
    private final Collection<i> n;

    public enum a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(BaseLoginOrRegisterActivity.o),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        private a(int i) {
            this.protobufIndex = i;
        }
    }

    public final String b() {
        return a(Build.VERSION.RELEASE);
    }

    public final String c() {
        return a(Build.VERSION.INCREMENTAL);
    }

    public final String f() {
        return this.j.a(this.l);
    }

    private synchronized b h() {
        if (!this.f83197e) {
            this.f83196d = this.f83195c.a();
            this.f83197e = true;
        }
        return this.f83196d;
    }

    public final String a() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        SharedPreferences a2 = i.a(this.l);
        b(a2);
        String string = a2.getString("crashlytics.installation.id", null);
        if (string == null) {
            return a(a2);
        }
        return string;
    }

    public final String d() {
        return String.format(Locale.US, "%s/%s", new Object[]{a(Build.MANUFACTURER), a(Build.MODEL)});
    }

    public final Boolean g() {
        boolean z;
        if (!this.k || this.f83198f.a(this.l)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        b h2 = h();
        if (h2 != null) {
            return Boolean.valueOf(h2.f83161b);
        }
        return null;
    }

    public final Map<a, String> e() {
        HashMap hashMap = new HashMap();
        for (i next : this.n) {
            if (next instanceof n) {
                for (Map.Entry entry : ((n) next).getDeviceIdentifiers().entrySet()) {
                    a(hashMap, (a) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static String a(String str) {
        return str.replaceAll(h, "");
    }

    private void b(SharedPreferences sharedPreferences) {
        b h2 = h();
        if (h2 != null) {
            a(sharedPreferences, h2.f83160a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private String a(SharedPreferences sharedPreferences) {
        this.i.lock();
        String str = null;
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string == null) {
                String uuid = UUID.randomUUID().toString();
                if (uuid != null) {
                    str = g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
                }
                string = str;
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            return string;
        } finally {
            this.i.unlock();
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private void a(SharedPreferences sharedPreferences, String str) {
        this.i.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString("crashlytics.advertising.id", null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString("crashlytics.advertising.id", str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str).commit();
                }
                this.i.unlock();
            }
        } finally {
            this.i.unlock();
        }
    }

    private static void a(Map<a, String> map, a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    public s(Context context, String str, String str2, Collection<i> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.l = context;
            this.f83194b = str;
            this.m = str2;
            this.n = collection;
            this.j = new t();
            this.f83195c = new c(context);
            this.f83198f = new r();
            this.k = i.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (!this.k) {
                new StringBuilder("Device ID collection disabled for ").append(context.getPackageName());
            }
            this.f83193a = i.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f83193a) {
                new StringBuilder("User information collection disabled for ").append(context.getPackageName());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }
}
