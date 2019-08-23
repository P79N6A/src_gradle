package com.ss.android.ugc.aweme.feed.share;

import android.app.Activity;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/share/SilentShareGuideWindow;", "Landroid/widget/PopupWindow;", "ctx", "Landroid/app/Activity;", "channel", "", "cover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "show", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f46051a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46052b;

    /* renamed from: c  reason: collision with root package name */
    private final UrlModel f46053c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(@NotNull Activity activity, @NotNull String str, @NotNull UrlModel urlModel) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "ctx");
        Intrinsics.checkParameterIsNotNull(str, "channel");
        Intrinsics.checkParameterIsNotNull(urlModel, "cover");
        this.f46051a = activity;
        this.f46052b = str;
        this.f46053c = urlModel;
    }
}
