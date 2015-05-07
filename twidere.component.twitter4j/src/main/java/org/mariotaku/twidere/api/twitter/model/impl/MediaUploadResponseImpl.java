/*
 *                 Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.api.twitter.model.impl;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import twitter4j.MediaUploadResponse;

/**
 * Created by mariotaku on 15/5/7.
 */
@JsonObject
public class MediaUploadResponseImpl extends TwitterResponseImpl implements MediaUploadResponse {

    @Override
    public long getId() {
        return mediaId;
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public long getSize() {
        return size;
    }

    @JsonField(name = "media_id")
    long mediaId;
    @JsonField(name = "size")
    long size;
    @JsonField(name = "image")
    ImageImpl image;


    @JsonObject
    public static class ImageImpl implements Image {

        @JsonField(name = "width")
        int width;
        @JsonField(name = "height")
        int height;
        @JsonField(name = "image_type")
        String imageType;

        @Override
        public int getHeight() {
            return height;
        }

        @Override
        public String getImageType() {
            return imageType;
        }

        @Override
        public int getWidth() {
            return width;
        }
    }
}
