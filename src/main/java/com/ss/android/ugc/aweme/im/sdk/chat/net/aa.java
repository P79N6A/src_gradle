package com.ss.android.ugc.aweme.im.sdk.chat.net;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class aa implements Runnable {
    public static ChangeQuickRedirect h;
    public String i;
    public Map<String, aa> j;

    public void run() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 51324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 51324, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null && TextUtils.isEmpty(this.i)) {
            this.j.remove(this.i);
        }
    }
}
