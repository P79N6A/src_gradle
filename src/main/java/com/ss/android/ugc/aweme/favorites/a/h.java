package com.ss.android.ugc.aweme.favorites.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.sticker.model.d;
import java.util.List;

public class h {
    @SerializedName("sticker_list")

    /* renamed from: a  reason: collision with root package name */
    public List<d> f44217a;
    @SerializedName("cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f44218b;
    @SerializedName("has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f44219c;

    public final boolean a() {
        if (this.f44219c == 1) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.f44219c = z ? 1 : 0;
    }
}
