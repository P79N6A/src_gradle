package com.tencent.mm.opensdk.utils;

import android.net.Uri;
import android.provider.BaseColumns;

public final class c {

    public static final class a {
        public static Object a(int i, String str) {
            switch (i) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    try {
                        return Double.valueOf(str);
                    } catch (Exception e2) {
                        Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e2.getMessage());
                        break;
                    }
                default:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    break;
            }
            return null;
        }
    }

    public static final class b implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
    }
}
