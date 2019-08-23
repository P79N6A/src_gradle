package com.bytedance.ies.b;

import android.content.Context;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.PatchManipulate;
import com.meituan.robust.RobustCallBack;

public final class f extends PatchExecutor {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f20213a;

    public final void run() {
        this.f20213a = true;
        super.run();
        this.f20213a = false;
    }

    public f(Context context, PatchManipulate patchManipulate, RobustCallBack robustCallBack) {
        super(context, patchManipulate, robustCallBack);
    }
}
