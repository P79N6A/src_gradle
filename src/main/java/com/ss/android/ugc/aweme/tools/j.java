package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class j extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74772a;

    /* renamed from: b  reason: collision with root package name */
    public final String f74773b;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74772a, false, 86954, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74772a, false, 86954, new Class[0], String.class);
        }
        return "CheckCloseRecordingUiEvent{referer='" + this.f74773b + '\'' + '}';
    }

    public j(String str) {
        this.f74773b = str;
    }
}
