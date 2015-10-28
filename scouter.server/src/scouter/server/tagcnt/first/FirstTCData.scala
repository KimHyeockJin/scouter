/*
 *  Copyright 2015 the original author or authors. 
 *  @https://github.com/scouter-project/scouter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package scouter.server.tagcnt.first

import scouter.lang.value.Value

 class FirstTCData(_objType: String, _time: Long, _tagKey: Long, _tagValue: Value, _cnt: Float) {
        val objType = _objType;
        val time = _time;
        val tagKey = _tagKey;
        val tagValue = _tagValue;
        val cnt = _cnt;
 }