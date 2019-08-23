package com.ss.android.ugc.aweme.im.sdk.relations;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.a;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationModel;
import java.util.Observable;
import java.util.Observer;

public final class b extends a<c> implements Observer {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52110b;

    /* renamed from: c  reason: collision with root package name */
    public RelationModel f52111c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52110b, false, 52692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52110b, false, 52692, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f52111c = new RelationModel(this);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52110b, false, 52696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52110b, false, 52696, new Class[0], Void.TYPE);
            return;
        }
        if (this.f22837a != null) {
            ((c) this.f22837a).m();
        }
        if (this.f52111c != null) {
            this.f52111c.b();
            this.f52111c.a();
        }
    }

    public b(c cVar) {
        super(cVar);
    }

    public final void a(int i) {
        if (this.f52111c != null) {
            this.f52111c.f52186f = i;
        }
    }

    public final void update(Observable observable, Object obj) {
        if (PatchProxy.isSupport(new Object[]{observable, obj}, this, f52110b, false, 52698, new Class[]{Observable.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observable, obj}, this, f52110b, false, 52698, new Class[]{Observable.class, Object.class}, Void.TYPE);
            return;
        }
        if (observable.equals(this.f52111c)) {
            Integer num = (Integer) obj;
            if (num.intValue() == 0 || num.intValue() == -1) {
                ((c) this.f22837a).a(this.f52111c.f52183c);
            } else if (num.intValue() == 1) {
                ((c) this.f22837a).a(this.f52111c.f52184d, this.f52111c.f52185e);
            }
        }
    }
}
