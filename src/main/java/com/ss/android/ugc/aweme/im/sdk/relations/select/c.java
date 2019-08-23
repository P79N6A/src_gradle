package com.ss.android.ugc.aweme.im.sdk.relations.select;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment;
import com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment;
import com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment;
import com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment;
import com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/select/SelectMemberFragmentFactory;", "", "()V", "getSelectMemberFragment", "Landroid/support/v4/app/Fragment;", "memberListType", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52234a;

    @NotNull
    public final Fragment a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52234a, false, 53001, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52234a, false, 53001, new Class[]{Integer.TYPE}, Fragment.class);
        }
        switch (i) {
            case 0:
                return new GroupCreateFragment();
            case 1:
                return new RelationMemberSelectFragment();
            case 2:
            case 3:
                return new GroupListFragment();
            case 4:
                return new GroupMemberAddFragment();
            case 5:
                return new GroupMemberRemoveFragment();
            case 6:
                return new AtMemberFragment();
            default:
                return new GroupCreateFragment();
        }
    }
}
