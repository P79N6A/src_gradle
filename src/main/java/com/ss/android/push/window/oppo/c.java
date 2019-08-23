package com.ss.android.push.window.oppo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.Logger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.push.window.oppo.d;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f30441a;
    private static c t;

    /* renamed from: b  reason: collision with root package name */
    public WindowManager f30442b;

    /* renamed from: c  reason: collision with root package name */
    public WindowManager.LayoutParams f30443c;

    /* renamed from: d  reason: collision with root package name */
    public View f30444d;

    /* renamed from: e  reason: collision with root package name */
    public Context f30445e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f30446f = new Handler(Looper.getMainLooper());
    public String g;
    public boolean h = false;
    public int i = PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST;
    public int j;
    public int k;
    public int l = 2;
    public boolean m;
    public boolean n = true;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public int r = 0;
    public Runnable s = new Runnable() {
        public final void run() {
            c cVar = c.this;
            cVar.q = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cVar.f30444d, "translationY", new float[]{(float) cVar.r, (float) (-cVar.f30444d.getMeasuredHeight())});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    try {
                        c.this.q = false;
                        c.this.o = false;
                        c.this.f30442b.removeViewImmediate(c.this.f30444d);
                    } catch (Exception unused) {
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    try {
                        c.this.q = false;
                        c.this.o = false;
                        c.this.f30442b.removeViewImmediate(c.this.f30444d);
                    } catch (Exception unused) {
                    }
                }
            });
            ofFloat.setDuration(200);
            ofFloat.start();
        }
    };

    public static a d() {
        return f30441a;
    }

    public final void b() {
        try {
            this.q = false;
            this.o = false;
            this.f30446f.removeCallbacks(this.s);
            this.f30442b.removeViewImmediate(this.f30444d);
        } catch (Exception unused) {
            Logger.debug();
        }
    }

    private void e() {
        boolean z;
        boolean z2;
        if (!TextUtils.isEmpty(this.g)) {
            try {
                JSONObject jSONObject = new JSONObject(this.g);
                boolean z3 = false;
                if (jSONObject.optInt("is_show", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = z;
                if (jSONObject.optInt("is_cache_message", 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.m = z2;
                this.k = jSONObject.optInt("show_time_mill", 5000);
                if (jSONObject.optInt("is_auto_dismiss", 1) == 1) {
                    z3 = true;
                }
                this.n = z3;
                this.l = jSONObject.optInt("cache_size", 2);
                this.i = jSONObject.optInt("type", PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST);
                this.j = jSONObject.optInt("flag", 1160);
            } catch (JSONException unused) {
            }
        }
    }

    public final d.a c() {
        d a2 = d.a(this.f30445e);
        LinkedList linkedList = new LinkedList();
        if (!a(a2.f30461a).m) {
            a2.f30462b.a();
        } else {
            Map b2 = a2.f30462b.b();
            if (!b2.isEmpty()) {
                for (Map.Entry entry : b2.entrySet()) {
                    if (entry != null) {
                        linkedList.add(entry.getValue());
                    }
                }
            }
        }
        Logger.debug();
        if (!linkedList.isEmpty()) {
            return (d.a) linkedList.get(0);
        }
        return null;
    }

    public final boolean a() {
        if (!this.h || e.a(this.f30445e) != 0) {
            return false;
        }
        return true;
    }

    public final void a(SharedPreferences.Editor editor) {
        editor.putString("tt_push_pop_window_rule", this.g);
        e();
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (f30441a != null) {
                if (t == null) {
                    t = new c(context);
                }
                cVar = t;
            } else {
                throw new RuntimeException("should call init(context, pushWindowDepend) in Application");
            }
        }
        return cVar;
    }

    private c(Context context) {
        this.f30445e = context.getApplicationContext();
        this.f30442b = (WindowManager) context.getSystemService("window");
        this.f30446f.postDelayed(new Runnable() {
            public final void run() {
                if (c.this.a() && c.this.m) {
                    c.a(c.this.f30445e).c();
                }
            }
        }, 10000);
    }

    public final void a(SharedPreferences sharedPreferences) {
        this.g = sharedPreferences.getString("tt_push_pop_window_rule", "");
        e();
    }

    public static synchronized c a(Context context, a aVar) {
        c a2;
        synchronized (c.class) {
            f30441a = aVar;
            a2 = a(context);
        }
        return a2;
    }

    public final void a(String str, int i2, String str2) {
        Logger.debug();
        d.a(this.f30445e).a(1, str, i2, str2);
    }

    public static void a(Context context, String str, long j2, long j3, boolean z, JSONObject... jSONObjectArr) {
        JSONObject[] jSONObjectArr2 = jSONObjectArr;
        if (z) {
            if (jSONObjectArr2.length > 0) {
                f30441a.a(context, "umeng", "client_apn", str, j2, -1, jSONObjectArr2[0]);
                return;
            }
            f30441a.a(context, "umeng", "client_apn", str, j2, -1, null);
        } else if (jSONObjectArr2.length > 0) {
            f30441a.a(context, "umeng", "apn", str, j2, -1, jSONObjectArr2[0]);
        } else {
            f30441a.a(context, "umeng", "apn", str, j2, -1, null);
        }
    }
}
