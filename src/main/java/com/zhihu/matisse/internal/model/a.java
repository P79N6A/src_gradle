package com.zhihu.matisse.internal.model;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.R;
import com.zhihu.matisse.internal.a.b;
import com.zhihu.matisse.internal.entity.IncapableCause;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.entity.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Set<c> f82669a;

    /* renamed from: b  reason: collision with root package name */
    public int f82670b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f82671c;

    public final List<c> b() {
        return new ArrayList(this.f82669a);
    }

    public final int f() {
        return this.f82669a.size();
    }

    public final boolean e() {
        if (this.f82669a.size() == g()) {
            return true;
        }
        return false;
    }

    private int g() {
        d a2 = d.a();
        if (a2.g > 0) {
            return a2.g;
        }
        if (this.f82670b == 1) {
            return a2.h;
        }
        if (this.f82670b == 2) {
            return a2.i;
        }
        return a2.g;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList(this.f82669a));
        bundle.putInt("state_collection_type", this.f82670b);
        return bundle;
    }

    public final List<Uri> c() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f82669a) {
            arrayList.add(cVar.f82643c);
        }
        return arrayList;
    }

    public final List<String> d() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f82669a) {
            arrayList.add(b.a(this.f82671c, cVar.f82643c));
        }
        return arrayList;
    }

    public a(Context context) {
        this.f82671c = context;
    }

    public final boolean c(c cVar) {
        return this.f82669a.contains(cVar);
    }

    public final void b(Bundle bundle) {
        bundle.putParcelableArrayList("state_selection", new ArrayList(this.f82669a));
        bundle.putInt("state_collection_type", this.f82670b);
    }

    public final int e(c cVar) {
        int indexOf = new ArrayList(this.f82669a).indexOf(cVar);
        if (indexOf == -1) {
            return Integer.MIN_VALUE;
        }
        return indexOf + 1;
    }

    private boolean f(c cVar) {
        if (!d.a().f82647b || ((!cVar.a() || (this.f82670b != 2 && this.f82670b != 3)) && (!cVar.c() || (this.f82670b != 1 && this.f82670b != 3)))) {
            return false;
        }
        return true;
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            this.f82669a = new LinkedHashSet();
            return;
        }
        this.f82669a = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
        this.f82670b = bundle.getInt("state_collection_type", 0);
    }

    public final boolean a(c cVar) {
        if (!f(cVar)) {
            boolean add = this.f82669a.add(cVar);
            if (add) {
                if (this.f82670b == 0) {
                    if (cVar.a()) {
                        this.f82670b = 1;
                    } else if (cVar.c()) {
                        this.f82670b = 2;
                    }
                } else if (this.f82670b == 1) {
                    if (cVar.c()) {
                        this.f82670b = 3;
                    }
                } else if (this.f82670b == 2 && cVar.a()) {
                    this.f82670b = 3;
                }
            }
            return add;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    public final boolean b(c cVar) {
        boolean remove = this.f82669a.remove(cVar);
        if (remove) {
            boolean z = false;
            if (this.f82669a.size() == 0) {
                this.f82670b = 0;
            } else if (this.f82670b == 3) {
                boolean z2 = false;
                for (c next : this.f82669a) {
                    if (next.a() && !z) {
                        z = true;
                    }
                    if (next.c() && !z2) {
                        z2 = true;
                    }
                }
                if (z && z2) {
                    this.f82670b = 3;
                } else if (z) {
                    this.f82670b = 1;
                } else if (z2) {
                    this.f82670b = 2;
                }
            }
        }
        return remove;
    }

    public final IncapableCause d(c cVar) {
        String str;
        boolean z = true;
        if (e()) {
            int g = g();
            try {
                str = this.f82671c.getResources().getQuantityString(R.plurals.matisse_error_over_count, g, new Object[]{Integer.valueOf(g)});
            } catch (Resources.NotFoundException unused) {
                str = this.f82671c.getString(C0906R.string.bah, new Object[]{Integer.valueOf(g)});
            } catch (NoClassDefFoundError unused2) {
                str = this.f82671c.getString(C0906R.string.bah, new Object[]{Integer.valueOf(g)});
            }
            return new IncapableCause(str);
        } else if (f(cVar)) {
            return new IncapableCause(this.f82671c.getString(C0906R.string.bam));
        } else {
            Context context = this.f82671c;
            if (context != null) {
                ContentResolver contentResolver = context.getContentResolver();
                Iterator<com.zhihu.matisse.b> it2 = d.a().f82646a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().checkType(contentResolver, cVar.f82643c)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                return new IncapableCause(context.getString(C0906R.string.baf));
            }
            if (d.a().j != null) {
                for (com.zhihu.matisse.b.a a2 : d.a().j) {
                    IncapableCause a3 = a2.a(context, cVar);
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            return null;
        }
    }
}
