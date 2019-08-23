package com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.b;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.c;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.g;
import java.util.ArrayList;
import java.util.List;

public class StoryStickerGestureLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74282a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f74283b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<b> f74284c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<b> f74285d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public List<b> f74286e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private a f74287f;
    private g g;

    class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74288a;

        public final boolean a(b bVar, float f2, float f3) {
            b bVar2 = bVar;
            float f4 = f2;
            float f5 = f3;
            if (PatchProxy.isSupport(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74288a, false, 86304, new Class[]{b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74288a, false, 86304, new Class[]{b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.a(bVar2, f4, f5)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.a(bVar2, f4, f5)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.a(bVar2, f4, f5)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.a(bVar2, f4, f5)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean a(b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f74288a, false, 86305, new Class[]{b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f74288a, false, 86305, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.a(bVar)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.a(bVar)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.a(bVar)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.a(bVar)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f74288a, false, 86307, new Class[]{c.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f74288a, false, 86307, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.a(cVar)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.a(cVar)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.a(cVar)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.a(cVar)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }

        public final boolean a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74288a, false, 86312, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74288a, false, 86312, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.a(f2)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.a(f2)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.a(f2)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.a(f2)) {
                    return true;
                }
            }
            return false;
        }

        public final void b(b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f74288a, false, 86306, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f74288a, false, 86306, new Class[]{b.class}, Void.TYPE);
                return;
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null) {
                    next.b(bVar);
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null) {
                    next2.b(bVar);
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null) {
                    next3.b(bVar);
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null) {
                    next4.b(bVar);
                }
            }
        }

        public final boolean c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74288a, false, 86309, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74288a, false, 86309, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.c(f2)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.c(f2)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.c(f2)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.c(f2)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74288a, false, 86313, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74288a, false, 86313, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.d(motionEvent)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.d(motionEvent)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.d(motionEvent)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.d(motionEvent)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74288a, false, 86314, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74288a, false, 86314, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.e(motionEvent)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.e(motionEvent)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.e(motionEvent)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.e(motionEvent)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean a(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74288a, false, 86315, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74288a, false, 86315, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.a(motionEvent)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.a(motionEvent)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.a(motionEvent)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.a(motionEvent)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74288a, false, 86308, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74288a, false, 86308, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.b(f2)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.b(f2)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.b(f2)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.b(f2)) {
                    return true;
                }
            }
            return true;
        }

        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f74288a, false, 86310, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f74288a, false, 86310, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.a(scaleGestureDetector)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.a(scaleGestureDetector)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.a(scaleGestureDetector)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.a(scaleGestureDetector)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f74288a, false, 86311, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f74288a, false, 86311, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.b(scaleGestureDetector)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.b(scaleGestureDetector)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.b(scaleGestureDetector)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.b(scaleGestureDetector)) {
                    return true;
                }
            }
            return false;
        }

        /* synthetic */ a(StoryStickerGestureLayout storyStickerGestureLayout, byte b2) {
            this();
        }

        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            MotionEvent motionEvent3 = motionEvent;
            MotionEvent motionEvent4 = motionEvent2;
            float f4 = f2;
            float f5 = f3;
            if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74288a, false, 86317, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74288a, false, 86317, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.a(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.a(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.a(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.a(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            MotionEvent motionEvent3 = motionEvent;
            MotionEvent motionEvent4 = motionEvent2;
            float f4 = f2;
            float f5 = f3;
            if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74288a, false, 86316, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent4, Float.valueOf(f2), Float.valueOf(f3)}, this, f74288a, false, 86316, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (b next : StoryStickerGestureLayout.this.f74283b) {
                if (next != null && next.b(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            for (b next2 : StoryStickerGestureLayout.this.f74284c) {
                if (next2 != null && next2.b(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            for (b next3 : StoryStickerGestureLayout.this.f74285d) {
                if (next3 != null && next3.b(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            for (b next4 : StoryStickerGestureLayout.this.f74286e) {
                if (next4 != null && next4.b(motionEvent3, motionEvent4, f4, f5)) {
                    return true;
                }
            }
            return false;
        }
    }

    public g getDeleteView() {
        return this.g;
    }

    public List<b> getHightLayerListenerList() {
        return this.f74284c;
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74282a, false, 86300, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74282a, false, 86300, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f74284c.add(0, bVar2);
    }

    public final void b(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74282a, false, 86302, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74282a, false, 86302, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f74286e.add(bVar2);
    }

    public void setHightLayerListenerToFirst(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74282a, false, 86303, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74282a, false, 86303, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f74284c.remove(bVar2);
        a(bVar);
    }

    public void setGestureModule(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f74282a, false, 86298, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f74282a, false, 86298, new Class[]{a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            this.f74287f = aVar2;
            a aVar3 = this.f74287f;
            a aVar4 = new a(this, (byte) 0);
            if (PatchProxy.isSupport(new Object[]{aVar4}, aVar3, a.f74290a, false, 86266, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.class}, Void.TYPE)) {
                Object[] objArr = {aVar4};
                a aVar5 = aVar3;
                ChangeQuickRedirect changeQuickRedirect = a.f74290a;
                PatchProxy.accessDispatch(objArr, aVar5, changeQuickRedirect, false, 86266, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.class}, Void.TYPE);
                return;
            }
            StickerGesturePresenter stickerGesturePresenter = aVar3.f74291b;
            if (PatchProxy.isSupport(new Object[]{aVar4}, stickerGesturePresenter, StickerGesturePresenter.f74276a, false, 86296, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.class}, Void.TYPE)) {
                StickerGesturePresenter stickerGesturePresenter2 = stickerGesturePresenter;
                PatchProxy.accessDispatch(new Object[]{aVar4}, stickerGesturePresenter2, StickerGesturePresenter.f74276a, false, 86296, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.class}, Void.TYPE);
                return;
            }
            stickerGesturePresenter.f74277b.add(0, aVar4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryStickerGestureLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        g gVar;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, g.f74375a, true, 86341, new Class[]{Context.class}, g.class)) {
            gVar = (g) PatchProxy.accessDispatch(new Object[]{context2}, null, g.f74375a, true, 86341, new Class[]{Context.class}, g.class);
        } else if (context2 == null) {
            gVar = null;
        } else {
            g gVar2 = new g(context2);
            int dip2Px = (int) UIUtils.dip2Px(context2, 72.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dip2Px, dip2Px);
            layoutParams.topMargin = p.c();
            gVar2.setLayoutParams(layoutParams);
            layoutParams.gravity = 49;
            gVar2.setLayoutParams(layoutParams);
            gVar = gVar2;
        }
        this.g = gVar;
        addView(this.g);
    }
}
