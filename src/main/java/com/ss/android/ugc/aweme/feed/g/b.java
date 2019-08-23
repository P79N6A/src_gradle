package com.ss.android.ugc.aweme.feed.g;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.a;
import com.ss.android.ugc.aweme.sticker.a.b;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45342a;

    /* renamed from: b  reason: collision with root package name */
    protected int f45343b;

    /* renamed from: c  reason: collision with root package name */
    protected int f45344c;

    /* renamed from: d  reason: collision with root package name */
    private int f45345d;

    private void a(View view, int i, int i2, boolean z, int i3, int i4, b.a aVar) {
        int i5;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3), Integer.valueOf(i4), aVar2}, this, f45342a, false, 41292, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i4), aVar2}, this, f45342a, false, 41292, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE);
            return;
        }
        double d2 = (double) i6;
        double d3 = (double) i7;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i9;
        double d6 = (double) i8;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (d4 > 0.5625d || d7 > 0.5625d || d4 < 0.4699999988079071d) {
            i5 = (i6 <= 0 || i7 <= 0) ? i9 : (i7 * i9) / i6;
        } else {
            i9 = (i6 <= 0 || i7 <= 0) ? i8 : (i6 * i8) / i7;
            i5 = i8;
        }
        if (aVar2 != null) {
            aVar2.f71621a = i9;
            aVar2.f71622b = i5;
        }
        if (view != null) {
            a(view, i5, i9, z, i3);
        }
    }

    private void a(View view, int i, int i2, boolean z, int i3) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3)}, this, f45342a, false, 41293, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3)}, this, f45342a, false, 41293, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(view, i, i2);
    }

    public final void a(Context context, Aweme aweme, View view, View view2) {
        Context context2 = context;
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{context2, aweme, view3, view4}, this, f45342a, false, 41297, new Class[]{Context.class, Aweme.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme, view3, view4}, this, f45342a, false, 41297, new Class[]{Context.class, Aweme.class, View.class, View.class}, Void.TYPE);
            return;
        }
        if (aweme != null) {
            if (aweme.isVr()) {
                b(view3, -1, -1);
                b(view4, -1, -1);
            } else if (aweme.getVideo() != null) {
                a(context2, aweme.getVideo(), view3, view4);
            }
        }
    }

    public final void a(Context context, Video video, View view, View view2) {
        if (PatchProxy.isSupport(new Object[]{context, video, view, view2}, this, f45342a, false, 41298, new Class[]{Context.class, Video.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, video, view, view2}, this, f45342a, false, 41298, new Class[]{Context.class, Video.class, View.class, View.class}, Void.TYPE);
        } else if (video != null) {
            if (a.d()) {
                Context context2 = context;
                b(context2, view, video.getWidth(), video.getHeight(), true);
                b(context2, view2, video.getWidth(), video.getHeight(), true);
                return;
            }
            Context context3 = context;
            a(context3, view, video.getWidth(), video.getHeight(), true);
            a(context3, view2, video.getWidth(), video.getHeight(), true);
        }
    }

    public static boolean a(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f45342a, true, 41299, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f45342a, true, 41299, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        double d2 = (double) i;
        double d3 = (double) i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i3;
        double d6 = (double) i4;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        try {
            double parseDouble = Double.parseDouble(String.format("%.2f", new Object[]{Double.valueOf(d4)}));
            double parseDouble2 = Double.parseDouble(String.format("%.2f", new Object[]{Double.valueOf(d7)}));
            return d4 > 0.0d && parseDouble2 > 0.0d && parseDouble != parseDouble2;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void a(Context context, Video video, View view) {
        if (PatchProxy.isSupport(new Object[]{context, video, view}, this, f45342a, false, 41300, new Class[]{Context.class, Video.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, video, view}, this, f45342a, false, 41300, new Class[]{Context.class, Video.class, View.class}, Void.TYPE);
        } else if (video != null) {
            if (a.d()) {
                b(context, view, video.getWidth(), video.getHeight(), true);
                return;
            }
            a(context, view, video.getWidth(), video.getHeight(), true);
        }
    }

    public final b.a a(Context context, Video video) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, video}, this, f45342a, false, 41301, new Class[]{Context.class, Video.class}, b.a.class)) {
            return (b.a) PatchProxy.accessDispatch(new Object[]{context2, video}, this, f45342a, false, 41301, new Class[]{Context.class, Video.class}, b.a.class);
        } else if (video == null) {
            return null;
        } else {
            b.a aVar = new b.a(video.getWidth(), video.getHeight());
            View view = new View(context2);
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(0, 0));
            if (a.d()) {
                b(context, view, video.getWidth(), video.getHeight(), true, aVar);
            } else {
                a(context, view, video.getWidth(), video.getHeight(), true, aVar);
            }
            return aVar;
        }
    }

    private int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f45342a, false, 41289, new Class[0], Integer.TYPE)) {
            return c() - a.a().f61218d;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f45342a, false, 41289, new Class[0], Integer.TYPE)).intValue();
    }

    private int c() {
        if (PatchProxy.isSupport(new Object[0], this, f45342a, false, 41291, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f45342a, false, 41291, new Class[0], Integer.TYPE)).intValue();
        } else if (Build.VERSION.SDK_INT < 28 || !a.a().m) {
            return this.f45345d;
        } else {
            return this.f45344c;
        }
    }

    private int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f45342a, false, 41288, new Class[0], Integer.TYPE)) {
            return (c() - a.a().b()) - a.a().f61220f;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f45342a, false, 41288, new Class[0], Integer.TYPE)).intValue();
    }

    @RequiresApi(api = 17)
    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f45342a, false, 41284, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f45342a, false, 41284, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            b(context);
        } catch (Exception unused) {
        }
    }

    private void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f45342a, false, 41285, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f45342a, false, 41285, new Class[]{Context.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 17) {
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            this.f45345d = displayMetrics.heightPixels;
            this.f45344c = displayMetrics.heightPixels + UIUtils.getStatusBarHeight(context);
            this.f45343b = displayMetrics.widthPixels;
        } else {
            this.f45345d = UIUtils.getScreenHeight(context);
            this.f45344c = this.f45345d;
            this.f45343b = UIUtils.getScreenWidth(context);
        }
    }

    private void a(View view, int i, int i2) {
        View view2 = view;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45342a, false, 41294, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45342a, false, 41294, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width != i4 || marginLayoutParams.height != i3 || Build.VERSION.SDK_INT < 19) {
                marginLayoutParams.width = i4;
                marginLayoutParams.height = i3;
                view2.setLayoutParams(marginLayoutParams);
                view2.setRotation(0.0f);
            }
        }
    }

    private void b(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, -1, -1}, this, f45342a, false, 41296, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, -1, -1}, this, f45342a, false, 41296, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view.getLayoutParams() == null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        }
        if (!(view.getLayoutParams().width == -1 && view.getLayoutParams().height == -1)) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    private void a(Context context, View view, int i, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f45342a, false, 41286, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f45342a, false, 41286, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(context, view, i, i2, true, (b.a) null);
    }

    private void b(Context context, View view, int i, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f45342a, false, 41302, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1}, this, f45342a, false, 41302, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(context, view, i, i2, true, null);
    }

    private void a(Context context, View view, int i, int i2, boolean z, b.a aVar) {
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), aVar}, this, f45342a, false, 41287, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), aVar}, this, f45342a, false, 41287, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, b.a.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 17) {
            if (this.f45344c == 0 || this.f45343b == 0) {
                b(context);
            }
            double d2 = (double) this.f45343b;
            double d3 = (double) this.f45344c;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 / d3;
            if (d4 <= 0.5d) {
                if (a.a().f61219e != 0) {
                    i3 = a.a().g;
                    if (i3 == 0) {
                        i3 = c() - a.a().f61218d;
                    } else {
                        i4 = 1;
                    }
                } else if (a.a().l) {
                    i3 = a();
                } else {
                    i3 = b();
                }
                if (i4 == 0 && !a.a().h) {
                    i3 -= a.a().f61219e;
                }
                b(view, i, i2, z, i3, this.f45343b, aVar);
            } else if (d4 >= 0.6666666666666666d) {
                a(view, i, i2, this.f45343b, this.f45344c, aVar);
            } else {
                int i5 = this.f45345d;
                if (a.a().l) {
                    i4 = a.a().b();
                }
                a(view, i, i2, z, (i5 - i4) - a.a().f61218d, this.f45343b, aVar);
            }
        }
    }

    private void b(Context context, View view, int i, int i2, boolean z, b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), aVar}, this, f45342a, false, 41303, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), aVar}, this, f45342a, false, 41303, new Class[]{Context.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, b.a.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 17) {
            if (this.f45344c == 0 || this.f45343b == 0) {
                b(context);
            }
            int i3 = a.a().g;
            double d2 = (double) this.f45343b;
            double d3 = (double) this.f45344c;
            Double.isNaN(d2);
            Double.isNaN(d3);
            if (d2 / d3 <= 0.5d) {
                b(view, i, i2, z, i3, this.f45343b, aVar);
                return;
            }
            a(view, i, i2, z, i3, this.f45343b, aVar);
        }
    }

    private void a(View view, int i, int i2, int i3, int i4, b.a aVar) {
        int i5;
        int i6;
        int i7;
        View view2 = view;
        int i8 = i;
        int i9 = i2;
        b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), aVar2}, this, f45342a, false, 41290, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE)) {
            Object[] objArr = {view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f45342a, false, 41290, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE);
            return;
        }
        double d2 = (double) i8;
        double d3 = (double) i9;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 > 0.5625d) {
            if (i8 <= 0 || i9 <= 0) {
                i7 = i3;
            } else {
                i7 = (i9 * i3) / i8;
            }
            i5 = i7;
            i6 = i3;
        } else {
            if (i8 <= 0 || i9 <= 0) {
                i6 = i4;
            } else {
                i6 = (i8 * i4) / i9;
            }
            i5 = i4;
        }
        if (aVar2 != null) {
            aVar2.f71621a = i6;
            aVar2.f71622b = i5;
        }
        a(view2, i5, i6);
    }

    private void b(View view, int i, int i2, boolean z, int i3, int i4, b.a aVar) {
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3), Integer.valueOf(i4), aVar2}, this, f45342a, false, 41295, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i4), aVar2}, this, f45342a, false, 41295, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE);
            return;
        }
        double d2 = (double) i7;
        double d3 = (double) i8;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i10;
        double d6 = (double) i9;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (d4 <= 0.625d && d7 <= 0.625d && d4 >= 0.4699999988079071d) {
            if (i7 <= 0 || i8 <= 0) {
                i6 = i9;
            } else {
                i6 = (i7 * i9) / i8;
            }
            i10 = i6;
            i5 = i9;
        } else if (i7 <= 0 || i8 <= 0) {
            i5 = i10;
        } else {
            i5 = (i8 * i10) / i7;
        }
        if (aVar2 != null) {
            aVar2.f71621a = i10;
            aVar2.f71622b = i5;
        }
        if (view != null) {
            a(view, i5, i10, z, i3);
        }
    }
}
