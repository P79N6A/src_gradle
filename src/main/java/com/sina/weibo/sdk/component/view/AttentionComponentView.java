package com.sina.weibo.sdk.component.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.component.WeiboSdkBrowser;
import com.sina.weibo.sdk.component.WidgetRequestParam;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;
import com.sina.weibo.sdk.net.RequestListener;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.ResourceManager;
import com.sina.weibo.sdk.utils.Utility;
import org.json.JSONException;
import org.json.JSONObject;

public class AttentionComponentView extends FrameLayout {
    public static final String TAG = "com.sina.weibo.sdk.component.view.AttentionComponentView";
    private FrameLayout flButton;
    private RequestParam mAttentionParam;
    private TextView mButton;
    public volatile boolean mIsLoadingState;
    private ProgressBar pbLoading;

    public static class RequestParam {
        public String mAccessToken;
        public String mAppKey;
        public String mAttentionScreenName;
        public String mAttentionUid;
        public WeiboAuthListener mAuthlistener;

        private RequestParam() {
        }

        public boolean hasAuthoriz() {
            if (!TextUtils.isEmpty(this.mAccessToken)) {
                return true;
            }
            return false;
        }

        public static RequestParam createRequestParam(String str, String str2, String str3, WeiboAuthListener weiboAuthListener) {
            RequestParam requestParam = new RequestParam();
            requestParam.mAppKey = str;
            requestParam.mAttentionUid = str2;
            requestParam.mAttentionScreenName = str3;
            requestParam.mAuthlistener = weiboAuthListener;
            return requestParam;
        }

        public static RequestParam createRequestParam(String str, String str2, String str3, String str4, WeiboAuthListener weiboAuthListener) {
            RequestParam requestParam = new RequestParam();
            requestParam.mAppKey = str;
            requestParam.mAccessToken = str2;
            requestParam.mAttentionUid = str3;
            requestParam.mAttentionScreenName = str4;
            requestParam.mAuthlistener = weiboAuthListener;
            return requestParam;
        }
    }

    private void startLoading() {
        this.flButton.setEnabled(false);
        this.mButton.setVisibility(8);
        this.pbLoading.setVisibility(0);
    }

    private void stopLoading() {
        this.flButton.setEnabled(true);
        this.mButton.setVisibility(0);
        this.pbLoading.setVisibility(8);
    }

    public void execAttented() {
        WidgetRequestParam widgetRequestParam = new WidgetRequestParam(getContext());
        widgetRequestParam.setUrl("http://widget.weibo.com/relationship/followsdk.php");
        widgetRequestParam.setSpecifyTitle(ResourceManager.getString(getContext(), "Follow", "关注", "關注"));
        widgetRequestParam.setAppKey(this.mAttentionParam.mAppKey);
        widgetRequestParam.setAttentionFuid(this.mAttentionParam.mAttentionUid);
        widgetRequestParam.setAuthListener(this.mAttentionParam.mAuthlistener);
        widgetRequestParam.setToken(this.mAttentionParam.mAccessToken);
        widgetRequestParam.setWidgetRequestCallback(new WidgetRequestParam.WidgetRequestCallback() {
            public void onWebViewResult(String str) {
                String string = Utility.parseUri(str).getString("result");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        long parseInt = (long) Integer.parseInt(string);
                        if (parseInt == 1) {
                            AttentionComponentView.this.showFollowButton(true);
                        } else if (parseInt == 0) {
                            AttentionComponentView.this.showFollowButton(false);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        });
        Bundle createRequestParamBundle = widgetRequestParam.createRequestParamBundle();
        Intent intent = new Intent(getContext(), WeiboSdkBrowser.class);
        intent.putExtras(createRequestParamBundle);
        getContext().startActivity(intent);
    }

    public AttentionComponentView(Context context) {
        super(context);
        init(context);
    }

    public void setAttentionParam(RequestParam requestParam) {
        this.mAttentionParam = requestParam;
        if (requestParam.hasAuthoriz()) {
            loadAttentionState(requestParam);
        }
    }

    private void loadAttentionState(RequestParam requestParam) {
        if (!this.mIsLoadingState) {
            this.mIsLoadingState = true;
            startLoading();
            WeiboParameters weiboParameters = new WeiboParameters(requestParam.mAppKey);
            weiboParameters.put("access_token", requestParam.mAccessToken);
            weiboParameters.put("target_id", requestParam.mAttentionUid);
            weiboParameters.put("target_screen_name", requestParam.mAttentionScreenName);
            requestAsync(getContext(), "https://api.weibo.com/2/friendships/show.json", weiboParameters, "GET", new RequestListener() {
                public void onWeiboException(WeiboException weiboException) {
                    String str = AttentionComponentView.TAG;
                    LogUtil.d(str, "error : " + weiboException.getMessage());
                    AttentionComponentView.this.mIsLoadingState = false;
                }

                public void onComplete(String str) {
                    LogUtil.d(AttentionComponentView.TAG, "json : ".concat(String.valueOf(str)));
                    try {
                        final JSONObject optJSONObject = new JSONObject(str).optJSONObject("target");
                        AttentionComponentView.this.getHandler().post(new Runnable() {
                            public void run() {
                                if (optJSONObject != null) {
                                    AttentionComponentView.this.showFollowButton(optJSONObject.optBoolean("followed_by", false));
                                }
                                AttentionComponentView.this.mIsLoadingState = false;
                            }
                        });
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    public void showFollowButton(boolean z) {
        stopLoading();
        if (z) {
            this.mButton.setText(ResourceManager.getString(getContext(), "Following", "已关注", "已關注"));
            this.mButton.setTextColor(-13421773);
            this.mButton.setCompoundDrawablesWithIntrinsicBounds(ResourceManager.getDrawable(getContext(), "timeline_relationship_icon_attention.png"), null, null, null);
            this.flButton.setEnabled(false);
            return;
        }
        this.mButton.setText(ResourceManager.getString(getContext(), "Follow", "关注", "關注"));
        this.mButton.setTextColor(-32256);
        this.mButton.setCompoundDrawablesWithIntrinsicBounds(ResourceManager.getDrawable(getContext(), "timeline_relationship_icon_addattention.png"), null, null, null);
        this.flButton.setEnabled(true);
    }

    private void init(Context context) {
        StateListDrawable createStateListDrawable = ResourceManager.createStateListDrawable(context, "common_button_white.9.png", "common_button_white_highlighted.9.png");
        this.flButton = new FrameLayout(context);
        this.flButton.setBackgroundDrawable(createStateListDrawable);
        this.flButton.setPadding(0, ResourceManager.dp2px(getContext(), 6), ResourceManager.dp2px(getContext(), 2), ResourceManager.dp2px(getContext(), 6));
        this.flButton.setLayoutParams(new FrameLayout.LayoutParams(ResourceManager.dp2px(getContext(), 66), -2));
        addView(this.flButton);
        this.mButton = new TextView(getContext());
        this.mButton.setIncludeFontPadding(false);
        this.mButton.setSingleLine(true);
        this.mButton.setTextSize(2, 13.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.mButton.setLayoutParams(layoutParams);
        this.flButton.addView(this.mButton);
        this.pbLoading = new ProgressBar(getContext(), null, 16842873);
        this.pbLoading.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.pbLoading.setLayoutParams(layoutParams2);
        this.flButton.addView(this.pbLoading);
        this.flButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AttentionComponentView.this.execAttented();
            }
        });
        showFollowButton(false);
    }

    public AttentionComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public AttentionComponentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void requestAsync(Context context, String str, WeiboParameters weiboParameters, String str2, RequestListener requestListener) {
        new AsyncWeiboRunner(context.getApplicationContext()).requestAsync(str, weiboParameters, str2, requestListener);
    }
}
