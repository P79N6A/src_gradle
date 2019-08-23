package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Set;

@UiThread
public abstract class a<L> {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f25941a;

    /* renamed from: b  reason: collision with root package name */
    public MotionEvent f25942b;

    /* renamed from: c  reason: collision with root package name */
    public MotionEvent f25943c;

    /* renamed from: d  reason: collision with root package name */
    public long f25944d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25945e = true;

    /* renamed from: f  reason: collision with root package name */
    public L f25946f;
    private final AndroidGesturesManager g;

    /* access modifiers changed from: protected */
    public abstract boolean b(MotionEvent motionEvent);

    public void a(boolean z) {
        this.f25945e = z;
    }

    /* access modifiers changed from: package-private */
    public boolean a(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.f25943c != null) {
            this.f25943c.recycle();
            this.f25943c = null;
        }
        if (this.f25942b != null) {
            this.f25943c = MotionEvent.obtain(this.f25942b);
            this.f25942b.recycle();
            this.f25942b = null;
        }
        this.f25942b = MotionEvent.obtain(motionEvent);
        this.f25944d = this.f25942b.getEventTime() - this.f25942b.getDownTime();
        return b(motionEvent);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i) {
        if (this.f25946f == null || !this.f25945e) {
            return false;
        }
        for (Set<Integer> next : this.g.f25935a) {
            if (next.contains(Integer.valueOf(i))) {
                for (Integer intValue : next) {
                    int intValue2 = intValue.intValue();
                    Iterator<a> it2 = this.g.f25936b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            a next2 = it2.next();
                            if (next2 instanceof i) {
                                i iVar = (i) next2;
                                if (iVar.n.contains(Integer.valueOf(intValue2)) && iVar.o) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    public a(Context context, AndroidGesturesManager androidGesturesManager) {
        this.f25941a = context;
        this.g = androidGesturesManager;
    }
}
