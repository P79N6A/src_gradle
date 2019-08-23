package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ak;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class ez implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67628a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoRecordingOperationPanelFragment f67629b;

    public ez(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67629b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67628a, false, 74525, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67628a, false, 74525, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ak.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67630a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67630a, false, 74526, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67630a, false, 74526, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    c a2 = c.a();
                    a2.a("enter_from", "long_press, zoom_method:long_press");
                    r.onEvent(MobClick.obtain().setEventName("zoom").setLabelName("shoot_page").setJsonObject(a2.b()));
                    ((VideoRecordNewActivity) ez.this.f67629b.getActivity()).m.e();
                }
            };
        }
    }
}
