package com.ss.android.ugc.aweme.opensdk.share.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class DYMediaContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a mMediaObject;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58391a;

        @SuppressLint({"LongLogTag"})
        public static DYMediaContent a(Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, null, f58391a, true, 63417, new Class[]{Bundle.class}, DYMediaContent.class)) {
                return (DYMediaContent) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f58391a, true, 63417, new Class[]{Bundle.class}, DYMediaContent.class);
            }
            DYMediaContent dYMediaContent = new DYMediaContent();
            String string = bundle2.getString("_dyobject_identifier_");
            if (string == null || string.length() <= 0) {
                return dYMediaContent;
            }
            try {
                dYMediaContent.mMediaObject = (a) Class.forName(string).newInstance();
                dYMediaContent.mMediaObject.unserialize(bundle2);
                return dYMediaContent;
            } catch (Exception unused) {
                return dYMediaContent;
            }
        }
    }

    public DYMediaContent() {
    }

    public final boolean checkArgs() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63415, new Class[0], Boolean.TYPE)) {
            return this.mMediaObject.checkArgs();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63415, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int getType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63414, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63414, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mMediaObject == null) {
            return 0;
        } else {
            return this.mMediaObject.type();
        }
    }

    public DYMediaContent(a aVar) {
        this.mMediaObject = aVar;
    }
}
