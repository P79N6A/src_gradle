package com.ss.android.ugc.aweme.main.base.transforms;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class StackTransformer extends ABaseTransformer {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54570b;

    /* renamed from: c  reason: collision with root package name */
    private View f54571c;

    /* renamed from: d  reason: collision with root package name */
    private View f54572d;

    /* renamed from: e  reason: collision with root package name */
    private View f54573e;

    public final void a(View view, float f2) {
        float f3;
        float f4;
        boolean z;
        boolean z2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f54570b, false, 57951, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f54570b, false, 57951, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 > 1.0f) {
            f3 = 1.0f;
        } else if (f2 < -1.0f) {
            f3 = -1.0f;
        } else {
            f3 = f2;
        }
        if (f3 > 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = ((float) (-view.getWidth())) * f3;
        }
        view2.setTranslationX(f4);
        if (f3 <= 0.0f) {
            view2.setPivotY((float) (view.getHeight() / 2));
            view2.setPivotX((float) (view.getWidth() / 2));
            double abs = (double) Math.abs(f3);
            Double.isNaN(abs);
            view2.setScaleX(1.0f - ((float) (abs * 0.1d)));
            double abs2 = (double) Math.abs(f3);
            Double.isNaN(abs2);
            view2.setScaleY(1.0f - ((float) (abs2 * 0.1d)));
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f3)}, this, f54570b, false, 57952, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f3)}, this, f54570b, false, 57952, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                return;
            }
            float abs3 = 1.0f - Math.abs(f3);
            if (PatchProxy.isSupport(new Object[]{view2}, this, f54570b, false, 57953, new Class[]{View.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f54570b, false, 57953, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (view.getId() == C0906R.id.cbn) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || ((view2.getTag(C0906R.id.cbn) instanceof Boolean) && ((Boolean) view2.getTag(C0906R.id.cbn)).booleanValue())) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                if (this.f54571c == null) {
                    this.f54571c = view2.findViewById(C0906R.id.py);
                }
                if (this.f54572d == null) {
                    this.f54572d = view2.findViewById(C0906R.id.ca_);
                }
                if (this.f54573e == null) {
                    this.f54573e = view2.findViewById(C0906R.id.cxg);
                }
                if (this.f54571c != null) {
                    this.f54571c.setAlpha(abs3);
                }
                if (this.f54572d != null) {
                    this.f54572d.setAlpha(abs3);
                }
                if (this.f54573e != null) {
                    this.f54573e.setAlpha(1.0f - abs3);
                    if (this.f54573e.getAlpha() > 0.0f && this.f54573e.getVisibility() != 0) {
                        this.f54573e.setVisibility(0);
                    }
                }
            }
        }
    }
}
