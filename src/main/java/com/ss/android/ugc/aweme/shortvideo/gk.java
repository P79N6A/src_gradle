package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import java.lang.reflect.Type;

public final class gk implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67939a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67940b;

    /* renamed from: c  reason: collision with root package name */
    RecordToolbarViewModel f67941c;

    public gk(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67940b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67939a, false, 74743, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67939a, false, 74743, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != az.class) {
            return null;
        } else {
            return new gl(this);
        }
    }
}
