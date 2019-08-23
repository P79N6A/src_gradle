package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncAdapter;
import com.ss.android.ugc.aweme.shortvideo.adapter.a;
import com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel;
import com.ss.android.ugc.aweme.shortvideo.util.ac;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.Subscribe;

public class bs extends aw {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3871b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f3872c;

    /* renamed from: d  reason: collision with root package name */
    private PublishSyncAdapter f3873d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3874e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f3875f = ((DmtTextView) this.f3872c.findViewById(C0906R.id.dk7));

    public int getSaveUploadType() {
        return 0;
    }

    public void setSaveLocalEnabled(boolean z) {
    }

    public void setSyncIconSize(int i) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3871b, false, 73222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3871b, false, 73222, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f3871b, false, 73227, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3871b, false, 73227, new Class[0], String.class);
        } else if (this.f3873d == null) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder("");
            Set<Integer> set = this.f3873d.f65461b;
            if (this.f3874e) {
                for (Integer intValue : set) {
                    sb.append(intValue.intValue());
                    sb.append(";");
                }
            }
            SharePrefCache.inst().isPublishSyncToHuoshan().a(Boolean.valueOf(set.contains(0)));
            SharePrefCache.inst().isPublishSyncToToutiao().a(Boolean.valueOf(set.contains(1)));
            SharePrefCache.inst().isFirstPublishSync().a(Boolean.FALSE);
            return sb.toString();
        }
    }

    private List<VideoPublishSyncModel> getSyncData() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3871b, false, 73228, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f3871b, false, 73228, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (((Boolean) SharePrefCache.inst().isSyncToHuoshan().c()).booleanValue()) {
            arrayList.add(new VideoPublishSyncModel(0, getContext().getString(C0906R.string.an4), 2130838993));
        }
        if (AbTestManager.a().bi()) {
            if (PatchProxy.isSupport(new Object[]{arrayList}, this, f3871b, false, 73229, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{arrayList}, this, f3871b, false, 73229, new Class[]{List.class}, Void.TYPE);
            } else if (!c.a().b().isSecret()) {
                boolean booleanValue = g.b().bq().booleanValue();
                boolean a2 = ac.a();
                if (((Integer) SharePrefCache.inst().getSyncTT().c()).intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!booleanValue || !a2 ? !((!booleanValue || a2) && (booleanValue || !a2 || !z)) : z) {
                    z2 = true;
                }
                if (z2) {
                    arrayList.add(new VideoPublishSyncModel(1, getContext().getString(C0906R.string.co8), 2130839403));
                    this.f3875f.setText(C0906R.string.bte);
                }
            }
        } else if (((Boolean) SharePrefCache.inst().getIsTargetBindingUser().c()).booleanValue() || ((Integer) SharePrefCache.inst().getSyncTT().c()).intValue() == 1) {
            arrayList.add(new VideoPublishSyncModel(1, getContext().getString(C0906R.string.co8), 2130839403));
        }
        return arrayList;
    }

    public void setSyncShareViewTitle(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3871b, false, 73224, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3871b, false, 73224, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f3875f != null) {
            this.f3875f.setText(str);
        }
    }

    public bs(Context context) {
        super(context);
        bg.c(this);
        this.f3872c = (LinearLayout) LayoutInflater.from(context).inflate(C0906R.layout.arf, this, true);
        RecyclerView recyclerView = (RecyclerView) this.f3872c.findViewById(C0906R.id.cyj);
        List<VideoPublishSyncModel> syncData = getSyncData();
        this.f3874e = true ^ syncData.isEmpty();
        if (this.f3874e) {
            this.f3872c.setVisibility(0);
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
            recyclerView.addItemDecoration(new PublishSyncView$1(this));
            this.f3873d = new PublishSyncAdapter(syncData);
            recyclerView.setAdapter(this.f3873d);
            return;
        }
        this.f3872c.setVisibility(8);
    }

    @Subscribe
    public void onPublishSyncEvent(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3871b, false, 73230, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3871b, false, 73230, new Class[]{a.class}, Void.TYPE);
        } else if (aVar2.f65498b == 1 && "action_bind_toutiao".equals(aVar2.f65497a) && getFragment() != null) {
        }
    }

    public void setSyncShareViewTextColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3871b, false, 73226, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3871b, false, 73226, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3875f != null) {
            this.f3875f.setTextColor(i);
        }
    }

    public void setSyncShareViewTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3871b, false, 73225, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3871b, false, 73225, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3875f != null) {
            this.f3875f.setTextSize(f2);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        boolean z;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f3871b, false, 73223, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f3871b, false, 73223, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i3 == 2 && i4 == -1 && intent2 != null) {
            if (intent2.getIntExtra("extra.PERMISSION", 0) != 0 || getSyncData().isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            this.f3874e = z;
            LinearLayout linearLayout = this.f3872c;
            if (!this.f3874e) {
                i5 = 8;
            }
            linearLayout.setVisibility(i5);
        }
        if (i3 == 10005 && i4 == -1) {
            bg.a(new a(1, "action_bind_toutiao_success"));
        }
    }
}
