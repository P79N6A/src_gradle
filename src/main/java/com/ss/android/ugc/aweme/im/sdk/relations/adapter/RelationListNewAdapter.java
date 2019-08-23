package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.ss.android.ugc.aweme.im.sdk.utils.ax;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class RelationListNewAdapter extends AbsRelationListAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52085a;

    public class ViewHolderWithTag extends AbsRelationListAdapter.ViewHolder {
        public static ChangeQuickRedirect h;
        public AvatarImageView i;
        private TextView k;
        private TextView l;
        private TextView m;
        private ImageView n;
        private ImageView o;
        private View p;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 52872, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 52872, new Class[0], Void.TYPE);
                return;
            }
            super.a();
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 52873, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 52873, new Class[0], Void.TYPE);
                return;
            }
            super.b();
            this.p = this.itemView.findViewById(C0906R.id.bbl);
            this.i = (AvatarImageView) this.itemView.findViewById(C0906R.id.i4);
            this.k = (TextView) this.itemView.findViewById(C0906R.id.bps);
            this.l = (TextView) this.itemView.findViewById(C0906R.id.czi);
            this.n = (ImageView) this.itemView.findViewById(C0906R.id.agx);
            this.m = (TextView) this.itemView.findViewById(C0906R.id.d41);
            this.o = (ImageView) this.itemView.findViewById(C0906R.id.dr5);
        }

        public ViewHolderWithTag(View view) {
            super(view);
        }

        public final void a(IMContact iMContact, int i2) {
            if (PatchProxy.isSupport(new Object[]{iMContact, Integer.valueOf(i2)}, this, h, false, 52874, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMContact, Integer.valueOf(i2)}, this, h, false, 52874, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
            } else if (iMContact.getType() != -1) {
                if (PatchProxy.isSupport(new Object[]{iMContact}, this, h, false, 52875, new Class[]{IMContact.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMContact}, this, h, false, 52875, new Class[]{IMContact.class}, Void.TYPE);
                } else {
                    if (iMContact.getType() == 2) {
                        this.m.setText(C0906R.string.awm);
                        this.m.setVisibility(0);
                        this.p.setVisibility(8);
                    } else if (iMContact.getType() == 3) {
                        this.m.setText(C0906R.string.avd);
                        this.m.setVisibility(0);
                        this.p.setVisibility(0);
                    } else {
                        this.m.setVisibility(8);
                        this.p.setVisibility(8);
                    }
                    UrlModel displayAvatar = iMContact.getDisplayAvatar();
                    if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                        c.a((RemoteImageView) this.i, 2130839027);
                    } else {
                        c.b(this.i, displayAvatar);
                    }
                    if (PatchProxy.isSupport(new Object[]{iMContact}, this, h, false, 52876, new Class[]{IMContact.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iMContact}, this, h, false, 52876, new Class[]{IMContact.class}, Void.TYPE);
                    } else {
                        IMUser a2 = e.a(iMContact);
                        ax.a(this.o, a2);
                        if (a2 != null) {
                            RelationListNewAdapter.this.a(this.k, a2, RelationListNewAdapter.this.g);
                            if (a2.getFollowStatus() == 2) {
                                int a3 = a.a().a(a2.getUid());
                                if (a3 > 1) {
                                    this.l.setText(GlobalContext.getContext().getString(C0906R.string.aze, new Object[]{a.a().a(a3)}));
                                    this.l.setVisibility(0);
                                } else if (a3 == 1) {
                                    this.l.setText(GlobalContext.getContext().getString(C0906R.string.azf));
                                    this.l.setVisibility(0);
                                } else {
                                    this.l.setVisibility(8);
                                }
                            } else {
                                this.l.setVisibility(8);
                            }
                            if (d.a(a2) || a2.getFollowStatus() != 2) {
                                this.n.setVisibility(8);
                            } else {
                                this.n.setVisibility(0);
                            }
                            z.a().g(a2.getUid(), "contact");
                        } else {
                            this.l.setVisibility(8);
                            this.n.setVisibility(8);
                            if (TextUtils.isEmpty(RelationListNewAdapter.this.g)) {
                                this.k.setText(iMContact.getDisplayName());
                            } else {
                                RelationListNewAdapter.this.a(this.k, iMContact.getDisplayName(), RelationListNewAdapter.this.g, 0);
                            }
                        }
                    }
                }
                if (PatchProxy.isSupport(new Object[0], this, h, false, 52877, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, h, false, 52877, new Class[0], Void.TYPE);
                } else if (RelationListNewAdapter.this.m != null) {
                    this.itemView.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52086a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f52086a, false, 52878, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f52086a, false, 52878, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            RelationListNewAdapter.this.m.a(ViewHolderWithTag.this.itemView, ViewHolderWithTag.this.getAdapterPosition());
                        }
                    });
                    this.i.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52088a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f52088a, false, 52879, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f52088a, false, 52879, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            RelationListNewAdapter.this.m.a(ViewHolderWithTag.this.i, ViewHolderWithTag.this.getAdapterPosition());
                        }
                    });
                }
                this.itemView.setTag(83886080, iMContact);
                this.i.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, 50331648);
                this.i.setTag(50331648, 50331649);
            }
        }
    }

    public final String a(IMContact iMContact) {
        return null;
    }

    @NonNull
    /* renamed from: a */
    public final AbsRelationListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52085a, false, 52870, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class)) {
            return (AbsRelationListAdapter.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52085a, false, 52870, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = C0906R.layout.zr;
        } else {
            i2 = C0906R.layout.y5;
        }
        return new ViewHolderWithTag(from.inflate(i2, viewGroup2, false));
    }

    /* renamed from: a */
    public final void onBindViewHolder(@NonNull AbsRelationListAdapter.ViewHolder viewHolder, int i) {
        AbsRelationListAdapter.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f52085a, false, 52871, new Class[]{AbsRelationListAdapter.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f52085a, false, 52871, new Class[]{AbsRelationListAdapter.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        viewHolder2.a((IMContact) this.f52050e.get(i2), i2);
    }
}
