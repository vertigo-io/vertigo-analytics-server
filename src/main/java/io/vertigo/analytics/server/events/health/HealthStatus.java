/**
 * vertigo - simple java starter
 *
 * Copyright (C) 2013-2017, KleeGroup, direction.technique@kleegroup.com (http://www.kleegroup.com)
 * KleeGroup, Centre d'affaire la Boursidiere - BP 159 - 92357 Le Plessis Robinson Cedex - France
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 */
package io.vertigo.analytics.server.events.health;

/**
 * This class lists the health status.
 *
 * @author jmforhan
 */
public enum HealthStatus {

	/**
	 * red : the component is not operational.
	 */
	RED,

	/**
	 * yellow : the component is partially operational.
	 */
	YELLOW,

	/**
	 * green : the component is fully operational.
	 */
	GREEN;

	public int getNumericValue() {
		switch (this) {
			case RED:
				return 0;
			case YELLOW:
				return 1;
			case GREEN:
				return 2;
			default:
				throw new RuntimeException("Unkown satus : " + this);
		}
	}

}
