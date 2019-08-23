package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.annotation.d;
import java.lang.reflect.Field;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64393a;

    /* renamed from: b  reason: collision with root package name */
    public d f64394b;

    /* renamed from: c  reason: collision with root package name */
    private SettingItem f64395c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64393a, false, 72352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64393a, false, 72352, new Class[0], Void.TYPE);
            return;
        }
        try {
            String a2 = this.f64394b.a();
            SettingItem settingItem = this.f64395c;
            settingItem.setStartText(this.f64394b.b() + ":  " + a2);
        } catch (IllegalAccessException unused) {
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private a(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(Field field, Object obj) {
        if (PatchProxy.isSupport(new Object[]{field, obj}, this, f64393a, false, 72351, new Class[]{Field.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{field, obj}, this, f64393a, false, 72351, new Class[]{Field.class, Object.class}, Void.TYPE);
            return;
        }
        this.f64394b = new d(field, obj);
        a();
        this.f64395c.setOnSettingItemClickListener(new b.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64396a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void OnSettingItemClick(android.view.View r18) {
                /*
                    r17 = this;
                    r7 = r17
                    r8 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r9 = 0
                    r0[r9] = r18
                    com.meituan.robust.ChangeQuickRedirect r2 = f64396a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 72354(0x11aa2, float:1.0139E-40)
                    r1 = r17
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0036
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r0[r9] = r18
                    com.meituan.robust.ChangeQuickRedirect r2 = f64396a
                    r3 = 0
                    r4 = 72354(0x11aa2, float:1.0139E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r17
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0036:
                    com.ss.android.ugc.aweme.setting.ui.a r0 = com.ss.android.ugc.aweme.setting.ui.a.this
                    com.ss.android.ugc.aweme.setting.annotation.d r0 = r0.f64394b
                    java.lang.Object[] r10 = new java.lang.Object[r9]
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.setting.annotation.d.f63827a
                    r13 = 0
                    r14 = 72133(0x119c5, float:1.0108E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String[]> r16 = java.lang.String[].class
                    r11 = r0
                    r15 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                    if (r1 == 0) goto L_0x0063
                    java.lang.Object[] r10 = new java.lang.Object[r9]
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.setting.annotation.d.f63827a
                    r13 = 0
                    r14 = 72133(0x119c5, float:1.0108E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String[]> r16 = java.lang.String[].class
                    r11 = r0
                    r15 = r1
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    java.lang.String[] r0 = (java.lang.String[]) r0
                    goto L_0x0091
                L_0x0063:
                    com.ss.android.ugc.aweme.setting.annotation.AbIntField r1 = r0.f63829c
                    java.lang.String[] r1 = r1.c()
                    int r2 = r1.length
                    if (r2 != 0) goto L_0x0090
                    com.ss.android.ugc.aweme.setting.annotation.AbIntField r1 = r0.f63829c
                    int[] r1 = r1.b()
                    int r1 = r1.length
                    java.lang.String[] r1 = new java.lang.String[r1]
                    r2 = 0
                L_0x0076:
                    com.ss.android.ugc.aweme.setting.annotation.AbIntField r3 = r0.f63829c
                    int[] r3 = r3.b()
                    int r3 = r3.length
                    if (r2 >= r3) goto L_0x0090
                    com.ss.android.ugc.aweme.setting.annotation.AbIntField r3 = r0.f63829c
                    int[] r3 = r3.b()
                    r3 = r3[r2]
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    r1[r2] = r3
                    int r2 = r2 + 1
                    goto L_0x0076
                L_0x0090:
                    r0 = r1
                L_0x0091:
                    com.ss.android.ugc.aweme.setting.ui.a r1 = com.ss.android.ugc.aweme.setting.ui.a.this
                    com.ss.android.ugc.aweme.setting.ui.a$1$1 r2 = new com.ss.android.ugc.aweme.setting.ui.a$1$1
                    r2.<init>()
                    r3 = 2
                    java.lang.Object[] r10 = new java.lang.Object[r3]
                    r10[r9] = r0
                    r10[r8] = r2
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.setting.ui.a.f64393a
                    r13 = 0
                    r14 = 72353(0x11aa1, float:1.01388E-40)
                    java.lang.Class[] r4 = new java.lang.Class[r3]
                    java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
                    r4[r9] = r5
                    java.lang.Class<android.content.DialogInterface$OnClickListener> r5 = android.content.DialogInterface.OnClickListener.class
                    r4[r8] = r5
                    java.lang.Class r16 = java.lang.Void.TYPE
                    r11 = r1
                    r15 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                    if (r4 == 0) goto L_0x00d7
                    java.lang.Object[] r10 = new java.lang.Object[r3]
                    r10[r9] = r0
                    r10[r8] = r2
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.setting.ui.a.f64393a
                    r13 = 0
                    r14 = 72353(0x11aa1, float:1.01388E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r3]
                    java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
                    r0[r9] = r2
                    java.lang.Class<android.content.DialogInterface$OnClickListener> r2 = android.content.DialogInterface.OnClickListener.class
                    r0[r8] = r2
                    java.lang.Class r16 = java.lang.Void.TYPE
                    r11 = r1
                    r15 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    return
                L_0x00d7:
                    android.support.v7.app.AlertDialog$Builder r3 = new android.support.v7.app.AlertDialog$Builder
                    android.content.Context r1 = r1.getContext()
                    r3.<init>(r1)
                    r3.setItems((java.lang.CharSequence[]) r0, (android.content.DialogInterface.OnClickListener) r2)
                    r3.show()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.a.AnonymousClass1.OnSettingItemClick(android.view.View):void");
            }
        });
    }

    private a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.a1e, this, true);
        if (PatchProxy.isSupport(new Object[0], this, f64393a, false, 72350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64393a, false, 72350, new Class[0], Void.TYPE);
            return;
        }
        this.f64395c = (SettingItem) findViewById(C0906R.id.avp);
    }
}
