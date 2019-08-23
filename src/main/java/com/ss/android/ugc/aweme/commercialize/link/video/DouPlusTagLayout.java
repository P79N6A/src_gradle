package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.support.annotation.MainThread;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.h;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/video/DouPlusTagLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "content", "Lcom/ss/android/ugc/aweme/commercialize/link/video/DouPlusLinkContent;", "clear", "", "setAd", "douPlusLinkData", "Lcom/ss/android/ugc/aweme/commercialize/model/DouPlusLinkData;", "commerceTagCallBack", "Lcom/ss/android/ugc/aweme/commercialize/link/video/CommerceTagCallBack;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DouPlusTagLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38984a;

    /* renamed from: b  reason: collision with root package name */
    private b f38985b;

    @JvmOverloads
    public DouPlusTagLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public DouPlusTagLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38984a, false, 30917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38984a, false, 30917, new Class[0], Void.TYPE);
            return;
        }
        removeAllViews();
        this.f38985b = null;
    }

    @MainThread
    public final void a(@NotNull h hVar, @NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{hVar, aVar}, this, f38984a, false, 30916, new Class[]{h.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, aVar}, this, f38984a, false, 30916, new Class[]{h.class, a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar, "douPlusLinkData");
        Intrinsics.checkParameterIsNotNull(aVar, "commerceTagCallBack");
        this.f38985b = new b(getContext(), null, 0, 6);
        b bVar = this.f38985b;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.a(hVar, aVar);
        removeAllViews();
        b bVar2 = this.f38985b;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        addView(bVar2.a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DouPlusTagLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DouPlusTagLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
