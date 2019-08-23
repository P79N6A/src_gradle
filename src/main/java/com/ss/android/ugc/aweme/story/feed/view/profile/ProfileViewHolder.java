package com.ss.android.ugc.aweme.story.feed.view.profile;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ProfileViewHolder extends AbsProfileViewHolder {
    public static ChangeQuickRedirect g;

    public final /* bridge */ /* synthetic */ void a(int i) {
        super.a(i);
    }

    public final /* bridge */ /* synthetic */ void b(int i) {
        super.b(i);
    }

    private ProfileViewHolder(View view) {
        super(view);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72787a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f72787a, false, 84075, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f72787a, false, 84075, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
            }
        });
    }

    public static ProfileViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, g, true, 84071, new Class[]{ViewGroup.class}, ProfileViewHolder.class)) {
            return new ProfileViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a7r, viewGroup2, false));
        }
        return (ProfileViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, g, true, 84071, new Class[]{ViewGroup.class}, ProfileViewHolder.class);
    }

    public final void a(ProfileEntity profileEntity) {
        if (PatchProxy.isSupport(new Object[]{profileEntity}, this, g, false, 84072, new Class[]{ProfileEntity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{profileEntity}, this, g, false, 84072, new Class[]{ProfileEntity.class}, Void.TYPE);
            return;
        }
        super.a(profileEntity);
        int i = this.f72764f;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 84073, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 84073, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Resources resources = this.f72760b.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f72762d.getLayoutParams();
        if (i == 1) {
            marginLayoutParams.height = resources.getDimensionPixelOffset(C0906R.dimen.kv);
            marginLayoutParams.width = resources.getDimensionPixelOffset(C0906R.dimen.kv);
            marginLayoutParams.rightMargin = resources.getDimensionPixelOffset(C0906R.dimen.hn);
            this.f72762d.setLayoutParams(marginLayoutParams);
            return;
        }
        marginLayoutParams.height = resources.getDimensionPixelOffset(C0906R.dimen.ku);
        marginLayoutParams.width = resources.getDimensionPixelOffset(C0906R.dimen.ku);
        marginLayoutParams.rightMargin = resources.getDimensionPixelOffset(C0906R.dimen.hm);
        this.f72762d.setLayoutParams(marginLayoutParams);
    }
}
