package com.ss.android.ugc.aweme.poi.widget;

import android.view.View;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/widget/BusinessComponent;", "", "title", "", "iconRes", "", "showAlone", "", "callback", "Landroid/view/View$OnClickListener;", "(Ljava/lang/String;IZLandroid/view/View$OnClickListener;)V", "getCallback", "()Landroid/view/View$OnClickListener;", "setCallback", "(Landroid/view/View$OnClickListener;)V", "getIconRes", "()I", "setIconRes", "(I)V", "getShowAlone", "()Z", "setShowAlone", "(Z)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public String f61072a;

    /* renamed from: b  reason: collision with root package name */
    public int f61073b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f61074c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public View.OnClickListener f61075d;

    public e(@NotNull String str, int i, boolean z, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.TITLE);
        Intrinsics.checkParameterIsNotNull(onClickListener, "callback");
        this.f61072a = str;
        this.f61073b = i;
        this.f61074c = z;
        this.f61075d = onClickListener;
    }
}
