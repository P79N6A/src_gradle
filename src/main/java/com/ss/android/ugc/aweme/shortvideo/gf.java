package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class gf implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67915a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67916b;

    public gf(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67916b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f67915a, false, 74729, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f67915a, false, 74729, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type != ax.class) {
            return null;
        } else {
            final bg a2 = bdVar.a((bh) this, type);
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67917a;

                public final void a(Object obj, T t) {
                    Object obj2 = obj;
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{obj2, t2}, this, f67917a, false, 74730, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj2, t2}, this, f67917a, false, 74730, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (a2 != null) {
                        a2.a(obj2, t2);
                    }
                    StickerModule stickerModule = ((VideoRecordNewActivity) gf.this.f67916b.getActivity()).k;
                    if (PatchProxy.isSupport(new Object[]{(byte) 1}, stickerModule, StickerModule.f3976a, false, 78715, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        StickerModule stickerModule2 = stickerModule;
                        PatchProxy.accessDispatch(new Object[]{(byte) 1}, stickerModule2, StickerModule.f3976a, false, 78715, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    RemoteImageView a2 = stickerModule.m.a();
                    if (a2 != null) {
                        a2.setEnabled(true);
                        a2.setAlpha(1.0f);
                    }
                }
            };
        }
    }
}
