package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70095a;

    public static boolean a(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f70095a, true, 79363, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f70095a, true, 79363, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect.getTags().contains("poisticker")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean b(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f70095a, true, 79364, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f70095a, true, 79364, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect.getTags().contains("pollsticker")) {
            return true;
        } else {
            return false;
        }
    }
}
