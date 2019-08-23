package com.ss.android.ugc.aweme.av.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CompatBottomSheetDialog extends BottomSheetDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34435a;

    /* renamed from: b  reason: collision with root package name */
    boolean f34436b;

    /* renamed from: c  reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f34437c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34438d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34439e;

    /* renamed from: f  reason: collision with root package name */
    private BottomSheetBehavior.BottomSheetCallback f34440f;

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f34435a, false, 23927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34435a, false, 23927, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (this.f34437c != null) {
            this.f34437c.setState(4);
        }
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (PatchProxy.isSupport(new Object[0], this, f34435a, false, 23930, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34435a, false, 23930, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.f34439e) {
            if (Build.VERSION.SDK_INT < 11) {
                this.f34438d = true;
            } else {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
                this.f34438d = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            this.f34439e = true;
        }
        return this.f34438d;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f34435a, false, 23923, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f34435a, false, 23923, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void setCancelable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34435a, false, 23926, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34435a, false, 23926, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setCancelable(z);
        if (this.f34436b != z) {
            this.f34436b = z;
            if (this.f34437c != null) {
                this.f34437c.setHideable(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34435a, false, 23928, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34435a, false, 23928, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f34436b) {
            this.f34436b = true;
        }
        this.f34438d = z;
        this.f34439e = true;
    }

    public void setContentView(@LayoutRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34435a, false, 23922, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34435a, false, 23922, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        getDelegate().setContentView(a(i, null, null));
    }

    public void setContentView(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f34435a, false, 23924, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f34435a, false, 23924, new Class[]{View.class}, Void.TYPE);
            return;
        }
        getDelegate().setContentView(a(0, view2, null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CompatBottomSheetDialog(@android.support.annotation.NonNull android.content.Context r20, @android.support.annotation.StyleRes int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f34435a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = 0
            r6 = 1
            r7 = 23921(0x5d71, float:3.352E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0052
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r12[r11] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f34435a
            r15 = 1
            r16 = 23921(0x5d71, float:3.352E-41)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r11] = r3
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x006f
        L_0x0052:
            if (r21 != 0) goto L_0x006d
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r20.getTheme()
            r4 = 2130772095(0x7f01007f, float:1.7147299E38)
            boolean r3 = r3.resolveAttribute(r4, r2, r11)
            if (r3 == 0) goto L_0x0069
            int r2 = r2.resourceId
            goto L_0x006f
        L_0x0069:
            r2 = 2131493329(0x7f0c01d1, float:1.8610135E38)
            goto L_0x006f
        L_0x006d:
            r2 = r21
        L_0x006f:
            r0.<init>(r1, r2)
            r0.f34436b = r11
            r0.f34438d = r11
            com.ss.android.ugc.aweme.av.widget.CompatBottomSheetDialog$1 r1 = new com.ss.android.ugc.aweme.av.widget.CompatBottomSheetDialog$1
            r1.<init>()
            r0.f34440f = r1
            r0.supportRequestWindowFeature(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.av.widget.CompatBottomSheetDialog.<init>(android.content.Context, int):void");
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = view;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{view2, layoutParams2}, this, f34435a, false, 23925, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, layoutParams2}, this, f34435a, false, 23925, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        getDelegate().setContentView(a(0, view2, layoutParams2));
    }

    private View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        View view2;
        int i2 = i;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, layoutParams2}, this, f34435a, false, 23929, new Class[]{Integer.TYPE, View.class, ViewGroup.LayoutParams.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, layoutParams2}, this, f34435a, false, 23929, new Class[]{Integer.TYPE, View.class, ViewGroup.LayoutParams.class}, View.class);
        }
        View inflate = View.inflate(getContext(), C0906R.layout.gs, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(C0906R.id.zq);
        if (i2 == 0 || view != null) {
            view2 = view;
        } else {
            view2 = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(C0906R.id.a3z);
        this.f34437c = BottomSheetBehavior.from(frameLayout);
        this.f34437c.setBottomSheetCallback(this.f34440f);
        this.f34437c.setHideable(this.f34436b);
        if (layoutParams2 == null) {
            frameLayout.addView(view2);
        } else {
            frameLayout.addView(view2, layoutParams2);
        }
        coordinatorLayout.findViewById(C0906R.id.d67).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34443a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f34443a, false, 23932, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f34443a, false, 23932, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (CompatBottomSheetDialog.this.f34436b && CompatBottomSheetDialog.this.isShowing() && CompatBottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                    CompatBottomSheetDialog.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(frameLayout, new AccessibilityDelegateCompat() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34445a;

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
                if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f34445a, false, 23933, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f34445a, false, 23933, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (CompatBottomSheetDialog.this.f34436b) {
                    accessibilityNodeInfoCompat2.addAction(1048576);
                    accessibilityNodeInfoCompat2.setDismissable(true);
                    return;
                }
                accessibilityNodeInfoCompat2.setDismissable(false);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), bundle}, this, f34445a, false, 23934, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), bundle}, this, f34445a, false, 23934, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 1048576 || !CompatBottomSheetDialog.this.f34436b) {
                    return super.performAccessibilityAction(view, i, bundle);
                } else {
                    CompatBottomSheetDialog.this.cancel();
                    return true;
                }
            }
        });
        frameLayout.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return inflate;
    }
}
