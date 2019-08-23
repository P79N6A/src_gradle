package com.ss.android.ugc.aweme.poi.rn;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.u.ar;
import com.ss.android.ugc.aweme.u.d;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010J0\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0002J(\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0002J\u0006\u0010\u0014\u001a\u00020\u000eJ\u001c\u0010\u0015\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/rn/VideoPlayInfo;", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "TAG", "", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mReportAutoVideoPlayEvent", "", "mStartPlayTime", "", "sendAutoVideoPlayEvent", "", "params", "", "sendLeaveAutoVideoPlayPage", "playTime", "sendVideoAutoPlayEvent", "startCalcPlayTime", "stopCalcPlayTime", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60288a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f60289d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    long f60290b = -1;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f60291c;

    /* renamed from: e  reason: collision with root package name */
    private final String f60292e = "VideoPlayInfo";

    /* renamed from: f  reason: collision with root package name */
    private boolean f60293f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J(\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/rn/VideoPlayInfo$Companion;", "", "()V", "ENTER_FROM", "", "EVENT_TYPE", "POI_ID", "POI_LABEL_TYPE", "PREVIOUS_PAGE", "getLogValue", "key", "mLogParams", "", "sendPauseVideoEvent", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "sendResumeVideoEvent", "sendVideoAutoPlayFinishEvent", "params", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60294a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @Nullable
        public final String a(@NotNull String str, @Nullable Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f60294a, false, 65624, new Class[]{String.class, Map.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f60294a, false, 65624, new Class[]{String.class, Map.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "key");
            if (map2 == null || !map2.containsKey(str2) || TextUtils.isEmpty(map2.get(str2))) {
                return "";
            }
            return map2.get(str2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60288a, false, 65612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60288a, false, 65612, new Class[0], Void.TYPE);
            return;
        }
        if (this.f60290b == -1) {
            this.f60290b = System.currentTimeMillis();
        }
    }

    public b(@NotNull Aweme aweme) {
        Intrinsics.checkParameterIsNotNull(aweme, "aweme");
        this.f60291c = aweme;
    }

    @JvmStatic
    public static final void a(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f60288a, true, 65618, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, null, f60288a, true, 65618, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        a aVar = f60289d;
        if (PatchProxy.isSupport(new Object[]{aweme}, aVar, a.f60294a, false, 65622, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, aVar, a.f60294a, false, 65622, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme != null) {
            r.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_play").setValue(aweme.getAid()));
        }
    }

    public final void a(@Nullable Map<String, String> map) {
        String str;
        String str2;
        Map<String, String> map2;
        if (PatchProxy.isSupport(new Object[]{map}, this, f60288a, false, 65614, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f60288a, false, 65614, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        if (!this.f60293f) {
            this.f60293f = true;
            Aweme aweme = this.f60291c;
            if (PatchProxy.isSupport(new Object[]{aweme, map}, this, f60288a, false, 65616, new Class[]{Aweme.class, Map.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme, map}, this, f60288a, false, 65616, new Class[]{Aweme.class, Map.class}, Void.TYPE);
            } else if (aweme != null) {
                String a2 = f60289d.a("enter_from", map);
                ar arVar = new ar();
                if (a2 == null) {
                    str = "";
                } else {
                    str = a2;
                }
                ar e2 = arVar.a(str).f(aweme);
                if (i.m()) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = "";
                }
                d a3 = e2.b(str2).a(false).a((Map<String, String>) com.ss.android.ugc.aweme.forward.e.a.b(aweme, com.ss.android.ugc.aweme.forward.e.a.a()));
                if (map == null) {
                    map2 = new HashMap<>();
                } else {
                    map2 = map;
                }
                a3.a(map2).e();
                c a4 = c.a();
                com.ss.android.ugc.aweme.forward.e.a.b(a4, aweme, a2);
                com.ss.android.ugc.aweme.forward.e.a.a(a4, aweme, com.ss.android.ugc.aweme.forward.e.a.a());
                if (i.m()) {
                    a4.a("is_auto_play", (Integer) 1);
                }
                if (StringsKt.equals("poi_page", a2, true)) {
                    String a5 = f60289d.a("poi_id", map);
                    if (!TextUtils.isEmpty(a5)) {
                        a4.a("poi_id", a5);
                        String a6 = f60289d.a("poi_label_type", map);
                        if (!TextUtils.isEmpty(a6)) {
                            a4.a("poi_type", a6);
                        }
                    }
                }
                a4.a("enter_fullscreen", (Integer) 0);
                r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(a2).setValue(aweme.getAid()).setJsonObject(a4.b()));
            }
        }
    }
}
