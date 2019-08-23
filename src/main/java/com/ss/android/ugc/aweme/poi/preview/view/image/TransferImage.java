package com.ss.android.ugc.aweme.poi.preview.view.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.DraweeHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TransferImage extends PhotoView {
    public static ChangeQuickRedirect G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public Paint P;
    public c Q;
    public b R;
    private DraweeHolder<GenericDraweeHierarchy> S;
    private long T;
    private Matrix U;

    class a implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60257a;

        /* renamed from: b  reason: collision with root package name */
        float f60258b;

        /* renamed from: c  reason: collision with root package name */
        float f60259c;

        /* renamed from: d  reason: collision with root package name */
        float f60260d;

        /* renamed from: e  reason: collision with root package name */
        float f60261e;

        public final Object clone() throws CloneNotSupportedException {
            if (!PatchProxy.isSupport(new Object[0], this, f60257a, false, 65599, new Class[0], Object.class)) {
                return super.clone();
            }
            return PatchProxy.accessDispatch(new Object[0], this, f60257a, false, 65599, new Class[0], Object.class);
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f60257a, false, 65598, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f60257a, false, 65598, new Class[0], String.class);
            }
            return "[left:" + this.f60258b + " top:" + this.f60259c + " width:" + this.f60260d + " height:" + this.f60261e + "]";
        }

        private a() {
        }

        /* synthetic */ a(TransferImage transferImage, byte b2) {
            this();
        }
    }

    public interface b {
        void a(int i, int i2, int i3);
    }

    class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60263a;

        /* renamed from: b  reason: collision with root package name */
        float f60264b;

        /* renamed from: c  reason: collision with root package name */
        float f60265c;

        /* renamed from: d  reason: collision with root package name */
        float f60266d;

        /* renamed from: e  reason: collision with root package name */
        int f60267e;

        /* renamed from: f  reason: collision with root package name */
        a f60268f;
        a g;
        a h;

        c(boolean z) {
            int i2;
            if (z) {
                i2 = 255;
            } else {
                i2 = 0;
            }
            this.f60267e = i2;
        }
    }

    public long getDuration() {
        return this.T;
    }

    public int getState() {
        return this.H;
    }

    public final void d() {
        this.H = 3;
        this.O = true;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 65583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 65583, new Class[0], Void.TYPE);
            return;
        }
        this.I = 100;
        this.H = 1;
        this.O = true;
        this.P.setAlpha(0);
        invalidate();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 65585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 65585, new Class[0], Void.TYPE);
            return;
        }
        this.I = 100;
        this.H = 2;
        this.O = true;
        this.P.setAlpha(255);
        invalidate();
    }

    public DraweeController getController() {
        if (!PatchProxy.isSupport(new Object[0], this, G, false, 65580, new Class[0], DraweeController.class)) {
            return this.S.getController();
        }
        return (DraweeController) PatchProxy.accessDispatch(new Object[0], this, G, false, 65580, new Class[0], DraweeController.class);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 65575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 65575, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.S.onAttach();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 65573, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 65573, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.S.onDetach();
    }

    public void onFinishTemporaryDetach() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 65576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 65576, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishTemporaryDetach();
        this.S.onAttach();
    }

    public void onStartTemporaryDetach() {
        if (PatchProxy.isSupport(new Object[0], this, G, false, 65574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 65574, new Class[0], Void.TYPE);
            return;
        }
        super.onStartTemporaryDetach();
        this.S.onDetach();
    }

    public void setDuration(long j) {
        this.T = j;
    }

    public void setOnTransferListener(b bVar) {
        this.R = bVar;
    }

    public void setState(int i) {
        this.H = i;
    }

    public TransferImage(Context context) {
        this(context, null);
    }

    public void setController(DraweeController draweeController) {
        DraweeController draweeController2 = draweeController;
        if (PatchProxy.isSupport(new Object[]{draweeController2}, this, G, false, 65579, new Class[]{DraweeController.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{draweeController2}, this, G, false, 65579, new Class[]{DraweeController.class}, Void.TYPE);
            return;
        }
        this.S.setController(draweeController2);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, G, false, 65584, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, G, false, 65584, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.I = 200;
        this.H = 1;
        this.J = i;
        this.O = true;
        if (this.J == 201) {
            this.P.setAlpha(0);
        } else {
            this.P.setAlpha(255);
        }
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, G, false, 65578, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, G, false, 65578, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.S.onTouchEvent(motionEvent2) || super.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, G, false, 65587, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, G, false, 65587, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.P.setColor(i);
    }

    public boolean verifyDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, G, false, 65577, new Class[]{Drawable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{drawable2}, this, G, false, 65577, new Class[]{Drawable.class}, Boolean.TYPE)).booleanValue();
        }
        super.verifyDrawable(drawable);
        if (drawable2 == ((GenericDraweeHierarchy) this.S.getHierarchy()).getTopLevelDrawable()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r24) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = G
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 65590(0x10036, float:9.1911E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65590(0x10036, float:9.1911E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            android.graphics.drawable.Drawable r0 = r23.getDrawable()
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            int r0 = r7.H
            r11 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x066e
            boolean r0 = r7.O
            r12 = 201(0xc9, float:2.82E-43)
            r13 = 200(0xc8, float:2.8E-43)
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 2
            if (r0 == 0) goto L_0x0177
            int r0 = r7.H
            if (r0 != r15) goto L_0x0056
            r6 = 1
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r6)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65588(0x10034, float:9.1908E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r1 = r23
            r17 = r6
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0096
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65588(0x10034, float:9.1908E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0177
        L_0x0096:
            android.graphics.drawable.Drawable r0 = r23.getDrawable()
            if (r0 == 0) goto L_0x0177
            int r1 = r23.getWidth()
            if (r1 == 0) goto L_0x0177
            int r1 = r23.getHeight()
            if (r1 != 0) goto L_0x00aa
            goto L_0x0177
        L_0x00aa:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c
            r2 = r17
            r1.<init>(r2)
            r7.Q = r1
            int r1 = r7.K
            float r1 = (float) r1
            int r2 = r0.getIntrinsicWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r7.L
            float r2 = (float) r2
            int r3 = r0.getIntrinsicHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = r2
        L_0x00cb:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            r2.f60264b = r1
            int r2 = r23.getWidth()
            float r2 = (float) r2
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = r23.getHeight()
            float r3 = (float) r3
            int r4 = r0.getIntrinsicHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r2 = r3
        L_0x00eb:
            int r3 = r7.I
            if (r3 != r13) goto L_0x00f8
            int r3 = r7.J
            if (r3 != r12) goto L_0x00f8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            r2.f60265c = r1
            goto L_0x00fc
        L_0x00f8:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            r1.f60265c = r2
        L_0x00fc:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r2 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a
            r2.<init>(r7, r10)
            r1.f60268f = r2
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f60268f
            int r2 = r7.M
            float r2 = (float) r2
            r1.f60258b = r2
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f60268f
            int r2 = r7.N
            float r2 = (float) r2
            r1.f60259c = r2
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f60268f
            int r2 = r7.K
            float r2 = (float) r2
            r1.f60260d = r2
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f60268f
            int r2 = r7.L
            float r2 = (float) r2
            r1.f60261e = r2
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r2 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a
            r2.<init>(r7, r10)
            r1.g = r2
            int r1 = r0.getIntrinsicWidth()
            float r1 = (float) r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            float r2 = r2.f60265c
            float r1 = r1 * r2
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            float r2 = r2.f60265c
            float r0 = r0 * r2
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r2 = r2.g
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r3 = r3 - r1
            float r3 = r3 / r14
            r2.f60258b = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r2 = r2.g
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r3 = r3 - r0
            float r3 = r3 / r14
            r2.f60259c = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r2 = r2.g
            r2.f60260d = r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.g
            r1.f60261e = r0
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a
            r1.<init>(r7, r10)
            r0.h = r1
        L_0x0177:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            if (r0 != 0) goto L_0x017f
            super.onDraw(r24)
            return
        L_0x017f:
            boolean r0 = r7.O
            if (r0 == 0) goto L_0x0256
            int r0 = r7.H
            switch(r0) {
                case 1: goto L_0x0216;
                case 2: goto L_0x01d5;
                case 3: goto L_0x018a;
                default: goto L_0x0188;
            }
        L_0x0188:
            goto L_0x0256
        L_0x018a:
            android.graphics.Paint r0 = r7.P
            r0.setAlpha(r11)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.c.f60263a
            r19 = 0
            r20 = 65602(0x10042, float:9.1928E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x01c2
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.c.f60263a
            r19 = 0
            r20 = 65602(0x10042, float:9.1928E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0256
        L_0x01c2:
            float r1 = r0.f60264b
            r0.f60266d = r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r0.g     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            java.lang.Object r1 = r1.clone()     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = (com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.a) r1     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            r0.h = r1     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            goto L_0x0256
        L_0x01d2:
            goto L_0x0256
        L_0x01d5:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.c.f60263a
            r19 = 0
            r20 = 65601(0x10041, float:9.1927E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x0207
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.c.f60263a
            r19 = 0
            r20 = 65601(0x10041, float:9.1927E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0256
        L_0x0207:
            float r1 = r0.f60265c
            r0.f60266d = r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r0.g     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            java.lang.Object r1 = r1.clone()     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = (com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.a) r1     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            r0.h = r1     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            goto L_0x0256
        L_0x0216:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.c.f60263a
            r19 = 0
            r20 = 65600(0x10040, float:9.1925E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x0248
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.c.f60263a
            r19 = 0
            r20 = 65600(0x10040, float:9.1925E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0256
        L_0x0248:
            float r1 = r0.f60264b
            r0.f60266d = r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r0.f60268f     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            java.lang.Object r1 = r1.clone()     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = (com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.a) r1     // Catch:{ CloneNotSupportedException -> 0x01d2 }
            r0.h = r1     // Catch:{ CloneNotSupportedException -> 0x01d2 }
        L_0x0256:
            android.graphics.Paint r0 = r7.P
            r8.drawPaint(r0)
            int r11 = r24.getSaveCount()
            r24.save()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65589(0x10035, float:9.191E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0288
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65589(0x10035, float:9.191E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02cf
        L_0x0288:
            android.graphics.drawable.Drawable r0 = r23.getDrawable()
            if (r0 == 0) goto L_0x02cf
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            if (r1 != 0) goto L_0x0293
            goto L_0x02cf
        L_0x0293:
            android.graphics.Matrix r1 = r7.U
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            float r2 = r2.f60266d
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60266d
            r1.setScale(r2, r3)
            android.graphics.Matrix r1 = r7.U
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r2 = r7.Q
            float r2 = r2.f60266d
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 / r14
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.h
            float r3 = r3.f60260d
            float r3 = r3 / r14
            float r2 = r2 - r3
            float r2 = -r2
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60266d
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r3 = r3 * r0
            float r3 = r3 / r14
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.h
            float r0 = r0.f60261e
            float r0 = r0 / r14
            float r3 = r3 - r0
            float r0 = -r3
            r1.postTranslate(r2, r0)
        L_0x02cf:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.h
            float r0 = r0.f60258b
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.h
            float r1 = r1.f60259c
            r8.translate(r0, r1)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.h
            float r0 = r0.f60260d
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.h
            float r1 = r1.f60261e
            r14 = 0
            r8.clipRect(r14, r14, r0, r1)
            android.graphics.Matrix r0 = r7.U
            r8.concat(r0)
            android.graphics.drawable.Drawable r0 = r23.getDrawable()
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            int r1 = r1.f60267e
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = r23.getDrawable()
            r0.draw(r8)
            r8.restoreToCount(r11)
            boolean r0 = r7.O
            if (r0 == 0) goto L_0x066d
            int r0 = r7.H
            r8 = 3
            if (r0 == r8) goto L_0x066d
            r7.O = r10
            int r0 = r7.I
            r1 = 100
            r11 = 5
            r6 = 4
            if (r0 == r1) goto L_0x047a
            if (r0 == r13) goto L_0x031f
            goto L_0x066d
        L_0x031f:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65591(0x10037, float:9.1913E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r13 = java.lang.Void.TYPE
            r1 = r23
            r14 = 4
            r6 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0348
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65591(0x10037, float:9.1913E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0683
        L_0x0348:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            if (r0 == 0) goto L_0x066d
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            long r1 = r7.T
            r0.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            int r1 = r7.J
            if (r1 != r12) goto L_0x03d9
            java.lang.String r1 = "left"
            float[] r2 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.f60268f
            float r3 = r3.f60258b
            r2[r10] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.g
            float r3 = r3.f60258b
            r2[r9] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "top"
            float[] r3 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f60268f
            float r4 = r4.f60259c
            r3[r10] = r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.g
            float r4 = r4.f60259c
            r3[r9] = r4
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "width"
            float[] r4 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.f60268f
            float r5 = r5.f60260d
            r4[r10] = r5
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.g
            float r5 = r5.f60260d
            r4[r9] = r5
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r4)
            java.lang.String r4 = "height"
            float[] r5 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.f60268f
            float r6 = r6.f60261e
            r5[r10] = r6
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.g
            float r6 = r6.f60261e
            r5[r9] = r6
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r4, r5)
            android.animation.PropertyValuesHolder[] r5 = new android.animation.PropertyValuesHolder[r14]
            r5[r10] = r1
            r5[r9] = r2
            r5[r15] = r3
            r5[r8] = r4
            r0.setValues(r5)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$1 r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$1
            r1.<init>()
            r0.addUpdateListener(r1)
            goto L_0x0464
        L_0x03d9:
            java.lang.String r1 = "left"
            float[] r2 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.f60268f
            float r3 = r3.f60258b
            r2[r10] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.g
            float r3 = r3.f60258b
            r2[r9] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "top"
            float[] r3 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f60268f
            float r4 = r4.f60259c
            r3[r10] = r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.g
            float r4 = r4.f60259c
            r3[r9] = r4
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "width"
            float[] r4 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.f60268f
            float r5 = r5.f60260d
            r4[r10] = r5
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.g
            float r5 = r5.f60260d
            r4[r9] = r5
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r4)
            java.lang.String r4 = "height"
            float[] r5 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.f60268f
            float r6 = r6.f60261e
            r5[r10] = r6
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.g
            float r6 = r6.f60261e
            r5[r9] = r6
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r4, r5)
            java.lang.String r5 = "scale"
            float[] r6 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r7.Q
            float r12 = r12.f60264b
            r6[r10] = r12
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r7.Q
            float r12 = r12.f60265c
            r6[r9] = r12
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r5, r6)
            android.animation.PropertyValuesHolder[] r6 = new android.animation.PropertyValuesHolder[r11]
            r6[r10] = r5
            r6[r9] = r1
            r6[r15] = r2
            r6[r8] = r3
            r6[r14] = r4
            r0.setValues(r6)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$2 r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$2
            r1.<init>()
            r0.addUpdateListener(r1)
        L_0x0464:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$3 r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$3
            r1.<init>()
            r0.addListener(r1)
            int r1 = r7.H
            if (r1 != r9) goto L_0x0475
            r0.start()
            goto L_0x0683
        L_0x0475:
            r0.reverse()
            goto L_0x066d
        L_0x047a:
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65592(0x10038, float:9.1914E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04a2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = G
            r3 = 0
            r4 = 65592(0x10038, float:9.1914E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x066d
        L_0x04a2:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r7.Q
            if (r0 == 0) goto L_0x0683
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            long r1 = r7.T
            r0.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f60268f
            float r1 = r1.f60260d
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x05ce
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f60268f
            float r1 = r1.f60261e
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x04ce
            goto L_0x05ce
        L_0x04ce:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.g
            float r1 = r1.f60260d
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0559
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.g
            float r1 = r1.f60261e
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x04e3
            goto L_0x0559
        L_0x04e3:
            java.lang.String r1 = "scale"
            float[] r2 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60264b
            r2[r10] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60265c
            r2[r9] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "left"
            float[] r3 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f60268f
            float r4 = r4.f60258b
            r3[r10] = r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.g
            float r4 = r4.f60258b
            r3[r9] = r4
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "top"
            float[] r4 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.f60268f
            float r5 = r5.f60259c
            r4[r10] = r5
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.g
            float r5 = r5.f60259c
            r4[r9] = r5
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r4)
            java.lang.String r4 = "width"
            float[] r5 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.f60268f
            float r6 = r6.f60260d
            r5[r10] = r6
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.g
            float r6 = r6.f60260d
            r5[r9] = r6
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r4, r5)
            java.lang.String r5 = "height"
            float[] r6 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r13 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r13 = r13.f60268f
            float r13 = r13.f60261e
            r6[r10] = r13
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r13 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r13 = r13.g
            float r13 = r13.f60261e
            r6[r9] = r13
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r5, r6)
            goto L_0x0642
        L_0x0559:
            java.lang.String r1 = "scale"
            float[] r2 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60264b
            r2[r10] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60264b
            r2[r9] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "left"
            float[] r3 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f60268f
            float r4 = r4.f60258b
            r3[r10] = r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f60268f
            float r4 = r4.f60258b
            r3[r9] = r4
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "top"
            float[] r4 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.f60268f
            float r5 = r5.f60259c
            r4[r10] = r5
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.f60268f
            float r5 = r5.f60259c
            r4[r9] = r5
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r4)
            java.lang.String r4 = "width"
            float[] r5 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.f60268f
            float r6 = r6.f60260d
            r5[r10] = r6
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.f60268f
            float r6 = r6.f60260d
            r5[r9] = r6
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r4, r5)
            java.lang.String r5 = "height"
            float[] r6 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r13 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r13 = r13.f60268f
            float r13 = r13.f60261e
            r6[r10] = r13
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r13 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r13 = r13.f60268f
            float r13 = r13.f60261e
            r6[r9] = r13
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r5, r6)
            goto L_0x0642
        L_0x05ce:
            java.lang.String r1 = "scale"
            float[] r2 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60265c
            r2[r10] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r7.Q
            float r3 = r3.f60265c
            r2[r9] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "left"
            float[] r3 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.g
            float r4 = r4.f60258b
            r3[r10] = r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.g
            float r4 = r4.f60258b
            r3[r9] = r4
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "top"
            float[] r4 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.g
            float r5 = r5.f60259c
            r4[r10] = r5
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r5 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r5 = r5.g
            float r5 = r5.f60259c
            r4[r9] = r5
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r4)
            java.lang.String r4 = "width"
            float[] r5 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.g
            float r6 = r6.f60260d
            r5[r10] = r6
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r6 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r6 = r6.g
            float r6 = r6.f60260d
            r5[r9] = r6
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r4, r5)
            java.lang.String r5 = "height"
            float[] r6 = new float[r15]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r13 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r13 = r13.g
            float r13 = r13.f60261e
            r6[r10] = r13
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r13 = r7.Q
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r13 = r13.g
            float r13 = r13.f60261e
            r6[r9] = r13
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r5, r6)
        L_0x0642:
            android.animation.PropertyValuesHolder[] r6 = new android.animation.PropertyValuesHolder[r11]
            r6[r10] = r1
            r6[r9] = r2
            r6[r15] = r3
            r6[r8] = r4
            r6[r12] = r5
            r0.setValues(r6)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$4 r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$4
            r1.<init>()
            r0.addUpdateListener(r1)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$5 r1 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$5
            r1.<init>()
            r0.addListener(r1)
            int r1 = r7.H
            if (r1 != r9) goto L_0x0669
            r0.start()
            goto L_0x066d
        L_0x0669:
            r0.reverse()
            goto L_0x0683
        L_0x066d:
            return
        L_0x066e:
            android.graphics.Paint r0 = r7.P
            r0.setAlpha(r11)
            android.graphics.Paint r0 = r7.P
            r8.drawPaint(r0)
            android.graphics.drawable.Drawable r0 = r23.getDrawable()     // Catch:{ Exception -> 0x0683 }
            r0.setAlpha(r11)     // Catch:{ Exception -> 0x0683 }
            super.onDraw(r24)     // Catch:{ Exception -> 0x0683 }
            return
        L_0x0683:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage.onDraw(android.graphics.Canvas):void");
    }

    private TransferImage(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private TransferImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.I = 100;
        this.J = 201;
        this.T = 300;
        if (PatchProxy.isSupport(new Object[0], this, G, false, 65572, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, G, false, 65572, new Class[0], Void.TYPE);
            return;
        }
        this.U = new Matrix();
        this.P = new Paint();
        if (this.S == null) {
            this.S = DraweeHolder.create(new GenericDraweeHierarchyBuilder(getResources()).build(), getContext());
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.M = i;
        this.N = i2;
        this.K = i3;
        this.L = i4;
    }

    private Rect b(Drawable drawable, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, G, false, 65582, new Class[]{Drawable.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, G, false, 65582, new Class[]{Drawable.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Rect.class);
        }
        Rect rect = new Rect();
        float intrinsicWidth = ((float) i) / ((float) drawable.getIntrinsicWidth());
        float intrinsicHeight = ((float) i2) / ((float) drawable.getIntrinsicHeight());
        if (intrinsicWidth <= intrinsicHeight) {
            intrinsicWidth = intrinsicHeight;
        }
        float intrinsicWidth2 = ((float) drawable.getIntrinsicWidth()) * intrinsicWidth;
        float intrinsicHeight2 = ((float) drawable.getIntrinsicHeight()) * intrinsicWidth;
        rect.left = (int) ((((float) i3) - intrinsicWidth2) / 2.0f);
        rect.top = (int) ((((float) i4) - intrinsicHeight2) / 2.0f);
        rect.right = (int) intrinsicWidth2;
        rect.bottom = (int) intrinsicHeight2;
        return rect;
    }

    public final void a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, G, false, 65581, new Class[]{Drawable.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, G, false, 65581, new Class[]{Drawable.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Rect b2 = b(drawable, i, i2, i3, i4);
        this.M = b2.left;
        this.N = b2.top;
        this.K = b2.right;
        this.L = b2.bottom;
    }
}
