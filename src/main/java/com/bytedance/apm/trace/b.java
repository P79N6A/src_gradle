package com.bytedance.apm.trace;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.apm.trace.a.a;
import com.bytedance.services.apm.api.c;
import java.lang.ref.WeakReference;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public long f2078a = -1;

    /* renamed from: b  reason: collision with root package name */
    public String f2079b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f2080c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f2081d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f2082e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public long f2083f;
    public boolean g;

    public final void a(Activity activity) {
    }

    public final void b(Activity activity) {
    }

    @TargetApi(16)
    public final void d(Activity activity) {
        this.f2078a = 0;
        try {
            if (this.f2080c != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f2080c);
                this.f2080c = null;
            }
            if (this.f2081d != null) {
                this.f2082e.removeCallbacks(this.f2081d);
                this.f2081d = null;
            }
        } catch (Exception unused) {
        }
    }

    public final void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16 && this.g) {
            try {
                this.f2078a = System.currentTimeMillis();
                this.f2079b = activity.getClass().getCanonicalName();
                final Integer a2 = a.a(this.f2079b);
                if (a2 != null) {
                    final WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
                    this.f2080c = new ViewTreeObserver.OnGlobalLayoutListener() {
                        public final void onGlobalLayout() {
                            if (weakReference.get() != null) {
                                View findViewById = ((View) weakReference.get()).findViewById(a2.intValue());
                                if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                    ViewTreeObserver viewTreeObserver = ((View) weakReference.get()).getViewTreeObserver();
                                    if (viewTreeObserver.isAlive() && b.this.f2080c != null) {
                                        viewTreeObserver.removeOnGlobalLayoutListener(b.this.f2080c);
                                    }
                                    if (b.this.f2081d != null) {
                                        b.this.f2082e.removeCallbacks(b.this.f2081d);
                                        b.this.f2081d = null;
                                    }
                                    b.this.f2080c = null;
                                    if (b.this.f2078a > 0) {
                                        long currentTimeMillis = System.currentTimeMillis() - b.this.f2078a;
                                        b.this.f2078a = 0;
                                        if (currentTimeMillis < b.this.f2083f) {
                                            com.bytedance.apm.agent.b.a.a(b.this.f2079b, "activityOnCreateToViewShow", currentTimeMillis);
                                        }
                                    }
                                }
                            }
                        }
                    };
                    ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.f2080c);
                    this.f2081d = new Runnable() {
                        public final void run() {
                            if (b.this.f2080c != null && weakReference.get() != null) {
                                ((View) weakReference.get()).getViewTreeObserver().removeOnGlobalLayoutListener(b.this.f2080c);
                            }
                        }
                    };
                    this.f2082e.postDelayed(this.f2081d, this.f2083f);
                }
            } catch (Exception unused) {
            }
        }
    }
}
