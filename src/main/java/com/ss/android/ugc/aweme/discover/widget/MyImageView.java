package com.ss.android.ugc.aweme.discover.widget;

import android.support.v7.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MyImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43308a;

    public float getAlpha() {
        if (!PatchProxy.isSupport(new Object[0], this, f43308a, false, 38263, new Class[0], Float.TYPE)) {
            return super.getAlpha();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f43308a, false, 38263, new Class[0], Float.TYPE)).floatValue();
    }

    public void setAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f43308a, false, 38261, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f43308a, false, 38261, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.setAlpha(f2);
    }

    public void setImageAlpha(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43308a, false, 38262, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43308a, false, 38262, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setImageAlpha(i);
    }
}
