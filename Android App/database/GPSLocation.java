/*
 * ------------------------------------------------------------------------------
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Walter Bronzi [wbronzi@gmail.com], [walter.bronzi@uni.lu]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * ------------------------------------------------------------------------------
 */


package com.snt.bt.recon.database;

import java.util.UUID;


public class GPSLocation {
    private UUID session_id;
    private UUID location_id;

    private String timestamp;
    private float latitude;
    private float longitude;
    private float speed;
    private float bearing;
    private float altitude;
    private float accuracy;
    private String upload_status;



    public GPSLocation() {
    }

    public GPSLocation(UUID location_id, UUID session_id, String timestamp, float latitude, float longitude, float speed, float bearing, float altitude, float accuracy, String upload_status) {
        this.location_id = location_id;
        this.session_id = session_id;

        this.timestamp = timestamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.bearing = bearing;
        this.altitude = altitude;
        this.accuracy = accuracy;
        this.upload_status = upload_status;

    }

    public void setSessionId(UUID session_id) {
        this.session_id = session_id;
    }

    public void setLocationId(UUID location_id) {
        this.location_id = location_id;
    }


    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setBearing(float bearing) {
        this.bearing = bearing;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public void setUploadStatus(String upload_status) {
        this.upload_status = upload_status;
    }


    public UUID getSessionId() {
        return session_id;
    }

    public UUID getLocationId() {
        return location_id;
    }


    public String getTimestamp() {
        return timestamp;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getSpeed() {
        return speed;
    }

    public float getBearing() {
        return bearing;
    }

    public float getAltitude() {
        return altitude;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public String getUploadStatus() {
        return upload_status;
    }
}
