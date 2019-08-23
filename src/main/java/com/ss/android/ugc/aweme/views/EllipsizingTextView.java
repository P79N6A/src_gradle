package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class EllipsizingTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76326a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f76327b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f76328c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f76329d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f76330e;

    /* renamed from: f  reason: collision with root package name */
    private String f76331f;
    private int g = -1;
    private float h = 1.0f;
    private float i = 0.0f;

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public int getMaxLines() {
        return this.g;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76326a, false, 89456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76326a, false, 89456, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT < 11) {
            super.setEllipsize(null);
        } else {
            super.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public EllipsizingTextView(Context context) {
        super(context);
        a();
    }

    private Layout a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76326a, false, 89464, new Class[]{String.class}, Layout.class)) {
            return (Layout) PatchProxy.accessDispatch(new Object[]{str}, this, f76326a, false, 89464, new Class[]{String.class}, Layout.class);
        }
        StaticLayout staticLayout = new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.h, this.i, false);
        return staticLayout;
    }

    public void setMaxLines(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76326a, false, 89459, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76326a, false, 89459, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setMaxLines(i2);
        this.g = i2;
        this.f76329d = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f76326a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 89462(0x15d76, float:1.25363E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f76326a
            r4 = 0
            r5 = 89462(0x15d76, float:1.25363E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.graphics.Canvas> r0 = android.graphics.Canvas.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0032:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 11
            if (r1 >= r2) goto L_0x00f3
            boolean r1 = r10.f76329d
            if (r1 == 0) goto L_0x00f8
            r1 = 0
            super.setEllipsize(r1)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f76326a
            r4 = 0
            r5 = 89463(0x15d77, float:1.25364E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0065
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f76326a
            r4 = 0
            r5 = 89463(0x15d77, float:1.25364E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00f8
        L_0x0065:
            int r1 = r10.getMaxLines()
            java.lang.String r2 = r10.f76331f
            r3 = -1
            if (r1 == r3) goto L_0x00c3
            android.text.Layout r4 = r10.a(r2)
            int r5 = r4.getLineCount()
            if (r5 <= r1) goto L_0x00c3
            java.lang.String r2 = r10.f76331f
            int r5 = r1 + -1
            int r4 = r4.getLineEnd(r5)
            java.lang.String r2 = r2.substring(r9, r4)
            java.lang.String r2 = r2.trim()
        L_0x0088:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = "..."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.text.Layout r4 = r10.a(r4)
            int r4 = r4.getLineCount()
            if (r4 <= r1) goto L_0x00b0
            r4 = 32
            int r4 = r2.lastIndexOf(r4)
            if (r4 == r3) goto L_0x00b0
            java.lang.String r2 = r2.substring(r9, r4)
            goto L_0x0088
        L_0x00b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "..."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            java.lang.CharSequence r3 = r10.getText()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00db
            r10.f76330e = r8
            r10.setText(r2)     // Catch:{ all -> 0x00d6 }
            r10.f76330e = r9
            goto L_0x00db
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            r10.f76330e = r9
            throw r1
        L_0x00db:
            r10.f76329d = r9
            boolean r2 = r10.f76327b
            if (r1 == r2) goto L_0x00f8
            r10.f76327b = r1
            java.util.List<java.lang.Object> r1 = r10.f76328c
            java.util.Iterator r1 = r1.iterator()
        L_0x00e9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f8
            r1.next()
            goto L_0x00e9
        L_0x00f3:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            super.setEllipsize(r1)
        L_0x00f8:
            super.onDraw(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.EllipsizingTextView.onDraw(android.graphics.Canvas):void");
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setLineSpacing(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f76326a, false, 89460, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f76326a, false, 89460, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT < 11) {
            this.i = f2;
            this.h = f3;
            super.setLineSpacing(f2, f3);
        }
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76326a, false, 89461, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76326a, false, 89461, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onTextChanged(charSequence, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 11 && !this.f76330e) {
            this.f76331f = charSequence.toString();
            this.f76329d = true;
        }
    }
}
