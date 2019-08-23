package com.ss.android.ugc.aweme.story.detail.a;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72351a;

    /* renamed from: b  reason: collision with root package name */
    AnimatorSet f72352b = new AnimatorSet();

    /* renamed from: c  reason: collision with root package name */
    private Activity f72353c;

    public boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f72351a, false, 83136, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72351a, false, 83136, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f72352b == null || !this.f72352b.isRunning()) {
            return false;
        } else {
            return true;
        }
    }

    public a(Activity activity) {
        this.f72353c = activity;
    }

    /* access modifiers changed from: package-private */
    public int a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f72351a, false, 83137, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f72351a, false, 83137, new Class[]{View.class}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        return iArr[0];
    }

    /* access modifiers changed from: package-private */
    public int b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f72351a, false, 83138, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f72351a, false, 83138, new Class[]{View.class}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        return iArr[1];
    }
}
