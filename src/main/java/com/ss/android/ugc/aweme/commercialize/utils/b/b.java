package com.ss.android.ugc.aweme.commercialize.utils.b;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskManager;", "", "()V", "TAG", "", "playedTimes", "", "playerHandler", "Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskManager$PlayerHandler;", "taskList", "", "Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskInfo;", "getCurrentPosition", "", "getVideoDuration", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "videoView", "Lcom/ss/android/ugc/playerkit/videoview/VideoPlayerView;", "onPlayCompleted", "", "onPlayPositionUpdate", "position", "onRenderReady", "registerTask", "videoPlayTask", "reset", "PlayerHandler", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39767a;

    /* renamed from: b  reason: collision with root package name */
    public static List<a> f39768b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static int f39769c;

    /* renamed from: d  reason: collision with root package name */
    public static a f39770d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final b f39771e = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskManager$PlayerHandler;", "Landroid/os/Handler;", "()V", "handleMessage", "", "msg", "Landroid/os/Message;", "startUpdateProgress", "stopUpdateProgress", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39772a;

        /* renamed from: b  reason: collision with root package name */
        public static final C0518a f39773b = new C0518a((byte) 0);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskManager$PlayerHandler$Companion;", "", "()V", "PLAY_PROGRESS", "", "PROGRESS_UPDATE_INTERVAL", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.b$a$a  reason: collision with other inner class name */
        public static final class C0518a {
            private C0518a() {
            }

            public /* synthetic */ C0518a(byte b2) {
                this();
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f39772a, false, 32729, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39772a, false, 32729, new Class[0], Void.TYPE);
                return;
            }
            if (hasMessages(1)) {
                removeMessages(1);
            }
        }

        public final void handleMessage(@Nullable Message message) {
            Integer num;
            long j;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f39772a, false, 32730, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f39772a, false, 32730, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (message2 != null) {
                num = Integer.valueOf(message2.what);
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 1) {
                    b bVar = b.f39771e;
                    if (PatchProxy.isSupport(new Object[0], bVar, b.f39767a, false, 32726, new Class[0], Long.TYPE)) {
                        j = ((Long) PatchProxy.accessDispatch(new Object[0], bVar, b.f39767a, false, 32726, new Class[0], Long.TYPE)).longValue();
                    } else if (o.v()) {
                        com.ss.android.ugc.playerkit.videoview.a a2 = com.ss.android.ugc.playerkit.videoview.a.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "AppPlayingVideoViewProxy.INSTANCE()");
                        j = a2.d();
                    } else {
                        o b2 = o.b();
                        Intrinsics.checkExpressionValueIsNotNull(b2, "PlayerManager.inst()");
                        j = b2.c();
                    }
                    if (PatchProxy.isSupport(new Object[]{new Long(j)}, bVar, b.f39767a, false, 32724, new Class[]{Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j)}, bVar, b.f39767a, false, 32724, new Class[]{Long.TYPE}, Void.TYPE);
                    } else if (!b.f39768b.isEmpty()) {
                        List arrayList = new ArrayList();
                        for (a next : b.f39768b) {
                            if ((b.f39769c == next.f39757b && j >= ((long) next.f39758c)) || b.f39769c > next.f39757b) {
                                if (PatchProxy.isSupport(new Object[0], next, a.f39756a, false, 32717, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], next, a.f39756a, false, 32717, new Class[0], Void.TYPE);
                                } else {
                                    try {
                                        Runnable runnable = next.f39761f;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                        if (!next.g) {
                                            next.f39761f = null;
                                        }
                                    } catch (Exception e2) {
                                        if (com.ss.android.ugc.aweme.g.a.a()) {
                                            throw e2;
                                        }
                                    }
                                }
                                if (!next.g) {
                                    arrayList.add(next);
                                } else {
                                    next.f39757b++;
                                }
                            }
                        }
                        b.f39768b.removeAll(arrayList);
                    }
                    sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    private b() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39767a, false, 32722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39767a, false, 32722, new Class[0], Void.TYPE);
            return;
        }
        f39768b.clear();
        f39770d.a();
    }

    public final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f39767a, false, 32721, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f39767a, false, 32721, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "videoPlayTask");
        if (!f39768b.contains(aVar2)) {
            f39768b.add(aVar2);
        }
    }
}
