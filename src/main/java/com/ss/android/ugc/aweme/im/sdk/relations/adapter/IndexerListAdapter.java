package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class IndexerListAdapter extends AbsRelationListAdapter implements SectionIndexer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52070a;
    public SectionIndexer o;
    public a p = new a();

    public class HeaderViewHolder extends AbsRelationListAdapter.ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f52071a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f52072b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f52073c;

        /* renamed from: d  reason: collision with root package name */
        public String f52074d;
    }

    public Object[] getSections() {
        if (PatchProxy.isSupport(new Object[0], this, f52070a, false, 52846, new Class[0], Object[].class)) {
            return (Object[]) PatchProxy.accessDispatch(new Object[0], this, f52070a, false, 52846, new Class[0], Object[].class);
        } else if (this.o != null) {
            return this.o.getSections();
        } else {
            return new String[]{" "};
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f52070a, false, 52843, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52070a, false, 52843, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f52050e != null) {
            return this.f52050e.size() + c();
        } else {
            return c();
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52844, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52844, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (b(i)) {
            return 1;
        } else {
            return super.getItemViewType(i - c());
        }
    }

    public int getPositionForSection(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52847, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52847, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.o != null) {
            return this.o.getPositionForSection(i);
        } else {
            return -1;
        }
    }

    public int getSectionForPosition(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52848, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52848, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.o != null) {
            return this.o.getSectionForPosition(i);
        } else {
            return -1;
        }
    }

    public final String a(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, f52070a, false, 52850, new Class[]{IMContact.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iMContact}, this, f52070a, false, 52850, new Class[]{IMContact.class}, String.class);
        }
        IMUser a2 = e.a(iMContact);
        if (a2 == null) {
            return null;
        }
        if (TextUtils.isEmpty(a2.getRemarkName()) || TextUtils.isEmpty(a2.getNickName())) {
            return a2.getSignature();
        }
        return GlobalContext.getContext().getString(C0906R.string.avn, new Object[]{a2.getNickName()});
    }

    public final a c(int i) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52849, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52070a, false, 52849, new Class[]{Integer.TYPE}, a.class);
        } else if (this.p.f52071a == i) {
            return this.p;
        } else {
            this.p.f52071a = i;
            int sectionForPosition = getSectionForPosition(i);
            if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i) {
                this.p.f52072b = false;
                this.p.f52074d = null;
            } else {
                this.p.f52072b = true;
                this.p.f52074d = (String) getSections()[sectionForPosition];
            }
            a aVar = this.p;
            if (getPositionForSection(sectionForPosition + 1) - 1 != i) {
                z = false;
            }
            aVar.f52073c = z;
            return this.p;
        }
    }

    @NonNull
    /* renamed from: a */
    public AbsRelationListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f52070a, false, 52841, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class)) {
            return new HeaderViewHolder(this.i);
        }
        return (AbsRelationListAdapter.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f52070a, false, 52841, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class);
    }

    /* renamed from: a */
    public final void onBindViewHolder(@NonNull AbsRelationListAdapter.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f52070a, false, 52842, new Class[]{AbsRelationListAdapter.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f52070a, false, 52842, new Class[]{AbsRelationListAdapter.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (!b(i)) {
            int c2 = i - c();
            viewHolder.a((IMContact) this.f52050e.get(c2), c2);
        }
    }
}
