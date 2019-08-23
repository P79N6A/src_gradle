package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69652a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryStickerFragment f69653b;

    b(CategoryStickerFragment categoryStickerFragment) {
        this.f69653b = categoryStickerFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f69652a, false, 79100, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f69652a, false, 79100, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CategoryStickerFragment categoryStickerFragment = this.f69653b;
        List<String> list = (List) obj;
        if (categoryStickerFragment.getActivity() instanceof VideoRecordNewActivity) {
            ((VideoRecordNewActivity) categoryStickerFragment.getActivity()).X = list;
        }
        if (!j.a((Collection<T>) list)) {
            a aVar = a.f69354f;
            if (PatchProxy.isSupport(new Object[]{list}, aVar, a.f69349a, false, 78896, new Class[]{List.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{list}, aVar2, a.f69349a, false, 78896, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            a.f69350b = list;
        }
    }
}
