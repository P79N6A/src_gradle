package com.ss.android.vesdk.runtime.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.q.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f78093a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f78094b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f78095c;

    /* renamed from: com.ss.android.vesdk.runtime.a.a$a  reason: collision with other inner class name */
    enum C0830a {
        INSTANCE;
        
        private a mInstance;

        public final a getInstance() {
            return this.mInstance;
        }
    }

    private a() {
    }

    public static a a() {
        return C0830a.INSTANCE.getInstance();
    }

    private synchronized void b() {
        if (this.f78095c == null) {
            this.f78095c = this.f78094b.edit();
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Context context) {
        synchronized (this) {
            if (!this.f78093a) {
                this.f78094b = c.a(context, context.getPackageName(), 0);
                this.f78093a = true;
            }
        }
    }

    public final void a(@NonNull String str, @NonNull Object obj) {
        a(str, obj, false);
    }

    public final <T> T b(@NonNull String str, @NonNull T t) {
        if (t instanceof String) {
            return this.f78094b.getString(str, (String) t);
        }
        if (t instanceof Integer) {
            return Integer.valueOf(this.f78094b.getInt(str, ((Integer) t).intValue()));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(this.f78094b.getBoolean(str, ((Boolean) t).booleanValue()));
        }
        if (t instanceof Float) {
            return Float.valueOf(this.f78094b.getFloat(str, ((Float) t).floatValue()));
        }
        if (t instanceof Long) {
            return Long.valueOf(this.f78094b.getLong(str, ((Long) t).longValue()));
        }
        return this.f78094b.getString(str, null);
    }

    public final void a(@NonNull String str, @NonNull Object obj, boolean z) {
        b();
        if (obj instanceof String) {
            this.f78095c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f78095c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f78095c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f78095c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f78095c.putLong(str, ((Long) obj).longValue());
        } else {
            this.f78095c.putString(str, obj.toString());
        }
        if (z) {
            this.f78095c.apply();
        } else {
            this.f78095c.commit();
        }
    }
}
