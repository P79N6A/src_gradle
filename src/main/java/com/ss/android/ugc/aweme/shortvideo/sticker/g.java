package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69523a;

    /* renamed from: d  reason: collision with root package name */
    private static g f69524d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69525b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69526c;

    private g() {
    }

    public static g a() {
        if (PatchProxy.isSupport(new Object[0], null, f69523a, true, 78636, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f69523a, true, 78636, new Class[0], g.class);
        }
        if (f69524d == null) {
            f69524d = new g();
        }
        return f69524d;
    }

    public final void a(@NonNull View view, @NonNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{view, activity}, this, f69523a, false, 78637, new Class[]{View.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, activity}, this, f69523a, false, 78637, new Class[]{View.class, Activity.class}, Void.TYPE);
        } else if (!a.L.a(e.a.BubbleFavoriteStickerShown) && this.f69525b && this.f69526c && view.getParent() != null) {
            view.post(new h(activity, view));
        }
    }
}
