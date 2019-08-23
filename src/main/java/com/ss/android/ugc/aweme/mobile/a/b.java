package com.ss.android.ugc.aweme.mobile.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56080a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56081a;

        /* renamed from: b  reason: collision with root package name */
        public int f56082b;

        /* renamed from: c  reason: collision with root package name */
        public Bundle f56083c = new Bundle();

        /* renamed from: d  reason: collision with root package name */
        private WeakReference<Activity> f56084d;

        /* renamed from: e  reason: collision with root package name */
        private WeakReference<Fragment> f56085e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<Context> f56086f;
        private Class<? extends Activity> g;
        private int h;

        private Context c() {
            if (PatchProxy.isSupport(new Object[0], this, f56081a, false, 59731, new Class[0], Context.class)) {
                return (Context) PatchProxy.accessDispatch(new Object[0], this, f56081a, false, 59731, new Class[0], Context.class);
            } else if (this.f56084d != null) {
                return (Context) this.f56084d.get();
            } else {
                if (this.f56085e != null && this.f56085e.get() != null) {
                    return ((Fragment) this.f56085e.get()).getActivity();
                }
                if (this.f56086f != null) {
                    return (Context) this.f56086f.get();
                }
                return null;
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f56081a, false, 59729, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f56081a, false, 59729, new Class[0], Void.TYPE);
                return;
            }
            this.h = 1;
            b();
        }

        private void b() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f56081a, false, 59730, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f56081a, false, 59730, new Class[0], Void.TYPE);
                return;
            }
            Context c2 = c();
            if (c2 != null) {
                Intent intent = new Intent();
                if (this.g != null) {
                    intent.setClass(c2, this.g);
                    z = true;
                }
                if (z) {
                    if (!this.f56083c.isEmpty()) {
                        intent.putExtras(this.f56083c);
                    }
                    if (this.f56082b == 0) {
                        if (this.f56084d != null && this.f56084d.get() != null) {
                            ((Activity) this.f56084d.get()).startActivity(intent);
                        } else if (this.f56085e != null && this.f56085e.get() != null) {
                            ((Fragment) this.f56085e.get()).startActivity(intent);
                        } else if (!(this.f56086f == null || this.f56086f.get() == null)) {
                            intent.addFlags(268435456);
                            ((Context) this.f56086f.get()).startActivity(intent);
                        }
                    } else if (this.f56084d != null && this.f56084d.get() != null) {
                        ((Activity) this.f56084d.get()).startActivityForResult(intent, this.f56082b);
                    } else if (this.f56085e != null && this.f56085e.get() != null) {
                        ((Fragment) this.f56085e.get()).startActivityForResult(intent, this.f56082b);
                    } else if (!(this.f56086f == null || this.f56086f.get() == null)) {
                        intent.addFlags(268435456);
                        ((Context) this.f56086f.get()).startActivity(intent);
                    }
                    if (this.h == 1) {
                        if (this.f56084d != null && this.f56084d.get() != null) {
                            ((Activity) this.f56084d.get()).overridePendingTransition(C0906R.anim.cz, C0906R.anim.d8);
                        } else if (!(this.f56085e == null || this.f56085e.get() == null || ((Fragment) this.f56085e.get()).getActivity() == null)) {
                            ((Fragment) this.f56085e.get()).getActivity().overridePendingTransition(C0906R.anim.cz, C0906R.anim.d8);
                        }
                    }
                }
            }
        }

        public final a a(Class<? extends Activity> cls) {
            this.g = cls;
            return this;
        }

        private a(Activity activity) {
            this.f56084d = new WeakReference<>(activity);
        }

        public static a a(Activity activity) {
            Activity activity2 = activity;
            if (!PatchProxy.isSupport(new Object[]{activity2}, null, f56081a, true, 59722, new Class[]{Activity.class}, a.class)) {
                return new a(activity2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{activity2}, null, f56081a, true, 59722, new Class[]{Activity.class}, a.class);
        }
    }

    public static void a(Activity activity, boolean z, boolean z2) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, (byte) 0, (byte) 1}, null, f56080a, true, 59721, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, (byte) 0, (byte) 1}, null, f56080a, true, 59721, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!activity.isFinishing()) {
            Intent intent = null;
            if (activity.isTaskRoot()) {
                intent = ToolUtils.getLaunchIntentForPackage(activity2, activity.getPackageName());
            }
            activity.finish();
            if (intent != null) {
                activity2.startActivity(intent);
            }
        }
    }
}
