package com.ss.android.ugc.aweme.favorites.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.favorites.ui.ChallengeCollectListFragment;
import com.ss.android.ugc.aweme.favorites.ui.MusicCollectListFragment;
import com.ss.android.ugc.aweme.favorites.ui.StickersCollectListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eg;
import java.util.ArrayList;
import java.util.List;

public class UserFavoritesPagerAdapter extends ProfileFragmentAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44261a;
    private static final String m = ("android:switcher:" + C0906R.id.duu + ":");

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<Fragment> f44262b = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private Context f44263f;
    private AwemeListFragment g;
    private ProfileListFragment h;
    private ProfileListFragment i;
    private ChallengeCollectListFragment j;
    private MusicCollectListFragment k;
    private StickersCollectListFragment l;
    private List<Integer> n;

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f44261a, false, 39419, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f44261a, false, 39419, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (int i3 = 0; i3 < getCount(); i3++) {
            if (getItem(i3) instanceof ProfileListFragment) {
                ProfileListFragment profileListFragment = (ProfileListFragment) getItem(i3);
                if (!(profileListFragment == null || profileListFragment.getFragmentManager() == null)) {
                    if (i3 == i2) {
                        profileListFragment.setUserVisibleHint(true);
                    } else {
                        profileListFragment.setUserVisibleHint(false);
                    }
                    profileListFragment.l();
                }
            }
        }
    }

    public UserFavoritesPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.f44263f = context;
        this.f44262b = new ArrayList<>();
        this.n = new ArrayList();
        this.g = (AwemeListFragment) fragmentManager.findFragmentByTag(m + 0);
        if (this.g == null) {
            this.g = AwemeListFragment.a((int) this.f44263f.getResources().getDimension(C0906R.dimen.lv), 4, d.a().getCurUserId(), c.d().getCurUser().getSecUid(), false, true);
        }
        this.g.u = true;
        this.g.f3789f = true;
        this.g.k = eg.a(8);
        this.j = (ChallengeCollectListFragment) fragmentManager.findFragmentByTag(m + 3);
        if (this.j == null) {
            this.j = new ChallengeCollectListFragment();
        }
        this.k = (MusicCollectListFragment) fragmentManager.findFragmentByTag(m + 4);
        if (this.k == null) {
            this.k = new MusicCollectListFragment();
        }
        this.f44262b.add(this.g);
        this.n.add(8);
        if (!a.a()) {
            this.h = (ProfileListFragment) fragmentManager.findFragmentByTag(m + 1);
            if (this.h == null) {
                this.h = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createCollectPoiFragment();
            }
            this.f44262b.add(this.h);
            this.n.add(9);
        }
        if (!a.a() && AbTestManager.a().aV()) {
            this.i = (ProfileListFragment) fragmentManager.findFragmentByTag(m + 2);
            if (this.i == null) {
                this.i = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createCollectGoodsFragment();
            }
            this.f44262b.add(this.i);
            this.n.add(19);
        }
        this.f44262b.add(this.j);
        this.f44262b.add(this.k);
        this.n.add(10);
        this.n.add(11);
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().showStickerCollection()) {
            this.l = (StickersCollectListFragment) fragmentManager.findFragmentByTag(m + 5);
            if (this.l == null) {
                this.l = new StickersCollectListFragment();
            }
            this.f44262b.add(this.l);
            this.n.add(16);
        }
        a(this.f44262b, this.n);
    }
}
