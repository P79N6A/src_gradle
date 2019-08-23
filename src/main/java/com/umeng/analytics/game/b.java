package com.umeng.analytics.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.umeng.analytics.pro.ax;
import com.umeng.analytics.pro.ba;
import java.io.Serializable;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f80312a;

    /* renamed from: b  reason: collision with root package name */
    public String f80313b;

    /* renamed from: c  reason: collision with root package name */
    private Context f80314c;

    /* renamed from: d  reason: collision with root package name */
    private final String f80315d = "um_g_cache";

    /* renamed from: e  reason: collision with root package name */
    private final String f80316e = "single_level";

    /* renamed from: f  reason: collision with root package name */
    private final String f80317f = "stat_player_level";
    private final String g = "stat_game_level";
    private a h;

    static class a implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        private String f80318b;

        /* renamed from: c  reason: collision with root package name */
        private long f80319c;

        /* renamed from: d  reason: collision with root package name */
        private long f80320d;

        public void c() {
            a();
        }

        public void d() {
            b();
        }

        public long e() {
            return this.f80319c;
        }

        public String f() {
            return this.f80318b;
        }

        public void a() {
            this.f80320d = System.currentTimeMillis();
        }

        public void b() {
            this.f80319c += System.currentTimeMillis() - this.f80320d;
            this.f80320d = 0;
        }

        public a(String str) {
            this.f80318b = str;
        }

        public boolean a(String str) {
            return this.f80318b.equals(str);
        }
    }

    public void a() {
        if (this.h != null) {
            this.h.b();
            SharedPreferences.Editor edit = c.a(this.f80314c, "um_g_cache", 0).edit();
            edit.putString("single_level", ax.a((Serializable) this.h));
            edit.putString("stat_player_level", this.f80313b);
            edit.putString("stat_game_level", this.f80312a);
            edit.commit();
        }
    }

    public void b() {
        SharedPreferences a2 = ba.a(this.f80314c, "um_g_cache");
        String string = a2.getString("single_level", null);
        if (!TextUtils.isEmpty(string)) {
            this.h = (a) ax.a(string);
            if (this.h != null) {
                this.h.c();
            }
        }
        if (TextUtils.isEmpty(this.f80313b)) {
            this.f80313b = a2.getString("stat_player_level", null);
            if (this.f80313b == null) {
                SharedPreferences a3 = ba.a(this.f80314c);
                if (a3 != null) {
                    this.f80313b = a3.getString("userlevel", null);
                } else {
                    return;
                }
            }
        }
        if (this.f80312a == null) {
            this.f80312a = a2.getString("stat_game_level", null);
        }
    }

    public a a(String str) {
        this.h = new a(str);
        this.h.a();
        return this.h;
    }

    public b(Context context) {
        this.f80314c = context;
    }

    public a b(String str) {
        if (this.h != null) {
            this.h.d();
            if (this.h.a(str)) {
                a aVar = this.h;
                this.h = null;
                return aVar;
            }
        }
        return null;
    }
}
