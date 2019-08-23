package com.ss.android.ugc.aweme.im.sdk.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.g;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ba extends g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52536a;

    /* renamed from: d  reason: collision with root package name */
    private static am<ba> f52537d = new am<ba>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52540a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f52540a, false, 53796, new Class[0], ba.class)) {
                return new ba((byte) 0);
            }
            return (ba) PatchProxy.accessDispatch(new Object[0], this, f52540a, false, 53796, new Class[0], ba.class);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public Map<String, List<Pair<List<BaseContent>, Pair<Boolean, a>>>> f52538b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<Pair<Boolean, n>>> f52539c;

    public interface a {
        void onSend(b bVar, List<n> list);

        void onSendFailure(j jVar);

        void onSendSuccess(n nVar);
    }

    public final void a(b bVar) {
    }

    public final void a(String str, List<m> list) {
    }

    public final void a(List<m> list) {
    }

    public final void a(Map<String, b> map) {
    }

    public final void b(b bVar) {
    }

    public final void b(List<m> list) {
    }

    public final void d(b bVar) {
    }

    public final void e(b bVar) {
    }

    public final void a(String str, BaseContent baseContent) {
        String str2 = str;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{str2, baseContent2}, this, f52536a, false, 53754, new Class[]{String.class, BaseContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, baseContent2}, this, f52536a, false, 53754, new Class[]{String.class, BaseContent.class}, Void.TYPE);
            return;
        }
        a(str2, baseContent2, (a) null);
    }

    public final void a(String str, BaseContent baseContent, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, baseContent, aVar2}, this, f52536a, false, 53755, new Class[]{String.class, BaseContent.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, baseContent, aVar2}, this, f52536a, false, 53755, new Class[]{String.class, BaseContent.class, a.class}, Void.TYPE);
            return;
        }
        a(str2, Collections.singletonList(baseContent), aVar2);
    }

    public final void b(String str, List<BaseContent> list) {
        String str2 = str;
        List<BaseContent> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, this, f52536a, false, 53756, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, this, f52536a, false, 53756, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        a(str2, list2, (a) null);
    }

    private void a(List<String> list, List<BaseContent> list2, a aVar) {
        if (PatchProxy.isSupport(new Object[]{list, list2, aVar}, this, f52536a, false, 53758, new Class[]{List.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2, aVar}, this, f52536a, false, 53758, new Class[]{List.class, List.class, a.class}, Void.TYPE);
            return;
        }
        a(list, list2, aVar, true, (List<com.bytedance.im.core.d.a>) null);
    }

    public final void a(List<String> list, List<BaseContent> list2) {
        List<String> list3 = list;
        List<BaseContent> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, list4}, this, f52536a, false, 53759, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4}, this, f52536a, false, 53759, new Class[]{List.class, List.class}, Void.TYPE);
            return;
        }
        a(list3, list4, (a) null);
    }

    private void a(List<String> list, BaseContent baseContent, a aVar) {
        List<String> list2 = list;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{list2, baseContent, aVar2}, this, f52536a, false, 53765, new Class[]{List.class, BaseContent.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, baseContent, aVar2}, this, f52536a, false, 53765, new Class[]{List.class, BaseContent.class, a.class}, Void.TYPE);
            return;
        }
        b(list2, Collections.singletonList(baseContent), aVar2);
    }

    public final void b(List<String> list, List<BaseContent> list2) {
        List<String> list3 = list;
        List<BaseContent> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, list4}, this, f52536a, false, 53766, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4}, this, f52536a, false, 53766, new Class[]{List.class, List.class}, Void.TYPE);
            return;
        }
        a(list3, list4, (a) null, true);
    }

    public final void a(List<String> list, List<BaseContent> list2, a aVar, List<com.bytedance.im.core.d.a> list3) {
        if (PatchProxy.isSupport(new Object[]{list, list2, aVar, list3}, this, f52536a, false, 53783, new Class[]{List.class, List.class, a.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2, aVar, list3}, this, f52536a, false, 53783, new Class[]{List.class, List.class, a.class, List.class}, Void.TYPE);
        } else if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String a2 : list) {
                a(a2, list2, aVar, false, list3);
            }
        }
    }

    private void a(List<String> list, List<BaseContent> list2, a aVar, boolean z, List<com.bytedance.im.core.d.a> list3) {
        if (PatchProxy.isSupport(new Object[]{list, list2, aVar, (byte) 1, null}, this, f52536a, false, 53784, new Class[]{List.class, List.class, a.class, Boolean.TYPE, List.class}, Void.TYPE)) {
            Object[] objArr = {list, list2, aVar, (byte) 1, null};
            PatchProxy.accessDispatch(objArr, this, f52536a, false, 53784, new Class[]{List.class, List.class, a.class, Boolean.TYPE, List.class}, Void.TYPE);
        } else if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    try {
                        a(e.a(Long.valueOf(next).longValue()), list2, aVar, true, (List<com.bytedance.im.core.d.a>) null);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    private void a(List<String> list, List<BaseContent> list2, a aVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, list2, aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52536a, false, 53785, new Class[]{List.class, List.class, a.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {list, list2, aVar, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f52536a, false, 53785, new Class[]{List.class, List.class, a.class, Boolean.TYPE}, Void.TYPE);
        } else if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String a2 : list) {
                a(a2, list2, aVar, z, (List<com.bytedance.im.core.d.a>) null);
            }
        }
    }

    private void a(List<com.bytedance.im.core.d.a> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, this, f52536a, false, 53790, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str2}, this, f52536a, false, 53790, new Class[]{List.class, String.class}, Void.TYPE);
        } else if (list != null && !list.isEmpty()) {
            for (com.bytedance.im.core.d.a next : list) {
                if (next == null) {
                    next = new com.bytedance.im.core.d.a();
                }
                next.setMsgUuid(str2);
            }
        }
    }

    private ba() {
        this.f52538b = new HashMap();
        this.f52539c = new HashMap();
        d.a().a((g) this);
    }

    public static ba a() {
        if (PatchProxy.isSupport(new Object[0], null, f52536a, true, 53752, new Class[0], ba.class)) {
            return (ba) PatchProxy.accessDispatch(new Object[0], null, f52536a, true, 53752, new Class[0], ba.class);
        }
        return (ba) f52537d.b();
    }

    /* synthetic */ ba(byte b2) {
        this();
    }

    public final void c(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f52536a, false, 53794, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f52536a, false, 53794, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f52536a, false, 53795, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f52536a, false, 53795, new Class[]{b.class}, Void.TYPE);
            return;
        }
        String conversationId = bVar.getConversationId();
        if (this.f52538b.containsKey(conversationId)) {
            boolean isTemp = bVar.isTemp();
            for (Pair pair : this.f52538b.get(conversationId)) {
                a((a) ((Pair) pair.second).second, bVar, a(bVar, (List) pair.first, ((Boolean) ((Pair) pair.second).first).booleanValue(), isTemp, (a) ((Pair) pair.second).second, null));
            }
            this.f52538b.remove(conversationId);
            return;
        }
        if (this.f52539c.containsKey(conversationId)) {
            List<Pair> list = this.f52539c.get(conversationId);
            if (PatchProxy.isSupport(new Object[]{list}, this, f52536a, false, 53792, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f52536a, false, 53792, new Class[]{List.class}, Void.TYPE);
            } else if (list != null && !list.isEmpty()) {
                for (Pair pair2 : list) {
                    if (((Boolean) pair2.first).booleanValue()) {
                        ad.c((n) pair2.second);
                    } else {
                        ad.b((n) pair2.second);
                    }
                }
            }
            this.f52539c.remove(conversationId);
        }
    }

    public final void c(String str, List<BaseContent> list) {
        String str2 = str;
        List<BaseContent> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, this, f52536a, false, 53761, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, this, f52536a, false, 53761, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        b(str2, list2, (a) null);
    }

    public final void b(String str, BaseContent baseContent) {
        String str2 = str;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{str2, baseContent2}, this, f52536a, false, 53760, new Class[]{String.class, BaseContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, baseContent2}, this, f52536a, false, 53760, new Class[]{String.class, BaseContent.class}, Void.TYPE);
            return;
        }
        b(str2, baseContent2, (a) null);
    }

    private void a(a aVar, b bVar, List<n> list) {
        if (PatchProxy.isSupport(new Object[]{aVar, bVar, list}, this, f52536a, false, 53793, new Class[]{a.class, b.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, bVar, list}, this, f52536a, false, 53793, new Class[]{a.class, b.class, List.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            try {
                aVar.onSend(bVar, list);
            } catch (Exception unused) {
            }
        }
    }

    private void b(String str, List<BaseContent> list, a aVar) {
        List<BaseContent> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str, list2, null}, this, f52536a, false, 53763, new Class[]{String.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list2, null}, this, f52536a, false, 53763, new Class[]{String.class, List.class, a.class}, Void.TYPE);
            return;
        }
        b(Collections.singletonList(str), list2, (a) null);
    }

    public final void c(String str, BaseContent baseContent, a aVar) {
        BaseContent baseContent2 = baseContent;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, baseContent2, aVar2}, this, f52536a, false, 53777, new Class[]{String.class, BaseContent.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, baseContent2, aVar2}, this, f52536a, false, 53777, new Class[]{String.class, BaseContent.class, a.class}, Void.TYPE);
            return;
        }
        b(Collections.singletonList(str), baseContent2, aVar2);
    }

    private void a(String str, List<BaseContent> list, a aVar) {
        List<BaseContent> list2 = list;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, list2, aVar2}, this, f52536a, false, 53757, new Class[]{String.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list2, aVar2}, this, f52536a, false, 53757, new Class[]{String.class, List.class, a.class}, Void.TYPE);
            return;
        }
        a(Collections.singletonList(str), list2, aVar2);
    }

    private void b(List<String> list, BaseContent baseContent, a aVar) {
        List<String> list2 = list;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{list2, baseContent, aVar2}, this, f52536a, false, 53780, new Class[]{List.class, BaseContent.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, baseContent, aVar2}, this, f52536a, false, 53780, new Class[]{List.class, BaseContent.class, a.class}, Void.TYPE);
            return;
        }
        a(list2, Collections.singletonList(baseContent), aVar2, false);
    }

    private void b(List<String> list, List<BaseContent> list2, a aVar) {
        List<String> list3 = list;
        List<BaseContent> list4 = list2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{list3, list4, aVar2}, this, f52536a, false, 53767, new Class[]{List.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4, aVar2}, this, f52536a, false, 53767, new Class[]{List.class, List.class, a.class}, Void.TYPE);
            return;
        }
        a(list3, list4, aVar2, true);
    }

    public final void b(String str, BaseContent baseContent, a aVar) {
        BaseContent baseContent2 = baseContent;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, baseContent2, aVar2}, this, f52536a, false, 53762, new Class[]{String.class, BaseContent.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, baseContent2, aVar2}, this, f52536a, false, 53762, new Class[]{String.class, BaseContent.class, a.class}, Void.TYPE);
            return;
        }
        a(Collections.singletonList(str), baseContent2, aVar2);
    }

    private void a(String str, List<BaseContent> list, a aVar, boolean z) {
        String str2 = str;
        List<BaseContent> list2 = list;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, list2, aVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52536a, false, 53787, new Class[]{String.class, List.class, a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2, aVar2, Byte.valueOf(z)}, this, f52536a, false, 53787, new Class[]{String.class, List.class, a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Pair pair = new Pair(list2, new Pair(Boolean.valueOf(z), aVar2));
        if (!this.f52538b.containsKey(str2) || this.f52538b.get(str2).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair);
            this.f52538b.put(str2, arrayList);
            return;
        }
        this.f52538b.get(str2).add(pair);
    }

    private void a(String str, List<BaseContent> list, a aVar, boolean z, List<com.bytedance.im.core.d.a> list2) {
        final String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, list, aVar2, Byte.valueOf(z ? (byte) 1 : 0), list2}, this, f52536a, false, 53786, new Class[]{String.class, List.class, a.class, Boolean.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list, aVar2, Byte.valueOf(z), list2}, this, f52536a, false, 53786, new Class[]{String.class, List.class, a.class, Boolean.TYPE, List.class}, Void.TYPE);
            return;
        }
        b a2 = d.a().a(str2);
        if (a2 != null) {
            a(aVar2, a2, a(a2, list, z, false, aVar, list2));
            return;
        }
        String[] split = str2.split(":");
        if (split.length > 0 && TextUtils.equals(split[1], String.valueOf(d.a.f20886a))) {
            a(str, list, aVar, z);
            com.bytedance.im.core.d.d.a().a(e.a(str), (com.bytedance.im.core.b.c.e) new com.bytedance.im.core.b.c.e() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52541a;

                public final void a(f fVar) {
                    if (PatchProxy.isSupport(new Object[]{fVar}, this, f52541a, false, 53797, new Class[]{f.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{fVar}, this, f52541a, false, 53797, new Class[]{f.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.im.core.d.d.a();
                    com.bytedance.im.core.d.d.d(str2);
                }

                public final void b(f fVar) {
                    if (PatchProxy.isSupport(new Object[]{fVar}, this, f52541a, false, 53798, new Class[]{f.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{fVar}, this, f52541a, false, 53798, new Class[]{f.class}, Void.TYPE);
                        return;
                    }
                    ba baVar = ba.this;
                    String str = str2;
                    if (PatchProxy.isSupport(new Object[]{str}, baVar, ba.f52536a, false, 53788, new Class[]{String.class}, Void.TYPE)) {
                        Object[] objArr = {str};
                        ba baVar2 = baVar;
                        ChangeQuickRedirect changeQuickRedirect = ba.f52536a;
                        PatchProxy.accessDispatch(objArr, baVar2, changeQuickRedirect, false, 53788, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    baVar.f52538b.remove(str);
                    if (baVar.f52539c.containsKey(str)) {
                        for (Pair pair : baVar.f52539c.get(str)) {
                            ((n) pair.second).setMsgStatus(3);
                            ad.b((n) pair.second);
                        }
                    }
                    baVar.f52539c.remove(str);
                }
            });
        }
    }

    private List<n> a(b bVar, List<BaseContent> list, boolean z, boolean z2, a aVar, List<com.bytedance.im.core.d.a> list2) {
        long j;
        ArrayList arrayList;
        n nVar;
        b bVar2 = bVar;
        final a aVar2 = aVar;
        List<com.bytedance.im.core.d.a> list3 = list2;
        int i = 0;
        char c2 = 1;
        if (PatchProxy.isSupport(new Object[]{bVar2, list, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), aVar2, list3}, this, f52536a, false, 53789, new Class[]{b.class, List.class, Boolean.TYPE, Boolean.TYPE, a.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{bVar2, list, Byte.valueOf(z), Byte.valueOf(z2), aVar2, list3}, this, f52536a, false, 53789, new Class[]{b.class, List.class, Boolean.TYPE, Boolean.TYPE, a.class, List.class}, List.class);
        }
        int i2 = 2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        n lastMessage = bVar.getLastMessage();
        if (lastMessage != null) {
            j = lastMessage.getOrderIndex() + 1;
        } else {
            j = 1;
        }
        for (BaseContent next : list) {
            n a2 = new n.a().a(bVar2).a(ad.a(next)).a(l.a(next)).a();
            a2.setOrderIndex(j);
            a(list3, a2.getUuid());
            a2.setAttachments(list3);
            long j2 = j + 1;
            if (z2) {
                a2.setMsgStatus(i);
                arrayList3.add(new Pair(Boolean.valueOf(z), a2));
            } else if (z) {
                Object[] objArr = new Object[i2];
                objArr[i] = a2;
                objArr[c2] = aVar2;
                ChangeQuickRedirect changeQuickRedirect = f52536a;
                Class[] clsArr = new Class[i2];
                clsArr[i] = n.class;
                clsArr[c2] = a.class;
                nVar = a2;
                arrayList = arrayList3;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 53791, clsArr, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{nVar, aVar2}, this, f52536a, false, 53791, new Class[]{n.class, a.class}, Void.TYPE);
                } else if (aVar2 != null) {
                    ad.a(nVar, new com.bytedance.im.core.a.a.b<n>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52544a;

                        public final void a(j jVar) {
                            j jVar2 = jVar;
                            if (PatchProxy.isSupport(new Object[]{jVar2}, this, f52544a, false, 53800, new Class[]{j.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jVar2}, this, f52544a, false, 53800, new Class[]{j.class}, Void.TYPE);
                                return;
                            }
                            aVar2.onSendFailure(jVar2);
                        }

                        public final /* synthetic */ void a(Object obj) {
                            n nVar = (n) obj;
                            if (PatchProxy.isSupport(new Object[]{nVar}, this, f52544a, false, 53799, new Class[]{n.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{nVar}, this, f52544a, false, 53799, new Class[]{n.class}, Void.TYPE);
                                return;
                            }
                            aVar2.onSendSuccess(nVar);
                        }
                    });
                } else {
                    ad.c(nVar);
                }
                arrayList2.add(nVar);
                j = j2;
                arrayList3 = arrayList;
                i2 = 2;
                i = 0;
                c2 = 1;
            }
            nVar = a2;
            arrayList = arrayList3;
            ad.b(nVar);
            arrayList2.add(nVar);
            j = j2;
            arrayList3 = arrayList;
            i2 = 2;
            i = 0;
            c2 = 1;
        }
        ArrayList arrayList4 = arrayList3;
        if (z2 && !arrayList4.isEmpty()) {
            this.f52539c.put(bVar.getConversationId(), arrayList4);
        }
        return arrayList2;
    }
}
