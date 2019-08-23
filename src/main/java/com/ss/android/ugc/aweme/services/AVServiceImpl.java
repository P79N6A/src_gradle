package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.common.a.s;
import com.google.common.a.t;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.AppContext;
import com.ss.android.ttve.nativePort.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.filter.ar;
import com.ss.android.ugc.aweme.filter.u;
import com.ss.android.ugc.aweme.framework.services.IPromptService;
import com.ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.musically.cut.MusVideoChooseFragment;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.d;
import com.ss.android.ugc.aweme.mediachoose.VideoChooseFragment;
import com.ss.android.ugc.aweme.photo.g;
import com.ss.android.ugc.aweme.photo.local.MediaChooseFragment;
import com.ss.android.ugc.aweme.port.in.IAVStoryProxyService;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.r;
import com.ss.android.ugc.aweme.port.in.w;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import com.ss.android.ugc.aweme.services.draft.DraftService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.ss.android.ugc.aweme.services.photo.IPhotoService;
import com.ss.android.ugc.aweme.services.photo.PhotoService;
import com.ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.ss.android.ugc.aweme.services.photomovie.PhotoMovieService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.services.publish.PublishServiceImpl;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.IUnLockStickerManagerService;
import com.ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl;
import com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl;
import com.ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.ss.android.ugc.aweme.services.story.IStorySettingService;
import com.ss.android.ugc.aweme.services.story.StorySettingServiceImpl;
import com.ss.android.ugc.aweme.services.upload.ITTUploaderConfigService;
import com.ss.android.ugc.aweme.services.upload.IUploadService;
import com.ss.android.ugc.aweme.services.video.AVPublishServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.IRecordActivityService;
import com.ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.ss.android.ugc.aweme.services.video.IVideoModelCoverService;
import com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService;
import com.ss.android.ugc.aweme.services.video.RecordActivityServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoModelCoverServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.services.videoprocess.IVideoProcessorsService;
import com.ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.dk;
import com.ss.android.ugc.aweme.shortvideo.dl;
import com.ss.android.ugc.aweme.shortvideo.e.f;
import com.ss.android.ugc.aweme.shortvideo.e.h;
import com.ss.android.ugc.aweme.shortvideo.e.i;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.er;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.gv;
import com.ss.android.ugc.aweme.shortvideo.local.ChooseMediaActivity;
import com.ss.android.ugc.aweme.shortvideo.q.b.c;
import com.ss.android.ugc.aweme.shortvideo.q.b.o;
import com.ss.android.ugc.aweme.shortvideo.sticker.q;
import com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.upload.j;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.tools.ad;
import com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity;
import com.ss.android.ugc.aweme.tools.policysecurity.a;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.views.k;
import com.ss.android.ugc.effectmanager.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.ah;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Keep
public class AVServiceImpl implements IAVService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IAVPublishService avPublishService;
    private IAVSettingsService avSettingsService;
    private IDraftService draftService;
    private IEffectService effectService;
    private ar filterService = new FilterServiceImpl();
    private IPhotoMovieService photoMovieService;
    private IPhotoProcessService photoProcessService;
    private IPhotoService photoService;
    private IPublishService publishService;
    private ISDKService sdkService;
    private IShortVideoConfig shortVideoConfig;
    private IStickerUtilsService stickerUtilsService;
    private final s<IAVStoryProxyService> storyProxyServiceSupplier = t.a(AVServiceImpl$$Lambda$1.$instance);
    private s<IStoryRecordService> storyRecordServiceSupplier = t.a(AVServiceImpl$$Lambda$0.$instance);
    private ITTUploaderConfigService ttUploaderConfigService;
    private IUnLockStickerManagerService unLockStickerManagerService;
    private IUploadService uploadService;
    private IVideo2GifService video2GifService;
    private IVideoCoverService videoCoverService;
    private IVideoProcessorsService videoProcessorsService;
    private IWaterMarkService waterMarkService;

    public void fetchWhiteListStickerIdsForInteraction(IAVService.IFetchInteractionStickerIdListener iFetchInteractionStickerIdListener) {
    }

    public String getEffectSDKVersion() {
        return "4.9.0_rel_8_douyin_201908051433_ab2890f94";
    }

    public int getMusicWaveBeanRemainProgress(int i) {
        return 99;
    }

    public float getStoryEditAlpha() {
        return 0.3137255f;
    }

    public String getVESDKVersion() {
        return "4.9.0.55";
    }

    public r getCommerceService() {
        return a.n;
    }

    public ar getFilterService() {
        return this.filterService;
    }

    public w getLiveService() {
        return a.u;
    }

    public Class<?> getMediaChooseFragmentClass() {
        return MediaChooseFragment.class;
    }

    public Class<? extends Activity> getRecordPermissionActivity() {
        return VideoRecordPermissionActivity.class;
    }

    public Class<?> getShortVideoContextClass() {
        return fh.class;
    }

    public Gson provideAvGson() {
        return a.f61120c;
    }

    static final /* synthetic */ IStoryRecordService lambda$new$0$AVServiceImpl() {
        return (IStoryRecordService) ServiceManager.get().getService(IStoryRecordService.class);
    }

    static final /* synthetic */ IAVStoryProxyService lambda$new$1$AVServiceImpl() {
        return (IAVStoryProxyService) ServiceManager.get().getService(IAVStoryProxyService.class);
    }

    static {
        ez ezVar = ez.f75859d;
        if (PatchProxy.isSupport(new Object[0], ezVar, ez.f75856a, false, 88692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], ezVar, ez.f75856a, false, 88692, new Class[0], Void.TYPE);
            return;
        }
        b.f31280c = ez.a.f75861b;
    }

    public IAVSettingsService avSettingsService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71170, new Class[0], IAVSettingsService.class)) {
            return (IAVSettingsService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71170, new Class[0], IAVSettingsService.class);
        }
        if (this.avSettingsService == null) {
            this.avSettingsService = new AVSettingsServiceImpl();
        }
        return this.avSettingsService;
    }

    public String chooseMediaActivityName() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71187, new Class[0], String.class)) {
            return ChooseMediaActivity.class.getName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71187, new Class[0], String.class);
    }

    public boolean containsRecordPage() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71230, new Class[0], Boolean.TYPE)) {
            return isRecording();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71230, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public h createMaxDurationResolver() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71183, new Class[0], h.class)) {
            return new i();
        }
        return (h) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71183, new Class[0], h.class);
    }

    public IDraftService draftService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71172, new Class[0], IDraftService.class)) {
            return (IDraftService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71172, new Class[0], IDraftService.class);
        }
        if (this.draftService == null) {
            this.draftService = new DraftService();
        }
        return this.draftService;
    }

    public IEffectService effectService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71188, new Class[0], IEffectService.class)) {
            return (IEffectService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71188, new Class[0], IEffectService.class);
        }
        if (this.effectService == null) {
            this.effectService = new EffectService();
        }
        return this.effectService;
    }

    public String getFilterFaceReshapeDir() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71178, new Class[0], String.class)) {
            return u.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71178, new Class[0], String.class);
    }

    public File getLrcExternalCacheDir() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71195, new Class[0], File.class)) {
            return a.i.c();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71195, new Class[0], File.class);
    }

    public int getMediaChooserMaxVideoDuration() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71186, new Class[0], Integer.TYPE)) {
            return com.ss.android.ugc.aweme.mediachoose.a.a.a().f55246d;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71186, new Class[0], Integer.TYPE)).intValue();
    }

    public int getMediaChooserMinVideoDuration() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71185, new Class[0], Integer.TYPE)) {
            return com.ss.android.ugc.aweme.mediachoose.a.a.a().f55245c;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71185, new Class[0], Integer.TYPE)).intValue();
    }

    public IPublishService getPublishService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71174, new Class[0], IPublishService.class)) {
            return (IPublishService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71174, new Class[0], IPublishService.class);
        }
        if (this.publishService == null) {
            this.publishService = new PublishServiceImpl();
        }
        return this.publishService;
    }

    public ISDKService getSDKService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71203, new Class[0], ISDKService.class)) {
            return (ISDKService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71203, new Class[0], ISDKService.class);
        }
        if (this.sdkService == null) {
            this.sdkService = new SDKServiceImpl();
        }
        return this.sdkService;
    }

    public IStickerUtilsService getStickerUtilsService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71204, new Class[0], IStickerUtilsService.class)) {
            return (IStickerUtilsService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71204, new Class[0], IStickerUtilsService.class);
        }
        if (this.stickerUtilsService == null) {
            this.stickerUtilsService = new StickerUtilsServiceImpl();
        }
        return this.stickerUtilsService;
    }

    public IUploadService getUploadService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71216, new Class[0], IUploadService.class)) {
            return (IUploadService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71216, new Class[0], IUploadService.class);
        }
        if (this.uploadService == null) {
            this.uploadService = new j();
        }
        return this.uploadService;
    }

    public boolean getUsingOnline() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71235, new Class[0], Boolean.TYPE)) {
            return ad.f74603c.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71235, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public IVideoRecordEntranceService getVideoRecordEntranceService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71232, new Class[0], IVideoRecordEntranceService.class)) {
            return VideoRecordEntranceServiceImpl.getINSTANCE();
        }
        return (IVideoRecordEntranceService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71232, new Class[0], IVideoRecordEntranceService.class);
    }

    public void initVideoImportConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71243, new Class[0], Void.TYPE);
            return;
        }
        a.r.invalidate();
    }

    public void initVideoRecordConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71242, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71242, new Class[0], Void.TYPE);
            return;
        }
        a.q.invalidate();
    }

    public boolean isLongVideoPermitted() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71181, new Class[0], Boolean.TYPE)) {
            return f.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71181, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isRecording() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71231, new Class[0], Boolean.TYPE)) {
            return a.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71231, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void loadVESDKSO() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71246, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71246, new Class[0], Void.TYPE);
            return;
        }
        if (a.M.a(a.C0682a.OpenCameraFrameOptimizePreLoadSo)) {
            b.a();
            com.ss.android.ugc.aweme.port.in.a.f();
        }
    }

    public boolean needLoginBeforeRecord() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71207, new Class[0], Boolean.TYPE)) {
            return er.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71207, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public IPhotoMovieService photoMovieService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71171, new Class[0], IPhotoMovieService.class)) {
            return (IPhotoMovieService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71171, new Class[0], IPhotoMovieService.class);
        }
        if (this.photoMovieService == null) {
            this.photoMovieService = new PhotoMovieService();
        }
        return this.photoMovieService;
    }

    public IPhotoProcessService photoProcessService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71189, new Class[0], IPhotoProcessService.class)) {
            return (IPhotoProcessService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71189, new Class[0], IPhotoProcessService.class);
        }
        if (this.photoProcessService == null) {
            this.photoProcessService = new com.ss.android.ugc.aweme.photo.a.a();
        }
        return this.photoProcessService;
    }

    public IPhotoService photoService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71175, new Class[0], IPhotoService.class)) {
            return (IPhotoService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71175, new Class[0], IPhotoService.class);
        }
        if (this.photoService == null) {
            this.photoService = new PhotoService();
        }
        return this.photoService;
    }

    public IPromptService promptService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71252, new Class[0], IPromptService.class)) {
            return new com.ss.android.ugc.aweme.shortvideo.edit.t();
        }
        return (IPromptService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71252, new Class[0], IPromptService.class);
    }

    public com.bef.effectsdk.b provideResourceFinder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71241, new Class[0], com.bef.effectsdk.b.class)) {
            return (com.bef.effectsdk.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71241, new Class[0], com.bef.effectsdk.b.class);
        }
        com.ss.android.ugc.aweme.port.in.a.e();
        return c.b().d();
    }

    public IAVPublishService publishService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71190, new Class[0], IAVPublishService.class)) {
            return (IAVPublishService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71190, new Class[0], IAVPublishService.class);
        }
        if (this.avPublishService == null) {
            this.avPublishService = new AVPublishServiceImpl();
        }
        return this.avPublishService;
    }

    public IRecordActivityService recordActivityService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71220, new Class[0], IRecordActivityService.class)) {
            return RecordActivityServiceImpl.getInstance();
        }
        return (IRecordActivityService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71220, new Class[0], IRecordActivityService.class);
    }

    public IShortVideoConfig shortVideoConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71217, new Class[0], IShortVideoConfig.class)) {
            return (IShortVideoConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71217, new Class[0], IShortVideoConfig.class);
        }
        if (this.shortVideoConfig == null) {
            this.shortVideoConfig = new ShortVideoConfigImpl();
        }
        return this.shortVideoConfig;
    }

    public IStoryRecordService storyRecordService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71196, new Class[0], IStoryRecordService.class)) {
            return (IStoryRecordService) this.storyRecordServiceSupplier.get();
        }
        return (IStoryRecordService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71196, new Class[0], IStoryRecordService.class);
    }

    public IStorySettingService storySettingService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71221, new Class[0], IStorySettingService.class)) {
            return StorySettingServiceImpl.getINSTANCE();
        }
        return (IStorySettingService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71221, new Class[0], IStorySettingService.class);
    }

    public ITTUploaderConfigService ttUploaderConfigService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71176, new Class[0], ITTUploaderConfigService.class)) {
            return (ITTUploaderConfigService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71176, new Class[0], ITTUploaderConfigService.class);
        }
        if (this.ttUploaderConfigService == null) {
            this.ttUploaderConfigService = new gv();
        }
        return this.ttUploaderConfigService;
    }

    public IUnLockStickerManagerService unLockStickerManagerService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71202, new Class[0], IUnLockStickerManagerService.class)) {
            return (IUnLockStickerManagerService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71202, new Class[0], IUnLockStickerManagerService.class);
        }
        if (this.unLockStickerManagerService == null) {
            this.unLockStickerManagerService = new UnLockStickerManagerServiceImpl();
        }
        return this.unLockStickerManagerService;
    }

    public IVideo2GifService video2GifService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71208, new Class[0], IVideo2GifService.class)) {
            return (IVideo2GifService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71208, new Class[0], IVideo2GifService.class);
        }
        if (this.video2GifService == null) {
            this.video2GifService = new com.ss.android.ugc.aweme.shortvideo.cut.gif.h();
        }
        return this.video2GifService;
    }

    public IVideoCoverService videoCoverService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71218, new Class[0], IVideoCoverService.class)) {
            return (IVideoCoverService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71218, new Class[0], IVideoCoverService.class);
        }
        if (this.videoCoverService == null) {
            this.videoCoverService = new VideoCoverServiceImpl();
        }
        return this.videoCoverService;
    }

    public IVideoModelCoverService videoModelCoverService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71222, new Class[0], IVideoModelCoverService.class)) {
            return VideoModelCoverServiceImpl.getINSTANCE();
        }
        return (IVideoModelCoverService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71222, new Class[0], IVideoModelCoverService.class);
    }

    public IVideoProcessorsService videoProcessorsService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71219, new Class[0], IVideoProcessorsService.class)) {
            return (IVideoProcessorsService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71219, new Class[0], IVideoProcessorsService.class);
        }
        if (this.videoProcessorsService == null) {
            this.videoProcessorsService = new com.ss.android.ugc.aweme.shortvideo.q.b();
        }
        return this.videoProcessorsService;
    }

    public IWaterMarkService waIWaterMarkService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71173, new Class[0], IWaterMarkService.class)) {
            return (IWaterMarkService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71173, new Class[0], IWaterMarkService.class);
        }
        if (this.waterMarkService == null) {
            this.waterMarkService = new o();
        }
        return this.waterMarkService;
    }

    public void hookVESDKSO() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71247, new Class[0], Void.TYPE);
            return;
        }
        ez ezVar = ez.f75859d;
        if (PatchProxy.isSupport(new Object[0], ezVar, ez.f75856a, false, 88693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], ezVar, ez.f75856a, false, 88693, new Class[0], Void.TYPE);
            return;
        }
        ez.f75858c = true;
        ezVar.a();
    }

    public void updateNewPermission() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71180, new Class[0], Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, f.f66819a, true, 75291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f.f66819a, true, 75291, new Class[0], Void.TYPE);
        } else {
            f.f66820b = !com.ss.android.ugc.aweme.port.in.a.L.a(e.a.LongVideoPermitted);
        }
    }

    public File getExternalFaceCacheDir() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71177, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71177, new Class[0], File.class);
        } else if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69262a, true, 79044, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69262a, true, 79044, new Class[0], File.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69262a, true, 79053, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69262a, true, 79053, new Class[0], Void.TYPE);
            } else if (!bm.a(com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69263b)) {
                new File(com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69263b).mkdirs();
            }
            return new File(com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69263b);
        }
    }

    public String getShortVideoContextMainBusinessData(Object obj) {
        return ((fh) obj).ae;
    }

    public IVideoChoose convertVideoChoose(Fragment fragment) {
        if (fragment instanceof MusVideoChooseFragment) {
            return (MusVideoChooseFragment) fragment;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.f lambda$getAvMusicWaveBean$4$AVServiceImpl(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getMusicWaveBean(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$getMusicWaveBean$2$AVServiceImpl(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.ss.android.ugc.aweme.port.in.a.H.f().a(getMusicWaveBean(str));
    }

    public FaceStickerBean convertEffect2FaceStickerBean(Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, this, changeQuickRedirect, false, 71223, new Class[]{Effect.class}, FaceStickerBean.class)) {
            return q.a(effect);
        }
        return (FaceStickerBean) PatchProxy.accessDispatch(new Object[]{effect}, this, changeQuickRedirect, false, 71223, new Class[]{Effect.class}, FaceStickerBean.class);
    }

    public k createMusLiveView(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 71233, new Class[]{Context.class}, k.class)) {
            return new d();
        }
        return (k) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 71233, new Class[]{Context.class}, k.class);
    }

    public int[] extractVideoFileInfo(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71199, new Class[]{String.class}, int[].class)) {
            return ah.a(str);
        }
        return (int[]) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71199, new Class[]{String.class}, int[].class);
    }

    public List<com.ss.android.ugc.aweme.music.b.a.a> getMediaLoaderImages(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 71224, new Class[]{Context.class}, List.class)) {
            return g.a(context);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 71224, new Class[]{Context.class}, List.class);
    }

    public IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71251, new Class[]{Context.class}, IVideoLegalCheckerAndToastService.class)) {
            return new com.ss.android.ugc.aweme.mediachoose.b(context2);
        }
        return (IVideoLegalCheckerAndToastService) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71251, new Class[]{Context.class}, IVideoLegalCheckerAndToastService.class);
    }

    public void initAIMusicSettings(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71194, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71194, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.port.in.a.i.c(str2);
    }

    public void prefetchTypeface(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71245, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71245, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().a(context2);
    }

    private com.ss.android.ugc.aweme.shortvideo.f getMusicWaveBean(String str) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71250, new Class[]{String.class}, com.ss.android.ugc.aweme.shortvideo.f.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.f) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71250, new Class[]{String.class}, com.ss.android.ugc.aweme.shortvideo.f.class);
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.i.b(str2);
        if (b2 < 0 || b2 > 90000) {
            return null;
        }
        if (b2 > 0) {
            i = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(b2, true);
        } else {
            i = 2000;
        }
        if (i <= 0) {
            i = 2000;
        }
        return com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(VEUtils.getMusicWaveData(str2, 0, i));
    }

    public String createMainBusinessContextJson(com.ss.android.ugc.aweme.common.w wVar) {
        com.ss.android.ugc.aweme.common.w wVar2 = wVar;
        if (PatchProxy.isSupport(new Object[]{wVar2}, this, changeQuickRedirect, false, 71225, new Class[]{com.ss.android.ugc.aweme.common.w.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{wVar2}, this, changeQuickRedirect, false, 71225, new Class[]{com.ss.android.ugc.aweme.common.w.class}, String.class);
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e eVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e();
        eVar.setShareContext(wVar2);
        return com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().toJson((Object) eVar);
    }

    public IAVService.IPermissionSettingItem createPermissionSettingItem(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71228, new Class[]{Context.class}, IAVService.IPermissionSettingItem.class)) {
            return (IAVService.IPermissionSettingItem) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71228, new Class[]{Context.class}, IAVService.IPermissionSettingItem.class);
        }
        final PermissionSettingItem permissionSettingItem = new PermissionSettingItem(context2, null);
        return new IAVService.IPermissionSettingItem() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public View asView() {
                return permissionSettingItem;
            }

            public DmtTextView getPrivateHint() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71260, new Class[0], DmtTextView.class)) {
                    return (DmtTextView) permissionSettingItem.findViewById(C0906R.id.c6e);
                }
                return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71260, new Class[0], DmtTextView.class);
            }

            public ImageView getPrivateIcon() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71259, new Class[0], ImageView.class)) {
                    return (ImageView) permissionSettingItem.findViewById(C0906R.id.c6h);
                }
                return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71259, new Class[0], ImageView.class);
            }

            public void setPermission(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71261, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71261, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                permissionSettingItem.setPermission(i);
            }
        };
    }

    public IVideoChoose createVideoChooseFragment(IVideoChoose.Callback callback) {
        MusVideoChooseFragment musVideoChooseFragment;
        if (PatchProxy.isSupport(new Object[]{callback}, this, changeQuickRedirect, false, 71192, new Class[]{IVideoChoose.Callback.class}, IVideoChoose.class)) {
            return (IVideoChoose) PatchProxy.accessDispatch(new Object[]{callback}, this, changeQuickRedirect, false, 71192, new Class[]{IVideoChoose.Callback.class}, IVideoChoose.class);
        }
        if (PatchProxy.isSupport(new Object[0], null, MusVideoChooseFragment.f29726a, true, 49948, new Class[0], MusVideoChooseFragment.class)) {
            musVideoChooseFragment = (MusVideoChooseFragment) PatchProxy.accessDispatch(new Object[0], null, MusVideoChooseFragment.f29726a, true, 49948, new Class[0], MusVideoChooseFragment.class);
        } else {
            musVideoChooseFragment = new MusVideoChooseFragment();
        }
        return musVideoChooseFragment;
    }

    public String detectIsFromEditOrStory(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71193, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71193, new Class[]{Context.class}, String.class);
        }
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.get();
        if (iAVStoryProxyService != null) {
            return iAVStoryProxyService.detectIsFromEditOrStory(context2);
        }
        if (context2 instanceof VEVideoPublishEditActivity) {
            return "video_edit_page";
        }
        return null;
    }

    public com.ss.android.ugc.aweme.common.w getMainBusinessContextShareContext(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71226, new Class[]{String.class}, com.ss.android.ugc.aweme.common.w.class)) {
            return (com.ss.android.ugc.aweme.common.w) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71226, new Class[]{String.class}, com.ss.android.ugc.aweme.common.w.class);
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e eVar = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e) com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().fromJson(str2, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e.class);
        if (eVar == null) {
            return null;
        }
        return eVar.getShareContext();
    }

    public Map getTrickyMapByActivity(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71239, new Class[]{Context.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71239, new Class[]{Context.class}, Map.class);
        }
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.get();
        if (iAVStoryProxyService != null) {
            return iAVStoryProxyService.getTrickyMapByActivity(context2);
        }
        if (context2 instanceof VEVideoPublishEditActivity) {
            return ((VEVideoPublishEditActivity) context2).Q();
        }
        return null;
    }

    public Typeface getTypefaceByFontName(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71244, new Class[]{String.class}, Typeface.class)) {
            return com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().b(str2);
        }
        return (Typeface) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71244, new Class[]{String.class}, Typeface.class);
    }

    public boolean isShortVideoContextViewModelDurationEmppy(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, this, changeQuickRedirect, false, 71209, new Class[]{FragmentActivity.class}, Boolean.TYPE)) {
            return ((ShortVideoContextViewModel) ViewModelProviders.of(fragmentActivity).get(ShortVideoContextViewModel.class)).f65401b.m.isEmpty();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, this, changeQuickRedirect, false, 71209, new Class[]{FragmentActivity.class}, Boolean.TYPE)).booleanValue();
    }

    public void openAVSchemaTestActivity(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71234, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71234, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, AVSchemaTestActivity.class);
        if (!(context2 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context2.startActivity(intent);
    }

    public void setFontTypeList(List<com.ss.android.ugc.aweme.story.shootvideo.textfont.c> list) {
        List<com.ss.android.ugc.aweme.story.shootvideo.textfont.c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 71206, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 71206, new Class[]{List.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.textfont.d a2 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a();
        if (PatchProxy.isSupport(new Object[]{list2}, a2, com.ss.android.ugc.aweme.story.shootvideo.textfont.d.f74170a, false, 86086, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, a2, com.ss.android.ugc.aweme.story.shootvideo.textfont.d.f74170a, false, 86086, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a2.a(list2);
        a2.b(list2);
    }

    public void turnStoryRecordPage(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 71205, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 71205, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{intent2}, null, com.ss.android.ugc.aweme.y.b.f76942a, true, 62690, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, null, com.ss.android.ugc.aweme.y.b.f76942a, true, 62690, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.main.c.i(intent2));
    }

    public List<String> gatherFilesToBeUploaded(Context context) {
        Object obj;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71238, new Class[]{Context.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71238, new Class[]{Context.class}, List.class);
        }
        if (PatchProxy.isSupport(new Object[]{context2}, null, com.ss.android.ugc.aweme.tools.policysecurity.a.f74921a, true, 87242, new Class[]{Context.class}, String[].class)) {
            obj = PatchProxy.accessDispatch(new Object[]{context2}, null, com.ss.android.ugc.aweme.tools.policysecurity.a.f74921a, true, 87242, new Class[]{Context.class}, String[].class);
        } else {
            a.C0782a aVar = com.ss.android.ugc.aweme.tools.policysecurity.a.f74922b;
            if (PatchProxy.isSupport(new Object[]{context2}, aVar, a.C0782a.f74923a, false, 87243, new Class[]{Context.class}, String[].class)) {
                Object[] objArr = {context2};
                a.C0782a aVar2 = aVar;
                obj = PatchProxy.accessDispatch(objArr, aVar2, a.C0782a.f74923a, false, 87243, new Class[]{Context.class}, String[].class);
            } else {
                Intrinsics.checkParameterIsNotNull(context2, "context");
                Iterable<com.ss.android.ugc.aweme.tools.policysecurity.c> a2 = com.ss.android.ugc.aweme.tools.policysecurity.b.f74926c.a(context2).a();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
                for (com.ss.android.ugc.aweme.tools.policysecurity.c cVar : a2) {
                    arrayList.add(cVar.f74932e);
                }
                obj = ((List) arrayList).toArray(new String[0]);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        return Arrays.asList((String[]) obj);
    }

    public void setLongVideoPermitted(boolean z) {
        long j;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71182, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 71182, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, null, f.f66819a, true, 75293, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f.f66819a, true, 75293, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.port.in.a.L.a(e.a.LongVideoPermitted, z2);
        e eVar = com.ss.android.ugc.aweme.port.in.a.L;
        e.a aVar = e.a.LongVideoThreshold;
        if (z2) {
            j = 60000;
        } else {
            j = 0;
        }
        eVar.a(aVar, j);
    }

    public void setUsingOnline(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71236, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 71236, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ad adVar = ad.f74603c;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, adVar, ad.f74601a, false, 86974, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, adVar, ad.f74601a, false, 86974, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ad.f74602b = z2;
        com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "effect_setting", 0).edit().putBoolean("key_effect_channle", z2).apply();
    }

    static final /* synthetic */ Object lambda$getAvMusicWaveBean$5$AVServiceImpl(IAVService.MusicWaveDataListener musicWaveDataListener, a.i iVar) throws Exception {
        if (musicWaveDataListener != null) {
            if (iVar == null) {
                musicWaveDataListener.onFinish(null);
            } else {
                musicWaveDataListener.onFinish(iVar.e());
            }
        }
        return null;
    }

    static final /* synthetic */ Object lambda$getMusicWaveBean$3$AVServiceImpl(IAVService.MusicWaveDataListener musicWaveDataListener, a.i iVar) throws Exception {
        if (musicWaveDataListener != null) {
            if (iVar == null) {
                musicWaveDataListener.onFinish(null);
            } else {
                musicWaveDataListener.onFinish(iVar.e());
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fetchResourcesNeededByRequirements(java.lang.String[] r20, com.ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService$IFetchResourcesListener> r4 = com.ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 71240(0x11648, float:9.9829E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 71240(0x11648, float:9.9829E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService$IFetchResourcesListener> r1 = com.ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            com.ss.android.ugc.aweme.port.in.a.e()
            com.ss.android.ugc.effectmanager.c r2 = com.ss.android.ugc.effectmanager.c.b()
            com.ss.android.ugc.aweme.services.AVServiceImpl$3 r3 = new com.ss.android.ugc.aweme.services.AVServiceImpl$3
            r4 = r19
            r3.<init>(r1)
            com.ss.android.ugc.effectmanager.c$4 r1 = new com.ss.android.ugc.effectmanager.c$4
            r1.<init>(r0)
            java.util.concurrent.ExecutorService r5 = a.i.f1051a
            a.i r1 = a.i.a((java.util.concurrent.Callable<TResult>) r1, (java.util.concurrent.Executor) r5)
            com.ss.android.ugc.effectmanager.c$3 r5 = new com.ss.android.ugc.effectmanager.c$3
            r5.<init>(r3, r0)
            r1.a((a.g<TResult, TContinuationResult>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.AVServiceImpl.fetchResourcesNeededByRequirements(java.lang.String[], com.ss.android.ugc.aweme.services.IAVService$IFetchResourcesListener):void");
    }

    public void startCutMultiVideoActivity(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 71197, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 71197, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        VECutVideoActivity.f66190b.a(context2, intent2);
    }

    public void startStoryEditActivity(Activity activity, Intent intent) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2}, this, changeQuickRedirect, false, 71215, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2}, this, changeQuickRedirect, false, 71215, new Class[]{Activity.class, Intent.class}, Void.TYPE);
            return;
        }
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.get();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStoryEditActivity(activity2, intent2);
        }
    }

    public void startToolPermissionActivity(Activity activity, Intent intent) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2}, this, changeQuickRedirect, false, 71227, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2}, this, changeQuickRedirect, false, 71227, new Class[]{Activity.class, Intent.class}, Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(activity2, intent2);
    }

    public String addEffectChannelIfNeeded(AppContext appContext, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{appContext, str3}, this, changeQuickRedirect, false, 71237, new Class[]{AppContext.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{appContext, str3}, this, changeQuickRedirect, false, 71237, new Class[]{AppContext.class, String.class}, String.class);
        }
        ad adVar = ad.f74603c;
        if (PatchProxy.isSupport(new Object[]{appContext, str3}, adVar, ad.f74601a, false, 86976, new Class[]{AppContext.class, String.class}, String.class)) {
            Class[] clsArr = {AppContext.class, String.class};
            return (String) PatchProxy.accessDispatch(new Object[]{appContext, str3}, adVar, ad.f74601a, false, 86976, clsArr, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "srcUrl");
        if (!com.ss.android.ugc.aweme.g.a.a() || TextUtils.isEmpty(str3) || appContext == null) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append("&effect_channel=");
        if (PatchProxy.isSupport(new Object[]{appContext}, adVar, ad.f74601a, false, 86977, new Class[]{AppContext.class}, String.class)) {
            ad adVar2 = adVar;
            str2 = (String) PatchProxy.accessDispatch(new Object[]{appContext}, adVar2, ad.f74601a, false, 86977, new Class[]{AppContext.class}, String.class);
        } else {
            str2 = appContext.getTweakedChannel();
            if (TextUtils.equals("local_test", str2) && adVar.a()) {
                str2 = "default";
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "effectChannel");
        }
        sb.append(str2);
        return sb.toString();
    }

    public IAVService.IPermissionModule createPermissionModule(Activity activity, IAVService.IPermissionSettingItem iPermissionSettingItem, int i) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, iPermissionSettingItem, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71229, new Class[]{Activity.class, IAVService.IPermissionSettingItem.class, Integer.TYPE}, IAVService.IPermissionModule.class)) {
            return (IAVService.IPermissionModule) PatchProxy.accessDispatch(new Object[]{activity2, iPermissionSettingItem, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71229, new Class[]{Activity.class, IAVService.IPermissionSettingItem.class, Integer.TYPE}, IAVService.IPermissionModule.class);
        }
        final dl dlVar = new dl(activity2, (PermissionSettingItem) iPermissionSettingItem.asView(), i);
        return new IAVService.IPermissionModule() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onSaveInstanceState(Bundle bundle) {
                Bundle bundle2 = bundle;
                if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 71264, new Class[]{Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 71264, new Class[]{Bundle.class}, Void.TYPE);
                    return;
                }
                dlVar.a(bundle2);
            }

            public void receivePermissionResult(Intent intent) {
                Intent intent2 = intent;
                if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 71263, new Class[]{Intent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 71263, new Class[]{Intent.class}, Void.TYPE);
                    return;
                }
                dlVar.a(intent2);
            }

            public void restoreSavedInstanceState(Bundle bundle) {
                Bundle bundle2 = bundle;
                if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 71265, new Class[]{Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 71265, new Class[]{Bundle.class}, Void.TYPE);
                    return;
                }
                dlVar.b(bundle2);
            }

            public void setupByActivity(dk dkVar) {
                dk dkVar2 = dkVar;
                if (PatchProxy.isSupport(new Object[]{dkVar2}, this, changeQuickRedirect, false, 71262, new Class[]{dk.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dkVar2}, this, changeQuickRedirect, false, 71262, new Class[]{dk.class}, Void.TYPE);
                    return;
                }
                dl dlVar = dlVar;
                if (PatchProxy.isSupport(new Object[]{dkVar2}, dlVar, dl.f66767a, false, 74261, new Class[]{dk.class}, Void.TYPE)) {
                    dl dlVar2 = dlVar;
                    PatchProxy.accessDispatch(new Object[]{dkVar2}, dlVar2, dl.f66767a, false, 74261, new Class[]{dk.class}, Void.TYPE);
                    return;
                }
                dlVar.f66770d.a(new View.OnClickListener(dkVar2) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f66775a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ dk f66776b;

                    public final void onClick(View view) {
                        int i;
                        String str;
                        if (PatchProxy.isSupport(new Object[]{view}, this, f66775a, false, 74269, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f66775a, false, 74269, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        Activity activity = dl.this.f66769c;
                        int i2 = dl.this.f66771e;
                        int permission = dl.this.f66770d.getPermission();
                        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(permission), Integer.valueOf(C0906R.string.afe), Integer.valueOf(C0906R.string.afd), 2}, null, PublishPermissionActivity.f65392a, true, 74436, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            i = 5;
                            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(permission), Integer.valueOf(C0906R.string.afe), Integer.valueOf(C0906R.string.afd), 2}, null, PublishPermissionActivity.f65392a, true, 74436, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else {
                            i = 5;
                            Intent intent = new Intent(activity, PublishPermissionActivity.class);
                            intent.putExtra("extra.TYPE", i2);
                            intent.putExtra("extra.PERMISSION", permission);
                            intent.putExtra("extra.Private.DESCRIPTION", C0906R.string.afe);
                            intent.putExtra("extra.Friend.DESCRIPTION", C0906R.string.afd);
                            activity.startActivityForResult(intent, 2);
                        }
                        com.ss.android.ugc.aweme.common.t tVar = new com.ss.android.ugc.aweme.common.t();
                        if (dl.this.f66771e == i) {
                            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        } else {
                            str = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("scope_click").setLabelName("edit_page").setJsonObject(tVar.a("is_photo", str).a()));
                    }

                    {
                        this.f66776b = r2;
                    }
                });
                if (com.ss.android.g.a.b() && !com.ss.android.ugc.aweme.port.in.a.L.a(e.a.PrivateAvailable)) {
                    dlVar.f66770d.setVisibility(8);
                }
            }
        };
    }

    public void getVideoCover(String str, int i, OnGetVideoCoverCallback onGetVideoCoverCallback) {
        String str2 = str;
        OnGetVideoCoverCallback onGetVideoCoverCallback2 = onGetVideoCoverCallback;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), onGetVideoCoverCallback2}, this, changeQuickRedirect, false, 71200, new Class[]{String.class, Integer.TYPE, OnGetVideoCoverCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), onGetVideoCoverCallback2}, this, changeQuickRedirect, false, 71200, new Class[]{String.class, Integer.TYPE, OnGetVideoCoverCallback.class}, Void.TYPE);
            return;
        }
        videoCoverService().getVideoCoverByCallback(str2, i, onGetVideoCoverCallback2);
    }

    public void startCutMultiVideoActivityForResult(Activity activity, Intent intent, int i) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71198, new Class[]{Activity.class, Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71198, new Class[]{Activity.class, Intent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        VECutVideoActivity.f66190b.a(activity2, intent2, i);
    }

    public void startVideoEditActivity(Context context, Intent intent, int i) {
        if (PatchProxy.isSupport(new Object[]{context, intent, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71191, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71191, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        VEVideoPublishEditActivity.a(context, intent, i);
    }

    public com.ss.android.ugc.aweme.shortvideo.f getAvMusicWaveBean(String str, boolean z, IAVService.MusicWaveDataListener musicWaveDataListener) {
        String str2 = str;
        IAVService.MusicWaveDataListener musicWaveDataListener2 = musicWaveDataListener;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), musicWaveDataListener2}, this, changeQuickRedirect, false, 71249, new Class[]{String.class, Boolean.TYPE, IAVService.MusicWaveDataListener.class}, com.ss.android.ugc.aweme.shortvideo.f.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.f) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), musicWaveDataListener2}, this, changeQuickRedirect, false, 71249, new Class[]{String.class, Boolean.TYPE, IAVService.MusicWaveDataListener.class}, com.ss.android.ugc.aweme.shortvideo.f.class);
        } else if (!z) {
            a.i.a((Callable<TResult>) new AVServiceImpl$$Lambda$4<TResult>(this, str2)).a((a.g<TResult, TContinuationResult>) new AVServiceImpl$$Lambda$5<TResult,TContinuationResult>(musicWaveDataListener2), a.i.f1052b);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return getMusicWaveBean(str);
        }
    }

    public Void requestReactDuetSettings(String str, String str2, String str3) throws Exception {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 71210, new Class[]{String.class, String.class, String.class}, Void.class)) {
            return (Void) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 71210, new Class[]{String.class, String.class, String.class}, Void.class);
        }
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, com.ss.android.ugc.aweme.detail.api.a.f41158a, true, 34728, new Class[]{String.class, String.class, String.class}, Void.class)) {
            return (Void) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, com.ss.android.ugc.aweme.detail.api.a.f41158a, true, 34728, new Class[]{String.class, String.class, String.class}, Void.class);
        }
        com.ss.android.common.util.i iVar = new com.ss.android.common.util.i(com.ss.android.ugc.aweme.detail.api.a.f41159b);
        iVar.a("aweme_id", str4);
        iVar.a("item_duet", str6);
        iVar.a("item_react", str5);
        ((AVApi) ServiceManager.get().getService(AVApi.class)).executeGetJSONObject(iVar.toString(), BaseResponse.class, null);
        return null;
    }

    public Fragment createMediaChooseFragment(@Nullable com.ss.android.ugc.aweme.shortvideo.c cVar, int i, boolean z, com.ss.android.ugc.aweme.music.b.a aVar, com.ss.android.ugc.aweme.mediachoose.k kVar) {
        if (!PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), aVar, kVar}, this, changeQuickRedirect, false, 71184, new Class[]{com.ss.android.ugc.aweme.shortvideo.c.class, Integer.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.music.b.a.class, com.ss.android.ugc.aweme.mediachoose.k.class}, Fragment.class)) {
            return MediaChooseFragment.a(cVar, i, z, aVar, kVar);
        }
        Object[] objArr = {cVar, Integer.valueOf(i), Byte.valueOf(z), aVar, kVar};
        return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 71184, new Class[]{com.ss.android.ugc.aweme.shortvideo.c.class, Integer.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.music.b.a.class, com.ss.android.ugc.aweme.mediachoose.k.class}, Fragment.class);
    }

    public void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71212, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, changeQuickRedirect, false, 71212, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.get();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivity(activity, i, i2, i3, z);
        }
    }

    public Fragment newVideoChooseFragmentInstance(int i, int i2, int i3, @Nullable com.ss.android.ugc.aweme.shortvideo.c cVar, com.ss.android.ugc.aweme.mediachoose.k kVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cVar, kVar}, this, changeQuickRedirect, false, 71201, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, com.ss.android.ugc.aweme.mediachoose.k.class}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cVar, kVar}, this, changeQuickRedirect, false, 71201, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, com.ss.android.ugc.aweme.mediachoose.k.class}, Fragment.class);
        }
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cVar, kVar}, null, VideoChooseFragment.f55208a, true, 58548, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, com.ss.android.ugc.aweme.mediachoose.k.class}, VideoChooseFragment.class)) {
            return VideoChooseFragment.a(i, i2, i3, true, cVar, kVar);
        }
        return (VideoChooseFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cVar, kVar}, null, VideoChooseFragment.f55208a, true, 58548, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, com.ss.android.ugc.aweme.mediachoose.k.class}, VideoChooseFragment.class);
    }

    public void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 71211, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 71211, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.get();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivity(activity, i, i2, z, i3);
        }
    }

    public Object getMusicWaveBean(String str, int i, boolean z, boolean z2, long j, IAVService.MusicWaveDataListener musicWaveDataListener) {
        String str2 = str;
        long j2 = j;
        IAVService.MusicWaveDataListener musicWaveDataListener2 = musicWaveDataListener;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), new Long(j2), musicWaveDataListener2}, this, changeQuickRedirect, false, 71248, new Class[]{String.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Long.TYPE, IAVService.MusicWaveDataListener.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z), Byte.valueOf(z2), new Long(j2), musicWaveDataListener2}, this, changeQuickRedirect, false, 71248, new Class[]{String.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Long.TYPE, IAVService.MusicWaveDataListener.class}, Object.class);
        } else if (!z) {
            a.i.a((Callable<TResult>) new AVServiceImpl$$Lambda$2<TResult>(this, str2)).a((a.g<TResult, TContinuationResult>) new AVServiceImpl$$Lambda$3<TResult,TContinuationResult>(musicWaveDataListener2), a.i.f1052b);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return com.ss.android.ugc.aweme.port.in.a.H.f().a(getMusicWaveBean(str));
        }
    }

    public void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3), viewGroup}, this, changeQuickRedirect, false, 71214, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, ViewGroup.class}, Void.TYPE)) {
            Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3), viewGroup};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 71214, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, ViewGroup.class}, Void.TYPE);
            return;
        }
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.get();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivityForView(activity, i, i2, z, i3, viewGroup);
        }
    }

    public void startStorySettingActivity(Activity activity, int i, int i2, boolean z, boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71213, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, changeQuickRedirect, false, 71213, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.get();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivity(activity, i, i2, z, z2, z3);
        }
    }

    public String[] createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3) {
        String str5 = str4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), str5, Byte.valueOf(z3 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71179, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, String.class, Boolean.TYPE}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, Byte.valueOf(z), Byte.valueOf(z2), str5, Byte.valueOf(z3)}, this, changeQuickRedirect, false, 71179, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, String.class, Boolean.TYPE}, String[].class);
        }
        return com.ss.android.ugc.aweme.shortvideo.q.b.d.a(i, i2, str, str2, str3, z, z2, z3, new c.a().a(str5).a());
    }
}
