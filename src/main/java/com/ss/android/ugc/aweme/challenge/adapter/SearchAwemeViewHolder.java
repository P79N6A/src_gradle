package com.ss.android.ugc.aweme.challenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.challenge.a.b;
import com.ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.utils.bg;

public class SearchAwemeViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35335a;

    /* renamed from: b  reason: collision with root package name */
    public SearchChallenge f35336b;
    @BindView(2131493907)
    TextView mDescView;
    @BindView(2131495198)
    TextView mJoinCountView;
    @BindView(2131497590)
    TextView mTitleView;
    @BindDimen(2131230879)
    int margin;

    public SearchAwemeViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35337a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f35337a, false, 25798, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f35337a, false, 25798, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (SearchAwemeViewHolder.this.f35336b != null) {
                    if (SearchAwemeViewHolder.this.f35336b.challenge != null) {
                        r.onEvent(MobClick.obtain().setEventName("challenge_add").setLabelName("publish").setValue(SearchAwemeViewHolder.this.f35336b.challenge.getCid()).setJsonObject(c.a().a("search_keyword", SearchAwemeViewHolder.this.mTitleView.getText().toString()).b()));
                    }
                    if (SearchAwemeViewHolder.this.f35336b.isFake) {
                        bg.a(new b(1, SearchAwemeViewHolder.this.f35336b.challenge));
                    } else if (SearchAwemeViewHolder.this.f35336b.challenge != null) {
                        bg.a(new b(SearchAwemeViewHolder.this.f35336b.challenge));
                    }
                }
            }
        });
    }

    public final void a(SearchChallenge searchChallenge) {
        if (PatchProxy.isSupport(new Object[]{searchChallenge}, this, f35335a, false, 25796, new Class[]{SearchChallenge.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchChallenge}, this, f35335a, false, 25796, new Class[]{SearchChallenge.class}, Void.TYPE);
        } else if (searchChallenge != null) {
            this.f35336b = searchChallenge;
            Challenge challenge = this.f35336b.challenge;
            if (challenge != null) {
                if (!this.f35336b.isFake || TextUtils.isEmpty(challenge.getChallengeName())) {
                    if (challenge != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
                        SpannableString spannableString = new SpannableString(challenge.getChallengeName());
                        if (this.f35336b.segments != null) {
                            for (Segment next : this.f35336b.segments) {
                                if (next != null) {
                                    spannableString = a(spannableString, next.begin, next.end + 1);
                                }
                            }
                        }
                        this.mTitleView.setText(spannableString);
                    }
                    if (TextUtils.isEmpty(challenge.getDesc())) {
                        this.mTitleView.setPadding(0, 0, 0, this.margin);
                        this.mDescView.setVisibility(8);
                    } else {
                        this.mTitleView.setPadding(0, 0, 0, 0);
                        this.mDescView.setVisibility(0);
                        this.mDescView.setText(challenge.getDesc());
                    }
                    this.mJoinCountView.setText(this.itemView.getResources().getString(C0906R.string.b3x, new Object[]{com.ss.android.ugc.aweme.i18n.b.a((long) challenge.getUserCount())}));
                } else {
                    SpannableString spannableString2 = new SpannableString(challenge.getChallengeName());
                    this.mTitleView.setText(a(spannableString2, 0, spannableString2.length()));
                    this.mDescView.setText(C0906R.string.ahs);
                    this.mJoinCountView.setText(C0906R.string.ajv);
                }
            }
        }
    }

    private SpannableString a(SpannableString spannableString, int i, int i2) {
        SpannableString spannableString2 = spannableString;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{spannableString2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35335a, false, 25797, new Class[]{SpannableString.class, Integer.TYPE, Integer.TYPE}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{spannableString2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35335a, false, 25797, new Class[]{SpannableString.class, Integer.TYPE, Integer.TYPE}, SpannableString.class);
        }
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i3 || max >= spannableString.length() || i3 > spannableString.length()) {
            return spannableString2;
        }
        a.a(spannableString2, new ForegroundColorSpan(this.itemView.getResources().getColor(C0906R.color.a1s)), max, i3, 17);
        return spannableString2;
    }
}
