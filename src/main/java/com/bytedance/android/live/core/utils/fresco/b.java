package com.bytedance.android.live.core.utils.fresco;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8266a;

    static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8267a;

        /* renamed from: b  reason: collision with root package name */
        private View f8268b;

        /* renamed from: c  reason: collision with root package name */
        private View.OnAttachStateChangeListener f8269c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f8270d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f8271e;

        public final boolean onPreDraw() {
            if (PatchProxy.isSupport(new Object[0], this, f8267a, false, 1375, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8267a, false, 1375, new Class[0], Boolean.TYPE)).booleanValue();
            }
            a();
            return true;
        }

        private void a() {
            if (PatchProxy.isSupport(new Object[0], this, f8267a, false, 1376, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8267a, false, 1376, new Class[0], Void.TYPE);
                return;
            }
            boolean b2 = b();
            if (this.f8271e != b2) {
                this.f8271e = b2;
                if (this.f8271e) {
                    this.f8269c.onViewAttachedToWindow(this.f8268b);
                    return;
                }
                this.f8269c.onViewDetachedFromWindow(this.f8268b);
            }
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [android.view.ViewParent] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean b() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f8267a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r4 = 0
                r5 = 1377(0x561, float:1.93E-42)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x002a
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f8267a
                r5 = 0
                r6 = 1377(0x561, float:1.93E-42)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x002a:
                boolean r1 = r9.f8270d
                if (r1 == 0) goto L_0x0046
                android.view.View r1 = r9.f8268b
            L_0x0030:
                android.view.ViewParent r2 = r1.getParent()
                boolean r3 = r2 instanceof android.view.View
                if (r3 == 0) goto L_0x003c
                r1 = r2
                android.view.View r1 = (android.view.View) r1
                goto L_0x0030
            L_0x003c:
                android.view.View r2 = r9.f8268b
                android.view.View r2 = r2.getRootView()
                if (r1 != r2) goto L_0x0046
                r0 = 1
                return r0
            L_0x0046:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.fresco.b.a.b():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8267a, false, 1373, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8267a, false, 1373, new Class[]{View.class}, Void.TYPE);
            } else if (!this.f8270d) {
                this.f8270d = true;
                this.f8268b.getViewTreeObserver().addOnPreDrawListener(this);
                a();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8267a, false, 1374, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8267a, false, 1374, new Class[]{View.class}, Void.TYPE);
            } else if (this.f8270d) {
                this.f8270d = false;
                this.f8268b.getViewTreeObserver().removeOnPreDrawListener(this);
                a();
            }
        }

        private a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f8268b = view;
            this.f8269c = onAttachStateChangeListener;
            View view2 = this.f8268b;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f8267a, false, 1378, new Class[]{View.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f8267a, false, 1378, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            } else if (Build.VERSION.SDK_INT >= 19) {
                z = view2.isAttachedToWindow();
            } else if (view2.getWindowToken() == null) {
                z = false;
            }
            this.f8270d = z;
            this.f8271e = false;
            if (this.f8270d) {
                this.f8268b.getViewTreeObserver().addOnPreDrawListener(this);
            }
            this.f8268b.addOnAttachStateChangeListener(this);
            a();
        }

        public static void a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
            View view2 = view;
            View.OnAttachStateChangeListener onAttachStateChangeListener2 = onAttachStateChangeListener;
            if (PatchProxy.isSupport(new Object[]{view2, onAttachStateChangeListener2}, null, f8267a, true, 1372, new Class[]{View.class, View.OnAttachStateChangeListener.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, onAttachStateChangeListener2}, null, f8267a, true, 1372, new Class[]{View.class, View.OnAttachStateChangeListener.class}, Void.TYPE);
                return;
            }
            new a(view2, onAttachStateChangeListener2);
        }
    }

    public static void a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (PatchProxy.isSupport(new Object[]{view, onAttachStateChangeListener}, null, f8266a, true, 1371, new Class[]{View.class, View.OnAttachStateChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, onAttachStateChangeListener}, null, f8266a, true, 1371, new Class[]{View.class, View.OnAttachStateChangeListener.class}, Void.TYPE);
            return;
        }
        a.a(view, onAttachStateChangeListener);
    }
}
