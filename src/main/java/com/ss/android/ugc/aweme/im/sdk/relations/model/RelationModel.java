package com.ss.android.ugc.aweme.im.sdk.relations.model;

import a.i;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.d.c;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.an;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class RelationModel extends Observable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52181a;

    /* renamed from: b  reason: collision with root package name */
    public int f52182b;

    /* renamed from: c  reason: collision with root package name */
    public List<IMContact> f52183c;

    /* renamed from: d  reason: collision with root package name */
    public List<IMContact> f52184d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f52185e;

    /* renamed from: f  reason: collision with root package name */
    public int f52186f = 1;
    public boolean g;
    public boolean h;
    public List<String> i = new CopyOnWriteArrayList();
    public List<Integer> j = new CopyOnWriteArrayList();
    public List<IMUser> k = new CopyOnWriteArrayList();
    public List<IMContact> l = new CopyOnWriteArrayList();
    private final int m = 100;
    private Runnable n;
    private Runnable o;
    private Runnable p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52914, new Class[0], Void.TYPE);
            return;
        }
        this.f52182b = 0;
        c();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52916, new Class[0], Void.TYPE);
            return;
        }
        this.f52183c.clear();
        this.l.clear();
        this.f52184d.clear();
        this.i.clear();
        this.j.clear();
    }

    @MainThread
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52917, new Class[0], Void.TYPE);
            return;
        }
        a.b(this.n);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52918, new Class[0], Void.TYPE);
            return;
        }
        a.a(this.o);
    }

    public final List<String> e() {
        if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52928, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52928, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.l != null && !this.l.isEmpty()) {
            for (IMContact a2 : this.l) {
                IMUser a3 = e.a(a2);
                if (a3 != null) {
                    arrayList.add(a3.getUid());
                }
            }
        }
        return arrayList;
    }

    public final long a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f52181a, false, 52923, new Class[]{b.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{bVar}, this, f52181a, false, 52923, new Class[]{b.class}, Long.TYPE)).longValue();
        }
        long createdAt = bVar.getLastMessage().getCreatedAt();
        if (bVar.isStickTop()) {
            createdAt = Math.max(createdAt, bVar.getUpdatedTime());
        }
        return createdAt;
    }

    public final List<IMUser> b(List<IMUser> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f52181a, false, 52929, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f52181a, false, 52929, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (IMUser next : list) {
                if (next.getFollowStatus() == 2) {
                    IMUser clone = next.clone();
                    clone.setType(6);
                    arrayList.add(clone);
                }
                next.setType(0);
            }
        }
        return arrayList;
    }

    public RelationModel(Observer observer) {
        if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52920, new Class[0], Void.TYPE);
        } else {
            if (this.f52183c == null) {
                this.f52183c = new CopyOnWriteArrayList();
            }
            if (this.f52184d == null) {
                this.f52184d = new CopyOnWriteArrayList();
            }
            if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52927, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52927, new Class[0], Void.TYPE);
            } else if (this.o == null) {
                this.o = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52191a;

                    public final void run() {
                        String str;
                        String str2;
                        String str3;
                        if (PatchProxy.isSupport(new Object[0], this, f52191a, false, 52933, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f52191a, false, 52933, new Class[0], Void.TYPE);
                            return;
                        }
                        if (com.ss.android.ugc.aweme.im.sdk.h.c.a.a().g()) {
                            Runnable a2 = c.a();
                            if (a2 != null) {
                                a2.run();
                            }
                        }
                        boolean z = true;
                        if (RelationModel.this.g) {
                            RelationModel.this.f52183c.clear();
                            RelationModel.this.j.clear();
                            RelationModel.this.i.clear();
                            RelationModel.this.k.clear();
                            if (RelationModel.this.h) {
                                str = com.ss.android.ugc.aweme.im.sdk.h.c.a.d();
                            } else {
                                str = com.ss.android.ugc.aweme.im.sdk.h.c.a.e();
                            }
                            List c2 = com.ss.android.ugc.aweme.im.sdk.h.c.a.a().c(str);
                            List<IMUser> b2 = RelationModel.this.b(c2);
                            RelationModel.this.k.addAll(c2);
                            if (RelationModel.this.f52186f == 2) {
                                if (RelationModel.this.l.size() > 0) {
                                    RelationModel.this.j.add(Integer.valueOf(RelationModel.this.l.size()));
                                    RelationModel.this.i.add("recent");
                                    RelationModel.this.f52183c.addAll(RelationModel.this.l);
                                }
                                if (c2.size() >= 10 && b2.size() > 0) {
                                    b2.get(0).setType(5);
                                    if (!RelationModel.this.h) {
                                        RelationModel.this.i.add("Friend");
                                        RelationModel.this.j.add(Integer.valueOf(b2.size()));
                                    } else {
                                        RelationModel.this.a(b2);
                                    }
                                    RelationModel.this.f52183c.addAll(b2);
                                }
                            } else if (RelationModel.this.f52186f == 1) {
                                if (b2.size() > 0) {
                                    b2.get(0).setType(5);
                                    RelationModel.this.i.add("Friend");
                                    RelationModel.this.j.add(Integer.valueOf(b2.size()));
                                    RelationModel.this.f52183c.addAll(b2);
                                }
                            } else if (RelationModel.this.f52186f == 3) {
                                RelationModel.this.f52183c.addAll(RelationModel.this.l);
                                RelationModel.this.f52183c.addAll(b2);
                            } else if (RelationModel.this.f52186f == 4) {
                                if (RelationModel.this.h) {
                                }
                                z = false;
                                if (z && RelationModel.this.l.size() > 0) {
                                    RelationModel.this.j.add(Integer.valueOf(RelationModel.this.l.size()));
                                    RelationModel.this.i.add("recent");
                                    RelationModel.this.f52183c.addAll(RelationModel.this.l);
                                }
                                if (b2.size() > 0) {
                                    b2.get(0).setType(5);
                                    if (!RelationModel.this.h) {
                                        RelationModel.this.i.add("Friend");
                                        RelationModel.this.j.add(Integer.valueOf(b2.size()));
                                    } else {
                                        RelationModel.this.a(b2);
                                    }
                                    RelationModel.this.f52183c.addAll(b2);
                                }
                            }
                            if (RelationModel.this.f52186f != 3 && !RelationModel.this.h && c2.size() > 0) {
                                ((IMUser) c2.get(0)).setType(3);
                                RelationModel.this.a(c2);
                                RelationModel.this.f52183c.addAll(c2);
                            }
                        } else if (RelationModel.this.f52186f == 3) {
                            if (RelationModel.this.f52183c.size() < 10) {
                                List a3 = com.ss.android.ugc.aweme.im.sdk.h.c.a.a().a(RelationModel.this.e(), 20, RelationModel.this.f52182b * 20, com.ss.android.ugc.aweme.im.sdk.h.c.a.d());
                                if (a3 != null && !a3.isEmpty()) {
                                    RelationModel.this.f52183c.addAll(a3);
                                }
                            }
                            if (RelationModel.this.f52183c.size() < 10) {
                                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.im.sdk.h.c.a.f51684a, true, 53256, new Class[0], String.class)) {
                                    str3 = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.im.sdk.h.c.a.f51684a, true, 53256, new Class[0], String.class);
                                } else {
                                    str3 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS.key + " == 1";
                                }
                                List a4 = com.ss.android.ugc.aweme.im.sdk.h.c.a.a().a(RelationModel.this.e(), 20, RelationModel.this.f52182b * 20, str3);
                                if (a4 != null && !a4.isEmpty()) {
                                    RelationModel.this.f52183c.addAll(a4);
                                }
                            }
                        } else {
                            if (RelationModel.this.h) {
                                str2 = com.ss.android.ugc.aweme.im.sdk.h.c.a.d();
                            } else {
                                str2 = com.ss.android.ugc.aweme.im.sdk.h.c.a.e();
                            }
                            List a5 = com.ss.android.ugc.aweme.im.sdk.h.c.a.a().a(RelationModel.this.e(), 100, RelationModel.this.f52182b * 100, str2);
                            if (a5 != null && !a5.isEmpty()) {
                                Collections.sort(a5, new Comparator<IMUser>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f52193a;

                                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                                        IMUser iMUser = (IMUser) obj;
                                        IMUser iMUser2 = (IMUser) obj2;
                                        if (!PatchProxy.isSupport(new Object[]{iMUser, iMUser2}, this, f52193a, false, 52934, new Class[]{IMUser.class, IMUser.class}, Integer.TYPE)) {
                                            return Integer.compare(iMUser2.getFollowStatus(), iMUser.getFollowStatus());
                                        }
                                        return ((Integer) PatchProxy.accessDispatch(new Object[]{iMUser, iMUser2}, this, f52193a, false, 52934, new Class[]{IMUser.class, IMUser.class}, Integer.TYPE)).intValue();
                                    }
                                });
                                RelationModel relationModel = RelationModel.this;
                                int i = relationModel.f52182b + 1;
                                relationModel.f52182b = i;
                                if (i == 1) {
                                    ((IMUser) a5.get(0)).setType(3);
                                }
                                RelationModel.this.f52183c.addAll(a5);
                            }
                        }
                        a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f52195a;

                            public final void run() {
                                int i = 0;
                                if (PatchProxy.isSupport(new Object[0], this, f52195a, false, 52935, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f52195a, false, 52935, new Class[0], Void.TYPE);
                                    return;
                                }
                                RelationModel.this.setChanged();
                                RelationModel relationModel = RelationModel.this;
                                if (RelationModel.this.f52183c.isEmpty()) {
                                    i = -1;
                                }
                                relationModel.notifyObservers(Integer.valueOf(i));
                            }
                        });
                    }
                };
            }
            if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52924, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52924, new Class[0], Void.TYPE);
            } else if (this.n == null) {
                this.n = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52189a;

                    public final void run() {
                        List list;
                        if (PatchProxy.isSupport(new Object[0], this, f52189a, false, 52932, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f52189a, false, 52932, new Class[0], Void.TYPE);
                            return;
                        }
                        List<b> d2 = d.a().d();
                        RelationModel relationModel = RelationModel.this;
                        if (PatchProxy.isSupport(new Object[]{d2}, relationModel, RelationModel.f52181a, false, 52921, new Class[]{Iterable.class}, Void.TYPE)) {
                            RelationModel relationModel2 = relationModel;
                            PatchProxy.accessDispatch(new Object[]{d2}, relationModel2, RelationModel.f52181a, false, 52921, new Class[]{Iterable.class}, Void.TYPE);
                        } else if (d2 != null) {
                            Iterator<T> it2 = d2.iterator();
                            while (it2.hasNext()) {
                                n lastMessage = ((b) it2.next()).getLastMessage();
                                if (lastMessage == null || (relationModel.f52186f != 4 && lastMessage.getMsgType() == 15)) {
                                    it2.remove();
                                }
                            }
                        }
                        RelationModel relationModel3 = RelationModel.this;
                        if (PatchProxy.isSupport(new Object[]{d2}, relationModel3, RelationModel.f52181a, false, 52922, new Class[]{List.class}, Void.TYPE)) {
                            RelationModel relationModel4 = relationModel3;
                            PatchProxy.accessDispatch(new Object[]{d2}, relationModel4, RelationModel.f52181a, false, 52922, new Class[]{List.class}, Void.TYPE);
                        } else {
                            Collections.sort(d2, new Comparator<b>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f52187a;

                                public final /* synthetic */ int compare(Object obj, Object obj2) {
                                    b bVar = (b) obj;
                                    b bVar2 = (b) obj2;
                                    if (PatchProxy.isSupport(new Object[]{bVar, bVar2}, this, f52187a, false, 52931, new Class[]{b.class, b.class}, Integer.TYPE)) {
                                        return ((Integer) PatchProxy.accessDispatch(new Object[]{bVar, bVar2}, this, f52187a, false, 52931, new Class[]{b.class, b.class}, Integer.TYPE)).intValue();
                                    }
                                    int a2 = an.a(bVar);
                                    int a3 = an.a(bVar2);
                                    if (a2 != a3) {
                                        return Integer.compare(a3, a2);
                                    }
                                    return (RelationModel.this.a(bVar2) > RelationModel.this.a(bVar) ? 1 : (RelationModel.this.a(bVar2) == RelationModel.this.a(bVar) ? 0 : -1));
                                }
                            });
                        }
                        RelationModel relationModel5 = RelationModel.this;
                        if (PatchProxy.isSupport(new Object[]{d2}, relationModel5, RelationModel.f52181a, false, 52925, new Class[]{List.class}, List.class)) {
                            RelationModel relationModel6 = relationModel5;
                            list = (List) PatchProxy.accessDispatch(new Object[]{d2}, relationModel6, RelationModel.f52181a, false, 52925, new Class[]{List.class}, List.class);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (b next : d2) {
                                int conversationType = next.getConversationType();
                                if (conversationType == d.a.f20886a) {
                                    long a2 = com.bytedance.im.core.d.e.a(next.getConversationId());
                                    if (a2 > 0) {
                                        IMUser b2 = e.a().b(String.valueOf(a2));
                                        if (b2 != null && (!relationModel5.h || b2.getFollowStatus() == 2)) {
                                            b2.setType(1);
                                            arrayList.add(b2);
                                        }
                                    }
                                } else if (bc.a() && !relationModel5.h) {
                                    IMConversation iMConversation = new IMConversation();
                                    iMConversation.setConversationType(conversationType);
                                    iMConversation.setConversationId(next.getConversationId());
                                    iMConversation.setConversationMemberCount(next.getMemberCount());
                                    com.bytedance.im.core.d.c coreInfo = next.getCoreInfo();
                                    if (coreInfo != null) {
                                        String icon = coreInfo.getIcon();
                                        if (!TextUtils.isEmpty(icon)) {
                                            UrlModel urlModel = new UrlModel();
                                            urlModel.setUrlList(Collections.singletonList(icon));
                                            iMConversation.setConversationAvatar(urlModel);
                                        }
                                        String name = coreInfo.getName();
                                        if (TextUtils.isEmpty(name)) {
                                            name = GlobalContext.getContext().getString(C0906R.string.azx);
                                        }
                                        iMConversation.setConversationName(name);
                                    }
                                    iMConversation.setType(1);
                                    arrayList.add(iMConversation);
                                }
                            }
                            list = arrayList;
                        }
                        if (list.size() > 10) {
                            list = list.subList(0, 10);
                        }
                        if (!list.isEmpty()) {
                            if (!RelationModel.this.l.isEmpty()) {
                                RelationModel.this.f52183c.removeAll(RelationModel.this.l);
                            }
                            RelationModel.this.l.clear();
                            RelationModel.this.l.addAll(list);
                            RelationModel.this.l.get(0).setType(2);
                            RelationModel.this.f52183c.addAll(RelationModel.this.l);
                        }
                        RelationModel.this.d();
                    }
                };
            }
            if (PatchProxy.isSupport(new Object[0], this, f52181a, false, 52930, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52181a, false, 52930, new Class[0], Void.TYPE);
            } else if (this.p == null) {
                this.p = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52197a;

                    public final void run() {
                        final List<IMUser> list;
                        if (PatchProxy.isSupport(new Object[0], this, f52197a, false, 52936, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f52197a, false, 52936, new Class[0], Void.TYPE);
                            return;
                        }
                        if (RelationModel.this.g) {
                            list = e.a().a(RelationModel.this.k, RelationModel.this.f52185e.toString());
                        } else {
                            list = com.ss.android.ugc.aweme.im.sdk.h.c.a.a().d(RelationModel.this.f52185e.toString());
                        }
                        i.a((Callable<TResult>) new Callable<Object>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f52199a;

                            public final Object call() {
                                if (PatchProxy.isSupport(new Object[0], this, f52199a, false, 52937, new Class[0], Object.class)) {
                                    return PatchProxy.accessDispatch(new Object[0], this, f52199a, false, 52937, new Class[0], Object.class);
                                }
                                RelationModel.this.f52184d.clear();
                                if (RelationModel.this.h) {
                                    for (int i = 0; i < list.size(); i++) {
                                        if (((IMUser) list.get(i)).getFollowStatus() == 2) {
                                            RelationModel.this.f52184d.add(list.get(i));
                                        }
                                    }
                                } else {
                                    RelationModel.this.f52184d.addAll(list);
                                }
                                RelationModel.this.setChanged();
                                RelationModel.this.notifyObservers(1);
                                return null;
                            }
                        }, i.f1052b);
                    }
                };
            }
        }
        addObserver(observer);
    }

    public final void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f52181a, false, 52919, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f52181a, false, 52919, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(charSequence)) {
            this.f52185e = charSequence;
            a.a(this.p);
        }
    }

    public final void a(List<IMUser> list) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f52181a, false, 52926, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f52181a, false, 52926, new Class[]{List.class}, Void.TYPE);
            return;
        }
        String str = null;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            String initialLetter = list.get(i4).getInitialLetter();
            if (!TextUtils.isEmpty(initialLetter)) {
                if (str == null || TextUtils.equals(initialLetter, str)) {
                    i2 = i3 + 1;
                } else {
                    this.i.add(str);
                    this.j.add(Integer.valueOf(i3));
                    i2 = 1;
                }
                if (i4 == list.size() - 1) {
                    this.i.add(initialLetter);
                    this.j.add(Integer.valueOf(i2));
                }
                i3 = i2;
                str = initialLetter;
            }
        }
    }
}
