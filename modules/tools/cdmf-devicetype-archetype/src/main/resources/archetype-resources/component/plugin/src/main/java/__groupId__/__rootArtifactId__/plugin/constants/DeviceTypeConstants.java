/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package ${groupId}.${rootArtifactId}.plugin.constants;

public class DeviceTypeConstants {
    public final static String DEVICE_TYPE = "${deviceType}";
    public final static String DEVICE_PLUGIN_DEVICE_NAME = "DEVICE_NAME";
    public final static String DEVICE_PLUGIN_DEVICE_ID = "${deviceType}_DEVICE_ID";
    public final static String SENSOR_READING = "sensorValue";
    public static final String DATA_SOURCE_NAME = "jdbc/${deviceType}DM_DB";
    public final static String DEVICE_PLUGIN_PROPERTY_ACCESS_TOKEN = "accessToken";
    public final static String DEVICE_PLUGIN_PROPERTY_REFRESH_TOKEN = "refreshToken";
    public final static String DEVICE_TYPE_PROVIDER_DOMAIN = "carbon.super";
    public final static String STATE_ON = "ON";
    public final static String STATE_OFF = "OFF";
    public final static String SENSOR_CONTEXT = "SENSOR";
    public final static String TEMPERATURE_EVENT_TABLE = "DEVICE_TEMPERATURE_SUMMARY";
    public final static String TEMPERATURE_STREAM_DEFINITION = "org.wso2.iot.devices.temperature";
    public final static String TEMPERATURE_STREAM_DEFINITION_VERSION = "1.0.0";
}