package f.a.a.a.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.OverScroller;

@TargetApi(9)
public class a extends d {

    /* renamed from: a  reason: collision with root package name */
    protected OverScroller f83103a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f83104b;

    public final boolean b() {
        return this.f83103a.isFinished();
    }

    public final int c() {
        return this.f83103a.getCurrX();
    }

    public final int d() {
        return this.f83103a.getCurrY();
    }

    public boolean a() {
        if (this.f83104b) {
            this.f83103a.computeScrollOffset();
            this.f83104b = false;
        }
        return this.f83103a.computeScrollOffset();
    }

    public final void a(boolean z) {
        this.f83103a.forceFinished(true);
    }

    public a(Context context) {
        this.f83103a = new OverScroller(context);
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f83103a.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }
}
