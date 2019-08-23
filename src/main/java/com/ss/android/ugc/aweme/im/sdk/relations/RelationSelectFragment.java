package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.utils.k;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.b;
import com.ss.android.ugc.aweme.im.service.c.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.LinkedHashSet;

public class RelationSelectFragment extends AmeBaseFragment implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52006a;

    /* renamed from: b  reason: collision with root package name */
    c f52007b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.a<Boolean> f52008c;

    /* renamed from: d  reason: collision with root package name */
    private View f52009d;

    /* renamed from: e  reason: collision with root package name */
    private b f52010e;

    /* renamed from: f  reason: collision with root package name */
    private IShareService.ShareStruct f52011f;
    private LinkedHashSet<IMContact> g;
    private boolean h;
    private BaseContent i;
    private boolean j;

    public final RecyclerView a(Context context) {
        return null;
    }

    public final Fragment b() {
        return this;
    }

    public final View b(Context context) {
        return null;
    }

    public final void e() {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f52006a, false, 52720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52006a, false, 52720, new Class[0], Void.TYPE);
            return;
        }
        if (this.f52010e != null) {
            this.f52010e.b();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f52006a, false, 52721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52006a, false, 52721, new Class[0], Void.TYPE);
            return;
        }
        if (this.f52007b != null) {
            this.f52007b.l();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f52006a, false, 52713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52006a, false, 52713, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f52007b != null) {
            this.f52007b.g();
        }
        c();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f52006a, false, 52714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52006a, false, 52714, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f52010e != null) {
            b bVar = this.f52010e;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f52110b, false, 52697, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f52110b, false, 52697, new Class[0], Void.TYPE);
            } else if (bVar.f52111c != null) {
                bVar.f52111c.b();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f52006a, false, 52712, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f52006a, false, 52712, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f52006a, false, 52715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52006a, false, 52715, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f52006a, false, 52716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52006a, false, 52716, new Class[0], Void.TYPE);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f52011f = (IShareService.ShareStruct) arguments.getSerializable("share_struct");
                if (this.f52011f != null) {
                    z.a().a(this.f52011f, (IMContact) null, true);
                }
                this.i = (BaseContent) arguments.getSerializable("share_content");
                BaseContent.wrapForward(this.i, arguments.getLong("forward_origin_msgid"));
                this.h = arguments.getBoolean("extra_no_title");
                this.g = (LinkedHashSet) arguments.getSerializable("key_selected_contact");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f52006a, false, 52717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52006a, false, 52717, new Class[0], Void.TYPE);
            return;
        }
        if (this.j) {
            this.f52007b = new a(getContext(), this.f52009d, this.h);
        } else {
            this.f52007b = new c(getContext(), this.f52009d, this.h);
        }
        this.f52007b.v = this.f52008c;
        this.f52007b.a(this.f52011f);
        this.f52007b.k = this.i;
        this.f52007b.a(this.g);
        this.f52010e = new b(this.f52007b);
        if (this.f52011f != null) {
            this.f52010e.a(2);
        } else {
            this.f52010e.a(1);
        }
        b bVar = this.f52010e;
        boolean z = this.j;
        if (bVar.f52111c != null) {
            bVar.f52111c.g = z;
        }
        b bVar2 = this.f52010e;
        boolean a2 = k.a(this.f52011f);
        if (bVar2.f52111c != null) {
            bVar2.f52111c.h = a2;
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f52006a, false, 52711, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f52006a, false, 52711, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        b abInterface = ((IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class)).getAbInterface();
        if (m.b()) {
            this.j = false;
        } else {
            this.j = abInterface.c();
        }
        if (this.j) {
            this.f52009d = layoutInflater.inflate(C0906R.layout.rw, viewGroup2, false);
        } else {
            this.f52009d = layoutInflater.inflate(C0906R.layout.rv, viewGroup2, false);
        }
        return this.f52009d;
    }
}
