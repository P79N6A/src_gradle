package com.ss.android.ugc.aweme.shortvideo.cut;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.tools.am;
import java.util.Map;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66355a;

    /* renamed from: b  reason: collision with root package name */
    public static int f66356b = u.a(56.0d);

    /* renamed from: c  reason: collision with root package name */
    public static int f66357c = u.a(31.0d);

    /* renamed from: d  reason: collision with root package name */
    public static int f66358d = u.a(60.0d);

    /* renamed from: e  reason: collision with root package name */
    public static int f66359e = u.a(12.0d);

    /* renamed from: f  reason: collision with root package name */
    public static int f66360f = u.a(8.0d);
    public static int g = u.a(5.0d);
    public static int h = GlobalContext.getContext().getResources().getDimensionPixelSize(C0906R.dimen.r9);
    public static int i = u.a(20.0d);

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f66355a, true, 75515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f66355a, true, 75515, new Class[0], Void.TYPE);
        } else {
            r.a("delete_upload_video", (Map) null);
        }
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f66355a, true, 75516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f66355a, true, 75516, new Class[0], Void.TYPE);
        } else {
            r.a("rotate_upload_video", (Map) null);
        }
    }

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f66355a, true, 75517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f66355a, true, 75517, new Class[0], Void.TYPE);
        } else {
            r.a("click_edit_segments_return", (Map) null);
        }
    }

    public static void d() {
        if (PatchProxy.isSupport(new Object[0], null, f66355a, true, 75518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f66355a, true, 75518, new Class[0], Void.TYPE);
        } else {
            r.a("click_edit_segments", (Map) null);
        }
    }

    public static am a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, f66355a, true, 75514, new Class[]{Float.TYPE}, am.class)) {
            return (am) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, f66355a, true, 75514, new Class[]{Float.TYPE}, am.class);
        } else if (f2 == am.EPIC.value()) {
            return am.EPIC;
        } else {
            if (f2 == am.SLOW.value()) {
                return am.SLOW;
            }
            if (f2 == am.NORMAL.value()) {
                return am.NORMAL;
            }
            if (f2 == am.FAST.value()) {
                return am.FAST;
            }
            if (f2 == am.LAPSE.value()) {
                return am.LAPSE;
            }
            return null;
        }
    }

    public static long a(long j) {
        long j2 = j;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f66355a, true, 75507, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f66355a, true, 75507, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        } else if (!a.v.a()) {
            if (PatchProxy.isSupport(new Object[0], null, f66355a, true, 75508, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f66355a, true, 75508, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (!a.L.a(e.a.LongVideoPermitted) && !a.v.a()) {
                z = false;
            }
            if (z) {
                if (j2 > a.L.c(e.a.LongVideoThreshold)) {
                    j2 = a.L.c(e.a.LongVideoThreshold);
                }
                return j2;
            } else if (j2 > ea.f66827f) {
                return ea.f66827f;
            } else {
                return j2;
            }
        } else if (j2 > 300000) {
            return 300000;
        } else {
            return j2;
        }
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f66355a, true, 75504, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f66355a, true, 75504, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(10);
        }
    }

    @TargetApi(21)
    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f66355a, true, 75506, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f66355a, true, 75506, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            view2.setOutlineProvider(new ViewOutlineProvider() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66361a;

                public final void getOutline(View view, Outline outline) {
                    if (PatchProxy.isSupport(new Object[]{view, outline}, this, f66361a, false, 75521, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, outline}, this, f66361a, false, 75521, new Class[]{View.class, Outline.class}, Void.TYPE);
                        return;
                    }
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) u.a(2.0d));
                }
            });
            view2.setClipToOutline(true);
        }
    }

    public static float b(Context context, int i2) {
        if (!PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2)}, null, f66355a, true, 75509, new Class[]{Context.class, Integer.TYPE}, Float.TYPE)) {
            return (float) ((p.b(context) - (i2 * 2)) - (f66359e * 2));
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2)}, null, f66355a, true, 75509, new Class[]{Context.class, Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public static void a(Context context, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2)}, null, f66355a, true, 75505, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2)}, null, f66355a, true, 75505, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate((long) i2);
        }
    }
}
