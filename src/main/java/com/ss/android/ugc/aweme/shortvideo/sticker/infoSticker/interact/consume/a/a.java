package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sticker.a.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/adaption/FeedVideoAdaptionStrategy;", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "context", "Landroid/content/Context;", "video", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "feedAllScreenHelper", "Lcom/ss/android/ugc/aweme/feed/helper/FeedAllScreenHelper;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Video;Lcom/ss/android/ugc/aweme/feed/helper/FeedAllScreenHelper;)V", "onAdaption", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy$AdaptionVideoParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69843a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f69844b;

    /* renamed from: c  reason: collision with root package name */
    private final Video f69845c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.g.b f69846d;

    @NotNull
    public final b.a a() {
        if (PatchProxy.isSupport(new Object[0], this, f69843a, false, 79497, new Class[0], b.a.class)) {
            return (b.a) PatchProxy.accessDispatch(new Object[0], this, f69843a, false, 79497, new Class[0], b.a.class);
        } else if (this.f69845c == null) {
            return new b.a(0, 0);
        } else {
            b.a a2 = this.f69846d.a(this.f69844b, this.f69845c);
            Intrinsics.checkExpressionValueIsNotNull(a2, "feedAllScreenHelper.doVi…oAdaption(context, video)");
            return a2;
        }
    }

    public a(@NotNull Context context, @Nullable Video video, @NotNull com.ss.android.ugc.aweme.feed.g.b bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "feedAllScreenHelper");
        this.f69844b = context;
        this.f69845c = video;
        this.f69846d = bVar;
    }
}
