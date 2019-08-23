package com.ss.android.ugc.aweme.services;

import a.i;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttve.nativePort.b;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.TestABActivity;
import com.ss.android.ugc.aweme.property.TestSettingActivity;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import dmt.av.video.c;
import java.util.concurrent.Callable;

public class AVSettingsServiceImpl implements IAVSettingsService {
    public static ChangeQuickRedirect changeQuickRedirect;

    private int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static e.a backCameraProperty() {
        return e.a.BackCameraFilter;
    }

    private static e.a frontCameraProperty() {
        return e.a.FrontCameraFilter;
    }

    public int getFullScreenPlan() {
        return fb.f67663b;
    }

    public String SdkV4AuthKey() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71307, new Class[0], String.class)) {
            return a.L.e(e.a.SdkV4AuthKey);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71307, new Class[0], String.class);
    }

    public com.ss.android.ugc.aweme.port.a<Boolean> bubbleGuideShown() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71283, new Class[0], com.ss.android.ugc.aweme.port.a.class)) {
            return new com.ss.android.ugc.aweme.port.a<Boolean>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public Boolean get() {
                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71318, new Class[0], Boolean.class)) {
                        return Boolean.valueOf(a.L.a(e.a.BubbleGuideShown));
                    }
                    return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71318, new Class[0], Boolean.class);
                }

                public void set(Boolean bool) {
                    if (PatchProxy.isSupport(new Object[]{bool}, this, changeQuickRedirect, false, 71319, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, changeQuickRedirect, false, 71319, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    a.L.a(e.a.BubbleGuideShown, bool.booleanValue());
                }
            };
        }
        return (com.ss.android.ugc.aweme.port.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71283, new Class[0], com.ss.android.ugc.aweme.port.a.class);
    }

    public boolean enableFeedbackLog() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71271, new Class[0], Boolean.TYPE)) {
            return a.M.a(a.C0682a.EnableFeedbackLog);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71271, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableFullScreen() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71294, new Class[0], Boolean.TYPE)) {
            return fc.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71294, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableInstagramSilentShare() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71275, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableInstagramSilentShare);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71275, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableMBlackPanel() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71306, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableMBlackPanel);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71306, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enablePhotoMovie() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71274, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71274, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.PhotoMovieEnabled) != 0) {
            z = true;
        }
        return z;
    }

    public boolean enablePreUploadByUser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71298, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnablePreUploadByUser);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71298, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableReact() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71280, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.CanReact);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71280, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableSaveUploadVideo() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71292, new Class[0], Boolean.TYPE)) {
            return f.p();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71292, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableStickerDetailsEntrance() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71273, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.StickerDetailsEntranceEnable);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71273, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableUploadFallback() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71276, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableUploadFallback);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71276, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableUploadSyncIns() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71286, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableUploadSyncIns);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71286, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableUploadSyncInsStory() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71287, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableUploadSyncInsStory);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71287, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableUploadSyncTwitter() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71288, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableUploadSyncTwitter);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71288, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableVECutVideo() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71293, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VECutVideoEnable);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71293, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean forceAddVideoHead() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71278, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ForceAddVideoHead);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71278, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public String freeFLowCardUrl() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71282, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.port.in.a.L.e(e.a.FreeFLowCardUrl);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71282, new Class[0], String.class);
    }

    public int getEditPageMusicPanelOptimization() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71308, new Class[0], Integer.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.EditPageMusicPanelOptimization);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71308, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean getEditPagePrompt() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71309, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EditPagePrompt);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71309, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public float getRecordBitrate() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71291, new Class[0], Float.TYPE)) {
            return f.e();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71291, new Class[0], Float.TYPE)).floatValue();
    }

    public int getRecordQuality() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71290, new Class[0], Integer.TYPE)) {
            return f.g();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71290, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean isEnableGetThumbsWithEffect() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71304, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableVeCoverEffect);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71304, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableUseVEGetThumbs() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71303, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableUseVeCover);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71303, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableVideoEditActivityUploadSpeedProbe() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71302, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableVideoEditActivityUploadSpeedProbe);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71302, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isOpenMusicRecordWithSticker() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71305, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenMusicRecordWithSticker);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71305, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isOpenStickerRecordWithMusic() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71301, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenStickerRecordWithMusic);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71301, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean needLoginBeforeRecord() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71270, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.NeedLoginInBeforeRecord);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71270, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public long progressBarThreshold() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71281, new Class[0], Long.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.c(e.a.ProgressBarThreshold);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71281, new Class[0], Long.TYPE)).longValue();
    }

    public int recommentMusicByAIPolicy() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71272, new Class[0], Integer.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecommentMusicByAIPolicy);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71272, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean shareVideo2GifEditable() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71279, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ShareVideo2GifEditable);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71279, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public com.ss.android.ugc.aweme.port.a<Boolean> showLockNewYearStickerPopupImg() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71285, new Class[0], com.ss.android.ugc.aweme.port.a.class)) {
            return new com.ss.android.ugc.aweme.port.a<Boolean>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public Boolean get() {
                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71322, new Class[0], Boolean.class)) {
                        return Boolean.valueOf(com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ShowLockNewYearStickerPopupImg));
                    }
                    return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71322, new Class[0], Boolean.class);
                }

                public void set(Boolean bool) {
                    if (PatchProxy.isSupport(new Object[]{bool}, this, changeQuickRedirect, false, 71323, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, changeQuickRedirect, false, 71323, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ShowLockNewYearStickerPopupImg, bool.booleanValue());
                }
            };
        }
        return (com.ss.android.ugc.aweme.port.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71285, new Class[0], com.ss.android.ugc.aweme.port.a.class);
    }

    public com.ss.android.ugc.aweme.port.a<Boolean> showLockStickerPopupImg() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71284, new Class[0], com.ss.android.ugc.aweme.port.a.class)) {
            return new com.ss.android.ugc.aweme.port.a<Boolean>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public Boolean get() {
                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71320, new Class[0], Boolean.class)) {
                        return Boolean.valueOf(com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ShowLockStickerPopupImg));
                    }
                    return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71320, new Class[0], Boolean.class);
                }

                public void set(Boolean bool) {
                    if (PatchProxy.isSupport(new Object[]{bool}, this, changeQuickRedirect, false, 71321, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, changeQuickRedirect, false, 71321, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ShowLockStickerPopupImg, bool.booleanValue());
                }
            };
        }
        return (com.ss.android.ugc.aweme.port.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71284, new Class[0], com.ss.android.ugc.aweme.port.a.class);
    }

    public boolean showMvThemeRecordMode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71300, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.MvThemeRecordMode);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71300, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean uploadOptimizeForPie() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71277, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadOptimizeForPie);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71277, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean showStickerCollection() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71289, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71289, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (PatchProxy.isSupport(new Object[0], null, f.f63287a, true, 70224, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f.f63287a, true, 70224, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.StickerDetailsEntranceEnable) || !com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableStickerCollection)) {
                return false;
            }
            return true;
        }
    }

    private void asynMonitorAwemeSetting(com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar) {
        com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 71316, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 71316, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new AVSettingsServiceImpl$$Lambda$0<TResult>(aVar2));
    }

    static final /* synthetic */ Void lambda$asynMonitorAwemeSetting$0$AVSettingsServiceImpl(com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar) throws Exception {
        try {
            com.ss.android.ugc.aweme.shortvideo.h.a.f68043d.a("filter", aVar.J().intValue());
            com.ss.android.ugc.aweme.shortvideo.h.a.f68043d.a("hard_code_shot", aVar.f().intValue());
            com.ss.android.ugc.aweme.shortvideo.h.a.f68043d.a("hard_code_release", aVar.x().intValue());
            com.ss.android.ugc.aweme.shortvideo.h.a.f68043d.a("hard_code_water_marker", aVar.B().booleanValue() ? 1 : 0);
        } catch (Exception unused) {
        }
        return null;
    }

    public b.c getLibraryLoader(Application application) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, this, changeQuickRedirect, false, 71310, new Class[]{Application.class}, b.c.class)) {
            return (b.c) PatchProxy.accessDispatch(new Object[]{application2}, this, changeQuickRedirect, false, 71310, new Class[]{Application.class}, b.c.class);
        } else if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.LoadLibraryFromExternal)) {
            return new c(application2, new b.a());
        } else {
            return new b.a();
        }
    }

    public void setEnablePreUploadByUser(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71299, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 71299, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnablePreUploadByUser, z);
    }

    public void startTestABActivity(@NonNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71295, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71295, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2}, null, TestABActivity.f63241a, true, 70278, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, TestABActivity.f63241a, true, 70278, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, TestABActivity.class));
    }

    public void startTestSettingActivity(@NonNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71296, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71296, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, TestSettingActivity.class));
    }

    public void updateABTestModel(@NonNull JsonObject jsonObject) {
        float f2;
        float f3;
        boolean z;
        float f4;
        boolean z2;
        JsonObject jsonObject2 = jsonObject;
        if (PatchProxy.isSupport(new Object[]{jsonObject2}, this, changeQuickRedirect, false, 71269, new Class[]{JsonObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jsonObject2}, this, changeQuickRedirect, false, 71269, new Class[]{JsonObject.class}, Void.TYPE);
            return;
        }
        JsonObject asJsonObject = jsonObject2.getAsJsonObject("data");
        if (asJsonObject != null) {
            int asInt = getAsInt(asJsonObject, "private_prompt", 0);
            if (asInt < 0 || asInt > 1) {
                asInt = 0;
            }
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.PrivatePrompt, asInt);
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.PhotoEditEnabled, getAsBoolean(asJsonObject, "create_image_aweme", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RecordBitrateCategoryIndex, getAsInt(asJsonObject, "video_bitrate_category_index", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RecordQualityCategoryIndex, getAsInt(asJsonObject, "video_quality_category_index", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoSizeIndex, getAsInt(asJsonObject, "video_size_index", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ImportVideoSizeIndex, getAsInt(asJsonObject, "upload_video_size_index", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.DisableMusicDetailRecordShowUpload, getAsBoolean(asJsonObject, "disable_musicdetail_record_showupload", false));
            int clamp = clamp(getAsInt(asJsonObject, "smooth_max", 80), 0, 100);
            float f5 = (float) clamp;
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SmoothMax, f5 / 100.0f);
            int asInt2 = getAsInt(asJsonObject, "smooth_default", -1);
            if (asInt2 == -1) {
                if (com.ss.android.g.a.b()) {
                    asInt2 = 0;
                } else {
                    asInt2 = 48;
                }
            }
            com.ss.android.ugc.aweme.property.a aVar = com.ss.android.ugc.aweme.port.in.a.M;
            a.C0682a aVar2 = a.C0682a.SmoothDefault;
            float f6 = 0.0f;
            if (clamp != 0) {
                f2 = (((float) asInt2) * 1.0f) / f5;
            } else {
                f2 = 0.0f;
            }
            aVar.a(aVar2, f2);
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ReshapeMax, ((float) clamp(getAsInt(asJsonObject, "reshape_max", 100), 0, 100)) / 100.0f);
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ReshapeDefault, ((float) clamp(getAsInt(asJsonObject, "reshape_default", 60), 0, 100)) / 100.0f);
            int clamp2 = clamp(getAsInt(asJsonObject, "contour_max", 80), 0, 100);
            float f7 = (float) clamp2;
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ContourMax, f7 / 100.0f);
            int clamp3 = clamp(getAsInt(asJsonObject, "contour_default", 0), -1, 100);
            if (clamp3 == -1) {
                if (com.ss.android.g.a.b()) {
                    clamp3 = 0;
                } else {
                    clamp3 = 48;
                }
            }
            com.ss.android.ugc.aweme.property.a aVar3 = com.ss.android.ugc.aweme.port.in.a.M;
            a.C0682a aVar4 = a.C0682a.ContourDefault;
            if (clamp2 != 0) {
                f3 = (((float) clamp3) * 1.0f) / f7;
            } else {
                f3 = 0.0f;
            }
            aVar3.a(aVar4, f3);
            com.ss.android.ugc.aweme.property.a aVar5 = com.ss.android.ugc.aweme.port.in.a.M;
            a.C0682a aVar6 = a.C0682a.QuietlySynthetic;
            if (getAsInt(asJsonObject, "quietly_synthetic", 0) != 0) {
                z = true;
            } else {
                z = false;
            }
            aVar5.a(aVar6, z);
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ColorFilterPanel, getAsInt(asJsonObject, "color_filter_panel", 1));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.PhotoMovieEnabled, getAsInt(asJsonObject, "enable_photomovie", 0));
            int clamp4 = clamp(getAsInt(asJsonObject, "eyes_max", 60), 0, 100);
            float f8 = (float) clamp4;
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EyesMax, f8 / 100.0f);
            int clamp5 = clamp(getAsInt(asJsonObject, "eyes_default", -1), -1, 100);
            if (clamp5 == -1) {
                if (com.ss.android.g.a.b()) {
                    clamp5 = 0;
                } else {
                    clamp5 = 36;
                }
            }
            com.ss.android.ugc.aweme.property.a aVar7 = com.ss.android.ugc.aweme.port.in.a.M;
            a.C0682a aVar8 = a.C0682a.EyesDefault;
            if (clamp4 != 0) {
                f4 = (((float) clamp5) * 1.0f) / f8;
            } else {
                f4 = 0.0f;
            }
            aVar7.a(aVar8, f4);
            int clamp6 = clamp(getAsInt(asJsonObject, "shape_max", 80), 0, 100);
            float f9 = (float) clamp6;
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ShapeMax, f9 / 100.0f);
            int clamp7 = clamp(getAsInt(asJsonObject, "shape_default", -1), -1, 100);
            if (clamp7 == -1) {
                if (com.ss.android.g.a.b()) {
                    clamp7 = 0;
                } else {
                    clamp7 = 48;
                }
            }
            com.ss.android.ugc.aweme.property.a aVar9 = com.ss.android.ugc.aweme.port.in.a.M;
            a.C0682a aVar10 = a.C0682a.ShapeDefault;
            if (clamp6 != 0) {
                f6 = (((float) clamp7) * 1.0f) / f9;
            }
            aVar9.a(aVar10, f6);
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.BeautificationIconStyle, getAsInt(asJsonObject, "beautification_icon_style", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RecordHardwareProfile, getAsInt(asJsonObject, "record_hardware_profile", 1));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UseContourSlider, getAsBoolean(asJsonObject, "use_contour_slider", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableSaveUploadVideo, getAsBoolean(asJsonObject, "upload_save_local", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableInstagramSilentShare, getAsBoolean(asJsonObject, "instagram_silent_share", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableUploadFallback, getAsBoolean(asJsonObject, "enable_upload_fallback", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadOptimizeForPie, getAsBoolean(asJsonObject, "upload_optimize_for_pie", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.NewEditPage, getAsInt(asJsonObject, "studio_editor_edit_page_new", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.AddTextInMusically, getAsBoolean(asJsonObject, "show_button_title_in_record_page", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.BeautyModeSwitch, getAsBoolean(asJsonObject, "beauty_mode_switch", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UseEffectCam, getAsBoolean(asJsonObject, "use_effectcam_key", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RecommentMusicByAIPolicy, getAsInt(asJsonObject, "music_ailab_new", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableExposureOptimize, getAsBoolean(asJsonObject, "enable_exposure_optmize", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RecordCameraTypeAB, getAsInt(asJsonObject, "camera_type_ab", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RecordCameraCompatLevelAB, getAsInt(asJsonObject, "record_camera_compat_level_ab", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadSpeedProbeSize, getAsInt(asJsonObject, "upload_speed_probe_size", 524288));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadSpeedProbeMinGap, getAsInt(asJsonObject, "upload_speed_probe_min_gap", 300000));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadSpeedProbeTimeOut, getAsInt(asJsonObject, "upload_speed_probe_time_out", 20000));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SyntheticVideoQuality, getAsInt(asJsonObject, "synthetic_video_quality", -1));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SyntheticVideoMaxRate, getAsLong(asJsonObject, "synthetic_video_maxrate", -1));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SyntheticVideoPreset, getAsInt(asJsonObject, "synthetic_video_preset", -1));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SyntheticVideoGop, getAsInt(asJsonObject, "synthetic_video_gop", -1));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SyntheticVideoBitrate, getAsFloat(asJsonObject, "synthetic_video_bitrate", -1.0f));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoBitrate, getAsFloat(asJsonObject, a.C0682a.VideoBitrate.key(), -1.0f));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ShareVideo2GifEditable, getAsBoolean(asJsonObject, "new_version_gif_share", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UseVECompiler, getAsInt(asJsonObject, "use_ve_compiler", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RemoveStoryStrategy, getAsInt(asJsonObject, "remove_story_strategy", 0));
            com.ss.android.ugc.aweme.property.a aVar11 = com.ss.android.ugc.aweme.port.in.a.M;
            a.C0682a aVar12 = a.C0682a.EnableSoftEncodeAcc;
            if (getAsInt(asJsonObject, "enable_soft_encode_acc", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar11.a(aVar12, z2);
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableFullScreenAdapt, getAsBoolean(asJsonObject, "enable_editor_screen_adaptation", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.StickerDetailsEntranceEnable, getAsBoolean(asJsonObject, "sticker_details_entrance_enable", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableInfoSticker, getAsBoolean(asJsonObject, "enable_infosticker", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EffectPlatformUseTTNet, getAsBoolean(asJsonObject, "effect_platform_use_ttnet", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.NeedLoginInBeforeRecord, !getAsBoolean(asJsonObject, "douyin_shoot_without_login", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableStickerCollection, getAsBoolean(asJsonObject, "show_sticker_collection", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.AmericaRecordOptim, getAsInt(asJsonObject, "america_record_optim_new", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableParallelSynthesizeUpload, getAsBoolean(asJsonObject, "enable_concurrent_synthesize_upload", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RearCamera, getAsBoolean(asJsonObject, a.C0682a.RearCamera.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SplitFilterBeauty, getAsBoolean(asJsonObject, "split_filter_beauty", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UsingMixRecordButton, getAsBoolean(asJsonObject, "use_mix_record_button", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.NeedRecode, getAsBoolean(asJsonObject, "need_recode", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VeEditorANRDestroy, getAsBoolean(asJsonObject, "veeditor_anr_destroy", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableFeedbackLog, getAsBoolean(asJsonObject, "enable_feedback_log", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.StoryPreviewUsingSurfaceView, getAsBoolean(asJsonObject, "is_surface_view_story_preview", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.CanShowPublishFriendGuide, getAsBoolean(asJsonObject, "post_friends_permission_prompts", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoRecordOpt, getAsBoolean(asJsonObject, "video_record_opt", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoSynthesisOpt, getAsBoolean(asJsonObject, "video_synthesis_opt", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VESynthesisSettings, getAsString(asJsonObject, "ve_synthesis_settings"));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VESynthesisSettingsByUploadSpeed, getAsString(asJsonObject, "ve_synthesis_settings_by_upload_speed"));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoStopPlayOpt, getAsBoolean(asJsonObject, "video_stop_play_opt", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EffectExclusionPattern, getAsString(asJsonObject, "android_effect_black_list_pattern"));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableSearchGIF, getAsBoolean(asJsonObject, "enable_search_gif", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VECutVideoEnable, getAsBoolean(asJsonObject, "enable_ve_cut_video", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableRecordTutorial, getAsBoolean(asJsonObject, "shoot_tutorial_switch", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.LongVideoDefaultUseLong, getAsBoolean(asJsonObject, "default_enable_long_video", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal, getAsBoolean(asJsonObject, "video_legal_check_in_local", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.LongDurationRecordAsTab, getAsBoolean(asJsonObject, "is_long_duration_record_as_tab", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RecordErrorSimulate, getAsInt(asJsonObject, "record_error_occur_simulate", -1));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnablePreUpload, getAsBoolean(asJsonObject, "enable_pre_upload", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableOpenGl3, getAsInt(asJsonObject, "use_open_gl_three", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectParallelFwk, getAsBoolean(asJsonObject, "enable_effect_parallel_fwk", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.CameraOptionFlagsOpt, getAsBoolean(asJsonObject, "camera_option_flags_opt", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VEExtractFramesAfterRender, getAsBoolean(asJsonObject, "ve_extract_frames_after_render", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UseNewPublishShareDescription, getAsBoolean(asJsonObject, "is_publish_share_description", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.DefaultPublishPrivacyType, getAsInt(asJsonObject, "default_publish_privacy_type", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableSlimVECutProcessor, getAsBoolean(asJsonObject, "enable_slim_ve_cut_processor", true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.TTPublishEnhancement, getAsInt(asJsonObject, a.C0682a.TTPublishEnhancement.key(), 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.MvThemeRecordMode, getAsBoolean(asJsonObject, a.C0682a.MvThemeRecordMode.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.LiveMvTabOrder, getAsInt(asJsonObject, a.C0682a.LiveMvTabOrder.key(), 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenCameraFrameOptimize, getAsBoolean(asJsonObject, a.C0682a.OpenCameraFrameOptimize.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenCameraFrameOptimizeSDK, getAsBoolean(asJsonObject, a.C0682a.OpenCameraFrameOptimizeSDK.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenCameraFrameOptimizePreLoadSo, getAsBoolean(asJsonObject, a.C0682a.OpenCameraFrameOptimizePreLoadSo.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableTextStickerInMain, getAsBoolean(asJsonObject, a.C0682a.EnableTextStickerInMain.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenStickerRecordWithMusic, getAsBoolean(asJsonObject, a.C0682a.OpenStickerRecordWithMusic.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenMusicRecordWithSticker, getAsBoolean(asJsonObject, a.C0682a.OpenMusicRecordWithSticker.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableVideoEditActivityUploadSpeedProbe, getAsBoolean(asJsonObject, a.C0682a.EnableVideoEditActivityUploadSpeedProbe.key(), true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableMVThemePreUpload, getAsBoolean(asJsonObject, a.C0682a.EnableMVThemePreUpload.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectNewEngine, getAsBoolean(asJsonObject, a.C0682a.EnableEffectNewEngine.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableVEFastImport, getAsBoolean(asJsonObject, "enable_ve_fast_import", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.FastImportFpsLimit, getAsInt(asJsonObject, "fast_import_fps_limit", 40));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.FastImportResolutionLimit, getAsString(asJsonObject, "fast_import_resolution_limit"));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEnhanceVolume, getAsBoolean(asJsonObject, "use_enhance_volume", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableVoiceConversion, getAsBoolean(asJsonObject, "studio_enable_editpage_voicechanger", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EditPageMusicPanelOptimization, getAsInt(asJsonObject, "edit_page_music_panel_optimization", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableTT265Decoder, getAsBoolean(asJsonObject, "enable_tt_265_decoder", false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.DuetFixNewPlan, getAsBoolean(asJsonObject, a.C0682a.DuetFixNewPlan.key(), true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UlikeBeautyAbGroup, getAsInt(asJsonObject, "studio_recorder_beautify_effects_group", 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RememberLastRecordDuration, getAsBoolean(asJsonObject, a.C0682a.RememberLastRecordDuration.key(), true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableUserVeRecoder, getAsBoolean(asJsonObject, a.C0682a.EnableUserVeRecoder.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VEConfigOptLevel, getAsInt(asJsonObject, a.C0682a.VEConfigOptLevel.key(), 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.FastImportGopLimit, getAsInt(asJsonObject, a.C0682a.SyntheticVideoGop.key(), PushConstants.WORK_RECEIVER_EVENTCORE_ERROR));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EditPagePrompt, getAsBoolean(asJsonObject, a.C0682a.EditPagePrompt.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEditPageMemoryOpt, getAsBoolean(asJsonObject, a.C0682a.EnableEditPageMemoryOpt.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableStoryCameraOpt, getAsBoolean(asJsonObject, a.C0682a.EnableStoryCameraOpt.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEditPageMVMemoryOpt, getAsBoolean(asJsonObject, a.C0682a.EnableEditPageMVMemoryOpt.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableMBlackPanel, getAsBoolean(asJsonObject, a.C0682a.EnableMBlackPanel.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenSDKQAdaption, getAsBoolean(asJsonObject, a.C0682a.OpenSDKQAdaption.key(), true));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SDKQAdaptionConfig, getAsBoolean(asJsonObject, a.C0682a.SDKQAdaptionConfig.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectDiskCache, getAsBoolean(asJsonObject, a.C0682a.EnableEffectDiskCache.key(), false));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.LightEnhanceBlackList, getAsInt(asJsonObject, a.C0682a.LightEnhanceBlackList.key(), 0));
            com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.ShowAutoImproveButtonInEditPage, getAsInt(asJsonObject, a.C0682a.ShowAutoImproveButtonInEditPage.key(), 0));
            com.ss.android.ugc.aweme.shortvideo.h.a aVar13 = com.ss.android.ugc.aweme.shortvideo.h.a.f68043d;
            if (PatchProxy.isSupport(new Object[0], aVar13, com.ss.android.ugc.aweme.shortvideo.h.a.f68040a, false, 77703, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar13, com.ss.android.ugc.aweme.shortvideo.h.a.f68040a, false, 77703, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.h.a.f68042c = true;
            aVar13.a();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(161:4|5|6|7|8|9|10|11|(1:13)|14|15|(1:17)|18|19|(1:21)|22|23|24|25|26|27|28|29|30|31|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|(2:44|45)|46|48|49|50|51|52|53|54|55|56|57|58|(1:61)(2:62|(1:64)(1:65))|66|(1:68)(2:69|(1:71)(1:72))|73|(1:75)(2:76|(1:78)(1:79))|80|(1:82)(2:83|(1:85)(1:86))|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|(2:130|131)|132|134|135|136|137|(1:139)|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|(2:178|179)|180|(1:183)(2:184|(1:186)(1:187))|188|(1:190)(2:191|(1:193)(1:194))|195|(1:197)(1:198)|199|(1:201)(2:202|(1:204)(1:205))|206|(1:208)(1:209)|210|(1:212)(2:213|(1:215)(1:216))|217|(3:218|219|220)|(1:223)|224|(1:226)(1:227)|228|229) */
    /* JADX WARNING: Can't wrap try/catch for region: R(162:4|5|6|7|8|9|10|11|(1:13)|14|15|(1:17)|18|19|(1:21)|22|23|24|25|26|27|28|29|30|31|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|(2:44|45)|46|48|49|50|51|52|53|54|55|56|57|58|(1:61)(2:62|(1:64)(1:65))|66|(1:68)(2:69|(1:71)(1:72))|73|(1:75)(2:76|(1:78)(1:79))|80|(1:82)(2:83|(1:85)(1:86))|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|(2:130|131)|132|134|135|136|137|(1:139)|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|(1:183)(2:184|(1:186)(1:187))|188|(1:190)(2:191|(1:193)(1:194))|195|(1:197)(1:198)|199|(1:201)(2:202|(1:204)(1:205))|206|(1:208)(1:209)|210|(1:212)(2:213|(1:215)(1:216))|217|(3:218|219|220)|(1:223)|224|(1:226)(1:227)|228|229) */
    /* JADX WARNING: Can't wrap try/catch for region: R(164:4|5|6|7|8|9|10|11|(1:13)|14|15|(1:17)|18|19|(1:21)|22|23|24|25|26|27|28|29|30|31|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|(2:44|45)|46|48|49|50|51|52|53|54|55|56|57|58|(1:61)(2:62|(1:64)(1:65))|66|(1:68)(2:69|(1:71)(1:72))|73|(1:75)(2:76|(1:78)(1:79))|80|(1:82)(2:83|(1:85)(1:86))|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|(2:130|131)|132|134|135|136|137|(1:139)|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|(1:183)(2:184|(1:186)(1:187))|188|(1:190)(2:191|(1:193)(1:194))|195|(1:197)(1:198)|199|(1:201)(2:202|(1:204)(1:205))|206|(1:208)(1:209)|210|(1:212)(2:213|(1:215)(1:216))|217|218|219|220|(1:223)|224|(1:226)(1:227)|228|229) */
    /* JADX WARNING: Can't wrap try/catch for region: R(165:4|5|6|7|8|9|10|11|(1:13)|14|15|(1:17)|18|19|(1:21)|22|23|24|25|26|27|28|29|30|31|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|56|57|58|(1:61)(2:62|(1:64)(1:65))|66|(1:68)(2:69|(1:71)(1:72))|73|(1:75)(2:76|(1:78)(1:79))|80|(1:82)(2:83|(1:85)(1:86))|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|(2:130|131)|132|134|135|136|137|(1:139)|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|(1:183)(2:184|(1:186)(1:187))|188|(1:190)(2:191|(1:193)(1:194))|195|(1:197)(1:198)|199|(1:201)(2:202|(1:204)(1:205))|206|(1:208)(1:209)|210|(1:212)(2:213|(1:215)(1:216))|217|218|219|220|(1:223)|224|(1:226)(1:227)|228|229) */
    /* JADX WARNING: Can't wrap try/catch for region: R(166:4|5|6|7|8|9|10|11|(1:13)|14|15|(1:17)|18|19|(1:21)|22|23|24|25|26|27|28|29|30|31|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|56|57|58|(1:61)(2:62|(1:64)(1:65))|66|(1:68)(2:69|(1:71)(1:72))|73|(1:75)(2:76|(1:78)(1:79))|80|(1:82)(2:83|(1:85)(1:86))|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|134|135|136|137|(1:139)|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|(1:183)(2:184|(1:186)(1:187))|188|(1:190)(2:191|(1:193)(1:194))|195|(1:197)(1:198)|199|(1:201)(2:202|(1:204)(1:205))|206|(1:208)(1:209)|210|(1:212)(2:213|(1:215)(1:216))|217|218|219|220|(1:223)|224|(1:226)(1:227)|228|229) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0323 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x0332 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0341 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x0350 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x035f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x036e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x037d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x038c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x039b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x03aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x03b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x03c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x03d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x03e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x03f5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x0404 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x0429 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x0444 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x0453 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x0462 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x0471 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x0480 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x048f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x049e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x04ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x04b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x04c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x04d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x04e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x04f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0503 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x0512 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x051d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x052c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x053b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:176:0x054a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:178:0x0555 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0095 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00ae */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00bd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00ea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x010d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0121 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0147 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x015c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x016b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x017a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x02d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x02e7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x02f6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0305 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0314 */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0433 A[Catch:{ a -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d A[Catch:{ a -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086 A[Catch:{ a -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0638  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f A[Catch:{ a -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0107 A[Catch:{ a -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0109 A[Catch:{ a -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b A[Catch:{ a -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d A[Catch:{ a -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateServerSettings(com.ss.android.ugc.aweme.global.config.settings.pojo.a r18) {
        /*
            r17 = this;
            r7 = r18
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.a> r1 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 71268(0x11664, float:9.9868E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 71268(0x11664, float:9.9868E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.a> r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0045 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.HttpTimeout     // Catch:{ a -> 0x0045 }
            java.lang.Long r2 = r18.c()     // Catch:{ a -> 0x0045 }
            long r2 = r2.longValue()     // Catch:{ a -> 0x0045 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (long) r2)     // Catch:{ a -> 0x0045 }
        L_0x0045:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0054 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.HttpRetryInterval     // Catch:{ a -> 0x0054 }
            java.lang.Long r2 = r18.b()     // Catch:{ a -> 0x0054 }
            long r2 = r2.longValue()     // Catch:{ a -> 0x0054 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (long) r2)     // Catch:{ a -> 0x0054 }
        L_0x0054:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0063 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.VideoBitrate     // Catch:{ a -> 0x0063 }
            java.lang.Float r2 = r18.a()     // Catch:{ a -> 0x0063 }
            float r2 = r2.floatValue()     // Catch:{ a -> 0x0063 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (float) r2)     // Catch:{ a -> 0x0063 }
        L_0x0063:
            java.lang.Integer r0 = r18.d()     // Catch:{ a -> 0x007c }
            int r0 = r0.intValue()     // Catch:{ a -> 0x007c }
            if (r0 <= 0) goto L_0x007c
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x007c }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.VideoCompose     // Catch:{ a -> 0x007c }
            java.lang.Integer r2 = r18.d()     // Catch:{ a -> 0x007c }
            int r2 = r2.intValue()     // Catch:{ a -> 0x007c }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x007c }
        L_0x007c:
            java.lang.Integer r0 = r18.e()     // Catch:{ a -> 0x0095 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0095 }
            if (r0 <= 0) goto L_0x0095
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0095 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.VideoCommit     // Catch:{ a -> 0x0095 }
            java.lang.Integer r2 = r18.e()     // Catch:{ a -> 0x0095 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0095 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0095 }
        L_0x0095:
            java.lang.Boolean r0 = r18.K()     // Catch:{ a -> 0x00ae }
            boolean r0 = r0.booleanValue()     // Catch:{ a -> 0x00ae }
            if (r0 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ a -> 0x00ae }
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)     // Catch:{ a -> 0x00ae }
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0     // Catch:{ a -> 0x00ae }
            r0.updateNewPermission()     // Catch:{ a -> 0x00ae }
        L_0x00ae:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x00bd }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.SyntheticVideoBitrate     // Catch:{ a -> 0x00bd }
            java.lang.Float r2 = r18.y()     // Catch:{ a -> 0x00bd }
            float r2 = r2.floatValue()     // Catch:{ a -> 0x00bd }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (float) r2)     // Catch:{ a -> 0x00bd }
        L_0x00bd:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x00cc }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.PrivateAvailable     // Catch:{ a -> 0x00cc }
            java.lang.Boolean r2 = r18.I()     // Catch:{ a -> 0x00cc }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x00cc }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x00cc }
        L_0x00cc:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x00db }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.LongVideoPermitted     // Catch:{ a -> 0x00db }
            java.lang.Boolean r2 = r18.K()     // Catch:{ a -> 0x00db }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x00db }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x00db }
        L_0x00db:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x00ea }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.LongVideoThreshold     // Catch:{ a -> 0x00ea }
            java.lang.Long r2 = r18.L()     // Catch:{ a -> 0x00ea }
            long r2 = r2.longValue()     // Catch:{ a -> 0x00ea }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (long) r2)     // Catch:{ a -> 0x00ea }
        L_0x00ea:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x00f9 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ProgressBarThreshold     // Catch:{ a -> 0x00f9 }
            java.lang.Long r2 = r18.M()     // Catch:{ a -> 0x00f9 }
            long r2 = r2.longValue()     // Catch:{ a -> 0x00f9 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (long) r2)     // Catch:{ a -> 0x00f9 }
        L_0x00f9:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x010d }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.HardCode     // Catch:{ a -> 0x010d }
            java.lang.Integer r2 = r18.f()     // Catch:{ a -> 0x010d }
            int r2 = r2.intValue()     // Catch:{ a -> 0x010d }
            if (r2 != r8) goto L_0x0109
            r2 = 1
            goto L_0x010a
        L_0x0109:
            r2 = 0
        L_0x010a:
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x010d }
        L_0x010d:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0121 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.SyntheticHardCode     // Catch:{ a -> 0x0121 }
            java.lang.Integer r2 = r18.x()     // Catch:{ a -> 0x0121 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0121 }
            if (r2 != r8) goto L_0x011d
            r2 = 1
            goto L_0x011e
        L_0x011d:
            r2 = 0
        L_0x011e:
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0121 }
        L_0x0121:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0130 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.BeautyModel     // Catch:{ a -> 0x0130 }
            java.lang.Integer r2 = r18.J()     // Catch:{ a -> 0x0130 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0130 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0130 }
        L_0x0130:
            r0 = 51
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0147 }
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.RecordVideoQuality     // Catch:{ a -> 0x0147 }
            java.lang.Integer r3 = r18.l()     // Catch:{ a -> 0x0147 }
            int r3 = r3.intValue()     // Catch:{ a -> 0x0147 }
            r4 = 18
            int r3 = com.ss.android.ugc.aweme.property.f.a(r3, r8, r0, r4)     // Catch:{ a -> 0x0147 }
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (int) r3)     // Catch:{ a -> 0x0147 }
        L_0x0147:
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x015c }
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.SyntheticVideoQuality     // Catch:{ a -> 0x015c }
            java.lang.Integer r3 = r18.m()     // Catch:{ a -> 0x015c }
            int r3 = r3.intValue()     // Catch:{ a -> 0x015c }
            r4 = 15
            int r0 = com.ss.android.ugc.aweme.property.f.a(r3, r8, r0, r4)     // Catch:{ a -> 0x015c }
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (int) r0)     // Catch:{ a -> 0x015c }
        L_0x015c:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x016b }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.FaceDetectInterval     // Catch:{ a -> 0x016b }
            java.lang.Integer r2 = r18.g()     // Catch:{ a -> 0x016b }
            int r2 = r2.intValue()     // Catch:{ a -> 0x016b }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x016b }
        L_0x016b:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x017a }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableAutoRetryRecord     // Catch:{ a -> 0x017a }
            java.lang.Boolean r2 = r18.aw()     // Catch:{ a -> 0x017a }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x017a }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x017a }
        L_0x017a:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0185 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.VideoSize     // Catch:{ a -> 0x0185 }
            java.lang.String r2 = r18.P()     // Catch:{ a -> 0x0185 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (java.lang.String) r2)     // Catch:{ a -> 0x0185 }
        L_0x0185:
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.RecordBitrateCategory
            com.google.gson.Gson r12 = com.ss.android.ugc.aweme.port.in.a.f61120c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48469(0xbd55, float:6.792E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01b4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48469(0xbd55, float:6.792E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            goto L_0x01cf
        L_0x01b4:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x01bf
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getVideoBitrateCategory()
            goto L_0x01cf
        L_0x01bf:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getVideoBitrateCategory()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "video_bitrate_category"
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            java.util.List r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, (java.util.List<T>) r0)
        L_0x01cf:
            java.lang.String r0 = r12.toJson((java.lang.Object) r0)
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (java.lang.String) r0)
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.RecordQualityCategory
            com.google.gson.Gson r12 = com.ss.android.ugc.aweme.port.in.a.f61120c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48470(0xbd56, float:6.7921E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0205
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48470(0xbd56, float:6.7921E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            goto L_0x0220
        L_0x0205:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x0210
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getVideoQualityCategory()
            goto L_0x0220
        L_0x0210:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getVideoQualityCategory()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "video_quality_category"
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.util.List r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, (java.util.List<T>) r0)
        L_0x0220:
            java.lang.String r0 = r12.toJson((java.lang.Object) r0)
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (java.lang.String) r0)
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.VideoSizeCategory
            com.google.gson.Gson r12 = com.ss.android.ugc.aweme.port.in.a.f61120c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48546(0xbda2, float:6.8027E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0256
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48546(0xbda2, float:6.8027E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            goto L_0x0271
        L_0x0256:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x0261
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getVideoSizeCategory()
            goto L_0x0271
        L_0x0261:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getVideoSizeCategory()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "video_size_category"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.util.List r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, (java.util.List<T>) r0)
        L_0x0271:
            java.lang.String r0 = r12.toJson((java.lang.Object) r0)
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (java.lang.String) r0)
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.ImportVideoSizeCategory
            com.google.gson.Gson r12 = com.ss.android.ugc.aweme.port.in.a.f61120c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48547(0xbda3, float:6.8029E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02a7
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48547(0xbda3, float:6.8029E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            goto L_0x02c2
        L_0x02a7:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x02b2
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getUploadVideoSizeCategory()
            goto L_0x02c2
        L_0x02b2:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getUploadVideoSizeCategory()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "upload_video_size_category"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.util.List r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, (java.util.List<T>) r0)
        L_0x02c2:
            java.lang.String r0 = r12.toJson((java.lang.Object) r0)
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (java.lang.String) r0)
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x02d8 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableHuaweiSuperSlowMotion     // Catch:{ a -> 0x02d8 }
            java.lang.Integer r2 = r18.q()     // Catch:{ a -> 0x02d8 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x02d8 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x02d8 }
        L_0x02d8:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x02e7 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.SyntheticVideoMaxRate     // Catch:{ a -> 0x02e7 }
            java.lang.Long r2 = r18.n()     // Catch:{ a -> 0x02e7 }
            long r2 = r2.longValue()     // Catch:{ a -> 0x02e7 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (long) r2)     // Catch:{ a -> 0x02e7 }
        L_0x02e7:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x02f6 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.SyntheticVideoPreset     // Catch:{ a -> 0x02f6 }
            java.lang.Integer r2 = r18.o()     // Catch:{ a -> 0x02f6 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x02f6 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x02f6 }
        L_0x02f6:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0305 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.SyntheticVideoGop     // Catch:{ a -> 0x0305 }
            java.lang.Integer r2 = r18.p()     // Catch:{ a -> 0x0305 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0305 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0305 }
        L_0x0305:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0314 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.UploadOriginalAudioTrack     // Catch:{ a -> 0x0314 }
            java.lang.Boolean r2 = r18.G()     // Catch:{ a -> 0x0314 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0314 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0314 }
        L_0x0314:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0323 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.RecordBitrateMode     // Catch:{ a -> 0x0323 }
            java.lang.Integer r2 = r18.U()     // Catch:{ a -> 0x0323 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0323 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0323 }
        L_0x0323:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0332 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.RecordHardwareProfile     // Catch:{ a -> 0x0332 }
            java.lang.Integer r2 = r18.V()     // Catch:{ a -> 0x0332 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0332 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0332 }
        L_0x0332:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0341 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ForbidLocalWatermark     // Catch:{ a -> 0x0341 }
            java.lang.Boolean r2 = r18.A()     // Catch:{ a -> 0x0341 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0341 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0341 }
        L_0x0341:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0350 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ForbidLifeStoryLocalWatermark     // Catch:{ a -> 0x0350 }
            java.lang.Boolean r2 = r18.z()     // Catch:{ a -> 0x0350 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0350 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0350 }
        L_0x0350:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x035f }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.WatermarkHardcode     // Catch:{ a -> 0x035f }
            java.lang.Boolean r2 = r18.B()     // Catch:{ a -> 0x035f }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x035f }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x035f }
        L_0x035f:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x036e }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableUploadSyncTwitter     // Catch:{ a -> 0x036e }
            java.lang.Boolean r2 = r18.C()     // Catch:{ a -> 0x036e }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x036e }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x036e }
        L_0x036e:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x037d }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableUploadSyncIns     // Catch:{ a -> 0x037d }
            java.lang.Boolean r2 = r18.D()     // Catch:{ a -> 0x037d }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x037d }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x037d }
        L_0x037d:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x038c }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableUploadSyncInsStory     // Catch:{ a -> 0x038c }
            java.lang.Boolean r2 = r18.E()     // Catch:{ a -> 0x038c }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x038c }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x038c }
        L_0x038c:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x039b }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.RecordCameraType     // Catch:{ a -> 0x039b }
            java.lang.Integer r2 = r18.W()     // Catch:{ a -> 0x039b }
            int r2 = r2.intValue()     // Catch:{ a -> 0x039b }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x039b }
        L_0x039b:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x03aa }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.InCamera2BlackList     // Catch:{ a -> 0x03aa }
            java.lang.Integer r2 = r18.ao()     // Catch:{ a -> 0x03aa }
            int r2 = r2.intValue()     // Catch:{ a -> 0x03aa }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x03aa }
        L_0x03aa:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x03b9 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.RecordCameraCompatLevel     // Catch:{ a -> 0x03b9 }
            java.lang.Integer r2 = r18.X()     // Catch:{ a -> 0x03b9 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x03b9 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x03b9 }
        L_0x03b9:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x03c8 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.DefaultMicrophoneState     // Catch:{ a -> 0x03c8 }
            java.lang.Integer r2 = r18.Y()     // Catch:{ a -> 0x03c8 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x03c8 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x03c8 }
        L_0x03c8:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x03d7 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.CanReact     // Catch:{ a -> 0x03d7 }
            java.lang.Boolean r2 = r18.t()     // Catch:{ a -> 0x03d7 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x03d7 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x03d7 }
        L_0x03d7:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x03e6 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.CloseUploadExtractFrames     // Catch:{ a -> 0x03e6 }
            java.lang.Integer r2 = r18.H()     // Catch:{ a -> 0x03e6 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x03e6 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x03e6 }
        L_0x03e6:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x03f5 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.InEvening     // Catch:{ a -> 0x03f5 }
            java.lang.Integer r2 = r18.r()     // Catch:{ a -> 0x03f5 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x03f5 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x03f5 }
        L_0x03f5:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0404 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.UseLargeMattingModel     // Catch:{ a -> 0x0404 }
            java.lang.Boolean r2 = r18.Z()     // Catch:{ a -> 0x0404 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0404 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0404 }
        L_0x0404:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0413 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.UseLargeGestureDetectModel     // Catch:{ a -> 0x0413 }
            java.lang.Boolean r2 = r18.aa()     // Catch:{ a -> 0x0413 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0413 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0413 }
        L_0x0413:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ReactDuetSettingChanged
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r9)
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0429 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.MusicCopyRightGranted     // Catch:{ a -> 0x0429 }
            java.lang.Boolean r2 = r18.ab()     // Catch:{ a -> 0x0429 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0429 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0429 }
        L_0x0429:
            java.lang.Integer r0 = r18.v()     // Catch:{ a -> 0x0444 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0444 }
            if (r0 <= 0) goto L_0x0444
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0444 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.StoryImagePlayTime     // Catch:{ a -> 0x0444 }
            java.lang.Integer r2 = r18.v()     // Catch:{ a -> 0x0444 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0444 }
            int r2 = r2 * 1000
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0444 }
        L_0x0444:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0453 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableWaterBgMask     // Catch:{ a -> 0x0453 }
            java.lang.Boolean r2 = r18.ac()     // Catch:{ a -> 0x0453 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0453 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0453 }
        L_0x0453:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0462 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.BitrateOfRecodeThreshold     // Catch:{ a -> 0x0462 }
            java.lang.Integer r2 = r18.ag()     // Catch:{ a -> 0x0462 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0462 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0462 }
        L_0x0462:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0471 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableSyntheticFpsSet     // Catch:{ a -> 0x0471 }
            java.lang.Boolean r2 = r18.F()     // Catch:{ a -> 0x0471 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0471 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0471 }
        L_0x0471:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0480 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ShowLastStoryFrame     // Catch:{ a -> 0x0480 }
            java.lang.Boolean r2 = r18.ah()     // Catch:{ a -> 0x0480 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0480 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0480 }
        L_0x0480:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x048f }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.MaxFansCount     // Catch:{ a -> 0x048f }
            java.lang.Integer r2 = r18.ai()     // Catch:{ a -> 0x048f }
            int r2 = r2.intValue()     // Catch:{ a -> 0x048f }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x048f }
        L_0x048f:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x049e }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.WideCameraInfo     // Catch:{ a -> 0x049e }
            java.lang.Integer r2 = r18.aj()     // Catch:{ a -> 0x049e }
            int r2 = r2.intValue()     // Catch:{ a -> 0x049e }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x049e }
        L_0x049e:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x04ad }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.DefaultWideMode     // Catch:{ a -> 0x04ad }
            java.lang.Boolean r2 = r18.aJ()     // Catch:{ a -> 0x04ad }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x04ad }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x04ad }
        L_0x04ad:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x04b8 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.FreeFLowCardUrl     // Catch:{ a -> 0x04b8 }
            java.lang.String r2 = r18.an()     // Catch:{ a -> 0x04b8 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (java.lang.String) r2)     // Catch:{ a -> 0x04b8 }
        L_0x04b8:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x04c7 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ShakeFreeWhiteList     // Catch:{ a -> 0x04c7 }
            java.lang.Integer r2 = r18.am()     // Catch:{ a -> 0x04c7 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x04c7 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x04c7 }
        L_0x04c7:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x04d6 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ShakeFreeDefaultMode     // Catch:{ a -> 0x04d6 }
            java.lang.Boolean r2 = r18.ar()     // Catch:{ a -> 0x04d6 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x04d6 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x04d6 }
        L_0x04d6:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x04e5 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.ShutterSoundEnable     // Catch:{ a -> 0x04e5 }
            java.lang.Boolean r2 = r18.ap()     // Catch:{ a -> 0x04e5 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x04e5 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x04e5 }
        L_0x04e5:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x04f4 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.SpringEffectCacheController     // Catch:{ a -> 0x04f4 }
            java.lang.Boolean r2 = r18.ak()     // Catch:{ a -> 0x04f4 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x04f4 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x04f4 }
        L_0x04f4:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0503 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.IsExportHqFrame     // Catch:{ a -> 0x0503 }
            java.lang.Boolean r2 = r18.as()     // Catch:{ a -> 0x0503 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x0503 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x0503 }
        L_0x0503:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0512 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.VideoDurationLimitMillisecond     // Catch:{ a -> 0x0512 }
            java.lang.Long r2 = r18.at()     // Catch:{ a -> 0x0512 }
            long r2 = r2.longValue()     // Catch:{ a -> 0x0512 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (long) r2)     // Catch:{ a -> 0x0512 }
        L_0x0512:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x051d }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.RecordTutorialLink     // Catch:{ a -> 0x051d }
            java.lang.String r2 = r18.au()     // Catch:{ a -> 0x051d }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (java.lang.String) r2)     // Catch:{ a -> 0x051d }
        L_0x051d:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x052c }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableAutoRetryRecord     // Catch:{ a -> 0x052c }
            java.lang.Boolean r2 = r18.aw()     // Catch:{ a -> 0x052c }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x052c }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (boolean) r2)     // Catch:{ a -> 0x052c }
        L_0x052c:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x053b }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.PreUploadMemoryLimit     // Catch:{ a -> 0x053b }
            java.lang.Integer r2 = r18.aX()     // Catch:{ a -> 0x053b }
            int r2 = r2.intValue()     // Catch:{ a -> 0x053b }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x053b }
        L_0x053b:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x054a }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.Enable1080pFastImport     // Catch:{ a -> 0x054a }
            java.lang.Integer r2 = r18.bt()     // Catch:{ a -> 0x054a }
            int r2 = r2.intValue()     // Catch:{ a -> 0x054a }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x054a }
        L_0x054a:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0555 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.StickerArtistIconUrl     // Catch:{ a -> 0x0555 }
            java.lang.String r2 = r18.bC()     // Catch:{ a -> 0x0555 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (java.lang.String) r2)     // Catch:{ a -> 0x0555 }
        L_0x0555:
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L     // Catch:{ a -> 0x0564 }
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableVESingleGL     // Catch:{ a -> 0x0564 }
            java.lang.Integer r2 = r18.bI()     // Catch:{ a -> 0x0564 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0564 }
            r0.a((com.ss.android.ugc.aweme.property.e.a) r1, (int) r2)     // Catch:{ a -> 0x0564 }
        L_0x0564:
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.VEFastImportIgnoreRecode
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48802(0xbea2, float:6.8386E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0591
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48802(0xbea2, float:6.8386E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x05ae
        L_0x0591:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x059c
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Boolean r0 = r0.getVeFastImportIgnoreRecode()
            goto L_0x05ae
        L_0x059c:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Boolean r0 = r0.getVeFastImportIgnoreRecode()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "ve_fast_import_ignore_recode"
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x05ae:
            boolean r0 = r0.booleanValue()
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (boolean) r0)
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.EnableUseVeCover
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48804(0xbea4, float:6.8389E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x05e2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48804(0xbea4, float:6.8389E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x05ff
        L_0x05e2:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x05ed
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Integer r0 = r0.getUseVeImage()
            goto L_0x05ff
        L_0x05ed:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Integer r0 = r0.getUseVeImage()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "use_ve_image"
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x05ff:
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x0607
            r0 = 1
            goto L_0x0608
        L_0x0607:
            r0 = 0
        L_0x0608:
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (boolean) r0)
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.EnableVeCoverEffect
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48805(0xbea5, float:6.839E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0638
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48805(0xbea5, float:6.839E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0655
        L_0x0638:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x0643
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Integer r0 = r0.getEnableCoverEffect()
            goto L_0x0655
        L_0x0643:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Integer r0 = r0.getEnableCoverEffect()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "enable_cover_effect"
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x0655:
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x065d
            r0 = 1
            goto L_0x065e
        L_0x065d:
            r0 = 0
        L_0x065e:
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (boolean) r0)
            com.ss.android.ugc.aweme.property.e r10 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r11 = com.ss.android.ugc.aweme.property.e.a.UlikeBeautyDownloadEnable
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48749(0xbe6d, float:6.8312E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x068e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48749(0xbe6d, float:6.8312E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x06ab
        L_0x068e:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x0699
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Boolean r0 = r0.getEnableCameraBeautifyEffect()
            goto L_0x06ab
        L_0x0699:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Boolean r0 = r0.getEnableCameraBeautifyEffect()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "enable_camera_beautify_effect"
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x06ab:
            boolean r0 = r0.booleanValue()
            r10.a((com.ss.android.ugc.aweme.property.e.a) r11, (boolean) r0)
            r0 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.UlikeParams r1 = r18.al()     // Catch:{ a -> 0x06b8 }
            r0 = r1
        L_0x06b8:
            if (r0 == 0) goto L_0x0750
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeSharpenDefaultValue
            java.lang.Float r3 = r0.getUlikeSharpenDefaultValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeSmoothDefaultValue
            java.lang.Float r3 = r0.getUlikeSmoothDefaultValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeShapeDefaultValue
            java.lang.Float r3 = r0.getUlikeShapeDefaultValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeEyesDefaultValue
            java.lang.Float r3 = r0.getUlikeEyesDefaultValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeLipDefaultValue
            java.lang.Float r3 = r0.getUlikeLipDefaultValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeBlusherDefaultValue
            java.lang.Float r3 = r0.getUlikeBlusherDefaultValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeSmoothMaxValue
            java.lang.Float r3 = r0.getUlikeSmoothMaxValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeShapeMaxValue
            java.lang.Float r3 = r0.getUlikeShapeMaxValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.UlikeEyesMaxValue
            java.lang.Float r3 = r0.getUlikeEyesMaxValue()
            float r3 = r3.floatValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (float) r3)
            com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.EnableBeautySharpen
            java.lang.Boolean r0 = r0.getEnableBeautySharpen()
            boolean r0 = r0.booleanValue()
            r1.a((com.ss.android.ugc.aweme.property.e.a) r2, (boolean) r0)
        L_0x0750:
            com.ss.android.ugc.aweme.shortvideo.h.a r0 = com.ss.android.ugc.aweme.shortvideo.h.a.f68043d
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.h.a.f68040a
            r13 = 0
            r14 = 77702(0x12f86, float:1.08884E-40)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0776
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.h.a.f68040a
            r13 = 0
            r14 = 77702(0x12f86, float:1.08884E-40)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x077b
        L_0x0776:
            com.ss.android.ugc.aweme.shortvideo.h.a.f68041b = r8
            r0.a()
        L_0x077b:
            r17.asynMonitorAwemeSetting(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.AVSettingsServiceImpl.updateServerSettings(com.ss.android.ugc.aweme.global.config.settings.pojo.a):void");
    }

    private String getAsString(JsonObject jsonObject, @NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{jsonObject, str}, this, changeQuickRedirect, false, 71315, new Class[]{JsonObject.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jsonObject, str}, this, changeQuickRedirect, false, 71315, new Class[]{JsonObject.class, String.class}, String.class);
        }
        String str2 = "";
        try {
            JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(str);
            if (asJsonPrimitive != null) {
                str2 = asJsonPrimitive.getAsString();
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public void setDefaultFilterForCamera(int i, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 71297, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 71297, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i == 0) {
            com.ss.android.ugc.aweme.port.in.a.L.a(backCameraProperty(), i3);
        } else {
            com.ss.android.ugc.aweme.port.in.a.L.a(frontCameraProperty(), i3);
        }
    }

    private float getAsFloat(JsonObject jsonObject, @NonNull String str, float f2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{jsonObject, str, Float.valueOf(f2)}, this, changeQuickRedirect, false, 71314, new Class[]{JsonObject.class, String.class, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{jsonObject, str, Float.valueOf(f2)}, this, changeQuickRedirect, false, 71314, new Class[]{JsonObject.class, String.class, Float.TYPE}, Float.TYPE)).floatValue();
        }
        try {
            JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(str);
            if (asJsonPrimitive != null) {
                f3 = asJsonPrimitive.getAsFloat();
                return f3;
            }
        } catch (Exception unused) {
        }
        f3 = f2;
        return f3;
    }

    private int getAsInt(JsonObject jsonObject, @NonNull String str, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{jsonObject, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71312, new Class[]{JsonObject.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{jsonObject, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71312, new Class[]{JsonObject.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(str);
            if (asJsonPrimitive != null) {
                if (!asJsonPrimitive.isBoolean()) {
                    i2 = asJsonPrimitive.getAsInt();
                } else if (asJsonPrimitive.getAsBoolean()) {
                    i2 = 1;
                }
                return i2;
            }
        } catch (Exception unused) {
        }
        i2 = i;
        return i2;
    }

    private long getAsLong(JsonObject jsonObject, @NonNull String str, long j) {
        long j2;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{jsonObject, str, new Long(j3)}, this, changeQuickRedirect, false, 71313, new Class[]{JsonObject.class, String.class, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{jsonObject, str, new Long(j3)}, this, changeQuickRedirect, false, 71313, new Class[]{JsonObject.class, String.class, Long.TYPE}, Long.TYPE)).longValue();
        }
        try {
            JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(str);
            if (asJsonPrimitive != null) {
                j2 = asJsonPrimitive.getAsLong();
                return j2;
            }
        } catch (Exception unused) {
        }
        j2 = j3;
        return j2;
    }

    private boolean getAsBoolean(JsonObject jsonObject, @NonNull String str, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{jsonObject, str, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71311, new Class[]{JsonObject.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jsonObject, str, Byte.valueOf(z)}, this, changeQuickRedirect, false, 71311, new Class[]{JsonObject.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(str);
            if (asJsonPrimitive != null) {
                if (!asJsonPrimitive.isNumber()) {
                    z2 = asJsonPrimitive.getAsBoolean();
                } else if (asJsonPrimitive.getAsNumber().intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return z2;
            }
        } catch (Exception unused) {
        }
        z2 = z;
        return z2;
    }
}
