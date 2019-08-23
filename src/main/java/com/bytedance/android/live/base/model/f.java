package com.bytedance.android.live.base.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7709a;
    @SerializedName("uri")

    /* renamed from: b  reason: collision with root package name */
    public String f7710b;
    @SerializedName("url_list")

    /* renamed from: c  reason: collision with root package name */
    public List<String> f7711c;

    public final ImageModel a() {
        if (!PatchProxy.isSupport(new Object[0], this, f7709a, false, 36, new Class[0], ImageModel.class)) {
            return new ImageModel(this.f7710b, this.f7711c);
        }
        return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, f7709a, false, 36, new Class[0], ImageModel.class);
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f7709a, false, 35, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f7709a, false, 35, new Class[0], String.class);
        }
        return "UrlStruct{uri='" + this.f7710b + '\'' + ", urlList=" + this.f7711c + '}';
    }
}
