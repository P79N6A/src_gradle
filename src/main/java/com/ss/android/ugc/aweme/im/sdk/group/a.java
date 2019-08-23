package com.ss.android.ugc.aweme.im.sdk.group;

import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.proto.GroupRole;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent;
import com.ss.android.ugc.aweme.im.sdk.group.a.c;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00112\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b\u0018\u00010\u0013JH\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00112\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b\u0018\u00010\u0013J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006J\"\u0010\u0017\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\bH\u0002J\u001e\u0010\u0019\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJH\u0010\u001d\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00112\u001e\u0010\u001f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u000b\u0018\u00010 J\u0018\u0010!\u001a\u00020\u000b2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J*\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0%J\u0010\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0005J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0005J4\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u00052\u001c\u0010\u001f\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010%J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\bH\u0002J(\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0002J&\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\t022\u0006\u00103\u001a\u00020&H\u0002J4\u00104\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000505j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`62\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J*\u00107\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b0%J\u0010\u00109\u001a\u0002082\b\u0010\f\u001a\u0004\u0018\u00010\u0005J2\u0010:\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0=J\"\u0010>\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\bH\u0002J\u001c\u0010?\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u001e\u0010A\u001a\u00020\u000b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\t022\u0006\u00103\u001a\u00020&H\u0002J\"\u0010B\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\bH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager;", "", "()V", "mGroupCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/bytedance/im/core/model/Conversation;", "mGroupMemberList", "", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "addGroupMemberList", "", "conversationId", "conversationShortId", "addMemberList", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "map", "", "addCallback", "Lcom/bytedance/im/core/client/callback/IRequestListener2;", "Lcom/bytedance/im/core/model/Member;", "addGroupNoticeMessage", "conversation", "addMemberToCache", "memberList", "buildGroupName", "contacts", "error", "Lcom/bytedance/im/core/model/IMError;", "createGroupConversation", "userList", "callback", "Lkotlin/Function2;", "fetchUserInfo", "dataList", "getCurrentGroupRole", "uid", "Lkotlin/Function1;", "", "getGroupInfo", "getGroupList", "getGroupMemberList", "getIMMemberList", "getMemberIdList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectMemberList", "getSubUserInfoMemberList", "userInfoMemberList", "", "subCount", "getUidToSecUidMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isGroupOwnerOrManager", "", "isOnlySelfAndGroupOwner", "removeGroupMemberList", "removeMemberList", "removeCallback", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "removeMemberFromCache", "sendGroupInviteMessage", "uidList", "startFetchUserInfo", "updateMemberToCache", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51527a;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final Lazy f51528d = LazyKt.lazy(b.INSTANCE);

    /* renamed from: e  reason: collision with root package name */
    public static final C0602a f51529e = new C0602a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>> f51530b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap<String, com.bytedance.im.core.d.b> f51531c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u00020\u00078FX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager$Companion;", "", "()V", "GROUP_NAME_MAX_MEMBER_COUNT", "", "MAX_COUNT_GET_USER_INFO", "instance", "Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager;", "instance$delegate", "Lkotlin/Lazy;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$a  reason: collision with other inner class name */
    public static final class C0602a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51532a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f51533b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(C0602a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager;"))};

        @NotNull
        public final a a() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f51532a, false, 52151, new Class[0], a.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f51532a, false, 52151, new Class[0], a.class);
            } else {
                value = a.f51528d.getValue();
            }
            return (a) value;
        }

        private C0602a() {
        }

        public /* synthetic */ C0602a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<a> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final a invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52152, new Class[0], a.class)) {
                return new a((byte) 0);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52152, new Class[0], a.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$addGroupMemberList$1", "Lcom/bytedance/im/core/client/callback/IRequestListener2;", "", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "memberList", "onSuccessWithInfo", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.bytedance.im.core.a.a.c<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51536a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f51537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51538c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.im.core.a.a.c f51539d;

        public final void a(@Nullable j jVar) {
            j jVar2 = jVar;
            if (PatchProxy.isSupport(new Object[]{jVar2}, this, f51536a, false, 52155, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar2}, this, f51536a, false, 52155, new Class[]{j.class}, Void.TYPE);
                return;
            }
            com.bytedance.im.core.a.a.c cVar = this.f51539d;
            if (cVar != null) {
                cVar.a(jVar2);
            }
        }

        public final /* synthetic */ void a(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f51536a, false, 52153, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51536a, false, 52153, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f51537b.a(this.f51538c, list);
            com.bytedance.im.core.a.a.c cVar = this.f51539d;
            if (cVar != null) {
                cVar.a(list);
            }
        }

        public final /* synthetic */ void a(Object obj, j jVar) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list, jVar}, this, f51536a, false, 52154, new Class[]{List.class, j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list, jVar}, this, f51536a, false, 52154, new Class[]{List.class, j.class}, Void.TYPE);
                return;
            }
            this.f51537b.a(this.f51538c, list);
            com.bytedance.im.core.a.a.c cVar = this.f51539d;
            if (cVar != null) {
                cVar.a(list, jVar);
            }
        }

        c(a aVar, String str, com.bytedance.im.core.a.a.c cVar) {
            this.f51537b = aVar;
            this.f51538c = str;
            this.f51539d = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$addGroupMemberList$2", "Lcom/bytedance/im/core/client/callback/IRequestListener2;", "", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "memberList", "onSuccessWithInfo", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.im.core.a.a.c<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f51541b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51542c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.im.core.a.a.c f51543d;

        public final void a(@Nullable j jVar) {
            j jVar2 = jVar;
            if (PatchProxy.isSupport(new Object[]{jVar2}, this, f51540a, false, 52158, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar2}, this, f51540a, false, 52158, new Class[]{j.class}, Void.TYPE);
                return;
            }
            com.bytedance.im.core.a.a.c cVar = this.f51543d;
            if (cVar != null) {
                cVar.a(jVar2);
            }
        }

        public final /* synthetic */ void a(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f51540a, false, 52156, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51540a, false, 52156, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f51541b.a(this.f51542c, list);
            com.bytedance.im.core.a.a.c cVar = this.f51543d;
            if (cVar != null) {
                cVar.a(list);
            }
        }

        public final /* synthetic */ void a(Object obj, j jVar) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list, jVar}, this, f51540a, false, 52157, new Class[]{List.class, j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list, jVar}, this, f51540a, false, 52157, new Class[]{List.class, j.class}, Void.TYPE);
                return;
            }
            this.f51541b.a(this.f51542c, list);
            com.bytedance.im.core.a.a.c cVar = this.f51543d;
            if (cVar != null) {
                cVar.a(list, jVar);
            }
        }

        public d(a aVar, String str, com.bytedance.im.core.a.a.c cVar) {
            this.f51541b = aVar;
            this.f51542c = str;
            this.f51543d = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$createGroupConversation$2", "Lcom/bytedance/im/core/client/callback/IRequestListener2;", "Lcom/bytedance/im/core/model/Conversation;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "onSuccessWithInfo", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.bytedance.im.core.a.a.c<com.bytedance.im.core.d.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f51545b;

        e(Function2 function2) {
            this.f51545b = function2;
        }

        public final void a(@Nullable j jVar) {
            j jVar2 = jVar;
            if (PatchProxy.isSupport(new Object[]{jVar2}, this, f51544a, false, 52161, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar2}, this, f51544a, false, 52161, new Class[]{j.class}, Void.TYPE);
                return;
            }
            Function2 function2 = this.f51545b;
            if (function2 != null) {
                function2.invoke(null, jVar2);
            }
        }

        public final /* synthetic */ void a(Object obj) {
            com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51544a, false, 52160, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51544a, false, 52160, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Function2 function2 = this.f51545b;
            if (function2 != null) {
                function2.invoke(bVar, null);
            }
        }

        public final /* synthetic */ void a(Object obj, j jVar) {
            j jVar2 = jVar;
            com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar, jVar2}, this, f51544a, false, 52159, new Class[]{com.bytedance.im.core.d.b.class, j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, jVar2}, this, f51544a, false, 52159, new Class[]{com.bytedance.im.core.d.b.class, j.class}, Void.TYPE);
                return;
            }
            Function2 function2 = this.f51545b;
            if (function2 != null) {
                function2.invoke(bVar, jVar2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$getCurrentGroupRole$1", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements com.bytedance.im.core.a.a.b<m> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f51547b;

        public f(Function1 function1) {
            this.f51547b = function1;
        }

        public final void a(@Nullable j jVar) {
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f51546a, false, 52163, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f51546a, false, 52163, new Class[]{j.class}, Void.TYPE);
                return;
            }
            this.f51547b.invoke(Integer.valueOf(GroupRole.ORDINARY.getValue()));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
            if (r7 == null) goto L_0x0046;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r11) {
            /*
                r10 = this;
                r7 = r11
                com.bytedance.im.core.d.m r7 = (com.bytedance.im.core.d.m) r7
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r9 = 0
                r0[r9] = r7
                com.meituan.robust.ChangeQuickRedirect r2 = f51546a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.bytedance.im.core.d.m> r1 = com.bytedance.im.core.d.m.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 52162(0xcbc2, float:7.3095E-41)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0035
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r7
                com.meituan.robust.ChangeQuickRedirect r2 = f51546a
                r3 = 0
                r4 = 52162(0xcbc2, float:7.3095E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.bytedance.im.core.d.m> r1 = com.bytedance.im.core.d.m.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0035:
                if (r7 == 0) goto L_0x0046
                kotlin.jvm.functions.Function1 r0 = r10.f51547b
                int r1 = r7.getRole()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.invoke(r1)
                if (r7 != 0) goto L_0x0055
            L_0x0046:
                kotlin.jvm.functions.Function1 r0 = r10.f51547b
                com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.im.core.proto.GroupRole.ORDINARY
                int r1 = r1.getValue()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.invoke(r1)
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.a.f.a(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$getGroupMemberList$1", "Lcom/bytedance/im/core/model/IConversationObserver;", "onAddMembers", "", "memberList", "", "Lcom/bytedance/im/core/model/Member;", "onCreateConversation", "conversation", "Lcom/bytedance/im/core/model/Conversation;", "onDeleteConversation", "onDissolveConversation", "onLeaveConversation", "onLoadMember", "conversationId", "", "onRemoveMembers", "onUpdateConversation", "onUpdateMembers", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements com.bytedance.im.core.d.h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f51549b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.im.core.d.e f51550c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51551d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function1 f51552e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$getGroupMemberList$1$onUpdateConversation$1", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "memberList", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$g$a  reason: collision with other inner class name */
        public static final class C0603a implements com.bytedance.im.core.a.a.b<List<? extends m>> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51553a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f51554b;

            public final void a(@Nullable j jVar) {
            }

            C0603a(g gVar) {
                this.f51554b = gVar;
            }

            public final /* synthetic */ void a(Object obj) {
                List list = (List) obj;
                if (PatchProxy.isSupport(new Object[]{list}, this, f51553a, false, 52173, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list}, this, f51553a, false, 52173, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                this.f51554b.f51549b.f51530b.put(this.f51554b.f51551d, this.f51554b.f51549b.a(list));
            }
        }

        public final void a(@NotNull com.bytedance.im.core.d.b bVar) {
            com.bytedance.im.core.d.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f51548a, false, 52164, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f51548a, false, 52164, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "conversation");
        }

        public final void c(@NotNull com.bytedance.im.core.d.b bVar) {
            com.bytedance.im.core.d.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f51548a, false, 52166, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f51548a, false, 52166, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "conversation");
        }

        public final void d(@NotNull com.bytedance.im.core.d.b bVar) {
            com.bytedance.im.core.d.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f51548a, false, 52167, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f51548a, false, 52167, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "conversation");
        }

        public final void b(@NotNull List<? extends m> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f51548a, false, 52172, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51548a, false, 52172, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "memberList");
            this.f51549b.b(this.f51551d, list);
        }

        public final void b(@NotNull com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51548a, false, 52165, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51548a, false, 52165, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "conversation");
            this.f51550c.a((com.bytedance.im.core.a.a.b<List<m>>) new C0603a<List<m>>(this));
        }

        public final void e(@NotNull com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51548a, false, 52168, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51548a, false, 52168, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "conversation");
            this.f51549b.f51530b.remove(this.f51551d);
        }

        public final void a(@NotNull List<? extends m> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f51548a, false, 52171, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51548a, false, 52171, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "memberList");
            this.f51549b.a(this.f51551d, list);
        }

        public final void a(@NotNull String str, @Nullable List<? extends m> list) {
            if (PatchProxy.isSupport(new Object[]{str, list}, this, f51548a, false, 52169, new Class[]{String.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, list}, this, f51548a, false, 52169, new Class[]{String.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "conversationId");
            List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a2 = this.f51549b.a(list);
            this.f51549b.f51530b.put(str, a2);
            Function1 function1 = this.f51552e;
            if (function1 != null) {
                function1.invoke(a2);
            }
            this.f51549b.b(a2);
        }

        g(a aVar, com.bytedance.im.core.d.e eVar, String str, Function1 function1) {
            this.f51549b = aVar;
            this.f51550c = eVar;
            this.f51551d = str;
            this.f51552e = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$removeGroupMemberList$1", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "memberList", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements com.bytedance.im.core.a.a.b<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f51556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51557c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.im.core.a.a.b f51558d;

        public final void a(@Nullable j jVar) {
            j jVar2 = jVar;
            if (PatchProxy.isSupport(new Object[]{jVar2}, this, f51555a, false, 52177, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar2}, this, f51555a, false, 52177, new Class[]{j.class}, Void.TYPE);
                return;
            }
            this.f51558d.a(jVar2);
        }

        public final /* synthetic */ void a(Object obj) {
            List list = (List) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{list}, this, f51555a, false, 52176, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51555a, false, 52176, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (!z) {
                this.f51556b.b(this.f51557c, list);
                this.f51558d.a(list);
            }
        }

        h(a aVar, String str, com.bytedance.im.core.a.a.b bVar) {
            this.f51556b = aVar;
            this.f51557c = str;
            this.f51558d = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupManager$startFetchUserInfo$1", "Lcom/ss/android/ugc/aweme/im/sdk/core/UserInfoCallback;", "onSuccess", "", "userInfo", "Lcom/ss/android/ugc/aweme/im/sdk/model/UserInfo;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i extends com.ss.android.ugc.aweme.im.sdk.d.m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f51560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51561c;

        public final void a(@NotNull com.ss.android.ugc.aweme.im.sdk.model.f fVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, f51559a, false, 52178, new Class[]{com.ss.android.ugc.aweme.im.sdk.model.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, f51559a, false, 52178, new Class[]{com.ss.android.ugc.aweme.im.sdk.model.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "userInfo");
            Collection collection = this.f51561c;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (!z) {
                this.f51560b.a(this.f51561c, fVar.f51829b);
            }
        }

        i(a aVar, List list) {
            this.f51560b = aVar;
            this.f51561c = list;
        }
    }

    public final void a(@NotNull List<? extends IMUser> list, @NotNull Map<String, String> map, @Nullable Function2<? super com.bytedance.im.core.d.b, ? super j, Unit> function2) {
        List<? extends IMUser> list2 = list;
        Map<String, String> map2 = map;
        Function2<? super com.bytedance.im.core.d.b, ? super j, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{list2, map2, function22}, this, f51527a, false, 52128, new Class[]{List.class, Map.class, Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, map2, function22}, this, f51527a, false, 52128, new Class[]{List.class, Map.class, Function2.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "userList");
        Intrinsics.checkParameterIsNotNull(map2, "map");
        com.bytedance.im.core.d.d a2 = com.bytedance.im.core.d.d.a();
        Iterable<IMUser> iterable = list2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (IMUser uid : iterable) {
            String uid2 = uid.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid2, "it.uid");
            arrayList.add(Long.valueOf(Long.parseLong(uid2)));
        }
        a2.a(0, (List) arrayList, map2, new e(function22));
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f51527a, false, 52134, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f51527a, false, 52134, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.d.e.a().a((Map<String, String>) d(b(list, i2)), (com.ss.android.ugc.aweme.im.sdk.d.m) new i(this, list));
    }

    public final void a(@Nullable String str, @NotNull List<? extends IMUser> list, @NotNull Map<String, String> map, @Nullable com.bytedance.im.core.a.a.c<List<m>> cVar) {
        String str2 = str;
        List<? extends IMUser> list2 = list;
        Map<String, String> map2 = map;
        com.bytedance.im.core.a.a.c<List<m>> cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str2, list2, map2, cVar2}, this, f51527a, false, 52138, new Class[]{String.class, List.class, Map.class, com.bytedance.im.core.a.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2, map2, cVar2}, this, f51527a, false, 52138, new Class[]{String.class, List.class, Map.class, com.bytedance.im.core.a.a.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "addMemberList");
        Intrinsics.checkParameterIsNotNull(map2, "map");
        if (str2 != null) {
            new com.bytedance.im.core.d.e(str2).a((List<Long>) c(list2), map2, (com.bytedance.im.core.a.a.b<List<m>>) new c<List<m>>(this, str2, cVar2));
        }
    }

    private a() {
        this.f51530b = new ConcurrentHashMap<>();
        this.f51531c = new ConcurrentHashMap<>();
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    @Nullable
    public final List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51527a, false, 52130, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, this, f51527a, false, 52130, new Class[]{String.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "conversationId");
        return a(str2, (Function1<? super List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit>) null);
    }

    public final ArrayList<Long> c(List<? extends IMUser> list) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list}, this, f51527a, false, 52143, new Class[]{List.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{list}, this, f51527a, false, 52143, new Class[]{List.class}, ArrayList.class);
        }
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        if (z) {
            return new ArrayList<>();
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        for (IMUser uid : list) {
            String uid2 = uid.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid2, "user.uid");
            arrayList.add(Long.valueOf(Long.parseLong(uid2)));
        }
        return arrayList;
    }

    private final HashMap<String, String> d(List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list) {
        Long l;
        if (PatchProxy.isSupport(new Object[]{list}, this, f51527a, false, 52136, new Class[]{List.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{list}, this, f51527a, false, 52136, new Class[]{List.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (list != null) {
            for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar : list) {
                m member = aVar.getMember();
                String str = null;
                if (member != null) {
                    l = Long.valueOf(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                m member2 = aVar.getMember();
                if (member2 != null) {
                    str = member2.getSecUid();
                }
                String valueOf2 = String.valueOf(str);
                if (!(valueOf == null || valueOf2 == null)) {
                    hashMap.put(valueOf, valueOf2);
                }
            }
        }
        return hashMap;
    }

    public final List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a(List<? extends m> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51527a, false, 52132, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f51527a, false, 52132, new Class[]{List.class}, List.class);
        }
        List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> arrayList = new ArrayList<>();
        if (list != null) {
            for (m mVar : list) {
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.chat.b.a.a();
                aVar.setUser(com.ss.android.ugc.aweme.im.sdk.d.e.a().a(String.valueOf(mVar.getUid()), false));
                aVar.setMember(mVar);
                if (mVar.getRole() == GroupRole.OWNER.getValue()) {
                    arrayList.add(0, aVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    public final void b(List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list) {
        Long l;
        if (PatchProxy.isSupport(new Object[]{list}, this, f51527a, false, 52133, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51527a, false, 52133, new Class[]{List.class}, Void.TYPE);
            return;
        }
        List arrayList = new ArrayList();
        if (list != null) {
            for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar : list) {
                m member = aVar.getMember();
                if (member != null) {
                    l = Long.valueOf(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                aVar.setUser(com.ss.android.ugc.aweme.im.sdk.d.e.a().a(valueOf, false));
                if (aVar.getUser() == null && valueOf != null) {
                    arrayList.add(aVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            a(arrayList, 50);
        }
    }

    public final boolean b(@Nullable String str) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f51527a, false, 52144, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f51527a, false, 52144, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null) {
            return false;
        } else {
            List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a2 = a(str);
            Collection collection = a2;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            Iterator<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> it2 = a2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a next = it2.next();
                IMUser user = next.getUser();
                if ((user == null || !user.equals(IMUser.fromUser(com.ss.android.ugc.aweme.im.sdk.utils.d.c()))) && next.getMember() != null) {
                    m member = next.getMember();
                    if (member == null) {
                        Intrinsics.throwNpe();
                    }
                    if (member.getRole() != GroupRole.OWNER.getValue()) {
                        z2 = false;
                        break;
                    }
                }
            }
            return z2;
        }
    }

    private final List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> b(List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list, int i2) {
        List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list2 = list;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i2)}, this, f51527a, false, 52135, new Class[]{List.class, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i2)}, this, f51527a, false, 52135, new Class[]{List.class, Integer.TYPE}, List.class);
        }
        List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> arrayList = new ArrayList<>();
        if (list.size() > i3) {
            arrayList.addAll(list2.subList(0, i3));
        } else {
            arrayList.addAll(list2);
        }
        list2.removeAll(arrayList);
        return arrayList;
    }

    @Nullable
    public final List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a(@NotNull String str, @Nullable Function1<? super List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a>, Unit> function1) {
        if (PatchProxy.isSupport(new Object[]{str, function1}, this, f51527a, false, 52131, new Class[]{String.class, Function1.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str, function1}, this, f51527a, false, 52131, new Class[]{String.class, Function1.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "conversationId");
        List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> list = this.f51530b.get(str);
        if (list == null) {
            com.bytedance.im.core.d.e eVar = new com.bytedance.im.core.d.e(str);
            eVar.a((com.bytedance.im.core.d.h) new g(this, eVar, str, function1));
            eVar.c();
        } else {
            b(list);
            if (function1 != null) {
                function1.invoke(list);
            }
        }
        return list;
    }

    public final void b(String str, List<? extends m> list) {
        boolean z;
        String str2 = str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{str2, list}, this, f51527a, false, 52142, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list}, this, f51527a, false, 52142, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a2 = a(str);
                if (a2 != null) {
                    Collection arrayList = new ArrayList();
                    for (Object next : a2) {
                        if (!CollectionsKt.contains(list, ((com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) next).getMember())) {
                            arrayList.add(next);
                        }
                    }
                    this.f51530b.put(str2, (List) arrayList);
                    return;
                }
                return;
            }
        }
    }

    public final void c(@NotNull String str, @NotNull List<String> list) {
        boolean z;
        String str2 = str;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, this, f51527a, false, 52146, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, this, f51527a, false, 52146, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "conversationId");
        Intrinsics.checkParameterIsNotNull(list2, "uidList");
        com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(str2);
        if (a2 != null) {
            c cVar = new c();
            cVar.setFromUserId(String.valueOf(com.ss.android.ugc.aweme.im.sdk.utils.d.d()));
            cVar.setFromUserSecId(com.ss.android.ugc.aweme.im.sdk.d.j.f51270d.b(cVar.getFromUserId()));
            cVar.setConversationId(a2.getConversationId());
            cVar.setConversationShortId(String.valueOf(a2.getConversationShortId()));
            com.bytedance.im.core.d.c coreInfo = a2.getCoreInfo();
            if (coreInfo != null) {
                CharSequence icon = coreInfo.getIcon();
                if (icon == null || icon.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(CollectionsKt.listOf(coreInfo.getIcon(), coreInfo.getIcon(), coreInfo.getIcon()));
                    cVar.setGroupIcon(urlModel);
                }
                cVar.setGroupName(coreInfo.getName());
            }
            ba.a().a(list2, CollectionsKt.listOf(GroupInviteContent.Companion.obtain(cVar)));
        }
    }

    public final void a(String str, List<? extends m> list) {
        boolean z;
        String str2 = str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str2, list}, this, f51527a, false, 52140, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list}, this, f51527a, false, 52140, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                List arrayList = new ArrayList();
                List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a2 = a(str);
                if (a2 != null) {
                    Collection arrayList2 = new ArrayList();
                    for (Object next : a2) {
                        if (CollectionsKt.contains(list, ((com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) next).getMember())) {
                            arrayList2.add(next);
                        }
                    }
                    for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a member : (List) arrayList2) {
                        arrayList.add(member.getMember());
                    }
                }
                List<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> a3 = a(str);
                if (!(a3 instanceof ArrayList)) {
                    a3 = null;
                }
                ArrayList arrayList3 = (ArrayList) a3;
                if (arrayList3 != null) {
                    for (m mVar : list) {
                        if (!arrayList.contains(mVar)) {
                            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.chat.b.a.a();
                            aVar.setUser(com.ss.android.ugc.aweme.im.sdk.d.e.a().a(String.valueOf(mVar.getUid()), false));
                            aVar.setMember(mVar);
                            arrayList3.add(aVar);
                        }
                    }
                    this.f51530b.put(str2, arrayList3);
                    return;
                }
                return;
            }
        }
    }

    public final void a(@Nullable String str, @NotNull List<? extends IMUser> list, @NotNull com.bytedance.im.core.a.a.b<List<m>> bVar) {
        String str2 = str;
        List<? extends IMUser> list2 = list;
        com.bytedance.im.core.a.a.b<List<m>> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, list2, bVar2}, this, f51527a, false, 52141, new Class[]{String.class, List.class, com.bytedance.im.core.a.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2, bVar2}, this, f51527a, false, 52141, new Class[]{String.class, List.class, com.bytedance.im.core.a.a.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "removeMemberList");
        Intrinsics.checkParameterIsNotNull(bVar2, "removeCallback");
        if (str2 != null) {
            new com.bytedance.im.core.d.e(str2).b(c(list2), null, new h(this, str2, bVar2));
        }
    }
}
