package com.bytedance.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class SmartRoute {
    private int enterAnim = -1;
    private int exitAnim = -1;
    private Context mContext;
    private Intent mExtraParams;
    private String mUrl = "";

    public SmartRoute withParam(String str, boolean z) {
        this.mExtraParams.putExtra(str, z);
        return this;
    }

    public SmartRoute withParam(String str, boolean[] zArr) {
        this.mExtraParams.putExtra(str, zArr);
        return this;
    }

    public SmartRoute withParam(String str, byte[] bArr) {
        this.mExtraParams.putExtra(str, bArr);
        return this;
    }

    public SmartRoute withParam(String str, char[] cArr) {
        this.mExtraParams.putExtra(str, cArr);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence charSequence) {
        this.mExtraParams.putExtra(str, charSequence);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.mExtraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public SmartRoute withParam(String str, double[] dArr) {
        this.mExtraParams.putExtra(str, dArr);
        return this;
    }

    public SmartRoute withParam(String str, float[] fArr) {
        this.mExtraParams.putExtra(str, fArr);
        return this;
    }

    public SmartRoute withParam(String str, int[] iArr) {
        this.mExtraParams.putExtra(str, iArr);
        return this;
    }

    public SmartRoute withParam(String str, long[] jArr) {
        this.mExtraParams.putExtra(str, jArr);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable parcelable) {
        this.mExtraParams.putExtra(str, parcelable);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable[] parcelableArr) {
        this.mExtraParams.putExtra(str, parcelableArr);
        return this;
    }

    public SmartRoute withParam(String str, Serializable serializable) {
        this.mExtraParams.putExtra(str, serializable);
        return this;
    }

    public SmartRoute withParam(String str, short s) {
        this.mExtraParams.putExtra(str, s);
        return this;
    }

    public SmartRoute withParam(String str, short[] sArr) {
        this.mExtraParams.putExtra(str, sArr);
        return this;
    }

    public SmartRoute withParam(String str, String str2) {
        this.mExtraParams.putExtra(str, str2);
        return this;
    }

    public SmartRoute withParam(String str, String[] strArr) {
        this.mExtraParams.putExtra(str, strArr);
        return this;
    }

    private RouteIntent buildRouteIntent() {
        return new RouteIntent.Builder().withUrl(this.mUrl).withParam(this.mExtraParams).withAnimation(this.enterAnim, this.exitAnim).build();
    }

    public Intent buildIntent() {
        if (TextUtils.isEmpty(this.mUrl)) {
            Logger.e("SmartRoute#url is null!!!");
            return null;
        } else if (!Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#url is illegal and url is " + this.mUrl);
            return null;
        } else {
            return RouteManager.getInstance().buildIntent(this.mContext, buildRouteIntent());
        }
    }

    public void open() {
        if (this.mContext == null) {
            Logger.e("SmartRoute#open context is null!!!");
        } else if (TextUtils.isEmpty(this.mUrl)) {
            Logger.e("SmartRoute#url is null!!!");
        } else if (!Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#url is illegal and url is " + this.mUrl);
        } else {
            RouteManager.getInstance().open(this.mContext, buildRouteIntent());
        }
    }

    public SmartRoute withUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public SmartRoute addFlags(int i) {
        this.mExtraParams.addFlags(i);
        return this;
    }

    public SmartRoute withParam(Bundle bundle) {
        this.mExtraParams.putExtras(bundle);
        return this;
    }

    public SmartRoute(Context context) {
        this.mContext = context;
        this.mExtraParams = new Intent();
    }

    public SmartRoute withParam(Intent intent) {
        if (intent.getExtras() != null) {
            if (this.mExtraParams.getExtras() == null) {
                this.mExtraParams.putExtras(new Bundle());
            }
            this.mExtraParams.getExtras().putAll(intent.getExtras());
        }
        return this;
    }

    public void open(int i) {
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("requestCode must not be Integer.MIN_VALUE:-2147483648 !!!");
        } else if (this.mContext == null) {
            Logger.e("SmartRoute#open context is null!!!");
        } else if (TextUtils.isEmpty(this.mUrl)) {
            Logger.e("SmartRoute#url is null!!!");
        } else if (!Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#url is illegal and url is " + this.mUrl);
        } else if (!(this.mContext instanceof Activity)) {
            Logger.e("SmartRoute#context is not Activity!!!");
        } else {
            RouteIntent buildRouteIntent = buildRouteIntent();
            buildRouteIntent.setRequestCode(i);
            RouteManager.getInstance().open(this.mContext, buildRouteIntent);
        }
    }

    public SmartRoute withAnimation(int i, int i2) {
        this.enterAnim = i;
        this.exitAnim = i2;
        return this;
    }

    public SmartRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.mExtraParams.putExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.mExtraParams.putExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamParcelableList(String str, ArrayList<Parcelable> arrayList) {
        this.mExtraParams.putExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.mExtraParams.putExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParam(String str, byte b2) {
        this.mExtraParams.putExtra(str, b2);
        return this;
    }

    public SmartRoute withParam(String str, char c2) {
        this.mExtraParams.putExtra(str, c2);
        return this;
    }

    private void sliceParams2Intent(Intent intent, String str) {
        Map<String, String> sliceUrlParams = Util.sliceUrlParams(str);
        if (sliceUrlParams != null && sliceUrlParams.size() != 0) {
            for (Map.Entry next : sliceUrlParams.entrySet()) {
                intent.putExtra((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    public SmartRoute withParam(String str, double d2) {
        this.mExtraParams.putExtra(str, d2);
        return this;
    }

    public SmartRoute withParam(String str, float f2) {
        this.mExtraParams.putExtra(str, f2);
        return this;
    }

    public SmartRoute withParam(String str, int i) {
        this.mExtraParams.putExtra(str, i);
        return this;
    }

    public SmartRoute withParam(String str, long j) {
        this.mExtraParams.putExtra(str, j);
        return this;
    }

    public SmartRoute withParam(String str, Bundle bundle) {
        this.mExtraParams.putExtra(str, bundle);
        return this;
    }
}
