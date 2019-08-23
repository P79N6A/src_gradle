package com.bytedance.apm.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.apm.k.i;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d implements SharedPreferences {

    /* renamed from: d  reason: collision with root package name */
    private static int f1942d = -1;

    /* renamed from: a  reason: collision with root package name */
    public Application f1943a;

    /* renamed from: b  reason: collision with root package name */
    public String f1944b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f1945c = Uri.parse(this.f1944b);

    class a implements SharedPreferences.Editor {

        /* renamed from: b  reason: collision with root package name */
        private boolean f18942b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap<String, Object> f18943c;

        public final boolean commit() {
            apply();
            return true;
        }

        public final SharedPreferences.Editor clear() {
            this.f18943c.clear();
            this.f18942b = true;
            return this;
        }

        public final void apply() {
            if (this.f18942b || !this.f18943c.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.f18942b) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList arrayList = new ArrayList(this.f18943c.size());
                for (Map.Entry next : this.f18943c.entrySet()) {
                    arrayList.add(new e((String) next.getKey(), next.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    d.this.f1943a.getContentResolver().call(d.this.f1945c, d.this.f1944b, "edit", bundle);
                } catch (Exception e2) {
                    com.bytedance.apm.d.a().a(e2, "MonitorSharedPreferences$EditorImpl: apply");
                }
            }
        }

        public final SharedPreferences.Editor remove(String str) {
            this.f18943c.put(str, null);
            return this;
        }

        private a() {
            this.f18943c = new HashMap<>();
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            this.f18943c.put(str, str2);
            return this;
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f18943c.put(str, Boolean.valueOf(z));
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f2) {
            this.f18943c.put(str, Float.valueOf(f2));
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            this.f18943c.put(str, Integer.valueOf(i));
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            this.f18943c.put(str, Long.valueOf(j));
            return this;
        }

        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.f18943c.put(str, i.a(set));
            return this;
        }
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final SharedPreferences.Editor edit() {
        return new a(this, (byte) 0);
    }

    public final Map<String, ?> getAll() {
        ArrayList<e> a2 = a((String) null, (Object) null);
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<e> it2 = a2.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            hashMap.put(next.f18944a, next.f18945b);
        }
        return hashMap;
    }

    private static int a(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Bundle call = contentResolver.call(Uri.parse("content://" + context.getPackageName() + ".apm"), "getPid", null, null);
            if (call != null) {
                return call.getInt("Pid", -1);
            }
        } catch (Exception e2) {
            com.bytedance.apm.d.a().a(e2, "MonitorSharedPreferences: getProviderPID");
        }
        return -1;
    }

    public final boolean contains(String str) {
        Bundle bundle;
        String str2;
        try {
            ContentResolver contentResolver = this.f1943a.getContentResolver();
            Uri uri = this.f1945c;
            if (str != null) {
                str2 = this.f1944b + "/" + str;
            } else {
                str2 = this.f1944b;
            }
            bundle = contentResolver.call(uri, str2, "contains", null);
        } catch (Exception e2) {
            com.bytedance.apm.d.a().a(e2, "MonitorSharedPreferences: contains");
            bundle = null;
        }
        if (bundle == null || !bundle.getBoolean("contains")) {
            return false;
        }
        return true;
    }

    public final String getString(String str, String str2) {
        ArrayList<e> a2 = a(str, (Object) str2);
        if (a2 == null) {
            return null;
        }
        return (String) a2.get(0).f18945b;
    }

    private d(Application application, String str) {
        this.f1943a = application;
        this.f1944b = "content://" + application.getPackageName() + ".apm/sp/" + str;
    }

    public final boolean getBoolean(String str, boolean z) {
        ArrayList<e> a2 = a(str, (Object) String.valueOf(z));
        if (a2 == null) {
            return z;
        }
        Object obj = a2.get(0).f18945b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public final float getFloat(String str, float f2) {
        ArrayList<e> a2 = a(str, (Object) String.valueOf(f2));
        if (a2 == null) {
            return f2;
        }
        Object obj = a2.get(0).f18945b;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return Float.valueOf((String) obj).floatValue();
        }
        return f2;
    }

    public final int getInt(String str, int i) {
        ArrayList<e> a2 = a(str, (Object) String.valueOf(i));
        if (a2 == null) {
            return i;
        }
        Object obj = a2.get(0).f18945b;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    public final long getLong(String str, long j) {
        ArrayList<e> a2 = a(str, (Object) String.valueOf(j));
        if (a2 == null) {
            return j;
        }
        Object obj = a2.get(0).f18945b;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        ArrayList<e> a2 = a(str, (Object) set);
        if (a2 == null || a2.get(0).f18945b == null) {
            return null;
        }
        String[] strArr = (String[]) a2.get(0).f18945b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    public static SharedPreferences a(Context context, String str) {
        boolean z;
        Application application;
        if (f1942d == -1) {
            f1942d = a(context);
        }
        if (f1942d == Process.myPid()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c.a(context, str, 0);
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) context.getApplicationContext();
        }
        return new d(application, str);
    }

    private ArrayList<e> a(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new e(str, obj));
        }
        try {
            ContentResolver contentResolver = this.f1943a.getContentResolver();
            Uri uri = this.f1945c;
            if (str != null) {
                str2 = this.f1944b + "/" + str;
            } else {
                str2 = this.f1944b;
            }
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, "query", bundle2);
        } catch (Exception e2) {
            com.bytedance.apm.d.a().a(e2, "MonitorSharedPreferences: getPairs");
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }
}
