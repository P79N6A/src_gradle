package com.bytedance.android.livesdk.browser.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.i;
import com.bytedance.ies.f.b.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;
import org.json.JSONObject;

public class FullWebDialogFragment extends BaseDialogFragment implements TTLiveBrowserFragment.a, TTLiveBrowserFragment.d, TTLiveBrowserFragment.e, com.bytedance.android.livesdk.browser.jsbridge.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f9350e;
    private static final /* synthetic */ a.C0900a o;

    /* renamed from: f  reason: collision with root package name */
    protected View f9351f;
    String g;
    private TextView h;
    private TextView i;
    private String j;
    private String k;
    private TTLiveBrowserFragment l;
    private long m;
    private long n;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9352a;

        /* renamed from: b  reason: collision with root package name */
        public String f9353b;

        /* renamed from: c  reason: collision with root package name */
        public String f9354c;

        /* renamed from: d  reason: collision with root package name */
        public String f9355d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9356e;

        public a(String str) {
            this.f9353b = str;
        }
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9350e, false, 3477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9350e, false, 3477, new Class[0], Void.TYPE);
            return;
        }
        this.n = System.currentTimeMillis();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f9350e, true, 3483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f9350e, true, 3483, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("FullWebDialogFragment.java", FullWebDialogFragment.class);
        o = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onCreate", "com.bytedance.android.livesdk.browser.fragment.FullWebDialogFragment", "android.os.Bundle", "savedInstanceState", "", "void"), 95);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0348  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart() {
        /*
            r26 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f9350e
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 3472(0xd90, float:4.865E-42)
            r2 = r26
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f9350e
            r5 = 0
            r6 = 3472(0xd90, float:4.865E-42)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.onStart()
            android.app.Dialog r1 = r26.getDialog()
            if (r1 == 0) goto L_0x0037
            android.app.Dialog r1 = r26.getDialog()
            android.view.Window r1 = r1.getWindow()
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 == 0) goto L_0x0048
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()
            if (r2 == 0) goto L_0x0048
            r3 = -1
            r2.width = r3
            r2.height = r3
            r1.setAttributes(r2)
        L_0x0048:
            android.app.Dialog r1 = r26.getDialog()
            android.view.View r2 = r26.getView()
            r3 = 2131166653(0x7f0705bd, float:1.7947557E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            r11 = 1
            r4[r11] = r2
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.bytedance.android.live.core.utils.b.a.f8244a
            r7 = 1
            r8 = 1435(0x59b, float:2.011E-42)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.app.Dialog> r10 = android.app.Dialog.class
            r9[r0] = r10
            java.lang.Class<android.view.View> r10 = android.view.View.class
            r9[r11] = r10
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            r5 = 19
            if (r4 == 0) goto L_0x0098
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            r12[r11] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1435(0x59b, float:2.011E-42)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<android.app.Dialog> r2 = android.app.Dialog.class
            r1[r0] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r11] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x045c
        L_0x0098:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 21
            if (r4 < r6) goto L_0x0353
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            r12[r11] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1434(0x59a, float:2.01E-42)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            r4[r0] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r4[r11] = r6
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x00e1
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            r12[r11] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1434(0x59a, float:2.01E-42)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<android.app.Dialog> r2 = android.app.Dialog.class
            r1[r0] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r11] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x045c
        L_0x00e1:
            if (r1 == 0) goto L_0x045c
            android.view.Window r4 = r1.getWindow()
            if (r4 != 0) goto L_0x00eb
            goto L_0x045c
        L_0x00eb:
            android.content.Context r4 = r1.getContext()
            int r4 = com.bytedance.android.live.core.utils.ag.a((android.content.Context) r4)
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            r6.height = r4
            r2.setLayoutParams(r6)
            android.view.Window r1 = r1.getWindow()
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r11)
            r12[r11] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1431(0x597, float:2.005E-42)
            java.lang.Class[] r2 = new java.lang.Class[r3]
            java.lang.Class<android.view.Window> r4 = android.view.Window.class
            r2[r0] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r2[r11] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x0147
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r11)
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1431(0x597, float:2.005E-42)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<android.view.Window> r2 = android.view.Window.class
            r1[r0] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r11] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x045c
        L_0x0147:
            if (r1 == 0) goto L_0x045c
            boolean r2 = com.bytedance.android.live.core.utils.b.b.b()
            if (r2 == 0) goto L_0x015b
            int r2 = com.bytedance.android.live.core.utils.b.b.a()
            if (r2 <= 0) goto L_0x015b
            r4 = 9
            if (r2 >= r4) goto L_0x015b
            r2 = 0
            goto L_0x015c
        L_0x015b:
            r2 = 1
        L_0x015c:
            if (r2 == 0) goto L_0x031a
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1425(0x591, float:1.997E-42)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<android.view.Window> r6 = android.view.Window.class
            r4[r0] = r6
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0191
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1425(0x591, float:1.997E-42)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<android.view.Window> r4 = android.view.Window.class
            r3[r0] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x031d
        L_0x0191:
            if (r1 == 0) goto L_0x031d
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.bytedance.android.live.core.utils.b.b.f8245a
            r22 = 1
            r23 = 1446(0x5a6, float:2.026E-42)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            r19 = r4
            r24 = r6
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.b.f8245a
            r15 = 1
            r16 = 1446(0x5a6, float:2.026E-42)
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x02aa
        L_0x01c1:
            java.lang.String r4 = com.bytedance.android.live.core.utils.b.b.f8246b
            if (r4 != 0) goto L_0x02a8
            java.lang.String r4 = ""
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.b.f8245a
            r15 = 1
            r16 = 1448(0x5a8, float:2.029E-42)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6[r0] = r9
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r6 == 0) goto L_0x0200
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.b.f8245a
            r15 = 1
            r16 = 1448(0x5a8, float:2.029E-42)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r0] = r6
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            goto L_0x02a8
        L_0x0200:
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.f8246b
            if (r6 != 0) goto L_0x02a3
            java.lang.String r6 = "ro.miui.ui.version.name"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x021e
            java.lang.String r6 = "ro.miui.ui.version.name"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            com.bytedance.android.live.core.utils.b.b.f8247c = r6
            java.lang.String r6 = "MIUI"
            com.bytedance.android.live.core.utils.b.b.f8246b = r6
            goto L_0x02a3
        L_0x021e:
            java.lang.String r6 = "ro.build.version.emui"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0237
            java.lang.String r6 = "ro.build.version.emui"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            com.bytedance.android.live.core.utils.b.b.f8247c = r6
            java.lang.String r6 = "EMUI"
            com.bytedance.android.live.core.utils.b.b.f8246b = r6
            goto L_0x02a3
        L_0x0237:
            java.lang.String r6 = "ro.build.version.opporom"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0250
            java.lang.String r6 = "ro.build.version.opporom"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            com.bytedance.android.live.core.utils.b.b.f8247c = r6
            java.lang.String r6 = "OPPO"
            com.bytedance.android.live.core.utils.b.b.f8246b = r6
            goto L_0x02a3
        L_0x0250:
            java.lang.String r6 = "ro.vivo.os.version"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0269
            java.lang.String r6 = "ro.vivo.os.version"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            com.bytedance.android.live.core.utils.b.b.f8247c = r6
            java.lang.String r6 = "VIVO"
            com.bytedance.android.live.core.utils.b.b.f8246b = r6
            goto L_0x02a3
        L_0x0269:
            java.lang.String r6 = "ro.smartisan.version"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0282
            java.lang.String r6 = "ro.smartisan.version"
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.a(r6)
            com.bytedance.android.live.core.utils.b.b.f8247c = r6
            java.lang.String r6 = "SMARTISAN"
            com.bytedance.android.live.core.utils.b.b.f8246b = r6
            goto L_0x02a3
        L_0x0282:
            java.lang.String r6 = android.os.Build.DISPLAY
            com.bytedance.android.live.core.utils.b.b.f8247c = r6
            java.lang.String r6 = r6.toUpperCase()
            java.lang.String r9 = "FLYME"
            boolean r6 = r6.contains(r9)
            if (r6 == 0) goto L_0x0297
            java.lang.String r6 = "FLYME"
            com.bytedance.android.live.core.utils.b.b.f8246b = r6
            goto L_0x02a3
        L_0x0297:
            java.lang.String r6 = "unknown"
            com.bytedance.android.live.core.utils.b.b.f8247c = r6
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r6 = r6.toUpperCase()
            com.bytedance.android.live.core.utils.b.b.f8246b = r6
        L_0x02a3:
            java.lang.String r6 = com.bytedance.android.live.core.utils.b.b.f8246b
            r6.equals(r4)
        L_0x02a8:
            java.lang.String r4 = com.bytedance.android.live.core.utils.b.b.f8246b
        L_0x02aa:
            java.lang.String r6 = "MIUI"
            boolean r6 = r6.equals(r4)
            r9 = 3
            if (r6 == 0) goto L_0x02b5
            r4 = 1
            goto L_0x02c0
        L_0x02b5:
            java.lang.String r6 = "FLYME"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x02bf
            r4 = 2
            goto L_0x02c0
        L_0x02bf:
            r4 = 3
        L_0x02c0:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r12[r11] = r6
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1424(0x590, float:1.995E-42)
            java.lang.Class[] r6 = new java.lang.Class[r3]
            java.lang.Class<android.view.Window> r10 = android.view.Window.class
            r6[r0] = r10
            java.lang.Class r10 = java.lang.Integer.TYPE
            r6[r11] = r10
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r6 == 0) goto L_0x0306
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r11] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1424(0x590, float:1.995E-42)
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Class<android.view.Window> r4 = android.view.Window.class
            r3[r0] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r11] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x031d
        L_0x0306:
            if (r1 == 0) goto L_0x031d
            if (r4 != r11) goto L_0x030e
            com.bytedance.android.live.core.utils.b.a.b(r1, r0)
            goto L_0x031d
        L_0x030e:
            if (r4 != r3) goto L_0x0314
            com.bytedance.android.live.core.utils.b.a.a(r1, r0)
            goto L_0x031d
        L_0x0314:
            if (r4 != r9) goto L_0x031d
            com.bytedance.android.live.core.utils.b.a.c(r1, r0)
            goto L_0x031d
        L_0x031a:
            com.bytedance.android.live.core.utils.b.a.a(r1)
        L_0x031d:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r8) goto L_0x0348
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            r1.clearFlags(r3)
            android.view.View r3 = r1.getDecorView()
            int r3 = r3.getSystemUiVisibility()
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r3 = r3 | 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0337
            r2 = r3 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0339
        L_0x0337:
            r2 = r3 & -8193(0xffffffffffffdfff, float:NaN)
        L_0x0339:
            android.view.View r3 = r1.getDecorView()
            r3.setSystemUiVisibility(r2)
            r1.addFlags(r7)
            r1.setStatusBarColor(r0)
            goto L_0x045c
        L_0x0348:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L_0x045c
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r2)
            goto L_0x045c
        L_0x0353:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            r12[r11] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1432(0x598, float:2.007E-42)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            r4[r0] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r4[r11] = r6
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0392
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r0] = r1
            r12[r11] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1432(0x598, float:2.007E-42)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<android.app.Dialog> r2 = android.app.Dialog.class
            r1[r0] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r11] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x045c
        L_0x0392:
            if (r1 == 0) goto L_0x045c
            android.view.Window r3 = r1.getWindow()
            if (r3 != 0) goto L_0x039c
            goto L_0x045c
        L_0x039c:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1430(0x596, float:2.004E-42)
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x03c9
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1430(0x596, float:2.004E-42)
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x03cb
        L_0x03c9:
            boolean r3 = com.bytedance.android.live.core.utils.b.b.f8248d
        L_0x03cb:
            if (r3 == 0) goto L_0x03e9
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r8) goto L_0x03e2
            android.view.Window r3 = r1.getWindow()
            r3.addFlags(r7)
            r4 = 2131625323(0x7f0e056b, float:1.887785E38)
            int r4 = com.bytedance.android.live.core.utils.ac.b((int) r4)
            r3.setStatusBarColor(r4)
        L_0x03e2:
            android.view.Window r3 = r1.getWindow()
            com.bytedance.android.live.core.utils.b.a.a(r3)
        L_0x03e9:
            android.app.Activity r3 = r1.getOwnerActivity()
            if (r3 == 0) goto L_0x0406
            android.app.Activity r3 = r1.getOwnerActivity()
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x0406
            android.app.Activity r3 = r1.getOwnerActivity()
            android.view.Window r3 = r3.getWindow()
            boolean r3 = com.bytedance.android.live.core.utils.b.a.b(r3)
            goto L_0x0407
        L_0x0406:
            r3 = 0
        L_0x0407:
            if (r3 != 0) goto L_0x0416
            android.view.Window r1 = r1.getWindow()
            boolean r1 = com.bytedance.android.live.core.utils.b.a.b(r1)
            if (r1 == 0) goto L_0x0414
            goto L_0x0416
        L_0x0414:
            r1 = 0
            goto L_0x0417
        L_0x0416:
            r1 = 1
        L_0x0417:
            if (r1 == 0) goto L_0x045c
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1436(0x59c, float:2.012E-42)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r1[r0] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x044b
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.b.a.f8244a
            r15 = 1
            r16 = 1436(0x59c, float:2.012E-42)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r0] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x045c
        L_0x044b:
            android.content.Context r1 = r2.getContext()
            int r1 = com.bytedance.android.live.core.utils.ag.a((android.content.Context) r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r3.height = r1
            r2.setLayoutParams(r3)
        L_0x045c:
            android.app.Dialog r1 = r26.getDialog()
            android.view.Window r1 = r1.getWindow()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.a.f8209a
            r15 = 1
            r16 = 952(0x3b8, float:1.334E-42)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r2[r0] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x049d
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r0] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.live.core.utils.a.f8209a
            r15 = 1
            r16 = 952(0x3b8, float:1.334E-42)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r0] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x049d:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x04a6
            com.bytedance.android.live.core.utils.a r0 = new com.bytedance.android.live.core.utils.a
            r0.<init>(r1)
        L_0x04a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.fragment.FullWebDialogFragment.onStart():void");
    }

    public final void a(com.bytedance.android.livesdk.browser.jsbridge.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f9350e, false, 3478, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f9350e, false, 3478, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.b.class}, Void.TYPE);
            return;
        }
        bVar.a().a("close", (d<?, ?>) new i<Object,Object>((DialogFragment) this));
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f9350e, false, 3482, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f9350e, false, 3482, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.k = str;
        if (this.i != null) {
            this.i.setText(str);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9350e, false, 3471, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f9350e, false, 3471, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        org.aspectj.lang.a a2 = b.a(o, this, this, bundle);
        try {
            super.onCreate(bundle);
            setStyle(1, C0906R.style.vu);
            this.j = getArguments().getString("key_url");
            this.g = getArguments().getString("key_from_type", "");
            this.k = getArguments().getString("key_title", "");
            if (TextUtils.isEmpty(this.k)) {
                this.k = ac.a((int) C0906R.string.dk4);
            }
        } finally {
            com.bytedance.android.livesdk.a.a.a().c(a2);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f9350e, false, 3479, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f9350e, false, 3479, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.a(str, jSONObject);
        }
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TTLiveBrowserFragment tTLiveBrowserFragment;
        Bundle bundle2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f9350e, false, 3473, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f9350e, false, 3473, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        getDialog().getWindow().setWindowAnimations(C0906R.style.vu);
        this.m = System.currentTimeMillis();
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aev, viewGroup2, false);
        this.h = (TextView) inflate.findViewById(C0906R.id.iu);
        this.i = (TextView) inflate.findViewById(C0906R.id.title);
        this.f9351f = inflate.findViewById(C0906R.id.d3m);
        if (PatchProxy.isSupport(new Object[0], this, f9350e, false, 3476, new Class[0], TTLiveBrowserFragment.class)) {
            tTLiveBrowserFragment = (TTLiveBrowserFragment) PatchProxy.accessDispatch(new Object[0], this, f9350e, false, 3476, new Class[0], TTLiveBrowserFragment.class);
        } else {
            tTLiveBrowserFragment = new TTLiveBrowserFragment();
            tTLiveBrowserFragment.f9358b = this.g;
            tTLiveBrowserFragment.n = this;
            tTLiveBrowserFragment.m = this;
            tTLiveBrowserFragment.f9359c = true;
        }
        this.l = tTLiveBrowserFragment;
        TTLiveBrowserFragment tTLiveBrowserFragment2 = this.l;
        if (PatchProxy.isSupport(new Object[0], this, f9350e, false, 3474, new Class[0], Bundle.class)) {
            bundle2 = (Bundle) PatchProxy.accessDispatch(new Object[0], this, f9350e, false, 3474, new Class[0], Bundle.class);
        } else {
            bundle2 = new Bundle();
            bundle2.putString(PushConstants.WEB_URL, this.j);
            bundle2.putBoolean("bundle_user_webview_title", true);
            bundle2.putBoolean("hide_nav_bar", true);
        }
        tTLiveBrowserFragment2.setArguments(bundle2);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(C0906R.id.n_, this.l);
        beginTransaction.commitAllowingStateLoss();
        this.l.l = this;
        this.h.setOnClickListener(new a(this));
        this.i.setText(this.k);
        if (!getArguments().getBoolean("key_with_title_bar", true)) {
            this.f9351f.setVisibility(8);
        }
        return inflate;
    }
}
