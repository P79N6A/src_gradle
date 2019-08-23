package com.ss.android.ugc.aweme.im.sdk.group;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/AtMemberFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "()V", "mConversationId", "", "createViewModel", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "enableMultiSelect", "", "getLeftIcon", "", "isMultiSelect", "getTitle", "initParams", "", "initViewModel", "onMemberSelected", "selectList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AtMemberFragment extends BaseSelectFragment<GroupMemberListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51469a;

    /* renamed from: b  reason: collision with root package name */
    public String f51470b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f51471c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<GroupMemberListViewModel, GroupMemberListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AtMemberFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AtMemberFragment atMemberFragment) {
            super(1);
            this.this$0 = atMemberFragment;
        }

        @NotNull
        public final GroupMemberListViewModel invoke(@NotNull GroupMemberListViewModel groupMemberListViewModel) {
            if (PatchProxy.isSupport(new Object[]{groupMemberListViewModel}, this, changeQuickRedirect, false, 52086, new Class[]{GroupMemberListViewModel.class}, GroupMemberListViewModel.class)) {
                return (GroupMemberListViewModel) PatchProxy.accessDispatch(new Object[]{groupMemberListViewModel}, this, changeQuickRedirect, false, 52086, new Class[]{GroupMemberListViewModel.class}, GroupMemberListViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(groupMemberListViewModel, "$receiver");
            groupMemberListViewModel.i = this.this$0.k;
            groupMemberListViewModel.f51666b = this.this$0.f51470b;
            return groupMemberListViewModel;
        }
    }

    public final int a(boolean z) {
        return 2130840083;
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51469a, false, 52084, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51469a, false, 52084, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f51471c == null) {
            this.f51471c = new HashMap();
        }
        View view = (View) this.f51471c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f51471c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean c() {
        return false;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51469a, false, 52085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51469a, false, 52085, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51471c != null) {
            this.f51471c.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51469a, false, 52081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51469a, false, 52081, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        ((GroupMemberListViewModel) o()).a(2);
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f51469a, false, 52083, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51469a, false, 52083, new Class[0], String.class);
        }
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        String string = context.getResources().getString(C0906R.string.ayz);
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…im_title_at_group_member)");
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51469a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 52080(0xcb70, float:7.298E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51469a
            r5 = 0
            r6 = 52080(0xcb70, float:7.298E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.a()
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = "session_id"
            java.lang.String r1 = r0.getString(r1)
            r9.f51470b = r1
            if (r0 != 0) goto L_0x004f
        L_0x0038:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment r0 = (com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment) r0
            android.support.v4.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0046
            r2 = 223(0xdf, float:3.12E-43)
            r1.setResult(r2)
        L_0x0046:
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x004f
            r0.finish()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment.a():void");
    }

    public final /* synthetic */ BaseMemberListViewModel a(LifecycleOwner lifecycleOwner) {
        GroupMemberListViewModel groupMemberListViewModel;
        ViewModel viewModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f51469a, false, 52079, new Class[]{LifecycleOwner.class}, GroupMemberListViewModel.class)) {
            groupMemberListViewModel = (GroupMemberListViewModel) PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f51469a, false, 52079, new Class[]{LifecycleOwner.class}, GroupMemberListViewModel.class);
        } else {
            Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
            Function1 aVar = new a(this);
            Class cls = GroupMemberListViewModel.class;
            if (lifecycleOwner2 instanceof Fragment) {
                ViewModelProvider of = ViewModelProviders.of((Fragment) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
                viewModel = of.get(name, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                aVar.invoke(viewModel);
            } else if (lifecycleOwner2 instanceof FragmentActivity) {
                ViewModelProvider of2 = ViewModelProviders.of((FragmentActivity) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name2 = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name2, "viewModelClass.java.name");
                viewModel = of2.get(name2, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                aVar.invoke(viewModel);
            } else {
                throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
            }
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "when (lifecycleOwner) {\n…)\n            }\n        }");
            groupMemberListViewModel = (GroupMemberListViewModel) viewModel;
        }
        return groupMemberListViewModel;
    }

    public final void a(@Nullable List<? extends IMContact> list) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list}, this, f51469a, false, 52082, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51469a, false, 52082, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        if (!z) {
            Intent intent = new Intent();
            Object first = CollectionsKt.first(list);
            if (first != null) {
                intent.putExtra("key_at_member", (IMUser) first);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(223, intent);
                }
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
    }
}
