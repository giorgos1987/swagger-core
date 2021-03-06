/**
 *  Copyright 2014 Reverb Technologies, Inc.
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
 */

package com.wordnik.swagger.sample.model

import com.wordnik.swagger.annotations._

import java.util.List
import java.util.ArrayList

import javax.xml.bind.annotation._
import scala.beans.BeanProperty

@XmlRootElement(name = "Pet")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "A pet is a person's best friend", description = "This is where a longer description would live")
class Pet() {
  @XmlElement(name = "id", required = true) @BeanProperty var id: Long = 0
  @XmlElement(name = "category") @BeanProperty var category: Category = null
  @XmlElement(name = "name", required = true) @BeanProperty var name: String = null
  @XmlElement(name = "photoUrls") @BeanProperty var photoUrls: List[String] = new ArrayList[String]()
  @XmlElement(name = "tags") @BeanProperty var tags: List[Tag] = new ArrayList[Tag]()
  @XmlElement(name = "status")
  @ApiModelProperty(value = "pet status in the store", allowableValues = "available,pending,sold") @BeanProperty var status: String = null

  override def toString() = {
    val sb = new StringBuilder
    sb.append("Pet(")
      .append("category=").append(category).append(", ")
      .append("name=").append(name).append(", ")
      .append("photoUrls=").append(photoUrls).append(", ")
      .append("tags=").append(tags).append(", ")
      .append("status=").append(status)
      .append(")")

    sb.toString
  }
}