package com.ss.android.ugc.aweme.sdk;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;

public class DefaultWalletMainProxy implements IWalletMainProxy {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean enableShoppingTotal() {
        return false;
    }

    public int getDiamondType() {
        return 0;
    }

    public String getHost() {
        return "aweme.snssdk.com";
    }

    public String getIapKey() {
        return "";
    }

    public String getSchema(String str) {
        return "";
    }

    public void openSchema(Context context, String str) {
    }
}
