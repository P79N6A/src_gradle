package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.Arrays;
import java.util.List;

@Keep
public final class SynthetiseResult implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public float audioLength;
    public String cpuName;
    public int draftHardEncode;
    public int effect;
    public int[] effectArray;
    public String fastImportResolution;
    public double fileFps;
    public int filterIndex;
    public int flags;
    public String gpuName;
    public String inputVideoFile;
    public boolean isEnableFpsSet;
    public boolean isFastImport;
    public boolean isFromDraft;
    public int isMusic;
    public boolean isNewFramework;
    public int musicType;
    public boolean needRecode = true;
    public String outputFile;
    public String outputWavFile;
    public int ret;
    public String reverseFile;
    public int specialPoints;
    public int synthetiseCPUEncode;
    public List<String> texts;
    public int videoHeight;
    public float videoLength;
    public int videoWidth;

    public final int getReportHardEncode() {
        return ((this.synthetiseCPUEncode ^ 1) * 10) + this.draftHardEncode;
    }

    public final boolean isUsingVECompiler() {
        if ((this.flags & 1) == 1) {
            return true;
        }
        return false;
    }

    public final SynthetiseResult clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74761, new Class[0], SynthetiseResult.class)) {
            return (SynthetiseResult) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74761, new Class[0], SynthetiseResult.class);
        }
        try {
            return (SynthetiseResult) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74760, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74760, new Class[0], String.class);
        }
        try {
            return "SynthetiseResult{ret=" + this.ret + ", draftHardEncode=" + this.draftHardEncode + ", synthetiseCPUEncode=" + this.synthetiseCPUEncode + ", inputVideoFile='" + this.inputVideoFile + '\'' + ",length=" + new File(this.inputVideoFile).length() + ", reverseFile='" + this.reverseFile + '\'' + ",length=" + new File(this.reverseFile).length() + ", outputWavFile='" + this.outputWavFile + '\'' + ",length=" + new File(this.outputWavFile).length() + ", isMusic=" + this.isMusic + ", outputFile='" + this.outputFile + '\'' + ",length=" + new File(this.outputFile).length() + ", effect=" + this.effect + ", specialPoints=" + this.specialPoints + ", filterIndex=" + this.filterIndex + ", musicType=" + this.musicType + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", effectArray=" + Arrays.toString(this.effectArray) + ", isFromDraft=" + this.isFromDraft + ", cpuName=" + this.cpuName + ", gpuName=" + this.gpuName + ", fileFps=" + this.fileFps + ", flags=" + this.flags + ", isEnableFpsSet=" + this.isEnableFpsSet + ", audioLength=" + this.audioLength + ", videoLength=" + this.videoLength + ", texts=" + this.texts + ", isFastImport" + this.isFastImport + ", isNewFramework" + this.isNewFramework + '}';
        } catch (NullPointerException unused) {
            return "SynthetiseResult{ret=" + this.ret + ", draftHardEncode=" + this.draftHardEncode + ", synthetiseCPUEncode=" + this.synthetiseCPUEncode + ", inputVideoFile='" + this.inputVideoFile + '\'' + ", reverseFile='" + this.reverseFile + '\'' + ", outputWavFile='" + this.outputWavFile + '\'' + ", isMusic=" + this.isMusic + ", outputFile='" + this.outputFile + '\'' + ", effect=" + this.effect + ", specialPoints=" + this.specialPoints + ", filterIndex=" + this.filterIndex + ", musicType=" + this.musicType + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", effectArray=" + Arrays.toString(this.effectArray) + ", isFromDraft=" + this.isFromDraft + ", cpuName=" + this.cpuName + ", gpuName=" + this.gpuName + ", fileFps=" + this.fileFps + ", flags=" + this.flags + ", isEnableFpsSet=" + this.isEnableFpsSet + ", audioLength=" + this.audioLength + ", videoLength=" + this.videoLength + ", texts=" + this.texts + ", isFastImport" + this.isFastImport + ", isNewFramework" + this.isNewFramework + '}';
        }
    }
}
