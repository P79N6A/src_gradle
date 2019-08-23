package com.ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

@Keep
public class TikTokVideoObject implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<String> mVideoPaths;

    public boolean checkArgs() {
        return true;
    }

    public int type() {
        return 3;
    }

    public void serialize(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 63426, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 63426, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle2.putStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH", this.mVideoPaths);
    }

    public void unserialize(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 63427, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 63427, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.mVideoPaths = bundle2.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
    }
}