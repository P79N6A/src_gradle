package com.ss.android.ugc.aweme.poi.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.model.o;
import java.util.ArrayList;
import java.util.List;

public class e extends BaseResponse implements h, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59393a;
    @SerializedName("has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f59394b;
    @SerializedName("comment_list")

    /* renamed from: c  reason: collision with root package name */
    public List<o> f59395c;
    @SerializedName("comment_url")

    /* renamed from: d  reason: collision with root package name */
    public String f59396d;
    @SerializedName("page")

    /* renamed from: e  reason: collision with root package name */
    public long f59397e;

    /* renamed from: f  reason: collision with root package name */
    private String f59398f;

    public String getRequestId() {
        return this.f59398f;
    }

    /* renamed from: a */
    public final e clone() {
        if (PatchProxy.isSupport(new Object[0], this, f59393a, false, 64934, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f59393a, false, 64934, new Class[0], e.class);
        }
        try {
            e eVar = (e) super.clone();
            eVar.f59394b = this.f59394b;
            eVar.f59395c = (ArrayList) ((ArrayList) this.f59395c).clone();
            eVar.f59397e = this.f59397e;
            eVar.f59396d = this.f59396d;
            return eVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f59393a, false, 64935, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f59393a, false, 64935, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f59398f = str;
        for (o requestId : this.f59395c) {
            requestId.setRequestId(str);
        }
    }
}
