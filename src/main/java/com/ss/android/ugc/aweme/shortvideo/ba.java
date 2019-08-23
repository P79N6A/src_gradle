package com.ss.android.ugc.aweme.shortvideo;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.c;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.tools.af;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.h;
import com.ss.android.ugc.aweme.tools.t;
import com.ss.android.ugc.aweme.tools.v;
import com.ss.android.ugc.gamora.recorder.d;

public final class ba {

    /* renamed from: a  reason: collision with root package name */
    public PlanC f65771a;

    /* renamed from: b  reason: collision with root package name */
    public RecordLayout f65772b;

    /* renamed from: c  reason: collision with root package name */
    public c f65773c = new a(this, (byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public dmt.av.video.b.a.c f65774d;

    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65775a;

        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final boolean c() {
            return false;
        }

        public final void a() {
            v vVar;
            if (PatchProxy.isSupport(new Object[0], this, f65775a, false, 74066, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65775a, false, 74066, new Class[0], Void.TYPE);
            } else if (ba.this.f65772b.getMode() != 2) {
                if (((VideoRecordNewActivity) ba.this.f65771a.getActivity()).m.i() == 1) {
                    vVar = v.a();
                } else {
                    vVar = v.b();
                }
                vVar.f74943c = true;
                ba.this.f65771a.k().a((Object) ba.this.f65771a, (bc) vVar);
            }
        }

        public final void b() {
            h hVar;
            if (PatchProxy.isSupport(new Object[0], this, f65775a, false, 74067, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65775a, false, 74067, new Class[0], Void.TYPE);
                return;
            }
            bd k = ba.this.f65771a.k();
            if (PatchProxy.isSupport(new Object[0], null, h.f74766a, true, 86952, new Class[0], h.class)) {
                hVar = (h) PatchProxy.accessDispatch(new Object[0], null, h.f74766a, true, 86952, new Class[0], h.class);
            } else {
                hVar = new h();
                hVar.f74770e = 2;
            }
            k.a((Object) this, (bc) hVar);
        }

        private a() {
        }

        public final void a(float f2) {
            t tVar;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65775a, false, 74063, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65775a, false, 74063, new Class[]{Float.TYPE}, Void.TYPE);
            } else if (ba.this.f65772b.getMode() != 2) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, t.f74935a, true, 86959, new Class[]{Float.TYPE}, t.class)) {
                    tVar = (t) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, t.f74935a, true, 86959, new Class[]{Float.TYPE}, t.class);
                } else {
                    tVar = new t();
                    tVar.f74936b = -1.0f;
                    tVar.f74937c = f2;
                    tVar.f74938d = 2;
                }
                ba.this.f65771a.k().a((Object) ba.this.f65771a, (bc) tVar);
            }
        }

        public final void b(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65775a, false, 74069, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65775a, false, 74069, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            af afVar = new af();
            afVar.f74611c = ((d) ba.this.f65771a.Q.b().a("RecordBottomTabScene")).a();
            afVar.f74610b = ba.this.f65772b.x;
            afVar.f74612d = ba.this.f65772b.getCurrentScaleMode();
            ba.this.f65771a.k().a((Object) this, (bc) afVar);
            ba.this.f65772b.setCurrentScaleMode(0);
        }

        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            h hVar;
            ScaleGestureDetector scaleGestureDetector2 = scaleGestureDetector;
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector2}, this, f65775a, false, 74068, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector2}, this, f65775a, false, 74068, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!ba.this.f65774d.g()) {
                return false;
            } else {
                if (ba.this.f65772b.getMode() == 2 && ba.this.f65772b.x) {
                    return false;
                }
                if (ba.this.f65772b.getCurrentScaleMode() == 1) {
                    return true;
                }
                if (PatchProxy.isSupport(new Object[]{scaleGestureDetector2}, null, h.f74766a, true, 86951, new Class[]{ScaleGestureDetector.class}, h.class)) {
                    hVar = (h) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector2}, null, h.f74766a, true, 86951, new Class[]{ScaleGestureDetector.class}, h.class);
                } else {
                    hVar = new h();
                    hVar.f74767b = scaleGestureDetector2;
                    hVar.f74770e = 1;
                }
                ba.this.f65771a.k().a((Object) ba.this.f65771a, (bc) hVar);
                return hVar.f74771f;
            }
        }

        public final void a(MotionEvent motionEvent) {
            h hVar;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f65775a, false, 74065, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f65775a, false, 74065, new Class[]{MotionEvent.class}, Void.TYPE);
            } else if (ba.this.f65774d.g()) {
                if (ba.this.f65772b.getMode() != 2 || !ba.this.f65772b.x) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(x), Float.valueOf(y)}, null, h.f74766a, true, 86950, new Class[]{Float.TYPE, Float.TYPE}, h.class)) {
                        hVar = (h) PatchProxy.accessDispatch(new Object[]{Float.valueOf(x), Float.valueOf(y)}, null, h.f74766a, true, 86950, new Class[]{Float.TYPE, Float.TYPE}, h.class);
                    } else {
                        h hVar2 = new h();
                        hVar2.f74768c = x;
                        hVar2.f74769d = y;
                        hVar2.f74770e = 0;
                        hVar = hVar2;
                    }
                    ba.this.f65771a.k().a((Object) ba.this.f65771a, (bc) hVar);
                }
            }
        }

        /* synthetic */ a(ba baVar, byte b2) {
            this();
        }

        public final void a(float f2, float f3) {
            t tVar;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f65775a, false, 74064, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f65775a, false, 74064, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            } else if (ba.this.f65772b.getMode() != 2) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, null, t.f74935a, true, 86958, new Class[]{Float.TYPE, Float.TYPE}, t.class)) {
                    tVar = (t) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, null, t.f74935a, true, 86958, new Class[]{Float.TYPE, Float.TYPE}, t.class);
                } else {
                    tVar = new t();
                    tVar.f74936b = f2;
                    tVar.f74937c = f3;
                    tVar.f74938d = 1;
                }
                ba.this.f65771a.k().a((Object) ba.this.f65771a, (bc) tVar);
            }
        }
    }

    public ba(PlanC planC, RecordLayout recordLayout, dmt.av.video.b.a.c cVar) {
        this.f65771a = planC;
        this.f65772b = recordLayout;
        this.f65774d = cVar;
    }
}
