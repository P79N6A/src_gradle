package com.ss.android.vesdk;

import android.support.annotation.Keep;

@Keep
public class VEMusicSRTEffectParam {
    private String mEffectResourcePath;
    private int mFontFaceIndex;
    private String mFontTTFPath;
    public a mGetMusicProgressInvoker;
    private boolean mParamUpdated;
    private b[] mSrtData;

    public interface a {
        float a();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f77846a;

        /* renamed from: b  reason: collision with root package name */
        public int f77847b;

        /* renamed from: c  reason: collision with root package name */
        public int f77848c;

        /* renamed from: d  reason: collision with root package name */
        public int f77849d;
    }

    private VEMusicSRTEffectParam() {
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        if (this.mGetMusicProgressInvoker != null) {
            return this.mGetMusicProgressInvoker.a();
        }
        return 0.0f;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length][];
        for (int i = 0; i < this.mSrtData.length; i++) {
            iArr[i] = convertDataToUnicode32(this.mSrtData[i]);
        }
        return iArr;
    }

    private int[] convertDataToUnicode32(b bVar) {
        int codePointCount = bVar.f77846a.codePointCount(0, bVar.f77846a.length());
        int[] iArr = new int[(codePointCount + 3)];
        iArr[0] = bVar.f77849d;
        iArr[1] = bVar.f77847b;
        iArr[2] = bVar.f77848c;
        for (int i = 0; i < codePointCount; i++) {
            iArr[i + 3] = bVar.f77846a.codePointAt(i);
        }
        return iArr;
    }

    public void updateEffectResPath(b[] bVarArr, String str, String str2, int i, a aVar) {
        this.mSrtData = bVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(b[] bVarArr, String str, String str2, int i, a aVar) {
        this.mSrtData = bVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }
}
