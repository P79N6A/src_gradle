package com.ss.android.ugc.aweme.filter;

import android.support.annotation.DrawableRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\b\b\u0003\u0010\r\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006="}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FaceBeautyParams;", "", "maxSmooth", "", "defaultSmooth", "maxEyes", "defaultEyes", "maxContour", "defaultContour", "maxShape", "defaultShape", "tanningIconDrawableId", "bigEyeIconDrawableId", "smoothDrawableId", "reshapeDrawableId", "(IIIIIIIIIIII)V", "getBigEyeIconDrawableId", "()I", "setBigEyeIconDrawableId", "(I)V", "getDefaultContour", "setDefaultContour", "getDefaultEyes", "setDefaultEyes", "getDefaultShape", "setDefaultShape", "getDefaultSmooth", "setDefaultSmooth", "getMaxContour", "setMaxContour", "getMaxEyes", "setMaxEyes", "getMaxShape", "setMaxShape", "getMaxSmooth", "setMaxSmooth", "getReshapeDrawableId", "setReshapeDrawableId", "getSmoothDrawableId", "setSmoothDrawableId", "getTanningIconDrawableId", "setTanningIconDrawableId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47591a;

    /* renamed from: b  reason: collision with root package name */
    public int f47592b;

    /* renamed from: c  reason: collision with root package name */
    public int f47593c;

    /* renamed from: d  reason: collision with root package name */
    public int f47594d;

    /* renamed from: e  reason: collision with root package name */
    public int f47595e;

    /* renamed from: f  reason: collision with root package name */
    public int f47596f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public g() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.f47592b == gVar.f47592b) {
                    if (this.f47593c == gVar.f47593c) {
                        if (this.f47594d == gVar.f47594d) {
                            if (this.f47595e == gVar.f47595e) {
                                if (this.f47596f == gVar.f47596f) {
                                    if (this.g == gVar.g) {
                                        if (this.h == gVar.h) {
                                            if (this.i == gVar.i) {
                                                if (this.j == gVar.j) {
                                                    if (this.k == gVar.k) {
                                                        if (this.l == gVar.l) {
                                                            if (this.m == gVar.m) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.f47592b * 31) + this.f47593c) * 31) + this.f47594d) * 31) + this.f47595e) * 31) + this.f47596f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f47591a, false, 44069, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47591a, false, 44069, new Class[0], String.class);
        }
        return "FaceBeautyParams(maxSmooth=" + this.f47592b + ", defaultSmooth=" + this.f47593c + ", maxEyes=" + this.f47594d + ", defaultEyes=" + this.f47595e + ", maxContour=" + this.f47596f + ", defaultContour=" + this.g + ", maxShape=" + this.h + ", defaultShape=" + this.i + ", tanningIconDrawableId=" + this.j + ", bigEyeIconDrawableId=" + this.k + ", smoothDrawableId=" + this.l + ", reshapeDrawableId=" + this.m + ")";
    }

    public g(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @DrawableRes int i10, @DrawableRes int i11, @DrawableRes int i12, @DrawableRes int i13) {
        this.f47592b = i2;
        this.f47593c = i3;
        this.f47594d = i4;
        this.f47595e = i5;
        this.f47596f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
    }

    public /* synthetic */ g(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this(100, 0, 100, 0, 100, 0, 100, 0, -1, -1, -1, -1);
    }
}
