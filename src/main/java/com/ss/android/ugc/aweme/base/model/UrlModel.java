package com.ss.android.ugc.aweme.base.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.a.c;
import com.ss.android.ugc.aweme.base.api.b;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

@Keep
public class UrlModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("file_hash")
    public String fileHash;
    @SerializedName("height")
    public int height;
    @SerializedName("data_size")
    public long size;
    @SerializedName("uri")
    public String uri;
    @SerializedName("url_key")
    public String urlKey;
    @SerializedName("url_list")
    public List<String> urlList;
    @SerializedName("width")
    public int width;

    public String getFileHash() {
        return this.fileHash;
    }

    public int getHeight() {
        return this.height;
    }

    public long getSize() {
        return this.size;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrlKey() {
        return this.urlKey;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str;
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24666, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24666, new Class[0], Integer.TYPE)).intValue();
        }
        if (TextUtils.isEmpty(this.urlKey)) {
            str = this.uri;
        } else {
            str = this.urlKey;
        }
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.urlList != null) {
            i2 = this.urlList.hashCode();
        }
        return i3 + i2;
    }

    public void setFileHash(String str) {
        this.fileHash = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlKey(String str) {
        this.urlKey = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static String toJsonString(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, changeQuickRedirect, true, 24667, new Class[]{UrlModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{urlModel}, null, changeQuickRedirect, true, 24667, new Class[]{UrlModel.class}, String.class);
        } else if (urlModel == null) {
            return "";
        } else {
            return JSON.toJSONString(urlModel);
        }
    }

    @Nullable
    public static UrlModel fromJson(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, null, changeQuickRedirect, true, 24668, new Class[]{JSONObject.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, changeQuickRedirect, true, 24668, new Class[]{JSONObject.class}, UrlModel.class);
        }
        try {
            return (UrlModel) b.a(jSONObject.toString(), UrlModel.class);
        } catch (c unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 24665, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 24665, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof UrlModel)) {
                return false;
            }
            UrlModel urlModel = (UrlModel) obj;
            if (this.uri == null ? urlModel.uri != null : !this.uri.equals(urlModel.uri)) {
                return false;
            }
            if (this.urlKey == null ? urlModel.urlKey != null : !this.urlKey.equals(urlModel.urlKey)) {
                return false;
            }
            if (this.urlList != null) {
                return this.urlList.equals(urlModel.urlList);
            }
            if (urlModel.urlList == null) {
                return true;
            }
            return false;
        }
    }
}
