package com.ss.android.ugc.aweme.im.sdk.group.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.c;
import com.bytedance.im.core.d.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0014\u0010\u001a\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "()V", "selectNumLimit", "", "getSelectNumLimit", "()I", "setSelectNumLimit", "(I)V", "shareContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "getShareContent", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "setShareContent", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;)V", "shareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "getShareStruct", "()Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "setShareStruct", "(Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;)V", "refresh", "", "search", "keyword", "", "setSelectedMember", "contactList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupListViewModel extends BaseMemberListViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51658a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f51659e = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public IShareService.ShareStruct f51660b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public BaseContent f51661c;

    /* renamed from: d  reason: collision with root package name */
    public int f51662d = 10;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel$Companion;", "", "()V", "MAX_SELECT_NUMBER", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/bytedance/im/core/model/Conversation;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Comparator<com.bytedance.im.core.d.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51663a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f51664b = new b();

        b() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str;
            com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
            com.bytedance.im.core.d.b bVar2 = (com.bytedance.im.core.d.b) obj2;
            if (PatchProxy.isSupport(new Object[]{bVar, bVar2}, this, f51663a, false, 52340, new Class[]{com.bytedance.im.core.d.b.class, com.bytedance.im.core.d.b.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{bVar, bVar2}, this, f51663a, false, 52340, new Class[]{com.bytedance.im.core.d.b.class, com.bytedance.im.core.d.b.class}, Integer.TYPE)).intValue();
            } else if (bVar.compareTo(bVar2) != 0) {
                return bVar.compareTo(bVar2);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(bVar, "o1");
                c coreInfo = bVar.getCoreInfo();
                String str2 = null;
                if (coreInfo != null) {
                    str = coreInfo.getName();
                } else {
                    str = null;
                }
                String d2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.d(com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(str));
                Intrinsics.checkExpressionValueIsNotNull(bVar2, "o2");
                c coreInfo2 = bVar2.getCoreInfo();
                if (coreInfo2 != null) {
                    str2 = coreInfo2.getName();
                }
                String d3 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.d(com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(str2));
                Intrinsics.checkExpressionValueIsNotNull(d3, "CharacterUtil.hashCode(C…inyin(o2.coreInfo?.name))");
                return d2.compareTo(d3);
            }
        }
    }

    public final void a(@Nullable String str) {
    }

    public final void a() {
        List list;
        IMContact iMContact;
        if (PatchProxy.isSupport(new Object[0], this, f51658a, false, 52338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51658a, false, 52338, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.group.a a2 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e.a();
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.group.a.f51527a, false, 52127, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.group.a.f51527a, false, 52127, new Class[0], List.class);
        } else {
            d a3 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "ConversationListModel.inst()");
            List<com.bytedance.im.core.d.b> c2 = a3.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "ConversationListModel.inst().groupConversationSync");
            Collection arrayList = new ArrayList();
            for (Object next : c2) {
                com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) next;
                Intrinsics.checkExpressionValueIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                if (bVar.isMember()) {
                    arrayList.add(next);
                }
            }
            list = (List) arrayList;
        }
        List<com.bytedance.im.core.d.b> sortedWith = CollectionsKt.sortedWith(list, b.f51664b);
        MutableLiveData<List<IMContact>> mutableLiveData = this.j;
        Collection arrayList2 = new ArrayList();
        for (com.bytedance.im.core.d.b bVar2 : sortedWith) {
            if (PatchProxy.isSupport(new Object[]{bVar2}, null, com.ss.android.ugc.aweme.im.sdk.d.d.f51215a, true, 51718, new Class[]{com.bytedance.im.core.d.b.class}, IMContact.class)) {
                iMContact = (IMContact) PatchProxy.accessDispatch(new Object[]{bVar2}, null, com.ss.android.ugc.aweme.im.sdk.d.d.f51215a, true, 51718, new Class[]{com.bytedance.im.core.d.b.class}, IMContact.class);
            } else {
                Intrinsics.checkParameterIsNotNull(bVar2, "conversation");
                if (bVar2.getConversationType() == d.a.f20886a) {
                    IMUser b2 = e.a().b(String.valueOf(com.bytedance.im.core.d.e.a(bVar2.getConversationId())));
                    if (b2 != null) {
                        iMContact = b2;
                    } else {
                        iMContact = null;
                    }
                } else {
                    IMConversation iMConversation = new IMConversation();
                    iMConversation.setConversationType(bVar2.getConversationType());
                    iMConversation.setConversationId(bVar2.getConversationId());
                    iMConversation.setConversationMemberCount(bVar2.getMemberCount());
                    c coreInfo = bVar2.getCoreInfo();
                    if (coreInfo != null) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUrlList(Collections.singletonList(coreInfo.getIcon()));
                        iMConversation.setConversationAvatar(urlModel);
                        iMConversation.setConversationName(coreInfo.getName());
                    }
                    iMContact = iMConversation;
                }
            }
            if (iMContact != null) {
                arrayList2.add(iMContact);
            }
        }
        mutableLiveData.postValue((List) arrayList2);
    }
}
