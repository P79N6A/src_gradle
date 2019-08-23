package com.ss.android.ugc.aweme.favorites.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.List;

public class c {
    @SerializedName("poi_list")

    /* renamed from: a  reason: collision with root package name */
    public List<PoiStruct> f44299a;
    @SerializedName("cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f44300b;
    @SerializedName("has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f44301c;

    public final boolean a() {
        if (this.f44301c == 1) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.f44301c = z ? 1 : 0;
    }
}
