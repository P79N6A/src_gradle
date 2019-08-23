package dmt.av.video;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;

public final /* synthetic */ class ab implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82847a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditFragment f82848b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f82849c;

    /* renamed from: d  reason: collision with root package name */
    private final int f82850d;

    /* renamed from: e  reason: collision with root package name */
    private final int f82851e;

    /* renamed from: f  reason: collision with root package name */
    private final float f82852f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    ab(VEVideoPublishEditFragment vEVideoPublishEditFragment, boolean z, int i2, int i3, float f2, int i4, int i5, int i6, int i7, int i8) {
        this.f82848b = vEVideoPublishEditFragment;
        this.f82849c = z;
        this.f82850d = i2;
        this.f82851e = i3;
        this.f82852f = f2;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr;
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f82847a, false, 92066, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f82847a, false, 92066, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        VEVideoPublishEditFragment vEVideoPublishEditFragment = this.f82848b;
        boolean z = this.f82849c;
        int i2 = this.f82850d;
        int i3 = this.f82851e;
        float f2 = this.f82852f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        int i7 = this.j;
        int i8 = this.k;
        float a2 = VEVideoPublishEditFragment.a(valueAnimator.getAnimatedFraction(), z);
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (vEVideoPublishEditFragment.a(i2, i3)) {
            if (!fc.a() || !fb.a()) {
                i6 = 0;
            }
            float f3 = f2 * floatValue;
            fArr = new float[]{f3, (((float) i4) - f3) / 2.0f, ((float) (i5 - i6)) * a2};
        } else if (fc.a()) {
            float f4 = f2 * floatValue;
            fArr = new float[]{f4, (((float) i4) - f4) / 2.0f, 0.0f};
        } else {
            float f5 = f2 * floatValue;
            fArr = new float[]{f5, (((float) i4) - f5) / 2.0f, ((((float) i7) - (((float) (i8 - i5)) * a2)) - floatValue) / 2.0f};
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        int i9 = (int) f7;
        int i10 = (int) fArr[2];
        int i11 = (int) f6;
        int i12 = (int) floatValue;
        vEVideoPublishEditFragment.f82763d.q.a(i9, i10, i11, i12);
        vEVideoPublishEditFragment.a(i9, i10, i11, i12);
        vEVideoPublishEditFragment.a((floatValue * 1.0f) / ((float) i2), i9, i10);
    }
}
