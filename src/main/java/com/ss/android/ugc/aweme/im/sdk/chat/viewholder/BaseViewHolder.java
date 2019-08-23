package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.k;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.a;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.at;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.az;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public abstract class BaseViewHolder<CONTENT extends BaseContent> extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f51047c;

    /* renamed from: a  reason: collision with root package name */
    private int f51048a;

    /* renamed from: b  reason: collision with root package name */
    private int f51049b;

    /* renamed from: d  reason: collision with root package name */
    public int f51050d = 7;

    /* renamed from: e  reason: collision with root package name */
    protected View f51051e;

    /* renamed from: f  reason: collision with root package name */
    protected ImageView f51052f;
    protected DmtTextView g;
    protected String h;
    protected View i;
    protected ImageView j;
    protected CONTENT k;
    protected SystemContent l;
    protected n m;
    protected au.a n;
    protected k.a o;
    private TextView p;
    private TextView q;
    private AvatarImageView r;
    private DmtTextView s;

    public void a(View.OnLongClickListener onLongClickListener) {
        if (PatchProxy.isSupport(new Object[]{onLongClickListener}, this, f51047c, false, 51426, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener}, this, f51047c, false, 51426, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.setOnLongClickListener(onLongClickListener);
        }
        if (this.i != null) {
            this.i.setOnLongClickListener(onLongClickListener);
        }
    }

    public void a(IMUser iMUser, n nVar, int i2) {
        IMUser iMUser2 = iMUser;
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{iMUser2, nVar2, Integer.valueOf(i2)}, this, f51047c, false, 51430, new Class[]{IMUser.class, n.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser2, nVar2, Integer.valueOf(i2)}, this, f51047c, false, 51430, new Class[]{IMUser.class, n.class, Integer.TYPE}, Void.TYPE);
        } else if (iMUser2 != null) {
            if (this.r != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r.getLayoutParams();
                if (nVar.getConversationType() != d.a.f20887b || nVar.isSelf()) {
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.topMargin = this.f51048a;
                }
                this.r.setLayoutParams(layoutParams);
                this.r.setTag(67108864, String.valueOf(nVar.getSender()));
                this.r.setTag(50331648, 3);
                this.n.a(this.r);
                c.b(this.r, iMUser.getAvatarThumb());
                a.a((ImageView) this.r, iMUser);
            }
            if (this.s != null) {
                if (nVar.isSelf() || !a(nVar2)) {
                    this.s.setVisibility(8);
                } else {
                    this.s.setText(iMUser.getDisplayName());
                    this.s.setVisibility(0);
                }
            }
        }
    }

    @CallSuper
    public void a(n nVar, n nVar2, CONTENT content, int i2) {
        boolean z;
        boolean z2;
        n nVar3 = nVar;
        CONTENT content2 = content;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar2, content2, Integer.valueOf(i2)}, this, f51047c, false, 51431, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar2, content2, Integer.valueOf(i2)}, this, f51047c, false, 51431, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m = nVar3;
        this.k = content2;
        this.h = String.valueOf(nVar.getSender());
        this.f51050d = m.valueOf(nVar).getItemViewType();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
        if (i2 == 0) {
            layoutParams.setMargins(0, this.f51049b, 0, this.f51048a);
        } else {
            layoutParams.setMargins(0, this.f51048a, 0, this.f51048a);
        }
        if (this.p != null) {
            this.p.setTextColor(GlobalContext.getContext().getResources().getColor(com.ss.android.ugc.aweme.im.sdk.utils.m.b() ? C0906R.color.ani : C0906R.color.qt));
            this.p.setPadding(this.p.getPaddingLeft(), this.p.getPaddingTop(), this.p.getPaddingRight(), this.f51048a * 2);
            TextView textView = this.p;
            n nVar4 = this.m;
            n nVar5 = nVar4;
            TextView textView2 = textView;
            if (PatchProxy.isSupport(new Object[]{nVar4}, this, f51047c, false, 51434, new Class[]{n.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar5}, this, f51047c, false, 51434, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
            } else {
                z2 = nVar5.getLocalExt().containsKey("show_unread_message_tips");
            }
            textView2.setVisibility(z2 ? 0 : 8);
        }
        if (this.q != null) {
            if (nVar2 == null && this.f51050d != 9) {
                this.q.setText(a(this.itemView.getContext(), nVar.getCreatedAt()));
                this.q.setVisibility(0);
            } else if (nVar2 == null || nVar.getCreatedAt() - nVar2.getCreatedAt() < 300000) {
                this.q.setVisibility(8);
            } else {
                this.q.setText(a(this.itemView.getContext(), nVar.getCreatedAt()));
                this.q.setVisibility(0);
            }
            if (i2 == 0) {
                this.q.setPadding(this.q.getPaddingLeft(), 0, this.q.getPaddingRight(), this.q.getPaddingBottom());
            } else {
                this.q.setPadding(this.q.getPaddingLeft(), this.f51048a, this.q.getPaddingRight(), this.q.getPaddingBottom());
            }
            if (this.q.getVisibility() == 0 && this.p != null && this.p.getVisibility() == 0) {
                this.p.setPadding(this.p.getPaddingLeft(), this.p.getPaddingTop(), this.p.getPaddingRight(), 0);
            }
        }
        if (this.i != null) {
            this.i.setTag(100663296, content2);
            this.i.setTag(134217728, nVar3);
        }
        if (this.r != null) {
            this.r.setTag(134217728, nVar3);
        }
        if (this.f51051e != null) {
            if (bc.b()) {
                n nVar6 = this.m;
                if (PatchProxy.isSupport(new Object[]{nVar6, content2}, null, bc.f52548a, true, 53823, new Class[]{n.class, BaseContent.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar6, content2}, null, bc.f52548a, true, 53823, new Class[]{n.class, BaseContent.class}, Boolean.TYPE)).booleanValue();
                } else {
                    z = !nVar6.isSelf() && ad.e(nVar6) && (!(content2 instanceof TextContent) || !((TextContent) content2).isDefault());
                }
                if (z) {
                    this.f51051e.setVisibility(0);
                }
            }
            this.f51051e.setVisibility(8);
        }
        try {
            this.l = CheckMessage.getContent((CheckMessage) l.a(nVar.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class));
        } catch (Exception unused) {
            this.l = null;
        }
        if (this.g != null) {
            if (content2 != null && content.getExtContent() != null) {
                k.a(content.getExtContent(), this.g, this.o, this.h);
            } else if (this.l != null) {
                k.a(this.l, this.g, this.o, this.h);
            } else {
                this.g.setText("");
                this.g.setVisibility(8);
            }
        }
        if (!a(this.m)) {
            AvatarImageView avatarImageView = this.r;
            n nVar7 = this.m;
            if (PatchProxy.isSupport(new Object[]{avatarImageView, nVar7}, null, DebugActivity.f51303a, true, 51824, new Class[]{View.class, n.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageView, nVar7}, null, DebugActivity.f51303a, true, 51824, new Class[]{View.class, n.class}, Void.TYPE);
            } else if (nVar7 != null) {
                String conversationId = nVar7.getConversationId();
                String uuid = nVar7.getUuid();
                if (PatchProxy.isSupport(new Object[]{avatarImageView, conversationId, uuid}, null, DebugActivity.f51303a, true, 51825, new Class[]{View.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{avatarImageView, conversationId, uuid}, null, DebugActivity.f51303a, true, 51825, new Class[]{View.class, String.class, String.class}, Void.TYPE);
                } else if (com.ss.android.ugc.aweme.im.sdk.d.a.a().f3373c.f52860a && avatarImageView != null) {
                    avatarImageView.setOnLongClickListener(new View.OnLongClickListener(conversationId, uuid) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f51309a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f51310b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f51311c;

                        public final boolean onLongClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f51309a, false, 51843, new Class[]{View.class}, Boolean.TYPE)) {
                                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f51309a, false, 51843, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                            }
                            Context context = view.getContext();
                            String str = this.f51310b;
                            String str2 = this.f51311c;
                            if (PatchProxy.isSupport(new Object[]{context, str, str2}, null, DebugActivity.f51303a, true, 51826, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context, str, str2}, null, DebugActivity.f51303a, true, 51826, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
                            } else {
                                Intent intent = new Intent(context, DebugActivity.class);
                                intent.putExtra("EXTRA_CONVERSATION_ID", str);
                                intent.putExtra("EXTRA_MSG_UUID", str2);
                                context.startActivity(intent);
                            }
                            return false;
                        }

                        {
                            this.f51310b = r1;
                            this.f51311c = r2;
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        bc.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), 5, (Object) this.m);
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51047c, false, 51429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51047c, false, 51429, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51052f != null) {
            this.f51052f.setOnClickListener(new a(this));
        }
    }

    @CallSuper
    public void c() {
        GestureDetector gestureDetector;
        k.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f51047c, false, 51427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51047c, false, 51427, new Class[0], Void.TYPE);
            return;
        }
        this.f51048a = (int) UIUtils.dip2Px(this.itemView.getContext(), 10.0f);
        this.f51049b = (int) UIUtils.dip2Px(this.itemView.getContext(), 5.0f);
        this.n = au.a.h();
        au.a aVar2 = this.n;
        Context context = this.itemView.getContext();
        if (PatchProxy.isSupport(new Object[]{context}, null, az.f52525a, true, 53744, new Class[]{Context.class}, GestureDetector.class)) {
            gestureDetector = (GestureDetector) PatchProxy.accessDispatch(new Object[]{context}, null, az.f52525a, true, 53744, new Class[]{Context.class}, GestureDetector.class);
        } else {
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                public final boolean onDoubleTap(MotionEvent motionEvent) {
                    return true;
                }

                public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        aVar2.p = gestureDetector;
        int color = this.itemView.getContext().getResources().getColor(C0906R.color.tj);
        String str = this.h;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(color), str}, null, k.f50675a, true, 50422, new Class[]{Integer.TYPE, String.class}, k.a.class)) {
            aVar = (k.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(color), str}, null, k.f50675a, true, 50422, new Class[]{Integer.TYPE, String.class}, k.a.class);
        } else {
            aVar = new k.a(color, str, (byte) 0);
        }
        this.o = aVar;
        a();
        b();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51047c, false, 51428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51047c, false, 51428, new Class[0], Void.TYPE);
            return;
        }
        this.p = (TextView) a((int) C0906R.id.do7);
        this.q = (TextView) a((int) C0906R.id.bnv);
        this.r = (AvatarImageView) a((int) C0906R.id.i4);
        this.s = (DmtTextView) a((int) C0906R.id.dq2);
        this.f51051e = (View) a((int) C0906R.id.dy5);
        this.f51052f = (ImageView) a((int) C0906R.id.dy6);
        this.g = (DmtTextView) a((int) C0906R.id.brq);
    }

    public BaseViewHolder(View view) {
        super(view);
        c();
    }

    private boolean a(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f51047c, false, 51435, new Class[]{n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, this, f51047c, false, 51435, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
        } else if (nVar.getConversationType() == d.a.f20887b) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(@IdRes int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51047c, false, 51432, new Class[]{Integer.TYPE}, Object.class)) {
            return this.itemView.findViewById(i2);
        }
        return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51047c, false, 51432, new Class[]{Integer.TYPE}, Object.class);
    }

    public void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51047c, false, 51425, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51047c, false, 51425, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.setOnClickListener(onClickListener);
        }
        if (this.i != null) {
            this.i.setOnClickListener(onClickListener);
        }
    }

    private CharSequence a(Context context, long j2) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{context, new Long(j3)}, this, f51047c, false, 51433, new Class[]{Context.class, Long.TYPE}, CharSequence.class)) {
            return at.b(context, j2);
        }
        return (CharSequence) PatchProxy.accessDispatch(new Object[]{context, new Long(j3)}, this, f51047c, false, 51433, new Class[]{Context.class, Long.TYPE}, CharSequence.class);
    }
}
