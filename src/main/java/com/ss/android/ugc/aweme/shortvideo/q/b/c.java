package com.ss.android.ugc.aweme.shortvideo.q.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/videoprocess/watercompose/I18nWaterMarkImageConfig;", "", "iconResId", "", "waterPicDir", "", "(ILjava/lang/String;)V", "getIconResId", "()I", "getWaterPicDir", "()Ljava/lang/String;", "Builder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f68960a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f68961b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/videoprocess/watercompose/I18nWaterMarkImageConfig$Builder;", "", "()V", "iconResId", "", "waterPicDir", "", "build", "Lcom/ss/android/ugc/aweme/shortvideo/videoprocess/watercompose/I18nWaterMarkImageConfig;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68962a;

        /* renamed from: b  reason: collision with root package name */
        int f68963b = 2130839887;

        /* renamed from: c  reason: collision with root package name */
        private String f68964c;

        @NotNull
        public final c a() {
            if (!PatchProxy.isSupport(new Object[0], this, f68962a, false, 81125, new Class[0], c.class)) {
                return new c(this.f68963b, this.f68964c);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, f68962a, false, 81125, new Class[0], c.class);
        }

        @NotNull
        public final a a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f68962a, false, 81124, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f68962a, false, 81124, new Class[]{String.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "waterPicDir");
            a aVar = this;
            aVar.f68964c = str2;
            return aVar;
        }
    }

    public c(int i, @Nullable String str) {
        this.f68960a = i;
        this.f68961b = str;
    }
}
