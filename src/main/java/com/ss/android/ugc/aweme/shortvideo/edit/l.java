package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/FastImportVideoSizeProvider;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/BaseVideoSizeProvider;", "editModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "calcTargetWidth", "", "getCalcTargetWidth", "()I", "setCalcTargetWidth", "(I)V", "calvTargetHeight", "getCalvTargetHeight", "setCalvTargetHeight", "canvasHeight", "canvasWidth", "getEditModel", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "getCanvasVideoHeight", "getCanvasVideoWidth", "getCompileVideoHeight", "getCompileVideoWidth", "initSize", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class l extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f67455d;

    /* renamed from: e  reason: collision with root package name */
    public int f67456e;

    /* renamed from: f  reason: collision with root package name */
    public int f67457f;
    @NotNull
    public final cb g;
    private int h;
    private int i;

    public int d() {
        if (PatchProxy.isSupport(new Object[0], this, f67455d, false, 76270, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67455d, false, 76270, new Class[0], Integer.TYPE)).intValue();
        }
        h();
        return this.h;
    }

    public int e() {
        if (PatchProxy.isSupport(new Object[0], this, f67455d, false, 76271, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67455d, false, 76271, new Class[0], Integer.TYPE)).intValue();
        }
        h();
        return this.i;
    }

    public final int f() {
        if (PatchProxy.isSupport(new Object[0], this, f67455d, false, 76272, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67455d, false, 76272, new Class[0], Integer.TYPE)).intValue();
        }
        h();
        if (this.f66930c) {
            return this.h;
        }
        return this.f67456e;
    }

    public final int g() {
        if (PatchProxy.isSupport(new Object[0], this, f67455d, false, 76273, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67455d, false, 76273, new Class[0], Integer.TYPE)).intValue();
        }
        h();
        if (this.f66930c) {
            return this.i;
        }
        return this.f67457f;
    }

    public final void h() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (PatchProxy.isSupport(new Object[0], this, f67455d, false, 76274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67455d, false, 76274, new Class[0], Void.TYPE);
            return;
        }
        if (this.f67456e == 0 || this.f67457f == 0) {
            if (this.g.previewConfigure == null) {
                this.f67456e = this.g.mVideoWidth;
                this.f67457f = this.g.mVideoHeight;
            } else {
                aj calcTargetRes = VEUtils.calcTargetRes(new int[]{b()}, new int[]{c()}, new c[]{c.ROTATE_NONE}, this.g.previewConfigure.getPreviewWidth());
                this.f67456e = calcTargetRes.f77890a;
                this.f67457f = calcTargetRes.f77891b;
            }
        }
        if (this.h == 0 || this.i == 0) {
            if (!this.g.mIsFromDraft || !this.g.hasStickers()) {
                boolean a2 = fb.a(this.g.mVideoWidth, this.g.mVideoHeight);
                if (a2) {
                    i2 = this.g.mVideoWidth;
                } else {
                    int[] k = f.k();
                    if (k != null) {
                        i4 = k[0];
                    } else {
                        i4 = 720;
                    }
                    i2 = a(Math.min(this.g.mVideoWidth, i4));
                }
                this.h = i2;
                if (a2) {
                    i3 = this.g.mVideoHeight;
                } else {
                    double d2 = (double) this.h;
                    Double.isNaN(d2);
                    i3 = (int) (Math.ceil(d2 / 9.0d) * 16.0d);
                }
                this.i = i3;
            } else {
                if (this.g.mVideoCanvasWidth > 0) {
                    i5 = this.g.mVideoCanvasWidth;
                } else {
                    i5 = this.g.mVideoWidth;
                }
                this.h = i5;
                if (this.g.mVideoCanvasHeight > 0) {
                    i6 = this.g.mVideoCanvasHeight;
                } else {
                    i6 = this.g.mVideoHeight;
                }
                this.i = i6;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(@NotNull cb cbVar) {
        super(cbVar);
        Intrinsics.checkParameterIsNotNull(cbVar, "editModel");
        this.g = cbVar;
        if (this.g == null) {
            Intrinsics.throwNpe();
        }
        int[] iArr = new int[10];
        String str = this.g.mPath;
        Intrinsics.checkExpressionValueIsNotNull(str, "editModel.mPath");
        this.f66929b = com.ss.android.ugc.aweme.tools.b.c.a(str, iArr);
        if (this.f66929b != 0) {
            String str2 = this.g.mPath;
            Intrinsics.checkExpressionValueIsNotNull(str2, "editModel.mPath");
            a(str2, iArr, this.f66929b);
            return;
        }
        Integer num = this.g.getVideoRotateArray().get(0);
        if (num.intValue() % 360 == 90 || num.intValue() % 360 == 270) {
            this.g.mVideoWidth = iArr[1];
            this.g.mVideoHeight = iArr[0];
            return;
        }
        this.g.mVideoWidth = iArr[0];
        this.g.mVideoHeight = iArr[1];
    }
}
