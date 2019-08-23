package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49567a;

    /* renamed from: b  reason: collision with root package name */
    public final IESSettings f49568b;

    /* renamed from: c  reason: collision with root package name */
    public final c f49569c;

    @KtNullable
    public final Boolean A() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48516, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48516, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getForbidLocalWatermark();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getForbidLocalWatermark();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "forbid_local_watermark", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean B() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48517, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48517, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUseWatermarkHardcode();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getUseWatermarkHardcode();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "use_watermark_hardcode", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean C() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48518, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48518, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableUploadSyncTwitter();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableUploadSyncTwitter();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_upload_sync_twitter", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean D() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48519, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48519, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableUploadSyncIns();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableUploadSyncIns();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_upload_sync_ins", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean E() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48520, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48520, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableUploadSyncInsStory();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableUploadSyncInsStory();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_upload_sync_ins_story", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean F() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48521, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48521, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableSyntheticFpsSet();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableSyntheticFpsSet();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_synthetic_fps_set", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean G() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48522, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48522, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUploadOriginAudioTrack();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getUploadOriginAudioTrack();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "upload_origin_audio_track", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer H() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48523, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48523, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getCloseVframeUpload();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getCloseVframeUpload();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "close_vframe_upload", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean I() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48525, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48525, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getPrivateAvailable();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getPrivateAvailable();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "private_available", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer J() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48526, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48526, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getBeautyModel();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getBeautyModel();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "beauty_model", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean K() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48533, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48533, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getLongVideoPermitted();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getLongVideoPermitted();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "long_video_permitted", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long L() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48534, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48534, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getLongVideoThreshold();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getLongVideoThreshold();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "long_video_threshold", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long M() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48535, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48535, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getProgressbarThreshold();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getProgressbarThreshold();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "progressbar_threshold", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final ShoppingConfig N() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48542, new Class[0], ShoppingConfig.class)) {
            return (ShoppingConfig) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48542, new Class[0], ShoppingConfig.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getShopping();
        } else {
            ShoppingConfig shoppingConfig = null;
            try {
                shoppingConfig = this.f49568b.getShopping();
            } catch (com.bytedance.ies.a unused) {
            }
            ShoppingConfig shoppingConfig2 = (ShoppingConfig) a(this.f49569c, "shopping", ShoppingConfig.class, (T) shoppingConfig);
            if (shoppingConfig2 != null) {
                return shoppingConfig2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FeConfigCollection O() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48544, new Class[0], FeConfigCollection.class)) {
            return (FeConfigCollection) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48544, new Class[0], FeConfigCollection.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFeConfigCollection();
        } else {
            FeConfigCollection feConfigCollection = null;
            try {
                feConfigCollection = this.f49568b.getFeConfigCollection();
            } catch (com.bytedance.ies.a unused) {
            }
            FeConfigCollection feConfigCollection2 = (FeConfigCollection) a(this.f49569c, "fe_config_collection", FeConfigCollection.class, (T) feConfigCollection);
            if (feConfigCollection2 != null) {
                return feConfigCollection2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String P() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48545, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48545, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoSize();
        } else {
            String str = null;
            try {
                str = this.f49568b.getVideoSize();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "video_size", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final HotSearchWitch Q() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48550, new Class[0], HotSearchWitch.class)) {
            return (HotSearchWitch) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48550, new Class[0], HotSearchWitch.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getHotsearchSwitchs();
        } else {
            HotSearchWitch hotSearchWitch = null;
            try {
                hotSearchWitch = this.f49568b.getHotsearchSwitchs();
            } catch (com.bytedance.ies.a unused) {
            }
            HotSearchWitch hotSearchWitch2 = (HotSearchWitch) a(this.f49569c, "hotsearch_switchs", HotSearchWitch.class, (T) hotSearchWitch);
            if (hotSearchWitch2 != null) {
                return hotSearchWitch2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer R() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48552, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48552, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getOpenImLink();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getOpenImLink();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "open_im_link", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String S() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48556, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48556, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getImUrlTemplate();
        } else {
            String str = null;
            try {
                str = this.f49568b.getImUrlTemplate();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "im_url_template", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer T() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48558, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48558, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getImContactsMultiSelectLimit();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getImContactsMultiSelectLimit();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "im_contacts_multi_select_limit", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer U() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48594, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48594, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getRecordBitrateMode();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getRecordBitrateMode();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "record_bitrate_mode", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer V() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48595, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48595, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getRecordOpenHighProfile();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getRecordOpenHighProfile();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "record_open_high_profile", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer W() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48596, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48596, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getRecordCameraType();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getRecordCameraType();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "record_camera_type", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer X() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48599, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48599, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getRecordCameraCompatLevel();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getRecordCameraCompatLevel();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "record_camera_compat_level", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer Y() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48602, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48602, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getReactMicStatus();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getReactMicStatus();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "react_mic_status", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean Z() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48614, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48614, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableLargeMattingDetectModel();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableLargeMattingDetectModel();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_large_matting_detect_model", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aA() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48683, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48683, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableDelayRequest();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableDelayRequest();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_delay_request", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aB() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48684, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48684, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDelayFetchUserRequest();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDelayFetchUserRequest();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_delay_fetch_user_request", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aC() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48685, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48685, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDelayFetchShareSettingRequest();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDelayFetchShareSettingRequest();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_delay_fetch_share_setting_request", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aD() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48686, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48686, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDelayFetchSamecityActiveRequest();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDelayFetchSamecityActiveRequest();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_delay_fetch_samecity_active_request", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer aE() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48689, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48689, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSecuidReportMinCount();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getSecuidReportMinCount();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "secuid_report_min_count", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final List<Integer> aF() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48690, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48690, new Class[0], List.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getThirdpartyLoginBindSkip();
        } else {
            return a(this.f49569c, "thirdparty_login_bind_skip", Integer.class, this.f49568b.getThirdpartyLoginBindSkip());
        }
    }

    @KtNullable
    public final EPlatformSettings aG() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48691, new Class[0], EPlatformSettings.class)) {
            return (EPlatformSettings) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48691, new Class[0], EPlatformSettings.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEPlatformSettings();
        } else {
            EPlatformSettings ePlatformSettings = null;
            try {
                ePlatformSettings = this.f49568b.getEPlatformSettings();
            } catch (com.bytedance.ies.a unused) {
            }
            EPlatformSettings ePlatformSettings2 = (EPlatformSettings) a(this.f49569c, "e_platform_settings", EPlatformSettings.class, (T) ePlatformSettings);
            if (ePlatformSettings2 != null) {
                return ePlatformSettings2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aH() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48692, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48692, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableAudioAutoPlay();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableAudioAutoPlay();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_audio_auto_play", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aI() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48694, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48694, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDelayAppAlertRequest();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDelayAppAlertRequest();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_delay_app_alert_request", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aJ() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48695, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48695, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAvDefaultWideMode();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getAvDefaultWideMode();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "av_default_wide_mode", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aK() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48696, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48696, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDelaySecReport();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDelaySecReport();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_delay_sec_report", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aL() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48699, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48699, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getShowRocketShareIfInstall();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getShowRocketShareIfInstall();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "show_rocket_share_if_install", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String aM() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48700, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48700, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getCommentFilterTipsSupported();
        } else {
            String str = null;
            try {
                str = this.f49568b.getCommentFilterTipsSupported();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "comment_filter_tips_supported", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final AppStoreMessage aN() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48702, new Class[0], AppStoreMessage.class)) {
            return (AppStoreMessage) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48702, new Class[0], AppStoreMessage.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAppStoreScore();
        } else {
            AppStoreMessage appStoreMessage = null;
            try {
                appStoreMessage = this.f49568b.getAppStoreScore();
            } catch (com.bytedance.ies.a unused) {
            }
            AppStoreMessage appStoreMessage2 = (AppStoreMessage) a(this.f49569c, "app_store_score", AppStoreMessage.class, (T) appStoreMessage);
            if (appStoreMessage2 != null) {
                return appStoreMessage2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aO() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48703, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48703, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableHdH264HwDecoder();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableHdH264HwDecoder();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_hd_h264_hw_decoder", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer aP() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48704, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48704, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getHdHwDecoderMinSideSize();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getHdHwDecoderMinSideSize();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "hd_hw_decoder_min_side_size", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FeedbackConf aQ() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48730, new Class[0], FeedbackConf.class)) {
            return (FeedbackConf) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48730, new Class[0], FeedbackConf.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFeedbackConf();
        } else {
            FeedbackConf feedbackConf = null;
            try {
                feedbackConf = this.f49568b.getFeedbackConf();
            } catch (com.bytedance.ies.a unused) {
            }
            FeedbackConf feedbackConf2 = (FeedbackConf) a(this.f49569c, "feedback_conf", FeedbackConf.class, (T) feedbackConf);
            if (feedbackConf2 != null) {
                return feedbackConf2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final Boolean aR() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48733, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48733, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUseNewSplashView();
        } else {
            return (Boolean) a(this.f49569c, "use_new_splash_view", Boolean.class, (T) this.f49568b.getUseNewSplashView());
        }
    }

    public final Integer aS() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48734, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48734, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getLiveSquareGuideShowCount();
        } else {
            return (Integer) a(this.f49569c, "live_square_guide_show_count", Integer.class, (T) this.f49568b.getLiveSquareGuideShowCount());
        }
    }

    @KtNullable
    public final Integer aT() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48735, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48735, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUploadContactsNoticeTimes();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getUploadContactsNoticeTimes();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "upload_contacts_notice_times", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer aU() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48736, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48736, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUploadContactsNoticeInterval();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getUploadContactsNoticeInterval();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "upload_contacts_notice_interval", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aV() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48737, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48737, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableOmSdk();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableOmSdk();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_om_sdk", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aW() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48738, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48738, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getProfilePageSkipRemove();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getProfilePageSkipRemove();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "profile_page_skip_remove", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer aX() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48739, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48739, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getPreUploadMemoryLimit();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getPreUploadMemoryLimit();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "pre_upload_memory_limit", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aY() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48740, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48740, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDelayAbSdkRequest();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDelayAbSdkRequest();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_delay_ab_sdk_request", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer aZ() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48741, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48741, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getWsUseNewSdk();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getWsUseNewSdk();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "ws_use_new_sdk", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aa() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48615, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48615, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableLargeGestureDetectModel();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableLargeGestureDetectModel();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_large_gesture_detect_model", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean ab() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48627, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48627, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getMusicCopyrightGranted();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getMusicCopyrightGranted();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "music_copyright_granted", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean ac() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48631, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48631, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableWaterBgMask();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableWaterBgMask();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_water_bg_mask", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final IMXPlanSetting ad() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48632, new Class[0], IMXPlanSetting.class)) {
            return (IMXPlanSetting) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48632, new Class[0], IMXPlanSetting.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getImXDisplayStyleConfig();
        } else {
            IMXPlanSetting iMXPlanSetting = null;
            try {
                iMXPlanSetting = this.f49568b.getImXDisplayStyleConfig();
            } catch (com.bytedance.ies.a unused) {
            }
            IMXPlanSetting iMXPlanSetting2 = (IMXPlanSetting) a(this.f49569c, "im_x_display_style_config", IMXPlanSetting.class, (T) iMXPlanSetting);
            if (iMXPlanSetting2 != null) {
                return iMXPlanSetting2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer ae() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48633, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48633, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getImXUnreadCountStrategy();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getImXUnreadCountStrategy();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "im_x_unread_count_strategy", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer af() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48640, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48640, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getImXUseEncryptedImage();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getImXUseEncryptedImage();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "im_x_use_encrypted_image", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer ag() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48642, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48642, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getBitrateOfRecodeThreshold();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getBitrateOfRecodeThreshold();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "bitrate_of_recode_threshold", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean ah() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48647, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48647, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getStorySupportAnimate();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getStorySupportAnimate();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "story_support_animate", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer ai() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48648, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48648, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoUploadNormalizationParam();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getVideoUploadNormalizationParam();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "video_upload_normalization_param", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer aj() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48649, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48649, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getWideCameraInfo();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getWideCameraInfo();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "wide_camera_info", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean ak() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48650, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48650, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getLifeEffectsColdReq();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getLifeEffectsColdReq();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "life_effects_cold_req", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UlikeParams al() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48658, new Class[0], UlikeParams.class)) {
            return (UlikeParams) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48658, new Class[0], UlikeParams.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUlikeParams();
        } else {
            UlikeParams ulikeParams = null;
            try {
                ulikeParams = this.f49568b.getUlikeParams();
            } catch (com.bytedance.ies.a unused) {
            }
            UlikeParams ulikeParams2 = (UlikeParams) a(this.f49569c, "ulike_params", UlikeParams.class, (T) ulikeParams);
            if (ulikeParams2 != null) {
                return ulikeParams2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer am() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48659, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48659, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getShakeFreeWhiteList();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getShakeFreeWhiteList();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "shake_free_white_list", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String an() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48660, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48660, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFreeFlowCardUrlSticker();
        } else {
            String str = null;
            try {
                str = this.f49568b.getFreeFlowCardUrlSticker();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "free_flow_card_url_sticker", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer ao() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48663, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48663, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getInCamera2BlackList();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getInCamera2BlackList();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "in_camera2_black_list", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean ap() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48664, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48664, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getShutterSoundEnable();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getShutterSoundEnable();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "shutter_sound_enable", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final PoiSetting aq() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48666, new Class[0], PoiSetting.class)) {
            return (PoiSetting) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48666, new Class[0], PoiSetting.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getPoiSetting();
        } else {
            PoiSetting poiSetting = null;
            try {
                poiSetting = this.f49568b.getPoiSetting();
            } catch (com.bytedance.ies.a unused) {
            }
            PoiSetting poiSetting2 = (PoiSetting) a(this.f49569c, "poi_setting", PoiSetting.class, (T) poiSetting);
            if (poiSetting2 != null) {
                return poiSetting2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean ar() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48672, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48672, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDefaultShakeFreeMode();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDefaultShakeFreeMode();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "default_shake_free_mode", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean as() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48673, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48673, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableHqVframe();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableHqVframe();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_hq_vframe", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long at() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48674, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48674, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoDurationLimitMs();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getVideoDurationLimitMs();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "video_duration_limit_ms", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String au() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48675, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48675, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getShootTutorialLink();
        } else {
            String str = null;
            try {
                str = this.f49568b.getShootTutorialLink();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "shoot_tutorial_link", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final FlipChatSettings av() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48677, new Class[0], FlipChatSettings.class)) {
            return (FlipChatSettings) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48677, new Class[0], FlipChatSettings.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFlipchatSettings();
        } else {
            FlipChatSettings flipChatSettings = null;
            try {
                flipChatSettings = this.f49568b.getFlipchatSettings();
            } catch (com.bytedance.ies.a unused) {
            }
            FlipChatSettings flipChatSettings2 = (FlipChatSettings) a(this.f49569c, "flipchat_settings", FlipChatSettings.class, (T) flipChatSettings);
            if (flipChatSettings2 != null) {
                return flipChatSettings2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean aw() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48678, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48678, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableAutoRetryRecord();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableAutoRetryRecord();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_auto_retry_record", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer ax() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48680, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48680, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnable4kImport();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getEnable4kImport();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "enable_4k_import", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean ay() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48681, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48681, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableOnPageSelectPauseCheck();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableOnPageSelectPauseCheck();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_on_page_select_pause_check", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean az() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48682, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48682, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDelayTokenBeatRequest();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDelayTokenBeatRequest();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_delay_token_beat_request", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long b() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48421, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48421, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getHttpRetryInterval();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getHttpRetryInterval();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "http_retry_interval", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final NewAnchorShowBubbleSettings bA() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48779, new Class[0], NewAnchorShowBubbleSettings.class)) {
            return (NewAnchorShowBubbleSettings) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48779, new Class[0], NewAnchorShowBubbleSettings.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getNewAnchorShowBubbleSettings();
        } else {
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = null;
            try {
                newAnchorShowBubbleSettings = this.f49568b.getNewAnchorShowBubbleSettings();
            } catch (com.bytedance.ies.a unused) {
            }
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings2 = (NewAnchorShowBubbleSettings) a(this.f49569c, "new_anchor_show_bubble_settings", NewAnchorShowBubbleSettings.class, (T) newAnchorShowBubbleSettings);
            if (newAnchorShowBubbleSettings2 != null) {
                return newAnchorShowBubbleSettings2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final Boolean bB() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48780, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48780, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableNewUserInfoSync();
        } else {
            return (Boolean) a(this.f49569c, "enable_new_user_info_sync", Boolean.class, (T) this.f49568b.getEnableNewUserInfoSync());
        }
    }

    @KtNullable
    public final String bC() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48781, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48781, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getStickerArtistIconUrl();
        } else {
            String str = null;
            try {
                str = this.f49568b.getStickerArtistIconUrl();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "sticker_artist_icon_url", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String bD() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48782, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48782, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFollowFeedSkyLiveUrl();
        } else {
            String str = null;
            try {
                str = this.f49568b.getFollowFeedSkyLiveUrl();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "follow_feed_sky_live_url", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final String bE() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48785, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48785, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getBusinessEshopManager();
        } else {
            return (String) a(this.f49569c, "business_eshop_manager", String.class, (T) this.f49568b.getBusinessEshopManager());
        }
    }

    public final Integer bF() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48787, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48787, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSecIdSwitch();
        } else {
            return (Integer) a(this.f49569c, "sec_id_switch", Integer.class, (T) this.f49568b.getSecIdSwitch());
        }
    }

    public final List<String> bG() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48789, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48789, new Class[0], List.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getTtnetInterceptWebviewWhiteList();
        } else {
            return a(this.f49569c, "ttnet_intercept_webview_white_list", String.class, this.f49568b.getTtnetInterceptWebviewWhiteList());
        }
    }

    public final List<String> bH() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48790, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48790, new Class[0], List.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getTtnetInterceptWebviewBlackList();
        } else {
            return a(this.f49569c, "ttnet_intercept_webview_black_list", String.class, this.f49568b.getTtnetInterceptWebviewBlackList());
        }
    }

    @KtNullable
    public final Integer bI() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48793, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48793, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableVeSingleGl();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getEnableVeSingleGl();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "enable_ve_single_gl", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final AssociativeEmoticonAll bJ() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48794, new Class[0], AssociativeEmoticonAll.class)) {
            return (AssociativeEmoticonAll) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48794, new Class[0], AssociativeEmoticonAll.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getImAssociativeEmoticonAll();
        } else {
            return (AssociativeEmoticonAll) a(this.f49569c, "im_associative_emoticon_all", AssociativeEmoticonAll.class, (T) this.f49568b.getImAssociativeEmoticonAll());
        }
    }

    @KtNullable
    public final Integer bK() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48795, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48795, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getIsAdapterVideoPlaySize();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getIsAdapterVideoPlaySize();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "is_adapter_video_play_size", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bL() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48796, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48796, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoPlayProgressCount();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getVideoPlayProgressCount();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "video_play_progress_count", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bM() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48798, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48798, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getShowMusicFeedbackEntrance();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getShowMusicFeedbackEntrance();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "show_music_feedback_entrance", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bN() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48799, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48799, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDelayGeckoRequestTime();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getDelayGeckoRequestTime();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "delay_gecko_request_time", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bO() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48801, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48801, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getMiniappPreloadEnbale();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getMiniappPreloadEnbale();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "miniapp_preload_enbale", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bP() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48803, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48803, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableReuseEditorForFastimport();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableReuseEditorForFastimport();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_reuse_editor_for_fastimport", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final Integer bQ() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48806, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48806, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getLightEnhanceThreshold();
        } else {
            return (Integer) a(this.f49569c, "light_enhance_threshold", Integer.class, (T) this.f49568b.getLightEnhanceThreshold());
        }
    }

    @KtNullable
    public final Boolean bR() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48807, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48807, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getPrivacyUseOldStyle();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getPrivacyUseOldStyle();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "privacy_use_old_style", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bS() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48808, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48808, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFeedbackRecordEnable();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getFeedbackRecordEnable();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "feedback_record_enable", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bT() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48809, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48809, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getHotspotGuideTime();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getHotspotGuideTime();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "hotspot_guide_time", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long ba() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48742, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48742, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSplashPreloadDelay();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getSplashPreloadDelay();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "splash_preload_delay", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bb() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48743, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48743, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSilentShareConfigurable();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getSilentShareConfigurable();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "silent_share_configurable", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bc() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48745, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48745, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getIsNewLongVideoActivity();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getIsNewLongVideoActivity();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "is_new_long_video_activity", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bd() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48746, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48746, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableSymphonySdk();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableSymphonySdk();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_symphony_sdk", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final List<String> be() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48747, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48747, new Class[0], List.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getApiAlogWhiteList();
        } else {
            return a(this.f49569c, "api_alog_white_list", String.class, this.f49568b.getApiAlogWhiteList());
        }
    }

    @KtNullable
    public final Boolean bf() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48750, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48750, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableCommerceOrder();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableCommerceOrder();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_commerce_order", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final DouyinOrderSetting bg() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48751, new Class[0], DouyinOrderSetting.class)) {
            return (DouyinOrderSetting) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48751, new Class[0], DouyinOrderSetting.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDouyinOrder();
        } else {
            DouyinOrderSetting douyinOrderSetting = null;
            try {
                douyinOrderSetting = this.f49568b.getDouyinOrder();
            } catch (com.bytedance.ies.a unused) {
            }
            DouyinOrderSetting douyinOrderSetting2 = (DouyinOrderSetting) a(this.f49569c, "douyin_order", DouyinOrderSetting.class, (T) douyinOrderSetting);
            if (douyinOrderSetting2 != null) {
                return douyinOrderSetting2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final List<DouplusTextStruct> bh() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48753, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48753, new Class[0], List.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDouplusEntryTitle();
        } else {
            return a(this.f49569c, "douplus_entry_title", DouplusTextStruct.class, this.f49568b.getDouplusEntryTitle());
        }
    }

    @KtNullable
    public final Integer bi() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48755, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48755, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFollowTabLiveType();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getFollowTabLiveType();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "follow_tab_live_type", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bj() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48756, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48756, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getIsEnableSplashFirstShowRetrieval();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getIsEnableSplashFirstShowRetrieval();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "is_enable_splash_first_show_retrieval", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bk() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48757, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48757, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getLocalVideoCacheMaxAge();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getLocalVideoCacheMaxAge();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "local_video_cache_max_age", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48758, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48758, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getLocalVideoCacheMaxLength();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getLocalVideoCacheMaxLength();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "local_video_cache_max_length", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bm() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48759, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48759, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAwemeEnableChinaUnionService();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getAwemeEnableChinaUnionService();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "aweme_enable_china_union_service", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bn() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48760, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48760, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAwemeEnableChinaTelecomService();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getAwemeEnableChinaTelecomService();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "aweme_enable_china_telecom_service", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bo() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48761, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48761, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAwemeEnableChinaMobileService();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getAwemeEnableChinaMobileService();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "aweme_enable_china_mobile_service", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final List<Integer> bp() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48762, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48762, new Class[0], List.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getOneBindNetSetting();
        } else {
            return a(this.f49569c, "one_bind_net_setting", Integer.class, this.f49568b.getOneBindNetSetting());
        }
    }

    public final Boolean bq() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48763, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48763, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getIsHotUser();
        } else {
            return (Boolean) a(this.f49569c, "is_hot_user", Boolean.class, (T) this.f49568b.getIsHotUser());
        }
    }

    @KtNullable
    public final Boolean br() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48765, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48765, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableDvmLinearAllocOpt();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDisableDvmLinearAllocOpt();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "disable_dvm_linear_alloc_opt", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UgAwemeActivitySetting bs() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48768, new Class[0], UgAwemeActivitySetting.class)) {
            return (UgAwemeActivitySetting) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48768, new Class[0], UgAwemeActivitySetting.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAwemeActivitySetting();
        } else {
            UgAwemeActivitySetting ugAwemeActivitySetting = null;
            try {
                ugAwemeActivitySetting = this.f49568b.getAwemeActivitySetting();
            } catch (com.bytedance.ies.a unused) {
            }
            UgAwemeActivitySetting ugAwemeActivitySetting2 = (UgAwemeActivitySetting) a(this.f49569c, "aweme_activity_setting", UgAwemeActivitySetting.class, (T) ugAwemeActivitySetting);
            if (ugAwemeActivitySetting2 != null) {
                return ugAwemeActivitySetting2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer bt() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48770, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48770, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnable1080pFastImport();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getEnable1080pFastImport();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "enable_1080p_fast_import", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean bu() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48771, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48771, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDiscardRefreshTopDsp();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getDiscardRefreshTopDsp();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "discard_refresh_top_dsp", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public final Boolean bv() {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48773, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48773, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDisableVastBitrate();
        } else {
            return (Boolean) a(this.f49569c, "disable_vast_bitrate", Boolean.class, (T) this.f49568b.getDisableVastBitrate());
        }
    }

    @KtNullable
    public final Boolean bw() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48774, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48774, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableAutoLiveState();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableAutoLiveState();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_auto_live_state", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long bx() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48775, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48775, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAutoLiveStateIntervalMills();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getAutoLiveStateIntervalMills();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "auto_live_state_interval_mills", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String by() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48776, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48776, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getStarAtlasProfileLink();
        } else {
            String str = null;
            try {
                str = this.f49568b.getStarAtlasProfileLink();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "star_atlas_profile_link", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final ImCreateChatBubble bz() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48778, new Class[0], ImCreateChatBubble.class)) {
            return (ImCreateChatBubble) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48778, new Class[0], ImCreateChatBubble.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getImCreateChatBubble();
        } else {
            ImCreateChatBubble imCreateChatBubble = null;
            try {
                imCreateChatBubble = this.f49568b.getImCreateChatBubble();
            } catch (com.bytedance.ies.a unused) {
            }
            ImCreateChatBubble imCreateChatBubble2 = (ImCreateChatBubble) a(this.f49569c, "im_create_chat_bubble", ImCreateChatBubble.class, (T) imCreateChatBubble);
            if (imCreateChatBubble2 != null) {
                return imCreateChatBubble2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long c() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48422, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48422, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getHttpTimeout();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getHttpTimeout();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "http_timeout", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer d() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48424, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48424, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoCompose();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getVideoCompose();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "video_compose", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer e() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48425, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48425, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoCommit();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getVideoCommit();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "video_commit", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer f() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48430, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48430, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUseHardcode();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getUseHardcode();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "use_hardcode", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer g() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48439, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48439, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getFaceDetectInterval();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getFaceDetectInterval();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "face_detect_interval", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean h() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48441, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48441, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getOriginalMusicianEntry();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getOriginalMusicianEntry();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "original_musician_entry", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer i() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48443, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48443, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getMusicianShowType();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getMusicianShowType();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "musician_show_type", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String j() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48445, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48445, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getOrginalMusicianUrl();
        } else {
            String str = null;
            try {
                str = this.f49568b.getOrginalMusicianUrl();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "orginal_musician_url", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String k() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48462, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48462, new Class[0], String.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getDiscoveryLocationBackgroundUrl();
        } else {
            String str = null;
            try {
                str = this.f49568b.getDiscoveryLocationBackgroundUrl();
            } catch (com.bytedance.ies.a unused) {
            }
            String str2 = (String) a(this.f49569c, "discovery_location_background_url", String.class, (T) str);
            if (str2 != null) {
                return str2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer l() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48464, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48464, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoQuality();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getVideoQuality();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "video_quality", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer m() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48465, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48465, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSyntheticVideoQuality();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getSyntheticVideoQuality();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "synthetic_video_quality", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long n() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48466, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48466, new Class[0], Long.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSyntheticVideoMaxrate();
        } else {
            Long l = null;
            try {
                l = this.f49568b.getSyntheticVideoMaxrate();
            } catch (com.bytedance.ies.a unused) {
            }
            Long l2 = (Long) a(this.f49569c, "synthetic_video_maxrate", Long.class, (T) l);
            if (l2 != null) {
                return l2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer o() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48467, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48467, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSyntheticVideoPreset();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getSyntheticVideoPreset();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "synthetic_video_preset", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer p() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48468, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48468, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSyntheticVideoGop();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getSyntheticVideoGop();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "synthetic_video_gop", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer q() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48471, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48471, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableHuaweiSuperSlow();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getEnableHuaweiSuperSlow();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "enable_huawei_super_slow", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer r() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48472, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48472, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getInEvening();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getInEvening();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "in_evening", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final AdLandingPageConfig s() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48473, new Class[0], AdLandingPageConfig.class)) {
            return (AdLandingPageConfig) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48473, new Class[0], AdLandingPageConfig.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getAdLandingPageConfig();
        } else {
            AdLandingPageConfig adLandingPageConfig = null;
            try {
                adLandingPageConfig = this.f49568b.getAdLandingPageConfig();
            } catch (com.bytedance.ies.a unused) {
            }
            AdLandingPageConfig adLandingPageConfig2 = (AdLandingPageConfig) a(this.f49569c, "ad_landing_page_config", AdLandingPageConfig.class, (T) adLandingPageConfig);
            if (adLandingPageConfig2 != null) {
                return adLandingPageConfig2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean t() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48487, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48487, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getCanReact();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getCanReact();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "can_react", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean u() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48496, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48496, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getEnableLocalMusicEntrance();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getEnableLocalMusicEntrance();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "enable_local_music_entrance", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer v() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48506, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48506, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getStoryImagePlayTime();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getStoryImagePlayTime();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "story_image_play_time", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean w() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48510, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48510, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getShieldMusicSdk();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getShieldMusicSdk();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "shield_music_sdk", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer x() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48512, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48512, new Class[0], Integer.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getUseSyntheticHardcode();
        } else {
            Integer num = null;
            try {
                num = this.f49568b.getUseSyntheticHardcode();
            } catch (com.bytedance.ies.a unused) {
            }
            Integer num2 = (Integer) a(this.f49569c, "use_synthetic_hardcode", Integer.class, (T) num);
            if (num2 != null) {
                return num2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float y() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48513, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48513, new Class[0], Float.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getSyntheticVideoBitrate();
        } else {
            Float f2 = null;
            try {
                f2 = this.f49568b.getSyntheticVideoBitrate();
            } catch (com.bytedance.ies.a unused) {
            }
            Float f3 = (Float) a(this.f49569c, "synthetic_video_bitrate", Float.class, (T) f2);
            if (f3 != null) {
                return f3;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean z() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48515, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48515, new Class[0], Boolean.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getForbidLifeStoryLocalWatermark();
        } else {
            Boolean bool = null;
            try {
                bool = this.f49568b.getForbidLifeStoryLocalWatermark();
            } catch (com.bytedance.ies.a unused) {
            }
            Boolean bool2 = (Boolean) a(this.f49569c, "forbid_life_story_local_watermark", Boolean.class, (T) bool);
            if (bool2 != null) {
                return bool2;
            }
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float a() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, f49567a, false, 48417, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, f49567a, false, 48417, new Class[0], Float.class);
        } else if (this.f49569c == null) {
            return this.f49568b.getVideoBitrate();
        } else {
            Float f2 = null;
            try {
                f2 = this.f49568b.getVideoBitrate();
            } catch (com.bytedance.ies.a unused) {
            }
            Float f3 = (Float) a(this.f49569c, "video_bitrate", Float.class, (T) f2);
            if (f3 != null) {
                return f3;
            }
            throw new com.bytedance.ies.a();
        }
    }

    public a(IESSettings iESSettings, c cVar) {
        this.f49568b = iESSettings;
        this.f49569c = cVar;
    }

    public static <T> T a(c cVar, String str, Class<T> cls, T t) {
        T t2;
        if (PatchProxy.isSupport(new Object[]{cVar, str, cls, t}, null, f49567a, true, 48810, new Class[]{c.class, String.class, Class.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cVar, str, cls, t}, null, f49567a, true, 48810, new Class[]{c.class, String.class, Class.class, Object.class}, Object.class);
        }
        try {
            t2 = cVar.a(str, cls, t);
        } catch (Throwable unused) {
            t2 = t;
        }
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    public static <T> List<T> a(c cVar, String str, Class<T> cls, List<T> list) {
        List<T> list2;
        if (PatchProxy.isSupport(new Object[]{cVar, str, cls, list}, null, f49567a, true, 48811, new Class[]{c.class, String.class, Class.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{cVar, str, cls, list}, null, f49567a, true, 48811, new Class[]{c.class, String.class, Class.class, List.class}, List.class);
        }
        try {
            list2 = cVar.a(str, cls, list);
        } catch (Throwable unused) {
            list2 = list;
        }
        if (list2 != null) {
            return list2;
        }
        return list;
    }
}
