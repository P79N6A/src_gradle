package com.bytedance.im.sugar.input;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.im.sugar.input.c;
import com.ss.android.ugc.aweme.C0906R;

public class SoftInputResizeFuncLayoutView extends a implements c {

    /* renamed from: d  reason: collision with root package name */
    protected c.a f21322d;

    /* renamed from: e  reason: collision with root package name */
    private EditText f21323e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21324f;
    private int g;
    private boolean h;

    public final void e() {
        a(-2);
    }

    public int getSoftKeyboardHeight() {
        return d.a(0);
    }

    private int getCurrentHeight() {
        if (this.f21324f) {
            return d.a(this.g);
        }
        return this.g;
    }

    public int getPanelHeight() {
        if (!a()) {
            return 0;
        }
        if (this.h) {
            return getSoftKeyboardHeight();
        }
        return getMeasuredHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00c1, code lost:
        if (r7 == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00ac, code lost:
        if (com.ss.android.ugc.aweme.im.sdk.utils.bb.b(r2) != com.ss.android.ugc.aweme.im.sdk.utils.bb.a(r2)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r20 = this;
            r0 = r20
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.content.Context r2 = r20.getContext()
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r3 = r2.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.getWindowVisibleDisplayFrame(r1)
            android.view.Window r3 = r2.getWindow()
            android.view.View r3 = r3.getDecorView()
            int r3 = r3.getHeight()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class r11 = java.lang.Integer.TYPE
            r6 = 0
            r8 = 1
            r9 = 53806(0xd22e, float:7.5398E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0061
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r12] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            r16 = 1
            r17 = 53806(0xd22e, float:7.5398E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r12] = r6
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0188
        L_0x0061:
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r12] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            r16 = 1
            r17 = 53803(0xd22b, float:7.5394E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r12] = r6
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            r6 = 17
            if (r5 == 0) goto L_0x00a0
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r12] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            r16 = 1
            r17 = 53803(0xd22b, float:7.5394E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r5[r12] = r7
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x00c4
        L_0x00a0:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto L_0x00b2
            int r5 = com.ss.android.ugc.aweme.im.sdk.utils.bb.b(r2)
            int r7 = com.ss.android.ugc.aweme.im.sdk.utils.bb.a(r2)
            if (r5 == r7) goto L_0x00b0
        L_0x00ae:
            r5 = 1
            goto L_0x00c4
        L_0x00b0:
            r5 = 0
            goto L_0x00c4
        L_0x00b2:
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r2)
            boolean r5 = r5.hasPermanentMenuKey()
            r7 = 4
            boolean r7 = android.view.KeyCharacterMap.deviceHasKey(r7)
            if (r5 != 0) goto L_0x00b0
            if (r7 != 0) goto L_0x00b0
            goto L_0x00ae
        L_0x00c4:
            if (r5 == 0) goto L_0x0187
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r12] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            r16 = 1
            r17 = 53804(0xd22c, float:7.5395E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r5[r12] = r7
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r5 == 0) goto L_0x0103
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r12] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            r16 = 1
            r17 = 53804(0xd22c, float:7.5395E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r5[r12] = r7
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x0125
        L_0x0103:
            android.content.ContentResolver r5 = r2.getContentResolver()
            java.lang.String r7 = "navigation_gesture_on"
            int r5 = android.provider.Settings.Secure.getInt(r5, r7, r12)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r6) goto L_0x011c
            android.content.ContentResolver r7 = r2.getContentResolver()
            java.lang.String r8 = "force_fsg_nav_bar"
            int r7 = android.provider.Settings.Global.getInt(r7, r8, r12)
            goto L_0x011d
        L_0x011c:
            r7 = 0
        L_0x011d:
            if (r5 != 0) goto L_0x0124
            if (r7 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r5 = 0
            goto L_0x0125
        L_0x0124:
            r5 = 1
        L_0x0125:
            if (r5 != 0) goto L_0x0187
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r12] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            r16 = 1
            r17 = 53805(0xd22d, float:7.5397E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r5[r12] = r7
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r5 == 0) goto L_0x0164
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r12] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.bb.f52547a
            r16 = 1
            r17 = 53805(0xd22d, float:7.5397E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r12] = r6
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0188
        L_0x0164:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto L_0x0172
            int r5 = com.ss.android.ugc.aweme.im.sdk.utils.bb.b(r2)
            int r6 = com.ss.android.ugc.aweme.im.sdk.utils.bb.a(r2)
            int r5 = r5 - r6
            goto L_0x0188
        L_0x0172:
            android.content.res.Resources r5 = r2.getResources()
            java.lang.String r6 = "navigation_bar_height"
            java.lang.String r7 = "dimen"
            java.lang.String r8 = "android"
            int r6 = r5.getIdentifier(r6, r7, r8)
            if (r6 <= 0) goto L_0x0187
            int r5 = r5.getDimensionPixelSize(r6)
            goto L_0x0188
        L_0x0187:
            r5 = 0
        L_0x0188:
            int r1 = r1.bottom
            int r1 = r3 - r1
            int r1 = r1 - r5
            int r3 = r3 - r5
            int r2 = com.bytedance.ies.uikit.statusbar.StatusBarUtils.getStatusBarHeight(r2)
            int r3 = r3 - r2
            int r3 = r3 / 10
            int r3 = r3 * 3
            if (r1 < r3) goto L_0x019a
            goto L_0x019b
        L_0x019a:
            r4 = 0
        L_0x019b:
            boolean r2 = r0.h
            if (r2 == r4) goto L_0x01d6
            r0.h = r4
            r2 = 2
            int[] r2 = new int[r2]
            r0.getLocationInWindow(r2)
            r2 = -2
            if (r4 == 0) goto L_0x01ce
            if (r1 <= 0) goto L_0x01ae
            com.bytedance.im.sugar.input.d.f21329a = r1
        L_0x01ae:
            android.view.ViewGroup$LayoutParams r1 = r20.getLayoutParams()
            int r3 = r20.getCurrentHeight()
            int r5 = r1.height
            if (r5 == r3) goto L_0x01bf
            r1.height = r3
            r0.setLayoutParams(r1)
        L_0x01bf:
            r0.f21326a = r2
            com.bytedance.im.sugar.input.b$a r1 = r0.f21327b
            if (r1 == 0) goto L_0x01d6
            com.bytedance.im.sugar.input.b$a r1 = r0.f21327b
            int r2 = r0.f21326a
            r3 = 0
            r1.a(r2, r3)
            goto L_0x01d6
        L_0x01ce:
            int r1 = r0.f21326a
            if (r1 != r2) goto L_0x01d6
            r1 = -1
            r0.a(r1)
        L_0x01d6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.sugar.input.SoftInputResizeFuncLayoutView.d():boolean");
    }

    public void setDefaultPanelHeight(int i) {
        this.g = i;
    }

    public void setEditText(EditText editText) {
        this.f21323e = editText;
    }

    public void setOnKeyBordChangedListener(c.a aVar) {
        this.f21322d = aVar;
    }

    public void setResizable(boolean z) {
        this.f21324f = z;
    }

    public SoftInputResizeFuncLayoutView(Context context) {
        this(context, null);
    }

    public final void a(int i) {
        if (this.f21326a != i) {
            if (i == -1) {
                setVisibility(8);
                e.a((Activity) getContext(), this.f21323e);
                this.f21326a = i;
                if (this.f21327b != null) {
                    this.f21327b.a(i, null);
                }
            } else if (i == -2) {
                this.f21323e.requestFocus();
                EditText editText = this.f21323e;
                InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
                if (!inputMethodManager.showSoftInput(editText, 0)) {
                    editText.postDelayed(new Runnable(inputMethodManager, editText, 0) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ InputMethodManager f21330a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ View f21331b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ int f21332c;

                        public final void run() {
                            this.f21330a.showSoftInput(this.f21331b, this.f21332c);
                        }

                        {
                            this.f21330a = r1;
                            this.f21331b = r2;
                            this.f21332c = r3;
                        }
                    }, 100);
                }
                this.f21326a = i;
                if (this.f21327b != null) {
                    this.f21327b.a(i, null);
                }
            } else {
                View view = (View) this.f21328c.get(i);
                if (view != null) {
                    setVisibility(0);
                    int size = this.f21328c.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = this.f21328c.keyAt(i2);
                        if (keyAt != i) {
                            ((View) this.f21328c.get(keyAt)).setVisibility(8);
                        }
                    }
                    view.setVisibility(0);
                    this.f21326a = i;
                    if (this.f21327b != null) {
                        this.f21327b.a(i, view);
                    }
                    e.a((Activity) getContext(), this.f21323e);
                }
            }
        }
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (d()) {
            i3 = 0;
        } else {
            i3 = getCurrentHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21324f = true;
        this.g = getResources().getDimensionPixelSize(C0906R.dimen.hd);
        ((Activity) getContext()).getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                SoftInputResizeFuncLayoutView.this.d();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
