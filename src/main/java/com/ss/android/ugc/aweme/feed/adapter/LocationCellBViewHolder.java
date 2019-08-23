package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.widget.TextView;
import butterknife.BindView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.List;

public class LocationCellBViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44742a;

    /* renamed from: b  reason: collision with root package name */
    public String f44743b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f44744c;
    @BindView(2131493169)
    AvatarImageView mAvHeadView;
    @BindView(2131495651)
    TextView mTvLocation;
    @BindView(2131494890)
    TextView mTvName;
    @BindView(2131497457)
    TagLayout tagLayout;
    @BindView(2131498266)
    TextView txtDistance;

    public final void l() {
    }

    public final boolean k() {
        return this.f44744c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44742a, false, 40564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44742a, false, 40564, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, f44742a, false, 40565, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44742a, false, 40565, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void b() {
        List<AwemeLabelModel> list;
        if (PatchProxy.isSupport(new Object[0], this, f44742a, false, 40561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44742a, false, 40561, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            i();
            this.mAvHeadView.a(((Aweme) this.g).getAuthor().getAvatarThumb());
            this.tagLayout.setEventType(this.f44743b);
            if (((Aweme) this.g).getVideoLabels() != null) {
                TagLayout tagLayout2 = this.tagLayout;
                Aweme aweme = (Aweme) this.g;
                if (((Aweme) this.g).getVideoLabels().size() > 0) {
                    list = ((Aweme) this.g).getVideoLabels().subList(0, 1);
                } else {
                    list = ((Aweme) this.g).getVideoLabels();
                }
                tagLayout2.b(aweme, list, new TagLayout.a(7, 16));
            }
            this.mTvName.setVisibility(0);
            this.mTvName.setText(((Aweme) this.g).getAuthor().getNickname());
            PoiStruct poiStruct = ((Aweme) this.g).getPoiStruct();
            if (poiStruct == null) {
                if (TextUtils.isEmpty(((Aweme) this.g).getDistance())) {
                    this.txtDistance.setVisibility(8);
                } else {
                    this.txtDistance.setVisibility(0);
                    this.txtDistance.setText(((Aweme) this.g).getDistance());
                }
                this.mTvLocation.setVisibility(8);
                return;
            }
            this.txtDistance.setVisibility(8);
            this.mTvLocation.setVisibility(0);
            this.mTvLocation.setText(poiStruct.poiName);
        }
    }

    public final void d(boolean z) {
        this.f44744c = true;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44742a, false, 40563, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44742a, false, 40563, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.mTvName.getAlpha() != f2) {
            float max = Math.max(0.0f, Math.min(f2, 1.0f));
            this.mAvHeadView.setAlpha(max);
            this.mTvLocation.setAlpha(max);
            this.mTvName.setAlpha(max);
            this.txtDistance.setAlpha(max);
            this.tagLayout.setAlpha(max);
        }
    }
}
