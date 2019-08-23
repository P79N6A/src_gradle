package dmt.av.video;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82841a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditFragment f82842b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f82843c;

    /* renamed from: d  reason: collision with root package name */
    private final float f82844d;

    /* renamed from: e  reason: collision with root package name */
    private final int f82845e;

    /* renamed from: f  reason: collision with root package name */
    private final int f82846f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    aa(VEVideoPublishEditFragment vEVideoPublishEditFragment, boolean z, float f2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f82842b = vEVideoPublishEditFragment;
        this.f82843c = z;
        this.f82844d = f2;
        this.f82845e = i2;
        this.f82846f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f82841a, false, 92065, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f82841a, false, 92065, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        VEVideoPublishEditFragment vEVideoPublishEditFragment = this.f82842b;
        boolean z = this.f82843c;
        float f2 = this.f82844d;
        int i2 = this.f82845e;
        int i3 = this.f82846f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        int i7 = this.j;
        float a2 = VEVideoPublishEditFragment.a(valueAnimator.getAnimatedFraction(), z);
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = {f2 * floatValue, 0.0f, ((((((float) i2) - (((float) (i3 - i4)) * a2)) - floatValue) / 2.0f) + ((float) i5)) - ((float) i6)};
        float f3 = fArr[0];
        float f4 = fArr[1];
        int i8 = (int) f4;
        int i9 = (int) fArr[2];
        int i10 = (int) f3;
        int i11 = (int) floatValue;
        vEVideoPublishEditFragment.f82763d.q.a(i8, i9, i10, i11);
        vEVideoPublishEditFragment.a(i8, i9, i10, i11);
        vEVideoPublishEditFragment.a((floatValue * 1.0f) / ((float) i7), i8, i9);
    }
}
