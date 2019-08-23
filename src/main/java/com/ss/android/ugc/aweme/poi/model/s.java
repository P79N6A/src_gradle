package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import java.util.List;

public class s extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59942a;
    @SerializedName("banner_list")

    /* renamed from: b  reason: collision with root package name */
    public List<PoiClassRankBannerStruct> f59943b;

    public final int a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59942a, false, 65034, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59942a, false, 65034, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f59943b != null) {
            i = this.f59943b.size();
        }
        return i;
    }
}
