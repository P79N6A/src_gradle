package com.vivo.push.util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    protected Context f81651a;

    /* renamed from: b  reason: collision with root package name */
    private String f81652b;

    /* renamed from: c  reason: collision with root package name */
    private volatile SharedPreferences f81653c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, String> f81654d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Long> f81655e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private HashMap<String, Integer> f81656f = new HashMap<>();
    private HashMap<String, Boolean> g = new HashMap<>();

    private void b() {
        if (this.f81653c != null) {
            return;
        }
        if (this.f81651a != null) {
            this.f81653c = c.a(this.f81651a, this.f81652b, 0);
            return;
        }
        throw new RuntimeException("SharedPreferences is not init", new Throwable());
    }

    public final void a() {
        this.f81655e.clear();
        this.f81656f.clear();
        this.g.clear();
        this.f81654d.clear();
        b();
        if (this.f81653c != null) {
            this.f81653c.edit().clear().apply();
        }
    }

    public final String a(String str) {
        String str2 = this.f81654d.get(str);
        if (str2 != null) {
            return str2;
        }
        b();
        if (this.f81653c != null) {
            str2 = this.f81653c.getString(str, null);
            if (!TextUtils.isEmpty(str2) && !str2.equals(null)) {
                this.f81654d.put(str, str2);
            }
        }
        return str2;
    }

    public final void c(String str) {
        this.f81655e.remove(str);
        this.f81656f.remove(str);
        this.g.remove(str);
        this.f81654d.remove(str);
        b();
        if (this.f81653c != null) {
            SharedPreferences.Editor edit = this.f81653c.edit();
            if (this.f81653c.contains(str)) {
                edit.remove(str);
                edit.apply();
            }
        }
    }

    public final int b(String str) {
        Integer num = this.f81656f.get(str);
        if (num != null) {
            return num.intValue();
        }
        b();
        if (this.f81653c != null) {
            num = Integer.valueOf(this.f81653c.getInt(str, 0));
            if (!num.equals(0)) {
                this.f81656f.put(str, num);
            }
        }
        return num.intValue();
    }

    public final void a(String str, int i) {
        this.f81656f.put(str, Integer.valueOf(i));
        b();
        if (this.f81653c != null) {
            SharedPreferences.Editor edit = this.f81653c.edit();
            edit.putInt(str, i);
            edit.apply();
        }
    }

    public final void a(Context context, String str) {
        if (!(context instanceof Application)) {
            throw new RuntimeException("you can't invoke this in other sContext but Application, in case memory leak");
        } else if (!TextUtils.isEmpty(str)) {
            this.f81652b = str;
            this.f81653c = c.a(context, this.f81652b, 0);
            this.f81651a = context;
        } else {
            throw new RuntimeException("sharedFileName can't be null");
        }
    }

    public final long b(String str, long j) {
        Long l = this.f81655e.get(str);
        if (l != null) {
            return l.longValue();
        }
        b();
        if (this.f81653c != null) {
            l = Long.valueOf(this.f81653c.getLong(str, j));
            if (!l.equals(Long.valueOf(j))) {
                this.f81655e.put(str, l);
            }
        }
        return l.longValue();
    }

    public final void a(String str, long j) {
        this.f81655e.put(str, Long.valueOf(j));
        b();
        if (this.f81653c != null) {
            SharedPreferences.Editor edit = this.f81653c.edit();
            edit.putLong(str, j);
            edit.apply();
        }
    }

    public final void a(String str, String str2) {
        this.f81654d.put(str, str2);
        b();
        if (this.f81653c != null) {
            SharedPreferences.Editor edit = this.f81653c.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
