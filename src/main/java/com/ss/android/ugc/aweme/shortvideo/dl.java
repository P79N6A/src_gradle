package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem;

public class dl {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66767a;

    /* renamed from: b  reason: collision with root package name */
    Fragment f66768b;

    /* renamed from: c  reason: collision with root package name */
    Activity f66769c;

    /* renamed from: d  reason: collision with root package name */
    public PermissionSettingItem f66770d;

    /* renamed from: e  reason: collision with root package name */
    int f66771e;

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f66767a, false, 74264, new Class[0], Integer.TYPE)) {
            return this.f66770d.getPermission();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66767a, false, 74264, new Class[0], Integer.TYPE)).intValue();
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f66767a, false, 74267, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f66767a, false, 74267, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        a(bundle2.getInt("permission"));
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66767a, false, 74263, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66767a, false, 74263, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f66770d.setPermission(i);
    }

    public final void a(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f66767a, false, 74262, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f66767a, false, 74262, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        this.f66770d.setPermission(intent2.getIntExtra("extra.PERMISSION", 0));
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f66767a, false, 74266, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f66767a, false, 74266, new Class[]{Bundle.class}, Void.TYPE);
        } else if (c.a()) {
            bundle2.putInt("permission", a.L.a(e.a.PrivateAvailable) ? 1 : 0);
        } else {
            bundle2.putInt("permission", a());
        }
    }

    public final void a(final dk dkVar) {
        if (PatchProxy.isSupport(new Object[]{dkVar}, this, f66767a, false, 74260, new Class[]{dk.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dkVar}, this, f66767a, false, 74260, new Class[]{dk.class}, Void.TYPE);
            return;
        }
        this.f66770d.a(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66772a;

            public final void onClick(View view) {
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f66772a, false, 74268, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f66772a, false, 74268, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                PublishPermissionActivity.a(dl.this.f66768b, dl.this.f66771e, dl.this.f66770d.getPermission(), C0906R.string.afe, C0906R.string.afd, 2);
                t tVar = new t();
                if (dl.this.f66771e == 5) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                r.onEvent(MobClick.obtain().setEventName("scope_click").setLabelName("edit_page").setJsonObject(tVar.a("is_photo", str).a()));
            }
        });
        if (com.ss.android.g.a.b() && !a.L.a(e.a.PrivateAvailable)) {
            this.f66770d.setVisibility(8);
        }
    }

    public dl(Activity activity, PermissionSettingItem permissionSettingItem, int i) {
        this.f66769c = activity;
        this.f66770d = permissionSettingItem;
        this.f66771e = i;
    }

    private dl(Fragment fragment, PermissionSettingItem permissionSettingItem, int i) {
        this.f66768b = fragment;
        this.f66770d = permissionSettingItem;
        this.f66771e = i;
    }

    public static dl a(Fragment fragment, PermissionSettingItem permissionSettingItem, int i) {
        Fragment fragment2 = fragment;
        PermissionSettingItem permissionSettingItem2 = permissionSettingItem;
        if (!PatchProxy.isSupport(new Object[]{fragment2, permissionSettingItem2, 0}, null, f66767a, true, 74258, new Class[]{Fragment.class, PermissionSettingItem.class, Integer.TYPE}, dl.class)) {
            return new dl(fragment2, permissionSettingItem2, 0);
        }
        return (dl) PatchProxy.accessDispatch(new Object[]{fragment2, permissionSettingItem2, 0}, null, f66767a, true, 74258, new Class[]{Fragment.class, PermissionSettingItem.class, Integer.TYPE}, dl.class);
    }
}
