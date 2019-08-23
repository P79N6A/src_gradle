package com.ss.android.ugc.aweme.photo;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.d;
import com.ss.android.ugc.aweme.framework.e.f;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.io.File;
import java.io.Serializable;
import java.util.List;

@Keep
public class PhotoContext implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AVETParameter avetParameter;
    public List<c> challenges;
    public String commerceData;
    public String creationId;
    @Nullable
    public d defaultSelectStickerPoi;
    public int draftId;
    public String globalData;
    public float mBigEyesRate;
    public String mCamera;
    public List<AVTextExtraStruct> mExtras;
    public int mFilterId;
    public int mFilterIndex;
    public String mFilterName;
    public float mFilterRate = 0.8f;
    public boolean mFromOtherPlatform;
    public int mHeight;
    public int mImageType;
    public int mIsPrivate;
    public String mLatitude;
    public String mLongitude;
    public int mPhotoFrom;
    public String mPhotoLocalPath;
    public String mPoiId;
    public String mPoiName;
    public String mPrettify;
    public String mPropSource;
    public String mShootWay;
    public float mSmoothSkinRate;
    public int mState;
    public String mStickers;
    public String mSyncPlatforms;
    public String mText;
    private String mTmpPath;
    public int mWidth;
    public String mainBusinessData;
    public String md5;
    public q microAppModel;
    public String poiData;
    public String shopDraftId;
    public String socialData;
    public String techData;
    public String ugData;

    public AVETParameter getAvetParameter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63577, new Class[0], AVETParameter.class)) {
            return (AVETParameter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63577, new Class[0], AVETParameter.class);
        }
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    @Nullable
    public Uri getPhotoUri() {
        Uri uri;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63569, new Class[0], Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63569, new Class[0], Uri.class);
        }
        if (!TextUtils.isEmpty(this.mPhotoLocalPath)) {
            uri = Uri.fromFile(new File(this.mPhotoLocalPath));
        } else {
            uri = null;
        }
        return uri;
    }

    public void updatePhotoPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63574, new Class[0], Void.TYPE);
            return;
        }
        File file = new File(this.mPhotoLocalPath);
        if (file.exists()) {
            file.delete();
        }
        this.mPhotoLocalPath = this.mTmpPath;
        this.mTmpPath = null;
    }

    public void setAvetParameter(AVETParameter aVETParameter) {
        this.avetParameter = aVETParameter;
    }

    private PhotoContext(int i) {
        this.mPhotoFrom = i;
    }

    public String getTmpPhotoPath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 63571, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 63571, new Class[]{Context.class}, String.class);
        }
        genTmpPath(context);
        return this.mTmpPath;
    }

    private void genTmpPath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 63570, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 63570, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(this.mTmpPath)) {
            this.mTmpPath = genTmpPhotoPath(context);
        }
    }

    private static String genTmpPhotoPath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 63578, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 63578, new Class[]{Context.class}, String.class);
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        String str = "tmp-photo-" + System.currentTimeMillis();
        return absolutePath + File.separator + str;
    }

    public void delTmpPhoto(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 63573, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 63573, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        genTmpPath(context);
        File file = new File(this.mTmpPath);
        if (file.exists()) {
            file.delete();
        }
    }

    public Uri getTmpPhotoUri(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 63572, new Class[]{Context.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 63572, new Class[]{Context.class}, Uri.class);
        }
        genTmpPath(context);
        return Uri.fromFile(new File(this.mTmpPath));
    }

    public static PhotoContext fromCapture(@NonNull String str, int i, int i2, @NonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), str4}, null, changeQuickRedirect, true, 63576, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, PhotoContext.class)) {
            return (PhotoContext) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), str4}, null, changeQuickRedirect, true, 63576, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, PhotoContext.class);
        }
        f.a(str);
        PhotoContext photoContext = new PhotoContext(1);
        photoContext.creationId = str4;
        photoContext.mPhotoLocalPath = str3;
        photoContext.mWidth = i;
        photoContext.mHeight = i2;
        return photoContext;
    }

    public static PhotoContext fromUpload(@NonNull String str, int i, int i2, @NonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), str4}, null, changeQuickRedirect, true, 63575, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, PhotoContext.class)) {
            return (PhotoContext) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), Integer.valueOf(i2), str4}, null, changeQuickRedirect, true, 63575, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, PhotoContext.class);
        }
        f.a(str);
        PhotoContext photoContext = new PhotoContext(0);
        photoContext.creationId = str4;
        photoContext.mPhotoLocalPath = str3;
        photoContext.mWidth = i;
        photoContext.mHeight = i2;
        return photoContext;
    }
}
