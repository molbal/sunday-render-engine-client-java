
# RenderRequestEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentTypeId** | **Long** | Document ID |  [optional]
**extraEngineParameters** | **String** | Extra WKHTMLTOPDF engine parameters, seen here: https://wkhtmltopdf.org/usage/wkhtmltopdf.txt |  [optional]
**id** | **Long** | Unique identifier. Unique amongst render requests, but not other objects. |  [optional]
**keywords** | **Map&lt;String, String&gt;** | List of keyword keys and values |  [optional]
**projectId** | **Long** | Project ID |  [optional]
**renderFinished** | [**DateTime**](DateTime.md) | Date and time the render request was served |  [optional]
**renderRequested** | [**DateTime**](DateTime.md) | Date and time the render request was received |  [optional]
**renderTarget** | [**RenderTargetEnum**](#RenderTargetEnum) | Render target. |  [optional]
**renderedBy** | **String** | Name of entity who sent the request |  [optional]
**renderedDuration** | **Long** | The time it took do do the rendering (including verifying and generating files, excluding waiting for free thread) |  [optional]


<a name="RenderTargetEnum"></a>
## Enum: RenderTargetEnum
Name | Value
---- | -----
PDF | &quot;PDF&quot;
EMBEDDED_HTML | &quot;EMBEDDED_HTML&quot;



