package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BindWindowsStruct extends Message<BindWindowsStruct, Builder> {
    public static final DefaultValueProtoAdapter<BindWindowsStruct> ADAPTER = new ProtoAdapter_BindWindowsStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String bind_desc;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String bind_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer login_platform;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean open_window;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer total_times;

    public static final class Builder extends Message.Builder<BindWindowsStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bind_desc;
        public String bind_title;
        public Integer interval;
        public Integer login_platform;
        public Boolean open_window;
        public Integer total_times;

        public final BindWindowsStruct build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47721, new Class[0], BindWindowsStruct.class)) {
                return (BindWindowsStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47721, new Class[0], BindWindowsStruct.class);
            }
            BindWindowsStruct bindWindowsStruct = new BindWindowsStruct(this.bind_title, this.bind_desc, this.total_times, this.interval, this.open_window, this.login_platform, super.buildUnknownFields());
            return bindWindowsStruct;
        }

        public final Builder bind_desc(String str) {
            this.bind_desc = str;
            return this;
        }

        public final Builder bind_title(String str) {
            this.bind_title = str;
            return this;
        }

        public final Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public final Builder login_platform(Integer num) {
            this.login_platform = num;
            return this;
        }

        public final Builder open_window(Boolean bool) {
            this.open_window = bool;
            return this;
        }

        public final Builder total_times(Integer num) {
            this.total_times = num;
            return this;
        }
    }

    static final class ProtoAdapter_BindWindowsStruct extends DefaultValueProtoAdapter<BindWindowsStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final BindWindowsStruct redact(BindWindowsStruct bindWindowsStruct) {
            return bindWindowsStruct;
        }

        public ProtoAdapter_BindWindowsStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, BindWindowsStruct.class);
        }

        public final BindWindowsStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47724, new Class[]{ProtoReader.class}, BindWindowsStruct.class)) {
                return decode(protoReader2, (BindWindowsStruct) null);
            }
            return (BindWindowsStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47724, new Class[]{ProtoReader.class}, BindWindowsStruct.class);
        }

        public final int encodedSize(BindWindowsStruct bindWindowsStruct) {
            BindWindowsStruct bindWindowsStruct2 = bindWindowsStruct;
            if (!PatchProxy.isSupport(new Object[]{bindWindowsStruct2}, this, changeQuickRedirect, false, 47722, new Class[]{BindWindowsStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, bindWindowsStruct2.bind_title) + ProtoAdapter.STRING.encodedSizeWithTag(2, bindWindowsStruct2.bind_desc) + ProtoAdapter.INT32.encodedSizeWithTag(3, bindWindowsStruct2.total_times) + ProtoAdapter.INT32.encodedSizeWithTag(4, bindWindowsStruct2.interval) + ProtoAdapter.BOOL.encodedSizeWithTag(5, bindWindowsStruct2.open_window) + ProtoAdapter.INT32.encodedSizeWithTag(6, bindWindowsStruct2.login_platform) + bindWindowsStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bindWindowsStruct2}, this, changeQuickRedirect, false, 47722, new Class[]{BindWindowsStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, BindWindowsStruct bindWindowsStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BindWindowsStruct bindWindowsStruct2 = bindWindowsStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, bindWindowsStruct2}, this, changeQuickRedirect, false, 47723, new Class[]{ProtoWriter.class, BindWindowsStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, bindWindowsStruct2}, this, changeQuickRedirect, false, 47723, new Class[]{ProtoWriter.class, BindWindowsStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, bindWindowsStruct2.bind_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, bindWindowsStruct2.bind_desc);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, bindWindowsStruct2.total_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, bindWindowsStruct2.interval);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, bindWindowsStruct2.open_window);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, bindWindowsStruct2.login_platform);
            protoWriter2.writeBytes(bindWindowsStruct.unknownFields());
        }

        public final BindWindowsStruct decode(ProtoReader protoReader, BindWindowsStruct bindWindowsStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            BindWindowsStruct bindWindowsStruct2 = bindWindowsStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, bindWindowsStruct2}, this, changeQuickRedirect, false, 47725, new Class[]{ProtoReader.class, BindWindowsStruct.class}, BindWindowsStruct.class)) {
                return (BindWindowsStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, bindWindowsStruct2}, this, changeQuickRedirect, false, 47725, new Class[]{ProtoReader.class, BindWindowsStruct.class}, BindWindowsStruct.class);
            }
            BindWindowsStruct bindWindowsStruct3 = (BindWindowsStruct) a.a().a(BindWindowsStruct.class, bindWindowsStruct2);
            if (bindWindowsStruct3 != null) {
                builder = bindWindowsStruct3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.bind_title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.bind_desc((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.total_times((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.interval((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 5:
                            builder2.open_window((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 6:
                            builder2.login_platform((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (bindWindowsStruct3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final String getBindDesc() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47712, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47712, new Class[0], String.class);
        } else if (this.bind_desc != null) {
            return this.bind_desc;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getBindTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47711, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47711, new Class[0], String.class);
        } else if (this.bind_title != null) {
            return this.bind_title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getInterval() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47714, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47714, new Class[0], Integer.class);
        } else if (this.interval != null) {
            return this.interval;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getLoginPlatform() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47716, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47716, new Class[0], Integer.class);
        } else if (this.login_platform != null) {
            return this.login_platform;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getOpenWindow() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47715, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47715, new Class[0], Boolean.class);
        } else if (this.open_window != null) {
            return this.open_window;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getTotalTimes() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47713, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47713, new Class[0], Integer.class);
        } else if (this.total_times != null) {
            return this.total_times;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47717, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47717, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.bind_title = this.bind_title;
        builder.bind_desc = this.bind_desc;
        builder.total_times = this.total_times;
        builder.interval = this.interval;
        builder.open_window = this.open_window;
        builder.login_platform = this.login_platform;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47719, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47719, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.bind_title != null) {
                i = this.bind_title.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.bind_desc != null) {
                i2 = this.bind_desc.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            if (this.total_times != null) {
                i3 = this.total_times.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            if (this.interval != null) {
                i4 = this.interval.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            if (this.open_window != null) {
                i5 = this.open_window.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            if (this.login_platform != null) {
                i6 = this.login_platform.hashCode();
            }
            i7 = i12 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47720, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47720, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.bind_title != null) {
            sb.append(", bind_title=");
            sb.append(this.bind_title);
        }
        if (this.bind_desc != null) {
            sb.append(", bind_desc=");
            sb.append(this.bind_desc);
        }
        if (this.total_times != null) {
            sb.append(", total_times=");
            sb.append(this.total_times);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        if (this.open_window != null) {
            sb.append(", open_window=");
            sb.append(this.open_window);
        }
        if (this.login_platform != null) {
            sb.append(", login_platform=");
            sb.append(this.login_platform);
        }
        StringBuilder replace = sb.replace(0, 2, "BindWindowsStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47718, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47718, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BindWindowsStruct)) {
                return false;
            }
            BindWindowsStruct bindWindowsStruct = (BindWindowsStruct) obj;
            if (!unknownFields().equals(bindWindowsStruct.unknownFields()) || !Internal.equals(this.bind_title, bindWindowsStruct.bind_title) || !Internal.equals(this.bind_desc, bindWindowsStruct.bind_desc) || !Internal.equals(this.total_times, bindWindowsStruct.total_times) || !Internal.equals(this.interval, bindWindowsStruct.interval) || !Internal.equals(this.open_window, bindWindowsStruct.open_window) || !Internal.equals(this.login_platform, bindWindowsStruct.login_platform)) {
                return false;
            }
            return true;
        }
    }

    public BindWindowsStruct(String str, String str2, Integer num, Integer num2, Boolean bool, Integer num3) {
        this(str, str2, num, num2, bool, num3, ByteString.EMPTY);
    }

    public BindWindowsStruct(String str, String str2, Integer num, Integer num2, Boolean bool, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bind_title = str;
        this.bind_desc = str2;
        this.total_times = num;
        this.interval = num2;
        this.open_window = bool;
        this.login_platform = num3;
    }
}
