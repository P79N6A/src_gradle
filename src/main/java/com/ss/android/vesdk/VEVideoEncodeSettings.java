package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.IntRange;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class VEVideoEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoEncodeSettings>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEVideoEncodeSettings[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEVideoEncodeSettings(parcel);
        }
    };
    public c bitrateMode;
    public int bps;
    public b compileType;
    private boolean enableInterLeave;
    public boolean enableRemuxVideo;
    public int encodeProfile;
    public int encodeStandard;
    public String externalSettingsJsonStr;
    public int fps;
    public int gopSize;
    public boolean hasBFrame;
    public boolean isSupportHWEncoder;
    public String mComment;
    public String mDescription;
    public boolean mOptRemuxWithCopy;
    public VEVideoCompileEncodeSettings mVideoCompileEncodeSetting;
    public VEVideoCompileEncodeSettings mVideoWatermarkCompileEncodeSetting;
    public VEWatermarkParam mWatermarkParam;
    public aj outputSize;
    public int resizeMode;
    public float resizeX;
    public float resizeY;
    public int rotate;
    public float speed;
    public int swCRF;
    public long swMaxrate;
    public int swPreset;
    public int swQP;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        VEVideoEncodeSettings f77859a = new VEVideoEncodeSettings();

        /* renamed from: b  reason: collision with root package name */
        private int f77860b;

        public final a a(boolean z) {
            this.f77859a.enableRemuxVideo = z;
            return this;
        }

        public final a a(f fVar) {
            this.f77859a.encodeStandard = fVar.ordinal();
            return this;
        }

        public final VEVideoEncodeSettings a() {
            if (!TextUtils.isEmpty(this.f77859a.externalSettingsJsonStr)) {
                b(this.f77859a.externalSettingsJsonStr);
            } else {
                b();
            }
            y.d("VEVideoEncodeSettings", "exportVideoEncodeSettings = " + this.f77859a);
            return this.f77859a;
        }

        public final a a(String str) {
            this.f77859a.externalSettingsJsonStr = str;
            return this;
        }

        private void b() {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f77859a.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.useHWEncoder = this.f77859a.isSupportHWEncoder;
            if (vEVideoCompileEncodeSettings.useHWEncoder) {
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mBitrate = (long) this.f77859a.bps;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mProfile = this.f77859a.encodeProfile;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mGop = this.f77859a.gopSize;
            } else {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = this.f77859a.bitrateMode.ordinal();
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBps = this.f77859a.bps;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf = this.f77859a.swCRF;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate = this.f77859a.swMaxrate;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset = this.f77859a.swPreset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile = this.f77859a.encodeProfile;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop = this.f77859a.gopSize;
            }
            this.f77859a.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            this.f77859a.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
        }

        public final a a(float f2) {
            this.f77859a.resizeX = 0.0f;
            return this;
        }

        public final a b(float f2) {
            this.f77859a.resizeY = 0.0f;
            return this;
        }

        public final a c(boolean z) {
            return b(z);
        }

        public final a e(int i) {
            this.f77859a.resizeMode = i;
            return this;
        }

        public final a f(int i) {
            this.f77859a.gopSize = i;
            return this;
        }

        public a(@IntRange(from = 1, to = 3) int i) {
            this.f77860b = i;
        }

        public final a a(int i) {
            this.f77859a.fps = i;
            return this;
        }

        public final a b(int i) {
            this.f77859a.bitrateMode = c.ENCODE_BITRATE_ABR;
            this.f77859a.bps = i;
            return this;
        }

        public final a c(int i) {
            this.f77859a.bitrateMode = c.ENCODE_BITRATE_CRF;
            this.f77859a.swCRF = i;
            return this;
        }

        public final a d(int i) {
            this.f77859a.bitrateMode = c.ENCODE_BITRATE_QP;
            this.f77859a.swQP = i;
            return this;
        }

        public final a b(boolean z) {
            this.f77859a.isSupportHWEncoder = z;
            return this;
        }

        private void b(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("compile");
                this.f77859a.mVideoCompileEncodeSetting = a(jSONObject2);
                JSONObject jSONObject3 = jSONObject.getJSONObject("watermark_compile");
                this.f77859a.mVideoWatermarkCompileEncodeSetting = a(jSONObject3);
            } catch (JSONException e2) {
                y.d("VEVideoEncodeSettings", "external json str parse error : " + e2.getLocalizedMessage());
            }
        }

        public final a a(long j) {
            this.f77859a.swMaxrate = j;
            return this;
        }

        public final a a(@NonNull b bVar) {
            this.f77859a.compileType = bVar;
            return this;
        }

        public final a a(c cVar) {
            this.f77859a.bitrateMode = cVar;
            return this;
        }

        private VEVideoCompileEncodeSettings a(JSONObject jSONObject) {
            long j;
            int i;
            int i2;
            int i3;
            long j2;
            int i4;
            int i5;
            int i6;
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            try {
                vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f77859a.isSupportHWEncoder;
                String string = jSONObject.getString("encode_mode");
                if (!"unknown".equals(string) || this.f77860b != 2) {
                    vEVideoCompileEncodeSettings.useHWEncoder = "hw".equals(string);
                } else {
                    vEVideoCompileEncodeSettings.useHWEncoder = this.f77859a.isSupportHWEncoder;
                }
                VEVideoHWEncodeSettings vEVideoHWEncodeSettings = vEVideoCompileEncodeSettings.mHWEncodeSetting;
                if (this.f77860b != 2 || jSONObject.getJSONObject("hw").getInt("bitrate") != -1) {
                    j = (long) jSONObject.getJSONObject("hw").getInt("bitrate");
                } else if (this.f77859a.isSupportHWEncoder) {
                    j = (long) this.f77859a.bps;
                } else {
                    j = vEVideoCompileEncodeSettings.mHWEncodeSetting.mBitrate;
                }
                vEVideoHWEncodeSettings.mBitrate = j;
                VEVideoHWEncodeSettings vEVideoHWEncodeSettings2 = vEVideoCompileEncodeSettings.mHWEncodeSetting;
                if (this.f77860b != 2 || !"unknown".equals(jSONObject.getJSONObject("hw").getString("profile"))) {
                    i = com.ss.android.vesdk.settings.b.valueOfString(jSONObject.getJSONObject("hw").getString("profile")).ordinal();
                } else if (this.f77859a.isSupportHWEncoder) {
                    i = this.f77859a.encodeProfile;
                } else {
                    i = vEVideoCompileEncodeSettings.mHWEncodeSetting.mProfile;
                }
                vEVideoHWEncodeSettings2.mProfile = i;
                VEVideoHWEncodeSettings vEVideoHWEncodeSettings3 = vEVideoCompileEncodeSettings.mHWEncodeSetting;
                if (this.f77860b != 2 || jSONObject.getJSONObject("hw").getInt("gop") != -1) {
                    i2 = jSONObject.getJSONObject("hw").getInt("gop");
                } else if (this.f77859a.isSupportHWEncoder) {
                    i2 = this.f77859a.gopSize;
                } else {
                    i2 = vEVideoCompileEncodeSettings.mHWEncodeSetting.mGop;
                }
                vEVideoHWEncodeSettings3.mGop = i2;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = c.ENCODE_BITRATE_CRF.ordinal();
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f77860b != 2 || jSONObject.getJSONObject("sw").getInt("crf") != -1) {
                    i3 = jSONObject.getJSONObject("sw").getInt("crf");
                } else if (this.f77859a.isSupportHWEncoder) {
                    i3 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf;
                } else {
                    i3 = this.f77859a.swCRF;
                }
                vEVideoSWEncodeSettings.mCrf = i3;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings2 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f77860b != 2 || jSONObject.getJSONObject("sw").getInt("maxrate") != -1) {
                    j2 = (long) jSONObject.getJSONObject("sw").getInt("maxrate");
                } else if (this.f77859a.isSupportHWEncoder) {
                    j2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate;
                } else {
                    j2 = this.f77859a.swMaxrate;
                }
                vEVideoSWEncodeSettings2.mMaxRate = j2;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings3 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f77860b != 2 || jSONObject.getJSONObject("sw").getInt("preset") != -1) {
                    i4 = jSONObject.getJSONObject("sw").getInt("preset");
                } else if (this.f77859a.isSupportHWEncoder) {
                    i4 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset;
                } else {
                    i4 = this.f77859a.swPreset;
                }
                vEVideoSWEncodeSettings3.mPreset = i4;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings4 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f77860b != 2 || !"unknown".equals(jSONObject.getJSONObject("sw").getString("profile"))) {
                    i5 = com.ss.android.vesdk.settings.b.valueOfString(jSONObject.getJSONObject("sw").getString("profile")).ordinal();
                } else if (this.f77859a.isSupportHWEncoder) {
                    i5 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile;
                } else {
                    i5 = this.f77859a.encodeProfile;
                }
                vEVideoSWEncodeSettings4.mProfile = i5;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings5 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f77860b != 2 || jSONObject.getJSONObject("sw").getInt("gop") != -1) {
                    i6 = jSONObject.getJSONObject("sw").getInt("gop");
                } else if (this.f77859a.isSupportHWEncoder) {
                    i6 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop;
                } else {
                    i6 = this.f77859a.gopSize;
                }
                vEVideoSWEncodeSettings5.mGop = i6;
            } catch (JSONException e2) {
                y.d("VEVideoEncodeSettings", "parseJsonToSetting : external json str parse error : " + e2.getLocalizedMessage());
            }
            return vEVideoCompileEncodeSettings;
        }

        public final a a(@NonNull d dVar) {
            this.f77859a.swPreset = dVar.ordinal();
            return this;
        }

        public final a a(@NonNull e eVar) {
            this.f77859a.encodeProfile = eVar.ordinal();
            return this;
        }

        public final a a(int i, int i2) {
            this.f77859a.outputSize.f77890a = i;
            this.f77859a.outputSize.f77891b = i2;
            return this;
        }

        public final a a(c cVar, int i) {
            this.f77859a.bitrateMode = cVar;
            switch (cVar) {
                case ENCODE_BITRATE_ABR:
                    this.f77859a.bps = i;
                    break;
                case ENCODE_BITRATE_CRF:
                    this.f77859a.swCRF = i;
                    break;
                case ENCODE_BITRATE_QP:
                    this.f77859a.swQP = i;
                    break;
                case ENCODE_BITRATE_VBR:
                    this.f77859a.bps = i;
                    break;
                default:
                    throw new IllegalStateException("CompileTime BUG. Unhandled enum value " + cVar.toString());
            }
            return this;
        }
    }

    public enum b implements Parcelable {
        COMPILE_TYPE_MP4,
        COMPILE_TYPE_GIF,
        COMPILE_TYPE_HIGH_GIF;
        
        public static final Parcelable.Creator<b> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<b>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new b[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return b.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum c implements Parcelable {
        ENCODE_BITRATE_ABR,
        ENCODE_BITRATE_CRF,
        ENCODE_BITRATE_QP,
        ENCODE_BITRATE_VBR;
        
        public static final Parcelable.Creator<c> CREATOR = null;
        private static final c[] values = null;

        public final int describeContents() {
            return 0;
        }

        static {
            values = values();
            CREATOR = new Parcelable.Creator<c>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new c[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return c.values()[parcel.readInt()];
                }
            };
        }

        public static c fromInteger(int i) {
            return values[i];
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum d implements Parcelable {
        ENCODE_LEVEL_ULTRAFAST,
        ENCODE_LEVEL_SUPERFAST,
        ENCODE_LEVEL_VERYFAST,
        ENCODE_LEVEL_FASTER,
        ENCODE_LEVEL_FAST,
        ENCODE_LEVEL_MEDIUM,
        ENCODE_LEVEL_SLOW,
        ENCODE_LEVEL_SLOWER,
        ENCODE_LEVEL_VERYSLOW,
        ENCODE_LEVEL_PLACEBO;
        
        public static final Parcelable.Creator<d> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<d>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new d[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return d.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum e implements Parcelable {
        ENCODE_PROFILE_UNKNOWN,
        ENCODE_PROFILE_BASELINE,
        ENCODE_PROFILE_MAIN,
        ENCODE_PROFILE_HIGH;
        
        public static final Parcelable.Creator<e> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<e>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new e[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return e.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum f implements Parcelable {
        ENCODE_STANDARD_H264,
        ENCODE_STANDARD_H265,
        ENCODE_STANDARD_MPEG4;
        
        public static final Parcelable.Creator<f> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<f>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new f[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return f.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public int describeContents() {
        return 0;
    }

    public c getBitrateMode() {
        return this.bitrateMode;
    }

    public int getBps() {
        return this.bps;
    }

    public String getComment() {
        return this.mComment;
    }

    public b getCompileType() {
        return this.compileType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getEncodeProfile() {
        return this.encodeProfile;
    }

    public int getFps() {
        return this.fps;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public float getResizeX() {
        return this.resizeX;
    }

    public float getResizeY() {
        return this.resizeY;
    }

    public int getRotate() {
        return this.rotate;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getSwCRF() {
        return this.swCRF;
    }

    public long getSwMaxRate() {
        return this.swMaxrate;
    }

    public int getSwPreset() {
        return this.swPreset;
    }

    public int getSwQP() {
        return this.swQP;
    }

    public VEVideoCompileEncodeSettings getVideoCompileEncodeSetting() {
        return this.mVideoCompileEncodeSetting;
    }

    public aj getVideoRes() {
        return this.outputSize;
    }

    public VEVideoCompileEncodeSettings getWatermarkCompileEncodeSetting() {
        return this.mVideoWatermarkCompileEncodeSetting;
    }

    public VEWatermarkParam getWatermarkParam() {
        return this.mWatermarkParam;
    }

    public boolean isEnableInterLeave() {
        return this.enableInterLeave;
    }

    public boolean isEnableRemuxVideo() {
        return this.enableRemuxVideo;
    }

    public boolean isOptRemuxWithCopy() {
        return this.mOptRemuxWithCopy;
    }

    public boolean isSupportHwEnc() {
        return this.isSupportHWEncoder;
    }

    public int getBitrateValue() {
        switch (this.bitrateMode) {
            case ENCODE_BITRATE_ABR:
                return getBps();
            case ENCODE_BITRATE_CRF:
                return getSwCRF();
            case ENCODE_BITRATE_QP:
                return getSwQP();
            case ENCODE_BITRATE_VBR:
                return getBps();
            default:
                throw new IllegalStateException("CompileTime BUG by SDK. Unhandled ENCODE_BITRATE_MODE enum value.");
        }
    }

    private VEVideoEncodeSettings() {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new aj(576, 1024);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = c.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = d.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = f.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = e.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize.f77890a = 576;
        this.outputSize.f77891b = 1024;
        this.fps = -1;
        this.bps = 4194304;
        this.isSupportHWEncoder = true;
        this.compileType = b.COMPILE_TYPE_MP4;
    }

    public String toString() {
        return "VEVideoEncodeSettings{compileType=" + this.compileType + ", rotate=" + this.rotate + ", resizeMode=" + this.resizeMode + ", resizeX=" + this.resizeX + ", resizeY=" + this.resizeY + ", speed=" + this.speed + ", outputSize=" + this.outputSize + ", bitrateMode=" + this.bitrateMode + ", bps=" + this.bps + ", swCRF=" + this.swCRF + ", swQP=" + this.swQP + ", fps=" + this.fps + ", gopSize=" + this.gopSize + ", swPreset=" + this.swPreset + ", encodeStandard=" + this.encodeStandard + ", encodeProfile=" + this.encodeProfile + ", swMaxrate=" + this.swMaxrate + ", isSupportHWEncoder=" + this.isSupportHWEncoder + ", enableRemuxVideo=" + this.enableRemuxVideo + ", enableInterLeave=" + this.enableInterLeave + ", hasBFrame=" + this.hasBFrame + ", mWatermarkParam=" + this.mWatermarkParam + ", mVideoWatermarkCompileEncodeSetting=" + this.mVideoWatermarkCompileEncodeSetting + ", mVideoCompileEncodeSetting=" + this.mVideoCompileEncodeSetting + ", mOptRemuxWithCopy=" + this.mOptRemuxWithCopy + ", mDescripiton=" + this.mDescription + ", mComment=" + this.mComment + '}';
    }

    public void setCompileType(b bVar) {
        this.compileType = bVar;
    }

    public void setEnableInterLeave(boolean z) {
        this.enableInterLeave = z;
    }

    public void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo = z;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setGopSize(int i) {
        this.gopSize = i;
    }

    public void setResizeMode(int i) {
        this.resizeMode = i;
    }

    public void setResizeX(float f2) {
        this.resizeX = f2;
    }

    public void setResizeY(float f2) {
        this.resizeY = f2;
    }

    public void setRotate(int i) {
        this.rotate = i;
    }

    public void setSpeed(float f2) {
        this.speed = f2;
    }

    public void setSupportHwEnc(boolean z) {
        this.isSupportHWEncoder = z;
    }

    public void setWatermark(VEWatermarkParam vEWatermarkParam) {
        this.mWatermarkParam = vEWatermarkParam;
    }

    @Deprecated
    public void setBps(int i) {
        this.bitrateMode = c.ENCODE_BITRATE_VBR;
        this.bps = i;
    }

    public void setEncodeProfile(e eVar) {
        this.encodeProfile = eVar.ordinal();
    }

    public void setQP(int i) {
        this.bitrateMode = c.ENCODE_BITRATE_QP;
        this.swQP = i;
    }

    public void setSWCRF(int i) {
        this.bitrateMode = c.ENCODE_BITRATE_CRF;
        this.swCRF = i;
    }

    public void setSwPreset(d dVar) {
        this.swPreset = dVar.ordinal();
    }

    protected VEVideoEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new aj(576, 1024);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = c.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = d.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = f.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = e.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        boolean z5 = false;
        this.hasBFrame = false;
        this.compileType = (b) parcel.readParcelable(b.class.getClassLoader());
        this.rotate = parcel.readInt();
        this.resizeMode = parcel.readInt();
        this.resizeX = parcel.readFloat();
        this.resizeY = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.outputSize = (aj) parcel.readParcelable(aj.class.getClassLoader());
        this.bitrateMode = (c) parcel.readParcelable(c.class.getClassLoader());
        this.bps = parcel.readInt();
        this.fps = parcel.readInt();
        this.swCRF = parcel.readInt();
        this.swQP = parcel.readInt();
        this.gopSize = parcel.readInt();
        this.swPreset = parcel.readInt();
        this.encodeStandard = parcel.readInt();
        this.encodeProfile = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSupportHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableRemuxVideo = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableInterLeave = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.hasBFrame = z4;
        this.swMaxrate = parcel.readLong();
        this.mWatermarkParam = (VEWatermarkParam) parcel.readParcelable(VEWatermarkParam.class.getClassLoader());
        this.mVideoWatermarkCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.mVideoCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.externalSettingsJsonStr = parcel.readString();
        this.mOptRemuxWithCopy = parcel.readByte() != 0 ? true : z5;
        this.mDescription = parcel.readString();
        this.mComment = parcel.readString();
    }

    public void setVideoRes(int i, int i2) {
        this.outputSize.f77890a = i;
        this.outputSize.f77891b = i2;
    }

    public void setVideoBitrate(c cVar, int i) {
        this.bitrateMode = cVar;
        switch (this.bitrateMode) {
            case ENCODE_BITRATE_ABR:
                this.bps = i;
                return;
            case ENCODE_BITRATE_CRF:
                this.swCRF = i;
                return;
            case ENCODE_BITRATE_QP:
                this.swQP = i;
                return;
            case ENCODE_BITRATE_VBR:
                this.bps = i;
                return;
            default:
                throw new IllegalStateException("CompileTime BUG by sdk. Unhandled bitrateMode");
        }
    }

    @Deprecated
    public VEVideoEncodeSettings(aj ajVar, boolean z) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new aj(576, 1024);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = c.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = d.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = f.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = e.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize = ajVar;
        this.isSupportHWEncoder = z;
        this.compileType = b.COMPILE_TYPE_MP4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.compileType, i);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.resizeMode);
        parcel.writeFloat(this.resizeX);
        parcel.writeFloat(this.resizeY);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.outputSize, i);
        parcel.writeParcelable(this.bitrateMode, i);
        parcel.writeInt(this.bps);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.swCRF);
        parcel.writeInt(this.swQP);
        parcel.writeInt(this.gopSize);
        parcel.writeInt(this.swPreset);
        parcel.writeInt(this.encodeStandard);
        parcel.writeInt(this.encodeProfile);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideo ? (byte) 1 : 0);
        parcel.writeByte(this.enableInterLeave ? (byte) 1 : 0);
        parcel.writeByte(this.hasBFrame ? (byte) 1 : 0);
        parcel.writeLong(this.swMaxrate);
        parcel.writeParcelable(this.mWatermarkParam, i);
        parcel.writeParcelable(this.mVideoWatermarkCompileEncodeSetting, i);
        parcel.writeParcelable(this.mVideoCompileEncodeSetting, i);
        parcel.writeString(this.externalSettingsJsonStr);
        parcel.writeByte(this.mOptRemuxWithCopy ? (byte) 1 : 0);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mComment);
    }

    @Deprecated
    public VEVideoEncodeSettings(aj ajVar, boolean z, int i, int i2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new aj(576, 1024);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = c.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = d.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = f.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = e.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize = ajVar;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.compileType = b.COMPILE_TYPE_MP4;
    }

    @Deprecated
    public VEVideoEncodeSettings(aj ajVar, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new aj(576, 1024);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = c.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = d.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = f.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = e.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize = ajVar;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.bps = i3;
        this.swPreset = i4;
        this.hasBFrame = z2;
        this.compileType = b.COMPILE_TYPE_MP4;
    }
}
