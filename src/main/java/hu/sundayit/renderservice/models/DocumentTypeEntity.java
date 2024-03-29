/**
 * Sunday Render Service
 * Sunday Render Service
 *
 * OpenAPI spec version: 0.0.1-SNAPSHOT
 * Contact: molnar.balint@mdy.hu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package hu.sundayit.renderservice.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * DocumentTypeEntity
 */

public class DocumentTypeEntity   {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mainFileId")
  private Long mainFileId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("projectEntityId")
  private Long projectEntityId = null;

  public DocumentTypeEntity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Document type description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Document type description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DocumentTypeEntity id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DocumentTypeEntity mainFileId(Long mainFileId) {
    this.mainFileId = mainFileId;
    return this;
  }

   /**
   * File Entity ID. If this document type will be rendered, it will be routed to this file.
   * @return mainFileId
  **/
  @ApiModelProperty(example = "null", value = "File Entity ID. If this document type will be rendered, it will be routed to this file.")
  public Long getMainFileId() {
    return mainFileId;
  }

  public void setMainFileId(Long mainFileId) {
    this.mainFileId = mainFileId;
  }

  public DocumentTypeEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Mandatory field. Document type name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Mandatory field. Document type name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentTypeEntity projectEntityId(Long projectEntityId) {
    this.projectEntityId = projectEntityId;
    return this;
  }

   /**
   * Mandatory field. ID of the parent project.
   * @return projectEntityId
  **/
  @ApiModelProperty(example = "null", value = "Mandatory field. ID of the parent project.")
  public Long getProjectEntityId() {
    return projectEntityId;
  }

  public void setProjectEntityId(Long projectEntityId) {
    this.projectEntityId = projectEntityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTypeEntity documentTypeEntity = (DocumentTypeEntity) o;
    return Objects.equals(this.description, documentTypeEntity.description) &&
        Objects.equals(this.id, documentTypeEntity.id) &&
        Objects.equals(this.mainFileId, documentTypeEntity.mainFileId) &&
        Objects.equals(this.name, documentTypeEntity.name) &&
        Objects.equals(this.projectEntityId, documentTypeEntity.projectEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, mainFileId, name, projectEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTypeEntity {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mainFileId: ").append(toIndentedString(mainFileId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectEntityId: ").append(toIndentedString(projectEntityId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

