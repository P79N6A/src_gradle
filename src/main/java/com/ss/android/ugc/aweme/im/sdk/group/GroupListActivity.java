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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\rH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupListActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/SelectMemberFragmentFactoryOwner;", "()V", "GROUP_FRAGMENT_TAG", "", "mFragment", "Landroid/support/v4/app/Fragment;", "selectMemberFragmentManager", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/SelectMemberFragmentFactory;", "getSelectMemberFragmentManager", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/SelectMemberFragmentFactory;", "addGroupSelectFragment", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStatusBarColor", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class GroupListActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51476a;

    /* renamed from: b  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.base.a<Boolean> f51477b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f51478c = new a((byte) 0);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final c f51479d = new c();

    /* renamed from: e  reason: collision with root package name */
    private final String f51480e = "GROUP_FRAGMENT_TAG";

    /* renamed from: f  reason: collision with root package name */
    private Fragment f51481f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0007R \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/GroupListActivity$Companion;", "", "()V", "mCallBack", "Lcom/ss/android/ugc/aweme/base/Callback;", "", "mCallBack$annotations", "startActivityForResult", "", "activity", "Landroid/app/Activity;", "memberListType", "", "bundle", "Landroid/os/Bundle;", "callback", "requestCode", "startActivty", "context", "Landroid/content/Context;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51482a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Activity activity, int i, @Nullable Bundle bundle, @Nullable com.ss.android.ugc.aweme.base.a<Boolean> aVar, int i2) {
            Activity activity2 = activity;
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), bundle2, aVar, Integer.valueOf(i2)}, this, f51482a, false, 52111, new Class[]{Activity.class, Integer.TYPE, Bundle.class, com.ss.android.ugc.aweme.base.a.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {activity2, Integer.valueOf(i), bundle2, aVar, Integer.valueOf(i2)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f51482a, false, 52111, new Class[]{Activity.class, Integer.TYPE, Bundle.class, com.ss.android.ugc.aweme.base.a.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intent intent = new Intent(activity2, GroupListActivity.class);
            intent.putExtra("key_member_list_type", i);
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            GroupListActivity.f51477b = aVar;
            activity2.startActivityForResult(intent, i2);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51476a, false, 52107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51476a, false, 52107, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51476a, false, 52108, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51476a, false, 52108, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f51476a, false, 52100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51476a, false, 52100, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51481f instanceof GroupListFragment) {
            Fragment fragment = this.f51481f;
            if (fragment == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment");
            } else if (!((GroupListFragment) fragment).p()) {
                super.onBackPressed();
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51476a, false, 52098, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51476a, false, 52098, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bs);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[0], this, f51476a, false, 52099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51476a, false, 52099, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fm.beginTransaction()");
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(this.f51480e);
            if (findFragmentByTag == null) {
                GroupListActivity groupListActivity = this;
                findFragmentByTag = groupListActivity.f51479d.a(groupListActivity.getIntent().getIntExtra("key_member_list_type", 5));
            }
            this.f51481f = findFragmentByTag;
            Fragment fragment = this.f51481f;
            if (fragment != null) {
                Intent intent = getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                fragment.setArguments(intent.getExtras());
                beginTransaction.replace(C0906R.id.afi, fragment, this.f51480e).commitAllowingStateLoss();
            }
            if (this.f51481f instanceof GroupListFragment) {
                Fragment fragment2 = this.f51481f;
                if (fragment2 != null) {
                    ((GroupListFragment) fragment2).f51487e = f51477b;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment");
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f51476a, false, 52101, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f51476a, false, 52101, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f51481f;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent2);
        }
    }
}
