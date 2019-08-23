package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.g;

public final /* synthetic */ class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61128a;

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f61129b;

    c(StringBuilder sb) {
        this.f61129b = sb;
    }

    public final boolean apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f61128a, false, 67129, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f61128a, false, 67129, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        StringBuilder sb = this.f61129b;
        Activity activity = (Activity) obj;
        if (activity instanceof g) {
            sb.append(activity);
            sb.append(" isRecording: ");
            sb.append(((g) activity).O());
            sb.append("\n");
        } else {
            sb.append(activity);
            sb.append("\n");
        }
        return false;
    }
}
