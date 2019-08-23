package com.ss.android.ugc.aweme.im.sdk.relations.model;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0016J\u0012\u0010'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J\u0014\u0010)\u001a\u00020$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0014\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0018\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "Ljava/util/Observer;", "()V", "conversationId", "", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "mRelationModel", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationModel;", "getMRelationModel", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationModel;", "mRelationModel$delegate", "Lkotlin/Lazy;", "shareContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "getShareContent", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "setShareContent", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;)V", "shareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "getShareStruct", "()Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "setShareStruct", "(Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;)V", "unselectedMemberList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "getUnselectedMemberList", "()Ljava/util/List;", "setUnselectedMemberList", "(Ljava/util/List;)V", "initAddMemberList", "", "initRelationList", "refresh", "search", "keyword", "setSelectedGroupList", "groupList", "setSelectedMember", "contactList", "update", "observer", "Ljava/util/Observable;", "arg", "", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelationMemberListViewModel extends BaseMemberListViewModel implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52168a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f52169b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RelationMemberListViewModel.class), "mRelationModel", "getMRelationModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationModel;"))};
    public static final a g = new a((byte) 0);
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f52170c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public IShareService.ShareStruct f52171d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public BaseContent f52172e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public List<? extends IMContact> f52173f = CollectionsKt.emptyList();
    private final Lazy q = LazyKt.lazy(new c(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$Companion;", "", "()V", "MAX_SELECT_NUMBER", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "invoke", "com/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$initAddMemberList$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<List<? extends com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RelationMemberListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RelationMemberListViewModel relationMemberListViewModel) {
            super(1);
            this.this$0 = relationMemberListViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list) {
            Long l;
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 52909, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 52909, new Class[]{List.class}, Void.TYPE);
            } else if (list != null) {
                RelationMemberListViewModel relationMemberListViewModel = this.this$0;
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
                relationMemberListViewModel.a((List) arrayList);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<RelationModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RelationMemberListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RelationMemberListViewModel relationMemberListViewModel) {
            super(0);
            this.this$0 = relationMemberListViewModel;
        }

        @NotNull
        public final RelationModel invoke() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52910, new Class[0], RelationModel.class)) {
                return (RelationModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52910, new Class[0], RelationModel.class);
            }
            RelationModel relationModel = new RelationModel(this.this$0);
            relationModel.g = true;
            if (this.this$0.i == 0 || this.this$0.i == 4) {
                z = true;
            }
            relationModel.h = z;
            relationModel.f52186f = 4;
            return relationModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "kotlin.jvm.PlatformType", "", "call", "com/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$search$1$2$1$1", "com/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$$special$$inlined$let$lambda$1", "com/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 1, 15})
    static final class d<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52175b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RelationMemberListViewModel f52176c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f52177d;

        d(List list, RelationMemberListViewModel relationMemberListViewModel, String str) {
            this.f52175b = list;
            this.f52176c = relationMemberListViewModel;
            this.f52177d = str;
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f52174a, false, 52911, new Class[0], List.class)) {
                return com.ss.android.ugc.aweme.im.sdk.d.e.a().a(this.f52175b, this.f52177d);
            }
            return (List) PatchProxy.accessDispatch(new Object[0], this, f52174a, false, 52911, new Class[0], List.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012b\u0010\u0002\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004 \u0006*.\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b¨\u0006\u000b"}, d2 = {"<anonymous>", "", "result", "Lbolts/Task;", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "kotlin.jvm.PlatformType", "", "then", "com/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$search$1$2$1$2", "com/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$$special$$inlined$let$lambda$2", "com/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel$$special$$inlined$apply$lambda$2"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelationMemberListViewModel f52179b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52180c;

        e(RelationMemberListViewModel relationMemberListViewModel, String str) {
            this.f52179b = relationMemberListViewModel;
            this.f52180c = str;
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f52178a, false, 52912, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f52178a, false, 52912, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar2, "result");
                if (iVar.b()) {
                    this.f52179b.k.postValue(iVar.e());
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final RelationModel i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f52168a, false, 52901, new Class[0], RelationModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f52168a, false, 52901, new Class[0], RelationModel.class);
        } else {
            value = this.q.getValue();
        }
        return (RelationModel) value;
    }

    private final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f52168a, false, 52903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52168a, false, 52903, new Class[0], Void.TYPE);
            return;
        }
        i().a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52168a, false, 52902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52168a, false, 52902, new Class[0], Void.TYPE);
            return;
        }
        int i = this.i;
        if (i != 4) {
            switch (i) {
                case 0:
                case 1:
                    j();
                    return;
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f52168a, false, 52904, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52168a, false, 52904, new Class[0], Void.TYPE);
                return;
            }
            String str = this.f52170c;
            if (str != null) {
                com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a().a(str, (Function1<? super List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit>) new b<Object,Unit>(this));
            }
            j();
        }
    }

    public final void a(@NotNull List<? extends IMContact> list) {
        List<? extends IMContact> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f52168a, false, 52900, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f52168a, false, 52900, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.f52173f = list2;
    }

    public final void b(@NotNull List<? extends IMContact> list) {
        List<? extends IMContact> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f52168a, false, 52905, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f52168a, false, 52905, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "contactList");
        List mutableList = CollectionsKt.toMutableList((Collection<? extends T>) d());
        for (IMContact iMContact : list2) {
            if (mutableList.contains(iMContact)) {
                mutableList.remove(iMContact);
            } else {
                mutableList.add(iMContact);
            }
        }
        this.o.postValue(mutableList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        if (r10 == null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.lang.String r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f52168a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52907(0xceab, float:7.4138E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f52168a
            r3 = 0
            r4 = 52907(0xceab, float:7.4138E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            if (r10 == 0) goto L_0x00a0
            android.arch.lifecycle.MutableLiveData<java.lang.String> r0 = r9.p
            r0.postValue(r10)
            int r0 = r9.i
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x0094;
                case 2: goto L_0x003e;
                case 3: goto L_0x003e;
                case 4: goto L_0x0094;
                case 5: goto L_0x003f;
                case 6: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x009e
        L_0x003f:
            android.arch.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r0 = r9.j
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x007b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x005c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.im.service.model.IMContact r2 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r2
            if (r2 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r2
            r1.add(r2)
            goto L_0x005c
        L_0x0070:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser"
            r0.<init>(r1)
            throw r0
        L_0x0078:
            java.util.List r1 = (java.util.List) r1
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r1 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$d r0 = new com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$d
            r0.<init>(r1, r9, r10)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            a.i r0 = a.i.a((java.util.concurrent.Callable<TResult>) r0)
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$e r1 = new com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$e
            r1.<init>(r9, r10)
            a.g r1 = (a.g) r1
            r0.a((a.g<TResult, TContinuationResult>) r1)
            goto L_0x009e
        L_0x0094:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationModel r0 = r9.i()
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.a((java.lang.CharSequence) r1)
        L_0x009e:
            if (r10 != 0) goto L_0x00b3
        L_0x00a0:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r0 = (com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel) r0
            android.arch.lifecycle.MutableLiveData<java.lang.String> r1 = r0.p
            java.lang.String r2 = ""
            r1.postValue(r2)
            android.arch.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r0 = r0.k
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0.postValue(r1)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel.a(java.lang.String):void");
    }

    public final void c(@NotNull List<? extends IMContact> list) {
        boolean z;
        List<? extends IMContact> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f52168a, false, 52906, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f52168a, false, 52906, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "groupList");
        Collection arrayList = new ArrayList();
        for (Object next : d()) {
            IMContact iMContact = (IMContact) next;
            if (!(iMContact instanceof IMConversation) || list2.contains(iMContact)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection<? extends T>) (List) arrayList);
        for (IMContact iMContact2 : list2) {
            if (!mutableList.contains(iMContact2)) {
                mutableList.add(iMContact2);
            }
        }
        this.o.postValue(mutableList);
    }

    public final void update(@NotNull Observable observable, @NotNull Object obj) {
        if (PatchProxy.isSupport(new Object[]{observable, obj}, this, f52168a, false, 52908, new Class[]{Observable.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observable, obj}, this, f52168a, false, 52908, new Class[]{Observable.class, Object.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(observable, "observer");
        Intrinsics.checkParameterIsNotNull(obj, "arg");
        if (Intrinsics.areEqual((Object) observable, (Object) i()) && (obj instanceof Integer)) {
            if (Intrinsics.areEqual(obj, (Object) 0) || Intrinsics.areEqual(obj, (Object) -1)) {
                MutableLiveData<List<IMContact>> mutableLiveData = this.j;
                List<IMContact> list = i().f52183c;
                Intrinsics.checkExpressionValueIsNotNull(list, "mRelationModel.data");
                mutableLiveData.postValue(CollectionsKt.filterNotNull(list));
                this.l.postValue(TuplesKt.to(i().i, i().j));
            } else if (Intrinsics.areEqual(obj, (Object) 1)) {
                this.k.postValue(i().f52184d);
            }
        }
    }
}
