package com.ss.android.ugc.aweme.im.sdk.module.session;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.session.a;
import com.ss.android.ugc.aweme.story.api.b.b;
import java.util.HashMap;
import org.greenrobot.eventbus.c;

public class SessionListAdapter extends BaseAdapter<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51842a;

    /* renamed from: c  reason: collision with root package name */
    private static final int f51843c = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 8.0f));

    /* renamed from: b  reason: collision with root package name */
    public boolean f51844b;

    /* renamed from: d  reason: collision with root package name */
    private View f51845d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f51846e = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51848a;

        public final void onClick(View view) {
            boolean z;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f51848a, false, 52409, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f51848a, false, 52409, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Object tag = view2.getTag(C0906R.id.l);
            if (tag != null) {
                int intValue = ((Integer) tag).intValue();
                if (SessionListAdapter.this.mItems != null && SessionListAdapter.this.mItems.size() > intValue) {
                    a aVar = (a) SessionListAdapter.this.mItems.get(intValue);
                    Object tag2 = view2.getTag(C0906R.id.k);
                    if (tag2 != null && aVar != null) {
                        if (aVar.r == null) {
                            aVar.r = new HashMap<>();
                        }
                        aVar.r.put("position", String.valueOf(intValue));
                        if (aVar.u != null) {
                            switch (((Integer) tag2).intValue()) {
                                case BaseLoginOrRegisterActivity.o:
                                    aVar.u.a(view.getContext(), aVar, 1);
                                    break;
                                case 102:
                                    if (aVar instanceof com.ss.android.ugc.aweme.im.sdk.module.session.a.a) {
                                        IMUser b2 = e.a().b(String.valueOf(com.bytedance.im.core.d.e.a(aVar.O_())));
                                        if (b2 != null && b2.isHasUnreadStory()) {
                                            Object tag3 = view2.getTag(C0906R.id.i);
                                            if (tag3 instanceof b) {
                                                if (!((b) tag3).b()) {
                                                    b2.setHasUnreadStory(false);
                                                    e.a().a(b2, true);
                                                }
                                                return;
                                            }
                                        }
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    aVar.u.a(view.getContext(), aVar, 2);
                                    break;
                            }
                        }
                        z = true;
                        if (aVar.b() == 20 && com.ss.android.ugc.aweme.im.sdk.group.b.a.a(aVar.O_())) {
                            z = false;
                        }
                        if (z && !(aVar instanceof com.ss.android.ugc.aweme.im.sdk.module.session.a.b)) {
                            aVar.m = 0;
                        }
                        SessionListAdapter sessionListAdapter = SessionListAdapter.this;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue)}, sessionListAdapter, SessionListAdapter.f51842a, false, 52405, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            SessionListAdapter sessionListAdapter2 = sessionListAdapter;
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue)}, sessionListAdapter2, SessionListAdapter.f51842a, false, 52405, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        sessionListAdapter.notifyItemChanged(intValue + sessionListAdapter.a());
                    }
                }
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private View.OnLongClickListener f51847f = new View.OnLongClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51850a;

        public final boolean onLongClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f51850a, false, 52410, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f51850a, false, 52410, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            if (((Integer) view2.getTag(C0906R.id.k)).intValue() == 101) {
                a aVar = (a) SessionListAdapter.this.mItems.get(((Integer) view2.getTag(C0906R.id.l)).intValue());
                if (!(aVar == null || aVar.u == null)) {
                    aVar.u.a(view.getContext(), aVar, 0);
                }
            }
            return true;
        }
    };

    public class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public final int a() {
        if (this.f51845d == null) {
            return 0;
        }
        return 1;
    }

    public SessionListAdapter() {
        this.mTextColor = ContextCompat.getColor(GlobalContext.getContext(), C0906R.color.rq);
        setLoadEmptyTextResId(C0906R.string.aul);
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f51842a, false, 52408, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51842a, false, 52408, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mItems == null || this.mItems.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f51842a, false, 52402, new Class[0], Integer.TYPE)) {
            return super.getBasicItemCount() + a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51842a, false, 52402, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f51842a, false, 52401, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f51842a, false, 52401, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!view.equals(this.f51845d)) {
            this.f51845d = view;
        }
        notifyDataSetChanged();
    }

    private boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51842a, false, 52403, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51842a, false, 52403, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i < a()) {
            return true;
        } else {
            return false;
        }
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51842a, false, 52400, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51842a, false, 52400, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (a(i)) {
            return 200;
        } else {
            return super.getBasicItemViewType(i);
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f51842a, false, 52406, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f51842a, false, 52406, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof SessionListViewHolder) {
            SessionListViewHolder sessionListViewHolder = (SessionListViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], sessionListViewHolder, SessionListViewHolder.f3385b, false, 52456, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], sessionListViewHolder, SessionListViewHolder.f3385b, false, 52456, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(sessionListViewHolder.f3388d) && !c.a().b((Object) sessionListViewHolder)) {
                c.a().a((Object) sessionListViewHolder);
            }
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f51842a, false, 52407, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f51842a, false, 52407, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder2 instanceof SessionListViewHolder) {
            SessionListViewHolder sessionListViewHolder = (SessionListViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], sessionListViewHolder, SessionListViewHolder.f3385b, false, 52457, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], sessionListViewHolder, SessionListViewHolder.f3385b, false, 52457, new Class[0], Void.TYPE);
                return;
            }
            if (c.a().b((Object) sessionListViewHolder)) {
                c.a().c(sessionListViewHolder);
            }
            if (sessionListViewHolder.f3387c != null) {
                sessionListViewHolder.f3387c.a();
            }
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f51842a, false, 52398, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f51842a, false, 52398, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (a(i)) {
            if (bc.b()) {
                z.a(1, "show");
            }
        } else {
            int a2 = i - a();
            ((SessionListViewHolder) viewHolder).a((a) this.mItems.get(a2), a2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.itemView.getLayoutParams();
            int i3 = marginLayoutParams.leftMargin;
            if (a2 == 0) {
                i2 = f51843c;
            }
            marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f51842a, false, 52399, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f51842a, false, 52399, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 200 && this.f51845d != null) {
            return new HeaderViewHolder(this.f51845d);
        } else {
            if (com.ss.android.ugc.aweme.im.sdk.d.a.a().e().showNewStyle()) {
                return new SessionListNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0l, viewGroup, false), this.f51846e, this.f51847f);
            }
            return new SessionListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0j, viewGroup, false), this.f51846e, this.f51847f);
        }
    }
}
