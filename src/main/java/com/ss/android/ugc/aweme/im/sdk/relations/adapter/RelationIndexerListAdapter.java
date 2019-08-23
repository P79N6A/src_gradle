package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.feedupdate.a;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter;
import com.ss.android.ugc.aweme.im.sdk.utils.ax;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class RelationIndexerListAdapter extends IndexerListAdapter {
    public static ChangeQuickRedirect q;

    public class NewRelationViewHolder extends AbsRelationListAdapter.ViewHolder {
        public static ChangeQuickRedirect h;
        public AvatarImageView i;
        public RemoteImageView j;
        private TextView l;
        private TextView m;
        private TextView n;
        private TextView o;
        private TextView p;
        private ImageView q;
        private ImageView r;
        private View s;
        private LinearLayout t;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 52862, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 52862, new Class[0], Void.TYPE);
                return;
            }
            this.s = this.itemView.findViewById(C0906R.id.bbl);
            this.t = (LinearLayout) this.itemView.findViewById(C0906R.id.d3v);
            this.n = (TextView) this.itemView.findViewById(C0906R.id.d41);
            this.r = (ImageView) this.itemView.findViewById(C0906R.id.au2);
            this.p = (TextView) this.itemView.findViewById(C0906R.id.au4);
            this.i = (AvatarImageView) this.itemView.findViewById(C0906R.id.i4);
            this.q = (ImageView) this.itemView.findViewById(C0906R.id.dr5);
            this.l = (TextView) this.itemView.findViewById(C0906R.id.bps);
            this.m = (TextView) this.itemView.findViewById(C0906R.id.czi);
            this.o = (TextView) this.itemView.findViewById(C0906R.id.a49);
            this.j = (RemoteImageView) this.itemView.findViewById(C0906R.id.s4);
        }

        public NewRelationViewHolder(View view) {
            super(view);
        }

        public final void a(IMContact iMContact, int i2) {
            if (PatchProxy.isSupport(new Object[]{iMContact, Integer.valueOf(i2)}, this, h, false, 52863, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMContact, Integer.valueOf(i2)}, this, h, false, 52863, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
            } else if (iMContact.getType() != -1) {
                if (PatchProxy.isSupport(new Object[0], this, h, false, 52866, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, h, false, 52866, new Class[0], Void.TYPE);
                } else if (RelationIndexerListAdapter.this.m != null) {
                    this.itemView.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52079a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f52079a, false, 52867, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f52079a, false, 52867, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            RelationIndexerListAdapter.this.m.a(NewRelationViewHolder.this.itemView, NewRelationViewHolder.this.getAdapterPosition());
                        }
                    });
                    this.i.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52081a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f52081a, false, 52868, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f52081a, false, 52868, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            RelationIndexerListAdapter.this.m.a(NewRelationViewHolder.this.i, NewRelationViewHolder.this.getAdapterPosition());
                        }
                    });
                    this.j.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52083a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f52083a, false, 52869, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f52083a, false, 52869, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            RelationIndexerListAdapter.this.m.a(NewRelationViewHolder.this.j, NewRelationViewHolder.this.getAdapterPosition());
                        }
                    });
                }
                if (PatchProxy.isSupport(new Object[]{iMContact, Integer.valueOf(i2)}, this, h, false, 52864, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMContact, Integer.valueOf(i2)}, this, h, false, 52864, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
                } else {
                    this.r.setVisibility(8);
                    if (iMContact.getType() == 6 || iMContact.getType() == 5) {
                        if (iMContact.getType() == 5) {
                            this.t.setVisibility(0);
                            this.n.setText(C0906R.string.avj);
                            this.r.setVisibility(0);
                            this.s.setVisibility(8);
                        } else {
                            this.t.setVisibility(8);
                            this.s.setVisibility(8);
                        }
                        this.p.setVisibility(8);
                    } else if (iMContact.getType() == 0 || iMContact.getType() == 3) {
                        if (iMContact.getType() != 3 || !TextUtils.isEmpty(RelationIndexerListAdapter.this.g)) {
                            this.t.setVisibility(8);
                            this.s.setVisibility(8);
                        } else {
                            this.t.setVisibility(0);
                            this.n.setText(C0906R.string.avi);
                            this.r.setVisibility(8);
                            this.s.setVisibility(0);
                        }
                        if (RelationIndexerListAdapter.this.f52048c != 1) {
                            IndexerListAdapter.a c2 = RelationIndexerListAdapter.this.c(i2);
                            if (c2 != null) {
                                if (!TextUtils.isEmpty(c2.f52074d)) {
                                    this.p.setText(c2.f52074d);
                                    this.p.setVisibility(0);
                                } else {
                                    this.p.setVisibility(8);
                                }
                            }
                        } else {
                            this.p.setVisibility(8);
                        }
                    }
                    if (i2 == 0) {
                        this.n.setText("");
                        this.r.setVisibility(8);
                    }
                    UrlModel displayAvatar = iMContact.getDisplayAvatar();
                    if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                        c.a((RemoteImageView) this.i, 2130839027);
                    } else {
                        c.b(this.i, displayAvatar);
                    }
                    bc.a(this.j, 4);
                    if (PatchProxy.isSupport(new Object[]{iMContact}, this, h, false, 52865, new Class[]{IMContact.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iMContact}, this, h, false, 52865, new Class[]{IMContact.class}, Void.TYPE);
                    } else {
                        IMUser a2 = e.a(iMContact);
                        ax.a(this.q, a2);
                        if (a2 != null) {
                            RelationIndexerListAdapter.this.a(this.l, a2, RelationIndexerListAdapter.this.g);
                            RelationIndexerListAdapter.this.b(this.o, a2, RelationIndexerListAdapter.this.g);
                            int a3 = a.a().a(a2.getUid());
                            if (a3 > 1) {
                                this.m.setText(GlobalContext.getContext().getString(C0906R.string.aze, new Object[]{a.a().a(a3)}));
                                this.m.setVisibility(0);
                            } else if (a3 == 1) {
                                this.m.setText(GlobalContext.getContext().getString(C0906R.string.azf));
                                this.m.setVisibility(0);
                            } else {
                                this.m.setVisibility(8);
                            }
                            com.ss.android.ugc.aweme.im.sdk.utils.a.a((ImageView) this.i, a2);
                            z.a().g(a2.getUid(), "contact");
                        } else {
                            this.m.setVisibility(8);
                            this.o.setVisibility(8);
                            if (TextUtils.isEmpty(RelationIndexerListAdapter.this.g)) {
                                this.l.setText(iMContact.getDisplayName());
                            } else {
                                RelationIndexerListAdapter.this.a(this.l, iMContact.getDisplayName(), RelationIndexerListAdapter.this.g, 0);
                            }
                        }
                    }
                }
                this.j.setTag(83886080, iMContact);
                this.itemView.setTag(83886080, iMContact);
                this.i.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, 50331648);
                this.j.setTag(50331648, 100663296);
                this.i.setTag(50331648, 50331649);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final AbsRelationListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, q, false, 52861, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class)) {
            return (AbsRelationListAdapter.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, q, false, 52861, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class);
        } else if (i == 1 && this.i != null) {
            return super.onCreateViewHolder(viewGroup, i);
        } else {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                i2 = C0906R.layout.y3;
            } else {
                i2 = C0906R.layout.y5;
            }
            return new NewRelationViewHolder(from.inflate(i2, viewGroup, false));
        }
    }
}
