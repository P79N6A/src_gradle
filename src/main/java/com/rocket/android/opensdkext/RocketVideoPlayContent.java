package com.rocket.android.opensdkext;

import android.os.Bundle;
import com.rocket.android.opensdk.message.IMediaObject;
import com.rocket.android.opensdkext.ExtOpenConstants;
import java.util.ArrayList;

public class RocketVideoPlayContent implements IMediaObject {
    public String backFlowSchema;
    public long duration;
    public long fileLength;
    public int groupSource;
    public long height;
    public String md5;
    public ArrayList<VideoPlayUrlInfo> mediaUrls = new ArrayList<>();
    public String mime = "video/mp4";
    public String sourceGroupId;
    public VideoPlayThumbInfo thumbInfo = new VideoPlayThumbInfo();
    public String videoId;
    public VideoPlayWebInfo webInfo = new VideoPlayWebInfo();
    public long width;

    public int type() {
        return 5;
    }

    public boolean checkArgs() {
        if (ExtOpenConstants.GroupSource.isValid(this.groupSource) && this.webInfo != null && this.webInfo.checkArgs()) {
            return true;
        }
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putLong("ROCKET_VIDEO_PLAY_FILE_LENGTH", this.fileLength);
        bundle.putString("ROCKET_VIDEO_PLAY_MD5", this.md5);
        bundle.putString("ROCKET_VIDEO_PLAY_MIME", this.mime);
        bundle.putParcelableArrayList("ROCKET_VIDEO_PLAY_MEDIA_URLS", this.mediaUrls);
        bundle.putLong("ROCKET_VIDEO_PLAY_HEIGHT", this.height);
        bundle.putLong("ROCKET_VIDEO_PLAY_WIDTH", this.width);
        bundle.putLong("ROCKET_VIDEO_PLAY_DURATION", this.duration);
        bundle.putString("ROCKET_VIDEO_PLAY_VIDEO_ID", this.videoId);
        bundle.putInt("ROCKET_VIDEO_PLAY_GROUP_SOURCE", this.groupSource);
        bundle.putString("ROCKET_VIDEO_PLAY_BACK_FLOW_SCHEMA", this.backFlowSchema);
        bundle.putString("ROCKET_VIDEO_PLAY_SOURCE_GROUP_ID", this.sourceGroupId);
        this.thumbInfo.serialize(bundle);
        this.webInfo.serialize(bundle);
    }

    public void unserialize(Bundle bundle) {
        this.fileLength = bundle.getLong("ROCKET_VIDEO_PLAY_FILE_LENGTH");
        this.md5 = bundle.getString("ROCKET_VIDEO_PLAY_MD5");
        this.mime = bundle.getString("ROCKET_VIDEO_PLAY_MIME");
        this.mediaUrls = bundle.getParcelableArrayList("ROCKET_VIDEO_PLAY_MEDIA_URLS");
        this.height = bundle.getLong("ROCKET_VIDEO_PLAY_HEIGHT");
        this.width = bundle.getLong("ROCKET_VIDEO_PLAY_WIDTH");
        this.duration = bundle.getLong("ROCKET_VIDEO_PLAY_DURATION");
        this.videoId = bundle.getString("ROCKET_VIDEO_PLAY_VIDEO_ID");
        this.groupSource = bundle.getInt("ROCKET_VIDEO_PLAY_GROUP_SOURCE");
        this.backFlowSchema = bundle.getString("ROCKET_VIDEO_PLAY_BACK_FLOW_SCHEMA");
        this.sourceGroupId = bundle.getString("ROCKET_VIDEO_PLAY_SOURCE_GROUP_ID");
        this.thumbInfo.unserialize(bundle);
        this.webInfo.unserialize(bundle);
    }
}
