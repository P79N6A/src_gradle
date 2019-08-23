package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.f;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.shortvideo.gesture.a;

public final class ai extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69299a;

    /* renamed from: b  reason: collision with root package name */
    private int f69300b;

    /* renamed from: c  reason: collision with root package name */
    private int f69301c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f69302d;

    /* renamed from: e  reason: collision with root package name */
    private PointF f69303e = new PointF(-2.0f, -2.0f);

    public ai(Context context) {
        this.f69300b = p.b(context);
        this.f69301c = p.a(context);
    }

    public final boolean d(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f69299a, false, 78820, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f69299a, false, 78820, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        f.a().a(0, motionEvent.getX() / ((float) this.f69300b), motionEvent.getY() / ((float) this.f69301c), 1);
        this.f69302d = true;
        return false;
    }

    public final boolean e(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f69299a, false, 78821, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f69299a, false, 78821, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        f.a().a(2, motionEvent.getX() / ((float) this.f69300b), motionEvent.getY() / ((float) this.f69301c), 1);
        this.f69302d = false;
        return false;
    }

    public final boolean b(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f69299a, false, 78818, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f69299a, false, 78818, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        f a2 = f.a();
        float x = motionEvent.getX() / ((float) this.f69300b);
        float y = motionEvent.getY() / ((float) this.f69301c);
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(x), Float.valueOf(y)}, a2, f.f29650a, false, 16494, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            Object[] objArr = {Float.valueOf(x), Float.valueOf(y)};
            Object[] objArr2 = objArr;
            f fVar = a2;
            ((Integer) PatchProxy.accessDispatch(objArr2, fVar, f.f29650a, false, 16494, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (a2.f29653b != null) {
            a2.f29653b.processTouchEvent(x, y);
        }
        return true;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f69299a, false, 78819, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f69299a, false, 78819, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.f69302d) {
            this.f69303e.x = motionEvent.getX();
            this.f69303e.y = motionEvent.getY();
            this.f69302d = false;
        }
        f.a().a(motionEvent2.getX() / ((float) this.f69300b), motionEvent2.getY() / ((float) this.f69301c), (motionEvent2.getX() - this.f69303e.x) / ((float) this.f69300b), (motionEvent2.getY() - this.f69303e.y) / ((float) this.f69301c), 1.0f);
        this.f69303e.x = motionEvent2.getX();
        this.f69303e.y = motionEvent2.getY();
        return true;
    }
}
