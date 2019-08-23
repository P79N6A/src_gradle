package com.ss.ttm.player;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.TreeMap;

public class AJMediaCodecRank {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, Integer> mTestHWCodecs;
    public String mCodecType;
    public MediaCodecInfo mMediaCodecInfo;
    public int mRank;

    private static Map<String, Integer> getTestHWcodecs() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90576, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90576, new Class[0], Map.class);
        }
        if (mTestHWCodecs != null) {
            return mTestHWCodecs;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        mTestHWCodecs = treeMap;
        treeMap.put("OMX.qcom.video.decoder.avc", 100);
        mTestHWCodecs.put("OMX.qcom.video.decoder.hevc", 100);
        mTestHWCodecs.put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
        mTestHWCodecs.put("OMX.MTK.VIDEO.DECODER.AVC", 100);
        mTestHWCodecs.put("OMX.Nvidia.h264.decode", 100);
        mTestHWCodecs.put("OMX.Intel.hw_vd.h264", 100);
        mTestHWCodecs.put("OMX.Intel.VideoDecoder.AVC", 99);
        mTestHWCodecs.put("OMX.SEC.avc.dec", 100);
        mTestHWCodecs.put("OMX.SEC.AVC.Decoder", 99);
        mTestHWCodecs.put("OMX.SEC.avcdec", 98);
        mTestHWCodecs.put("OMX.SEC.avc.sw.dec", 20);
        mTestHWCodecs.put("OMX.SEC.hevc.sw.dec", 20);
        mTestHWCodecs.put("OMX.Exynos.avc.dec", 100);
        mTestHWCodecs.put("OMX.Exynos.AVC.Decoder", 99);
        mTestHWCodecs.put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
        mTestHWCodecs.put("OMX.rk.video_decoder.avc", 100);
        mTestHWCodecs.put("OMX.amlogic.avc.decoder.awesome", 100);
        mTestHWCodecs.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
        mTestHWCodecs.put("OMX.brcm.video.h264.hw.decoder", 40);
        mTestHWCodecs.put("OMX.k3.video.decoder.avc", 40);
        mTestHWCodecs.put("OMX.IMG.MSVDX.Decoder.AVC", 100);
        mTestHWCodecs.put("OMX.hisi.video.decoder.avc", 100);
        mTestHWCodecs.put("OMX.hisi.video.decoder.hevc", 100);
        mTestHWCodecs.put("OMX.MARVELL.VIDEO.H264DECODER", 20);
        mTestHWCodecs.put("OMX.sprd.soft.h264.decoder", 20);
        return mTestHWCodecs;
    }

    public static AJMediaCodecRank setupRank(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo mediaCodecInfo2 = mediaCodecInfo;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{mediaCodecInfo2, str2}, null, changeQuickRedirect, true, 90577, new Class[]{MediaCodecInfo.class, String.class}, AJMediaCodecRank.class)) {
            return (AJMediaCodecRank) PatchProxy.accessDispatch(new Object[]{mediaCodecInfo2, str2}, null, changeQuickRedirect, true, 90577, new Class[]{MediaCodecInfo.class, String.class}, AJMediaCodecRank.class);
        } else if (mediaCodecInfo2 == null) {
            return null;
        } else {
            String name = mediaCodecInfo.getName();
            if (TextUtils.isEmpty(name)) {
                return null;
            }
            Integer num = getTestHWcodecs().get(name);
            int i = 60;
            if (num != null) {
                i = num.intValue();
            } else {
                try {
                    if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                        i = 70;
                    }
                } catch (Exception unused) {
                }
            }
            AJMediaCodecRank aJMediaCodecRank = new AJMediaCodecRank();
            aJMediaCodecRank.mMediaCodecInfo = mediaCodecInfo2;
            aJMediaCodecRank.mCodecType = str2;
            aJMediaCodecRank.mRank = i;
            return aJMediaCodecRank;
        }
    }
}
