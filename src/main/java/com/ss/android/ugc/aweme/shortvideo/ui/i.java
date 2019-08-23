package com.ss.android.ugc.aweme.shortvideo.ui;

import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ui/LegacyFromRootViewSupplier;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule$RootViewSupplier;", "mRootView", "Landroid/widget/FrameLayout;", "(Landroid/widget/FrameLayout;)V", "getToolMarkView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getToolName", "Landroid/widget/TextView;", "getToolView", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i implements StickerModule.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70898a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f70899b;

    @Nullable
    public final RemoteImageView a() {
        if (!PatchProxy.isSupport(new Object[0], this, f70898a, false, 80225, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) this.f70899b.findViewById(C0906R.id.b63);
        }
        return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, f70898a, false, 80225, new Class[0], RemoteImageView.class);
    }

    @Nullable
    public final RemoteImageView b() {
        if (!PatchProxy.isSupport(new Object[0], this, f70898a, false, 80226, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) this.f70899b.findViewById(C0906R.id.b64);
        }
        return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, f70898a, false, 80226, new Class[0], RemoteImageView.class);
    }

    public i(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "mRootView");
        this.f70899b = frameLayout;
    }
}
