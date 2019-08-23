package com.ss.android.ugc.aweme.im.sdk.d;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0007J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0007J\u0018\u0010\u0017\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0007J\b\u0010\u0018\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/core/SecUidOfConversationManager;", "", "()V", "MAX_WAITING_QUEUE_COUNT", "", "MSG_WHAT_FLUSH_QUEUE", "TIME_INTERVAL_FLUSH_QUEUE", "", "mUpdateQueueHandler", "Landroid/os/Handler;", "mWaitingUpdateQueue", "", "", "addWaitingUid", "", "sessionId", "bind", "getSessionIdList", "sessionList", "", "Lcom/ss/android/ugc/aweme/im/service/session/BaseSession;", "removeWaitingUid", "unbind", "updateSecIdWhenQuerySession", "updateWaitingQueue", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51262a;

    /* renamed from: b  reason: collision with root package name */
    public static Handler f51263b;

    /* renamed from: c  reason: collision with root package name */
    public static List<String> f51264c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f51265d = new i();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/core/SecUidOfConversationManager$bind$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51266a;

        public final void handleMessage(@NotNull Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f51266a, false, 51777, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f51266a, false, 51777, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(message2, "msg");
            super.handleMessage(message);
            if (message2.what == 220) {
                i.a();
            }
        }
    }

    private i() {
    }

    @JvmStatic
    public static final void a() {
        Integer num;
        if (PatchProxy.isSupport(new Object[0], null, f51262a, true, 51773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f51262a, true, 51773, new Class[0], Void.TYPE);
            return;
        }
        List<String> list = f51264c;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (num != null && num.intValue() > 0) {
            d.a().c(f51264c);
            List<String> list2 = f51264c;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            list2.clear();
            Handler handler = f51263b;
            if (handler != null) {
                handler.removeMessages(220);
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f51262a, true, 51772, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f51262a, true, 51772, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "sessionId");
        List<String> list = f51264c;
        if (list != null && !list.contains(str2)) {
            List<String> list2 = f51264c;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            if (list2.isEmpty()) {
                Handler handler = f51263b;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(220, 5000);
                }
            }
            List<String> list3 = f51264c;
            if (list3 == null) {
                Intrinsics.throwNpe();
            }
            list3.add(str2);
            List<String> list4 = f51264c;
            if (list4 == null) {
                Intrinsics.throwNpe();
            }
            if (list4.size() == 25) {
                a();
            }
        }
    }

    @JvmStatic
    public static final void a(@Nullable List<? extends com.ss.android.ugc.aweme.im.service.session.a> list) {
        List list2;
        if (PatchProxy.isSupport(new Object[]{list}, null, f51262a, true, 51775, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, null, f51262a, true, 51775, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null && (!list.isEmpty())) {
            i iVar = f51265d;
            if (PatchProxy.isSupport(new Object[]{list}, iVar, f51262a, false, 51776, new Class[]{List.class}, List.class)) {
                i iVar2 = iVar;
                list2 = (List) PatchProxy.accessDispatch(new Object[]{list}, iVar2, f51262a, false, 51776, new Class[]{List.class}, List.class);
            } else {
                ArrayList arrayList = new ArrayList();
                for (com.ss.android.ugc.aweme.im.service.session.a aVar : list) {
                    if (aVar.b() == 0) {
                        IMUser b2 = e.a().b(String.valueOf(e.a(aVar.O_())));
                        if (b2 != null && TextUtils.isEmpty(b2.getSecUid())) {
                            arrayList.add(aVar.O_());
                        }
                        if (arrayList.size() == 25) {
                            break;
                        }
                    }
                }
                list2 = arrayList;
            }
            if (true ^ list2.isEmpty()) {
                d.a().c(list2);
            }
        }
    }
}
