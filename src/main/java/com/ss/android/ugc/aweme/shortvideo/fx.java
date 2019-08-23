package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.as;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.o;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import com.ss.android.ugc.gamora.recorder.RecordViewModel;
import java.lang.reflect.Type;

public final class fx implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67817a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67818b;

    /* renamed from: c  reason: collision with root package name */
    public RecordToolbarViewModel f67819c;

    /* renamed from: d  reason: collision with root package name */
    public RecordViewModel f67820d;

    public fx(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67818b = shortVideoRecordingOperationPanelFragment;
    }

    public final FaceStickerBean a(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        if (PatchProxy.isSupport(new Object[]{shortVideoRecordingOperationPanelFragment}, this, f67817a, false, 74709, new Class[]{ShortVideoRecordingOperationPanelFragment.class}, FaceStickerBean.class)) {
            return (FaceStickerBean) PatchProxy.accessDispatch(new Object[]{shortVideoRecordingOperationPanelFragment}, this, f67817a, false, 74709, new Class[]{ShortVideoRecordingOperationPanelFragment.class}, FaceStickerBean.class);
        } else if (shortVideoRecordingOperationPanelFragment.getActivity() instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) shortVideoRecordingOperationPanelFragment.getActivity()).k.g;
        } else {
            return FaceStickerBean.NONE;
        }
    }

    public final String b(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        if (PatchProxy.isSupport(new Object[]{shortVideoRecordingOperationPanelFragment}, this, f67817a, false, 74710, new Class[]{ShortVideoRecordingOperationPanelFragment.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{shortVideoRecordingOperationPanelFragment}, this, f67817a, false, 74710, new Class[]{ShortVideoRecordingOperationPanelFragment.class}, String.class);
        } else if (shortVideoRecordingOperationPanelFragment.getActivity() instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) shortVideoRecordingOperationPanelFragment.getActivity()).j();
        } else {
            return "";
        }
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67817a, false, 74708, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67817a, false, 74708, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != as.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67821a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67821a, false, 74711, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67821a, false, 74711, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    as asVar = (as) t;
                    if (fx.this.f67820d == null) {
                        fx.this.f67820d = (RecordViewModel) ViewModelProviders.of(fx.this.f67818b.getActivity()).get(RecordViewModel.class);
                    }
                    if (fx.this.f67819c == null) {
                        fx.this.f67819c = (RecordToolbarViewModel) ViewModelProviders.of(fx.this.f67818b.getActivity()).get(RecordToolbarViewModel.class);
                    }
                    fx.this.f67820d.f77632b.setValue(Integer.valueOf(asVar.f74631b));
                    if (asVar.f74631b != 0 || a.L.a(e.a.SpeedPanelOpen)) {
                        if (asVar.f74631b == 8 && a.L.a(e.a.SpeedPanelOpen)) {
                            fx.this.f67818b.k().a(obj, (bc) new o(0, fx.this.a(fx.this.f67818b), fx.this.b(fx.this.f67818b)));
                            fx.this.f67819c.h.setValue(8);
                            a.L.a(e.a.SpeedPanelOpen, false);
                        }
                        return;
                    }
                    fx.this.f67818b.k().a(obj, (bc) new o(8, fx.this.a(fx.this.f67818b), fx.this.b(fx.this.f67818b)));
                    fx.this.f67819c.h.setValue(0);
                    a.L.a(e.a.SpeedPanelOpen, true);
                }
            };
        }
    }
}
