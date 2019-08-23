package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public class WeiboAppManager {
    private static final String TAG = "com.sina.weibo.sdk.WeiboAppManager";
    private static final Uri WEIBO_NAME_URI = Uri.parse("content://com.sina.weibo.sdkProvider/query/package");
    private static WeiboAppManager sInstance;
    private Context mContext;

    public static class WeiboInfo {
        private String mPackageName;
        private int mSupportApi;

        public String getPackageName() {
            return this.mPackageName;
        }

        public int getSupportApi() {
            return this.mSupportApi;
        }

        public boolean isLegal() {
            if (TextUtils.isEmpty(this.mPackageName) || this.mSupportApi <= 0) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "WeiboInfo: PackageName = " + this.mPackageName + ", supportApi = " + this.mSupportApi;
        }

        public void setPackageName(String str) {
            this.mPackageName = str;
        }

        public void setSupportApi(int i) {
            this.mSupportApi = i;
        }
    }

    public synchronized WeiboInfo getWeiboInfo() {
        return queryWeiboInfoInternal(this.mContext);
    }

    private WeiboAppManager(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static synchronized WeiboAppManager getInstance(Context context) {
        WeiboAppManager weiboAppManager;
        synchronized (WeiboAppManager.class) {
            if (sInstance == null) {
                sInstance = new WeiboAppManager(context);
            }
            weiboAppManager = sInstance;
        }
        return weiboAppManager;
    }

    private WeiboInfo queryWeiboInfoInternal(Context context) {
        boolean z;
        WeiboInfo queryWeiboInfoByProvider = queryWeiboInfoByProvider(context);
        WeiboInfo queryWeiboInfoByAsset = queryWeiboInfoByAsset(context);
        boolean z2 = false;
        if (queryWeiboInfoByProvider != null) {
            z = true;
        } else {
            z = false;
        }
        if (queryWeiboInfoByAsset != null) {
            z2 = true;
        }
        if (!z || !z2) {
            if (z) {
                return queryWeiboInfoByProvider;
            }
            if (z2) {
                return queryWeiboInfoByAsset;
            }
            return null;
        } else if (queryWeiboInfoByProvider.getSupportApi() >= queryWeiboInfoByAsset.getSupportApi()) {
            return queryWeiboInfoByProvider;
        } else {
            return queryWeiboInfoByAsset;
        }
    }

    private WeiboInfo queryWeiboInfoByAsset(Context context) {
        Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
        intent.addCategory("android.intent.category.DEFAULT");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        WeiboInfo weiboInfo = null;
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        for (ResolveInfo next : queryIntentServices) {
            if (!(next.serviceInfo == null || next.serviceInfo.applicationInfo == null || TextUtils.isEmpty(next.serviceInfo.applicationInfo.packageName))) {
                WeiboInfo parseWeiboInfoByAsset = parseWeiboInfoByAsset(next.serviceInfo.applicationInfo.packageName);
                if (parseWeiboInfoByAsset != null && (weiboInfo == null || weiboInfo.getSupportApi() < parseWeiboInfoByAsset.getSupportApi())) {
                    weiboInfo = parseWeiboInfoByAsset;
                }
            }
        }
        return weiboInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r0 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r0 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.sina.weibo.sdk.WeiboAppManager.WeiboInfo queryWeiboInfoByProvider(android.content.Context r8) {
        /*
            r7 = this;
            android.content.ContentResolver r0 = r8.getContentResolver()
            r6 = 0
            android.net.Uri r1 = WEIBO_NAME_URI     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x005d, all -> 0x005a }
            if (r0 != 0) goto L_0x0017
            if (r0 == 0) goto L_0x0016
            r0.close()
        L_0x0016:
            return r6
        L_0x0017:
            java.lang.String r1 = "support_api"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = "package"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ Exception -> 0x0058 }
            boolean r3 = r0.moveToFirst()     // Catch:{ Exception -> 0x0058 }
            if (r3 == 0) goto L_0x0055
            r3 = -1
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0058 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r1 = -1
        L_0x0034:
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x0058 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0058 }
            if (r3 != 0) goto L_0x0055
            boolean r8 = com.sina.weibo.sdk.ApiUtils.validateWeiboSign(r8, r2)     // Catch:{ Exception -> 0x0058 }
            if (r8 == 0) goto L_0x0055
            com.sina.weibo.sdk.WeiboAppManager$WeiboInfo r8 = new com.sina.weibo.sdk.WeiboAppManager$WeiboInfo     // Catch:{ Exception -> 0x0058 }
            r8.<init>()     // Catch:{ Exception -> 0x0058 }
            r8.setPackageName(r2)     // Catch:{ Exception -> 0x0058 }
            r8.setSupportApi(r1)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x0054
            r0.close()
        L_0x0054:
            return r8
        L_0x0055:
            if (r0 == 0) goto L_0x006d
            goto L_0x006a
        L_0x0058:
            r8 = move-exception
            goto L_0x005f
        L_0x005a:
            r8 = move-exception
            r0 = r6
            goto L_0x006f
        L_0x005d:
            r8 = move-exception
            r0 = r6
        L_0x005f:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x006e }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x006e }
            com.sina.weibo.sdk.utils.LogUtil.e(r1, r8)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x006d
        L_0x006a:
            r0.close()
        L_0x006d:
            return r6
        L_0x006e:
            r8 = move-exception
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.close()
        L_0x0074:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.WeiboAppManager.queryWeiboInfoByProvider(android.content.Context):com.sina.weibo.sdk.WeiboAppManager$WeiboInfo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a A[SYNTHETIC, Splitter:B:40:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[SYNTHETIC, Splitter:B:47:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc A[SYNTHETIC, Splitter:B:54:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00df A[SYNTHETIC, Splitter:B:68:0x00df] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x00a0=Splitter:B:44:0x00a0, B:51:0x00b1=Splitter:B:51:0x00b1, B:58:0x00c2=Splitter:B:58:0x00c2, B:37:0x008f=Splitter:B:37:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sina.weibo.sdk.WeiboAppManager.WeiboInfo parseWeiboInfoByAsset(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = r8.mContext     // Catch:{ NameNotFoundException -> 0x00c0, IOException -> 0x00af, JSONException -> 0x009e, Exception -> 0x008d, all -> 0x008a }
            r2 = 2
            android.content.Context r0 = r0.createPackageContext(r9, r2)     // Catch:{ NameNotFoundException -> 0x00c0, IOException -> 0x00af, JSONException -> 0x009e, Exception -> 0x008d, all -> 0x008a }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r2]     // Catch:{ NameNotFoundException -> 0x00c0, IOException -> 0x00af, JSONException -> 0x009e, Exception -> 0x008d, all -> 0x008a }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ NameNotFoundException -> 0x00c0, IOException -> 0x00af, JSONException -> 0x009e, Exception -> 0x008d, all -> 0x008a }
            java.lang.String r4 = "weibo_for_sdk.json"
            java.io.InputStream r0 = r0.open(r4)     // Catch:{ NameNotFoundException -> 0x00c0, IOException -> 0x00af, JSONException -> 0x009e, Exception -> 0x008d, all -> 0x008a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
        L_0x0022:
            r5 = 0
            int r6 = r0.read(r3, r5, r2)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r7 = -1
            if (r6 != r7) goto L_0x0079
            java.lang.String r2 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            if (r2 != 0) goto L_0x0068
            android.content.Context r2 = r8.mContext     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            boolean r2 = com.sina.weibo.sdk.ApiUtils.validateWeiboSign(r2, r9)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            if (r2 != 0) goto L_0x003d
            goto L_0x0068
        L_0x003d:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            java.lang.String r3 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r2.<init>(r3)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            java.lang.String r3 = "support_api"
            int r2 = r2.optInt(r3, r7)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            com.sina.weibo.sdk.WeiboAppManager$WeiboInfo r3 = new com.sina.weibo.sdk.WeiboAppManager$WeiboInfo     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r3.setPackageName(r9)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r3.setSupportApi(r2)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x0067
        L_0x005d:
            r9 = move-exception
            java.lang.String r0 = TAG
            java.lang.String r9 = r9.getMessage()
            com.sina.weibo.sdk.utils.LogUtil.e(r0, r9)
        L_0x0067:
            return r3
        L_0x0068:
            if (r0 == 0) goto L_0x0078
            r0.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0078
        L_0x006e:
            r9 = move-exception
            java.lang.String r0 = TAG
            java.lang.String r9 = r9.getMessage()
            com.sina.weibo.sdk.utils.LogUtil.e(r0, r9)
        L_0x0078:
            return r1
        L_0x0079:
            java.lang.String r7 = new java.lang.String     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r7.<init>(r3, r5, r6)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            r4.append(r7)     // Catch:{ NameNotFoundException -> 0x0088, IOException -> 0x0086, JSONException -> 0x0084, Exception -> 0x0082 }
            goto L_0x0022
        L_0x0082:
            r9 = move-exception
            goto L_0x008f
        L_0x0084:
            r9 = move-exception
            goto L_0x00a0
        L_0x0086:
            r9 = move-exception
            goto L_0x00b1
        L_0x0088:
            r9 = move-exception
            goto L_0x00c2
        L_0x008a:
            r9 = move-exception
            r0 = r1
            goto L_0x00dd
        L_0x008d:
            r9 = move-exception
            r0 = r1
        L_0x008f:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00dc }
            com.sina.weibo.sdk.utils.LogUtil.e(r2, r9)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00db
            r0.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00db
        L_0x009e:
            r9 = move-exception
            r0 = r1
        L_0x00a0:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00dc }
            com.sina.weibo.sdk.utils.LogUtil.e(r2, r9)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00db
            r0.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00db
        L_0x00af:
            r9 = move-exception
            r0 = r1
        L_0x00b1:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00dc }
            com.sina.weibo.sdk.utils.LogUtil.e(r2, r9)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00db
            r0.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00db
        L_0x00c0:
            r9 = move-exception
            r0 = r1
        L_0x00c2:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00dc }
            com.sina.weibo.sdk.utils.LogUtil.e(r2, r9)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00db
            r0.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00db
        L_0x00d1:
            r9 = move-exception
            java.lang.String r0 = TAG
            java.lang.String r9 = r9.getMessage()
            com.sina.weibo.sdk.utils.LogUtil.e(r0, r9)
        L_0x00db:
            return r1
        L_0x00dc:
            r9 = move-exception
        L_0x00dd:
            if (r0 == 0) goto L_0x00ed
            r0.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00ed
        L_0x00e3:
            r0 = move-exception
            java.lang.String r1 = TAG
            java.lang.String r0 = r0.getMessage()
            com.sina.weibo.sdk.utils.LogUtil.e(r1, r0)
        L_0x00ed:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.WeiboAppManager.parseWeiboInfoByAsset(java.lang.String):com.sina.weibo.sdk.WeiboAppManager$WeiboInfo");
    }
}
