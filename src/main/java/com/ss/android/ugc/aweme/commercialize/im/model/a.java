package com.ss.android.ugc.aweme.commercialize.im.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.text.DecimalFormat;

public final class a implements Serializable {
    public static final DecimalFormat GPS_FMT = new DecimalFormat("##0.000000");
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ext")
    public String ext = "";
    @SerializedName("location")
    public String location = "";

    public final void setLoc(com.ss.android.ugc.aweme.poi.a aVar) {
        com.ss.android.ugc.aweme.poi.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 30842, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 30842, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            this.location = GPS_FMT.format(aVar2.longitude) + "," + GPS_FMT.format(aVar2.latitude);
        }
    }
}
