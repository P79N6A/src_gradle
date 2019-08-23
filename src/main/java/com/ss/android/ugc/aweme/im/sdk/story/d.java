package com.ss.android.ugc.aweme.im.sdk.story;

import android.arch.lifecycle.Observer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.common.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0012\u0010\u001a\u001a\u00020\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0007J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\b\u0010(\u001a\u00020\u0018H\u0007J\u0018\u0010)\u001a\u00020\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0007J\b\u0010*\u001a\u00020\u0018H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/story/StoryRingManager;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/api/userstory/UserStoryReadState;", "()V", "COMMA", "", "LEFT_BRACKET", "MAX_USER_COUNT", "", "MAX_USER_QUEUE_COUNT", "MSG_WHAT_FLUSH_QUEUE", "MSG_WHAT_UPDATE_STORY_RING", "RIGHT_BRACKET", "TIME_INTERVAL_FLUSH_QUEUE", "", "TIME_INTERVAL_UPDATE_STORY_RING", "TIME_INTERVAL_UPDATE_STORY_RING_SEC", "mStoryService", "Lcom/ss/android/ugc/aweme/story/api/IStoryService;", "mUpdateStoryRingHandler", "Landroid/os/Handler;", "mWaitingUidQueue", "", "addWaitingUid", "", "uid", "bind", "context", "Landroid/content/Context;", "getUidListStringBuilder", "sessionList", "", "Lcom/ss/android/ugc/aweme/im/service/session/BaseSession;", "needUpdateStoryRing", "", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "onChanged", "userStoryReadState", "removeWaitingUid", "unbind", "updateSessionStoryRing", "updateWaitingQueueStoryState", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements Observer<com.ss.android.ugc.aweme.story.api.b.d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52436a;

    /* renamed from: b  reason: collision with root package name */
    public static List<String> f52437b;

    /* renamed from: c  reason: collision with root package name */
    public static Handler f52438c;

    /* renamed from: d  reason: collision with root package name */
    public static i f52439d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f52440e = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/story/StoryRingManager$bind$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52441a;

        public final void handleMessage(@NotNull Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f52441a, false, 53299, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f52441a, false, 53299, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(message2, "msg");
            super.handleMessage(message);
            if (message2.what == 220) {
                d.a();
            }
        }
    }

    private d() {
    }

    @JvmStatic
    public static final void a() {
        Integer num;
        if (PatchProxy.isSupport(new Object[0], null, f52436a, true, 53293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f52436a, true, 53293, new Class[0], Void.TYPE);
        } else if (!m.a()) {
            List<String> list = f52437b;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                StringBuilder sb = new StringBuilder("[");
                h a2 = h.a(",");
                List<String> list2 = f52437b;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                sb.append(a2.a((Iterable<?>) list2));
                sb.append("]");
                r.a(sb.toString());
                List<String> list3 = f52437b;
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                list3.clear();
                Handler handler = f52438c;
                if (handler != null) {
                    handler.removeMessages(220);
                }
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        com.ss.android.ugc.aweme.story.api.b.d dVar = (com.ss.android.ugc.aweme.story.api.b.d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f52436a, false, 53298, new Class[]{com.ss.android.ugc.aweme.story.api.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f52436a, false, 53298, new Class[]{com.ss.android.ugc.aweme.story.api.b.d.class}, Void.TYPE);
            return;
        }
        if (dVar != null && !TextUtils.isEmpty(dVar.f71831a)) {
            IMUser b2 = e.a().b(dVar.f71831a);
            if (b2 != null) {
                boolean isHasUnreadStory = b2.isHasUnreadStory();
                b2.setHasUnreadStory(!dVar.f71832b);
                e.a().a(b2, isHasUnreadStory);
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52436a, true, 53292, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52436a, true, 53292, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        List<String> list = f52437b;
        if (list != null && !list.contains(str2)) {
            List<String> list2 = f52437b;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            if (list2.isEmpty()) {
                Handler handler = f52438c;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(220, 5000);
                }
            }
            List<String> list3 = f52437b;
            if (list3 == null) {
                Intrinsics.throwNpe();
            }
            list3.add(str2);
            List<String> list4 = f52437b;
            if (list4 == null) {
                Intrinsics.throwNpe();
            }
            if (list4.size() == 25) {
                a();
            }
        }
    }

    private final String b(List<? extends com.ss.android.ugc.aweme.im.service.session.a> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f52436a, false, 53296, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list}, this, f52436a, false, 53296, new Class[]{List.class}, String.class);
        }
        StringBuilder sb = new StringBuilder("[");
        for (com.ss.android.ugc.aweme.im.service.session.a aVar : list) {
            if (aVar.b() == 0) {
                String valueOf = String.valueOf(com.bytedance.im.core.d.e.a(aVar.O_()));
                IMUser b2 = e.a().b(valueOf);
                if (b2 != null && a(b2)) {
                    i++;
                    if (i > 1) {
                        sb.append(",");
                    }
                    sb.append(valueOf);
                    if (i == 20) {
                        break;
                    }
                }
            }
        }
        sb.append("]");
        if (i > 0) {
            return sb.toString();
        }
        return "";
    }

    @JvmStatic
    public static final void a(@Nullable List<? extends com.ss.android.ugc.aweme.im.service.session.a> list) {
        List<? extends com.ss.android.ugc.aweme.im.service.session.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f52436a, true, 53295, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, f52436a, true, 53295, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!m.a() && list2 != null && (true ^ list2.isEmpty())) {
            String b2 = f52440e.b(list2);
            if (!TextUtils.isEmpty(b2)) {
                r.a(b2);
            }
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2}, null, f52436a, true, 53297, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser2}, null, f52436a, true, 53297, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(iMUser2, AllStoryActivity.f73306b);
        if (iMUser.getCheckedUnreadStoryMillis() <= 0 || (System.currentTimeMillis() - iMUser.getCheckedUnreadStoryMillis()) / 1000 >= 570) {
            return true;
        }
        return false;
    }
}
