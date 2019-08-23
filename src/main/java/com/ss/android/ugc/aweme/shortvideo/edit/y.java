package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photo.j;
import com.ss.android.ugc.aweme.tools.b.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/StoryVideoSizeProvider;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/BaseVideoSizeProvider;", "editModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "getEditModel", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "getCanvasVideoHeight", "", "getCanvasVideoWidth", "getCompileVideoHeight", "getCompileVideoWidth", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class y extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f67497d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final cb f67498e;

    public final int d() {
        return this.f67498e.mVideoWidth;
    }

    public final int e() {
        return this.f67498e.mVideoHeight;
    }

    public final int f() {
        if (PatchProxy.isSupport(new Object[0], this, f67497d, false, 76313, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67497d, false, 76313, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f66930c) {
            return d();
        } else {
            return this.f67498e.mVideoWidth;
        }
    }

    public final int g() {
        if (PatchProxy.isSupport(new Object[0], this, f67497d, false, 76314, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67497d, false, 76314, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f66930c) {
            return e();
        } else {
            return this.f67498e.mVideoHeight;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(@NotNull cb cbVar) {
        super(cbVar);
        Intrinsics.checkParameterIsNotNull(cbVar, "editModel");
        this.f67498e = cbVar;
        if (this.f67498e == null) {
            Intrinsics.throwNpe();
        }
        String str = this.f67498e.mPath;
        Intrinsics.checkExpressionValueIsNotNull(str, "editModel.mPath");
        int i = 0;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) ".jpeg", false, 2, (Object) null)) {
            String str2 = this.f67498e.mPath;
            Intrinsics.checkExpressionValueIsNotNull(str2, "editModel.mPath");
            if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) ".jpg", false, 2, (Object) null)) {
                String str3 = this.f67498e.mPath;
                Intrinsics.checkExpressionValueIsNotNull(str3, "editModel.mPath");
                if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) ".png", false, 2, (Object) null)) {
                    String str4 = this.f67498e.mPath;
                    Intrinsics.checkExpressionValueIsNotNull(str4, "editModel.mPath");
                    if (!StringsKt.contains$default((CharSequence) str4, (CharSequence) ".webp", false, 2, (Object) null)) {
                        int[] iArr = new int[10];
                        String str5 = this.f67498e.mPath;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "editModel.mPath");
                        this.f66929b = c.a(str5, iArr);
                        if (this.f66929b != 0) {
                            String str6 = this.f67498e.mPath;
                            Intrinsics.checkExpressionValueIsNotNull(str6, "editModel.mPath");
                            a(str6, iArr, this.f66929b);
                            return;
                        }
                        this.f67498e.mVideoWidth = iArr[0];
                        this.f67498e.mVideoHeight = iArr[1];
                        return;
                    }
                }
            }
        }
        int[] a2 = j.a(this.f67498e.mPath);
        this.f67498e.mVideoWidth = a2[0];
        this.f67498e.mVideoHeight = a2[1];
        this.f66929b = (this.f67498e.mVideoWidth <= 0 || this.f67498e.mVideoHeight <= 0) ? -1 : i;
    }
}
