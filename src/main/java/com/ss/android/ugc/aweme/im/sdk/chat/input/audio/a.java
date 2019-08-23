package com.ss.android.ugc.aweme.im.sdk.chat.input.audio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import java.io.File;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50352a;

    public final File a() {
        if (!PatchProxy.isSupport(new Object[0], this, f50352a, false, 50661, new Class[0], File.class)) {
            return GlobalContext.getContext().getExternalFilesDir("im/audio");
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f50352a, false, 50661, new Class[0], File.class);
    }
}
