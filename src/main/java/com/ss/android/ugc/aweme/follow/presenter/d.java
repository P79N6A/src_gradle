package com.ss.android.ugc.aweme.follow.presenter;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedParamBuilder;", "", "listQueryType", "", "pullType", "followFeedStyle", "impressionIds", "", "(IIILjava/lang/String;)V", "insertAwemeId", "lastFeedsId", "liveTagShow", "Ljava/lang/Integer;", "pushAids", "pushParams", "build", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedParam;", "setInsertAwemeId", "setLastFeedsId", "setLiveTagShow", "(Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedParamBuilder;", "setPushAids", "setPushParams", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47782a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f47783b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private String f47784c = "";

    /* renamed from: d  reason: collision with root package name */
    private Integer f47785d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f47786e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f47787f = "";
    private String g = "";
    private final int h;
    private final int i;
    private final int j;
    private final String k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedParamBuilder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedParamBuilder;", "listQueryType", "", "pullType", "followFeedStyle", "impressionIds", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47788a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final d a(int i, int i2, int i3, @NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f47788a, false, 44676, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f47788a, false, 44676, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, d.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "impressionIds");
            return new d(i, i2, i3, str2);
        }
    }

    @JvmStatic
    @NotNull
    public static final d a(int i2, int i3, int i4, @NotNull String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, null, f47782a, true, 44675, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, d.class)) {
            return f47783b.a(i2, i3, i4, str2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, null, f47782a, true, 44675, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, d.class);
    }

    @NotNull
    @SuppressLint({"TooManyMethodParam"})
    public final c a() {
        if (PatchProxy.isSupport(new Object[0], this, f47782a, false, 44674, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f47782a, false, 44674, new Class[0], c.class);
        }
        c cVar = new c(this.h, this.i, this.j, this.k, this.f47784c, this.f47785d, this.f47786e, this.f47787f, this.g);
        return cVar;
    }

    @NotNull
    public final d a(@Nullable Integer num) {
        this.f47785d = num;
        return this;
    }

    @NotNull
    public final d b(@Nullable String str) {
        this.f47786e = str;
        return this;
    }

    @NotNull
    public final d c(@Nullable String str) {
        this.f47787f = str;
        return this;
    }

    @NotNull
    public final d d(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NotNull
    public final d a(@Nullable String str) {
        this.f47784c = str;
        return this;
    }

    public d(int i2, int i3, int i4, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "impressionIds");
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = str;
    }
}
