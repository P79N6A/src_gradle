package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MusicObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.VideoObject;
import com.sina.weibo.sdk.api.VoiceObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.api.share.BaseRequest;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.utils.MD5;
import com.sina.weibo.sdk.utils.Utility;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareRequestParam extends BrowserRequestParamBase {
    private String mAppKey;
    private String mAppPackage;
    private WeiboAuthListener mAuthListener;
    private String mAuthListenerKey;
    private byte[] mBase64ImgData;
    private BaseRequest mBaseRequest;
    private String mHashKey;
    private String mShareContent;
    private String mToken;

    public static class UploadPicResult {
        private int code = -2;
        private String picId;

        public int getCode() {
            return this.code;
        }

        public String getPicId() {
            return this.picId;
        }

        private UploadPicResult() {
        }

        public static UploadPicResult parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            UploadPicResult uploadPicResult = new UploadPicResult();
            try {
                JSONObject jSONObject = new JSONObject(str);
                uploadPicResult.code = jSONObject.optInt("code", -2);
                uploadPicResult.picId = jSONObject.optString("data", "");
            } catch (JSONException unused) {
            }
            return uploadPicResult;
        }
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public WeiboAuthListener getAuthListener() {
        return this.mAuthListener;
    }

    public String getAuthListenerKey() {
        return this.mAuthListenerKey;
    }

    public byte[] getBase64ImgData() {
        return this.mBase64ImgData;
    }

    public String getHashKey() {
        return this.mHashKey;
    }

    public String getShareContent() {
        return this.mShareContent;
    }

    public String getToken() {
        return this.mToken;
    }

    public boolean hasImage() {
        if (this.mBase64ImgData == null || this.mBase64ImgData.length <= 0) {
            return false;
        }
        return true;
    }

    public void setAppKey(String str) {
        this.mAppKey = str;
    }

    public void setAppPackage(String str) {
        this.mAppPackage = str;
    }

    public void setAuthListener(WeiboAuthListener weiboAuthListener) {
        this.mAuthListener = weiboAuthListener;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        this.mBaseRequest = baseRequest;
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public ShareRequestParam(Context context) {
        super(context);
        this.mLaucher = BrowserLauncher.SHARE;
    }

    public void sendSdkCancleResponse(Activity activity) {
        sendSdkResponse(activity, 1, "send cancel!!!");
    }

    public void sendSdkOkResponse(Activity activity) {
        sendSdkResponse(activity, 0, "send ok!!!");
    }

    public WeiboParameters buildUploadPicParam(WeiboParameters weiboParameters) {
        if (!hasImage()) {
            return weiboParameters;
        }
        weiboParameters.put("img", new String(this.mBase64ImgData));
        return weiboParameters;
    }

    public String buildUrl(String str) {
        Uri.Builder buildUpon = Uri.parse("http://service.weibo.com/share/mobilesdk.php").buildUpon();
        buildUpon.appendQueryParameter(PushConstants.TITLE, this.mShareContent);
        buildUpon.appendQueryParameter("version", "0030105000");
        if (!TextUtils.isEmpty(this.mAppKey)) {
            buildUpon.appendQueryParameter("source", this.mAppKey);
        }
        if (!TextUtils.isEmpty(this.mToken)) {
            buildUpon.appendQueryParameter("access_token", this.mToken);
        }
        String aid = Utility.getAid(this.mContext, this.mAppKey);
        if (!TextUtils.isEmpty(aid)) {
            buildUpon.appendQueryParameter("aid", aid);
        }
        if (!TextUtils.isEmpty(this.mAppPackage)) {
            buildUpon.appendQueryParameter("packagename", this.mAppPackage);
        }
        if (!TextUtils.isEmpty(this.mHashKey)) {
            buildUpon.appendQueryParameter("key_hash", this.mHashKey);
        }
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("picinfo", str);
        }
        return buildUpon.build().toString();
    }

    public void onCreateRequestParamBundle(Bundle bundle) {
        if (this.mBaseRequest != null) {
            this.mBaseRequest.toBundle(bundle);
        }
        if (!TextUtils.isEmpty(this.mAppPackage)) {
            this.mHashKey = MD5.hexdigest(Utility.getSign(this.mContext, this.mAppPackage));
        }
        bundle.putString("access_token", this.mToken);
        bundle.putString("source", this.mAppKey);
        bundle.putString("packagename", this.mAppPackage);
        bundle.putString("key_hash", this.mHashKey);
        bundle.putString("_weibo_appPackage", this.mAppPackage);
        bundle.putString("_weibo_appKey", this.mAppKey);
        bundle.putInt("_weibo_flag", 538116905);
        bundle.putString("_weibo_sign", this.mHashKey);
        if (this.mAuthListener != null) {
            WeiboCallbackManager instance = WeiboCallbackManager.getInstance(this.mContext);
            this.mAuthListenerKey = instance.genCallbackKey();
            instance.setWeiboAuthListener(this.mAuthListenerKey, this.mAuthListener);
            bundle.putString("key_listener", this.mAuthListenerKey);
        }
    }

    /* access modifiers changed from: protected */
    public void onSetupRequestParam(Bundle bundle) {
        this.mAppKey = bundle.getString("source");
        this.mAppPackage = bundle.getString("packagename");
        this.mHashKey = bundle.getString("key_hash");
        this.mToken = bundle.getString("access_token");
        this.mAuthListenerKey = bundle.getString("key_listener");
        if (!TextUtils.isEmpty(this.mAuthListenerKey)) {
            this.mAuthListener = WeiboCallbackManager.getInstance(this.mContext).getWeiboAuthListener(this.mAuthListenerKey);
        }
        handleSharedMessage(bundle);
        this.mUrl = buildUrl("");
    }

    private void handleSharedMessage(Bundle bundle) {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        weiboMultiMessage.toObject(bundle);
        StringBuilder sb = new StringBuilder();
        if (weiboMultiMessage.textObject instanceof TextObject) {
            sb.append(weiboMultiMessage.textObject.text);
        }
        if (weiboMultiMessage.imageObject instanceof ImageObject) {
            ImageObject imageObject = weiboMultiMessage.imageObject;
            handleMblogPic(imageObject.imagePath, imageObject.imageData);
        }
        if (weiboMultiMessage.mediaObject instanceof TextObject) {
            sb.append(((TextObject) weiboMultiMessage.mediaObject).text);
        }
        if (weiboMultiMessage.mediaObject instanceof ImageObject) {
            ImageObject imageObject2 = (ImageObject) weiboMultiMessage.mediaObject;
            handleMblogPic(imageObject2.imagePath, imageObject2.imageData);
        }
        if (weiboMultiMessage.mediaObject instanceof WebpageObject) {
            sb.append(" ");
            sb.append(((WebpageObject) weiboMultiMessage.mediaObject).actionUrl);
        }
        if (weiboMultiMessage.mediaObject instanceof MusicObject) {
            sb.append(" ");
            sb.append(((MusicObject) weiboMultiMessage.mediaObject).actionUrl);
        }
        if (weiboMultiMessage.mediaObject instanceof VideoObject) {
            sb.append(" ");
            sb.append(((VideoObject) weiboMultiMessage.mediaObject).actionUrl);
        }
        if (weiboMultiMessage.mediaObject instanceof VoiceObject) {
            sb.append(" ");
            sb.append(((VoiceObject) weiboMultiMessage.mediaObject).actionUrl);
        }
        this.mShareContent = sb.toString();
    }

    public void sendSdkErrorResponse(Activity activity, String str) {
        sendSdkResponse(activity, 2, str);
    }

    public void execRequest(Activity activity, int i) {
        if (i == 3) {
            sendSdkCancleResponse(activity);
            WeiboSdkBrowser.closeBrowser(activity, this.mAuthListenerKey, null);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|(0)|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0047 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044 A[SYNTHETIC, Splitter:B:26:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC, Splitter:B:32:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleMblogPic(java.lang.String r6, byte[] r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{  }
            if (r0 != 0) goto L_0x004f
            java.io.File r0 = new java.io.File     // Catch:{  }
            r0.<init>(r6)     // Catch:{  }
            boolean r6 = r0.exists()     // Catch:{  }
            if (r6 == 0) goto L_0x004f
            boolean r6 = r0.canRead()     // Catch:{  }
            if (r6 == 0) goto L_0x004f
            long r1 = r0.length()     // Catch:{  }
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x004f
            long r1 = r0.length()     // Catch:{  }
            int r6 = (int) r1     // Catch:{  }
            byte[] r6 = new byte[r6]     // Catch:{  }
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0048, all -> 0x0040 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0048, all -> 0x0040 }
            r2.read(r6)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            byte[] r6 = com.sina.weibo.sdk.utils.Base64.encodebyte(r6)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r5.mBase64ImgData = r6     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r2.close()     // Catch:{ Exception -> 0x003b }
            return
        L_0x003b:
            return
        L_0x003c:
            r6 = move-exception
            goto L_0x0042
        L_0x003e:
            r1 = r2
            goto L_0x0048
        L_0x0040:
            r6 = move-exception
            r2 = r1
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            throw r6     // Catch:{  }
        L_0x0048:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ SecurityException -> 0x004e }
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            if (r7 == 0) goto L_0x005a
            int r6 = r7.length
            if (r6 <= 0) goto L_0x005a
            byte[] r6 = com.sina.weibo.sdk.utils.Base64.encodebyte(r7)
            r5.mBase64ImgData = r6
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.component.ShareRequestParam.handleMblogPic(java.lang.String, byte[]):void");
    }

    private void sendSdkResponse(Activity activity, int i, String str) {
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            Intent intent = new Intent("com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY");
            intent.setFlags(131072);
            intent.setPackage(extras.getString("_weibo_appPackage"));
            intent.putExtras(extras);
            intent.putExtra("_weibo_appPackage", activity.getPackageName());
            intent.putExtra("_weibo_resp_errcode", i);
            intent.putExtra("_weibo_resp_errstr", str);
            try {
                activity.startActivityForResult(intent, 765);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
