package com.sina.weibo.sdk.api.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.ApiUtils;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.api.WeiboMessage;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.api.share.IWeiboHandler;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.component.WeiboSdkBrowser;
import com.sina.weibo.sdk.exception.WeiboShareException;
import com.sina.weibo.sdk.utils.AidTask;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.MD5;
import com.sina.weibo.sdk.utils.Utility;

public class WeiboShareAPIImpl implements IWeiboShareAPI {
    private static final String TAG = "com.sina.weibo.sdk.api.share.WeiboShareAPIImpl";
    private String mAppKey;
    private Context mContext;
    private Dialog mDownloadConfirmDialog;
    private IWeiboDownloadListener mDownloadListener;
    private boolean mNeedDownloadWeibo = true;
    private WeiboAppManager.WeiboInfo mWeiboInfo;

    public boolean isSupportWeiboPay() {
        if (getWeiboAppSupportAPI() >= 10353) {
            return true;
        }
        return false;
    }

    public boolean isWeiboAppInstalled() {
        if (this.mWeiboInfo == null || !this.mWeiboInfo.isLegal()) {
            return false;
        }
        return true;
    }

    public boolean isWeiboAppSupportAPI() {
        if (getWeiboAppSupportAPI() >= 10350) {
            return true;
        }
        return false;
    }

    public boolean registerApp() {
        sendBroadcast(this.mContext, "com.sina.weibo.sdk.Intent.ACTION_WEIBO_REGISTER", this.mAppKey, null, null);
        return true;
    }

    public int getWeiboAppSupportAPI() {
        if (this.mWeiboInfo == null || !this.mWeiboInfo.isLegal()) {
            return -1;
        }
        return this.mWeiboInfo.getSupportApi();
    }

    private void registerWeiboDownloadListener(IWeiboDownloadListener iWeiboDownloadListener) {
        this.mDownloadListener = iWeiboDownloadListener;
    }

    private WeiboMessage adapterMultiMessage2SingleMessage(WeiboMultiMessage weiboMultiMessage) {
        if (weiboMultiMessage == null) {
            return new WeiboMessage();
        }
        Bundle bundle = new Bundle();
        weiboMultiMessage.toBundle(bundle);
        return new WeiboMessage(bundle);
    }

    public boolean launchWeibo(Activity activity) {
        if (!isWeiboAppInstalled()) {
            LogUtil.e(TAG, "launchWeibo faild WeiboInfo is null");
            return false;
        }
        try {
            activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage(this.mWeiboInfo.getPackageName()));
            return true;
        } catch (Exception e2) {
            LogUtil.e(TAG, e2.getMessage());
            return false;
        }
    }

    public boolean sendResponse(BaseResponse baseResponse) {
        if (baseResponse == null) {
            LogUtil.e(TAG, "sendResponse failed response null");
            return false;
        } else if (!baseResponse.check(this.mContext, new VersionCheckHandler())) {
            LogUtil.e(TAG, "sendResponse check fail");
            return false;
        } else {
            Bundle bundle = new Bundle();
            baseResponse.toBundle(bundle);
            sendBroadcast(this.mContext, "com.sina.weibo.sdk.Intent.ACTION_WEIBO_RESPONSE", this.mAppKey, baseResponse.reqPackageName, bundle);
            return true;
        }
    }

    private boolean checkEnvironment(boolean z) throws WeiboShareException {
        if (!isWeiboAppInstalled()) {
            if (z) {
                if (this.mDownloadConfirmDialog == null) {
                    this.mDownloadConfirmDialog = WeiboDownloader.createDownloadConfirmDialog(this.mContext, this.mDownloadListener);
                    this.mDownloadConfirmDialog.show();
                } else if (!this.mDownloadConfirmDialog.isShowing()) {
                    this.mDownloadConfirmDialog.show();
                }
                return false;
            }
            throw new WeiboShareException("Weibo is not installed!");
        } else if (!isWeiboAppSupportAPI()) {
            throw new WeiboShareException("Weibo do not support share api!");
        } else if (ApiUtils.validateWeiboSign(this.mContext, this.mWeiboInfo.getPackageName())) {
            return true;
        } else {
            throw new WeiboShareException("Weibo signature is incorrect!");
        }
    }

    public boolean launchWeiboPay(Activity activity, String str) {
        if (!isWeiboAppInstalled()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("rawdata", str);
        bundle.putInt("_weibo_command_type", 4);
        bundle.putString("_weibo_transaction", String.valueOf(System.currentTimeMillis()));
        return launchWeiboActivity(activity, "com.sina.weibo.sdk.action.ACTION_WEIBO_PAY_ACTIVITY", this.mWeiboInfo.getPackageName(), this.mAppKey, bundle);
    }

    public boolean handleWeiboRequest(Intent intent, IWeiboHandler.Request request) {
        if (intent == null || request == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("_weibo_appPackage");
        String stringExtra2 = intent.getStringExtra("_weibo_transaction");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.e(TAG, "handleWeiboRequest faild appPackage validateSign faild");
            request.onRequest(null);
            return false;
        } else if (TextUtils.isEmpty(stringExtra2)) {
            LogUtil.e(TAG, "handleWeiboRequest faild intent _weibo_transaction is null");
            request.onRequest(null);
            return false;
        } else if (!ApiUtils.validateWeiboSign(this.mContext, stringExtra)) {
            LogUtil.e(TAG, "handleWeiboRequest faild appPackage validateSign faild");
            request.onRequest(null);
            return false;
        } else {
            request.onRequest(new ProvideMessageForWeiboRequest(intent.getExtras()));
            return true;
        }
    }

    public boolean handleWeiboResponse(Intent intent, IWeiboHandler.Response response) {
        String stringExtra = intent.getStringExtra("_weibo_appPackage");
        String stringExtra2 = intent.getStringExtra("_weibo_transaction");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.e(TAG, "handleWeiboResponse faild appPackage is null");
            return false;
        } else if (!(response instanceof Activity)) {
            LogUtil.e(TAG, "handleWeiboResponse faild handler is not Activity");
            return false;
        } else {
            Activity activity = (Activity) response;
            LogUtil.d(TAG, "handleWeiboResponse getCallingPackage : ".concat(String.valueOf(activity.getCallingPackage())));
            if (TextUtils.isEmpty(stringExtra2)) {
                LogUtil.e(TAG, "handleWeiboResponse faild intent _weibo_transaction is null");
                return false;
            } else if (ApiUtils.validateWeiboSign(this.mContext, stringExtra) || stringExtra.equals(activity.getPackageName())) {
                response.onResponse(new SendMessageToWeiboResponse(intent.getExtras()));
                return true;
            } else {
                LogUtil.e(TAG, "handleWeiboResponse faild appPackage validateSign faild");
                return false;
            }
        }
    }

    public boolean sendRequest(Activity activity, BaseRequest baseRequest) {
        if (baseRequest == null) {
            LogUtil.e(TAG, "sendRequest faild request is null");
            return false;
        }
        try {
            if (!checkEnvironment(this.mNeedDownloadWeibo)) {
                return false;
            }
            if (!baseRequest.check(this.mContext, this.mWeiboInfo, new VersionCheckHandler())) {
                LogUtil.e(TAG, "sendRequest faild request check faild");
                return false;
            }
            Bundle bundle = new Bundle();
            baseRequest.toBundle(bundle);
            return launchWeiboActivity(activity, "com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY", this.mWeiboInfo.getPackageName(), this.mAppKey, bundle);
        } catch (Exception e2) {
            LogUtil.e(TAG, e2.getMessage());
            return false;
        }
    }

    public WeiboShareAPIImpl(Context context, String str, boolean z) {
        this.mContext = context;
        this.mAppKey = str;
        this.mNeedDownloadWeibo = z;
        this.mWeiboInfo = WeiboAppManager.getInstance(context).getWeiboInfo();
        if (this.mWeiboInfo != null) {
            LogUtil.d(TAG, this.mWeiboInfo.toString());
        } else {
            LogUtil.d(TAG, "WeiboInfo is null");
        }
        AidTask.getInstance(context).aidTaskInit(str);
    }

    private boolean startShareWeiboActivity(Activity activity, String str, BaseRequest baseRequest, WeiboAuthListener weiboAuthListener) {
        try {
            new Bundle();
            String packageName = activity.getPackageName();
            ShareRequestParam shareRequestParam = new ShareRequestParam(activity);
            shareRequestParam.setToken(str);
            shareRequestParam.setAppKey(this.mAppKey);
            shareRequestParam.setAppPackage(packageName);
            shareRequestParam.setBaseRequest(baseRequest);
            shareRequestParam.setSpecifyTitle("微博分享");
            shareRequestParam.setAuthListener(weiboAuthListener);
            Intent intent = new Intent(activity, WeiboSdkBrowser.class);
            intent.putExtras(shareRequestParam.createRequestParamBundle());
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private void sendBroadcast(Context context, String str, String str2, String str3, Bundle bundle) {
        Intent intent = new Intent(str);
        String packageName = context.getPackageName();
        intent.putExtra("_weibo_sdkVersion", "0030105000");
        intent.putExtra("_weibo_appPackage", packageName);
        intent.putExtra("_weibo_appKey", str2);
        intent.putExtra("_weibo_flag", 538116905);
        intent.putExtra("_weibo_sign", MD5.hexdigest(Utility.getSign(context, packageName)));
        if (!TextUtils.isEmpty(str3)) {
            intent.setPackage(str3);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String str4 = TAG;
        LogUtil.d(str4, "intent=" + intent + ", extra=" + intent.getExtras());
        context.sendBroadcast(intent, "com.sina.weibo.permission.WEIBO_SDK_PERMISSION");
    }

    private boolean launchWeiboActivity(Activity activity, String str, String str2, String str3, Bundle bundle) {
        if (activity == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.e(TAG, "launchWeiboActivity fail, invalid arguments");
            return false;
        }
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(str);
        String packageName = activity.getPackageName();
        intent.putExtra("_weibo_sdkVersion", "0030105000");
        intent.putExtra("_weibo_appPackage", packageName);
        intent.putExtra("_weibo_appKey", str3);
        intent.putExtra("_weibo_flag", 538116905);
        intent.putExtra("_weibo_sign", MD5.hexdigest(Utility.getSign(activity, packageName)));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        try {
            String str4 = TAG;
            LogUtil.d(str4, "launchWeiboActivity intent=" + intent + ", extra=" + intent.getExtras());
            activity.startActivityForResult(intent, 765);
            return true;
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(TAG, e2.getMessage());
            return false;
        }
    }

    public boolean sendRequest(Activity activity, BaseRequest baseRequest, AuthInfo authInfo, String str, WeiboAuthListener weiboAuthListener) {
        if (baseRequest == null) {
            LogUtil.e(TAG, "sendRequest faild request is null !");
            return false;
        } else if (!isWeiboAppInstalled() || !isWeiboAppSupportAPI()) {
            return startShareWeiboActivity(activity, str, baseRequest, weiboAuthListener);
        } else {
            if (getWeiboAppSupportAPI() >= 10351) {
                return sendRequest(activity, baseRequest);
            }
            if (!(baseRequest instanceof SendMultiMessageToWeiboRequest)) {
                return sendRequest(activity, baseRequest);
            }
            SendMultiMessageToWeiboRequest sendMultiMessageToWeiboRequest = (SendMultiMessageToWeiboRequest) baseRequest;
            SendMessageToWeiboRequest sendMessageToWeiboRequest = new SendMessageToWeiboRequest();
            sendMessageToWeiboRequest.packageName = sendMultiMessageToWeiboRequest.packageName;
            sendMessageToWeiboRequest.transaction = sendMultiMessageToWeiboRequest.transaction;
            sendMessageToWeiboRequest.message = adapterMultiMessage2SingleMessage(sendMultiMessageToWeiboRequest.multiMessage);
            return sendRequest(activity, sendMessageToWeiboRequest);
        }
    }
}
