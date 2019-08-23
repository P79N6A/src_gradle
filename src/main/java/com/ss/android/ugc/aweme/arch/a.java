package com.ss.android.ugc.aweme.arch;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.util.List;

public final class a<T> implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34338a;

    /* renamed from: b  reason: collision with root package name */
    protected c<T> f34339b;

    /* renamed from: c  reason: collision with root package name */
    protected DataCenter f34340c;

    /* renamed from: d  reason: collision with root package name */
    private C0022a<T> f34341d;

    /* renamed from: com.ss.android.ugc.aweme.arch.a$a  reason: collision with other inner class name */
    public interface C0022a<T> {
        c<T> a(View view);

        void a();

        String b();

        String c();

        String d();

        DataCenter e();
    }

    public a(@NonNull C0022a<T> aVar) {
        this.f34340c = aVar.e();
        this.f34341d = aVar;
    }

    private boolean a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f34338a, false, 23755, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f34338a, false, 23755, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj2 instanceof Integer) {
            if (((Integer) obj2).intValue() == 1) {
                return true;
            }
            return false;
        } else if (obj2 instanceof Boolean) {
            return ((Boolean) obj2).booleanValue();
        } else {
            return false;
        }
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f34338a, false, 23752, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f34338a, false, 23752, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
        } else if (this.f34339b != null && aVar != null && !TextUtils.isEmpty(aVar.f34376a)) {
            String str = aVar.f34376a;
            if (TextUtils.equals(str, this.f34341d.c())) {
                if (aVar.a() != 0) {
                    this.f34339b.b();
                }
            } else if (TextUtils.equals(str, this.f34341d.d())) {
                if (aVar.a() != 0) {
                }
            } else if (TextUtils.equals(str, this.f34341d.b())) {
                b bVar = (b) this.f34340c.a(this.f34341d.b());
                int intValue = ((Integer) bVar.a("action_type")).intValue();
                if (intValue == 1) {
                    this.f34339b.a((List) bVar.a("list_data"), a(bVar.a("list_hasmore")));
                } else if (intValue == 2) {
                    this.f34339b.b((List) bVar.a("list_data"), a(bVar.a("list_hasmore")));
                }
            }
        }
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f34338a, false, 23751, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f34338a, false, 23751, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f34338a, false, 23754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34338a, false, 23754, new Class[0], Void.TYPE);
        } else {
            if (this.f34340c == null) {
                this.f34340c = this.f34341d.e();
            }
            if (this.f34340c != null) {
                if (!TextUtils.isEmpty(this.f34341d.b())) {
                    this.f34340c.a(this.f34341d.b(), (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
                }
                if (!TextUtils.isEmpty(this.f34341d.c())) {
                    this.f34340c.a(this.f34341d.c(), (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
                }
                if (!TextUtils.isEmpty(this.f34341d.d())) {
                    this.f34340c.a(this.f34341d.d(), (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f34338a, false, 23753, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f34338a, false, 23753, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f34339b = this.f34341d.a(view);
        }
        this.f34341d.a();
    }
}
