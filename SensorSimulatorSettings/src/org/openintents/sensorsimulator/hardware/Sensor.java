/*
 * Port of OpenIntents simulator to Android 2.1, extension to multi
 * emulator support, and GPS and battery simulation is developed as a
 * diploma thesis of Josip Balic at the University of Zagreb, Faculty of
 * Electrical Engineering and Computing.
 *
 * Copyright (C) 2008-2010 OpenIntents.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openintents.sensorsimulator.hardware;


public class Sensor {

    public static final int TYPE_ACCELEROMETER = 1;
    public static final int TYPE_ALL = -1;
    public static final int TYPE_GYROSCOPE = 4;
    public static final int TYPE_LIGHT = 5;
    public static final int TYPE_MAGNETIC_FIELD = 2;
    public static final int TYPE_ORIENTATION = 3;
    public static final int TYPE_PRESSURE = 6;
    public static final int TYPE_PROXIMITY = 8;
    public static final int TYPE_TEMPERATURE = 7;
    public static final int TYPE_BARCODE_READER = 9;
    public static final int TYPE_LINEAR_ACCELERATION = 10;
    public static final int TYPE_GRAVITY = 11;
    public static final int TYPE_ROTATION_VECTOR = 12;
    public static final int TYPE_GYROSCOPE_UNCALIBRATED = 13;

    public int type;
    public int power = 1;

    public Sensor(int type) {
        super();
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return SensorNames.getSensorName(type);
    }

    public long getPower() {
        return power;
    }
}
