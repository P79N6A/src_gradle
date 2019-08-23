package com.ss.android.ugc.aweme.im.sdk.relations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment;
import com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment;
import com.ss.android.ugc.aweme.im.sdk.relations.select.c;
import com.ss.android.ugc.aweme.im.service.IIMService;
import org.jetbrains.annotations.NotNull;

public class RelationSelectActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52003a;

    /* renamed from: c  reason: collision with root package name */
    private static a<Boolean> f52004c;

    /* renamed from: b  reason: collision with root package name */
    private Fragment f52005b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f52003a, false, 52708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52003a, false, 52708, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52003a, false, 52709, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52003a, false, 52709, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    @NotNull
    private c b() {
        if (!PatchProxy.isSupport(new Object[0], this, f52003a, false, 52707, new Class[0], c.class)) {
            return new c();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f52003a, false, 52707, new Class[0], c.class);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f52003a, false, 52706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52003a, false, 52706, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (this.f52005b instanceof GroupCreateFragment) {
            overridePendingTransition(C0906R.anim.n, C0906R.anim.s);
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52003a, false, 52703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52003a, false, 52703, new Class[0], Void.TYPE);
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.f52005b = supportFragmentManager.findFragmentByTag("member_fragment_tag");
        if (this.f52005b == null) {
            this.f52005b = b().a(getIntent().getIntExtra("key_member_list_type", 0));
            this.f52005b.setArguments(getIntent().getExtras());
            if (this.f52005b instanceof RelationMemberSelectFragment) {
                ((RelationMemberSelectFragment) this.f52005b).f51995d = f52004c;
            } else if (this.f52005b instanceof GroupCreateFragment) {
                overridePendingTransition(C0906R.anim.r, C0906R.anim.n);
            }
        }
        beginTransaction.replace(C0906R.id.afi, this.f52005b, "member_fragment_tag").commitAllowingStateLoss();
    }

    public void onBackPressed() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f52003a, false, 52704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52003a, false, 52704, new Class[0], Void.TYPE);
            return;
        }
        if (this.f52005b instanceof RelationSelectFragment) {
            RelationSelectFragment relationSelectFragment = (RelationSelectFragment) this.f52005b;
            if (PatchProxy.isSupport(new Object[0], relationSelectFragment, RelationSelectFragment.f52006a, false, 52719, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], relationSelectFragment, RelationSelectFragment.f52006a, false, 52719, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (relationSelectFragment.f52007b != null) {
                if (PatchProxy.isSupport(new Object[0], relationSelectFragment, RelationSelectFragment.f52006a, false, 52718, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], relationSelectFragment, RelationSelectFragment.f52006a, false, 52718, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    if (relationSelectFragment.getActivity() != null) {
                        int height = relationSelectFragment.getActivity().getWindow().getDecorView().getHeight();
                        Rect rect = new Rect();
                        relationSelectFragment.getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        if (height - rect.bottom != 0) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (!z) {
                    relationSelectFragment.f52007b.k();
                    z2 = true;
                }
            }
            if (!z2) {
                super.onBackPressed();
                return;
            }
        }
        if ((this.f52005b instanceof GroupCreateFragment) && !((GroupCreateFragment) this.f52005b).p()) {
            super.onBackPressed();
        } else if (!(this.f52005b instanceof RelationMemberSelectFragment) || ((RelationMemberSelectFragment) this.f52005b).p()) {
            if ((this.f52005b instanceof GroupMemberAddFragment) && !((GroupMemberAddFragment) this.f52005b).p()) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f52003a, false, 52701, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f52003a, false, 52701, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.dt);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (((IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class)).getAbInterface().e()) {
            a();
        } else {
            Intent intent = getIntent();
            if (intent == null || intent.getIntExtra("key_member_list_type", 0) != 4) {
                if (PatchProxy.isSupport(new Object[0], this, f52003a, false, 52702, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52003a, false, 52702, new Class[0], Void.TYPE);
                } else {
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                    this.f52005b = supportFragmentManager.findFragmentByTag("relation_fragment_tag");
                    if (this.f52005b == null) {
                        this.f52005b = new RelationSelectFragment();
                        this.f52005b.setArguments(getIntent().getExtras());
                    }
                    if (this.f52005b instanceof RelationSelectFragment) {
                        ((RelationSelectFragment) this.f52005b).f52008c = f52004c;
                    }
                    beginTransaction.replace(C0906R.id.afi, this.f52005b, "relation_fragment_tag").commitAllowingStateLoss();
                }
            } else {
                a();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onCreate", false);
    }

    public static void a(Activity activity, Bundle bundle, int i) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2, Integer.valueOf(i)}, null, f52003a, true, 52700, new Class[]{Activity.class, Bundle.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2, Integer.valueOf(i)}, null, f52003a, true, 52700, new Class[]{Activity.class, Bundle.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, RelationSelectActivity.class);
        intent.putExtras(bundle2);
        activity2.startActivityForResult(intent, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f52003a, false, 52705, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f52003a, false, 52705, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.f52005b != null) {
            int i3 = i;
            int i4 = i2;
            this.f52005b.onActivityResult(i, i2, intent2);
        }
    }

    public static void a(Context context, Bundle bundle, a<Boolean> aVar) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, bundle2, aVar}, null, f52003a, true, 52699, new Class[]{Context.class, Bundle.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bundle2, aVar}, null, f52003a, true, 52699, new Class[]{Context.class, Bundle.class, a.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, RelationSelectActivity.class);
        if (bundle2 != null) {
            intent.putExtra("key_member_list_type", 1);
            intent.putExtras(bundle2);
        } else {
            intent.putExtra("key_member_list_type", 0);
        }
        f52004c = aVar;
        context2.startActivity(intent);
    }
}
