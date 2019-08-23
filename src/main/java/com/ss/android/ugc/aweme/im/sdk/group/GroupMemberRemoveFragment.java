package com.ss.android.ugc.aweme.im.sdk.group;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0016\u0010\u0018\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupMemberRemoveFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "()V", "mConversationId", "", "createViewModel", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "enableSingleSelect", "", "getLeftIcon", "", "isMultiSelect", "getTitle", "initParams", "", "initViewModel", "kickOutGroupLog", "contactList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "onTitlebarRightClick", "removeMember", "showRemoveMemberDialog", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupMemberRemoveFragment extends BaseSelectFragment<GroupMemberListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51511a;

    /* renamed from: b  reason: collision with root package name */
    public String f51512b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f51513c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<GroupMemberListViewModel, GroupMemberListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GroupMemberRemoveFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GroupMemberRemoveFragment groupMemberRemoveFragment) {
            super(1);
            this.this$0 = groupMemberRemoveFragment;
        }

        @NotNull
        public final GroupMemberListViewModel invoke(@NotNull GroupMemberListViewModel groupMemberListViewModel) {
            if (PatchProxy.isSupport(new Object[]{groupMemberListViewModel}, this, changeQuickRedirect, false, 52210, new Class[]{GroupMemberListViewModel.class}, GroupMemberListViewModel.class)) {
                return (GroupMemberListViewModel) PatchProxy.accessDispatch(new Object[]{groupMemberListViewModel}, this, changeQuickRedirect, false, 52210, new Class[]{GroupMemberListViewModel.class}, GroupMemberListViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(groupMemberListViewModel, "$receiver");
            groupMemberListViewModel.i = this.this$0.k;
            groupMemberListViewModel.f51666b = this.this$0.f51512b;
            return groupMemberListViewModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/GroupMemberRemoveFragment$removeMember$2", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "", "Lcom/bytedance/im/core/model/Member;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.im.core.a.a.b<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupMemberRemoveFragment f51515b;

        b(GroupMemberRemoveFragment groupMemberRemoveFragment) {
            this.f51515b = groupMemberRemoveFragment;
        }

        public final void a(@Nullable j jVar) {
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f51514a, false, 52212, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f51514a, false, 52212, new Class[]{j.class}, Void.TYPE);
                return;
            }
            this.f51515b.s();
            if (this.f51515b.getContext() != null) {
                Context context = this.f51515b.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                com.ss.android.ugc.aweme.im.sdk.group.b.b.a(context, jVar);
            }
        }

        public final /* synthetic */ void a(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f51514a, false, 52211, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51514a, false, 52211, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f51515b.s();
            FragmentActivity activity = this.f51515b.getActivity();
            if (activity != null) {
                activity.setResult(221);
            }
            FragmentActivity activity2 = this.f51515b.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupMemberRemoveFragment f51517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51518c;

        c(GroupMemberRemoveFragment groupMemberRemoveFragment, List list) {
            this.f51517b = groupMemberRemoveFragment;
            this.f51518c = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51516a, false, 52213, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51516a, false, 52213, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(this.f51517b.getContext(), this.f51517b.f51512b, new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51519a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f51520b;

                {
                    this.f51520b = r1;
                }

                public final void run() {
                    boolean z;
                    boolean z2;
                    if (PatchProxy.isSupport(new Object[0], this, f51519a, false, 52214, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51519a, false, 52214, new Class[0], Void.TYPE);
                        return;
                    }
                    GroupMemberRemoveFragment groupMemberRemoveFragment = this.f51520b.f51517b;
                    List<IMContact> list = this.f51520b.f51518c;
                    if (PatchProxy.isSupport(new Object[]{list}, groupMemberRemoveFragment, GroupMemberRemoveFragment.f51511a, false, 52206, new Class[]{List.class}, Void.TYPE)) {
                        GroupMemberRemoveFragment groupMemberRemoveFragment2 = groupMemberRemoveFragment;
                        PatchProxy.accessDispatch(new Object[]{list}, groupMemberRemoveFragment2, GroupMemberRemoveFragment.f51511a, false, 52206, new Class[]{List.class}, Void.TYPE);
                        return;
                    }
                    groupMemberRemoveFragment.r();
                    if (PatchProxy.isSupport(new Object[]{list}, groupMemberRemoveFragment, GroupMemberRemoveFragment.f51511a, false, 52207, new Class[]{List.class}, Void.TYPE)) {
                        GroupMemberRemoveFragment groupMemberRemoveFragment3 = groupMemberRemoveFragment;
                        PatchProxy.accessDispatch(new Object[]{list}, groupMemberRemoveFragment3, GroupMemberRemoveFragment.f51511a, false, 52207, new Class[]{List.class}, Void.TYPE);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (IMContact iMContact : list) {
                            if (iMContact instanceof IMUser) {
                                IMUser iMUser = (IMUser) iMContact;
                                CharSequence uid = iMUser.getUid();
                                if (uid == null || uid.length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    sb.append(iMUser.getUid());
                                    sb.append(",");
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        CharSequence charSequence = sb2;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            int length = sb2.length() - 1;
                            if (sb2 != null) {
                                String substring = sb2.substring(0, length);
                                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                z.a().f(groupMemberRemoveFragment.f51512b, substring);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    a a2 = a.f51529e.a();
                    String str = groupMemberRemoveFragment.f51512b;
                    Iterable<IMContact> iterable = list;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (IMContact iMContact2 : iterable) {
                        if (iMContact2 != null) {
                            arrayList.add((IMUser) iMContact2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        }
                    }
                    a2.a(str, (List) arrayList, (com.bytedance.im.core.a.a.b<List<m>>) new b<List<m>>(groupMemberRemoveFragment));
                }
            });
        }
    }

    public final int a(boolean z) {
        return 2130841646;
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51511a, false, 52208, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51511a, false, 52208, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f51513c == null) {
            this.f51513c = new HashMap();
        }
        View view = (View) this.f51513c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f51513c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51511a, false, 52209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51511a, false, 52209, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51513c != null) {
            this.f51513c.clear();
        }
    }

    public final boolean h() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51511a, false, 52202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51511a, false, 52202, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        ((GroupMemberListViewModel) o()).a(3);
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f51511a, false, 52203, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51511a, false, 52203, new Class[0], String.class);
        }
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        String string = context.getResources().getString(C0906R.string.az0);
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…itle_delete_group_member)");
        return string;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f51511a, false, 52204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51511a, false, 52204, new Class[0], Void.TYPE);
            return;
        }
        List list = (List) ((GroupMemberListViewModel) o()).o.getValue();
        if (list != null) {
            Intrinsics.checkExpressionValueIsNotNull(list, "this");
            if (PatchProxy.isSupport(new Object[]{list}, this, f51511a, false, 52205, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f51511a, false, 52205, new Class[]{List.class}, Void.TYPE);
            } else {
                if (getContext() != null) {
                    new a.C0185a(getContext()).b((int) C0906R.string.au2).e(C0906R.style.kx).b((int) C0906R.string.apk, (DialogInterface.OnClickListener) null).a((int) C0906R.string.aqb, (DialogInterface.OnClickListener) new c(this, list)).a().a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51511a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 52201(0xcbe9, float:7.3149E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51511a
            r5 = 0
            r6 = 52201(0xcbe9, float:7.3149E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.a()
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = "key_member_list_type"
            int r1 = r0.getInt(r1)
            r9.k = r1
            java.lang.String r1 = "session_id"
            java.lang.String r1 = r0.getString(r1)
            r9.f51512b = r1
            if (r0 != 0) goto L_0x004c
        L_0x0040:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment r0 = (com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment) r0
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x004c
            r0.finish()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment.a():void");
    }

    public final /* synthetic */ BaseMemberListViewModel a(LifecycleOwner lifecycleOwner) {
        GroupMemberListViewModel groupMemberListViewModel;
        ViewModel viewModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f51511a, false, 52200, new Class[]{LifecycleOwner.class}, GroupMemberListViewModel.class)) {
            groupMemberListViewModel = (GroupMemberListViewModel) PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f51511a, false, 52200, new Class[]{LifecycleOwner.class}, GroupMemberListViewModel.class);
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
}
