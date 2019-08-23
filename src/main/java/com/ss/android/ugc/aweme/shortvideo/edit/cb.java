package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ExternalAVConstants;
import com.ss.android.ugc.aweme.draft.a.d;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.n.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ah;
import com.ss.android.ugc.aweme.shortvideo.cf;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.gi;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.upload.a.b;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.b.c;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cb extends BaseShortVideoContext implements Serializable, Cloneable {
    public static final Parcelable.Creator<cb> CREATOR = new Parcelable.Creator<cb>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67162a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new cb[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f67162a, false, 76574, new Class[]{Parcel.class}, cb.class)) {
                return new cb(parcel2);
            }
            return (cb) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f67162a, false, 76574, new Class[]{Parcel.class}, cb.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    public String aiMusicLogPbImprId;
    public UrlModel audioTrack;
    public boolean autoEnhanceOn;
    public int autoEnhanceType;
    public int comFrom;
    public String creationId;
    @Nullable
    public d defaultSelectStickerPoi;
    public int draftId;
    public String enterFrom;
    public ExtractFramesModel extractFramesModel;
    public boolean faceBeautyOpen;
    public int fastImportErrorCode;
    public String fastImportResolution;
    public int gameScore;
    public ArrayList<cf> importInfoList;
    public a infoStickerModel;
    public boolean isFastImport;
    public boolean isMuted;
    public boolean isStoryTextRecord;
    public transient boolean isSyntheticHardEncode;
    public int mCameraPosition;
    public String mCurFilterIds;
    public String mCurFilterLabels;
    public String mDir;
    public User mDuetAuthor;
    public String mDuetFrom;
    public boolean mDurationMode;
    public ArrayList<EffectPointModel> mEffectList;
    public String mEncodedAudioOutputFile;
    public String mEyesLabels;
    public int mFaceBeauty;
    public String mFirstStickerMusicIdsJson;
    public boolean mFromCut;
    public boolean mFromMultiCut;
    public int mHardEncode;
    public String mId3Album;
    public String mId3Author;
    public String mId3Title;
    public boolean mIsHuaweiSuperSlow;
    public boolean mIsMultiVideo;
    public int mMusicEnd;
    public String mMusicOrigin;
    public String mMusicPath;
    public int mMusicRecType;
    public int mMusicShowRank;
    public int mMusicStart;
    public int mMusicType;
    private int mNewVersion;
    public int mOrigin;
    public String mOutPutWavFile;
    public int mOutVideoHeight;
    public int mOutVideoWidth;
    public String mOutputFile;
    public String mParallelUploadOutputFile;
    public String mPath;
    public String mReshapeLabels;
    public int mRestoreType;
    public String mReversePath;
    @SerializedName("save_model")
    public AVUploadSaveModel mSaveModel;
    public int mSelectedId;
    public int mShootMode;
    public String mSmoothSkinLabels;
    public String mStickerID;
    public String mStickerPath;
    public String mTanningLabels;
    public EffectPointModel mTimeEffect;
    public int mUseFilter;
    public int mVideoCanvasHeight;
    public int mVideoCanvasWidth;
    public float mVideoCoverStartTm;
    public int mVideoHeight;
    public String mVideoSegmentsDesc;
    public int mVideoWidth;
    public String mWavFile;
    public boolean mWillGoOnShortVideo;
    public transient com.ss.android.ugc.aweme.shortvideo.a.d mWorkspace;
    public long maxDuration;
    public String md5;
    public ExtraMentionUserModel mentionUserModel;
    public String microAppId;
    public q microAppModel;
    public String musicId;
    public float musicVolume;
    public com.ss.android.ugc.aweme.x.a mvCreateVideoData;
    public VEPreviewConfigure previewConfigure;
    public i reactionParams;
    @ExternalAVConstants.RecordMode
    public int recordMode;
    public UrlModel sendToUserHead;
    public String shopDraftId;
    public SocialModel socialModel;
    public gi storyBoomModel;
    public StoryFestivalModel storyFestivalModel;
    public List<String> texts;
    public j uploadMiscInfoStruct;
    public b uploadSpeedInfo;
    public boolean usePaint;
    public AudioEffectParam veAudioEffectParam;
    public ah veCherEffectParam;
    @Nullable
    private String videoCoverPath;
    public int videoEditorType;
    public String videoSpeed;
    public int videoType;
    public float voiceVolume;

    public int describeContents() {
        return 0;
    }

    public String getFxName() {
        return null;
    }

    public int getCamera() {
        return this.mCameraPosition;
    }

    public String getCity() {
        return this.city;
    }

    public User getDuetAuthor() {
        return this.mDuetAuthor;
    }

    public String getDuetFrom() {
        return this.mDuetFrom;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getFilterIds() {
        return this.mCurFilterIds;
    }

    public int getFilterIndex() {
        return this.mSelectedId;
    }

    public String getFilterName() {
        return this.mCurFilterLabels;
    }

    public String getInputVideoFile() {
        return this.mPath;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public int getNewVersion() {
        return this.mNewVersion;
    }

    public int getOriginal() {
        return this.mOrigin;
    }

    public String getOutputFile() {
        return this.mOutputFile;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public int getPrettify() {
        return this.mFaceBeauty;
    }

    public i getReactionParams() {
        return this.reactionParams;
    }

    public String getReverseFile() {
        return this.mReversePath;
    }

    public UrlModel getSendToUserHead() {
        return this.sendToUserHead;
    }

    public String getSpeed() {
        return this.videoSpeed;
    }

    public String getStickers() {
        return this.mStickerID;
    }

    public List<AVTextExtraStruct> getStructList() {
        return this.structList;
    }

    public String getSyncPlatforms() {
        return this.mSyncPlatforms;
    }

    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getVideoCoverPath() {
        return this.videoCoverPath;
    }

    public int getVideoLength() {
        return this.mVideoLength;
    }

    public int isPrivate() {
        return this.isPrivate;
    }

    public int isMusic() {
        if (this.mMusicPath == null) {
            return 0;
        }
        return 1;
    }

    public String getInputAudioFile() {
        if (this.mWavFile == null) {
            return this.mOutPutWavFile;
        }
        return this.mWavFile;
    }

    public int getFrom() {
        if (this.mIsHuaweiSuperSlow) {
            return 2;
        }
        if (this.mFromCut) {
            return 0;
        }
        if (this.mFromMultiCut) {
            return 1;
        }
        return 3;
    }

    public boolean isMvThemeVideoType() {
        if (this.mvCreateVideoData == null || (this.videoEditorType != 2 && this.videoEditorType != 3)) {
            return false;
        }
        return true;
    }

    public cb() {
        this.aiMusicLogPbImprId = "";
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.mDuetFrom = "";
        this.isMuted = false;
        this.uploadSpeedInfo = new b();
    }

    public void generateVideoCoverPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76562, new Class[0], Void.TYPE);
            return;
        }
        this.videoCoverPath = r.a();
    }

    public int getEffect() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76555, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76555, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mTimeEffect == null) {
            return 0;
        } else {
            return Integer.parseInt(this.mTimeEffect.getKey());
        }
    }

    public String getLocalFinalPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76553, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76553, new Class[0], String.class);
        } else if (this.mSaveModel == null) {
            return null;
        } else {
            return this.mSaveModel.getLocalFinalPath();
        }
    }

    public String getLocalTempPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76552, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76552, new Class[0], String.class);
        } else if (this.mSaveModel == null) {
            return null;
        } else {
            return this.mSaveModel.getLocalTempPath();
        }
    }

    public int getSpecialPoints() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76556, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76556, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mTimeEffect == null) {
            return 0;
        } else {
            return this.mTimeEffect.getEndPoint();
        }
    }

    @Nullable
    public String getValidVideoCoverPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76561, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76561, new Class[0], String.class);
        } else if (com.ss.android.ugc.aweme.video.b.b(this.videoCoverPath)) {
            return this.videoCoverPath;
        } else {
            return null;
        }
    }

    @Nullable
    public String getWavFile() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76554, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76554, new Class[0], String.class);
        } else if (this.mWavFile != null && new File(this.mWavFile).exists()) {
            return this.mWavFile;
        } else {
            return null;
        }
    }

    public boolean hasInfoStickers() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76547, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76547, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.infoStickerModel != null && Lists.notEmpty(this.infoStickerModel.stickers)) {
            z = true;
        }
        return z;
    }

    public boolean isAllowClearMusic() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76570, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76570, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!isMvThemeVideoType()) {
            z = true;
        }
        return z;
    }

    public boolean isMediaFromGallery() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76563, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(getAvetParameter().getContentSource(), "upload");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76563, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isReverse() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76557, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76557, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mTimeEffect != null && PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(this.mTimeEffect.getKey())) {
            z = true;
        }
        return z;
    }

    public boolean isSaveLocal() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76551, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76551, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.isSaveLocal()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveLocalWithWaterMark() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76549, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76549, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.isSaveLocalWithWaterMark()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76550, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76550, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && !this.mSaveModel.isWaterMark()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveToAlbum() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76569, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76569, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.getSaveToAlbum()) {
            z = true;
        }
        return z;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76568, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76568, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mSaveModel != null && this.mSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            z = true;
        }
        return z;
    }

    public boolean isStoryBoomMode() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76560, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76560, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getAvetParameter().getShootMode() == 6 && this.storyBoomModel != null) {
            z = true;
        }
        return z;
    }

    public cb clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76565, new Class[0], cb.class)) {
            return (cb) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76565, new Class[0], cb.class);
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(this);
        obtain.setDataPosition(0);
        cb cbVar = (cb) obtain.readValue(cb.class.getClassLoader());
        obtain.recycle();
        return cbVar;
    }

    public String getEditEffectList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76566, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76566, new Class[0], String.class);
        } else if (Lists.isEmpty(this.mEffectList)) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder(this.mEffectList.get(0).getKey());
            for (int i = 1; i < this.mEffectList.size(); i++) {
                sb.append(",");
                sb.append(this.mEffectList.get(i).getKey());
            }
            return sb.toString();
        }
    }

    public String getInfoStickerList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76567, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76567, new Class[0], String.class);
        }
        String b2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b(this.mainBusinessData);
        if (this.infoStickerModel == null || Lists.isEmpty(this.infoStickerModel.stickers)) {
            return b2;
        }
        StringBuilder sb = new StringBuilder(this.infoStickerModel.stickers.get(0).stickerId);
        for (int i = 1; i < this.infoStickerModel.stickers.size(); i++) {
            sb.append(",");
            sb.append(this.infoStickerModel.stickers.get(i).stickerId);
        }
        sb.append(",");
        sb.append(b2);
        return sb.toString();
    }

    public List<Integer> getVideoRotateArray() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76571, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76571, new Class[0], List.class);
        } else if (this.previewConfigure == null) {
            return Collections.singletonList(0);
        } else {
            ArrayList arrayList = new ArrayList();
            for (VEVideoSegment vEVideoSegment : this.previewConfigure.getVideoSegments()) {
                arrayList.add(Integer.valueOf(vEVideoSegment.rotate));
            }
            if (arrayList.isEmpty()) {
                arrayList.add(0);
            }
            return arrayList;
        }
    }

    public boolean hasStickers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76548, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76548, new Class[0], Boolean.TYPE)).booleanValue();
        }
        InteractStickerStruct interactStickerStruct = null;
        if (!TextUtils.isEmpty(this.mainBusinessData)) {
            interactStickerStruct = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.mainBusinessData, 1, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        }
        if (hasInfoStickers() || (interactStickerStruct != null && interactStickerStruct.getVoteStruct() != null)) {
            return true;
        }
        return false;
    }

    public boolean hasText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76573, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76573, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.infoStickerModel != null && !CollectionUtils.isEmpty(this.infoStickerModel.stickers)) {
            for (com.ss.android.ugc.aweme.n.b bVar : this.infoStickerModel.stickers) {
                if (bVar.type == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean shouldUploadExtractFrames() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76559, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76559, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(this.mStickerID) || ((this.mEffectList != null && !this.mEffectList.isEmpty()) || (this.infoStickerModel != null && Lists.notEmpty(this.infoStickerModel.stickers)))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean shouldUploadOriginalSound() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76558, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76558, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((this.mOrigin != 0 || isMusic() <= 0) && (((getWavFile() == null && !this.isFastImport) || this.mMusicPath == null || this.musicVolume <= 0.0f || this.voiceVolume <= 0.0f) && this.veAudioEffectParam == null)) {
            return false;
        } else {
            return true;
        }
    }

    public List<com.ss.android.ugc.aweme.music.b.a.a> getMediaModelList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76572, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76572, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.previewConfigure == null) {
            com.ss.android.ugc.aweme.music.b.a.a aVar = new com.ss.android.ugc.aweme.music.b.a.a(-1);
            aVar.f56315e = this.mPath;
            int[] iArr = new int[10];
            if (c.a(this.mPath, iArr) == 0) {
                aVar.l = iArr[0];
                aVar.m = iArr[1];
                aVar.h = (long) iArr[3];
                ai.c("success, length is " + iArr[3]);
            } else {
                aVar.l = this.mVideoWidth;
                aVar.m = this.mVideoHeight;
                aVar.h = (long) this.mVideoLength;
                ai.c("failed, length is " + this.mVideoLength);
            }
            arrayList.add(aVar);
        } else {
            for (VEVideoSegment transform : this.previewConfigure.getVideoSegments()) {
                arrayList.add(transform.transform());
            }
        }
        return arrayList;
    }

    public void setMicroAppId(String str) {
        this.microAppId = str;
    }

    public void setNewVersion(int i) {
        this.mNewVersion = i;
    }

    public void setVideoCoverPath(@Nullable String str) {
        this.videoCoverPath = str;
    }

    public cb(Parcel parcel) {
        super(parcel);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.aiMusicLogPbImprId = "";
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.mDuetFrom = "";
        boolean z12 = false;
        this.isMuted = false;
        this.uploadSpeedInfo = new b();
        this.mReversePath = parcel.readString();
        this.mPath = parcel.readString();
        this.mVideoWidth = parcel.readInt();
        this.mVideoHeight = parcel.readInt();
        this.mDir = parcel.readString();
        this.mWavFile = parcel.readString();
        this.mOutPutWavFile = parcel.readString();
        this.mCurFilterLabels = parcel.readString();
        this.mCurFilterIds = parcel.readString();
        this.mSmoothSkinLabels = parcel.readString();
        this.mReshapeLabels = parcel.readString();
        this.videoSpeed = parcel.readString();
        this.mMusicPath = parcel.readString();
        this.mVideoSegmentsDesc = parcel.readString();
        this.mStickerPath = parcel.readString();
        this.mStickerID = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mFromCut = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mFromMultiCut = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.faceBeautyOpen = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mWillGoOnShortVideo = z4;
        this.mOrigin = parcel.readInt();
        this.mHardEncode = parcel.readInt();
        this.mRestoreType = parcel.readInt();
        this.mFaceBeauty = parcel.readInt();
        this.mSelectedId = parcel.readInt();
        this.mCameraPosition = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.autoEnhanceOn = z5;
        this.autoEnhanceType = parcel.readInt();
        this.mMusicStart = parcel.readInt();
        this.mMusicEnd = parcel.readInt();
        this.mMusicOrigin = parcel.readString();
        this.mMusicShowRank = parcel.readInt();
        this.mMusicRecType = parcel.readInt();
        this.mUseFilter = parcel.readInt();
        this.mVideoCoverStartTm = parcel.readFloat();
        this.maxDuration = parcel.readLong();
        this.mTimeEffect = (EffectPointModel) parcel.readParcelable(EffectPointModel.class.getClassLoader());
        this.mEffectList = parcel.createTypedArrayList(EffectPointModel.CREATOR);
        this.importInfoList = parcel.createTypedArrayList(cf.CREATOR);
        this.audioTrack = (UrlModel) parcel.readSerializable();
        this.musicId = parcel.readString();
        this.mOutputFile = parcel.readString();
        this.mId3Title = parcel.readString();
        this.mId3Author = parcel.readString();
        this.mId3Album = parcel.readString();
        this.mMusicType = parcel.readInt();
        this.mDuetFrom = parcel.readString();
        this.mDuetAuthor = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mIsHuaweiSuperSlow = z6;
        this.mShootMode = parcel.readInt();
        this.creationId = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mDurationMode = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isMuted = z8;
        this.draftId = parcel.readInt();
        this.mEncodedAudioOutputFile = parcel.readString();
        this.mParallelUploadOutputFile = parcel.readString();
        this.voiceVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mIsMultiVideo = z9;
        this.shopDraftId = parcel.readString();
        this.mNewVersion = parcel.readInt();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.reactionParams = (i) parcel.readParcelable(i.class.getClassLoader());
        this.recordMode = parcel.readInt();
        this.gameScore = parcel.readInt();
        this.mEyesLabels = parcel.readString();
        this.mTanningLabels = parcel.readString();
        this.videoCoverPath = parcel.readString();
        this.microAppId = parcel.readString();
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.infoStickerModel = (a) parcel.readParcelable(a.class.getClassLoader());
        this.microAppModel = (q) parcel.readSerializable();
        this.texts = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.usePaint = z10;
        this.videoType = parcel.readInt();
        this.socialModel = (SocialModel) parcel.readParcelable(SocialModel.class.getClassLoader());
        this.storyBoomModel = (gi) parcel.readParcelable(gi.class.getClassLoader());
        this.md5 = parcel.readString();
        this.storyFestivalModel = (StoryFestivalModel) parcel.readParcelable(StoryFestivalModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isStoryTextRecord = z11;
        this.mentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
        this.mFirstStickerMusicIdsJson = parcel.readString();
        this.defaultSelectStickerPoi = (d) parcel.readSerializable();
        this.uploadMiscInfoStruct = (j) parcel.readSerializable();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (com.ss.android.ugc.aweme.x.a) parcel.readSerializable();
        this.previewConfigure = (VEPreviewConfigure) parcel.readParcelable(VEPreviewConfigure.class.getClassLoader());
        this.isFastImport = parcel.readByte() != 0 ? true : z12;
        this.fastImportResolution = parcel.readString();
        this.veCherEffectParam = (ah) parcel.readParcelable(ah.class.getClassLoader());
        this.mOutVideoWidth = parcel.readInt();
        this.mOutVideoHeight = parcel.readInt();
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.mVideoCanvasWidth = parcel.readInt();
        this.mVideoCanvasHeight = parcel.readInt();
        this.veAudioEffectParam = (AudioEffectParam) parcel.readParcelable(AudioEffectParam.class.getClassLoader());
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.uploadSpeedInfo = (b) parcel.readParcelable(b.class.getClassLoader());
        this.fastImportErrorCode = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76564, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76564, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mReversePath);
        parcel.writeString(this.mPath);
        parcel.writeInt(this.mVideoWidth);
        parcel.writeInt(this.mVideoHeight);
        parcel.writeString(this.mDir);
        parcel.writeString(this.mWavFile);
        parcel.writeString(this.mOutPutWavFile);
        parcel.writeString(this.mCurFilterLabels);
        parcel.writeString(this.mCurFilterIds);
        parcel.writeString(this.mSmoothSkinLabels);
        parcel.writeString(this.mReshapeLabels);
        parcel.writeString(this.videoSpeed);
        parcel.writeString(this.mMusicPath);
        parcel.writeString(this.mVideoSegmentsDesc);
        parcel.writeString(this.mStickerPath);
        parcel.writeString(this.mStickerID);
        parcel.writeByte(this.mFromCut ? (byte) 1 : 0);
        parcel.writeByte(this.mFromMultiCut ? (byte) 1 : 0);
        parcel.writeByte(this.faceBeautyOpen ? (byte) 1 : 0);
        parcel.writeByte(this.mWillGoOnShortVideo ? (byte) 1 : 0);
        parcel.writeInt(this.mOrigin);
        parcel.writeInt(this.mHardEncode);
        parcel.writeInt(this.mRestoreType);
        parcel.writeInt(this.mFaceBeauty);
        parcel.writeInt(this.mSelectedId);
        parcel.writeInt(this.mCameraPosition);
        parcel.writeInt(this.autoEnhanceOn ? 1 : 0);
        parcel.writeInt(this.autoEnhanceType);
        parcel.writeInt(this.mMusicStart);
        parcel.writeInt(this.mMusicEnd);
        parcel.writeString(this.mMusicOrigin);
        parcel.writeInt(this.mMusicShowRank);
        parcel.writeInt(this.mMusicRecType);
        parcel.writeInt(this.mUseFilter);
        parcel.writeFloat(this.mVideoCoverStartTm);
        parcel.writeLong(this.maxDuration);
        parcel.writeParcelable(this.mTimeEffect, i);
        parcel.writeTypedList(this.mEffectList);
        parcel.writeTypedList(this.importInfoList);
        parcel.writeSerializable(this.audioTrack);
        parcel.writeString(this.musicId);
        parcel.writeString(this.mOutputFile);
        parcel.writeString(this.mId3Title);
        parcel.writeString(this.mId3Author);
        parcel.writeString(this.mId3Album);
        parcel.writeInt(this.mMusicType);
        parcel.writeString(this.mDuetFrom);
        parcel.writeSerializable(this.mDuetAuthor);
        parcel.writeByte(this.mIsHuaweiSuperSlow ? (byte) 1 : 0);
        parcel.writeInt(this.mShootMode);
        parcel.writeString(this.creationId);
        parcel.writeByte(this.mDurationMode ? (byte) 1 : 0);
        parcel.writeByte(this.isMuted ? (byte) 1 : 0);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.mEncodedAudioOutputFile);
        parcel.writeString(this.mParallelUploadOutputFile);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeByte(this.mIsMultiVideo ? (byte) 1 : 0);
        parcel.writeString(this.shopDraftId);
        parcel.writeInt(this.mNewVersion);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeParcelable(this.reactionParams, i);
        parcel.writeInt(this.recordMode);
        parcel.writeInt(this.gameScore);
        parcel.writeString(this.mEyesLabels);
        parcel.writeString(this.mTanningLabels);
        parcel.writeString(this.videoCoverPath);
        parcel.writeString(this.microAppId);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeParcelable(this.infoStickerModel, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeStringList(this.texts);
        parcel.writeByte(this.usePaint ? (byte) 1 : 0);
        parcel.writeInt(this.videoType);
        parcel.writeParcelable(this.socialModel, i);
        parcel.writeParcelable(this.storyBoomModel, i);
        parcel.writeString(this.md5);
        parcel.writeParcelable(this.storyFestivalModel, i);
        parcel.writeByte(this.isStoryTextRecord ? (byte) 1 : 0);
        parcel.writeSerializable(this.mentionUserModel);
        parcel.writeString(this.mFirstStickerMusicIdsJson);
        parcel.writeSerializable(this.defaultSelectStickerPoi);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeParcelable(this.previewConfigure, i);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeString(this.fastImportResolution);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mOutVideoWidth);
        parcel.writeInt(this.mOutVideoHeight);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeInt(this.mVideoCanvasWidth);
        parcel.writeInt(this.mVideoCanvasHeight);
        parcel.writeParcelable(this.veAudioEffectParam, i);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeParcelable(this.uploadSpeedInfo, i);
        parcel.writeInt(this.fastImportErrorCode);
    }
}
