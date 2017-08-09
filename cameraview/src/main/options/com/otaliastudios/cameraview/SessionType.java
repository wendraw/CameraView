package com.otaliastudios.cameraview;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.otaliastudios.cameraview.CameraConstants.SESSION_TYPE_PICTURE;
import static com.otaliastudios.cameraview.CameraConstants.SESSION_TYPE_VIDEO;

@Retention(RetentionPolicy.SOURCE)
@IntDef({SESSION_TYPE_PICTURE, SESSION_TYPE_VIDEO})
public @interface SessionType {
}