package com.ss.android.ugc.aweme.opensdk.share.base;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class TikTokMediaContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a mMediaObject;

    public TikTokMediaContent() {
    }

    public final boolean checkArgs() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63423, new Class[0], Boolean.TYPE)) {
            return this.mMediaObject.checkArgs();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63423, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int getType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63422, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63422, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mMediaObject == null) {
            return 0;
        } else {
            return this.mMediaObject.type();
        }
    }

    public TikTokMediaContent(a aVar) {
        this.mMediaObject = aVar;
    }
}
