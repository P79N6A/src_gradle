package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class IjkMediaFormat implements IMediaFormat {
    private static final Map<String, Formatter> sFormatterMap = new HashMap();
    public final IjkMediaMeta.IjkStreamMeta mMediaFormat;

    static abstract class Formatter {
        /* access modifiers changed from: protected */
        public abstract String doFormat(IjkMediaFormat ijkMediaFormat);

        /* access modifiers changed from: protected */
        public String getDefaultString() {
            return "N/A";
        }

        private Formatter() {
        }

        public String format(IjkMediaFormat ijkMediaFormat) {
            String doFormat = doFormat(ijkMediaFormat);
            if (TextUtils.isEmpty(doFormat)) {
                return getDefaultString();
            }
            return doFormat;
        }
    }

    @TargetApi(16)
    public int getInteger(String str) {
        if (this.mMediaFormat == null) {
            return 0;
        }
        return this.mMediaFormat.getInt(str);
    }

    public String getString(String str) {
        if (this.mMediaFormat == null) {
            return null;
        }
        if (sFormatterMap.containsKey(str)) {
            return sFormatterMap.get(str).format(this);
        }
        return this.mMediaFormat.getString(str);
    }

    public IjkMediaFormat(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        sFormatterMap.put("ijk-codec-long-name-ui", new Formatter() {
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                return IjkMediaFormat.this.mMediaFormat.getString("codec_long_name");
            }
        });
        sFormatterMap.put("ijk-codec-name-ui", new Formatter() {
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                return IjkMediaFormat.this.mMediaFormat.getString("codec_name");
            }
        });
        sFormatterMap.put("ijk-bit-rate-ui", new Formatter() {
            /* access modifiers changed from: protected */
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int integer = ijkMediaFormat.getInteger("bitrate");
                if (integer <= 0) {
                    return null;
                }
                if (integer < 1000) {
                    return String.format(Locale.US, "%d bit/s", new Object[]{Integer.valueOf(integer)});
                }
                return String.format(Locale.US, "%d kb/s", new Object[]{Integer.valueOf(integer / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)});
            }
        });
        sFormatterMap.put("ijk-profile-level-ui", new Formatter() {
            /* access modifiers changed from: protected */
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                String str;
                switch (ijkMediaFormat.getInteger("codec_profile_id")) {
                    case 44:
                        str = "CAVLC 4:4:4";
                        break;
                    case 66:
                        str = "Baseline";
                        break;
                    case 77:
                        str = "Main";
                        break;
                    case 88:
                        str = "Extended";
                        break;
                    case 100:
                        str = "High";
                        break;
                    case 110:
                        str = "High 10";
                        break;
                    case 122:
                        str = "High 4:2:2";
                        break;
                    case SearchJediMixFeedAdapter.g:
                        str = "High 4:4:4";
                        break;
                    case 244:
                        str = "High 4:4:4 Predictive";
                        break;
                    case 578:
                        str = "Constrained Baseline";
                        break;
                    case 2158:
                        str = "High 10 Intra";
                        break;
                    case 2170:
                        str = "High 4:2:2 Intra";
                        break;
                    case 2292:
                        str = "High 4:4:4 Intra";
                        break;
                    default:
                        return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String string = ijkMediaFormat.getString("codec_name");
                if (!TextUtils.isEmpty(string) && string.equalsIgnoreCase("h264")) {
                    int integer = ijkMediaFormat.getInteger("codec_level");
                    if (integer < 10) {
                        return sb.toString();
                    }
                    sb.append(" Profile Level ");
                    sb.append((integer / 10) % 10);
                    int i = integer % 10;
                    if (i != 0) {
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb.append(i);
                    }
                }
                return sb.toString();
            }
        });
        sFormatterMap.put("ijk-pixel-format-ui", new Formatter() {
            /* access modifiers changed from: protected */
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                return ijkMediaFormat.getString("codec_pixel_format");
            }
        });
        sFormatterMap.put("ijk-resolution-ui", new Formatter() {
            /* access modifiers changed from: protected */
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int integer = ijkMediaFormat.getInteger("width");
                int integer2 = ijkMediaFormat.getInteger("height");
                int integer3 = ijkMediaFormat.getInteger("sar_num");
                int integer4 = ijkMediaFormat.getInteger("sar_den");
                if (integer <= 0 || integer2 <= 0) {
                    return null;
                }
                if (integer3 <= 0 || integer4 <= 0) {
                    return String.format(Locale.US, "%d x %d", new Object[]{Integer.valueOf(integer), Integer.valueOf(integer2)});
                }
                return String.format(Locale.US, "%d x %d [SAR %d:%d]", new Object[]{Integer.valueOf(integer), Integer.valueOf(integer2), Integer.valueOf(integer3), Integer.valueOf(integer4)});
            }
        });
        sFormatterMap.put("ijk-frame-rate-ui", new Formatter() {
            /* access modifiers changed from: protected */
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int integer = ijkMediaFormat.getInteger("fps_num");
                int integer2 = ijkMediaFormat.getInteger("fps_den");
                if (integer <= 0 || integer2 <= 0) {
                    return null;
                }
                return String.valueOf(((float) integer) / ((float) integer2));
            }
        });
        sFormatterMap.put("ijk-sample-rate-ui", new Formatter() {
            /* access modifiers changed from: protected */
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int integer = ijkMediaFormat.getInteger("sample_rate");
                if (integer <= 0) {
                    return null;
                }
                return String.format(Locale.US, "%d Hz", new Object[]{Integer.valueOf(integer)});
            }
        });
        sFormatterMap.put("ijk-channel-ui", new Formatter() {
            /* access modifiers changed from: protected */
            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int integer = ijkMediaFormat.getInteger("channel_layout");
                if (integer <= 0) {
                    return null;
                }
                long j = (long) integer;
                if (j == 4) {
                    return "mono";
                }
                if (j == 3) {
                    return "stereo";
                }
                return String.format(Locale.US, "%x", new Object[]{Integer.valueOf(integer)});
            }
        });
        this.mMediaFormat = ijkStreamMeta;
    }
}
