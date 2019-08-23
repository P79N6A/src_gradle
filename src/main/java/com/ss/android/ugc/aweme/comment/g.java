package com.ss.android.ugc.aweme.comment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.an;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00040\u00040\u00078FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/CommentSharePrefCache;", "", "()V", "SHOW_COMMENT_LONG_CLICK_GUIDE", "", "TAG", "showCommentLongClickGuide", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "kotlin.jvm.PlatformType", "getShowCommentLongClickGuide", "()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "showCommentLongClickGuide$delegate", "Lkotlin/Lazy;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36444a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f36445b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(g.class), "showCommentLongClickGuide", "getShowCommentLongClickGuide()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f36446c = LazyKt.lazy(a.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    public static final g f36447d = new g();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<an<String>> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        @NotNull
        public final an<String> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27158, new Class[0], an.class)) {
                return new an<>("show_comment_long_click_guide", "");
            }
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27158, new Class[0], an.class);
        }
    }

    private g() {
    }
}
