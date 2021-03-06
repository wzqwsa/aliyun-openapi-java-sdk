/*
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

package com.aliyuncs.uis.model.v20180821;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.uis.transform.v20180821.CreateUisConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUisConnectionResponse extends AcsResponse {

	private String requestId;

	private String uisConnectionId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUisConnectionId() {
		return this.uisConnectionId;
	}

	public void setUisConnectionId(String uisConnectionId) {
		this.uisConnectionId = uisConnectionId;
	}

	@Override
	public CreateUisConnectionResponse getInstance(UnmarshallerContext context) {
		return	CreateUisConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
