package com.ss.android.ugc.aweme.video.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.videoview.d.d;
import com.ss.android.ugc.playerkit.videoview.d.e;
import com.ss.android.ugc.playerkit.videoview.d.g;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/video/urlselector/LocalVideoUrlHook;", "Lcom/ss/android/ugc/playerkit/videoview/urlselector/VideoUrlHook;", "()V", "mLocalSourceIdSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "contains", "", "sourceId", "createLocalVideoAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "localVideoPath", "process", "Lcom/ss/android/ugc/playerkit/videoview/urlselector/Output;", "chain", "Lcom/ss/android/ugc/playerkit/videoview/urlselector/VideoUrlHook$Chain;", "putLocalSourceId", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76041a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f76042b = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final HashSet<String> f76043d = new HashSet<>();

    private b() {
    }

    @NotNull
    public final e a(@Nullable g.a aVar) {
        g.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76041a, false, 89306, new Class[]{g.a.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76041a, false, 89306, new Class[]{g.a.class}, e.class);
        }
        d a2 = aVar.a();
        if (a2 != null) {
            VideoUrlModel videoUrlModel = a2.f77763a;
            if (videoUrlModel != null) {
                if (f76043d.contains(videoUrlModel.getSourceId())) {
                    return new e(videoUrlModel.getUri());
                }
                e a3 = aVar2.a(a2);
                if (a3 == null) {
                    Intrinsics.throwNpe();
                }
                return a3;
            }
        }
        e a4 = aVar2.a(a2);
        if (a4 == null) {
            Intrinsics.throwNpe();
        }
        return a4;
    }
}
