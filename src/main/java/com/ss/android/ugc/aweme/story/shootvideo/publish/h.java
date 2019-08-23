package com.ss.android.ugc.aweme.story.shootvideo.publish;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.r;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/publish/StoryPublishUtils;", "", "()V", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73722a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f73723b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/publish/StoryPublishUtils$Companion;", "", "()V", "EXTRA_STORY_PUBLISH_ARGS", "", "EXTRA_STORY_PUBLISH_TYPE", "createPublishBundle", "Landroid/os/Bundle;", "model", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73724a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Bundle a(@NotNull Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f73724a, false, 85433, new Class[]{Object.class}, Bundle.class)) {
                return (Bundle) PatchProxy.accessDispatch(new Object[]{obj2}, this, f73724a, false, 85433, new Class[]{Object.class}, Bundle.class);
            }
            Intrinsics.checkParameterIsNotNull(obj2, "model");
            BaseShortVideoContext baseShortVideoContext = (BaseShortVideoContext) obj2;
            g.a(r.a(baseShortVideoContext), r.b(baseShortVideoContext), e.PUBLISH, e.SEND_REQUEST);
            Bundle bundle = new Bundle();
            cb cbVar = (cb) obj2;
            bundle.putInt("story_type", cbVar.videoType);
            bundle.putSerializable("story_args", (Serializable) obj2);
            bundle.putString("shoot_way", cbVar.mShootWay);
            bundle.putBoolean("back_to_main_after_publish", true);
            return bundle;
        }
    }

    @JvmStatic
    @NotNull
    public static final Bundle a(@NotNull Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, f73722a, true, 85432, new Class[]{Object.class}, Bundle.class)) {
            return f73723b.a(obj2);
        }
        return (Bundle) PatchProxy.accessDispatch(new Object[]{obj2}, null, f73722a, true, 85432, new Class[]{Object.class}, Bundle.class);
    }
}
