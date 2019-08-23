package com.ss.android.ugc.aweme.discover.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B9\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/SourceTabPage;", "T", "Landroid/support/v4/app/Fragment;", "", "clazz", "Ljava/lang/Class;", "pageName", "", "args", "Landroid/os/Bundle;", "types", "", "(Ljava/lang/Class;Ljava/lang/String;Landroid/os/Bundle;I)V", "getArgs", "()Landroid/os/Bundle;", "setArgs", "(Landroid/os/Bundle;)V", "getClazz", "()Ljava/lang/Class;", "setClazz", "(Ljava/lang/Class;)V", "getPageName", "()Ljava/lang/String;", "setPageName", "(Ljava/lang/String;)V", "getTypes", "()I", "setTypes", "(I)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class h<T extends Fragment> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public Class<? extends T> f42172a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f42173b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Bundle f42174c;

    /* renamed from: d  reason: collision with root package name */
    public int f42175d;

    @JvmOverloads
    public h(@NotNull Class<? extends T> cls, @Nullable String str, @Nullable Bundle bundle, int i) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        this.f42172a = cls;
        this.f42173b = str;
        this.f42174c = bundle;
        this.f42175d = i;
    }
}
