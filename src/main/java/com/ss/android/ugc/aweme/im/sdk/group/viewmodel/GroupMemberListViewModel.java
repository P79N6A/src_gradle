package com.ss.android.ugc.aweme.im.sdk.group.viewmodel;

import a.g;
import a.i;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.relations.a.f;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "()V", "conversationId", "", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "addMemberToUserList", "", "userList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "member", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "initAtMemberList", "initRemoveMemberList", "refresh", "search", "keyword", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupMemberListViewModel extends BaseMemberListViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51665a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f51666b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "invoke", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$initAtMemberList$1$1"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<List<? extends com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupMemberListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GroupMemberListViewModel groupMemberListViewModel) {
            super(1);
            this.this$0 = groupMemberListViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list) {
            Iterator it2;
            Long l;
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 52346, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 52346, new Class[]{List.class}, Void.TYPE);
            } else if (list != null) {
                Iterable<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> iterable = list;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar : iterable) {
                    IMUser user = aVar.getUser();
                    if (user == null) {
                        user = new IMUser();
                        m member = aVar.getMember();
                        String str = null;
                        if (member != null) {
                            l = Long.valueOf(member.getUid());
                        } else {
                            l = null;
                        }
                        user.setUid(String.valueOf(l));
                        m member2 = aVar.getMember();
                        if (member2 != null) {
                            str = member2.getAlias();
                        }
                        user.setNickName(str);
                    }
                    arrayList.add(user);
                }
                Collection arrayList2 = new ArrayList();
                for (IMUser uid : (List) arrayList) {
                    if (!Intrinsics.areEqual((Object) uid.getUid(), (Object) com.ss.android.ugc.aweme.im.sdk.utils.d.b())) {
                        arrayList2.add(it2.next());
                    }
                }
                List sortedWith = CollectionsKt.sortedWith((List) arrayList2, new Comparator<T>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51667a;

                    public final int compare(T t, T t2) {
                        if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f51667a, false, 52347, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                            return ComparisonsKt.compareValues(((IMUser) t).getSortWeight(), ((IMUser) t2).getSortWeight());
                        }
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f51667a, false, 52347, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
                    }
                });
                this.this$0.j.postValue(sortedWith);
                this.this$0.l.postValue(f.f52045b.a(sortedWith));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "invoke", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$initRemoveMemberList$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<List<? extends com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupMemberListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupMemberListViewModel groupMemberListViewModel) {
            super(1);
            this.this$0 = groupMemberListViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list) {
            Long l;
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 52348, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 52348, new Class[]{List.class}, Void.TYPE);
            } else if (list != null) {
                List arrayList = new ArrayList();
                for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar : list) {
                    IMUser user = aVar.getUser();
                    if (user == null || !user.equals(IMUser.fromUser(com.ss.android.ugc.aweme.im.sdk.utils.d.c()))) {
                        GroupMemberListViewModel groupMemberListViewModel = this.this$0;
                        if (PatchProxy.isSupport(new Object[]{arrayList, aVar}, groupMemberListViewModel, GroupMemberListViewModel.f51665a, false, 52344, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{arrayList, aVar}, groupMemberListViewModel, GroupMemberListViewModel.f51665a, false, 52344, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class}, Void.TYPE);
                        } else {
                            IMUser user2 = aVar.getUser();
                            if (user2 == null) {
                                user2 = new IMUser();
                                m member = aVar.getMember();
                                String str = null;
                                if (member != null) {
                                    l = Long.valueOf(member.getUid());
                                } else {
                                    l = null;
                                }
                                user2.setUid(String.valueOf(l));
                                m member2 = aVar.getMember();
                                if (member2 != null) {
                                    str = member2.getAlias();
                                }
                                user2.setNickName(str);
                            }
                            arrayList.add(user2);
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    CollectionsKt.sortWith(arrayList, new Comparator<T>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f51668a;

                        public final int compare(T t, T t2) {
                            if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f51668a, false, 52349, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                                return ComparisonsKt.compareValues(((IMUser) t).getSortWeight(), ((IMUser) t2).getSortWeight());
                            }
                            return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f51668a, false, 52349, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
                        }
                    });
                }
                this.this$0.j.postValue(arrayList);
                this.this$0.l.postValue(f.f52045b.a(arrayList));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "kotlin.jvm.PlatformType", "", "call", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$search$1$2$1$1", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$$special$$inlined$let$lambda$1", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 1, 15})
    static final class c<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GroupMemberListViewModel f51671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51672d;

        c(List list, GroupMemberListViewModel groupMemberListViewModel, String str) {
            this.f51670b = list;
            this.f51671c = groupMemberListViewModel;
            this.f51672d = str;
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f51669a, false, 52350, new Class[0], List.class)) {
                return e.a().a(this.f51670b, this.f51672d, true);
            }
            return (List) PatchProxy.accessDispatch(new Object[0], this, f51669a, false, 52350, new Class[0], List.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012b\u0010\u0002\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004 \u0006*.\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b¨\u0006\u000b"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "kotlin.jvm.PlatformType", "", "then", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$search$1$2$1$2", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$$special$$inlined$let$lambda$2", "com/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel$$special$$inlined$apply$lambda$2"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupMemberListViewModel f51674b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51675c;

        d(GroupMemberListViewModel groupMemberListViewModel, String str) {
            this.f51674b = groupMemberListViewModel;
            this.f51675c = str;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f51673a, false, 52351, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f51673a, false, 52351, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                if (!iVar.b() || iVar.e() == null) {
                    this.f51674b.k.postValue(CollectionsKt.emptyList());
                } else {
                    this.f51674b.k.postValue(iVar.e());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51665a, false, 52341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51665a, false, 52341, new Class[0], Void.TYPE);
            return;
        }
        switch (this.i) {
            case 5:
                if (PatchProxy.isSupport(new Object[0], this, f51665a, false, 52342, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51665a, false, 52342, new Class[0], Void.TYPE);
                    break;
                } else {
                    String str = this.f51666b;
                    if (str != null) {
                        com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a().a(str, (Function1<? super List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit>) new b<Object,Unit>(this));
                        break;
                    } else {
                        return;
                    }
                }
            case 6:
                if (PatchProxy.isSupport(new Object[0], this, f51665a, false, 52343, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51665a, false, 52343, new Class[0], Void.TYPE);
                    return;
                }
                String str2 = this.f51666b;
                if (str2 != null) {
                    com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a().a(str2, (Function1<? super List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit>) new a<Object,Unit>(this));
                    return;
                }
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        if (r10 == null) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.lang.String r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51665a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52345(0xcc79, float:7.3351E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51665a
            r3 = 0
            r4 = 52345(0xcc79, float:7.3351E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            if (r10 == 0) goto L_0x008f
            android.arch.lifecycle.MutableLiveData<java.lang.String> r0 = r9.p
            r0.postValue(r10)
            android.arch.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r0 = r9.j
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0075
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x0056:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0072
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.im.service.model.IMContact r2 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r2
            if (r2 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r2
            r1.add(r2)
            goto L_0x0056
        L_0x006a:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser"
            r0.<init>(r1)
            throw r0
        L_0x0072:
            java.util.List r1 = (java.util.List) r1
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            if (r1 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$c r0 = new com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$c
            r0.<init>(r1, r9, r10)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            a.i r0 = a.i.a((java.util.concurrent.Callable<TResult>) r0)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$d r1 = new com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$d
            r1.<init>(r9, r10)
            a.g r1 = (a.g) r1
            r0.a((a.g<TResult, TContinuationResult>) r1)
        L_0x008d:
            if (r10 != 0) goto L_0x00a2
        L_0x008f:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r0 = (com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel) r0
            android.arch.lifecycle.MutableLiveData<java.lang.String> r1 = r0.p
            java.lang.String r2 = ""
            r1.postValue(r2)
            android.arch.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r0 = r0.k
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0.postValue(r1)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel.a(java.lang.String):void");
    }
}
