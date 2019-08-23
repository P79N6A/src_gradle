package com.ss.android.ugc.aweme.im.sdk.resources.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor.a.b;
import com.ss.android.ugc.aweme.im.sdk.utils.w;
import com.ss.android.ugc.aweme.im.sdk.utils.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("animate_type")
    private String animateType;
    @SerializedName("animate_url")
    private UrlModel animateUrl;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("display_name_lang")
    private HashMap<String, String> displayNameLangs;
    @SerializedName("height")
    private int height;
    @SerializedName("id")
    private long id;
    @SerializedName("origin_package_id")
    private long resourcesId;
    @SerializedName("static_type")
    private String staticType;
    @SerializedName("static_url")
    private UrlModel staticUrl;
    @SerializedName("sticker_type")
    private int stickerType;
    @SerializedName("version")
    private String version;
    @SerializedName("width")
    private int width;

    public String getAnimateType() {
        return this.animateType;
    }

    public UrlModel getAnimateUrl() {
        return this.animateUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public HashMap<String, String> getDisplayNameLangs() {
        return this.displayNameLangs;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.id;
    }

    public long getResourcesId() {
        return this.resourcesId;
    }

    public String getStaticType() {
        return this.staticType;
    }

    public UrlModel getStaticUrl() {
        return this.staticUrl;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public String getEnDisplayName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53162, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53162, new Class[0], String.class);
        } else if (this.displayNameLangs != null) {
            return this.displayNameLangs.get(Locale.ENGLISH.getLanguage());
        } else {
            return "";
        }
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53166, new Class[0], Integer.TYPE)) {
            return String.valueOf(this.id).hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53166, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean isAnimate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53164, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53164, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (w.d(this.animateType) || w.e(this.animateType)) {
            return true;
        } else {
            return false;
        }
    }

    public String getRealDisplayName() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53163, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53163, new Class[0], String.class);
        } else if (getStickerType() == 2) {
            return "";
        } else {
            if (PatchProxy.isSupport(new Object[0], null, y.f52669a, true, 53548, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, y.f52669a, true, 53548, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = TextUtils.equals(Locale.ENGLISH.getLanguage(), y.b());
            }
            if (z) {
                String enDisplayName = getEnDisplayName();
                if (!TextUtils.isEmpty(enDisplayName)) {
                    return enDisplayName;
                }
            } else if (TextUtils.isEmpty(this.displayName)) {
                return getEnDisplayName();
            }
            return this.displayName;
        }
    }

    public void setAnimateType(String str) {
        this.animateType = str;
    }

    public void setAnimateUrl(UrlModel urlModel) {
        this.animateUrl = urlModel;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDisplayNameLangs(HashMap<String, String> hashMap) {
        this.displayNameLangs = hashMap;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setResourcesId(long j) {
        this.resourcesId = j;
    }

    public void setStaticType(String str) {
        this.staticType = str;
    }

    public void setStaticUrl(UrlModel urlModel) {
        this.staticUrl = urlModel;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a) || this.id != ((a) obj).id) {
            return false;
        }
        return true;
    }

    public a obtain(b bVar) {
        int i;
        Object obj;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 53165, new Class[]{b.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 53165, new Class[]{b.class}, a.class);
        }
        a aVar = new a();
        aVar.setAnimateType("gif");
        int i2 = -1;
        if (bVar2.f50629c == null || bVar2.f50629c.length != 2) {
            i = -1;
        } else {
            i = bVar2.f50629c[0];
        }
        aVar.setWidth(i);
        if (bVar2.f50629c != null && bVar2.f50629c.length == 2) {
            i2 = bVar2.f50629c[1];
        }
        aVar.setHeight(i2);
        aVar.setStickerType(3);
        if (GlobalContext.getContext() != null) {
            aVar.setDisplayName(GlobalContext.getContext().getString(C0906R.string.auy));
        }
        ArrayList arrayList = new ArrayList();
        if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor.a.a.f50627a, false, 50919, new Class[0], String.class)) {
            obj = PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor.a.a.f50627a, false, 50919, new Class[0], String.class);
        } else {
            obj = bVar2.f50628b;
            if (PatchProxy.isSupport(new Object[]{obj}, null, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor.constant.a.f50630a, true, 50918, new Class[]{String.class}, String.class)) {
                obj = PatchProxy.accessDispatch(new Object[]{obj}, null, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor.constant.a.f50630a, true, 50918, new Class[]{String.class}, String.class);
            } else if (obj == null) {
                obj = "";
            }
        }
        String str = (String) obj;
        arrayList.add(str);
        UrlModel urlModel = new UrlModel();
        aVar.setAnimateUrl(urlModel);
        urlModel.setUrlList(arrayList);
        urlModel.setUri(str);
        return aVar;
    }
}
