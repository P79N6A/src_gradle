package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.fb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/DefaultVideoSizeProvider;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/BaseVideoSizeProvider;", "editModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "canvasHeight", "", "canvasWidth", "getEditModel", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "getCanvasVideoHeight", "getCanvasVideoWidth", "getCompileVideoHeight", "getCompileVideoWidth", "initCanvasSize", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f67158d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final cb f67159e;

    /* renamed from: f  reason: collision with root package name */
    private int f67160f;
    private int g;

    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, f67158d, false, 76217, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67158d, false, 76217, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f67160f == 0) {
            h();
        }
        return this.f67160f;
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f67158d, false, 76218, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67158d, false, 76218, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.g == 0) {
            h();
        }
        return this.g;
    }

    public final int f() {
        if (PatchProxy.isSupport(new Object[0], this, f67158d, false, 76219, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67158d, false, 76219, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f66930c) {
            return d();
        } else {
            return this.f67159e.mVideoWidth;
        }
    }

    public final int g() {
        if (PatchProxy.isSupport(new Object[0], this, f67158d, false, 76220, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67158d, false, 76220, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f66930c) {
            return e();
        } else {
            return this.f67159e.mVideoHeight;
        }
    }

    private final void h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[0], this, f67158d, false, 76221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67158d, false, 76221, new Class[0], Void.TYPE);
        } else if (!this.f67159e.mIsFromDraft || !this.f67159e.hasStickers()) {
            boolean a2 = fb.a(this.f67159e.mVideoWidth, this.f67159e.mVideoHeight);
            if (a2) {
                i = this.f67159e.mVideoWidth;
            } else {
                int[] k = f.k();
                if (k != null) {
                    i3 = k[0];
                } else {
                    i3 = 720;
                }
                i = a(Math.min(this.f67159e.mVideoWidth, i3));
            }
            this.f67160f = i;
            if (a2) {
                i2 = this.f67159e.mVideoHeight;
            } else {
                double d2 = (double) this.f67160f;
                Double.isNaN(d2);
                i2 = (int) (Math.ceil(d2 / 9.0d) * 16.0d);
            }
            this.g = i2;
        } else {
            if (this.f67159e.mVideoCanvasWidth > 0) {
                i4 = this.f67159e.mVideoCanvasWidth;
            } else {
                i4 = this.f67159e.mVideoWidth;
            }
            this.f67160f = i4;
            if (this.f67159e.mVideoCanvasHeight > 0) {
                i5 = this.f67159e.mVideoCanvasHeight;
            } else {
                i5 = this.f67159e.mVideoHeight;
            }
            this.g = i5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull cb cbVar) {
        super(cbVar);
        Intrinsics.checkParameterIsNotNull(cbVar, "editModel");
        this.f67159e = cbVar;
        if (this.f67159e == null) {
            Intrinsics.throwNpe();
        }
        int[] iArr = new int[10];
        String str = this.f67159e.mPath;
        Intrinsics.checkExpressionValueIsNotNull(str, "editModel.mPath");
        this.f66929b = com.ss.android.ugc.aweme.tools.b.c.a(str, iArr);
        if (this.f66929b != 0) {
            String str2 = this.f67159e.mPath;
            Intrinsics.checkExpressionValueIsNotNull(str2, "editModel.mPath");
            a(str2, iArr, this.f66929b);
            return;
        }
        this.f67159e.mVideoWidth = iArr[0];
        this.f67159e.mVideoHeight = iArr[1];
    }
}
