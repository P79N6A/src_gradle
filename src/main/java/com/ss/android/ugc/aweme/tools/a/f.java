package com.ss.android.ugc.aweme.tools.a;

import com.meituan.robust.ChangeQuickRedirect;

public enum f {
    MAIN_BUSINESS("main_business_data_in_tools_line"),
    SOCIAL("social_data_in_tools_line"),
    POI("poi_data_in_tools_line"),
    COMMERCE("commerce_data_in_tools_line"),
    UG("ug_data_in_tools_line"),
    TECH("tech_data_in_tools_line"),
    GLOBAL("global_data_in_tools_line");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String intentKey;

    private f(String str) {
        this.intentKey = str;
    }
}
