package com.ss.ttm.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ttm.utils.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"NewApi"})
public class AJMediaCodec {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Object mCodecListLock = new Object();
    private static boolean mDeviceNeedsSetOutputSurfaceWorkaround;
    private static boolean mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private static boolean mIsHevcBlacklist = false;
    private static boolean mIsInitDetected = false;
    private static boolean mNeedHevcWorkAround = false;
    private static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    private MediaCodec.BufferInfo mBufferInfo;
    private Surface mDummySurface;
    private ByteBuffer[] mInputBuffers;
    private boolean mInputBuffersValid;
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputMediaFormat;

    public boolean MTKHevcNeedWorkAround() {
        return mNeedHevcWorkAround;
    }

    public int getOSVerion() {
        return Util.SDK_INT;
    }

    public ByteBuffer[] getInputBuffers() {
        if (this.mInputBuffersValid) {
            return this.mInputBuffers;
        }
        return null;
    }

    public AJMediaCodec() {
        if (!mIsInitDetected) {
            mNeedHevcWorkAround = isMtkNeedWorkAround();
            if (isHisiHevcBlackList()) {
                mIsHevcBlacklist = true;
            }
        }
        mIsInitDetected = true;
    }

    private void createDummySurface() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90545, new Class[0], Void.TYPE);
            return;
        }
        this.mDummySurface = DummySurface.newInstanceV17(false);
    }

    public void close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90551, new Class[0], Void.TYPE);
            return;
        }
        if (this.mMediaCodec != null) {
            stop();
            final MediaCodec mediaCodec = this.mMediaCodec;
            this.mMediaCodec = null;
            try {
                new Thread() {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public void run() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90574, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90574, new Class[0], Void.TYPE);
                            return;
                        }
                        AJMediaCodec.this.releaseCodec(mediaCodec);
                    }
                }.start();
            } catch (Throwable unused) {
                releaseCodec(mediaCodec);
            }
        }
    }

    public void flush() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90560, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.mMediaCodec.flush();
        } catch (Exception unused) {
        }
    }

    public int getChannelCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90567, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90567, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mOutputMediaFormat == null) {
            return 0;
        } else {
            try {
                return this.mOutputMediaFormat.getInteger("channel-count");
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public int getSampleRate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90566, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90566, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mOutputMediaFormat == null) {
            return 0;
        } else {
            try {
                return this.mOutputMediaFormat.getInteger("sample-rate");
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public int getSliceHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90565, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90565, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mOutputMediaFormat == null) {
            return 0;
        } else {
            try {
                return this.mOutputMediaFormat.getInteger("slice-height");
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public int getStride() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90564, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90564, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mOutputMediaFormat == null) {
            return 0;
        } else {
            try {
                return this.mOutputMediaFormat.getInteger("stride");
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public int stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90549, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90549, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.mInputBuffersValid) {
            try {
                this.mInputBuffersValid = false;
                this.mMediaCodec.stop();
            } catch (Exception unused) {
                return -1;
            }
        }
        return 0;
    }

    private boolean isHisiHevcBlackList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90540, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90540, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String property = getProperty("ro.board.platform", null);
        if (Util.SDK_INT == 26 && property != null && (property.startsWith("kirin960") || property.startsWith("hi3660"))) {
            double d2 = 0.0d;
            try {
                d2 = Double.valueOf(getProperty("ro.config.hw_codec_support", "0.0")).doubleValue();
            } catch (NumberFormatException unused) {
            }
            if (d2 < 0.18041d) {
                return true;
            }
        }
        return false;
    }

    private boolean isMtkNeedWorkAround() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90541, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90541, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String lowerCase = Util.HARDWARE.toLowerCase();
        if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
            return true;
        }
        return false;
    }

    public int getColorFormat() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90568, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90568, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mOutputMediaFormat == null) {
            return 0;
        } else {
            try {
                int integer = this.mOutputMediaFormat.getInteger("color-format");
                if (integer == 21 || integer == 2130706688 || integer == 2141391872) {
                    return 3;
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public int getFormatHeight() {
        boolean z;
        int i;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90563, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90563, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mOutputMediaFormat == null) {
            return 0;
        } else {
            try {
                if (!this.mOutputMediaFormat.containsKey("crop-right") || !this.mOutputMediaFormat.containsKey("crop-left") || !this.mOutputMediaFormat.containsKey("crop-bottom") || !this.mOutputMediaFormat.containsKey("crop-top")) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i = (this.mOutputMediaFormat.getInteger("crop-bottom") - this.mOutputMediaFormat.getInteger("crop-top")) + 1;
                } else {
                    i = this.mOutputMediaFormat.getInteger("height");
                }
                return i;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public int getFormatWidth() {
        boolean z;
        int i;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90562, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90562, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mOutputMediaFormat == null) {
            return 0;
        } else {
            try {
                if (!this.mOutputMediaFormat.containsKey("crop-right") || !this.mOutputMediaFormat.containsKey("crop-left") || !this.mOutputMediaFormat.containsKey("crop-bottom") || !this.mOutputMediaFormat.containsKey("crop-top")) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i = (this.mOutputMediaFormat.getInteger("crop-right") - this.mOutputMediaFormat.getInteger("crop-left")) + 1;
                } else {
                    i = this.mOutputMediaFormat.getInteger("width");
                }
                return i;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public int start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90547, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90547, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            this.mMediaCodec.start();
            this.mInputBuffers = this.mMediaCodec.getInputBuffers();
            if (Util.SDK_INT >= 21) {
                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
            }
            this.mInputBuffersValid = true;
            this.mBufferInfo = new MediaCodec.BufferInfo();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public int vendorOppoHWEnable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90542, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90542, new Class[0], Integer.TYPE)).intValue();
        }
        int i = 1;
        if (Util.BARND.equals("OPPO")) {
            try {
                i = Integer.valueOf(getProperty("persist.sys.aweme.hdsupport", PushConstants.PUSH_TYPE_THROUGH_MESSAGE)).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0621, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0622, code lost:
        switch(r2) {
            case 0: goto L_0x0626;
            case 1: goto L_0x0626;
            case 2: goto L_0x0626;
            case 3: goto L_0x0626;
            case 4: goto L_0x0626;
            case 5: goto L_0x0626;
            case 6: goto L_0x0626;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l :int: goto L_0x0626;
            case 8: goto L_0x0626;
            case 9: goto L_0x0626;
            case 10: goto L_0x0626;
            case 11: goto L_0x0626;
            case com.ss.android.ugc.aweme.discover.model.SearchNilInfo.HIT_TYPE_SENSITIVE :int: goto L_0x0626;
            case 13: goto L_0x0626;
            case 14: goto L_0x0626;
            case 15: goto L_0x0626;
            case com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter.c :int: goto L_0x0626;
            case 17: goto L_0x0626;
            case 18: goto L_0x0626;
            case 19: goto L_0x0626;
            case 20: goto L_0x0626;
            case 21: goto L_0x0626;
            case 22: goto L_0x0626;
            case 23: goto L_0x0626;
            case 24: goto L_0x0626;
            case 25: goto L_0x0626;
            case 26: goto L_0x0626;
            case 27: goto L_0x0626;
            case 28: goto L_0x0626;
            case 29: goto L_0x0626;
            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.e :int: goto L_0x0626;
            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f :int: goto L_0x0626;
            case 32: goto L_0x0626;
            case 33: goto L_0x0626;
            case 34: goto L_0x0626;
            case 35: goto L_0x0626;
            case 36: goto L_0x0626;
            case 37: goto L_0x0626;
            case 38: goto L_0x0626;
            case 39: goto L_0x0626;
            case 40: goto L_0x0626;
            case 41: goto L_0x0626;
            case 42: goto L_0x0626;
            case 43: goto L_0x0626;
            case 44: goto L_0x0626;
            case 45: goto L_0x0626;
            case 46: goto L_0x0626;
            case 47: goto L_0x0626;
            case 48: goto L_0x0626;
            case 49: goto L_0x0626;
            case 50: goto L_0x0626;
            case 51: goto L_0x0626;
            case 52: goto L_0x0626;
            case 53: goto L_0x0626;
            case 54: goto L_0x0626;
            case 55: goto L_0x0626;
            case 56: goto L_0x0626;
            case 57: goto L_0x0626;
            case 58: goto L_0x0626;
            case 59: goto L_0x0626;
            case 60: goto L_0x0626;
            case 61: goto L_0x0626;
            case 62: goto L_0x0626;
            case 63: goto L_0x0626;
            case 64: goto L_0x0626;
            case 65: goto L_0x0626;
            case 66: goto L_0x0626;
            case 67: goto L_0x0626;
            case 68: goto L_0x0626;
            case 69: goto L_0x0626;
            case 70: goto L_0x0626;
            case 71: goto L_0x0626;
            case 72: goto L_0x0626;
            case 73: goto L_0x0626;
            case 74: goto L_0x0626;
            case 75: goto L_0x0626;
            case 76: goto L_0x0626;
            case 77: goto L_0x0626;
            case 78: goto L_0x0626;
            case 79: goto L_0x0626;
            case 80: goto L_0x0626;
            case 81: goto L_0x0626;
            case 82: goto L_0x0626;
            case 83: goto L_0x0626;
            case 84: goto L_0x0626;
            case 85: goto L_0x0626;
            case 86: goto L_0x0626;
            case 87: goto L_0x0626;
            case 88: goto L_0x0626;
            case 89: goto L_0x0626;
            case 90: goto L_0x0626;
            case 91: goto L_0x0626;
            case 92: goto L_0x0626;
            case 93: goto L_0x0626;
            case 94: goto L_0x0626;
            case 95: goto L_0x0626;
            case com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter.d :int: goto L_0x0626;
            case 97: goto L_0x0626;
            case 98: goto L_0x0626;
            case 99: goto L_0x0626;
            case 100: goto L_0x0626;
            case com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity.o :int: goto L_0x0626;
            case 102: goto L_0x0626;
            case 103: goto L_0x0626;
            case 104: goto L_0x0626;
            case 105: goto L_0x0626;
            case 106: goto L_0x0626;
            case 107: goto L_0x0626;
            case 108: goto L_0x0626;
            case 109: goto L_0x0626;
            case 110: goto L_0x0626;
            case 111: goto L_0x0626;
            case com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter.e :int: goto L_0x0626;
            case 113: goto L_0x0626;
            case 114: goto L_0x0626;
            case 115: goto L_0x0626;
            case 116: goto L_0x0626;
            case 117: goto L_0x0626;
            case 118: goto L_0x0626;
            case 119: goto L_0x0626;
            case 120: goto L_0x0626;
            case 121: goto L_0x0626;
            case 122: goto L_0x0626;
            case 123: goto L_0x0626;
            default: goto L_0x0625;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0626, code lost:
        mDeviceNeedsSetOutputSurfaceWorkaround = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0628, code lost:
        r2 = com.ss.ttm.utils.Util.MODEL;
        r3 = r2.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0631, code lost:
        if (r3 == 2006354) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0636, code lost:
        if (r3 == 2006367) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x063f, code lost:
        if (r2.equals("AFTN") == false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0641, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0649, code lost:
        if (r2.equals("AFTA") == false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x064c, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x064d, code lost:
        switch(r0) {
            case 0: goto L_0x0651;
            case 1: goto L_0x0651;
            default: goto L_0x0650;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0651, code lost:
        mDeviceNeedsSetOutputSurfaceWorkaround = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean codecNeedsSetOutputSurfaceWorkaround() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = 0
            r4 = 1
            r5 = 90570(0x161ca, float:1.26916E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 90570(0x161ca, float:1.26916E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            java.lang.Class<com.ss.ttm.player.AJMediaCodec> r1 = com.ss.ttm.player.AJMediaCodec.class
            monitor-enter(r1)
            boolean r2 = mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround     // Catch:{ all -> 0x0659 }
            if (r2 != 0) goto L_0x0655
            int r2 = com.ss.ttm.utils.Util.SDK_INT     // Catch:{ all -> 0x0659 }
            r3 = 27
            r4 = 1
            if (r2 > r3) goto L_0x0052
            java.lang.String r2 = "dangal"
            java.lang.String r5 = com.ss.ttm.utils.Util.DEVICE     // Catch:{ all -> 0x0659 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0659 }
            if (r2 != 0) goto L_0x004e
            java.lang.String r2 = "HWEML"
            java.lang.String r5 = com.ss.ttm.utils.Util.DEVICE     // Catch:{ all -> 0x0659 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0052
        L_0x004e:
            mDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch:{ all -> 0x0659 }
            goto L_0x0653
        L_0x0052:
            int r2 = com.ss.ttm.utils.Util.SDK_INT     // Catch:{ all -> 0x0659 }
            if (r2 >= r3) goto L_0x0653
            java.lang.String r2 = com.ss.ttm.utils.Util.DEVICE     // Catch:{ all -> 0x0659 }
            int r5 = r2.hashCode()     // Catch:{ all -> 0x0659 }
            r6 = -1
            switch(r5) {
                case -2144781245: goto L_0x0616;
                case -2144781185: goto L_0x060b;
                case -2144781160: goto L_0x0600;
                case -2097309513: goto L_0x05f5;
                case -2022874474: goto L_0x05ea;
                case -1978993182: goto L_0x05df;
                case -1978990237: goto L_0x05d4;
                case -1936688988: goto L_0x05c9;
                case -1936688066: goto L_0x05be;
                case -1936688065: goto L_0x05b2;
                case -1931988508: goto L_0x05a6;
                case -1696512866: goto L_0x059a;
                case -1680025915: goto L_0x058e;
                case -1615810839: goto L_0x0582;
                case -1554255044: goto L_0x0576;
                case -1481772737: goto L_0x056a;
                case -1481772730: goto L_0x055e;
                case -1481772729: goto L_0x0552;
                case -1320080169: goto L_0x0546;
                case -1217592143: goto L_0x053a;
                case -1180384755: goto L_0x052e;
                case -1139198265: goto L_0x0522;
                case -1052835013: goto L_0x0516;
                case -993250464: goto L_0x050b;
                case -965403638: goto L_0x04ff;
                case -958336948: goto L_0x04f3;
                case -879245230: goto L_0x04e7;
                case -842500323: goto L_0x04db;
                case -821392978: goto L_0x04d0;
                case -797483286: goto L_0x04c4;
                case -794946968: goto L_0x04b8;
                case -788334647: goto L_0x04ac;
                case -782144577: goto L_0x04a0;
                case -575125681: goto L_0x0494;
                case -521118391: goto L_0x0488;
                case -430914369: goto L_0x047c;
                case -290434366: goto L_0x0470;
                case -282781963: goto L_0x0464;
                case -277133239: goto L_0x0458;
                case -173639913: goto L_0x044c;
                case -56598463: goto L_0x0440;
                case 2126: goto L_0x0434;
                case 2564: goto L_0x0428;
                case 2715: goto L_0x041c;
                case 2719: goto L_0x0410;
                case 3483: goto L_0x0404;
                case 73405: goto L_0x03f8;
                case 75739: goto L_0x03ec;
                case 76779: goto L_0x03e0;
                case 78669: goto L_0x03d4;
                case 79305: goto L_0x03c8;
                case 80618: goto L_0x03bc;
                case 88274: goto L_0x03b0;
                case 98846: goto L_0x03a4;
                case 98848: goto L_0x0398;
                case 99329: goto L_0x038c;
                case 101481: goto L_0x0380;
                case 1513190: goto L_0x0375;
                case 1514184: goto L_0x036a;
                case 1514185: goto L_0x035f;
                case 2436959: goto L_0x0353;
                case 2463773: goto L_0x0347;
                case 2464648: goto L_0x033b;
                case 2689555: goto L_0x032f;
                case 3154429: goto L_0x0323;
                case 3284551: goto L_0x0317;
                case 3351335: goto L_0x030b;
                case 3386211: goto L_0x02ff;
                case 41325051: goto L_0x02f3;
                case 55178625: goto L_0x02e7;
                case 61542055: goto L_0x02dc;
                case 65355429: goto L_0x02d0;
                case 66214468: goto L_0x02c4;
                case 66214470: goto L_0x02b8;
                case 66214473: goto L_0x02ac;
                case 66215429: goto L_0x02a0;
                case 66215431: goto L_0x0294;
                case 66215433: goto L_0x0288;
                case 66216390: goto L_0x027c;
                case 76402249: goto L_0x0270;
                case 76404105: goto L_0x0264;
                case 76404911: goto L_0x0258;
                case 80963634: goto L_0x024c;
                case 82882791: goto L_0x0240;
                case 98715550: goto L_0x0234;
                case 102844228: goto L_0x0228;
                case 165221241: goto L_0x021d;
                case 182191441: goto L_0x0211;
                case 245388979: goto L_0x0205;
                case 287431619: goto L_0x01f9;
                case 307593612: goto L_0x01ed;
                case 308517133: goto L_0x01e1;
                case 316215098: goto L_0x01d5;
                case 316215116: goto L_0x01c9;
                case 316246811: goto L_0x01bd;
                case 316246818: goto L_0x01b1;
                case 407160593: goto L_0x01a5;
                case 507412548: goto L_0x0199;
                case 793982701: goto L_0x018d;
                case 794038622: goto L_0x0181;
                case 794040393: goto L_0x0175;
                case 835649806: goto L_0x0169;
                case 917340916: goto L_0x015e;
                case 958008161: goto L_0x0152;
                case 1060579533: goto L_0x0146;
                case 1150207623: goto L_0x013a;
                case 1176899427: goto L_0x012e;
                case 1280332038: goto L_0x0122;
                case 1306947716: goto L_0x0116;
                case 1349174697: goto L_0x010a;
                case 1522194893: goto L_0x00fe;
                case 1691543273: goto L_0x00f2;
                case 1709443163: goto L_0x00e6;
                case 1865889110: goto L_0x00da;
                case 1906253259: goto L_0x00ce;
                case 1977196784: goto L_0x00c2;
                case 2006372676: goto L_0x00b6;
                case 2029784656: goto L_0x00aa;
                case 2030379515: goto L_0x009e;
                case 2033393791: goto L_0x0092;
                case 2047190025: goto L_0x0086;
                case 2047252157: goto L_0x007a;
                case 2048319463: goto L_0x006e;
                case 2048855701: goto L_0x0062;
                default: goto L_0x0060;
            }     // Catch:{ all -> 0x0659 }
        L_0x0060:
            goto L_0x0621
        L_0x0062:
            java.lang.String r3 = "HWWAS-H"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 54
            goto L_0x0622
        L_0x006e:
            java.lang.String r3 = "HWVNS-H"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 53
            goto L_0x0622
        L_0x007a:
            java.lang.String r5 = "ELUGA_Prim"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 27
            goto L_0x0622
        L_0x0086:
            java.lang.String r3 = "ELUGA_Note"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 26
            goto L_0x0622
        L_0x0092:
            java.lang.String r3 = "ASUS_X00AD_2"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 11
            goto L_0x0622
        L_0x009e:
            java.lang.String r3 = "HWCAM-H"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 52
            goto L_0x0622
        L_0x00aa:
            java.lang.String r3 = "HWBLN-H"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 51
            goto L_0x0622
        L_0x00b6:
            java.lang.String r3 = "BRAVIA_ATV3_4K"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 15
            goto L_0x0622
        L_0x00c2:
            java.lang.String r3 = "Infinix-X572"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 57
            goto L_0x0622
        L_0x00ce:
            java.lang.String r3 = "PB2-670M"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 85
            goto L_0x0622
        L_0x00da:
            java.lang.String r3 = "santoni"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0622
        L_0x00e6:
            java.lang.String r3 = "iball8735_9806"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 56
            goto L_0x0622
        L_0x00f2:
            java.lang.String r3 = "CPH1609"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 19
            goto L_0x0622
        L_0x00fe:
            java.lang.String r3 = "woods_f"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0622
        L_0x010a:
            java.lang.String r3 = "htc_e56ml_dtul"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 49
            goto L_0x0622
        L_0x0116:
            java.lang.String r3 = "EverStar_S"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 29
            goto L_0x0622
        L_0x0122:
            java.lang.String r3 = "hwALE-H"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 50
            goto L_0x0622
        L_0x012e:
            java.lang.String r3 = "itel_S41"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 59
            goto L_0x0622
        L_0x013a:
            java.lang.String r3 = "LS-5017"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 65
            goto L_0x0622
        L_0x0146:
            java.lang.String r3 = "panell_d"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 81
            goto L_0x0622
        L_0x0152:
            java.lang.String r3 = "j2xlteins"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 60
            goto L_0x0622
        L_0x015e:
            java.lang.String r3 = "A7000plus"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 7
            goto L_0x0622
        L_0x0169:
            java.lang.String r3 = "manning"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 67
            goto L_0x0622
        L_0x0175:
            java.lang.String r3 = "GIONEE_WBL7519"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 47
            goto L_0x0622
        L_0x0181:
            java.lang.String r3 = "GIONEE_WBL7365"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 46
            goto L_0x0622
        L_0x018d:
            java.lang.String r3 = "GIONEE_WBL5708"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 45
            goto L_0x0622
        L_0x0199:
            java.lang.String r3 = "QM16XE_U"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 99
            goto L_0x0622
        L_0x01a5:
            java.lang.String r3 = "Pixi5-10_4G"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 91
            goto L_0x0622
        L_0x01b1:
            java.lang.String r3 = "TB3-850M"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0622
        L_0x01bd:
            java.lang.String r3 = "TB3-850F"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0622
        L_0x01c9:
            java.lang.String r3 = "TB3-730X"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0622
        L_0x01d5:
            java.lang.String r3 = "TB3-730F"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0622
        L_0x01e1:
            java.lang.String r3 = "A7020a48"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 9
            goto L_0x0622
        L_0x01ed:
            java.lang.String r3 = "A7010a48"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 8
            goto L_0x0622
        L_0x01f9:
            java.lang.String r3 = "griffin"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 48
            goto L_0x0622
        L_0x0205:
            java.lang.String r3 = "marino_f"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 68
            goto L_0x0622
        L_0x0211:
            java.lang.String r3 = "CPY83_I00"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 20
            goto L_0x0622
        L_0x021d:
            java.lang.String r3 = "A2016a40"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 5
            goto L_0x0622
        L_0x0228:
            java.lang.String r3 = "le_x6"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 64
            goto L_0x0622
        L_0x0234:
            java.lang.String r3 = "i9031"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 55
            goto L_0x0622
        L_0x0240:
            java.lang.String r3 = "X3_HK"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0622
        L_0x024c:
            java.lang.String r3 = "V23GB"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0622
        L_0x0258:
            java.lang.String r3 = "Q4310"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 97
            goto L_0x0622
        L_0x0264:
            java.lang.String r3 = "Q4260"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 95
            goto L_0x0622
        L_0x0270:
            java.lang.String r3 = "PRO7S"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 93
            goto L_0x0622
        L_0x027c:
            java.lang.String r3 = "F3311"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 36
            goto L_0x0622
        L_0x0288:
            java.lang.String r3 = "F3215"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 35
            goto L_0x0622
        L_0x0294:
            java.lang.String r3 = "F3213"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 34
            goto L_0x0622
        L_0x02a0:
            java.lang.String r3 = "F3211"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 33
            goto L_0x0622
        L_0x02ac:
            java.lang.String r3 = "F3116"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 32
            goto L_0x0622
        L_0x02b8:
            java.lang.String r3 = "F3113"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 31
            goto L_0x0622
        L_0x02c4:
            java.lang.String r3 = "F3111"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 30
            goto L_0x0622
        L_0x02d0:
            java.lang.String r3 = "E5643"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 24
            goto L_0x0622
        L_0x02dc:
            java.lang.String r3 = "A1601"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 4
            goto L_0x0622
        L_0x02e7:
            java.lang.String r3 = "Aura_Note_2"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 12
            goto L_0x0622
        L_0x02f3:
            java.lang.String r3 = "MEIZU_M5"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 69
            goto L_0x0622
        L_0x02ff:
            java.lang.String r3 = "p212"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 78
            goto L_0x0622
        L_0x030b:
            java.lang.String r3 = "mido"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 71
            goto L_0x0622
        L_0x0317:
            java.lang.String r3 = "kate"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 63
            goto L_0x0622
        L_0x0323:
            java.lang.String r3 = "fugu"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 38
            goto L_0x0622
        L_0x032f:
            java.lang.String r3 = "XE2X"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0622
        L_0x033b:
            java.lang.String r3 = "Q427"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 96
            goto L_0x0622
        L_0x0347:
            java.lang.String r3 = "Q350"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 94
            goto L_0x0622
        L_0x0353:
            java.lang.String r3 = "P681"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 79
            goto L_0x0622
        L_0x035f:
            java.lang.String r3 = "1714"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 2
            goto L_0x0622
        L_0x036a:
            java.lang.String r3 = "1713"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 1
            goto L_0x0622
        L_0x0375:
            java.lang.String r3 = "1601"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 0
            goto L_0x0622
        L_0x0380:
            java.lang.String r3 = "flo"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 37
            goto L_0x0622
        L_0x038c:
            java.lang.String r3 = "deb"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 23
            goto L_0x0622
        L_0x0398:
            java.lang.String r3 = "cv3"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 22
            goto L_0x0622
        L_0x03a4:
            java.lang.String r3 = "cv1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 21
            goto L_0x0622
        L_0x03b0:
            java.lang.String r3 = "Z80"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0622
        L_0x03bc:
            java.lang.String r3 = "QX1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 100
            goto L_0x0622
        L_0x03c8:
            java.lang.String r3 = "PLE"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 92
            goto L_0x0622
        L_0x03d4:
            java.lang.String r3 = "P85"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 80
            goto L_0x0622
        L_0x03e0:
            java.lang.String r3 = "MX6"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 72
            goto L_0x0622
        L_0x03ec:
            java.lang.String r3 = "M5c"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 66
            goto L_0x0622
        L_0x03f8:
            java.lang.String r3 = "JGZ"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 61
            goto L_0x0622
        L_0x0404:
            java.lang.String r3 = "mh"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 70
            goto L_0x0622
        L_0x0410:
            java.lang.String r3 = "V5"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0622
        L_0x041c:
            java.lang.String r3 = "V1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0622
        L_0x0428:
            java.lang.String r3 = "Q5"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 98
            goto L_0x0622
        L_0x0434:
            java.lang.String r3 = "C1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 16
            goto L_0x0622
        L_0x0440:
            java.lang.String r3 = "woods_fn"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0622
        L_0x044c:
            java.lang.String r3 = "ELUGA_A3_Pro"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 25
            goto L_0x0622
        L_0x0458:
            java.lang.String r3 = "Z12_PRO"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0622
        L_0x0464:
            java.lang.String r3 = "BLACK-1X"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 13
            goto L_0x0622
        L_0x0470:
            java.lang.String r3 = "taido_row"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0622
        L_0x047c:
            java.lang.String r3 = "Pixi4-7_3G"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 90
            goto L_0x0622
        L_0x0488:
            java.lang.String r3 = "GIONEE_GBL7360"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 41
            goto L_0x0622
        L_0x0494:
            java.lang.String r3 = "GiONEE_CBL7513"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 39
            goto L_0x0622
        L_0x04a0:
            java.lang.String r3 = "OnePlus5T"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 77
            goto L_0x0622
        L_0x04ac:
            java.lang.String r3 = "whyred"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0622
        L_0x04b8:
            java.lang.String r3 = "watson"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0622
        L_0x04c4:
            java.lang.String r3 = "SVP-DTV15"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0622
        L_0x04d0:
            java.lang.String r3 = "A7000-a"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 6
            goto L_0x0622
        L_0x04db:
            java.lang.String r3 = "nicklaus_f"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 74
            goto L_0x0622
        L_0x04e7:
            java.lang.String r3 = "tcl_eu"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0622
        L_0x04f3:
            java.lang.String r3 = "ELUGA_Ray_X"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 28
            goto L_0x0622
        L_0x04ff:
            java.lang.String r3 = "s905x018"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0622
        L_0x050b:
            java.lang.String r3 = "A10-70F"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 3
            goto L_0x0622
        L_0x0516:
            java.lang.String r3 = "namath"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 73
            goto L_0x0622
        L_0x0522:
            java.lang.String r3 = "Slate_Pro"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0622
        L_0x052e:
            java.lang.String r3 = "iris60"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 58
            goto L_0x0622
        L_0x053a:
            java.lang.String r3 = "BRAVIA_ATV2"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 14
            goto L_0x0622
        L_0x0546:
            java.lang.String r3 = "GiONEE_GBL7319"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 40
            goto L_0x0622
        L_0x0552:
            java.lang.String r3 = "panell_dt"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 84
            goto L_0x0622
        L_0x055e:
            java.lang.String r3 = "panell_ds"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 83
            goto L_0x0622
        L_0x056a:
            java.lang.String r3 = "panell_dl"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 82
            goto L_0x0622
        L_0x0576:
            java.lang.String r3 = "vernee_M5"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0622
        L_0x0582:
            java.lang.String r3 = "Phantom6"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 89
            goto L_0x0622
        L_0x058e:
            java.lang.String r3 = "ComioS1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 17
            goto L_0x0622
        L_0x059a:
            java.lang.String r3 = "XT1663"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0622
        L_0x05a6:
            java.lang.String r3 = "AquaPowerM"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 10
            goto L_0x0622
        L_0x05b2:
            java.lang.String r3 = "PGN611"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 88
            goto L_0x0622
        L_0x05be:
            java.lang.String r3 = "PGN610"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 87
            goto L_0x0622
        L_0x05c9:
            java.lang.String r3 = "PGN528"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 86
            goto L_0x0622
        L_0x05d4:
            java.lang.String r3 = "NX573J"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 76
            goto L_0x0622
        L_0x05df:
            java.lang.String r3 = "NX541J"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 75
            goto L_0x0622
        L_0x05ea:
            java.lang.String r3 = "CP8676_I02"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 18
            goto L_0x0622
        L_0x05f5:
            java.lang.String r3 = "K50a40"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 62
            goto L_0x0622
        L_0x0600:
            java.lang.String r3 = "GIONEE_SWW1631"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 44
            goto L_0x0622
        L_0x060b:
            java.lang.String r3 = "GIONEE_SWW1627"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 43
            goto L_0x0622
        L_0x0616:
            java.lang.String r3 = "GIONEE_SWW1609"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x0621
            r2 = 42
            goto L_0x0622
        L_0x0621:
            r2 = -1
        L_0x0622:
            switch(r2) {
                case 0: goto L_0x0626;
                case 1: goto L_0x0626;
                case 2: goto L_0x0626;
                case 3: goto L_0x0626;
                case 4: goto L_0x0626;
                case 5: goto L_0x0626;
                case 6: goto L_0x0626;
                case 7: goto L_0x0626;
                case 8: goto L_0x0626;
                case 9: goto L_0x0626;
                case 10: goto L_0x0626;
                case 11: goto L_0x0626;
                case 12: goto L_0x0626;
                case 13: goto L_0x0626;
                case 14: goto L_0x0626;
                case 15: goto L_0x0626;
                case 16: goto L_0x0626;
                case 17: goto L_0x0626;
                case 18: goto L_0x0626;
                case 19: goto L_0x0626;
                case 20: goto L_0x0626;
                case 21: goto L_0x0626;
                case 22: goto L_0x0626;
                case 23: goto L_0x0626;
                case 24: goto L_0x0626;
                case 25: goto L_0x0626;
                case 26: goto L_0x0626;
                case 27: goto L_0x0626;
                case 28: goto L_0x0626;
                case 29: goto L_0x0626;
                case 30: goto L_0x0626;
                case 31: goto L_0x0626;
                case 32: goto L_0x0626;
                case 33: goto L_0x0626;
                case 34: goto L_0x0626;
                case 35: goto L_0x0626;
                case 36: goto L_0x0626;
                case 37: goto L_0x0626;
                case 38: goto L_0x0626;
                case 39: goto L_0x0626;
                case 40: goto L_0x0626;
                case 41: goto L_0x0626;
                case 42: goto L_0x0626;
                case 43: goto L_0x0626;
                case 44: goto L_0x0626;
                case 45: goto L_0x0626;
                case 46: goto L_0x0626;
                case 47: goto L_0x0626;
                case 48: goto L_0x0626;
                case 49: goto L_0x0626;
                case 50: goto L_0x0626;
                case 51: goto L_0x0626;
                case 52: goto L_0x0626;
                case 53: goto L_0x0626;
                case 54: goto L_0x0626;
                case 55: goto L_0x0626;
                case 56: goto L_0x0626;
                case 57: goto L_0x0626;
                case 58: goto L_0x0626;
                case 59: goto L_0x0626;
                case 60: goto L_0x0626;
                case 61: goto L_0x0626;
                case 62: goto L_0x0626;
                case 63: goto L_0x0626;
                case 64: goto L_0x0626;
                case 65: goto L_0x0626;
                case 66: goto L_0x0626;
                case 67: goto L_0x0626;
                case 68: goto L_0x0626;
                case 69: goto L_0x0626;
                case 70: goto L_0x0626;
                case 71: goto L_0x0626;
                case 72: goto L_0x0626;
                case 73: goto L_0x0626;
                case 74: goto L_0x0626;
                case 75: goto L_0x0626;
                case 76: goto L_0x0626;
                case 77: goto L_0x0626;
                case 78: goto L_0x0626;
                case 79: goto L_0x0626;
                case 80: goto L_0x0626;
                case 81: goto L_0x0626;
                case 82: goto L_0x0626;
                case 83: goto L_0x0626;
                case 84: goto L_0x0626;
                case 85: goto L_0x0626;
                case 86: goto L_0x0626;
                case 87: goto L_0x0626;
                case 88: goto L_0x0626;
                case 89: goto L_0x0626;
                case 90: goto L_0x0626;
                case 91: goto L_0x0626;
                case 92: goto L_0x0626;
                case 93: goto L_0x0626;
                case 94: goto L_0x0626;
                case 95: goto L_0x0626;
                case 96: goto L_0x0626;
                case 97: goto L_0x0626;
                case 98: goto L_0x0626;
                case 99: goto L_0x0626;
                case 100: goto L_0x0626;
                case 101: goto L_0x0626;
                case 102: goto L_0x0626;
                case 103: goto L_0x0626;
                case 104: goto L_0x0626;
                case 105: goto L_0x0626;
                case 106: goto L_0x0626;
                case 107: goto L_0x0626;
                case 108: goto L_0x0626;
                case 109: goto L_0x0626;
                case 110: goto L_0x0626;
                case 111: goto L_0x0626;
                case 112: goto L_0x0626;
                case 113: goto L_0x0626;
                case 114: goto L_0x0626;
                case 115: goto L_0x0626;
                case 116: goto L_0x0626;
                case 117: goto L_0x0626;
                case 118: goto L_0x0626;
                case 119: goto L_0x0626;
                case 120: goto L_0x0626;
                case 121: goto L_0x0626;
                case 122: goto L_0x0626;
                case 123: goto L_0x0626;
                default: goto L_0x0625;
            }     // Catch:{ all -> 0x0659 }
        L_0x0625:
            goto L_0x0628
        L_0x0626:
            mDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch:{ all -> 0x0659 }
        L_0x0628:
            java.lang.String r2 = com.ss.ttm.utils.Util.MODEL     // Catch:{ all -> 0x0659 }
            int r3 = r2.hashCode()     // Catch:{ all -> 0x0659 }
            r5 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r3 == r5) goto L_0x0643
            r0 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r3 == r0) goto L_0x0639
            goto L_0x064c
        L_0x0639:
            java.lang.String r0 = "AFTN"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0659 }
            if (r0 == 0) goto L_0x064c
            r0 = 1
            goto L_0x064d
        L_0x0643:
            java.lang.String r3 = "AFTA"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0659 }
            if (r2 == 0) goto L_0x064c
            goto L_0x064d
        L_0x064c:
            r0 = -1
        L_0x064d:
            switch(r0) {
                case 0: goto L_0x0651;
                case 1: goto L_0x0651;
                default: goto L_0x0650;
            }     // Catch:{ all -> 0x0659 }
        L_0x0650:
            goto L_0x0653
        L_0x0651:
            mDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch:{ all -> 0x0659 }
        L_0x0653:
            mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch:{ all -> 0x0659 }
        L_0x0655:
            monitor-exit(r1)     // Catch:{ all -> 0x0659 }
            boolean r0 = mDeviceNeedsSetOutputSurfaceWorkaround
            return r0
        L_0x0659:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0659 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.codecNeedsSetOutputSurfaceWorkaround():boolean");
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 90573, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 90573, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (Util.SDK_INT >= 18 && ((Util.SDK_INT != 18 || (!"OMX.SEC.avc.dec".equals(str2) && !"OMX.SEC.avc.dec.secure".equals(str2))) && (Util.SDK_INT != 19 || !Util.MODEL.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str2) && !"OMX.Exynos.avc.dec.secure".equals(str2))))) {
            z = false;
        }
        return z;
    }

    @TargetApi(21)
    private int renderOutputBufferV21(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90552, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90552, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            this.mMediaCodec.releaseOutputBuffer(i, System.nanoTime());
            return 0;
        } catch (Exception unused) {
            return -10000;
        }
    }

    public int createByCodecName(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 90543, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 90543, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            try {
                this.mMediaCodec = MediaCodec.createByCodecName(str);
                codecNeedsSetOutputSurfaceWorkaround();
                return 0;
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception unused2) {
            return -1;
        }
    }

    public int dequeueInputBuffer(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90555, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90555, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return this.mMediaCodec.dequeueInputBuffer(j);
        } catch (Exception e2) {
            return handleCodecException(e2);
        }
    }

    public int handleCodecException(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, changeQuickRedirect, false, 90554, new Class[]{Exception.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{exc}, this, changeQuickRedirect, false, 90554, new Class[]{Exception.class}, Integer.TYPE)).intValue();
        } else if (Util.SDK_INT >= 21) {
            return handleCodecExceptionV21(exc);
        } else {
            return -10000;
        }
    }

    @TargetApi(21)
    public int handleCodecExceptionV21(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, changeQuickRedirect, false, 90553, new Class[]{Exception.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{exc2}, this, changeQuickRedirect, false, 90553, new Class[]{Exception.class}, Integer.TYPE)).intValue();
        }
        if (exc2 instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc2;
            if (Util.SDK_INT >= 23) {
                if (!(codecException.isRecoverable() || codecException.getErrorCode() == 1100 || codecException.getErrorCode() == 1101)) {
                    return -10001;
                }
            } else if (!codecException.isRecoverable()) {
                return -10001;
            }
        }
        return -10000;
    }

    public void releaseCodec(MediaCodec mediaCodec) {
        if (PatchProxy.isSupport(new Object[]{mediaCodec}, this, changeQuickRedirect, false, 90550, new Class[]{MediaCodec.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaCodec}, this, changeQuickRedirect, false, 90550, new Class[]{MediaCodec.class}, Void.TYPE);
        } else if (mediaCodec != null) {
            try {
                mediaCodec.release();
                if (this.mDummySurface != null) {
                    this.mDummySurface.release();
                    this.mDummySurface = null;
                }
            } catch (Exception unused) {
                if (this.mDummySurface != null) {
                    this.mDummySurface.release();
                    this.mDummySurface = null;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                if (this.mDummySurface != null) {
                    this.mDummySurface.release();
                    this.mDummySurface = null;
                }
                throw th2;
            }
        }
    }

    public int setOutputSurface(Surface surface) {
        Surface surface2;
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 90557, new Class[]{Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 90557, new Class[]{Surface.class}, Integer.TYPE)).intValue();
        } else if (mDeviceNeedsSetOutputSurfaceWorkaround || !this.mInputBuffersValid) {
            return -1;
        } else {
            if (surface == null) {
                if (this.mDummySurface == null) {
                    createDummySurface();
                }
                surface2 = this.mDummySurface;
            } else {
                surface2 = surface;
            }
            return setOutputSurfaceV23(this.mMediaCodec, surface2);
        }
    }

    public int write(AJMediaCodecFrame aJMediaCodecFrame) {
        AJMediaCodecFrame aJMediaCodecFrame2 = aJMediaCodecFrame;
        if (PatchProxy.isSupport(new Object[]{aJMediaCodecFrame2}, this, changeQuickRedirect, false, 90558, new Class[]{AJMediaCodecFrame.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aJMediaCodecFrame2}, this, changeQuickRedirect, false, 90558, new Class[]{AJMediaCodecFrame.class}, Integer.TYPE)).intValue();
        } else if (aJMediaCodecFrame2 == null || aJMediaCodecFrame2.data == null) {
            return -1;
        } else {
            try {
                int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(30000);
                if (dequeueInputBuffer >= 0) {
                    this.mInputBuffers[dequeueInputBuffer].put(aJMediaCodecFrame2.data);
                    this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, aJMediaCodecFrame2.size, aJMediaCodecFrame2.pts, 0);
                    return 0;
                } else if (dequeueInputBuffer == -1) {
                    return 4;
                } else {
                    return -1;
                }
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public String getBestCodecName(String str) {
        int i;
        MediaCodecInfo mediaCodecInfo;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 90569, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 90569, new Class[]{String.class}, String.class);
        } else if (Util.SDK_INT < 16 || TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (str2.equals("video/hevc") && mIsHevcBlacklist) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (mCodecListLock) {
                boolean isEmpty = true ^ mVideoHWDecoderCodecs.isEmpty();
                if (isEmpty) {
                    try {
                        i = mVideoHWDecoderCodecs.size();
                    } catch (Exception unused) {
                        return null;
                    }
                } else {
                    i = MediaCodecList.getCodecCount();
                }
                for (int i2 = 0; i2 < i; i2++) {
                    if (isEmpty) {
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    }
                    if (isEmpty) {
                        mediaCodecInfo = mVideoHWDecoderCodecs.get(i2);
                    } else {
                        mediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
                    }
                    String name = mediaCodecInfo.getName();
                    if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google")) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        if (supportedTypes != null) {
                            for (String str3 : supportedTypes) {
                                if (!TextUtils.isEmpty(str3)) {
                                    if (!isEmpty && str3.startsWith("video/")) {
                                        mVideoHWDecoderCodecs.add(mediaCodecInfo);
                                    }
                                    if (str3.equalsIgnoreCase(str2) && name.startsWith("OMX.") && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure") && ((!name.startsWith("OMX.MTK.") || Util.SDK_INT >= 18) && !codecNeedsFlushWorkaround(name))) {
                                        AJMediaCodecRank aJMediaCodecRank = AJMediaCodecRank.setupRank(mediaCodecInfo, str2);
                                        if (aJMediaCodecRank != null && ((aJMediaCodecRank.mRank != 40 || Util.SDK_INT >= 21) && aJMediaCodecRank.mRank != 20)) {
                                            arrayList.add(aJMediaCodecRank);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                AJMediaCodecRank aJMediaCodecRank2 = (AJMediaCodecRank) arrayList.get(0);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AJMediaCodecRank aJMediaCodecRank3 = (AJMediaCodecRank) it2.next();
                    if (aJMediaCodecRank3.mRank > aJMediaCodecRank2.mRank) {
                        aJMediaCodecRank2 = aJMediaCodecRank3;
                    }
                }
                String name2 = aJMediaCodecRank2.mMediaCodecInfo.getName();
                return name2;
            }
        }
    }

    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static String getProperty(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, changeQuickRedirect, true, 90539, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, null, changeQuickRedirect, true, 90539, new Class[]{String.class, String.class}, String.class);
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{str, str2});
        } catch (Exception unused) {
            return str2;
        }
    }

    @TargetApi(23)
    private static int setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface) {
        if (PatchProxy.isSupport(new Object[]{mediaCodec, surface}, null, changeQuickRedirect, true, 90571, new Class[]{MediaCodec.class, Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{mediaCodec, surface}, null, changeQuickRedirect, true, 90571, new Class[]{MediaCodec.class, Surface.class}, Integer.TYPE)).intValue();
        }
        try {
            mediaCodec.setOutputSurface(surface);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public int releaseBuffer(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90561, new Class[]{Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 90561, new Class[]{Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (Util.SDK_INT >= 21 && z) {
            return renderOutputBufferV21(i);
        } else {
            try {
                this.mMediaCodec.releaseOutputBuffer(i, z);
                return 0;
            } catch (Exception e2) {
                return handleCodecException(e2);
            }
        }
    }

    public int read(AJMediaCodecFrame aJMediaCodecFrame, long j) {
        AJMediaCodecFrame aJMediaCodecFrame2 = aJMediaCodecFrame;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aJMediaCodecFrame2, new Long(j2)}, this, changeQuickRedirect, false, 90559, new Class[]{AJMediaCodecFrame.class, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aJMediaCodecFrame2, new Long(j2)}, this, changeQuickRedirect, false, 90559, new Class[]{AJMediaCodecFrame.class, Long.TYPE}, Integer.TYPE)).intValue();
        }
        while (true) {
            try {
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, j2);
                if (dequeueOutputBuffer >= 0) {
                    aJMediaCodecFrame2.data = this.mOutputBuffers[dequeueOutputBuffer];
                    aJMediaCodecFrame2.pts = this.mBufferInfo.presentationTimeUs;
                    aJMediaCodecFrame2.index = dequeueOutputBuffer;
                    aJMediaCodecFrame2.size = this.mBufferInfo.size;
                    aJMediaCodecFrame2.flags = this.mBufferInfo.flags;
                    return 0;
                } else if (dequeueOutputBuffer == -3) {
                    try {
                        this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                    } catch (Exception e2) {
                        return handleCodecException(e2);
                    }
                } else if (dequeueOutputBuffer != -2) {
                    return -1;
                } else {
                    try {
                        this.mOutputMediaFormat = this.mMediaCodec.getOutputFormat();
                        if (this.mOutputBuffers == null) {
                            try {
                                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                            } catch (Exception e3) {
                                return handleCodecException(e3);
                            }
                        }
                        return dequeueOutputBuffer;
                    } catch (Exception e4) {
                        return handleCodecException(e4);
                    }
                }
            } catch (Exception e5) {
                return handleCodecException(e5);
            }
        }
    }

    private static void maybeSetInteger(MediaFormat mediaFormat, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{mediaFormat, str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 90544, new Class[]{MediaFormat.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaFormat, str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 90544, new Class[]{MediaFormat.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    private static int getMaxInputSize(String str, int i, int i2) {
        int i3;
        int i4;
        String str2 = str;
        int i5 = i;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90572, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90572, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i5 == -1 || i6 == -1) {
            return -1;
        } else {
            if (str2.equals("video/3gpp") || str2.equals("video/mp4v-es")) {
                i3 = i5 * i6;
            } else if (str2.equals("video/avc")) {
                if ("BRAVIA 4K 2015".equals(Util.MODEL)) {
                    return -1;
                }
                i3 = ceilDivide(i5, 16) * ceilDivide(i6, 16) * 16 * 16;
            } else if (str2.equals("video/x-vnd.on2.vp8")) {
                i3 = i5 * i6;
            } else if (!str2.equals("video/hevc") && !str2.equals("video/x-vnd.on2.vp9")) {
                return -1;
            } else {
                i3 = i5 * i6;
                i4 = 4;
                return (i3 * 3) / (i4 * 2);
            }
            i4 = 2;
            return (i3 * 3) / (i4 * 2);
        }
    }

    public int queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j2), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 90556, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j2), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 90556, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            this.mMediaCodec.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (Exception e2) {
            return handleCodecException(e2);
        }
    }

    public int open(int i, int i2, int i3, String str, String str2, ByteBuffer byteBuffer, Surface surface) {
        String str3 = str2;
        ByteBuffer byteBuffer2 = byteBuffer;
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str3, byteBuffer2, surface2}, this, changeQuickRedirect, false, 90548, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, ByteBuffer.class, Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str3, byteBuffer2, surface2}, this, changeQuickRedirect, false, 90548, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, ByteBuffer.class, Surface.class}, Integer.TYPE)).intValue();
        }
        try {
            this.mMediaCodec = MediaCodec.createByCodecName(str);
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", str3);
            maybeSetInteger(mediaFormat, "width", i);
            maybeSetInteger(mediaFormat, "height", i2);
            if (byteBuffer2 != null) {
                mediaFormat.setByteBuffer("csd-0", byteBuffer2);
            }
            if (surface2 != null && Util.SDK_INT >= 21) {
                maybeSetInteger(mediaFormat, "rotation-degrees", i3);
            }
            try {
                this.mMediaCodec.configure(mediaFormat, surface2, null, 0);
                try {
                    this.mMediaCodec.start();
                    this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                    this.mInputBuffersValid = true;
                    String.format("open() input params. width:%d,height:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                    return 0;
                } catch (Exception unused) {
                    return -1;
                }
            } catch (Exception unused2) {
                return -1;
            }
        } catch (Exception unused3) {
            return -1;
        }
    }

    public int configure(int i, int i2, int i3, int i4, int i5, String str, ByteBuffer byteBuffer, Surface surface, boolean z, boolean z2) {
        Surface surface2;
        int i6 = i;
        int i7 = i2;
        String str2 = str;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2, byteBuffer2, surface, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90546, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, ByteBuffer.class, Surface.class, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2, byteBuffer2, surface, Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 90546, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, ByteBuffer.class, Surface.class, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        maybeSetInteger(mediaFormat, "width", i6);
        maybeSetInteger(mediaFormat, "height", i7);
        maybeSetInteger(mediaFormat, "max-width", 1920);
        maybeSetInteger(mediaFormat, "max-height", 1080);
        maybeSetInteger(mediaFormat, "sample-rate", i4);
        maybeSetInteger(mediaFormat, "channel-count", i5);
        maybeSetInteger(mediaFormat, "max-input-size", getMaxInputSize(str2, i6, i7));
        if (byteBuffer2 != null) {
            mediaFormat.setByteBuffer("csd-0", byteBuffer2);
        }
        if (z) {
            if (Util.SDK_INT >= 21) {
                maybeSetInteger(mediaFormat, "rotation-degrees", i3);
            }
            if ((surface == null || !surface.isValid()) && this.mDummySurface == null && Util.SDK_INT >= 23 && !mDeviceNeedsSetOutputSurfaceWorkaround) {
                createDummySurface();
                surface2 = this.mDummySurface;
            } else {
                surface2 = surface;
            }
            if (surface2 == null) {
                return -1;
            }
        } else {
            surface2 = surface;
        }
        if (Util.SDK_INT >= 23 && z2) {
            mediaFormat.setInteger("priority", 0);
        }
        try {
            this.mMediaCodec.configure(mediaFormat, surface2, null, 0);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }
}
