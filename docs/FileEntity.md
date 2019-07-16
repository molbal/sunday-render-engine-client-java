
# FileEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoEmbed** | **Boolean** | If set to true, this will automatically be embedded to all files in the project. Only applicable if in project scope. |  [optional]
**documentTypeId** | **Long** | Document Type ID |  [optional]
**fileContents** | **byte[]** | File contents, as a byte array. |  [optional]
**fileName** | **String** | Mandatory field. This is the filename, including extension of the file. |  [optional]
**fileScope** | [**FileScopeEnum**](#FileScopeEnum) | Enum, mandatory.Scope for the file |  [optional]
**id** | **Long** |  |  [optional]
**projectId** | **Long** | Mandatory field. ID of the parent project. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Enum, mandatory. Type of the file. |  [optional]


<a name="FileScopeEnum"></a>
## Enum: FileScopeEnum
Name | Value
---- | -----
PROJECT | &quot;PROJECT&quot;
DOCUMENT | &quot;DOCUMENT&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HTML | &quot;HTML&quot;
SCRIPT | &quot;SCRIPT&quot;
STYLESHEET | &quot;STYLESHEET&quot;
IMAGE | &quot;IMAGE&quot;
OTHER | &quot;OTHER&quot;
MARKDOWN | &quot;MARKDOWN&quot;



