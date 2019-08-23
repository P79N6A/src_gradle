package com.ss.android.ugc.aweme.im.sdk.story;

import android.support.v4.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\"\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/story/StoryMessageSettingManager;", "", "()V", "storyMessageSettingList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/im/sdk/story/IStoryMessageSetting;", "Lkotlin/collections/ArrayList;", "storyMessageUUIDMap", "Landroid/support/v4/util/ArrayMap;", "", "putStoryMsgUUID", "", "storyMessageSetting", "msgUUID", "registerStoryReplySetting", "removeStoryMsgUUID", "unregisterStoryReplySetting", "updateStoryCoverOfMessage", "state", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52424a;

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayMap<a, String> f52425b = new ArrayMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<a> f52426c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final b f52427d = new b();

    private b() {
    }

    @JvmStatic
    public static final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f52424a, true, 53282, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f52424a, true, 53282, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "storyMessageSetting");
        f52425b.remove(aVar2);
    }

    @JvmStatic
    public static final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f52424a, true, 53283, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f52424a, true, 53283, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Iterator<a> it2 = f52426c.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (next != null) {
                next.a(z, (String) f52425b.get(next));
                a(next);
            } else {
                boolean z2 = z;
            }
        }
    }
}
