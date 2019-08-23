package com.ss.android.ugc.aweme.discover.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public class SameCityModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String sImageUrl;
    public boolean isHaveBanner;
    public UrlModel mCover;

    public static SameCityModel getModel() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 37073, new Class[0], SameCityModel.class)) {
            return (SameCityModel) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 37073, new Class[0], SameCityModel.class);
        }
        SameCityModel sameCityModel = new SameCityModel();
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(sImageUrl);
        arrayList.add(sImageUrl);
        arrayList.add(sImageUrl);
        urlModel.setUrlList(arrayList);
        sameCityModel.mCover = urlModel;
        return sameCityModel;
    }
}
