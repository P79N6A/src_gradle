package com.sina.weibo.sdk.component.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.component.WeiboSdkBrowser;
import com.sina.weibo.sdk.component.WidgetRequestParam;
import com.sina.weibo.sdk.utils.ResourceManager;

public class CommentComponentView extends FrameLayout {
    private RequestParam mCommentParam;
    private LinearLayout mContentLy;

    public enum Category {
        MOVIE("1001"),
        TRAVEL("1002");
        
        private String mVal;

        public final String getValue() {
            return this.mVal;
        }

        private Category(String str) {
            this.mVal = str;
        }
    }

    public static class RequestParam {
        public String mAccessToken;
        public String mAppKey;
        public WeiboAuthListener mAuthlistener;
        public Category mCategory;
        public String mContent;
        public String mTopic;

        private RequestParam() {
        }

        public static RequestParam createRequestParam(String str, String str2, String str3, Category category, WeiboAuthListener weiboAuthListener) {
            RequestParam requestParam = new RequestParam();
            requestParam.mAppKey = str;
            requestParam.mTopic = str2;
            requestParam.mContent = str3;
            requestParam.mCategory = category;
            requestParam.mAuthlistener = weiboAuthListener;
            return requestParam;
        }

        public static RequestParam createRequestParam(String str, String str2, String str3, String str4, Category category, WeiboAuthListener weiboAuthListener) {
            RequestParam requestParam = new RequestParam();
            requestParam.mAppKey = str;
            requestParam.mAccessToken = str2;
            requestParam.mTopic = str3;
            requestParam.mContent = str4;
            requestParam.mCategory = category;
            requestParam.mAuthlistener = weiboAuthListener;
            return requestParam;
        }
    }

    public void execAttented() {
        WidgetRequestParam widgetRequestParam = new WidgetRequestParam(getContext());
        widgetRequestParam.setUrl("http://widget.weibo.com/distribution/socail_comments_sdk.php");
        widgetRequestParam.setSpecifyTitle(ResourceManager.getString(getContext(), "Comment", "微博热评", "微博熱評"));
        widgetRequestParam.setAppKey(this.mCommentParam.mAppKey);
        widgetRequestParam.setCommentTopic(this.mCommentParam.mTopic);
        widgetRequestParam.setCommentContent(this.mCommentParam.mContent);
        widgetRequestParam.setCommentCategory(this.mCommentParam.mCategory.getValue());
        widgetRequestParam.setAuthListener(this.mCommentParam.mAuthlistener);
        widgetRequestParam.setToken(this.mCommentParam.mAccessToken);
        Bundle createRequestParamBundle = widgetRequestParam.createRequestParamBundle();
        Intent intent = new Intent(getContext(), WeiboSdkBrowser.class);
        intent.putExtras(createRequestParamBundle);
        getContext().startActivity(intent);
    }

    public void setCommentParam(RequestParam requestParam) {
        this.mCommentParam = requestParam;
    }

    public CommentComponentView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContentLy = new LinearLayout(context);
        this.mContentLy.setOrientation(0);
        this.mContentLy.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(ResourceManager.getDrawable(context, "sdk_weibo_logo.png"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ResourceManager.dp2px(getContext(), 20), ResourceManager.dp2px(getContext(), 20));
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setText(ResourceManager.getString(context, "Comment", "微博热评", "微博熱評"));
        textView.setTextColor(-32256);
        textView.setTextSize(2, 15.0f);
        textView.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        layoutParams2.leftMargin = ResourceManager.dp2px(getContext(), 4);
        textView.setLayoutParams(layoutParams2);
        this.mContentLy.addView(imageView);
        this.mContentLy.addView(textView);
        addView(this.mContentLy);
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CommentComponentView.this.execAttented();
            }
        });
    }

    public CommentComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public CommentComponentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
