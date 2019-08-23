package f.a.a.a.b;

import android.content.Context;
import android.widget.Scroller;

public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    private Scroller f83105a;

    public final boolean b() {
        return this.f83105a.isFinished();
    }

    public final int c() {
        return this.f83105a.getCurrX();
    }

    public final int d() {
        return this.f83105a.getCurrY();
    }

    public final boolean a() {
        return this.f83105a.computeScrollOffset();
    }

    public final void a(boolean z) {
        this.f83105a.forceFinished(true);
    }

    public c(Context context) {
        this.f83105a = new Scroller(context);
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f83105a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }
}
