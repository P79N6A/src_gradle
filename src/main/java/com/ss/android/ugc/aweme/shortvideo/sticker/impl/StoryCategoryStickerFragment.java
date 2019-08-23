package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/impl/StoryCategoryStickerFragment;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/impl/CategoryStickerFragment;", "()V", "getFirstCategoryFragementIndex", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryCategoryStickerFragment extends CategoryStickerFragment {
    public static ChangeQuickRedirect p;
    private HashMap q;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, p, false, 79229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 79229, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.clear();
        }
    }
}
