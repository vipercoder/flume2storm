/**
 * Copyright 2014 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.comcast.viper.flume2storm.connection.parameters;

import com.comcast.viper.flume2storm.connection.receptor.EventReceptor;
import com.comcast.viper.flume2storm.connection.sender.EventSender;
import com.comcast.viper.flume2storm.location.ServiceProvider;

/**
 * Interface of the configuration for a Flume2Storm connection (from an
 * {@link EventReceptor} to an {@link EventSender}).
 */
public interface ConnectionParameters {
  /**
   * @return A unique identifier of the associated {@link EventSender} /
   *         {@link ServiceProvider} (hostname:port for instance)
   * 
   */
  String getId();
}
