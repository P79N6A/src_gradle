package com.ss.android.ugc.aweme.favorites.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

public class b {
    @SerializedName("ch_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Challenge> f44296a;
    @SerializedName("cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f44297b;
    @SerializedName("has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f44298c;

    public final boolean a() {
        if (this.f44298c == 1) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.f44298c = z ? 1 : 0;
    }
}
