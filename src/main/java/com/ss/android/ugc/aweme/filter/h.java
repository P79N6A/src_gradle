package com.ss.android.ugc.aweme.filter;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.bb;
import java.util.ArrayList;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47597a;
    @SerializedName("id")

    /* renamed from: b  reason: collision with root package name */
    public int f47598b;
    @SerializedName("name")

    /* renamed from: c  reason: collision with root package name */
    public String f47599c;
    @SerializedName("en_name")

    /* renamed from: d  reason: collision with root package name */
    public String f47600d;
    @SerializedName("resource")

    /* renamed from: e  reason: collision with root package name */
    public bb f47601e;

    /* renamed from: f  reason: collision with root package name */
    public int f47602f;
    public Uri g;
    public String h;
    public String i;
    public String j;
    public List<String> k;

    public int hashCode() {
        return this.f47598b;
    }

    @NonNull
    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f47597a, false, 44079, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f47597a, false, 44079, new Class[0], List.class);
        } else if (this.k == null || this.k.isEmpty()) {
            return new ArrayList();
        } else {
            return this.k;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f47598b == ((h) obj).f47598b) {
            return true;
        }
        return false;
    }
}
