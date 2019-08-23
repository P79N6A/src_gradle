package com.ss.android.ugc.aweme.theme.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class Theme extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("theme_package")
    private ThemePackage mThemePackage;
    @SerializedName("theme_status")
    private int status;

    public int getStatus() {
        return this.status;
    }

    public ThemePackage getThemePackage() {
        return this.mThemePackage;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setThemePackage(ThemePackage themePackage) {
        this.mThemePackage = themePackage;
    }
}
