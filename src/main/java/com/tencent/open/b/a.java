package com.tencent.open.b;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.tencent.open.a.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    protected static final Uri f79680a = Uri.parse("content://telephony/carriers/preferapn");

    public static String c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "MOBILE";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getTypeName();
        }
        return "MOBILE";
    }

    public static String a(Context context) {
        int e2 = e(context);
        if (e2 == 2) {
            return "wifi";
        }
        if (e2 == 1) {
            return "cmwap";
        }
        if (e2 == 4) {
            return "cmnet";
        }
        if (e2 == 16) {
            return "uniwap";
        }
        if (e2 == 8) {
            return "uninet";
        }
        if (e2 == 64) {
            return "wap";
        }
        if (e2 == 32) {
            return "net";
        }
        if (e2 == 512) {
            return "ctwap";
        }
        if (e2 == 256) {
            return "ctnet";
        }
        if (e2 == 2048) {
            return "3gnet";
        }
        if (e2 == 1024) {
            return "3gwap";
        }
        String b2 = b(context);
        if (b2 == null || b2.length() == 0) {
            return "none";
        }
        return b2;
    }

    public static String b(Context context) {
        try {
            Cursor query = context.getContentResolver().query(f79680a, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            String string = query.getString(query.getColumnIndex("apn"));
            if (query != null) {
                query.close();
            }
            return string;
        } catch (SecurityException e2) {
            f.e("openSDK_LOG.APNUtil", "getApn has exception: " + e2.getMessage());
            return "";
        } catch (Exception e3) {
            f.e("openSDK_LOG.APNUtil", "getApn has exception: " + e3.getMessage());
            return "";
        }
    }

    private static String d(Context context) {
        try {
            Cursor query = context.getContentResolver().query(f79680a, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            String string = query.getString(query.getColumnIndex("proxy"));
            if (query != null) {
                query.close();
            }
            return string;
        } catch (SecurityException e2) {
            f.e("openSDK_LOG.APNUtil", "getApnProxy has exception: " + e2.getMessage());
            return "";
        }
    }

    private static int e(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return SearchJediMixFeedAdapter.f42517f;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return SearchJediMixFeedAdapter.f42517f;
            }
            if (activeNetworkInfo.getTypeName().toUpperCase().equals("WIFI")) {
                return 2;
            }
            String lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase();
            if (lowerCase.startsWith("cmwap")) {
                return 1;
            }
            if (!lowerCase.startsWith("cmnet")) {
                if (!lowerCase.startsWith("epc.tmobile.com")) {
                    if (lowerCase.startsWith("uniwap")) {
                        return 16;
                    }
                    if (lowerCase.startsWith("uninet")) {
                        return 8;
                    }
                    if (lowerCase.startsWith("wap")) {
                        return 64;
                    }
                    if (lowerCase.startsWith("net")) {
                        return 32;
                    }
                    if (lowerCase.startsWith("ctwap")) {
                        return 512;
                    }
                    if (lowerCase.startsWith("ctnet")) {
                        return 256;
                    }
                    if (lowerCase.startsWith("3gwap")) {
                        return 1024;
                    }
                    if (lowerCase.startsWith("3gnet")) {
                        return 2048;
                    }
                    if (lowerCase.startsWith("#777")) {
                        String d2 = d(context);
                        if (d2 == null || d2.length() <= 0) {
                            return 256;
                        }
                        return 512;
                    }
                    return SearchJediMixFeedAdapter.f42517f;
                }
            }
            return 4;
        } catch (Exception e2) {
            f.e("openSDK_LOG.APNUtil", "getMProxyType has exception: " + e2.getMessage());
        }
    }
}
