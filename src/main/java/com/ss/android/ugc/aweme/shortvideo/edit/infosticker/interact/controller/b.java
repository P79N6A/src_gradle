package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import a.i;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.JsonIOException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.ce;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.z;
import com.ss.android.ugc.aweme.shortvideo.edit.p;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.g;
import com.ss.android.vesdk.aj;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class b extends com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67252a;

    /* renamed from: b  reason: collision with root package name */
    protected StoryStickerGestureLayout f67253b;

    /* renamed from: c  reason: collision with root package name */
    protected FrameLayout f67254c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f67255d = true;

    /* renamed from: e  reason: collision with root package name */
    protected g f67256e;

    /* renamed from: f  reason: collision with root package name */
    protected Rect f67257f;
    protected int g;
    protected int h;
    protected com.ss.android.vesdk.p i;
    public c j;
    protected List<c> k = new ArrayList();
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a l;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a m;
    public String n;
    public aj o;
    public boolean p = true;
    public boolean q;
    protected Context r;
    public View s;
    public ce t;
    private View u;
    private View v;
    private a w;
    private boolean x = true;
    private a y;

    public class a extends com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67262a;

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.c cVar) {
            boolean z;
            com.ss.android.ugc.aweme.shortvideo.gesture.a.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f67262a, false, 76956, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f67262a, false, 76956, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{cVar2}, next, c.f67326f, false, 77069, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)) {
                            c cVar3 = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, cVar3, c.f67326f, false, 77069, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.c.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            next.p = next.b(cVar2.j, cVar2.k);
                            z = next.p;
                        }
                        if (z || next.t) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public a() {
        }

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f67262a, false, 76955, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f67262a, false, 76955, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null && (next.a(bVar) || next.t)) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final boolean a(MotionEvent motionEvent) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67262a, false, 76962, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67262a, false, 76962, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                if (b.this.q) {
                    b.this.q = false;
                    return true;
                }
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, next, c.f67326f, false, 77075, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, cVar, c.f67326f, false, 77075, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            boolean e2 = next.e();
                            if (e2 && next.x) {
                                next.h();
                            }
                            next.x = false;
                            next.t = false;
                            z = e2;
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
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67262a, false, 76957, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67262a, false, 76957, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, next, c.f67326f, false, 77070, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, cVar, c.f67326f, false, 77070, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
                            float f3 = f2;
                        } else if (next.p) {
                            next.a((float) Math.toDegrees((double) f2));
                            z = true;
                        } else {
                            float f4 = f2;
                            z = false;
                        }
                        if (z || next.t) {
                            return true;
                        }
                    } else {
                        float f5 = f2;
                    }
                }
                return false;
            }
        }

        public final boolean e(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67262a, false, 76961, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67262a, false, 76961, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null && next.a(motionEvent)) {
                        b.this.q = next.u;
                        return true;
                    }
                }
                if (b.this.f67256e != null) {
                    b.this.f67256e.b();
                }
                if (b.this.r != null && (b.this.r instanceof VEVideoPublishEditActivity)) {
                    ((VEVideoPublishEditActivity) b.this.r).a(true, true);
                }
                return false;
            }
        }

        public final boolean d(MotionEvent motionEvent) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67262a, false, 76960, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67262a, false, 76960, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, next, c.f67326f, false, 77073, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, cVar, c.f67326f, false, 77073, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            next.w = false;
                            next.t = false;
                            next.t = false;
                            boolean c2 = next.c(motionEvent.getX(), motionEvent.getY());
                            boolean d2 = next.d(motionEvent.getX(), motionEvent.getY());
                            boolean e2 = next.e(motionEvent.getX(), motionEvent.getY());
                            next.o = next.b(motionEvent.getX(), motionEvent.getY());
                            if (c2) {
                                next.s = 2;
                            } else if (d2) {
                                next.s = 1;
                            } else if (next.o) {
                                next.s = 3;
                            } else if (e2) {
                                next.s = 4;
                            } else {
                                next.s = -1;
                            }
                            if (next.s != -1) {
                                next.t = true;
                            }
                            if (!next.t) {
                                next.h();
                            }
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(x), Float.valueOf(y)}, next, c.f67326f, false, 77064, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                                c cVar2 = next;
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(x), Float.valueOf(y)}, cVar2, c.f67326f, false, 77064, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                            } else {
                                next.f(x, y);
                                next.r = System.currentTimeMillis();
                            }
                            z = next.t;
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
            boolean z2;
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f67262a, false, 76958, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f67262a, false, 76958, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, next, c.f67326f, false, 77071, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, cVar, c.f67326f, false, 77071, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis() - next.v;
                            if (currentTimeMillis < 300) {
                                next.v = System.currentTimeMillis();
                            }
                            if (!next.b(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()) || currentTimeMillis <= 300) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            next.q = z2;
                            z = next.q;
                        }
                        if (z || next.t) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f67262a, false, 76959, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f67262a, false, 76959, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, next, c.f67326f, false, 77072, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, cVar, c.f67326f, false, 77072, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
                        } else if (next.q) {
                            next.b(scaleGestureDetector.getScaleFactor());
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || next.t) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f67262a, false, 76954, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f67262a, false, 76954, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, next, c.f67326f, false, 77067, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, cVar, c.f67326f, false, 77067, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                        } else {
                            z = next.c();
                        }
                        if (z || next.t) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67262a, false, 76964, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67262a, false, 76964, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, next, c.f67326f, false, 77077, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, cVar, c.f67326f, false, 77077, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                        } else if (next.o || next.f() || System.currentTimeMillis() - next.v < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67262a, false, 76963, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67262a, false, 76963, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!b.this.f67255d) {
                return false;
            } else {
                for (c next : b.this.k) {
                    if (next != null) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, next, c.f67326f, false, 77076, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                            c cVar = next;
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, cVar, c.f67326f, false, 77076, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                        } else if (next.o || System.currentTimeMillis() - next.v < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
    }

    public abstract c a(Context context);

    public boolean g() {
        return false;
    }

    public final void a(c cVar, boolean z, RectF rectF, float f2, float f3) {
        c cVar2 = cVar;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{cVar2, Byte.valueOf(z ? (byte) 1 : 0), rectF, Float.valueOf(f2), Float.valueOf(f3)}, this, f67252a, false, 76918, new Class[]{c.class, Boolean.TYPE, RectF.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Byte.valueOf(z), rectF, Float.valueOf(f2), Float.valueOf(f3)}, this, f67252a, false, 76918, new Class[]{c.class, Boolean.TYPE, RectF.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.j = cVar2;
        if (this.j != null) {
            if (z2) {
                this.j.setAlpha(1.0f);
            }
            if (z2) {
                this.x = true;
            } else if (this.x) {
                a();
                this.x = false;
            }
            boolean a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(this.f67257f, cVar.getFourAnglePoint());
            PointF a3 = this.j.a((aj) null);
            this.f67256e.a(this.j, (int) (a3.x + ((float) this.g)), (int) (a3.y + ((float) this.h)), z, a2);
            if (this.l != null) {
                this.l.a(z2);
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67252a, false, 76920, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67252a, false, 76920, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (fc.a() && this.i != null) {
            aj d2 = this.i.d();
            if (d2.f77890a != 0 && d2.f77891b != 0) {
                int[] a2 = z.a(this.f67254c, d2.f77890a, d2.f77891b);
                this.g = a2[0];
                this.h = a2[1];
                j();
            }
        }
    }

    public void a(com.ss.android.vesdk.p pVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{pVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f67252a, false, 76921, new Class[]{com.ss.android.vesdk.p.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar, Byte.valueOf(z)}, this, f67252a, false, 76921, new Class[]{com.ss.android.vesdk.p.class, Boolean.TYPE}, Void.TYPE);
        } else if (pVar != null && this.i == null) {
            aj d2 = pVar.d();
            if (d2.f77890a != 0 && d2.f77891b != 0) {
                this.i = pVar;
                if (this.t != null) {
                    int[] a2 = z.a((View) this.f67254c, d2.f77890a, d2.f77891b, z);
                    this.g = a2[0];
                    this.h = a2[1];
                    j();
                    return;
                }
                throw new IllegalStateException("VideoSizeProvider is null");
            }
        }
    }

    public boolean a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f67252a, false, 76923, new Class[]{c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f67252a, false, 76923, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
        } else if (cVar == null) {
            return false;
        } else {
            if (cVar.getParent() != null && cVar.getParent() != this.f67254c) {
                return false;
            }
            this.f67254c.removeView(cVar);
            this.j = null;
            this.k.remove(cVar);
            return true;
        }
    }

    public void a(InteractStickerStruct interactStickerStruct) {
        Point point;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, this, f67252a, false, 76929, new Class[]{InteractStickerStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, this, f67252a, false, 76929, new Class[]{InteractStickerStruct.class}, Void.TYPE);
        } else if (interactStickerStruct != null) {
            NormalTrackTimeStamp a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(interactStickerStruct);
            if (!(a2 == null || this.j == null)) {
                PointF pointF = new PointF(a2.getX(), a2.getY());
                if (PatchProxy.isSupport(new Object[]{pointF}, this, f67252a, false, 76932, new Class[]{PointF.class}, Point.class)) {
                    point = (Point) PatchProxy.accessDispatch(new Object[]{pointF}, this, f67252a, false, 76932, new Class[]{PointF.class}, Point.class);
                } else {
                    point = new Point();
                    if (this.o == null) {
                        i3 = fc.b(this.j.getContext());
                        i2 = fc.a(this.j.getContext());
                    } else {
                        i3 = this.o.f77890a;
                        i2 = this.o.f77891b;
                    }
                    point.set((int) (((float) i3) * pointF.x), (int) (((float) i2) * pointF.y));
                }
                PointF a3 = this.j.a(this.o);
                float f2 = ((float) point.y) - a3.y;
                this.j.a(((float) point.x) - a3.x, f2);
                this.j.a();
                this.j.a(-a2.getRotation());
                this.j.b(a2.getScale().floatValue());
            }
        }
    }

    public final boolean a(@NotNull RectF rectF) {
        if (PatchProxy.isSupport(new Object[]{rectF}, this, f67252a, false, 76938, new Class[]{RectF.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rectF}, this, f67252a, false, 76938, new Class[]{RectF.class}, Boolean.TYPE)).booleanValue();
        } else if (Lists.isEmpty(this.k)) {
            return false;
        } else {
            for (c fourAnglePoint : this.k) {
                RectF a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(fourAnglePoint.getFourAnglePoint());
                if (a2.top >= rectF.top) {
                    if (a2.bottom > rectF.bottom) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f67252a, false, 76917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67252a, false, 76917, new Class[0], Void.TYPE);
            return;
        }
        this.f67256e = this.f67253b.getDeleteView();
        this.f67256e.setStickerDeleteListener(new g.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67258a;

            public final boolean a() {
                return false;
            }

            public final boolean a(Object obj) {
                Object obj2 = obj;
                if (PatchProxy.isSupport(new Object[]{obj2}, this, f67258a, false, 76939, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f67258a, false, 76939, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj2 == null || !(obj2 instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.c)) {
                    return false;
                } else {
                    ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.c) obj2).setAlpha(0.3137255f);
                    return true;
                }
            }

            public final boolean b(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, f67258a, false, 76940, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f67258a, false, 76940, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj != null && (obj instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.c)) {
                    return b.this.a((c) (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.c) obj);
                } else {
                    if (obj == null || !(obj instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.c)) {
                        return false;
                    }
                    return b.this.a((c) (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.c) obj);
                }
            }

            public final boolean c(Object obj) {
                Object obj2 = obj;
                if (PatchProxy.isSupport(new Object[]{obj2}, this, f67258a, false, 76941, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f67258a, false, 76941, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj2 == null || !(obj2 instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.c)) {
                    return false;
                } else {
                    ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.c) obj2).setAlpha(1.0f);
                    return true;
                }
            }
        });
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f67252a, false, 76926, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67252a, false, 76926, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null) {
            return false;
        } else {
            return this.j.e();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f67252a, false, 76927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67252a, false, 76927, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            this.j.h();
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f67252a, false, 76937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67252a, false, 76937, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            a(this.j);
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f67252a, false, 76922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67252a, false, 76922, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f67254c.getLayoutParams();
        this.f67257f = new Rect(0, 0, layoutParams.width, layoutParams.height);
        if (this.j != null) {
            this.j.a(this.g, this.h);
        }
        if (this.v != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.v.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            this.v.setLayoutParams(layoutParams2);
        }
        this.f67254c.removeView(this.m);
        this.m = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.a(this.u.getContext(), layoutParams.width, layoutParams.height, this.g, this.h);
        this.f67254c.addView(this.m);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f67252a, false, 76924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67252a, false, 76924, new Class[0], Void.TYPE);
        } else if (this.j == null) {
            this.j = a(this.f67253b.getContext());
            this.f67254c.addView(this.j, 0);
            this.j.a(this.g, this.h);
            this.j.setStickerEditListener(new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67260a;

                public final void a(c cVar, float f2, float f3, RectF rectF, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{cVar, Float.valueOf(f2), Float.valueOf(f3), rectF, Byte.valueOf(z ? (byte) 1 : 0)}, this, f67260a, false, 76942, new Class[]{c.class, Float.TYPE, Float.TYPE, RectF.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar, Float.valueOf(f2), Float.valueOf(f3), rectF, Byte.valueOf(z)}, this, f67260a, false, 76942, new Class[]{c.class, Float.TYPE, Float.TYPE, RectF.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    b.this.a(cVar, z, rectF, f2, f3);
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67260a, false, 76945, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67260a, false, 76945, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (b.this.l != null) {
                        b.this.l.b(z);
                        if (z) {
                            b.this.a();
                        }
                    }
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f67260a, false, 76943, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f67260a, false, 76943, new Class[0], Void.TYPE);
                        return;
                    }
                    if (b.this.l != null) {
                        b.this.l.a();
                    }
                }

                public final Float a(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67260a, false, 76950, new Class[]{Float.TYPE}, Float.class)) {
                        return (Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67260a, false, 76950, new Class[]{Float.TYPE}, Float.class);
                    } else if (b.this.m != null) {
                        return b.this.m.a(f2);
                    } else {
                        return Float.valueOf(f2);
                    }
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean b(float r18) {
                    /*
                        r17 = this;
                        r7 = r17
                        r8 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        java.lang.Float r1 = java.lang.Float.valueOf(r18)
                        r9 = 0
                        r0[r9] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r9] = r1
                        java.lang.Class r6 = java.lang.Boolean.TYPE
                        r3 = 0
                        r4 = 76951(0x12c97, float:1.07831E-40)
                        r1 = r17
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0045
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        java.lang.Float r1 = java.lang.Float.valueOf(r18)
                        r0[r9] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        r3 = 0
                        r4 = 76951(0x12c97, float:1.07831E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r9] = r1
                        java.lang.Class r6 = java.lang.Boolean.TYPE
                        r1 = r17
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        return r0
                    L_0x0045:
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r0 = r0.m
                        if (r0 == 0) goto L_0x00da
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r0 = r0.m
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c r1 = r1.j
                        android.graphics.PointF[] r1 = r1.getFourAnglePoint()
                        r2 = 2
                        java.lang.Object[] r10 = new java.lang.Object[r2]
                        r10[r9] = r1
                        java.lang.Float r3 = java.lang.Float.valueOf(r18)
                        r10[r8] = r3
                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r13 = 0
                        r14 = 77033(0x12ce9, float:1.07946E-40)
                        java.lang.Class[] r15 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r3 = android.graphics.PointF[].class
                        r15[r9] = r3
                        java.lang.Class r3 = java.lang.Float.TYPE
                        r15[r8] = r3
                        java.lang.Class r16 = java.lang.Boolean.TYPE
                        r11 = r0
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                        if (r3 == 0) goto L_0x00a4
                        java.lang.Object[] r10 = new java.lang.Object[r2]
                        r10[r9] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r18)
                        r10[r8] = r1
                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r13 = 0
                        r14 = 77033(0x12ce9, float:1.07946E-40)
                        java.lang.Class[] r15 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r1 = android.graphics.PointF[].class
                        r15[r9] = r1
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r15[r8] = r1
                        java.lang.Class r16 = java.lang.Boolean.TYPE
                        r11 = r0
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                    L_0x00a2:
                        r8 = r0
                        goto L_0x00da
                    L_0x00a4:
                        if (r1 != 0) goto L_0x00a7
                        goto L_0x00da
                    L_0x00a7:
                        android.graphics.RectF r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(r1)
                        boolean r2 = r1.isEmpty()
                        if (r2 == 0) goto L_0x00b2
                        goto L_0x00da
                    L_0x00b2:
                        int r2 = r0.f67316c
                        float r2 = (float) r2
                        r3 = 0
                        r1.offset(r2, r3)
                        android.graphics.RectF r2 = r0.f67315b
                        if (r2 != 0) goto L_0x00be
                        goto L_0x00da
                    L_0x00be:
                        android.graphics.Matrix r2 = new android.graphics.Matrix
                        r2.<init>()
                        float r3 = r1.centerX()
                        float r4 = r1.centerY()
                        r5 = r18
                        r2.postRotate(r5, r3, r4)
                        r2.mapRect(r1)
                        android.graphics.RectF r0 = r0.f67315b
                        boolean r0 = r0.contains(r1)
                        goto L_0x00a2
                    L_0x00da:
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.AnonymousClass2.b(float):boolean");
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean c(float r19) {
                    /*
                        r18 = this;
                        r7 = r18
                        r8 = r19
                        r9 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        java.lang.Float r1 = java.lang.Float.valueOf(r19)
                        r10 = 0
                        r0[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Boolean.TYPE
                        r3 = 0
                        r4 = 76952(0x12c98, float:1.07833E-40)
                        r1 = r18
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0047
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        java.lang.Float r1 = java.lang.Float.valueOf(r19)
                        r0[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        r3 = 0
                        r4 = 76952(0x12c98, float:1.07833E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Boolean.TYPE
                        r1 = r18
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        return r0
                    L_0x0047:
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r0 = r0.m
                        if (r0 == 0) goto L_0x00e5
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r0 = r0.m
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c r1 = r1.j
                        android.graphics.PointF[] r1 = r1.getFourAnglePoint()
                        r2 = 2
                        java.lang.Object[] r11 = new java.lang.Object[r2]
                        r11[r10] = r1
                        java.lang.Float r3 = java.lang.Float.valueOf(r19)
                        r11[r9] = r3
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r14 = 0
                        r15 = 77034(0x12cea, float:1.07948E-40)
                        java.lang.Class[] r3 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r4 = android.graphics.PointF[].class
                        r3[r10] = r4
                        java.lang.Class r4 = java.lang.Float.TYPE
                        r3[r9] = r4
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r12 = r0
                        r16 = r3
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r3 == 0) goto L_0x00aa
                        java.lang.Object[] r11 = new java.lang.Object[r2]
                        r11[r10] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r19)
                        r11[r9] = r1
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r14 = 0
                        r15 = 77034(0x12cea, float:1.07948E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r2 = android.graphics.PointF[].class
                        r1[r10] = r2
                        java.lang.Class r2 = java.lang.Float.TYPE
                        r1[r9] = r2
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r12 = r0
                        r16 = r1
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                    L_0x00a8:
                        r9 = r0
                        goto L_0x00e5
                    L_0x00aa:
                        if (r1 != 0) goto L_0x00ad
                        goto L_0x00e5
                    L_0x00ad:
                        android.graphics.RectF r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(r1)
                        boolean r2 = r1.isEmpty()
                        if (r2 == 0) goto L_0x00b8
                        goto L_0x00e5
                    L_0x00b8:
                        int r2 = r0.f67316c
                        float r2 = (float) r2
                        r3 = 0
                        r1.offset(r2, r3)
                        android.graphics.RectF r2 = r0.f67315b
                        if (r2 != 0) goto L_0x00c4
                        goto L_0x00e5
                    L_0x00c4:
                        r2 = 1065353216(0x3f800000, float:1.0)
                        int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                        if (r2 >= 0) goto L_0x00cb
                        goto L_0x00e5
                    L_0x00cb:
                        android.graphics.Matrix r2 = new android.graphics.Matrix
                        r2.<init>()
                        float r3 = r1.centerX()
                        float r4 = r1.centerY()
                        r2.postScale(r8, r8, r3, r4)
                        r2.mapRect(r1)
                        android.graphics.RectF r0 = r0.f67315b
                        boolean r0 = r0.contains(r1)
                        goto L_0x00a8
                    L_0x00e5:
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.AnonymousClass2.c(float):boolean");
                }

                public final void a(c cVar) {
                    c cVar2 = cVar;
                    if (PatchProxy.isSupport(new Object[]{cVar2}, this, f67260a, false, 76944, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar2}, this, f67260a, false, 76944, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    b.this.a(cVar2);
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final android.graphics.PointF a(float r20, float r21) {
                    /*
                        r19 = this;
                        r7 = r19
                        r8 = 2
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        r9 = 0
                        java.lang.Float r1 = java.lang.Float.valueOf(r9)
                        r10 = 0
                        r0[r10] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r9)
                        r11 = 1
                        r0[r11] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r10] = r1
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r11] = r1
                        java.lang.Class<android.graphics.PointF> r6 = android.graphics.PointF.class
                        r3 = 0
                        r4 = 76949(0x12c95, float:1.07829E-40)
                        r1 = r19
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0057
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        java.lang.Float r1 = java.lang.Float.valueOf(r9)
                        r0[r10] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r9)
                        r0[r11] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        r3 = 0
                        r4 = 76949(0x12c95, float:1.07829E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r10] = r1
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r11] = r1
                        java.lang.Class<android.graphics.PointF> r6 = android.graphics.PointF.class
                        r1 = r19
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        android.graphics.PointF r0 = (android.graphics.PointF) r0
                        return r0
                    L_0x0057:
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r0 = r0.m
                        if (r0 == 0) goto L_0x013a
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c r0 = r0.j
                        if (r0 == 0) goto L_0x013a
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c r0 = r0.j
                        android.graphics.PointF[] r0 = r0.getFourAnglePoint()
                        int r1 = r0.length
                        r2 = 0
                    L_0x006d:
                        if (r2 >= r1) goto L_0x007e
                        r3 = r0[r2]
                        float r4 = r3.x
                        float r4 = r4 + r9
                        r3.x = r4
                        float r4 = r3.y
                        float r4 = r4 + r9
                        r3.y = r4
                        int r2 = r2 + 1
                        goto L_0x006d
                    L_0x007e:
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r1 = r1.m
                        r2 = 3
                        java.lang.Object[] r12 = new java.lang.Object[r2]
                        r12[r10] = r0
                        java.lang.Float r3 = java.lang.Float.valueOf(r9)
                        r12[r11] = r3
                        java.lang.Float r3 = java.lang.Float.valueOf(r9)
                        r12[r8] = r3
                        com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r15 = 0
                        r16 = 77031(0x12ce7, float:1.07943E-40)
                        java.lang.Class[] r3 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r4 = android.graphics.PointF[].class
                        r3[r10] = r4
                        java.lang.Class r4 = java.lang.Float.TYPE
                        r3[r11] = r4
                        java.lang.Class r4 = java.lang.Float.TYPE
                        r3[r8] = r4
                        java.lang.Class<android.graphics.PointF> r18 = android.graphics.PointF.class
                        r13 = r1
                        r17 = r3
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                        if (r3 == 0) goto L_0x00e2
                        java.lang.Object[] r12 = new java.lang.Object[r2]
                        r12[r10] = r0
                        java.lang.Float r0 = java.lang.Float.valueOf(r9)
                        r12[r11] = r0
                        java.lang.Float r0 = java.lang.Float.valueOf(r9)
                        r12[r8] = r0
                        com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r15 = 0
                        r16 = 77031(0x12ce7, float:1.07943E-40)
                        java.lang.Class[] r0 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r2 = android.graphics.PointF[].class
                        r0[r10] = r2
                        java.lang.Class r2 = java.lang.Float.TYPE
                        r0[r11] = r2
                        java.lang.Class r2 = java.lang.Float.TYPE
                        r0[r8] = r2
                        java.lang.Class<android.graphics.PointF> r18 = android.graphics.PointF.class
                        r13 = r1
                        r17 = r0
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                        android.graphics.PointF r0 = (android.graphics.PointF) r0
                        return r0
                    L_0x00e2:
                        if (r0 != 0) goto L_0x00ea
                        android.graphics.PointF r0 = new android.graphics.PointF
                        r0.<init>(r9, r9)
                        return r0
                    L_0x00ea:
                        android.graphics.RectF r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(r0)
                        int r2 = r1.f67316c
                        float r2 = (float) r2
                        r0.offset(r2, r9)
                        android.graphics.PointF r2 = new android.graphics.PointF
                        r2.<init>()
                        r2.x = r9
                        r2.y = r9
                        float r3 = r0.right
                        android.graphics.RectF r4 = r1.f67315b
                        float r4 = r4.right
                        float r3 = r3 - r4
                        int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                        if (r3 <= 0) goto L_0x0111
                        android.graphics.RectF r3 = r1.f67315b
                        float r3 = r3.right
                        float r4 = r0.right
                        float r3 = r3 - r4
                        r2.x = r3
                    L_0x0111:
                        float r3 = r0.left
                        android.graphics.RectF r4 = r1.f67315b
                        float r4 = r4.left
                        float r3 = r3 - r4
                        int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                        if (r3 >= 0) goto L_0x0125
                        android.graphics.RectF r3 = r1.f67315b
                        float r3 = r3.left
                        float r4 = r0.left
                        float r3 = r3 - r4
                        r2.x = r3
                    L_0x0125:
                        float r3 = r0.bottom
                        android.graphics.RectF r4 = r1.f67315b
                        float r4 = r4.bottom
                        float r3 = r3 - r4
                        int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                        if (r3 <= 0) goto L_0x0139
                        android.graphics.RectF r1 = r1.f67315b
                        float r1 = r1.bottom
                        float r0 = r0.bottom
                        float r1 = r1 - r0
                        r2.y = r1
                    L_0x0139:
                        return r2
                    L_0x013a:
                        android.graphics.PointF r0 = new android.graphics.PointF
                        r0.<init>(r9, r9)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.AnonymousClass2.a(float, float):android.graphics.PointF");
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean b(float r19, float r20) {
                    /*
                        r18 = this;
                        r7 = r18
                        r8 = 2
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        java.lang.Float r1 = java.lang.Float.valueOf(r19)
                        r9 = 0
                        r0[r9] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r20)
                        r10 = 1
                        r0[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r9] = r1
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Boolean.TYPE
                        r3 = 0
                        r4 = 76953(0x12c99, float:1.07834E-40)
                        r1 = r18
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x005a
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        java.lang.Float r1 = java.lang.Float.valueOf(r19)
                        r0[r9] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r20)
                        r0[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f67260a
                        r3 = 0
                        r4 = 76953(0x12c99, float:1.07834E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r9] = r1
                        java.lang.Class r1 = java.lang.Float.TYPE
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Boolean.TYPE
                        r1 = r18
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        return r0
                    L_0x005a:
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r0 = r0.m
                        if (r0 == 0) goto L_0x00f5
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a r0 = r0.m
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.this
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c r1 = r1.j
                        android.graphics.PointF[] r1 = r1.getFourAnglePoint()
                        r2 = 3
                        java.lang.Object[] r11 = new java.lang.Object[r2]
                        r11[r9] = r1
                        java.lang.Float r3 = java.lang.Float.valueOf(r19)
                        r11[r10] = r3
                        java.lang.Float r3 = java.lang.Float.valueOf(r20)
                        r11[r8] = r3
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r14 = 0
                        r15 = 77035(0x12ceb, float:1.07949E-40)
                        java.lang.Class[] r3 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r4 = android.graphics.PointF[].class
                        r3[r9] = r4
                        java.lang.Class r4 = java.lang.Float.TYPE
                        r3[r10] = r4
                        java.lang.Class r4 = java.lang.Float.TYPE
                        r3[r8] = r4
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r12 = r0
                        r16 = r3
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r3 == 0) goto L_0x00d1
                        java.lang.Object[] r11 = new java.lang.Object[r2]
                        r11[r9] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r19)
                        r11[r10] = r1
                        java.lang.Float r1 = java.lang.Float.valueOf(r20)
                        r11[r8] = r1
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.f67314a
                        r14 = 0
                        r15 = 77035(0x12ceb, float:1.07949E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r2]
                        java.lang.Class<android.graphics.PointF[]> r2 = android.graphics.PointF[].class
                        r1[r9] = r2
                        java.lang.Class r2 = java.lang.Float.TYPE
                        r1[r10] = r2
                        java.lang.Class r2 = java.lang.Float.TYPE
                        r1[r8] = r2
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r12 = r0
                        r16 = r1
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                    L_0x00cf:
                        r10 = r0
                        goto L_0x00f5
                    L_0x00d1:
                        if (r1 != 0) goto L_0x00d4
                        goto L_0x00f5
                    L_0x00d4:
                        android.graphics.RectF r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(r1)
                        boolean r2 = r1.isEmpty()
                        if (r2 == 0) goto L_0x00df
                        goto L_0x00f5
                    L_0x00df:
                        int r2 = r0.f67316c
                        float r2 = (float) r2
                        float r2 = r2 + r19
                        r3 = r20
                        r1.offset(r2, r3)
                        android.graphics.RectF r2 = r0.f67315b
                        if (r2 != 0) goto L_0x00ee
                        goto L_0x00f5
                    L_0x00ee:
                        android.graphics.RectF r0 = r0.f67315b
                        boolean r0 = r0.contains(r1)
                        goto L_0x00cf
                    L_0x00f5:
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.AnonymousClass2.b(float, float):boolean");
                }

                public final int a(boolean z, boolean z2, boolean z3) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f67260a, false, 76947, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f67260a, false, 76947, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
                    }
                    if (b.this.m != null) {
                        if (z) {
                            b.this.m.a();
                        } else if (b.this.j != null) {
                            return b.this.m.a(b.this.j.getFourAnglePoint(), z2, z3);
                        }
                    }
                    return -1;
                }

                public final PointF a(float f2, float f3, boolean z) {
                    float f4 = f2;
                    float f5 = f3;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f67260a, false, 76948, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, PointF.class)) {
                        return (PointF) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f67260a, false, 76948, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, PointF.class);
                    } else if (b.this.m == null || b.this.j == null) {
                        return new PointF(0.0f, 0.0f);
                    } else {
                        PointF[] fourAnglePoint = b.this.j.getFourAnglePoint();
                        for (PointF pointF : fourAnglePoint) {
                            pointF.x += f4;
                            pointF.y += f5;
                        }
                        return b.this.m.a(fourAnglePoint, f2, f5, z);
                    }
                }
            });
            this.k.add(0, this.j);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67252a, false, 76919, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67252a, false, 76919, new Class[0], Void.TYPE);
        } else if (this.f67253b != null && this.f67254c != null && this.j != null && this.m != null) {
            this.f67253b.setHightLayerListenerToFirst(this.y);
            if (this.f67254c.getChildCount() > 1 && this.f67254c.getChildAt(this.f67254c.getChildCount() - 1) != this.j) {
                this.f67254c.removeView(this.j);
                this.f67254c.addView(this.j);
            }
            if (this.k.size() > 1 && this.k.get(0) != this.j) {
                this.k.remove(this.j);
                this.k.add(0, this.j);
            }
            if (this.m != null) {
                ViewGroup viewGroup = (ViewGroup) this.m.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.m);
                    viewGroup.addView(this.m);
                }
            }
        }
    }

    public void a(String str) {
        this.n = str;
    }

    private PointF a(PointF pointF) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{pointF}, this, f67252a, false, 76931, new Class[]{PointF.class}, PointF.class)) {
            return (PointF) PatchProxy.accessDispatch(new Object[]{pointF}, this, f67252a, false, 76931, new Class[]{PointF.class}, PointF.class);
        }
        PointF pointF2 = new PointF();
        if (this.o == null) {
            i3 = fc.b(this.j.getContext());
            i2 = fc.a(this.j.getContext());
        } else {
            i3 = this.o.f77890a;
            i2 = this.o.f77891b;
        }
        pointF2.set(e((pointF.x * 1.0f) / ((float) i3)), e((pointF.y * 1.0f) / ((float) i2)));
        return pointF2;
    }

    public static float e(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, f67252a, true, 76933, new Class[]{Float.TYPE}, Float.TYPE)) {
            return new BigDecimal((double) f2).setScale(4, 1).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, f67252a, true, 76933, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
    }

    public final void d(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67252a, false, 76928, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67252a, false, 76928, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.setAlpha(f2);
        }
    }

    public final InteractStickerStruct a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67252a, false, 76930, new Class[]{Integer.TYPE}, InteractStickerStruct.class)) {
            return (InteractStickerStruct) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67252a, false, 76930, new Class[]{Integer.TYPE}, InteractStickerStruct.class);
        } else if (!g() || this.j == null) {
            return null;
        } else {
            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(i2);
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            normalTrackTimeStamp.setRotation(e(this.j.getRotateAngle()));
            normalTrackTimeStamp.setScale(Float.valueOf(this.j.getScale()));
            PointF a2 = a(this.j.a(this.o));
            normalTrackTimeStamp.setX(a2.x);
            normalTrackTimeStamp.setY(a2.y);
            PointF a3 = a(new PointF((float) this.j.getContentViewWidth(), (float) this.j.getContentViewHeight()));
            normalTrackTimeStamp.setWidth(a3.x);
            normalTrackTimeStamp.setHeight(a3.y);
            linkedList.add(normalTrackTimeStamp);
            if (PatchProxy.isSupport(new Object[]{interactStickerStruct, linkedList}, null, c.f67264a, true, 76966, new Class[]{InteractStickerStruct.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{interactStickerStruct, linkedList}, null, c.f67264a, true, 76966, new Class[]{InteractStickerStruct.class, List.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(interactStickerStruct, "struct");
                Intrinsics.checkParameterIsNotNull(linkedList, "listData");
                if (CollectionUtils.isEmpty(linkedList)) {
                    interactStickerStruct.setTrackList("");
                } else {
                    try {
                        interactStickerStruct.setTrackList(com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().toJson((Object) linkedList));
                    } catch (JsonIOException unused) {
                    }
                }
            }
            return interactStickerStruct;
        }
    }

    public final void b(Context context, View view, StoryStickerGestureLayout storyStickerGestureLayout, FrameLayout frameLayout) {
        Context context2 = context;
        View view2 = view;
        StoryStickerGestureLayout storyStickerGestureLayout2 = storyStickerGestureLayout;
        FrameLayout frameLayout2 = frameLayout;
        if (PatchProxy.isSupport(new Object[]{context2, view2, storyStickerGestureLayout2, frameLayout2}, this, f67252a, false, 76915, new Class[]{Context.class, View.class, StoryStickerGestureLayout.class, FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, view2, storyStickerGestureLayout2, frameLayout2}, this, f67252a, false, 76915, new Class[]{Context.class, View.class, StoryStickerGestureLayout.class, FrameLayout.class}, Void.TYPE);
            return;
        }
        this.r = context2;
        this.u = view2;
        this.f67254c = frameLayout2;
        this.f67253b = storyStickerGestureLayout2;
        this.y = new a();
        StoryStickerGestureLayout storyStickerGestureLayout3 = this.f67253b;
        a aVar = this.y;
        if (PatchProxy.isSupport(new Object[]{aVar}, storyStickerGestureLayout3, StoryStickerGestureLayout.f74282a, false, 86299, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b.class}, Void.TYPE)) {
            StoryStickerGestureLayout storyStickerGestureLayout4 = storyStickerGestureLayout3;
            PatchProxy.accessDispatch(new Object[]{aVar}, storyStickerGestureLayout4, StoryStickerGestureLayout.f74282a, false, 86299, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b.class}, Void.TYPE);
        } else {
            storyStickerGestureLayout3.f74283b.add(0, aVar);
        }
        i();
        this.w = new a();
        this.s = this.u.findViewById(C0906R.id.dsr);
    }

    public void a(Context context, View view, StoryStickerGestureLayout storyStickerGestureLayout, FrameLayout frameLayout) {
        Context context2 = context;
        View view2 = view;
        StoryStickerGestureLayout storyStickerGestureLayout2 = storyStickerGestureLayout;
        FrameLayout frameLayout2 = frameLayout;
        if (PatchProxy.isSupport(new Object[]{context2, view2, storyStickerGestureLayout2, frameLayout2}, this, f67252a, false, 76913, new Class[]{Context.class, View.class, StoryStickerGestureLayout.class, FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, view2, storyStickerGestureLayout2, frameLayout2}, this, f67252a, false, 76913, new Class[]{Context.class, View.class, StoryStickerGestureLayout.class, FrameLayout.class}, Void.TYPE);
            return;
        }
        this.r = context2;
        this.u = view2;
        this.f67254c = frameLayout2;
        this.f67253b = storyStickerGestureLayout2;
        this.y = new a();
        this.f67253b.a(this.y);
        i();
        this.w = new a();
        this.s = this.u.findViewById(C0906R.id.dsr);
    }

    public final i<d> a(String str, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f67252a, false, 76935, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f67252a, false, 76935, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, i.class);
        }
        if (this.j != null) {
            this.j.h();
        }
        return this.w.a(this.j, this.f67254c, str, i2, i3, i4, i5);
    }
}
