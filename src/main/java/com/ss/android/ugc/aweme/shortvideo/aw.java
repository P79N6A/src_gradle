package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ae;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.q;
import com.ss.android.ugc.gamora.recorder.RecordViewModel;
import java.lang.reflect.Type;

public final class aw implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65753a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f65754b;

    /* renamed from: c  reason: collision with root package name */
    public RecordViewModel f65755c;

    public aw(VideoRecordNewActivity videoRecordNewActivity) {
        this.f65754b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65753a, false, 74056, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65753a, false, 74056, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != q.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65756a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65756a, false, 74057, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65756a, false, 74057, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (aw.this.f65755c == null) {
                        aw.this.f65755c = (RecordViewModel) ViewModelProviders.of((FragmentActivity) aw.this.f65754b).get(RecordViewModel.class);
                    }
                    aw.this.f65755c.f77635e.setValue(Boolean.TRUE);
                    aw.this.f65754b.z.a((Object) this, (bc) new ae(aw.this.f65754b.o, 0));
                    r.onEvent(MobClick.obtain().setEventName("music_edit").setLabelName("shoot_page").setJsonObject(aw.this.f65754b.i()));
                }
            };
        }
    }
}
