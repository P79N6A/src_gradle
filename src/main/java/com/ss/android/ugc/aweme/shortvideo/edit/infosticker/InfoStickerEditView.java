package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.p;
import java.io.File;

public class InfoStickerEditView extends View {
    private static int A = 3000;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67184a;
    private Point B;
    private Context C;
    private boolean D;

    /* renamed from: b  reason: collision with root package name */
    public int f67185b;

    /* renamed from: c  reason: collision with root package name */
    public int f67186c;

    /* renamed from: d  reason: collision with root package name */
    public int f67187d;

    /* renamed from: e  reason: collision with root package name */
    public int f67188e;

    /* renamed from: f  reason: collision with root package name */
    p f67189f;
    public SafeHandler g;
    public b h;
    cb i;
    public boolean j = true;
    public com.ss.android.ugc.aweme.base.a<y> k;
    public c l = new c();
    @TouchConsumedType
    public int m;
    public long n;
    public boolean o;
    public boolean p;
    public float q;
    public float r;
    public float s;
    public float t;
    public InfoStickerHelper.b u;
    public boolean v = true;
    public boolean w;
    public boolean x;
    public boolean y;
    Runnable z = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67194a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67194a, false, 76774, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67194a, false, 76774, new Class[0], Void.TYPE);
                return;
            }
            if (!(InfoStickerEditView.this.h == null || InfoStickerEditView.this.l == null || InfoStickerEditView.this.l.f67198a == null || !InfoStickerEditView.this.l.f67198a.f67433d)) {
                InfoStickerEditView.this.y = false;
                InfoStickerEditView.this.l.f67198a.f67433d = false;
                InfoStickerEditView.this.h.a();
                InfoStickerEditView.this.invalidate();
            }
        }
    };

    public interface a {
        float a(float f2);
    }

    class b extends com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67196a;

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f67196a, false, 76784, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f67196a, false, 76784, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                InfoStickerEditView.this.a(cVar.j, cVar.k);
                if (InfoStickerEditView.this.l.f67198a == null) {
                    return super.a(cVar);
                }
                InfoStickerEditView.this.x = InfoStickerEditView.this.y;
                InfoStickerEditView.this.h.a();
                InfoStickerEditView.this.h.a(InfoStickerEditView.this.l.f67198a, true);
                InfoStickerEditView.this.l.f67198a.f67433d = false;
                InfoStickerEditView.this.h.b(InfoStickerEditView.this.l.f67198a);
                InfoStickerEditView.this.invalidate();
                return true;
            }
        }

        private b() {
        }

        public final boolean a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67196a, false, 76783, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67196a, false, 76783, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                InfoStickerEditView.this.d();
                return false;
            }
        }

        public final void b(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f67196a, false, 76780, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f67196a, false, 76780, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Void.TYPE);
            } else if (InfoStickerEditView.this.j) {
                InfoStickerEditView.this.u.a(InfoStickerEditView.this.l.f67198a, true, false);
                InfoStickerEditView.this.d();
            }
        }

        public final boolean c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67196a, false, 76786, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67196a, false, 76786, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                InfoStickerEditView.this.d();
                InfoStickerEditView.this.u.a(InfoStickerEditView.this.l.f67198a, true, true);
                return false;
            }
        }

        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f67196a, false, 76781, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f67196a, false, 76781, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                InfoStickerEditView.this.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                if (InfoStickerEditView.this.l.f67198a == null) {
                    return false;
                }
                InfoStickerEditView.this.x = InfoStickerEditView.this.y;
                InfoStickerEditView.this.h.a();
                InfoStickerEditView.this.h.a(InfoStickerEditView.this.l.f67198a, true);
                InfoStickerEditView.this.l.f67198a.f67433d = false;
                InfoStickerEditView.this.h.b(InfoStickerEditView.this.l.f67198a);
                InfoStickerEditView.this.invalidate();
                return true;
            }
        }

        public final boolean b(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67196a, false, 76785, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67196a, false, 76785, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                if (InfoStickerEditView.this.l.f67198a == null) {
                    return super.b(f2);
                }
                InfoStickerEditView.this.m = 2;
                float degrees = (float) Math.toDegrees((double) f2);
                if (Math.abs(degrees) > 10.0f) {
                    degrees = 0.0f;
                }
                if (4 == InfoStickerEditView.this.u.a(InfoStickerEditView.this.l.f67198a, false, true)) {
                    degrees = InfoStickerEditView.this.u.a(degrees).floatValue();
                }
                InfoStickerEditView.this.h.a(InfoStickerEditView.this.l.f67198a, -degrees);
                InfoStickerEditView.this.invalidate();
                return true;
            }
        }

        public final boolean a(MotionEvent motionEvent) {
            int i;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67196a, false, 76787, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67196a, false, 76787, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (InfoStickerEditView.this.o) {
                InfoStickerEditView.this.o = false;
                return true;
            } else if (InfoStickerEditView.this.p) {
                if (!InfoStickerEditView.this.y) {
                    return false;
                }
                InfoStickerEditView.this.y = false;
                return true;
            } else if (InfoStickerEditView.this.h == null) {
                return false;
            } else {
                float y = motionEvent.getY();
                if (fc.a()) {
                    if (!fb.a()) {
                        i = 0;
                    } else {
                        i = fb.f67664c;
                    }
                    y -= (float) i;
                }
                b bVar = InfoStickerEditView.this.h;
                int x = (int) motionEvent.getX();
                int i2 = (int) y;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(x), Integer.valueOf(i2)}, bVar, b.f67226a, false, 76748, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(x), Integer.valueOf(i2)}, bVar, b.f67226a, false, 76748, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (bVar.f67227b == null || bVar.f67227b.size() == 0) {
                    return false;
                } else {
                    for (y yVar : bVar.f67227b) {
                        if (yVar.h.contains((float) x, (float) i2)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0192, code lost:
            if (r8.p.contains(r3, r0) != false) goto L_0x0194;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean d(android.view.MotionEvent r20) {
            /*
                r19 = this;
                r7 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r20
                com.meituan.robust.ChangeQuickRedirect r2 = f67196a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Boolean.TYPE
                r3 = 0
                r4 = 76775(0x12be7, float:1.07585E-40)
                r1 = r19
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003d
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r20
                com.meituan.robust.ChangeQuickRedirect r2 = f67196a
                r3 = 0
                r4 = 76775(0x12be7, float:1.07585E-40)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Boolean.TYPE
                r1 = r19
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x003d:
                float r0 = r20.getY()
                boolean r1 = com.ss.android.ugc.aweme.shortvideo.fc.a()
                if (r1 == 0) goto L_0x0053
                boolean r1 = com.ss.android.ugc.aweme.shortvideo.fb.a()
                if (r1 != 0) goto L_0x004f
                r1 = 0
                goto L_0x0051
            L_0x004f:
                int r1 = com.ss.android.ugc.aweme.shortvideo.fb.f67664c
            L_0x0051:
                float r1 = (float) r1
                float r0 = r0 - r1
            L_0x0053:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                float r2 = r20.getX()
                r1.q = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                r1.r = r0
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                float r2 = r20.getX()
                r1.s = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                r1.t = r0
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                long r2 = java.lang.System.currentTimeMillis()
                r1.n = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                r2 = -1
                r1.m = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r1 = r1.l
                r1.a()
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                boolean r1 = r1.j
                if (r1 == 0) goto L_0x01e2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.this
                float r3 = r20.getX()
                r4 = 2
                java.lang.Object[] r11 = new java.lang.Object[r4]
                java.lang.Float r5 = java.lang.Float.valueOf(r3)
                r11[r10] = r5
                java.lang.Float r5 = java.lang.Float.valueOf(r0)
                r11[r9] = r5
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.f67184a
                r14 = 0
                r15 = 76769(0x12be1, float:1.07576E-40)
                java.lang.Class[] r5 = new java.lang.Class[r4]
                java.lang.Class r6 = java.lang.Float.TYPE
                r5[r10] = r6
                java.lang.Class r6 = java.lang.Float.TYPE
                r5[r9] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x00dd
                java.lang.Object[] r11 = new java.lang.Object[r4]
                java.lang.Float r2 = java.lang.Float.valueOf(r3)
                r11[r10] = r2
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r11[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.f67184a
                r14 = 0
                r15 = 76769(0x12be1, float:1.07576E-40)
                java.lang.Class[] r0 = new java.lang.Class[r4]
                java.lang.Class r2 = java.lang.Float.TYPE
                r0[r10] = r2
                java.lang.Class r2 = java.lang.Float.TYPE
                r0[r9] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01e2
            L_0x00dd:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b r5 = r1.h
                java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y> r5 = r5.f67227b
                boolean r5 = com.bytedance.common.utility.Lists.isEmpty(r5)
                if (r5 != 0) goto L_0x01e2
                com.ss.android.vesdk.p r5 = r1.f67189f
                int r5 = r5.u()
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b r6 = r1.h
                java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y> r6 = r6.f67227b
                java.util.Iterator r6 = r6.iterator()
            L_0x00f5:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x01d9
                java.lang.Object r8 = r6.next()
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y r8 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y) r8
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b r11 = r1.h
                boolean r11 = r11.a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y) r8, (int) r5)
                if (r11 == 0) goto L_0x00f5
                r15 = 3
                java.lang.Object[] r11 = new java.lang.Object[r15]
                r11[r10] = r8
                java.lang.Float r12 = java.lang.Float.valueOf(r3)
                r11[r9] = r12
                java.lang.Float r12 = java.lang.Float.valueOf(r0)
                r11[r4] = r12
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.f67184a
                r14 = 0
                r16 = 76767(0x12bdf, float:1.07573E-40)
                java.lang.Class[] r12 = new java.lang.Class[r15]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y> r17 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y.class
                r12[r10] = r17
                java.lang.Class r17 = java.lang.Float.TYPE
                r12[r9] = r17
                java.lang.Class r17 = java.lang.Float.TYPE
                r12[r4] = r17
                java.lang.Class r17 = java.lang.Integer.TYPE
                r18 = r12
                r12 = r1
                r2 = 3
                r15 = r16
                r16 = r18
                boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r11 == 0) goto L_0x0172
                java.lang.Object[] r11 = new java.lang.Object[r2]
                r11[r10] = r8
                java.lang.Float r12 = java.lang.Float.valueOf(r3)
                r11[r9] = r12
                java.lang.Float r12 = java.lang.Float.valueOf(r0)
                r11[r4] = r12
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.f67184a
                r14 = 0
                r15 = 76767(0x12bdf, float:1.07573E-40)
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y> r12 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y.class
                r2[r10] = r12
                java.lang.Class r12 = java.lang.Float.TYPE
                r2[r9] = r12
                java.lang.Class r12 = java.lang.Float.TYPE
                r2[r4] = r12
                java.lang.Class r17 = java.lang.Integer.TYPE
                r12 = r1
                r16 = r2
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                goto L_0x0194
            L_0x0172:
                boolean r11 = r8.f67433d
                if (r11 != 0) goto L_0x0178
            L_0x0176:
                r2 = -1
                goto L_0x0194
            L_0x0178:
                android.graphics.RectF r11 = r8.q
                boolean r11 = r11.contains(r3, r0)
                if (r11 == 0) goto L_0x0182
                r2 = 1
                goto L_0x0194
            L_0x0182:
                android.graphics.RectF r11 = r8.r
                boolean r11 = r11.contains(r3, r0)
                if (r11 == 0) goto L_0x018c
                r2 = 2
                goto L_0x0194
            L_0x018c:
                android.graphics.RectF r11 = r8.p
                boolean r11 = r11.contains(r3, r0)
                if (r11 == 0) goto L_0x0176
            L_0x0194:
                if (r2 < 0) goto L_0x01b2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r11 = r1.l
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y r11 = r11.f67198a
                if (r11 == 0) goto L_0x01a6
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r11 = r1.l
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y r11 = r11.f67198a
                int r11 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b.a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y) r8, (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y) r11)
                if (r11 <= 0) goto L_0x01b2
            L_0x01a6:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r11 = r1.l
                r11.f67198a = r8
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r11 = r1.l
                r11.f67199b = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r2 = r1.l
                r2.f67200c = r9
            L_0x01b2:
                boolean r2 = r1.a(r8, r3, r0)
                if (r2 == 0) goto L_0x01d6
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r2 = r1.l
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y r2 = r2.f67198a
                if (r2 == 0) goto L_0x01c8
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r2 = r1.l
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y r2 = r2.f67198a
                int r2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b.a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y) r8, (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y) r2)
                if (r2 <= 0) goto L_0x01d6
            L_0x01c8:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r2 = r1.l
                r2.f67198a = r8
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r2 = r1.l
                r2.f67199b = r10
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r2 = r1.l
                boolean r8 = r8.f67433d
                r2.f67200c = r8
            L_0x01d6:
                r2 = -1
                goto L_0x00f5
            L_0x01d9:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b r0 = r1.h
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c r1 = r1.l
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y r1 = r1.f67198a
                r0.c(r1)
            L_0x01e2:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.b.d(android.view.MotionEvent):boolean");
        }

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
            boolean z;
            Pair pair;
            int i;
            boolean z2;
            com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f67196a, false, 76779, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f67196a, false, 76779, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                float f2 = bVar2.j.x;
                float f3 = bVar2.j.y;
                float f4 = InfoStickerEditView.this.q + f2;
                float f5 = InfoStickerEditView.this.r + f3;
                float abs = Math.abs(f4 - InfoStickerEditView.this.s);
                float abs2 = Math.abs(f5 - InfoStickerEditView.this.t);
                if ((abs < 5.0f && abs2 < 5.0f) || InfoStickerEditView.this.l.f67198a == null) {
                    return false;
                }
                f fVar = null;
                InfoStickerHelper.b bVar3 = InfoStickerEditView.this.u;
                y yVar = InfoStickerEditView.this.l.f67198a;
                if (InfoStickerEditView.this.l.f67199b == 3) {
                    z = true;
                } else {
                    z = false;
                }
                int a2 = bVar3.a(yVar, false, z);
                if (3 == a2) {
                    PointF a3 = InfoStickerEditView.this.u.a(InfoStickerEditView.this.l.f67198a, f2, f3);
                    float f6 = a3.x;
                    float f7 = a3.y;
                    float f8 = InfoStickerEditView.this.q + a3.x;
                    float f9 = f8;
                    f5 = a3.y + InfoStickerEditView.this.r;
                    f2 = f6;
                    f3 = f7;
                    f4 = f9;
                } else if (4 == a2) {
                    fVar = new f(this);
                }
                if (InfoStickerEditView.this.l.f67199b == 0 || InfoStickerEditView.this.l.f67199b == 3) {
                    if (InfoStickerEditView.this.u != null) {
                        if (InfoStickerEditView.this.l.f67198a.f67433d) {
                            InfoStickerEditView.this.x = true;
                        }
                        InfoStickerHelper.b bVar4 = InfoStickerEditView.this.u;
                        y yVar2 = InfoStickerEditView.this.l.f67198a;
                        int i2 = (int) f4;
                        int i3 = (int) f5;
                        if (InfoStickerEditView.this.l.f67199b == 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bVar4.a(yVar2, i2, i3, false, z2);
                    }
                    InfoStickerEditView.this.q = f4;
                    InfoStickerEditView.this.r = f5;
                }
                InfoStickerEditView.this.m = 2;
                if (InfoStickerEditView.this.l.f67199b == 3) {
                    b bVar5 = InfoStickerEditView.this.h;
                    y yVar3 = InfoStickerEditView.this.l.f67198a;
                    if (PatchProxy.isSupport(new Object[]{yVar3, Float.valueOf(f2), Float.valueOf(f3), fVar}, bVar5, b.f67226a, false, 76734, new Class[]{y.class, Float.TYPE, Float.TYPE, a.class}, Void.TYPE)) {
                        b bVar6 = bVar5;
                        PatchProxy.accessDispatch(new Object[]{yVar3, Float.valueOf(f2), Float.valueOf(f3), fVar}, bVar6, b.f67226a, false, 76734, new Class[]{y.class, Float.TYPE, Float.TYPE, a.class}, Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), fVar}, yVar3, y.f67430a, false, 76869, new Class[]{Float.TYPE, Float.TYPE, a.class}, Pair.class)) {
                            y yVar4 = yVar3;
                            pair = (Pair) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), fVar}, yVar4, y.f67430a, false, 76869, new Class[]{Float.TYPE, Float.TYPE, a.class}, Pair.class);
                        } else {
                            yVar3.s = System.currentTimeMillis();
                            float centerX = yVar3.f67435f.centerX();
                            float centerY = yVar3.f67435f.centerY();
                            float centerX2 = yVar3.p.centerX();
                            float centerY2 = yVar3.p.centerY();
                            float f10 = f2 + centerX2;
                            float f11 = f3 + centerY2;
                            float f12 = centerX2 - centerX;
                            float f13 = centerY2 - centerY;
                            float f14 = f10 - centerX;
                            float f15 = f11 - centerY;
                            float sqrt = (float) Math.sqrt((double) ((f12 * f12) + (f13 * f13)));
                            float sqrt2 = (float) Math.sqrt((double) ((f14 * f14) + (f15 * f15)));
                            float f16 = sqrt2 / sqrt;
                            double d2 = (double) (((f12 * f14) + (f13 * f15)) / (sqrt * sqrt2));
                            if (d2 > 1.0d || d2 < -1.0d) {
                                pair = Pair.create(Float.valueOf(f16), Float.valueOf(0.0f));
                            } else {
                                float degrees = (float) Math.toDegrees(Math.acos(d2));
                                if ((f12 * f15) - (f14 * f13) > 0.0f) {
                                    i = 1;
                                } else {
                                    i = -1;
                                }
                                float f17 = ((float) i) * degrees;
                                if (fVar != null) {
                                    f17 = fVar.a(f17);
                                }
                                pair = Pair.create(Float.valueOf(f16), Float.valueOf(f17));
                            }
                        }
                        bVar5.b(yVar3, ((Float) pair.first).floatValue());
                        bVar5.a(yVar3, ((Float) pair.second).floatValue());
                    }
                } else if (InfoStickerEditView.this.l.f67199b == 0) {
                    InfoStickerEditView.this.h.a(InfoStickerEditView.this.l.f67198a, f2, f3);
                }
                InfoStickerEditView.this.invalidate();
                return true;
            }
        }

        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f67196a, false, 76782, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f67196a, false, 76782, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                if (InfoStickerEditView.this.l.f67198a == null) {
                    return super.b(scaleGestureDetector);
                }
                InfoStickerEditView.this.m = 2;
                InfoStickerEditView.this.h.b(InfoStickerEditView.this.l.f67198a, scaleGestureDetector.getScaleFactor());
                InfoStickerEditView.this.invalidate();
                return true;
            }
        }

        public final boolean e(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67196a, false, 76776, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67196a, false, 76776, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                if (!(InfoStickerEditView.this.u == null || InfoStickerEditView.this.l.f67198a == null || (InfoStickerEditView.this.l.f67199b != 0 && InfoStickerEditView.this.l.f67199b != 3))) {
                    InfoStickerHelper.b bVar = InfoStickerEditView.this.u;
                    y yVar = InfoStickerEditView.this.l.f67198a;
                    int i = (int) InfoStickerEditView.this.q;
                    int i2 = (int) InfoStickerEditView.this.r;
                    if (InfoStickerEditView.this.l.f67199b == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.a(yVar, i, i2, true, z2);
                    if (InfoStickerEditView.this.x) {
                        InfoStickerEditView.this.x = false;
                        InfoStickerEditView.this.setShowHelpBox(true);
                    }
                }
                if (System.currentTimeMillis() - InfoStickerEditView.this.n < 200) {
                    if (InfoStickerEditView.this.l.f67198a == null) {
                        InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                        b bVar2 = InfoStickerEditView.this.h;
                        if (PatchProxy.isSupport(new Object[0], bVar2, b.f67226a, false, 76732, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar2, b.f67226a, false, 76732, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            if (bVar2.f67228c != null) {
                                z3 = true;
                            }
                            bVar2.a();
                            z = z3;
                        }
                        infoStickerEditView.p = z;
                        InfoStickerEditView.this.invalidate();
                    } else {
                        InfoStickerEditView.this.p = false;
                        switch (InfoStickerEditView.this.l.f67199b) {
                            case 0:
                                InfoStickerEditView.this.setShowHelpBox(true);
                                InfoStickerEditView.this.m = 1;
                                b bVar3 = InfoStickerEditView.this.h;
                                y yVar2 = InfoStickerEditView.this.l.f67198a;
                                if (!PatchProxy.isSupport(new Object[]{yVar2}, bVar3, b.f67226a, false, 76731, new Class[]{y.class}, Void.TYPE)) {
                                    if (bVar3.h != null) {
                                        bVar3.h.a(false);
                                    }
                                    if (bVar3.f67228c != yVar2) {
                                        bVar3.a();
                                        bVar3.f67228c = yVar2;
                                    }
                                    bVar3.f67228c.f67433d = true;
                                    bVar3.f67231f.a(bVar3.f67228c.f67432c.id, 0, bVar3.f67229d);
                                    break;
                                } else {
                                    b bVar4 = bVar3;
                                    PatchProxy.accessDispatch(new Object[]{yVar2}, bVar4, b.f67226a, false, 76731, new Class[]{y.class}, Void.TYPE);
                                    break;
                                }
                            case 1:
                                InfoStickerEditView.this.o = true;
                                InfoStickerEditView.this.m = 1;
                                InfoStickerEditView.this.h.a(InfoStickerEditView.this.l.f67198a);
                                break;
                            case 2:
                                if (InfoStickerEditView.this.v) {
                                    InfoStickerEditView.this.m = 1;
                                    b bVar5 = InfoStickerEditView.this.h;
                                    y yVar3 = InfoStickerEditView.this.l.f67198a;
                                    if (PatchProxy.isSupport(new Object[]{yVar3}, bVar5, b.f67226a, false, 76726, new Class[]{y.class}, Void.TYPE)) {
                                        b bVar6 = bVar5;
                                        PatchProxy.accessDispatch(new Object[]{yVar3}, bVar6, b.f67226a, false, 76726, new Class[]{y.class}, Void.TYPE);
                                    } else {
                                        yVar3.f67433d = false;
                                        bVar5.a();
                                    }
                                    InfoStickerEditView.this.h.b();
                                    if (InfoStickerEditView.this.k != null) {
                                        InfoStickerEditView.this.k.run(InfoStickerEditView.this.l.f67198a);
                                        break;
                                    }
                                }
                                break;
                        }
                        InfoStickerEditView.this.d();
                        InfoStickerEditView.this.invalidate();
                    }
                    if (!InfoStickerEditView.this.y) {
                        InfoStickerEditView.this.c();
                        InfoStickerEditView.this.g.postDelayed(new d(this), 300);
                    }
                    return true;
                }
                if (!InfoStickerEditView.this.y) {
                    InfoStickerEditView.this.c();
                    InfoStickerEditView.this.g.postDelayed(new e(this), 300);
                }
                return super.e(motionEvent);
            }
        }

        /* synthetic */ b(InfoStickerEditView infoStickerEditView, byte b2) {
            this();
        }

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar, float f2, float f3) {
            float f4;
            int i;
            if (PatchProxy.isSupport(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f67196a, false, 76778, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f67196a, false, 76778, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            if (fc.a()) {
                if (!fb.a()) {
                    i = 0;
                } else {
                    i = fb.f67664c;
                }
                f4 = f3 - ((float) i);
            } else {
                f4 = f3;
            }
            if (!InfoStickerEditView.this.j) {
                return false;
            }
            if (InfoStickerEditView.this.l.f67198a == null) {
                float f5 = f2;
                InfoStickerEditView.this.a(f2, f4);
            }
            if (InfoStickerEditView.this.l.f67198a == null) {
                return false;
            }
            if (InfoStickerEditView.this.l.f67199b == 3 || InfoStickerEditView.this.l.f67199b == 0) {
                InfoStickerEditView.this.x = InfoStickerEditView.this.y;
                InfoStickerEditView.this.h.a();
                InfoStickerEditView.this.h.a(InfoStickerEditView.this.l.f67198a, true);
                InfoStickerEditView.this.l.f67198a.f67433d = false;
                InfoStickerEditView.this.h.b(InfoStickerEditView.this.l.f67198a);
            }
            InfoStickerEditView.this.invalidate();
            return true;
        }

        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (InfoStickerEditView.this.j && InfoStickerEditView.this.l.f67198a != null) {
                return true;
            }
            return false;
        }

        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67196a, false, 76777, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67196a, false, 76777, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!InfoStickerEditView.this.j) {
                return false;
            } else {
                StringBuilder sb = new StringBuilder("onFling: ");
                if (InfoStickerEditView.this.l.f67198a == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                if (InfoStickerEditView.this.l.f67198a != null) {
                    return true;
                }
                return false;
            }
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        y f67198a;
        @HitArea

        /* renamed from: b  reason: collision with root package name */
        int f67199b;

        /* renamed from: c  reason: collision with root package name */
        boolean f67200c;

        public final void a() {
            this.f67198a = null;
        }

        c() {
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67184a, false, 76751, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67184a, false, 76751, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j = z2;
        if (!z2 && this.h.f67228c != null) {
            this.h.a();
            invalidate();
        }
    }

    public final void a(String str, String str2, String str3, int i2) {
        String str4 = str2;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{str, str4, str5, Integer.valueOf(i2)}, this, f67184a, false, 76753, new Class[]{String.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str4, str5, Integer.valueOf(i2)}, this, f67184a, false, 76753, new Class[]{String.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.h;
        if (PatchProxy.isSupport(new Object[]{str, str4, str5, Integer.valueOf(i2)}, bVar, b.f67226a, false, 76724, new Class[]{String.class, String.class, String.class, Integer.TYPE}, y.class)) {
            y yVar = (y) PatchProxy.accessDispatch(new Object[]{str, str4, str5, Integer.valueOf(i2)}, bVar, b.f67226a, false, 76724, new Class[]{String.class, String.class, String.class, Integer.TYPE}, y.class);
        } else {
            if (bVar.f67228c != null && bVar.f67228c.f67433d) {
                bVar.f67228c.f67433d = false;
            }
            int a2 = bVar.f67231f.a(str4, TextUtils.isEmpty(str3) ? null : new String[]{str5});
            if (a2 < 0) {
                boolean b2 = com.ss.android.ugc.aweme.video.b.b(str2);
                long length = b2 ? new File(str4).length() : 0;
                com.ss.android.ugc.aweme.framework.a.a.a("add infoSticker failed: " + a2);
                com.ss.android.ugc.aweme.app.d.c a3 = com.ss.android.ugc.aweme.app.d.c.a();
                com.ss.android.ugc.aweme.app.d.c a4 = a3.a("event", "addFailed: " + a2);
                n.a("info_sticker", a4.a("user_info", "path: " + str4 + " file exist " + b2 + " size: " + length + " extra: " + str5).b());
            } else {
                com.ss.android.ugc.aweme.n.b a5 = bVar.a(a2, str, str2, str3, i2);
                if (a5 != null) {
                    y yVar2 = new y(bVar.f67230e.getContext(), a5, bVar);
                    yVar2.a(bVar.f67230e.f67187d, bVar.f67230e.f67188e, bVar.f67230e.f67185b, bVar.f67230e.f67186c, 0.5f, 0.5f);
                    bVar.f67231f.a(a5.id, a5.currentOffsetX, a5.currentOffsetY);
                    bVar.f67231f.c(a5.id, yVar2.f67432c.layerWeight);
                    bVar.f67228c = yVar2;
                    bVar.f67228c.f67433d = false;
                    bVar.f67227b.add(yVar2);
                    if (bVar.g != null) {
                        bVar.g.a(a5);
                    }
                }
            }
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public boolean a(y yVar, float f2, float f3) {
        y yVar2 = yVar;
        if (PatchProxy.isSupport(new Object[]{yVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67184a, false, 76766, new Class[]{y.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{yVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67184a, false, 76766, new Class[]{y.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.B == null) {
            this.B = new Point(0, 0);
        }
        this.B.set((int) f2, (int) f3);
        Point point = this.B;
        float centerX = yVar2.h.centerX();
        float centerY = yVar2.h.centerY();
        float f4 = -yVar.c();
        if (PatchProxy.isSupport(new Object[]{point, Float.valueOf(centerX), Float.valueOf(centerY), Float.valueOf(f4)}, null, com.ss.android.ugc.aweme.shortvideo.edit.b.a.f67090a, true, 76719, new Class[]{Point.class, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{point, Float.valueOf(centerX), Float.valueOf(centerY), Float.valueOf(f4)}, null, com.ss.android.ugc.aweme.shortvideo.edit.b.a.f67090a, true, 76719, new Class[]{Point.class, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
        } else {
            double d2 = (double) f4;
            float sin = (float) Math.sin(Math.toRadians(d2));
            float cos = (float) Math.cos(Math.toRadians(d2));
            point.set((int) ((((((float) point.x) - centerX) * cos) + centerX) - ((((float) point.y) - centerY) * sin)), (int) (centerY + ((((float) point.y) - centerY) * cos) + ((((float) point.x) - centerX) * sin)));
        }
        return yVar2.h.contains((float) this.B.x, (float) this.B.y);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67184a, false, 76757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67184a, false, 76757, new Class[0], Void.TYPE);
            return;
        }
        this.h.c();
        invalidate();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f67184a, false, 76765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67184a, false, 76765, new Class[0], Void.TYPE);
            return;
        }
        this.g.postDelayed(new c(this), 300);
    }

    public int getStickNumber() {
        if (!PatchProxy.isSupport(new Object[0], this, f67184a, false, 76760, new Class[0], Integer.TYPE)) {
            return this.h.f67227b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67184a, false, 76760, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f67184a, false, 76752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67184a, false, 76752, new Class[0], Void.TYPE);
            return;
        }
        if ((this.f67187d == 0 || this.f67188e == 0) && this.f67189f != null) {
            aj d2 = this.f67189f.d();
            this.f67187d = d2.f77890a;
            this.f67188e = d2.f77891b;
            this.f67185b = (fc.b(getContext()) - this.f67187d) >> 1;
            if (fc.a()) {
                int f2 = fc.f(this.C);
                if (!fb.a(this.f67187d, this.f67188e)) {
                    i2 = (((fc.e(getContext()) - fb.a(this.C, f2)) - fb.b(this.C, f2)) - this.f67188e) / 2;
                }
                this.f67186c = i2;
                return;
            }
            int e2 = fc.e(getContext());
            if (this.D) {
                i2 = fc.c(this.C);
            }
            this.f67186c = ((e2 - i2) - this.f67188e) >> 1;
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f67184a, false, 76764, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67184a, false, 76764, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.m == 1) {
            return true;
        } else {
            if (!(this.l == null || this.l.f67198a == null || this.l.f67199b == 1)) {
                if (this.l.f67200c) {
                    this.h.a(this.l.f67198a, true);
                    invalidate();
                } else {
                    b bVar = this.h;
                    y yVar = this.l.f67198a;
                    if (PatchProxy.isSupport(new Object[]{yVar}, bVar, b.f67226a, false, 76729, new Class[]{y.class}, Void.TYPE)) {
                        b bVar2 = bVar;
                        PatchProxy.accessDispatch(new Object[]{yVar}, bVar2, b.f67226a, false, 76729, new Class[]{y.class}, Void.TYPE);
                    } else if (yVar != null && bVar.f67227b.contains(yVar)) {
                        bVar.f67231f.a(yVar.f67432c.id, yVar.a(), yVar.b());
                    }
                }
            }
            return false;
        }
    }

    public void setHaveTimeEdit(boolean z2) {
        this.v = z2;
    }

    public void setOnInfoStickerTimeEdit(com.ss.android.ugc.aweme.base.a<y> aVar) {
        this.k = aVar;
    }

    public void setStickerOnMoveListener(InfoStickerHelper.b bVar) {
        this.u = bVar;
    }

    public void setStickerDataChangeListener(a aVar) {
        this.h.g = aVar;
    }

    public InfoStickerEditView(Context context) {
        super(context);
    }

    public final void a(final com.ss.android.ugc.aweme.n.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f67184a, false, 76754, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f67184a, false, 76754, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Void.TYPE);
        } else if (this.f67187d == 0 || this.f67188e == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67190a;

                /* renamed from: b  reason: collision with root package name */
                boolean f67191b;

                public final void onGlobalLayout() {
                    if (PatchProxy.isSupport(new Object[0], this, f67190a, false, 76773, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f67190a, false, 76773, new Class[0], Void.TYPE);
                        return;
                    }
                    InfoStickerEditView.this.a();
                    if (InfoStickerEditView.this.f67187d > 0 && InfoStickerEditView.this.f67188e > 0 && !this.f67191b) {
                        InfoStickerEditView.this.h.a(aVar);
                        this.f67191b = true;
                        InfoStickerEditView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        } else {
            this.h.a(aVar);
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67184a, false, 76755, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67184a, false, 76755, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            this.h.c();
        } else {
            this.h.b();
        }
    }

    public void setShowHelpBox(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67184a, false, 76761, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67184a, false, 76761, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.y = z2;
        if (!(this.l == null || this.l.f67198a == null)) {
            this.l.f67198a.f67433d = z2;
        }
        if (!(this.z == null || this.g == null)) {
            this.g.removeCallbacks(this.z);
        }
        if (z2 && this.g != null) {
            this.g.postDelayed(this.z, (long) A);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        int i2;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f67184a, false, 76762, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f67184a, false, 76762, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        for (y next : this.h.f67227b) {
            next.t = this.v;
            if (PatchProxy.isSupport(new Object[]{canvas2}, next, y.f67430a, false, 76872, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2}, next, y.f67430a, false, 76872, new Class[]{Canvas.class}, Void.TYPE);
            } else {
                if (!fc.a() || !fb.a()) {
                    i2 = 0;
                } else {
                    i2 = fb.f67664c;
                }
                float f2 = (float) i2;
                next.h.top += f2;
                next.h.bottom += f2;
                next.m.top += f2;
                next.m.bottom += f2;
                next.n.top += f2;
                next.n.bottom += f2;
                next.o.top += f2;
                next.o.bottom += f2;
                if (next.f67433d) {
                    canvas.save();
                    canvas2.rotate(next.f67432c.rotateAngle, next.h.centerX(), next.h.centerY());
                    canvas2.drawRect(next.h, next.f67434e);
                    canvas2.drawBitmap(y.j, next.g, next.m, null);
                    canvas2.drawBitmap(y.k, next.g, next.n, null);
                    if (next.t) {
                        canvas2.drawBitmap(y.l, next.g, next.o, null);
                    }
                    canvas.restore();
                    if (PatchProxy.isSupport(new Object[]{canvas2, (byte) 0}, next, y.f67430a, false, 76873, new Class[]{Canvas.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{canvas2, (byte) 0}, next, y.f67430a, false, 76873, new Class[]{Canvas.class, Boolean.TYPE}, Void.TYPE);
                    }
                    next.s = System.currentTimeMillis();
                }
                float f3 = (next.f67432c.initWidth * next.v) / 2.0f;
                float f4 = (next.f67432c.initHeight * next.v) / 2.0f;
                float centerX = next.f67435f.centerX();
                float centerY = next.f67435f.centerY();
                float f5 = centerX - f3;
                float f6 = centerY - f4;
                next.u[0].set(f5, f6);
                float f7 = centerX + f3;
                next.u[1].set(f7, f6);
                float f8 = centerY + f4;
                next.u[2].set(f7, f8);
                next.u[3].set(f5, f8);
                next.h.top -= f2;
                next.h.bottom -= f2;
                next.m.top -= f2;
                next.m.bottom -= f2;
                next.n.top -= f2;
                next.n.bottom -= f2;
                next.o.top -= f2;
                next.o.bottom -= f2;
            }
        }
    }

    public InfoStickerEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67184a, false, 76768, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67184a, false, 76768, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (!Lists.isEmpty(this.h.f67227b)) {
            int u2 = this.f67189f.u();
            for (y next : this.h.f67227b) {
                if (this.h.a(next, u2) && a(next, f2, f3)) {
                    if (this.l.f67198a == null || b.a(next, this.l.f67198a) > 0) {
                        this.l.f67198a = next;
                        this.l.f67199b = 0;
                        this.l.f67200c = next.f67433d;
                    }
                }
            }
            this.h.c(this.l.f67198a);
        }
    }

    public InfoStickerEditView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @TargetApi(21)
    public InfoStickerEditView(Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public final void a(y yVar, int i2, int i3, int i4) {
        y yVar2 = yVar;
        if (PatchProxy.isSupport(new Object[]{yVar2, Integer.valueOf(i2), Integer.valueOf(i3), 0}, this, f67184a, false, 76759, new Class[]{y.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar2, Integer.valueOf(i2), Integer.valueOf(i3), 0}, this, f67184a, false, 76759, new Class[]{y.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(yVar2, i2, i3);
    }

    public final void a(Activity activity, SafeHandler safeHandler, p pVar, StoryStickerGestureLayout storyStickerGestureLayout, cb cbVar, boolean z2) {
        Activity activity2 = activity;
        SafeHandler safeHandler2 = safeHandler;
        p pVar2 = pVar;
        StoryStickerGestureLayout storyStickerGestureLayout2 = storyStickerGestureLayout;
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{activity2, safeHandler2, pVar2, storyStickerGestureLayout2, cbVar2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67184a, false, 76750, new Class[]{Activity.class, SafeHandler.class, p.class, StoryStickerGestureLayout.class, cb.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, safeHandler2, pVar2, storyStickerGestureLayout2, cbVar2, Byte.valueOf(z2)}, this, f67184a, false, 76750, new Class[]{Activity.class, SafeHandler.class, p.class, StoryStickerGestureLayout.class, cb.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f67189f = pVar2;
        this.g = safeHandler2;
        this.i = cbVar2;
        this.C = activity2;
        this.D = z2;
        this.h = new b(this, this.f67189f);
        b bVar = new b(this, (byte) 0);
        if (PatchProxy.isSupport(new Object[]{bVar}, storyStickerGestureLayout, StoryStickerGestureLayout.f74282a, false, 86301, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b.class}, Void.TYPE)) {
            StoryStickerGestureLayout storyStickerGestureLayout3 = storyStickerGestureLayout;
            PatchProxy.accessDispatch(new Object[]{bVar}, storyStickerGestureLayout3, StoryStickerGestureLayout.f74282a, false, 86301, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b.class}, Void.TYPE);
        } else {
            storyStickerGestureLayout2.f74285d.add(bVar);
        }
        a();
    }
}
