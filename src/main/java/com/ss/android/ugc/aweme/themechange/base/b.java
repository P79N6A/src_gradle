package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101J.\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020 J(\u00108\u001a\u00020\u00042\u0006\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020 2\u0006\u00107\u001a\u00020 H\u0002J\u000e\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020 J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020 J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004J(\u0010=\u001a\u00020\u00042\u0006\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020 2\u0006\u00107\u001a\u00020 H\u0002J\"\u0010>\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020 J\u001a\u0010>\u001a\u0004\u0018\u00010-2\b\u0010A\u001a\u0004\u0018\u00010-2\u0006\u0010:\u001a\u00020 J\u001a\u0010>\u001a\u0004\u0018\u00010-2\b\u0010A\u001a\u0004\u0018\u00010-2\u0006\u0010B\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0014\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u0011\u0010*\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010\u000b¨\u0006C"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/MThemeChangeHelper;", "", "()V", "BLACK_EFFECT_PANEL_MAIN_COLOR", "", "BLACK_FS_PANEL_MAIN_COLOR", "BLACK_FS_PANEL_SECOND_COLOR", "BLACK_PANEL_MAIN_COLOR", "BLACK_PANEL_SECOND_COLOR", "BLACK_PANEL_SUBVIEW_COLOR", "getBLACK_PANEL_SUBVIEW_COLOR", "()I", "BLACK_TEXT_SELECTED_COLOR", "WHITE_EFFECT_PANEL_MAIN_COLOR", "WHITE_FS_PANEL_MAIN_COLOR", "WHITE_FS_PANEL_SECOND_COLOR", "WHITE_PANEL_MAIN_COLOR", "WHITE_PANEL_SECOND_COLOR", "WHITE_PANEL_SUBVIEW_COLOR", "getWHITE_PANEL_SUBVIEW_COLOR", "WHITE_TEXT_SELECTED_COLOR", "countDownWaveAllLineColor", "getCountDownWaveAllLineColor", "countDownWaveAlreadyRecordBgColor", "getCountDownWaveAlreadyRecordBgColor", "countDownWaveAlreadyRecordLineColor", "getCountDownWaveAlreadyRecordLineColor", "countDownWaveBgColor", "getCountDownWaveBgColor", "countDownWavePlayLineColor", "getCountDownWavePlayLineColor", "isMThemeChange", "", "()Z", "mPanel", "", "getMPanel", "()Ljava/lang/String;", "setMPanel", "(Ljava/lang/String;)V", "videoEditViewIndicatorBorderColor", "getVideoEditViewIndicatorBorderColor", "volumeSeekbarThumbColor", "getVolumeSeekbarThumbColor", "configAttrDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "getAVPanelBgColor", "fsPanel", "secondPanel", "effectPanel", "oldPanelType", "isSubView", "getBlackFsSecondPanelColor", "getSelectedTextColor", "oldPanel", "getUnSelectedTextColor", "selectColor", "getWhiteFsSecondPanelColor", "tintDrawable", "resId", "isOldPanel", "drawable", "color", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74585a;

    /* renamed from: b  reason: collision with root package name */
    static final int f74586b = Color.parseColor("#FFFFFFFF");

    /* renamed from: c  reason: collision with root package name */
    static final int f74587c = Color.parseColor("#26FFFFFF");

    /* renamed from: d  reason: collision with root package name */
    static final int f74588d = Color.parseColor("#26000000");

    /* renamed from: e  reason: collision with root package name */
    public static final b f74589e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final int f74590f = Color.parseColor("#FF161823");
    private static final int g = Color.parseColor("#FF0E0F1A");
    private static final int h = Color.parseColor("#FF161823");
    private static final int i = Color.parseColor("#D8000000");
    private static final int j = Color.parseColor("#80000000");
    private static final int k = Color.parseColor("#99000000");
    private static final int l = Color.parseColor("#99FFFFFF");
    private static final int m = Color.parseColor("#FFFFFFFF");
    private static final int n = Color.parseColor("#80FFFFFF");
    private static final int o = Color.parseColor("#D0FFFFFF");
    private static final int p = Color.parseColor("#80FFFFFF");
    @Nullable
    private static String q;

    public static int a(int i2) {
        return (i2 & 16777215) | Integer.MIN_VALUE;
    }

    private b() {
    }

    @Nullable
    public final Drawable a(@Nullable Drawable drawable, boolean z) {
        if (PatchProxy.isSupport(new Object[]{drawable, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74585a, false, 86851, new Class[]{Drawable.class, Boolean.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{drawable, Byte.valueOf(z)}, this, f74585a, false, 86851, new Class[]{Drawable.class, Boolean.TYPE}, Drawable.class);
        } else if (drawable == null) {
            return drawable;
        } else {
            Drawable mutate = drawable.mutate();
            Intrinsics.checkExpressionValueIsNotNull(mutate, "wrappedDrawable");
            mutate.setColorFilter(new PorterDuffColorFilter(a(z), PorterDuff.Mode.SRC_IN));
            return mutate;
        }
    }

    @Nullable
    public final Drawable a(@Nullable Drawable drawable, int i2) {
        if (PatchProxy.isSupport(new Object[]{drawable, Integer.valueOf(i2)}, this, f74585a, false, 86852, new Class[]{Drawable.class, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{drawable, Integer.valueOf(i2)}, this, f74585a, false, 86852, new Class[]{Drawable.class, Integer.TYPE}, Drawable.class);
        } else if (drawable == null) {
            return drawable;
        } else {
            Drawable mutate = drawable.mutate();
            Intrinsics.checkExpressionValueIsNotNull(mutate, "wrappedDrawable");
            mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            return mutate;
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f74585a, false, 86841, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74585a, false, 86841, new Class[0], Integer.TYPE)).intValue();
        } else if (!d() && a.b()) {
            return b(false);
        } else {
            return 0;
        }
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f74585a, false, 86843, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74585a, false, 86843, new Class[0], Integer.TYPE)).intValue();
        } else if (!a.b() || d()) {
            return Color.parseColor("#22FFFFFF");
        } else {
            return Color.parseColor("#07161823");
        }
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f74585a, false, 86844, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74585a, false, 86844, new Class[0], Integer.TYPE)).intValue();
        } else if (!a.b() || d()) {
            return Color.parseColor("#52FFFFFF");
        } else {
            return Color.parseColor("#22161823");
        }
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f74585a, false, 86847, new Class[0], Boolean.TYPE)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableMBlackPanel();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74585a, false, 86847, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public static void a(@Nullable String str) {
        q = str;
    }

    public final int a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74585a, false, 86848, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74585a, false, 86848, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        if (a.b()) {
            IEffectService effectService = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService();
            Intrinsics.checkExpressionValueIsNotNull(effectService, "ServiceManager.get().get…ass.java).effectService()");
            if (TextUtils.equals(q, effectService.getLiveStickerPannel())) {
                return f74586b;
            }
        }
        if (d()) {
            return f74586b;
        }
        if (!a.b() || z) {
            return f74586b;
        }
        return f74590f;
    }

    public final int b(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74585a, false, 86849, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return (a(z) & 16777215) | Integer.MIN_VALUE;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74585a, false, 86849, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
    }

    @Nullable
    public final Drawable a(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f74585a, false, 86854, new Class[]{Context.class, AttributeSet.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f74585a, false, 86854, new Class[]{Context.class, AttributeSet.class}, Drawable.class);
        } else if (context2 == null) {
            return null;
        } else {
            if (attributeSet2 != null) {
                TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.AVDmtView);
                boolean z = obtainStyledAttributes.getBoolean(7, false);
                int dimension = (int) obtainStyledAttributes.getDimension(24, 0.0f);
                boolean z2 = obtainStyledAttributes.getBoolean(21, false);
                boolean z3 = obtainStyledAttributes.getBoolean(4, false);
                boolean z4 = obtainStyledAttributes.getBoolean(25, false);
                boolean z5 = obtainStyledAttributes.getBoolean(2, false);
                boolean z6 = obtainStyledAttributes.getBoolean(28, false);
                boolean z7 = obtainStyledAttributes.getBoolean(34, false);
                int a2 = a(z3, z4, z5, z2, z6);
                if (z7) {
                    a2 = a(z2);
                }
                if (obtainStyledAttributes.hasValue(0)) {
                    a2 = obtainStyledAttributes.getColor(0, a2);
                }
                obtainStyledAttributes.recycle();
                if (z) {
                    return bc.a(a2, a2, 0);
                }
                return bc.a(a2, a2, 0, dimension);
            }
            return null;
        }
    }

    @Nullable
    public final Drawable a(@Nullable Context context, int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f74585a, false, 86850, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2), Byte.valueOf(z)}, this, f74585a, false, 86850, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE}, Drawable.class);
        } else if (context == null || i3 <= 0) {
            return null;
        } else {
            return a(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), i3), z);
        }
    }

    private static int a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return f74587c;
        }
        if (z) {
            if (z2) {
                return h;
            }
            return g;
        } else if (z2) {
            if (z3) {
                return f74588d;
            }
            return j;
        } else if (z3) {
            return k;
        } else {
            return i;
        }
    }

    private static int b(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return f74588d;
        }
        if (z) {
            if (z2) {
                return n;
            }
            return m;
        } else if (z2) {
            if (z3) {
                return f74587c;
            }
            return p;
        } else if (z3) {
            return l;
        } else {
            return o;
        }
    }

    public final int a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Byte.valueOf(z4 ? (byte) 1 : 0), Byte.valueOf(z5 ? (byte) 1 : 0)}, this, f74585a, false, 86853, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            Object[] objArr = {Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), Byte.valueOf(z4), Byte.valueOf(z5)};
            return ((Integer) PatchProxy.accessDispatch(objArr, this, f74585a, false, 86853, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (d() || !a.b()) {
            return a(z6, z7, z8, z9);
        } else {
            if (!z4) {
                return b(z6, z7, z8, z9);
            }
            if (z7) {
                return j;
            }
            return i;
        }
    }
}
