package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import a.i;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.Lists;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.ce;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.k;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.z;
import com.ss.android.ugc.aweme.shortvideo.edit.p;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.c;
import com.ss.android.ugc.aweme.story.shootvideo.e;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.f;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.g;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;
import com.ss.android.vesdk.aj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h extends e implements p, f.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f74197b;
    private int A;
    private int B;
    private b C;
    private int D;
    private f E;
    private k F;
    private TextStickerViewModel G;

    /* renamed from: c  reason: collision with root package name */
    public List<o> f74198c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f74199d;

    /* renamed from: e  reason: collision with root package name */
    public View f74200e;

    /* renamed from: f  reason: collision with root package name */
    public a f74201f;
    public g g;
    public o h;
    public com.ss.android.ugc.aweme.story.shootvideo.a.a i;
    public Rect j;
    public SafeHandler k;
    public com.ss.android.vesdk.p l;
    public boolean m = true;
    public boolean n;
    public TextStickerInputLayout o;
    public boolean p;
    public com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a q;
    public boolean r;
    public long s;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a t;
    public com.ss.android.ugc.aweme.base.b.a.b<o> u;
    public final boolean v;
    public ce w;
    public com.ss.android.ugc.aweme.base.b.a.a<o, o> x;
    private AppCompatActivity y;
    private StoryStickerGestureLayout z;

    public interface a {
        void a(o oVar);

        void a(o oVar, int i, int i2, boolean z, boolean z2, boolean z3);

        void b(o oVar);
    }

    public class b extends com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74209a;

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar, float f2, float f3) {
            boolean z;
            boolean z2;
            float f4 = f2;
            if (PatchProxy.isSupport(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f74209a, false, 86176, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f74209a, false, 86176, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, next, o.f74399a, false, 86436, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, next, o.f74399a, false, 86436, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                        } else if (!next.b()) {
                            z = false;
                        } else {
                            float f5 = com.ss.android.ugc.aweme.shortvideo.gesture.a.b.k ? f3 + next.m : f3;
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f5)}, next, o.f74399a, false, 86435, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f5)}, next, o.f74399a, false, 86435, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                            } else {
                                z2 = next.a(f4, f5);
                                if (!z2) {
                                    z2 = next.c(f4, f5);
                                }
                            }
                            next.j = z2;
                            next.i.a(f4, f5);
                            z = next.e();
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean a(c cVar) {
            boolean z;
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f74209a, false, 86178, new Class[]{c.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f74209a, false, 86178, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{cVar2}, next, o.f74399a, false, 86438, new Class[]{c.class}, Boolean.TYPE)) {
                            o oVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, oVar, o.f74399a, false, 86438, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
                        } else if (!next.b()) {
                            z = false;
                        } else {
                            next.k = next.a(cVar2.j, cVar2.k);
                            next.i.a(cVar2.j, cVar2.k);
                            z = next.f();
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public b() {
        }

        public final boolean a(MotionEvent motionEvent) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74209a, false, 86184, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74209a, false, 86184, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (h.this.n) {
                h.this.n = false;
                return true;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, next, o.f74399a, false, 86447, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            o oVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, oVar, o.f74399a, false, 86447, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            z = next.i.c();
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f74209a, false, 86181, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f74209a, false, 86181, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, next, o.f74399a, false, 86441, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, next, o.f74399a, false, 86441, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
                        } else if (!next.b() || !next.g() || !next.b(scaleGestureDetector.getScaleFactor())) {
                            z = false;
                        } else {
                            next.f74403e *= scaleGestureDetector.getScaleFactor();
                            next.invalidate();
                            z = true;
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean b(float f2) {
            boolean z;
            float f3;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74209a, false, 86179, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74209a, false, 86179, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, next, o.f74399a, false, 86439, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                            o oVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, oVar, o.f74399a, false, 86439, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
                            float f4 = f2;
                        } else {
                            if (next.b()) {
                                float degrees = (float) Math.toDegrees((double) f2);
                                if (Math.abs(degrees) > 10.0f) {
                                    degrees = 0.0f;
                                }
                                if (next.f()) {
                                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar = next.i;
                                    float f5 = next.f74402d;
                                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f5), Float.valueOf(degrees)}, cVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a, false, 86490, new Class[]{Float.TYPE, Float.TYPE}, Float.TYPE)) {
                                        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar2 = cVar;
                                        f3 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f5), Float.valueOf(degrees)}, cVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a, false, 86490, new Class[]{Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
                                    } else {
                                        if (-1 != cVar.f74348b.a(cVar.q, false, true)) {
                                            degrees = cVar.f74348b.a(degrees).floatValue();
                                        }
                                        float f6 = f5 - degrees;
                                        if (f6 > 180.0f) {
                                            f6 -= 360.0f;
                                        }
                                        if (f6 < -180.0f) {
                                            f6 += 360.0f;
                                        }
                                        f3 = f6;
                                    }
                                    next.f74402d = f3;
                                    next.invalidate();
                                    z = true;
                                }
                            } else {
                                float f7 = f2;
                            }
                            z = false;
                        }
                        if (z) {
                            return true;
                        }
                    } else {
                        float f8 = f2;
                    }
                }
                return false;
            }
        }

        public final boolean d(MotionEvent motionEvent) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74209a, false, 86182, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74209a, false, 86182, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (PatchProxy.isSupport(new Object[0], next, o.f74399a, false, 86470, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], next, o.f74399a, false, 86470, new Class[0], Void.TYPE);
                    } else {
                        next.i.k = 2;
                    }
                }
                for (o next2 : h.this.f74198c) {
                    if (next2 != null) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, next2, o.f74399a, false, 86445, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            o oVar = next2;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, oVar, o.f74399a, false, 86445, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else if (!next2.b()) {
                            z = false;
                        } else {
                            if (PatchProxy.isSupport(new Object[]{motionEvent}, next2, o.f74399a, false, 86444, new Class[]{MotionEvent.class}, Void.TYPE)) {
                                o oVar2 = next2;
                                PatchProxy.accessDispatch(new Object[]{motionEvent}, oVar2, o.f74399a, false, 86444, new Class[]{MotionEvent.class}, Void.TYPE);
                            } else {
                                next2.m = motionEvent.getY() - motionEvent.getRawY();
                            }
                            boolean a2 = next2.i.a(motionEvent.getX(), motionEvent.getY());
                            if (a2) {
                                next2.setTouching(true);
                            }
                            z = a2;
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f74209a, false, 86180, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f74209a, false, 86180, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, next, o.f74399a, false, 86440, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                            o oVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, oVar, o.f74399a, false, 86440, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
                        } else if (!next.b()) {
                            z = false;
                        } else {
                            next.l = next.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                            next.i.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                            z = next.g();
                        }
                        if (z) {
                            h.this.a(next);
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean e(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74209a, false, 86183, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74209a, false, 86183, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, next, o.f74399a, false, 86446, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            o oVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, oVar, o.f74399a, false, 86446, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else if (!next.b()) {
                            z = false;
                        } else {
                            if (next.i.c()) {
                                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar = next.i;
                                if (PatchProxy.isSupport(new Object[]{motionEvent}, cVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a, false, 86489, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar2 = cVar;
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, cVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a, false, 86489, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                                } else {
                                    cVar.s = true;
                                    if (cVar.f74348b == null || (!cVar.a() && !cVar.b())) {
                                        z3 = false;
                                    } else {
                                        RectF helpRect = cVar.q.getHelpRect();
                                        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(helpRect, helpRect.centerX(), helpRect.centerY(), cVar.q.getStickerRotate());
                                        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(helpRect, cVar.q.getStickerScale());
                                        cVar.f74348b.a(cVar.q, helpRect, ((int) cVar.h) + cVar.m, ((int) cVar.i) + cVar.n, true, cVar.b(), cVar.d());
                                        if (cVar.r) {
                                            cVar.a(!cVar.d());
                                            cVar.r = false;
                                        }
                                        cVar.f74348b.a(cVar.q, true, false);
                                        z3 = true;
                                    }
                                    if (cVar.k != 6 || !cVar.q.e(cVar.f74351e, cVar.f74352f)) {
                                        if (cVar.k != 7 || !cVar.q.d(cVar.f74351e, cVar.f74352f)) {
                                            if (cVar.k != 5 || !cVar.q.f(cVar.f74351e, cVar.f74352f)) {
                                                if (cVar.o) {
                                                    long currentTimeMillis = System.currentTimeMillis() - cVar.g;
                                                    int abs = (int) Math.abs(motionEvent.getX() - (cVar.f74351e + ((float) cVar.m)));
                                                    float y = motionEvent.getY();
                                                    if (fb.a()) {
                                                        i = fb.f67664c;
                                                    } else {
                                                        i = 0;
                                                    }
                                                    int abs2 = (int) Math.abs((y - ((float) i)) - (cVar.f74352f + ((float) cVar.n)));
                                                    if (currentTimeMillis <= 200 && (abs <= 5 || abs2 <= 5)) {
                                                        if (cVar.j || cVar.d()) {
                                                            if (cVar.f74348b != null) {
                                                                cVar.f74348b.a(cVar.q, true);
                                                            }
                                                            cVar.a(false);
                                                        } else {
                                                            if (cVar.f74348b != null) {
                                                                cVar.f74348b.a(cVar.q, false);
                                                            }
                                                            cVar.a(true);
                                                        }
                                                    }
                                                } else {
                                                    z = z3;
                                                }
                                            } else if (cVar.f74348b != null) {
                                                cVar.f74348b.b(cVar.q);
                                            }
                                        } else if (cVar.f74348b != null) {
                                            cVar.f74348b.a(cVar.q);
                                        }
                                    } else if (cVar.f74348b != null) {
                                        cVar.f74348b.a(cVar.q, true);
                                    }
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            next.k = false;
                            next.j = false;
                            next.l = false;
                            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar3 = next.i;
                            cVar3.h = 0.0f;
                            cVar3.i = 0.0f;
                            next.setTouching(false);
                        }
                        if (z) {
                            if (PatchProxy.isSupport(new Object[0], next, o.f74399a, false, 86462, new Class[0], Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], next, o.f74399a, false, 86462, new Class[0], Boolean.TYPE)).booleanValue();
                            } else if (next.i.k == 5) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                h.this.n = true;
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
            boolean z;
            boolean z2;
            int i;
            com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar2 = bVar;
            int i2 = 1;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74209a, false, 86177, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74209a, false, 86177, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)).booleanValue();
            } else if (!h.this.m) {
                return false;
            } else {
                for (o next : h.this.f74198c) {
                    if (next != null) {
                        Object[] objArr = new Object[i2];
                        objArr[0] = bVar2;
                        ChangeQuickRedirect changeQuickRedirect = o.f74399a;
                        Class[] clsArr = new Class[i2];
                        clsArr[0] = com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class;
                        if (PatchProxy.isSupport(objArr, next, changeQuickRedirect, false, 86437, clsArr, Boolean.TYPE)) {
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = bVar2;
                            ChangeQuickRedirect changeQuickRedirect2 = o.f74399a;
                            Class[] clsArr2 = new Class[i2];
                            clsArr2[0] = com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class;
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect2, false, 86437, clsArr2, Boolean.TYPE)).booleanValue();
                        } else {
                            if (next.b() && next.e()) {
                                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar = next.i;
                                float f2 = bVar2.j.x;
                                float f3 = bVar2.j.y;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = Float.valueOf(f2);
                                objArr3[i2] = Float.valueOf(f3);
                                ChangeQuickRedirect changeQuickRedirect3 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a;
                                Class[] clsArr3 = new Class[2];
                                clsArr3[0] = Float.TYPE;
                                clsArr3[i2] = Float.TYPE;
                                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, 86491, clsArr3, Boolean.TYPE)) {
                                    Object[] objArr4 = new Object[2];
                                    objArr4[0] = Float.valueOf(f2);
                                    objArr4[i2] = Float.valueOf(f3);
                                    ChangeQuickRedirect changeQuickRedirect4 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a;
                                    Class[] clsArr4 = new Class[2];
                                    clsArr4[0] = Float.TYPE;
                                    clsArr4[i2] = Float.TYPE;
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, 86491, clsArr4, Boolean.TYPE)).booleanValue();
                                } else {
                                    float f4 = cVar.h + f2;
                                    float f5 = cVar.i + f3;
                                    float abs = Math.abs(f4 - cVar.f74351e);
                                    float abs2 = Math.abs(f5 - cVar.f74352f);
                                    if (abs >= 5.0f || abs2 >= 5.0f) {
                                        if (cVar.f74348b == null || (!cVar.a() && !cVar.b())) {
                                            z2 = false;
                                        } else {
                                            RectF helpRect = cVar.q.getHelpRect();
                                            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(helpRect, helpRect.centerX(), helpRect.centerY(), cVar.q.getStickerRotate());
                                            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(helpRect, cVar.q.getStickerScale());
                                            if (cVar.j) {
                                                cVar.r = cVar.j;
                                            }
                                            o.a aVar = cVar.f74348b;
                                            aVar.a(cVar.q, helpRect, (int) (((float) cVar.m) + f4), (int) (((float) cVar.n) + f5), false, cVar.b(), cVar.d());
                                            if (!cVar.d()) {
                                                int a2 = cVar.f74348b.a(cVar.q, false, false);
                                                if (-1 != a2) {
                                                    PointF a3 = cVar.f74348b.a(cVar.q, f2, f3);
                                                    if (3 == a2) {
                                                        f4 = cVar.h + a3.x;
                                                        f5 = cVar.i + a3.y;
                                                    }
                                                }
                                            }
                                            z2 = true;
                                        }
                                        if (cVar.k == 3) {
                                            cVar.k = 3;
                                            cVar.f74349c = f4 - cVar.h;
                                            cVar.f74350d = f5 - cVar.i;
                                            cVar.q.setCenterX(cVar.q.getCenterX() + cVar.f74349c);
                                            cVar.q.setCenterY(cVar.q.getCenterY() + cVar.f74350d);
                                        } else {
                                            if (cVar.k == 4) {
                                                cVar.k = 4;
                                                cVar.f74349c = f4 - cVar.h;
                                                cVar.f74350d = f5 - cVar.i;
                                                float f6 = cVar.f74349c;
                                                float f7 = cVar.f74350d;
                                                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f6), Float.valueOf(f7)}, cVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a, false, 86493, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                                                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar2 = cVar;
                                                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f6), Float.valueOf(f7)}, cVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c.f74347a, false, 86493, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                                                } else {
                                                    float centerX = cVar.q.getHelpRect().centerX();
                                                    float centerY = cVar.q.getHelpRect().centerY();
                                                    float centerX2 = cVar.q.getRotateRect().centerX();
                                                    float centerY2 = cVar.q.getRotateRect().centerY();
                                                    float f8 = f6 + centerX2;
                                                    float f9 = f7 + centerY2;
                                                    float f10 = centerX2 - centerX;
                                                    float f11 = centerY2 - centerY;
                                                    float f12 = f8 - centerX;
                                                    float f13 = f9 - centerY;
                                                    float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
                                                    float sqrt2 = (float) Math.sqrt((double) ((f12 * f12) + (f13 * f13)));
                                                    float f14 = sqrt2 / sqrt;
                                                    if (cVar.q.b(f14)) {
                                                        cVar.q.a(cVar.q.getStickerScale() * f14);
                                                    }
                                                    double d2 = (double) (((f10 * f12) + (f11 * f13)) / (sqrt * sqrt2));
                                                    if (d2 <= 1.0d && d2 >= -1.0d) {
                                                        float degrees = (float) Math.toDegrees(Math.acos(d2));
                                                        if ((f10 * f13) - (f12 * f11) > 0.0f) {
                                                            i = 1;
                                                        } else {
                                                            i = -1;
                                                        }
                                                        float f15 = ((float) i) * degrees;
                                                        if (cVar.f74348b != null && 4 == cVar.f74348b.a(cVar.q, false, true)) {
                                                            f15 = cVar.f74348b.a(f15).floatValue();
                                                        }
                                                        cVar.q.a(cVar.q.getStickerRotate() + f15, true);
                                                    }
                                                }
                                            }
                                            if (z2 && cVar.j) {
                                                cVar.a(false);
                                            }
                                            z = z2;
                                        }
                                        cVar.q.invalidate();
                                        cVar.h = f4;
                                        cVar.i = f5;
                                        z2 = true;
                                        cVar.a(false);
                                        z = z2;
                                    }
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            return true;
                        }
                    }
                    i2 = 1;
                }
                return false;
            }
        }

        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74209a, false, 86186, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74209a, false, 86186, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (o next : h.this.f74198c) {
                if (next != null) {
                    if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, next, o.f74399a, false, 86452, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                        o oVar = next;
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, oVar, o.f74399a, false, 86452, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                    } else {
                        z = next.i.c();
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74209a, false, 86185, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74209a, false, 86185, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (o next : h.this.f74198c) {
                if (next != null) {
                    if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, next, o.f74399a, false, 86451, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                        o oVar = next;
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, oVar, o.f74399a, false, 86451, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                    } else {
                        z = next.i.c();
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final void a(TextStickerData textStickerData) {
        TextStickerData textStickerData2 = textStickerData;
        if (PatchProxy.isSupport(new Object[]{textStickerData2}, this, f74197b, false, 86122, new Class[]{TextStickerData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textStickerData2}, this, f74197b, false, 86122, new Class[]{TextStickerData.class}, Void.TYPE);
            return;
        }
        this.o.setData(textStickerData2);
        b(textStickerData);
    }

    public final void a(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, f74197b, false, 86127, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, f74197b, false, 86127, new Class[]{o.class}, Void.TYPE);
        } else if (this.z != null && this.f74199d != null && oVar != null && this.t != null) {
            this.z.setHightLayerListenerToFirst(this.C);
            if (this.f74199d.getChildCount() > 1 && this.f74199d.getChildAt(this.f74199d.getChildCount() - 1) != oVar) {
                this.f74199d.removeView(oVar);
                this.f74199d.addView(oVar);
            }
            if (this.f74198c.size() > 1 && this.f74198c.get(0) != oVar) {
                this.f74198c.remove(oVar);
                this.f74198c.add(0, oVar);
            }
            if (this.f74198c.size() > 0) {
                o oVar2 = this.f74198c.get(0);
                if (this.x != null) {
                    this.x.a(oVar2, oVar);
                }
            }
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74197b, false, 86131, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74197b, false, 86131, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (fc.a() && this.l != null) {
            aj d2 = this.l.d();
            if (d2.f77890a != 0 && d2.f77891b != 0) {
                int[] a2 = z.a(this.f74199d, d2.f77890a, d2.f77891b);
                this.A = a2[0];
                this.B = a2[1];
                h();
            }
        }
    }

    public final void a(com.ss.android.vesdk.p pVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{pVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74197b, false, 86132, new Class[]{com.ss.android.vesdk.p.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar, Byte.valueOf(z2)}, this, f74197b, false, 86132, new Class[]{com.ss.android.vesdk.p.class, Boolean.TYPE}, Void.TYPE);
        } else if (pVar != null && this.l == null) {
            aj d2 = pVar.d();
            if (d2.f77890a != 0 && d2.f77891b != 0) {
                this.l = pVar;
                int[] a2 = z.a((View) this.f74199d, d2.f77890a, d2.f77891b, z2);
                this.A = a2[0];
                this.B = a2[1];
                h();
            }
        }
    }

    public final void a(StoryStickerGestureLayout storyStickerGestureLayout) {
        if (PatchProxy.isSupport(new Object[]{storyStickerGestureLayout}, this, f74197b, false, 86134, new Class[]{StoryStickerGestureLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storyStickerGestureLayout}, this, f74197b, false, 86134, new Class[]{StoryStickerGestureLayout.class}, Void.TYPE);
        } else if (storyStickerGestureLayout != null) {
            this.z = storyStickerGestureLayout;
            this.C = new b();
            storyStickerGestureLayout.a(this.C);
            i();
        }
    }

    public final void a(String str, String str2, boolean z2, boolean z3) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f74197b, false, 86152, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z2), Byte.valueOf(z3)}, this, f74197b, false, 86152, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.o.a(str3, str4, z2, z3);
    }

    public final boolean a(@NotNull RectF rectF) {
        if (PatchProxy.isSupport(new Object[]{rectF}, this, f74197b, false, 86158, new Class[]{RectF.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rectF}, this, f74197b, false, 86158, new Class[]{RectF.class}, Boolean.TYPE)).booleanValue();
        } else if (Lists.isEmpty(this.f74198c)) {
            return false;
        } else {
            for (o anglePointList : this.f74198c) {
                RectF a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(anglePointList.getAnglePointList());
                if (a2.top >= rectF.top) {
                    if (a2.bottom > rectF.bottom) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f74197b, false, 86129, new Class[0], Boolean.TYPE)) {
            return ((Boolean) f().a().getValue()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86129, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86151, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.e();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86142, new Class[0], Void.TYPE);
        } else if (this.o != null) {
            this.o.dismiss(false);
        }
    }

    public final boolean e() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86154, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86154, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f74198c.size() > 0) {
            z2 = true;
        }
        return z2;
    }

    public final TextStickerViewModel f() {
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86159, new Class[0], TextStickerViewModel.class)) {
            return (TextStickerViewModel) PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86159, new Class[0], TextStickerViewModel.class);
        }
        if (this.G == null) {
            this.G = (TextStickerViewModel) ViewModelProviders.of((FragmentActivity) this.y).get(TextStickerViewModel.class);
        }
        return this.G;
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86133, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f74199d.getLayoutParams();
        this.j = new Rect(0, 0, layoutParams.width, layoutParams.height);
        if (this.t != null) {
            this.f74199d.removeView(this.t);
        }
        this.t = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.a(this.f74200e.getContext(), layoutParams.width, layoutParams.height, this.A, this.B);
        this.f74199d.addView(this.t);
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86140, new Class[0], Void.TYPE);
            return;
        }
        this.g = this.z.getDeleteView();
        if (this.p) {
            this.g.a();
        }
        this.g.setStickerDeleteListener(new g.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74207a;

            public final boolean a() {
                return false;
            }

            public final boolean a(Object obj) {
                Object obj2 = obj;
                if (PatchProxy.isSupport(new Object[]{obj2}, this, f74207a, false, 86173, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f74207a, false, 86173, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj2 == null || !(obj2 instanceof o)) {
                    return false;
                } else {
                    ((o) obj2).b(0.3137255f, false);
                    return true;
                }
            }

            public final boolean b(Object obj) {
                Object obj2 = obj;
                if (PatchProxy.isSupport(new Object[]{obj2}, this, f74207a, false, 86174, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f74207a, false, 86174, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj2 == null || !(obj2 instanceof o)) {
                    return false;
                } else {
                    h.this.c((o) obj2);
                    return true;
                }
            }

            public final boolean c(Object obj) {
                Object obj2 = obj;
                if (PatchProxy.isSupport(new Object[]{obj2}, this, f74207a, false, 86175, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f74207a, false, 86175, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj2 == null || !(obj2 instanceof o)) {
                    return false;
                } else {
                    ((o) obj2).b(0.3137255f, true);
                    return true;
                }
            }
        });
    }

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86123, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86123, new Class[0], List.class);
        } else if (this.f74198c == null || this.f74198c.size() == 0) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(this.f74198c.size());
            for (o text : this.f74198c) {
                arrayList.add(text.getText());
            }
            return arrayList;
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f74197b, false, 86136, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74197b, false, 86136, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f74198c == null || this.f74198c.size() <= 0) {
            return false;
        } else {
            boolean z2 = false;
            for (o next : this.f74198c) {
                if (next.a()) {
                    next.setShowHelpBox(false);
                    z2 = true;
                }
            }
            return z2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r10 = this;
            r7 = 0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = f74197b
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 86124(0x1506c, float:1.20685E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0025
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = f74197b
            r3 = 0
            r4 = 86124(0x1506c, float:1.20685E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0025:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = f74197b
            r3 = 0
            r4 = 86130(0x15072, float:1.20694E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = f74197b
            r3 = 0
            r4 = 86130(0x15072, float:1.20694E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x004b:
            r8 = r0
            goto L_0x0054
        L_0x004d:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r0 = r10.o
            java.lang.String[] r0 = r0.getTextAry()
            goto L_0x004b
        L_0x0054:
            boolean r0 = com.ss.android.ugc.aweme.story.shootvideo.c.a(r8)
            if (r0 == 0) goto L_0x0103
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r7] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74197b
            r3 = 0
            r4 = 86125(0x1506d, float:1.20687E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r7] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x008c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r7] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74197b
            r3 = 0
            r4 = 86125(0x1506d, float:1.20687E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r7] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0115
        L_0x008c:
            if (r8 == 0) goto L_0x0115
            int r0 = r8.length
            if (r0 != 0) goto L_0x0093
            goto L_0x0115
        L_0x0093:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r10.h
            if (r0 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r10.h
            r0.setText(r8)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r10.h
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r1 = r10.o
            int r1 = r1.getCurTxtMode()
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r2 = r10.o
            int r2 = r2.getCurColor()
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r3 = r10.o
            int r3 = r3.getAlignTxt()
            com.ss.android.ugc.aweme.story.shootvideo.textfont.d r4 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a()
            java.lang.String r4 = r4.f74173c
            r0.a(r1, r2, r3, r4)
            goto L_0x0115
        L_0x00ba:
            java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o> r0 = r10.f74198c
            int r0 = r0.size()
            int r1 = r10.D
            if (r0 < r1) goto L_0x00d5
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r0 = r10.o
            android.content.Context r0 = r0.getContext()
            r1 = 2131560837(0x7f0d0985, float:1.8747058E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1, (int) r7)
            r0.a()
            goto L_0x0115
        L_0x00d5:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData r0 = new com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r1 = r10.o
            int r3 = r1.getCurTxtMode()
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r1 = r10.o
            int r4 = r1.getCurColor()
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r1 = r10.o
            int r5 = r1.getAlignTxt()
            com.ss.android.ugc.aweme.story.shootvideo.textfont.d r1 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a()
            java.lang.String r6 = r1.f74173c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r1 = r10.o
            android.graphics.Point r1 = r1.getEditInputCenterPoint()
            r0.mEditCenterPoint = r1
            r0.mTextStrAry = r8
            r10.a((com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData) r0)
            goto L_0x0115
        L_0x0103:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r10.h
            if (r0 == 0) goto L_0x0115
            android.widget.FrameLayout r0 = r10.f74199d
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r1 = r10.h
            r0.removeView(r1)
            java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o> r0 = r10.f74198c
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r1 = r10.h
            r0.remove(r1)
        L_0x0115:
            r10.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.textfont.h.g():void");
    }

    public final void a(com.ss.android.ugc.aweme.story.shootvideo.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f74197b, false, 86135, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f74197b, false, 86135, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.a.b.class}, Void.TYPE);
            return;
        }
        this.f73429a = bVar;
        this.o.setStoryEditViewShowListener(new com.ss.android.ugc.aweme.story.shootvideo.a.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74205a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f74205a, false, 86171, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74205a, false, 86171, new Class[0], Void.TYPE);
                    return;
                }
                if (h.this.f73429a != null) {
                    h.this.f73429a.a();
                }
            }

            public final void dismiss() {
                if (PatchProxy.isSupport(new Object[0], this, f74205a, false, 86172, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74205a, false, 86172, new Class[0], Void.TYPE);
                    return;
                }
                if (h.this.h != null) {
                    o oVar = h.this.h;
                    if (PatchProxy.isSupport(new Object[0], oVar, o.f74399a, false, 86459, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], oVar, o.f74399a, false, 86459, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b bVar = oVar.h;
                    if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a, false, 86488, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a, false, 86488, new Class[0], Void.TYPE);
                    } else {
                        bVar.i = true;
                        bVar.h = false;
                        bVar.f74342b = (-bVar.m) / ((float) bVar.n);
                        bVar.f74343c = (-bVar.l) / ((float) bVar.n);
                        bVar.f74344d = (-(bVar.j - bVar.f74346f)) / ((float) bVar.n);
                        bVar.f74345e = (-(bVar.k - bVar.g)) / ((float) bVar.n);
                        bVar.o.invalidate();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oVar, "alpha", new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(300);
                    ofFloat.start();
                }
            }
        });
    }

    private void b(TextStickerData textStickerData) {
        if (PatchProxy.isSupport(new Object[]{textStickerData}, this, f74197b, false, 86126, new Class[]{TextStickerData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textStickerData}, this, f74197b, false, 86126, new Class[]{TextStickerData.class}, Void.TYPE);
            return;
        }
        final o oVar = new o(this.y, this.k, textStickerData, this.v);
        this.f74198c.add(0, oVar);
        oVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f74199d.addView(oVar);
        oVar.setOnEditClickListener(new o.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74202a;

            public final void a(o oVar, boolean z) {
                if (PatchProxy.isSupport(new Object[]{oVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74202a, false, 86163, new Class[]{o.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{oVar, Byte.valueOf(z)}, this, f74202a, false, 86163, new Class[]{o.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!z || h.this.b()) {
                    if (h.this.i != null) {
                        h.this.i.a(false);
                        if (oVar != null) {
                            h.this.a(oVar);
                        }
                    }
                    h.this.c();
                } else if (System.currentTimeMillis() - h.this.s > 500) {
                    h.this.h = oVar;
                    h.this.b(oVar);
                    if (h.this.f74201f != null) {
                        h.this.f74201f.b(oVar);
                    }
                    h.this.s = System.currentTimeMillis();
                }
            }

            public final void b(o oVar) {
                o oVar2 = oVar;
                if (PatchProxy.isSupport(new Object[]{oVar2}, this, f74202a, false, 86165, new Class[]{o.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{oVar2}, this, f74202a, false, 86165, new Class[]{o.class}, Void.TYPE);
                    return;
                }
                h.this.c(oVar2);
            }

            public final Float a(float f2) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74202a, false, 86169, new Class[]{Float.TYPE}, Float.class)) {
                    return (Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74202a, false, 86169, new Class[]{Float.TYPE}, Float.class);
                } else if (h.this.t != null) {
                    return h.this.t.a(f2);
                } else {
                    return Float.valueOf(f2);
                }
            }

            public final void a(o oVar) {
                o oVar2 = oVar;
                if (PatchProxy.isSupport(new Object[]{oVar2}, this, f74202a, false, 86164, new Class[]{o.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{oVar2}, this, f74202a, false, 86164, new Class[]{o.class}, Void.TYPE);
                    return;
                }
                h hVar = h.this;
                if (PatchProxy.isSupport(new Object[]{(byte) 1}, hVar, h.f74197b, false, 86128, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    Object[] objArr = {(byte) 1};
                    h hVar2 = hVar;
                    PatchProxy.accessDispatch(objArr, hVar2, h.f74197b, false, 86128, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    hVar.f().a().setValue(Boolean.TRUE);
                }
                h.this.c();
                if (h.this.u != null) {
                    h.this.u.accept(oVar2);
                }
            }

            public final int a(o oVar, boolean z, boolean z2) {
                if (PatchProxy.isSupport(new Object[]{oVar, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74202a, false, 86167, new Class[]{o.class, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{oVar, Byte.valueOf(z), Byte.valueOf(z2)}, this, f74202a, false, 86167, new Class[]{o.class, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
                } else if (h.this.t == null) {
                    return -1;
                } else {
                    if (z) {
                        h.this.t.a();
                    } else if (oVar != null) {
                        boolean z3 = z2;
                        return h.this.t.a(oVar.getAnglePointListForBlock(), z2, false);
                    }
                    return -1;
                }
            }

            public final PointF a(o oVar, float f2, float f3) {
                float f4 = f2;
                float f5 = f3;
                if (PatchProxy.isSupport(new Object[]{oVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f74202a, false, 86168, new Class[]{o.class, Float.TYPE, Float.TYPE}, PointF.class)) {
                    return (PointF) PatchProxy.accessDispatch(new Object[]{oVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f74202a, false, 86168, new Class[]{o.class, Float.TYPE, Float.TYPE}, PointF.class);
                } else if (h.this.t == null || oVar == null) {
                    return new PointF(0.0f, 0.0f);
                } else {
                    PointF[] anglePointList = oVar.getAnglePointList();
                    for (PointF pointF : anglePointList) {
                        pointF.x += f4;
                        pointF.y += f5;
                    }
                    return h.this.t.a(anglePointList, f4, f5, false);
                }
            }

            public final void a(o oVar, RectF rectF, int i, int i2, boolean z, boolean z2, boolean z3) {
                o oVar2 = oVar;
                if (PatchProxy.isSupport(new Object[]{oVar2, rectF, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f74202a, false, 86170, new Class[]{o.class, RectF.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{oVar2, rectF, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f74202a, false, 86170, new Class[]{o.class, RectF.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                } else if (oVar2 != null) {
                    if (!z) {
                        h.this.a(oVar2);
                    }
                    if (z) {
                        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a aVar = h.this.q;
                        if (PatchProxy.isSupport(new Object[]{(byte) 0}, aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, false, 86321, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{(byte) 0}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, false, 86321, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else {
                            if (PatchProxy.isSupport(new Object[]{(byte) 0}, aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, false, 86320, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a aVar3 = aVar;
                                PatchProxy.accessDispatch(new Object[]{(byte) 0}, aVar3, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, false, 86320, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else {
                                aVar.f74332c.setVisibility(8);
                            }
                            if (PatchProxy.isSupport(new Object[]{(byte) 0}, aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, false, 86319, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a aVar4 = aVar;
                                PatchProxy.accessDispatch(new Object[]{(byte) 0}, aVar4, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, false, 86319, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else {
                                aVar.f74331b.setVisibility(8);
                            }
                        }
                    }
                    if (!z2 && !z3) {
                        if (z) {
                            oVar2.b(0.3137255f, false);
                        }
                        h.this.g.a(oVar, i, i2, z, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(h.this.j, oVar.getAnglePointList()));
                    }
                    if (h.this.f74201f != null) {
                        h.this.f74201f.a(oVar, i, i2, z, z2, z3);
                    }
                }
            }
        });
        oVar.a(this.A, this.B);
        this.o.c();
        if (Build.VERSION.SDK_INT < 19) {
            oVar.setShowHelpBox(true);
        }
    }

    public final void c(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, f74197b, false, 86147, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, f74197b, false, 86147, new Class[]{o.class}, Void.TYPE);
            return;
        }
        this.f74199d.removeView(oVar);
        this.f74198c.remove(oVar);
        if (this.f74201f != null) {
            this.f74201f.a(oVar);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74197b, false, 86145, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74197b, false, 86145, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.r) {
            this.o.dismiss(true);
            g();
            if (this.f73429a != null) {
                this.f73429a.dismiss();
            }
        }
    }

    public final void b(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, f74197b, false, 86141, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, f74197b, false, 86141, new Class[]{o.class}, Void.TYPE);
            return;
        }
        this.r = true;
        if (oVar == null) {
            this.o.a("", 0, -1, 0, "", true);
            this.h = null;
            return;
        }
        this.o.a(oVar.getText(), oVar.getCurMode(), oVar.getCurColor(), oVar.getCurAlignTxt(), oVar.getCurFontType(), false);
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74197b, false, 86137, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74197b, false, 86137, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = z2;
        if (this.f74198c != null && this.f74198c.size() > 0) {
            for (o enableEdit : this.f74198c) {
                enableEdit.setEnableEdit(z2);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74197b, false, 86144, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74197b, false, 86144, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.r) {
            if (this.h != null) {
                o oVar = this.h;
                if (PatchProxy.isSupport(new Object[0], oVar, o.f74399a, false, 86460, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], oVar, o.f74399a, false, 86460, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b bVar = oVar.h;
                    float f2 = oVar.f74400b;
                    float f3 = oVar.f74401c;
                    float f4 = oVar.f74403e;
                    float f5 = oVar.f74402d;
                    Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
                    if (PatchProxy.isSupport(objArr, bVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a, false, 86487, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                        Object[] objArr2 = {Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
                        Object[] objArr3 = objArr2;
                        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b bVar2 = bVar;
                        PatchProxy.accessDispatch(objArr3, bVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a, false, 86487, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                    } else {
                        bVar.h = true;
                        bVar.i = false;
                        bVar.j = f2;
                        bVar.k = f3;
                        bVar.l = f5;
                        bVar.m = f4;
                        bVar.f74342b = bVar.m / ((float) bVar.n);
                        bVar.f74343c = bVar.l / ((float) bVar.n);
                        bVar.f74344d = (f2 - bVar.f74346f) / ((float) bVar.n);
                        bVar.f74345e = (f3 - bVar.g) / ((float) bVar.n);
                        bVar.o.invalidate();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oVar, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat.setDuration(250);
                    ofFloat.start();
                }
            }
            TextStickerInputLayout textStickerInputLayout = this.o;
            if (PatchProxy.isSupport(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86385, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], textStickerInputLayout, TextStickerInputLayout.f74318b, false, 86385, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.story.shootvideo.a.a(textStickerInputLayout);
                if (textStickerInputLayout.i != null) {
                    textStickerInputLayout.i.a();
                }
            }
            this.o.a(i2);
        }
    }

    public static void a(BaseShortVideoContext baseShortVideoContext, JSONArray jSONArray) {
        Gson gson;
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext2, jSONArray2}, null, f74197b, true, 86120, new Class[]{BaseShortVideoContext.class, JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseShortVideoContext2, jSONArray2}, null, f74197b, true, 86120, new Class[]{BaseShortVideoContext.class, JSONArray.class}, Void.TYPE);
        } else if (baseShortVideoContext2 instanceof cb) {
            cb cbVar = (cb) baseShortVideoContext2;
            JSONArray jSONArray3 = new JSONArray();
            if (cbVar.hasInfoStickers()) {
                for (com.ss.android.ugc.aweme.n.b next : cbVar.infoStickerModel.stickers) {
                    if (next.type == 2) {
                        if (PatchProxy.isSupport(new Object[0], null, f74197b, true, 86121, new Class[0], Gson.class)) {
                            gson = (Gson) PatchProxy.accessDispatch(new Object[0], null, f74197b, true, 86121, new Class[0], Gson.class);
                        } else {
                            gson = com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson();
                        }
                        jSONArray3.put(o.a(((TextStickerData) gson.fromJson(next.extra, TextStickerData.class)).mTextStrAry));
                    }
                }
            }
            if (jSONArray3.length() > 0) {
                try {
                    jSONArray2.put(new JSONObject().put("type", 4).put("data", jSONArray3));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void a(float f2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74197b, false, 86150, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Byte.valueOf(z2)}, this, f74197b, false, 86150, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.f74198c.size() != 0) {
            for (o b2 : this.f74198c) {
                b2.b(f2, z2);
            }
        }
    }

    public h(AppCompatActivity appCompatActivity, ViewGroup viewGroup, FrameLayout frameLayout, boolean z2) {
        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a aVar;
        this.y = appCompatActivity;
        this.v = z2;
        this.f74199d = frameLayout;
        this.f74200e = viewGroup;
        this.o = (TextStickerInputLayout) viewGroup.findViewById(C0906R.id.d1x);
        this.o.setTextStickerUpdateListener(new i(this));
        this.D = ((Integer) com.ss.android.ugc.aweme.port.in.a.o.z().a()).intValue();
        if (this.D == 0) {
            this.D = 30;
        }
        d.a().a((Context) appCompatActivity);
        if (PatchProxy.isSupport(new Object[]{appCompatActivity}, null, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, true, 86318, new Class[]{Context.class}, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.class)) {
            aVar = (com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a) PatchProxy.accessDispatch(new Object[]{appCompatActivity}, null, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.f74330a, true, 86318, new Class[]{Context.class}, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.class);
        } else {
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a aVar2 = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a(appCompatActivity);
            aVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            aVar = aVar2;
        }
        this.q = aVar;
        this.E = new f((Activity) this.f74199d.getContext());
        this.E.a(this);
        this.F = new k();
    }

    public final i<List<TextStickerCompileResult>> a(String str, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f74197b, false, 86156, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f74197b, false, 86156, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class);
        }
        c();
        ArrayList arrayList = new ArrayList();
        for (o next : this.f74198c) {
            arrayList.add(this.F.a(next, this.f74199d, str, i2, i3, i4, i5).c(new j(next)));
        }
        return i.a((Collection<? extends i<TResult>>) arrayList);
    }
}
