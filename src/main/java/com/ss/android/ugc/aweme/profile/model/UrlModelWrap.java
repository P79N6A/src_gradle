package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

@Keep
public class UrlModelWrap implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int position;
    private UrlModel urlModel;

    public int getPosition() {
        return this.position;
    }

    public UrlModel getUrlModel() {
        return this.urlModel;
    }

    public String toJsonString() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67508, new Class[0], String.class)) {
            return new Gson().toJson((Object) this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67508, new Class[0], String.class);
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setUrlModel(UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    @Nullable
    public static UrlModelWrap fromJson(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 67509, new Class[]{String.class}, UrlModelWrap.class)) {
            return (UrlModelWrap) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 67509, new Class[]{String.class}, UrlModelWrap.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return (UrlModelWrap) new Gson().fromJson(str2, UrlModelWrap.class);
        }
    }

    public UrlModelWrap(int i, UrlModel urlModel2) {
        this.position = i;
        this.urlModel = urlModel2;
    }
}
