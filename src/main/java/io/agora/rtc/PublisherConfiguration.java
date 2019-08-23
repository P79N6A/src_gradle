package io.agora.rtc;

import io.agora.rtc.internal.Logging;
import org.json.JSONException;
import org.json.JSONObject;

public class PublisherConfiguration {
    private JSONObject jsonObject;

    public static class Builder {
        public PublisherParameters params = new PublisherParameters();

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this);
        }

        public Builder bitRate(int i) {
            this.params.bitrate = i;
            return this;
        }

        public Builder defaultLayout(int i) {
            this.params.defaultLayout = i;
            return this;
        }

        public Builder extraInfo(String str) {
            this.params.extraInfo = str;
            return this;
        }

        public Builder frameRate(int i) {
            this.params.framerate = i;
            return this;
        }

        public Builder owner(boolean z) {
            this.params.owner = z;
            return this;
        }

        public Builder publishUrl(String str) {
            this.params.publishUrl = str;
            return this;
        }

        public Builder rawStreamUrl(String str) {
            this.params.rawStreamUrl = str;
            return this;
        }

        public Builder streamLifeCycle(int i) {
            this.params.lifecycle = i;
            return this;
        }

        public Builder size(int i, int i2) {
            this.params.width = i;
            this.params.height = i2;
            return this;
        }

        public Builder injectStream(String str, int i, int i2) {
            if (!(str == null || i == 0 || i2 == 0)) {
                this.params.injectStreamUrl = str;
                this.params.injectStreamWidth = i;
                this.params.injectStreamHeight = i2;
            }
            return this;
        }
    }

    public boolean validate() {
        if (this.jsonObject != null) {
            return true;
        }
        return false;
    }

    public String toJsonString() {
        if (validate()) {
            return this.jsonObject.toString();
        }
        return null;
    }

    private PublisherConfiguration(Builder builder) {
        try {
            this.jsonObject = new JSONObject().put("owner", builder.params.owner).put("lifecycle", builder.params.lifecycle).put("defaultLayout", builder.params.defaultLayout).put("width", builder.params.width).put("height", builder.params.height).put("framerate", builder.params.framerate).put("bitrate", builder.params.bitrate).put("mosaicStream", builder.params.publishUrl).put("rawStream", builder.params.rawStreamUrl).put("extraInfo", builder.params.extraInfo);
            if (!(builder.params.injectStreamUrl == null || builder.params.injectStreamWidth == 0 || builder.params.injectStreamHeight == 0)) {
                this.jsonObject.put("injectInfo", new JSONObject().put("injectStream", builder.params.injectStreamUrl).put("width", builder.params.injectStreamWidth).put("height", builder.params.injectStreamHeight));
            }
        } catch (JSONException unused) {
            this.jsonObject = null;
            Logging.e("failed to create PublisherConfiguration");
        }
    }
}
