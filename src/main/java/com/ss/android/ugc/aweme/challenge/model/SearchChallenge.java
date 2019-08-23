package com.ss.android.ugc.aweme.challenge.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

public class SearchChallenge {
    @SerializedName("challenge_info")
    public Challenge challenge;
    public boolean isFake;
    @SerializedName("position")
    public List<Segment> segments;
}
