package com.ss.android.ugc.aweme.poi.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public enum aw {
    POI_TYPE_OTHER,
    POI_TYPE_SPORTS,
    POI_TYPE_ENTERTAINMENT,
    POI_TYPE_SHOP,
    POI_TYPE_LIFE,
    POI_TYPE_HOSPITAL,
    POI_TYPE_HOTEL,
    POI_TYPE_SCENERY,
    POI_TYPE_HOUSE,
    POI_TYPE_SCHOOL,
    POI_TYPE_TRAFFIC,
    POI_TYPE_RESTAURANT,
    POI_TYPE_CITY,
    POI_TYPE_CAR;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static aw getPoiType(int i) {
        switch (i) {
            case 2:
                return POI_TYPE_SPORTS;
            case 3:
                return POI_TYPE_ENTERTAINMENT;
            case 4:
                return POI_TYPE_SHOP;
            case 5:
                return POI_TYPE_LIFE;
            case 6:
                return POI_TYPE_HOSPITAL;
            case e.l:
                return POI_TYPE_HOTEL;
            case 8:
                return POI_TYPE_SCENERY;
            case 9:
                return POI_TYPE_HOUSE;
            case 10:
                return POI_TYPE_SCHOOL;
            case 11:
                return POI_TYPE_TRAFFIC;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return POI_TYPE_RESTAURANT;
            case 13:
                return POI_TYPE_CITY;
            case 14:
                return POI_TYPE_CAR;
            default:
                return POI_TYPE_OTHER;
        }
    }
}
