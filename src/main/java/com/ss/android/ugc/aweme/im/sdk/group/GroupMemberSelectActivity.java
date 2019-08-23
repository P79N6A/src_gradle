package com.ss.android.ugc.aweme.im.sdk.group;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.im.sdk.relations.select.c;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\rH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupMemberSelectActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/SelectMemberFragmentFactoryOwner;", "()V", "GROUP_MEMBER_FRAGMENT_TAG", "", "mFragment", "Landroid/support/v4/app/Fragment;", "selectMemberFragmentManager", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/SelectMemberFragmentFactory;", "getSelectMemberFragmentManager", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/SelectMemberFragmentFactory;", "addMemberSelectFragment", "", "finish", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStatusBarColor", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupMemberSelectActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51521a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f51522b = new a((byte) 0);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final c f51523c = new c();

    /* renamed from: d  reason: collision with root package name */
    private final String f51524d = "GROUP_MEMBER_FRAGMENT_TAG";

    /* renamed from: e  reason: collision with root package name */
    private Fragment f51525e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J,\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupMemberSelectActivity$Companion;", "", "()V", "startActivity", "", "context", "Landroid/content/Context;", "memberListType", "", "conversationId", "", "startActivityForResult", "activity", "Landroid/app/Activity;", "requestCode", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51526a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Activity activity, int i, @Nullable String str, int i2) {
            Activity activity2 = activity;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f51526a, false, 52227, new Class[]{Activity.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f51526a, false, 52227, new Class[]{Activity.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intent intent = new Intent(activity2, GroupMemberSelectActivity.class);
            intent.putExtra("key_member_list_type", i);
            if (str2 != null) {
                intent.putExtra("session_id", str2);
            }
            activity2.startActivityForResult(intent, i2);
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51521a, false, 52224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51521a, false, 52224, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51521a, false, 52225, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51521a, false, 52225, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f51521a, false, 52217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51521a, false, 52217, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (this.f51525e instanceof AtMemberFragment) {
            overridePendingTransition(C0906R.anim.n, C0906R.anim.s);
        }
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f51521a, false, 52218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51521a, false, 52218, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51525e instanceof AtMemberFragment) {
            Fragment fragment = this.f51525e;
            if (fragment == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment");
            } else if (!((AtMemberFragment) fragment).p()) {
                super.onBackPressed();
            }
        }
        if (this.f51525e instanceof GroupMemberRemoveFragment) {
            Fragment fragment2 = this.f51525e;
            if (fragment2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment");
            } else if (!((GroupMemberRemoveFragment) fragment2).p()) {
                super.onBackPressed();
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51521a, false, 52215, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51521a, false, 52215, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bt);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[0], this, f51521a, false, 52216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51521a, false, 52216, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fm.beginTransaction()");
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(this.f51524d);
            if (findFragmentByTag == null) {
                GroupMemberSelectActivity groupMemberSelectActivity = this;
                findFragmentByTag = groupMemberSelectActivity.f51523c.a(groupMemberSelectActivity.getIntent().getIntExtra("key_member_list_type", 5));
            }
            this.f51525e = findFragmentByTag;
            Fragment fragment = this.f51525e;
            if (fragment != null) {
                Intent intent = getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                fragment.setArguments(intent.getExtras());
                beginTransaction.replace(C0906R.id.afi, fragment, this.f51524d).commitAllowingStateLoss();
            }
            if (this.f51525e instanceof AtMemberFragment) {
                overridePendingTransition(C0906R.anim.r, C0906R.anim.n);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f51521a, false, 52219, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f51521a, false, 52219, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f51525e;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent2);
        }
    }
}
