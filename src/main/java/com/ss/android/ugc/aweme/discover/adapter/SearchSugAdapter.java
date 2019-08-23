package com.ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.mob.a.b;
import com.ss.android.ugc.aweme.discover.mob.a.c;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.following.ui.adapter.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.u.s;
import java.util.ArrayList;
import java.util.List;

public class SearchSugAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41881a;

    /* renamed from: b  reason: collision with root package name */
    public String f41882b;

    /* renamed from: c  reason: collision with root package name */
    public ak.d f41883c;

    /* renamed from: d  reason: collision with root package name */
    private List<SearchSugEntity> f41884d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private FragmentActivity f41885e;

    /* renamed from: f  reason: collision with root package name */
    private SearchIntermediateViewModel f41886f;

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f41881a, false, 35906, new Class[0], Integer.TYPE)) {
            return this.f41884d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41881a, false, 35906, new Class[0], Integer.TYPE)).intValue();
    }

    public SearchSugAdapter(@NonNull FragmentActivity fragmentActivity) {
        this.f41885e = fragmentActivity;
        this.f41886f = (SearchIntermediateViewModel) ViewModelProviders.of(this.f41885e).get(SearchIntermediateViewModel.class);
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41881a, false, 35904, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41881a, false, 35904, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f41884d == null || !this.f41884d.get(i).isUserType()) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void a(List<SearchSugEntity> list) {
        List<SearchSugEntity> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f41881a, false, 35905, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f41881a, false, 35905, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list == null) {
            list2 = new ArrayList<>();
        } else {
            list2 = list;
        }
        if (this.f41884d == null) {
            this.f41884d = new ArrayList();
        }
        this.f41884d.clear();
        this.f41884d.addAll(list2);
    }

    public final boolean a(User user) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user}, this, f41881a, false, 35907, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f41881a, false, 35907, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        }
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        new s(str).b("search_sug").c("follow_button").g("follow_button").f("search_sug").h(user.getUid()).k(this.f41882b).e();
        return true;
    }

    public final void a(User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f41881a, false, 35908, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f41881a, false, 35908, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        k.b(i, (String) this.f41886f.getSearchKeyword().getValue(), 6, this.f41882b, user.getUid(), "");
        UserProfileActivity.b(this.f41885e, user, "search_sug");
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f41881a, false, 35902, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f41881a, false, 35902, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            return SearchUserViewHolder.a(viewGroup, this);
        } else {
            return new SearchSugViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0d, viewGroup, false), this.f41883c);
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41881a, false, 35903, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41881a, false, 35903, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i2) == 1) {
            ((SearchUserViewHolder) viewHolder).a(this.f41884d.get(i2).sugUser);
        } else {
            SearchSugViewHolder searchSugViewHolder = (SearchSugViewHolder) viewHolder;
            SearchSugEntity searchSugEntity = this.f41884d.get(i2);
            String str = this.f41882b;
            if (PatchProxy.isSupport(new Object[]{searchSugEntity, str, Integer.valueOf(i)}, searchSugViewHolder, SearchSugViewHolder.f41887a, false, 35909, new Class[]{SearchSugEntity.class, String.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {searchSugEntity, str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = SearchSugViewHolder.f41887a;
                SearchSugViewHolder searchSugViewHolder2 = searchSugViewHolder;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, searchSugViewHolder2, changeQuickRedirect2, false, 35909, new Class[]{SearchSugEntity.class, String.class, Integer.TYPE}, Void.TYPE);
            } else if (searchSugEntity != null) {
                searchSugViewHolder.mSugView.setText(com.ss.android.ugc.aweme.base.utils.a.a(searchSugViewHolder.itemView.getContext(), searchSugEntity.content, searchSugEntity.position));
                searchSugViewHolder.itemView.setOnTouchListener(new ai(searchSugEntity, str, i2) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41890a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ SearchSugEntity f41891b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ String f41892c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ int f41893d;

                    public final void b(View view, MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41890a, false, 35912, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41890a, false, 35912, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                        } else if (System.currentTimeMillis() - SearchSugViewHolder.this.f41888b >= 500) {
                            SearchSugViewHolder searchSugViewHolder = SearchSugViewHolder.this;
                            SearchSugEntity searchSugEntity = this.f41891b;
                            if (PatchProxy.isSupport(new Object[]{searchSugEntity}, searchSugViewHolder, SearchSugViewHolder.f41887a, false, 35911, new Class[]{SearchSugEntity.class}, Void.TYPE)) {
                                SearchSugViewHolder searchSugViewHolder2 = searchSugViewHolder;
                                PatchProxy.accessDispatch(new Object[]{searchSugEntity}, searchSugViewHolder2, SearchSugViewHolder.f41887a, false, 35911, new Class[]{SearchSugEntity.class}, Void.TYPE);
                            } else {
                                new b().a(searchSugEntity.mWord).a(searchSugEntity.extraParam).e();
                            }
                            SearchSugViewHolder.this.f41888b = System.currentTimeMillis();
                            if (SearchSugViewHolder.this.f41889c != null && !this.f41891b.isUserType()) {
                                SearchSugViewHolder.this.f41889c.a(this.f41891b, this.f41892c, this.f41893d);
                            }
                        }
                    }

                    {
                        this.f41891b = r2;
                        this.f41892c = r3;
                        this.f41893d = r4;
                    }
                });
                if (PatchProxy.isSupport(new Object[]{searchSugEntity}, searchSugViewHolder, SearchSugViewHolder.f41887a, false, 35910, new Class[]{SearchSugEntity.class}, Void.TYPE)) {
                    SearchSugViewHolder searchSugViewHolder3 = searchSugViewHolder;
                    PatchProxy.accessDispatch(new Object[]{searchSugEntity}, searchSugViewHolder3, SearchSugViewHolder.f41887a, false, 35910, new Class[]{SearchSugEntity.class}, Void.TYPE);
                    return;
                }
                if (!searchSugEntity.isMobShow) {
                    searchSugEntity.isMobShow = true;
                    new c().a(searchSugEntity.mWord).a(searchSugEntity.extraParam).e();
                }
            }
        }
    }
}
