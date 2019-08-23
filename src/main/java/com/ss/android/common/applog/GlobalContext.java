package com.ss.android.common.applog;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;

public class GlobalContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context mContext;

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context context) {
        mContext = context;
    }
}
