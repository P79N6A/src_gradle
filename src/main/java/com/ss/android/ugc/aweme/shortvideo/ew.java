package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tools.an;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;
import java.util.Map;

public final class ew implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67621a;

    /* renamed from: b  reason: collision with root package name */
    public final ShortVideoRecordingOperationPanelFragment f67622b;

    public ew(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67622b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67621a, false, 74514, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67621a, false, 74514, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != an.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67623a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67623a, false, 74515, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67623a, false, 74515, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    an anVar = (an) t;
                    r.onEvent(MobClick.obtain().setEventName(anVar.f74626b.description()).setLabelName("shoot_page").setJsonObject(ew.this.f67622b.t()));
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(ew.this.f67622b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                    if (fhVar != null) {
                        r.a("choose_speed_mode", (Map) d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).a("speed_mode", anVar.f74626b.description()).f34114b);
                    }
                }
            };
        }
    }
}
