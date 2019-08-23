package com.ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.edit.cover.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

@Keep
public class PhotoMovieContext extends BaseShortVideoContext implements Parcelable {
    public static final Parcelable.Creator<PhotoMovieContext> CREATOR = new Parcelable.Creator<PhotoMovieContext>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58804a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PhotoMovieContext[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f58804a, false, 63917, new Class[]{Parcel.class}, PhotoMovieContext.class)) {
                return new PhotoMovieContext(parcel2);
            }
            return (PhotoMovieContext) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f58804a, false, 63917, new Class[]{Parcel.class}, PhotoMovieContext.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("creationId")
    public String creationId;
    @SerializedName("draftId")
    public int draftId;
    @SerializedName("extract_model")
    public ExtractFramesModel extractFramesModel;
    @SerializedName("mCoverStartTm")
    public float mCoverStartTm;
    @SerializedName("mFilterId")
    public int mFilterId;
    @SerializedName("mFilterName")
    public String mFilterName;
    @SerializedName("mFilterPath")
    public String mFilterPath;
    @SerializedName("mFinalVideoTmpPath")
    public String mFinalVideoTmpPath;
    @SerializedName("mFrom")
    public int mFrom;
    @SerializedName("mHeight")
    public int mHeight;
    @SerializedName("mImageList")
    public List<String> mImageList;
    @SerializedName("mInputAudioPath")
    public String mInputAudioPath;
    @SerializedName("mMusic")
    public e mMusic;
    @SerializedName("mMusicList")
    public List<e> mMusicList = new ArrayList();
    @SerializedName("mMusicPath")
    public String mMusicPath;
    @SerializedName("mOutputVideoPath")
    public String mOutputVideoPath;
    @SerializedName("mPlayType")
    public int mPlayType;
    @SerializedName("save_model")
    public AVUploadSaveModel mSaveModel;
    @SerializedName("mWidth")
    public int mWidth;
    @SerializedName("music_origin")
    public String musicOrigin;
    @SerializedName("shop_draft_id")
    public String shopDraftId;

    @Retention(RetentionPolicy.SOURCE)
    public @interface From {
    }

    public interface a {
        @WorkerThread
        void a(@Nullable Bitmap bitmap, int i, int i2);
    }

    public int describeContents() {
        return 0;
    }

    public PhotoMovieContext() {
    }

    public int getImageCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63906, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63906, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mImageList == null) {
            return 0;
        } else {
            return this.mImageList.size();
        }
    }

    public String getLocalTempPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63912, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63912, new Class[0], String.class);
        } else if (this.mSaveModel == null) {
            return null;
        } else {
            return this.mSaveModel.getLocalTempPath();
        }
    }

    public boolean isSaveLocal() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63909, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63909, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.isSaveLocal()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveLocalWithWaterMark() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63907, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63907, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.isSaveLocalWithWaterMark()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63908, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63908, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && !this.mSaveModel.isWaterMark()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveToAlbum() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63911, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63911, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.getSaveToAlbum()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63910, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63910, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            z = true;
        }
        return z;
    }

    @Nullable
    public String getPhotoMovieCover() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63914, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63914, new Class[0], String.class);
        } else if (CollectionUtils.isEmpty(this.mImageList) || this.mVideoLength == 0) {
            return null;
        } else {
            return this.mImageList.get(new a.C0659a().a(this.mImageList.size(), this.mCoverStartTm / ((((float) this.mVideoLength) * 1.0f) / 1000.0f)));
        }
    }

    public PhotoMovieContext(Parcel parcel) {
        super(parcel);
        this.mFinalVideoTmpPath = parcel.readString();
        this.mImageList = parcel.createStringArrayList();
        this.musicOrigin = parcel.readString();
        this.mMusicPath = parcel.readString();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mPlayType = parcel.readInt();
        this.mOutputVideoPath = parcel.readString();
        this.mInputAudioPath = parcel.readString();
        this.mCoverStartTm = parcel.readFloat();
        this.mMusic = (e) parcel.readSerializable();
        this.mFilterPath = parcel.readString();
        this.mFilterName = parcel.readString();
        this.mFilterId = parcel.readInt();
        this.mFrom = parcel.readInt();
        this.creationId = parcel.readString();
        this.draftId = parcel.readInt();
        this.shopDraftId = parcel.readString();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
    }

    public static PhotoMovieContext convertFromOld(PhotoMovieContextOld photoMovieContextOld) {
        PhotoMovieContextOld photoMovieContextOld2 = photoMovieContextOld;
        if (PatchProxy.isSupport(new Object[]{photoMovieContextOld2}, null, changeQuickRedirect, true, 63913, new Class[]{PhotoMovieContextOld.class}, PhotoMovieContext.class)) {
            return (PhotoMovieContext) PatchProxy.accessDispatch(new Object[]{photoMovieContextOld2}, null, changeQuickRedirect, true, 63913, new Class[]{PhotoMovieContextOld.class}, PhotoMovieContext.class);
        }
        PhotoMovieContext photoMovieContext = new PhotoMovieContext();
        photoMovieContext.mFinalVideoTmpPath = photoMovieContextOld2.f58806b;
        photoMovieContext.mImageList = photoMovieContextOld2.f58807c;
        photoMovieContext.musicOrigin = photoMovieContextOld2.o;
        photoMovieContext.mMusicPath = photoMovieContextOld2.f58808d;
        photoMovieContext.mHeight = photoMovieContextOld2.f58810f;
        photoMovieContext.mWidth = photoMovieContextOld2.g;
        photoMovieContext.mPlayType = photoMovieContextOld2.h;
        photoMovieContext.mOutputVideoPath = photoMovieContextOld2.i;
        photoMovieContext.mInputAudioPath = photoMovieContextOld2.j;
        photoMovieContext.mCoverStartTm = photoMovieContextOld2.k;
        photoMovieContext.mMusic = photoMovieContextOld2.l;
        photoMovieContext.mFilterPath = photoMovieContextOld2.m;
        photoMovieContext.mFrom = photoMovieContextOld2.n;
        photoMovieContext.challenges = photoMovieContextOld2.challenges;
        photoMovieContext.title = photoMovieContextOld2.title;
        photoMovieContext.structList = photoMovieContextOld2.structList;
        photoMovieContext.city = photoMovieContextOld2.city;
        photoMovieContext.longitude = photoMovieContextOld2.longitude;
        photoMovieContext.latitude = photoMovieContextOld2.latitude;
        photoMovieContext.isPrivate = photoMovieContextOld2.isPrivate;
        photoMovieContext.poiId = photoMovieContextOld2.poiId;
        photoMovieContext.poiName = photoMovieContextOld2.poiName;
        photoMovieContext.mVideoLength = photoMovieContextOld2.mVideoLength;
        photoMovieContext.mSyncPlatforms = photoMovieContextOld2.mSyncPlatforms;
        photoMovieContext.mShootWay = photoMovieContextOld2.mShootWay;
        photoMovieContext.mIsFromDraft = photoMovieContextOld2.mIsFromDraft;
        photoMovieContext.commentSetting = photoMovieContextOld2.commentSetting;
        return photoMovieContext;
    }

    public void getPhotoMovieCover(@NonNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 63915, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 63915, new Class[]{a.class}, Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).photoMovieService().getPhotoMovieCover(this, aVar2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 63916, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 63916, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mFinalVideoTmpPath);
        parcel.writeStringList(this.mImageList);
        parcel.writeString(this.musicOrigin);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mPlayType);
        parcel.writeString(this.mOutputVideoPath);
        parcel.writeString(this.mInputAudioPath);
        parcel.writeFloat(this.mCoverStartTm);
        parcel.writeSerializable(this.mMusic);
        parcel.writeString(this.mFilterPath);
        parcel.writeString(this.mFilterName);
        parcel.writeInt(this.mFilterId);
        parcel.writeInt(this.mFrom);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.shopDraftId);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeSerializable(this.extractFramesModel);
    }
}
