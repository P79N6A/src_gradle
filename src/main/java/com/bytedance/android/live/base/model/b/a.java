package com.bytedance.android.live.base.model.b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.d;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7698a;
    @SerializedName("id")

    /* renamed from: b  reason: collision with root package name */
    public long f7699b;
    @SerializedName("title")

    /* renamed from: c  reason: collision with root package name */
    public String f7700c;
    @SerializedName("url_list")

    /* renamed from: d  reason: collision with root package name */
    public List<String> f7701d;
    @SerializedName("uri")

    /* renamed from: e  reason: collision with root package name */
    public String f7702e;
    @SerializedName("height")

    /* renamed from: f  reason: collision with root package name */
    public int f7703f;
    @SerializedName("width")
    public int g;
    @SerializedName("schema_url")
    public String h;
    @SerializedName("text")
    public String i;
    @SerializedName("action_type")
    public int j;
    @SerializedName("priority")
    public int k;
    @SerializedName("extra")
    private String l;
    private ImageModel m;

    public long getId() {
        return this.f7699b;
    }

    public final ImageModel a() {
        if (PatchProxy.isSupport(new Object[0], this, f7698a, false, 41, new Class[0], ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, f7698a, false, 41, new Class[0], ImageModel.class);
        }
        if (!(this.m != null || this.f7701d == null || this.f7702e == null)) {
            this.m = new ImageModel(this.f7702e, this.f7701d);
        }
        return this.m;
    }

    public String getMixId() {
        if (!PatchProxy.isSupport(new Object[0], this, f7698a, false, 42, new Class[0], String.class)) {
            return String.valueOf(getId());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f7698a, false, 42, new Class[0], String.class);
    }

    public final boolean a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f7698a, false, 45, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f7698a, false, 45, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        } else if (this == aVar) {
            return true;
        } else {
            if (aVar == null || this.f7699b != aVar.f7699b || !StringUtils.equal(this.f7700c, aVar.f7700c) || !StringUtils.equal(this.f7702e, aVar.f7702e) || !StringUtils.equal(this.h, aVar.h) || !StringUtils.equal(this.i, aVar.i) || this.g != aVar.g || this.f7703f != aVar.f7703f) {
                return false;
            }
            if (this.f7701d == null && aVar.f7701d != null) {
                return false;
            }
            if (this.f7701d != null && aVar.f7701d == null) {
                return false;
            }
            if (this.f7701d == null && aVar.f7701d == null) {
                return true;
            }
            if (this.f7701d.size() != aVar.f7701d.size() || this.j != aVar.j || this.k != aVar.k) {
                return false;
            }
            for (int i2 = 0; i2 < this.f7701d.size(); i2++) {
                if (!StringUtils.equal(this.f7701d.get(i2), aVar.f7701d.get(i2))) {
                    return false;
                }
            }
            if (!StringUtils.equal(this.l, aVar.l)) {
                return false;
            }
            return true;
        }
    }
}
