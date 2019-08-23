package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.port.in.a;
import java.io.Serializable;

public class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public c mInteractStickerContext;
    private w mShareContext;

    public c getInteractStickerContext() {
        return this.mInteractStickerContext;
    }

    public w getShareContext() {
        return this.mShareContext;
    }

    public String toBusinessData() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76909, new Class[0], String.class)) {
            return a.D.getRetrofitFactoryGson().toJson((Object) this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76909, new Class[0], String.class);
    }

    public void setInteractStickerContext(c cVar) {
        this.mInteractStickerContext = cVar;
    }

    public void setShareContext(w wVar) {
        this.mShareContext = wVar;
    }

    public static String getShareContext(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 76911, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 76911, new Class[]{String.class}, String.class);
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            e eVar = (e) a.D.getRetrofitFactoryGson().fromJson(str2, e.class);
            if (eVar == null || eVar.getShareContext() == null) {
                return null;
            }
            return a.D.getRetrofitFactoryGson().toJson((Object) eVar.getShareContext());
        }
    }

    public static String updateSDKShareContextWhenSaveOrPost(boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, null, changeQuickRedirect, true, 76910, new Class[]{Boolean.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, null, changeQuickRedirect, true, 76910, new Class[]{Boolean.TYPE, String.class}, String.class);
        } else if (com.ss.android.g.a.a() || StringUtils.isEmpty(str)) {
            return str2;
        } else {
            e eVar = (e) a.D.getRetrofitFactoryGson().fromJson(str2, e.class);
            if (eVar == null || eVar.getShareContext() == null) {
                return str2;
            }
            if (z) {
                eVar.getShareContext().mNeedShowDialog = false;
            }
            return a.D.getRetrofitFactoryGson().toJson((Object) eVar);
        }
    }
}
