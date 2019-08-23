package com.ss.android.ugc.aweme.im.sdk.group;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u0018\u0010 \u001a\u00020\u001d2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u001d2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u0016\u0010&\u001a\u00020\u001d2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\b\u0010(\u001a\u00020\u001dH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupListFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;", "()V", "mCallBack", "Lcom/ss/android/ugc/aweme/base/Callback;", "", "mInitMaxSelectCount", "", "mInitSelectMode", "mInitSelectedMember", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "mInitShareContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "mInitShareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "createEmptyView", "Landroid/view/View;", "createViewModel", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "enableMultiSelect", "enableSingleSelect", "getLeftIcon", "isMultiSelect", "getTitle", "", "initParams", "", "initViewModel", "initViews", "onMemberLoaded", "memberList", "", "onMemberSelected", "selectList", "onTitlebarRightClick", "setCallBack", "callback", "updateTitleBar", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupListFragment extends BaseSelectFragment<GroupListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51483a;

    /* renamed from: b  reason: collision with root package name */
    public IShareService.ShareStruct f51484b;

    /* renamed from: c  reason: collision with root package name */
    public BaseContent f51485c;

    /* renamed from: d  reason: collision with root package name */
    public int f51486d = 10;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.a<Boolean> f51487e;
    private int m = -1;
    private LinkedHashSet<IMContact> n;
    private HashMap o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupListFragment f51489b;

        a(GroupListFragment groupListFragment) {
            this.f51489b = groupListFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51488a, false, 52124, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51488a, false, 52124, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            z.a("create_group_from_list_click", (Map<String, String>) null);
            FragmentActivity activity = this.f51489b.getActivity();
            if (activity != null) {
                activity.setResult(224);
            }
            FragmentActivity activity2 = this.f51489b.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<GroupListViewModel, GroupListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupListFragment groupListFragment) {
            super(1);
            this.this$0 = groupListFragment;
        }

        @NotNull
        public final GroupListViewModel invoke(@NotNull GroupListViewModel groupListViewModel) {
            if (PatchProxy.isSupport(new Object[]{groupListViewModel}, this, changeQuickRedirect, false, 52125, new Class[]{GroupListViewModel.class}, GroupListViewModel.class)) {
                return (GroupListViewModel) PatchProxy.accessDispatch(new Object[]{groupListViewModel}, this, changeQuickRedirect, false, 52125, new Class[]{GroupListViewModel.class}, GroupListViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(groupListViewModel, "$receiver");
            groupListViewModel.i = this.this$0.k;
            groupListViewModel.f51660b = this.this$0.f51484b;
            groupListViewModel.f51661c = this.this$0.f51485c;
            groupListViewModel.f51662d = this.this$0.f51486d;
            return groupListViewModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "onShare", "", "kotlin.jvm.PlatformType", "run", "(Ljava/lang/Boolean;)V", "com/ss/android/ugc/aweme/im/sdk/group/GroupListFragment$onMemberSelected$1$1$1", "com/ss/android/ugc/aweme/im/sdk/group/GroupListFragment$$special$$inlined$forEach$lambda$1"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements com.ss.android.ugc.aweme.base.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupListFragment f51491b;

        c(GroupListFragment groupListFragment) {
            this.f51491b = groupListFragment;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f51490a, false, 52126, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f51490a, false, 52126, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (this.f51491b.k == 3) {
                com.ss.android.ugc.aweme.base.a<Boolean> aVar = this.f51491b.f51487e;
                if (aVar != null) {
                    aVar.run(bool);
                }
                Intrinsics.checkExpressionValueIsNotNull(bool, "onShare");
                if (bool.booleanValue()) {
                    BaseContent baseContent = ((GroupListViewModel) this.f51491b.o()).f51661c;
                    if (baseContent != null) {
                        ChatRoomActivity.a(this.f51491b.getContext());
                        if (baseContent != null) {
                            return;
                        }
                    }
                    Boolean.valueOf(h.a().a("aweme://main"));
                }
            }
        }
    }

    public final int a(boolean z) {
        return 2130841646;
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51483a, false, 52122, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51483a, false, 52122, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.o == null) {
            this.o = new HashMap();
        }
        View view = (View) this.o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51483a, false, 52123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51483a, false, 52123, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final boolean c() {
        if (this.k == 3 && this.m == 3) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.k == 2 || (this.k == 3 && this.m == 2)) {
            return true;
        }
        return false;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51483a, false, 52114, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51483a, false, 52114, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        SearchHeadListView searchHeadListView = (SearchHeadListView) a((int) C0906R.id.cle);
        Intrinsics.checkExpressionValueIsNotNull(searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(8);
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f51483a, false, 52118, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51483a, false, 52118, new Class[0], String.class);
        }
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        String string = context.getResources().getString(C0906R.string.ax7);
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…R.string.im_select_group)");
        return string;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f51483a, false, 52116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51483a, false, 52116, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        if (this.k == 2) {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar, "title_bar");
            View rightView = imTextTitleBar.getRightView();
            Intrinsics.checkExpressionValueIsNotNull(rightView, "title_bar.rightView");
            rightView.setVisibility(8);
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f51483a, false, 52117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51483a, false, 52117, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        if (((GroupListViewModel) o()).b() && this.k == 3) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_selected_contact", new LinkedHashSet(((GroupListViewModel) o()).d()));
            intent.putExtras(bundle);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(224, intent);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @NotNull
    public final View k() {
        if (PatchProxy.isSupport(new Object[0], this, f51483a, false, 52119, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f51483a, false, 52119, new Class[0], View.class);
        }
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        c.a a2 = new c.a(getContext()).b((int) C0906R.string.asj).c(C0906R.string.as_).a(2130840069);
        if (this.k == 2) {
            a2.a(com.bytedance.ies.dmt.ui.widget.a.SOLID, C0906R.string.ari, new a(this));
        }
        dmtDefaultView.setStatus(a2.f20493a);
        return dmtDefaultView;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51483a, false, 52115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51483a, false, 52115, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.m != -1) {
            ((GroupListViewModel) o()).a(this.m);
        }
        LinkedHashSet<IMContact> linkedHashSet = this.n;
        if (linkedHashSet != null) {
            GroupListViewModel groupListViewModel = (GroupListViewModel) o();
            List<IMContact> list = CollectionsKt.toList(linkedHashSet);
            if (PatchProxy.isSupport(new Object[]{list}, groupListViewModel, GroupListViewModel.f51658a, false, 52339, new Class[]{List.class}, Void.TYPE)) {
                GroupListViewModel groupListViewModel2 = groupListViewModel;
                PatchProxy.accessDispatch(new Object[]{list}, groupListViewModel2, GroupListViewModel.f51658a, false, 52339, new Class[]{List.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(list, "contactList");
                List mutableList = CollectionsKt.toMutableList((Collection<? extends T>) groupListViewModel.d());
                for (IMContact iMContact : list) {
                    if (mutableList.contains(iMContact)) {
                        mutableList.remove(iMContact);
                    } else {
                        mutableList.add(iMContact);
                    }
                }
                groupListViewModel.o.postValue(mutableList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (r0 == null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51483a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 52113(0xcb91, float:7.3026E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51483a
            r5 = 0
            r6 = 52113(0xcb91, float:7.3026E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.a()
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x007c
            java.lang.String r1 = "key_select_mode"
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r9.m = r1
            java.lang.String r1 = "key_selected_contact"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof java.util.LinkedHashSet
            r3 = 0
            if (r2 != 0) goto L_0x0043
            r1 = r3
        L_0x0043:
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            r9.n = r1
            java.lang.String r1 = "key_number_limit"
            r2 = 10
            int r1 = r0.getInt(r1, r2)
            r9.f51486d = r1
            java.lang.String r1 = "share_struct"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct
            if (r2 != 0) goto L_0x005c
            r1 = r3
        L_0x005c:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = (com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r1
            r9.f51484b = r1
            java.lang.String r1 = "share_content"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent
            if (r2 != 0) goto L_0x006b
            r1 = r3
        L_0x006b:
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = (com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent) r1
            r9.f51485c = r1
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r9.f51485c
            java.lang.String r2 = "forward_origin_msgid"
            long r2 = r0.getLong(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent.wrapForward(r1, r2)
            if (r0 != 0) goto L_0x0088
        L_0x007c:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment r0 = (com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment) r0
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0088
            r0.finish()
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment.a():void");
    }

    public final void b(@Nullable List<? extends IMContact> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51483a, false, 52120, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51483a, false, 52120, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.b(list);
        SearchHeadListView searchHeadListView = (SearchHeadListView) a((int) C0906R.id.cle);
        Intrinsics.checkExpressionValueIsNotNull(searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(8);
    }

    public final /* synthetic */ BaseMemberListViewModel a(LifecycleOwner lifecycleOwner) {
        GroupListViewModel groupListViewModel;
        ViewModel viewModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f51483a, false, 52112, new Class[]{LifecycleOwner.class}, GroupListViewModel.class)) {
            groupListViewModel = (GroupListViewModel) PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f51483a, false, 52112, new Class[]{LifecycleOwner.class}, GroupListViewModel.class);
        } else {
            Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
            Function1 bVar = new b(this);
            Class cls = GroupListViewModel.class;
            if (lifecycleOwner2 instanceof Fragment) {
                ViewModelProvider of = ViewModelProviders.of((Fragment) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
                viewModel = of.get(name, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                bVar.invoke(viewModel);
            } else if (lifecycleOwner2 instanceof FragmentActivity) {
                ViewModelProvider of2 = ViewModelProviders.of((FragmentActivity) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name2 = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name2, "viewModelClass.java.name");
                viewModel = of2.get(name2, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                bVar.invoke(viewModel);
            } else {
                throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
            }
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "when (lifecycleOwner) {\n…)\n            }\n        }");
            groupListViewModel = (GroupListViewModel) viewModel;
        }
        return groupListViewModel;
    }

    public final void a(@Nullable List<? extends IMContact> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51483a, false, 52121, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51483a, false, 52121, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (((GroupListViewModel) o()).b()) {
            super.a(list);
        } else if (list != null) {
            for (IMContact a2 : list) {
                com.ss.android.ugc.aweme.im.sdk.share.b.a(getContext(), a2, ((GroupListViewModel) o()).f51660b, ((GroupListViewModel) o()).f51661c, (com.ss.android.ugc.aweme.base.a<Boolean>) new c<Boolean>(this));
            }
        }
    }
}
