package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/ILiveCallback;", "", "onPlayerMessage", "", "message", "Lcom/bytedance/android/livesdkapi/depend/live/ILivePlayController$PlayerMessage;", "onVideoSizeChange", "textureView", "Landroid/view/TextureView;", "width", "", "height", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface x {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57763a;

        public static void a(x xVar, @NotNull g.b bVar) {
            g.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{xVar, bVar2}, null, f57763a, true, 62393, new Class[]{x.class, g.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{xVar, bVar2}, null, f57763a, true, 62393, new Class[]{x.class, g.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "message");
        }
    }

    void a(@Nullable TextureView textureView, int i, int i2);

    void a(@NotNull g.b bVar);
}
