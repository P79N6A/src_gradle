package com.ss.android.ugc.aweme.app.services.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.a.a;
import com.ss.android.ugc.aweme.story.api.g;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/StoryDownloadService;", "Lcom/ss/android/ugc/aweme/story/api/IStoryDownloadService;", "()V", "downloadService", "", "context", "Landroid/content/Context;", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "callback", "Lcom/ss/android/ugc/aweme/story/api/Callback;", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34235a;

    /* renamed from: b  reason: collision with root package name */
    public static int f34236b = 15;

    /* renamed from: c  reason: collision with root package name */
    public static final a f34237c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/storydownload/StoryDownloadService$Companion;", "", "()V", "IMAGE_FEED", "", "getIMAGE_FEED", "()I", "setIMAGE_FEED", "(I)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/app/services/storydownload/StoryDownloadService$downloadService$1", "Lcom/ss/android/ugc/aweme/app/services/storydownload/BaseStoryDownloadHelper$OnDownloadListener;", "onFail", "", "msg", "", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements a.C0441a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.a f34239b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f34238a, false, 23705, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34238a, false, 23705, new Class[0], Void.TYPE);
                return;
            }
            this.f34239b.a("");
        }

        b(com.ss.android.ugc.aweme.story.api.a aVar) {
            this.f34239b = aVar;
        }

        public final void a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f34238a, false, 23704, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f34238a, false, 23704, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            this.f34239b.a(str2);
        }
    }

    public final void a(@Nullable Context context, @Nullable LifeStory lifeStory, @NotNull com.ss.android.ugc.aweme.story.api.a<String> aVar) {
        a aVar2;
        Context context2 = context;
        LifeStory lifeStory2 = lifeStory;
        com.ss.android.ugc.aweme.story.api.a<String> aVar3 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, lifeStory2, aVar3}, this, f34235a, false, 23703, new Class[]{Context.class, LifeStory.class, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, lifeStory2, aVar3}, this, f34235a, false, 23703, new Class[]{Context.class, LifeStory.class, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar3, "callback");
        if (lifeStory2 != null && context2 != null) {
            if (lifeStory.getAwemeType() == f34236b) {
                aVar2 = new d(context2);
            } else {
                aVar2 = new e(context2);
            }
            aVar2.a(lifeStory2, new b(aVar3));
        }
    }
}
