package com.ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

@Keep
public class TikTokImageObject implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<String> mImagePaths;

    public boolean checkArgs() {
        return true;
    }

    public int type() {
        return 2;
    }

    public TikTokImageObject() {
    }

    public TikTokImageObject(ArrayList<String> arrayList) {
        this.mImagePaths = new ArrayList<>();
        this.mImagePaths.addAll(arrayList);
    }

    public void serialize(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 63420, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 63420, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle2.putStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePaths);
    }

    public void unserialize(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 63421, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 63421, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.mImagePaths = bundle2.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
    }
}
