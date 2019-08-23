package com.ss.android.ugc.aweme.framework.services;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public interface IShareService {

    public interface IActionHandler {
        boolean checkStatus(String str);

        boolean onAction(ShareStruct shareStruct, String str);
    }

    public interface OnShareCallback {
        void onShareComplete(ShareResult shareResult);
    }

    public static abstract class SharePage extends BottomSheetDialog {
        public static ChangeQuickRedirect changeQuickRedirect;
        public IActionHandler mActionHandler;
        public OnShareCallback mShareCallback;
        public ShareStruct mShareStruct;

        public abstract void addBottomShareItem(View view);

        public abstract void addBottomShareItem(View view, int i);

        public abstract void addShareViewInTop(View view);

        public View getTopShareIMView() {
            return null;
        }

        public boolean isThumbNull() {
            return false;
        }

        public void setBaseItemVisible(String str, int i) {
        }

        public abstract void setPanelTitle(String str);

        public void setShareItemVisible(String str, int i) {
        }

        public ShareStruct getIMShareStruct() {
            return this.mShareStruct;
        }

        public ShareStruct getShareStruct() {
            return this.mShareStruct;
        }

        public SharePage(@NonNull Context context) {
            super(context);
        }

        public void setActionHandler(IActionHandler iActionHandler) {
            this.mActionHandler = iActionHandler;
        }

        public void setShareCallback(OnShareCallback onShareCallback) {
            this.mShareCallback = onShareCallback;
        }

        public void updateShareStruct(ShareStruct shareStruct) {
            this.mShareStruct = shareStruct;
        }

        public void onShareComplete(ShareResult shareResult) {
            if (PatchProxy.isSupport(new Object[]{shareResult}, this, changeQuickRedirect, false, 45932, new Class[]{ShareResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{shareResult}, this, changeQuickRedirect, false, 45932, new Class[]{ShareResult.class}, Void.TYPE);
                return;
            }
            if (this.mShareCallback != null) {
                this.mShareCallback.onShareComplete(shareResult);
            }
        }

        public SharePage(@NonNull Context context, @StyleRes int i) {
            super(context, i);
        }

        public SharePage(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
            super(context, z, onCancelListener);
        }
    }

    public interface IShareItemTypes {
    }

    public interface KEY_PARAMS {
    }

    public static abstract class ShareBar extends LinearLayout {
        public ShareBar(@NonNull Context context) {
            super(context);
        }
    }

    public static final class ShareResult {
        public String eventType;
        public String identifier;
        public boolean success;
        public String type;
    }

    public static class ShareStruct implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String WhatsAppDescription;
        public long adId;
        public String appName;
        public String authorId;
        public String authorName;
        public int awemeDuration;
        public int awemeHeight;
        public int awemeLength;
        public int awemeType;
        public String awemeVid;
        public int awemeWidth;
        public boolean boolPersist;
        public String cityInfo;
        public String contentType;
        public String description;
        public String distnceInfo;
        public String enterFrom;
        public HashMap<String, String> extraParams;
        public long groupId;
        public String identifier;
        public boolean isFromUploadSuccess;
        public boolean isLineShareWithLink;
        public int isLongItem;
        public boolean isShareOrignalUrl;
        public boolean isUrlShareWithLocalThumbPath;
        public long itemId;
        public String itemIdStr;
        public String itemType;
        public String liveId;
        public String logPb;
        public String poiId;
        public String poiType;
        public String shareCopyLink;
        public String shareQuote;
        public String shareSignatureDesc;
        public String shareSignatureUrl;
        public String shareText;
        public UrlModel thumb4Share;
        private String thumbPath;
        public String thumbUrl;
        public String title;
        public String uid4Share;
        public String url;
        public boolean useShortForm = true;
        public UrlModel videoCover;
        public String videoPath;
        public List<String> videoPlayList;
        public String videoUrl;
        public String wxAppId;

        public String getThumbPath() {
            return this.thumbPath;
        }

        public void setThumbPath(String str) {
            this.thumbPath = str;
        }
    }

    public static abstract class ShareWindow extends PopupWindow {
        public static ChangeQuickRedirect changeQuickRedirect;
        public IActionHandler mActionHandler;
        protected OnShareCallback mShareCallback;
        public ShareStruct mShareStruct;

        public abstract void addShareView(View view, int i);

        public abstract Drawable getShareIconDrawble(String str);

        public abstract void onDismiss();

        public abstract void setShowDuration(int i);

        public abstract void show();

        public ShareWindow(Context context) {
            super(context);
        }

        public void setActionHandler(IActionHandler iActionHandler) {
            this.mActionHandler = iActionHandler;
        }

        public void setShareCallback(OnShareCallback onShareCallback) {
            this.mShareCallback = onShareCallback;
        }

        public void updateShareStruct(ShareStruct shareStruct) {
            this.mShareStruct = shareStruct;
        }

        public void onShareComplete(ShareResult shareResult) {
            if (PatchProxy.isSupport(new Object[]{shareResult}, this, changeQuickRedirect, false, 45933, new Class[]{ShareResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{shareResult}, this, changeQuickRedirect, false, 45933, new Class[]{ShareResult.class}, Void.TYPE);
                return;
            }
            if (this.mShareCallback != null) {
                this.mShareCallback.onShareComplete(shareResult);
            }
        }
    }

    a getShareChannel(Activity activity, String str);

    @Nullable
    ShareResult share(Activity activity, ShareStruct shareStruct, String str);
}
