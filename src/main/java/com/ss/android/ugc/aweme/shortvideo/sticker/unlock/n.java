package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockedStickerProvider;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70231a;

    /* renamed from: b  reason: collision with root package name */
    private static ArrayList<String> f70232b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private static List<LockStickerTextBean> f70233c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f70234d = false;

    public static boolean b() {
        return f70234d;
    }

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f70231a, true, 79880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f70231a, true, 79880, new Class[0], Void.TYPE);
            return;
        }
        f70234d = false;
        f70232b.clear();
    }

    public static LockStickerTextBean d() {
        if (PatchProxy.isSupport(new Object[0], null, f70231a, true, 79882, new Class[0], LockStickerTextBean.class)) {
            return (LockStickerTextBean) PatchProxy.accessDispatch(new Object[0], null, f70231a, true, 79882, new Class[0], LockStickerTextBean.class);
        }
        return b("default");
    }

    public static ArrayList<String> a() {
        if (PatchProxy.isSupport(new Object[0], null, f70231a, true, 79877, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], null, f70231a, true, 79877, new Class[0], ArrayList.class);
        }
        String str = "";
        while (f70232b.iterator().hasNext()) {
            str = str + r1.next() + " , ";
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(f70232b);
        arrayList.addAll(d.a().b());
        return arrayList;
    }

    @Nullable
    public static LockStickerTextBean a(Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, null, f70231a, true, 79883, new Class[]{Effect.class}, LockStickerTextBean.class)) {
            return b(ae.k(effect));
        }
        return (LockStickerTextBean) PatchProxy.accessDispatch(new Object[]{effect}, null, f70231a, true, 79883, new Class[]{Effect.class}, LockStickerTextBean.class);
    }

    @Nullable
    public static LockStickerTextBean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f70231a, true, 79884, new Class[]{String.class}, LockStickerTextBean.class)) {
            return (LockStickerTextBean) PatchProxy.accessDispatch(new Object[]{str2}, null, f70231a, true, 79884, new Class[]{String.class}, LockStickerTextBean.class);
        }
        for (LockStickerTextBean next : f70233c) {
            if (next.activityId.equals(str2)) {
                return next;
            }
        }
        return null;
    }

    public static void a(p pVar) {
        q qVar;
        Object value;
        final p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{pVar2}, null, f70231a, true, 79885, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2}, null, f70231a, true, 79885, new Class[]{p.class}, Void.TYPE);
            return;
        }
        UnlockedStickerProvider unlockedStickerProvider = UnlockedStickerProvider.f70196d;
        if (PatchProxy.isSupport(new Object[]{""}, unlockedStickerProvider, UnlockedStickerProvider.f70193a, false, 79875, new Class[]{String.class}, q.class)) {
            Object[] objArr = {""};
            UnlockedStickerProvider unlockedStickerProvider2 = unlockedStickerProvider;
            qVar = (q) PatchProxy.accessDispatch(objArr, unlockedStickerProvider2, UnlockedStickerProvider.f70193a, false, 79875, new Class[]{String.class}, q.class);
        } else {
            Intrinsics.checkParameterIsNotNull("", "activityId");
            List arrayList = new ArrayList();
            arrayList.add("");
            if (PatchProxy.isSupport(new Object[0], unlockedStickerProvider, UnlockedStickerProvider.f70193a, false, 79874, new Class[0], UnlockedStickerProvider.UnlockedStickerListApi.class)) {
                value = PatchProxy.accessDispatch(new Object[0], unlockedStickerProvider, UnlockedStickerProvider.f70193a, false, 79874, new Class[0], UnlockedStickerProvider.UnlockedStickerListApi.class);
            } else {
                value = UnlockedStickerProvider.f70195c.getValue();
            }
            qVar = ((UnlockedStickerProvider.UnlockedStickerListApi) value).getUnlockedStickers(arrayList);
        }
        l.a(qVar, new k<UnlockedStickerListResponse>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70235a;

            public final void onFailure(Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f70235a, false, 79887, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f70235a, false, 79887, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70240a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f70240a, false, 79889, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f70240a, false, 79889, new Class[0], Void.TYPE);
                            return;
                        }
                        if (pVar2 != null) {
                            pVar2.a(null);
                        }
                    }
                });
            }

            public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                final UnlockedStickerListResponse unlockedStickerListResponse = (UnlockedStickerListResponse) obj;
                if (PatchProxy.isSupport(new Object[]{unlockedStickerListResponse}, this, f70235a, false, 79886, new Class[]{UnlockedStickerListResponse.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{unlockedStickerListResponse}, this, f70235a, false, 79886, new Class[]{UnlockedStickerListResponse.class}, Void.TYPE);
                    return;
                }
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70237a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f70237a, false, 79888, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f70237a, false, 79888, new Class[0], Void.TYPE);
                        } else if (unlockedStickerListResponse == null) {
                            if (pVar2 != null) {
                                pVar2.a(null);
                            }
                        } else {
                            n.a(unlockedStickerListResponse.idList);
                            n.b(unlockedStickerListResponse.textBeanList);
                            if (pVar2 != null) {
                                pVar2.b();
                            }
                        }
                    }
                });
            }
        });
    }

    public static void b(List<LockStickerTextBean> list) {
        List<LockStickerTextBean> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f70231a, true, 79881, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, f70231a, true, 79881, new Class[]{List.class}, Void.TYPE);
        } else if (list2 != null && !list.isEmpty()) {
            f70233c.clear();
            f70233c.addAll(list2);
        }
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f70231a, true, 79879, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f70231a, true, 79879, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str2 != null) {
            f70232b.add(str2);
        }
    }

    public static void a(List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f70231a, true, 79878, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, f70231a, true, 79878, new Class[]{List.class}, Void.TYPE);
            return;
        }
        f70234d = true;
        if (list2 != null) {
            String str = "";
            while (list.iterator().hasNext()) {
                str = str + r2.next() + " , ";
            }
            f70232b.clear();
            f70232b.addAll(list2);
        }
    }
}
